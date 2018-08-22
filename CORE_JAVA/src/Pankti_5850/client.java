package Pankti_5850;

import java.net.*;
import java.io.*;
import java.util.*;

public class client implements Runnable {
	Thread t;
	Socket ss;

	client() throws Exception {

		System.out.println("");

		// sending connection request to main server
		ss = new Socket("localhost", 8995);
		System.out.println("Server Requested! " + ss);
		t = new Thread(this);
		t.start();

	}

	public static void main(String[] s) throws Exception {
		new client();
	}

	public void run() {
		while (true) {
			try {
				// Connecting main server by socket object
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));

				// Selecting the operation
				System.out.print(
						"\nEnter 1 for addition : \nEnter 2 for subtraction : \nEnter 3 for multiplication : \nEnter 4 for division : \nEnter 5 for logical AND operation : \nEnter 6 for logical OR operation : \nEnter 7 for logical X-OR operation :\n");

				String selection = new Scanner(System.in).nextLine();
				bw.write(selection + "\n");

				// Input 1st number
				System.out.print("Enter number 1 :");
				String str = new Scanner(System.in).nextLine();
				bw.write(str + "\n");

				// Input 2nd number
				System.out.print("Enter number 2 :");
				String str1 = new Scanner(System.in).nextLine();

				// sending numbers and operation to main server
				bw.write(str1 + "\n");
				bw.flush();

				// getting result from main server
				BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
				String s2 = br.readLine();

				System.out.println("\n Answer is:" + s2);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
