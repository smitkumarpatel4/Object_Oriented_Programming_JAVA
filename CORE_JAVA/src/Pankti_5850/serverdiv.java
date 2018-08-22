package Pankti_5850;

import java.net.*;
import java.io.*;
import java.util.*;
class serverdiv implements Runnable
{
	Thread t1,t2;
        	Socket cs1,cs2;
        
	serverdiv()throws Exception
	{
		//Accepting connection request from main server
               	 ServerSocket ss1 = new ServerSocket(2896);
		System.out.println("Division server Started!");
		cs2 = ss1.accept();
		System.out.println("Main server Connected! "+cs2);
		t2 = new Thread(this);
		t2.start();	
	}
	public static void main(String[] s)throws Exception
	{
		new serverdiv();
	}
	public void run()
	{
		while(true)
		{
			try
			{
                                		//getting parameters from main server
				BufferedReader br = new BufferedReader(new InputStreamReader(cs2.getInputStream()));
				String str = br.readLine();
                               		 String str1 = br.readLine();
                               		 int int1=Integer.parseInt(str);
                                		int int2=Integer.parseInt(str1);
                                
//division
                                		int int3= int1 /int2;
			
				//sending result to main server
                                		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs2.getOutputStream()));
                                		bw.write(int3+"\n");
                               		 System.out.println("Sending Result ... "+int3);
                               		 bw.flush();				
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
		}	
	}	
}

