package Pankti_5850;

import java.net.*;
import java.io.*;
import java.util.*;

class server implements Runnable {
	Thread t1, t2, t3, t4, t5, t6;
	Socket cs1, csadd, cssub, csdiv, csmul, cslog;

	server() throws Exception {
		// Accepting connection request from client
		ServerSocket ss = new ServerSocket(8995);
		System.out.println("Main server Started!");
		cs1 = ss.accept();
		t1 = new Thread(this);
		t1.start();

		// sending connection request to addition server
		csadd = new Socket("localhost", 1913);
		System.out.println("add server Requested! " + csadd);
		t2 = new Thread(this);
		t2.start();

		// sending connection request to subtraction server
		cssub = new Socket("localhost", 6895);
		System.out.println("subtract server Requested! " + cssub);
		t3 = new Thread(this);
		t3.start();

		// sending connection request to division server
		csdiv = new Socket("localhost", 2896);
		System.out.println("division server Requested! " + csdiv);
		t4 = new Thread(this);
		t4.start();

		// sending connection request to multiplication server
		csmul = new Socket("localhost", 2710);
		System.out.println("multiplication server Requested! " + csmul);
		t5 = new Thread(this);
		t5.start();

		cslog = new Socket("localhost", 2904);
		System.out.println("logical server Requested! " + cslog);
		t6 = new Thread(this);
		t6.start();

	}

	public static void main(String[] s) throws Exception {
		new server();
	}

	public void run() {
		while (true) {
			try {
				// getting parameters from client
				BufferedReader br = new BufferedReader(new InputStreamReader(cs1.getInputStream()));
				String selection = br.readLine();
				String str = br.readLine();
				String str1 = br.readLine();
				int int1 = Integer.parseInt(selection);

				if (int1 == 1) {
					// sending parameters to addition server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(csadd.getOutputStream()));
					bw.write(str + "\n");
					bw.write(str1 + "\n");
					bw.flush();

					// getting result from addition server
					BufferedReader br1 = new BufferedReader(new InputStreamReader(csadd.getInputStream()));
					String strresult = br1.readLine();
					System.out.println("Sending Result from addition server... " + strresult);

					// sending result to client
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(cs1.getOutputStream()));
					bw1.write(strresult + "\n");
					bw1.flush();
				} else if (int1 == 2) {
					// sending parameters to subtraction server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cssub.getOutputStream()));
					bw.write(str + "\n");
					bw.write(str1 + "\n");
					bw.flush();

					// getting result from subtraction server
					BufferedReader br1 = new BufferedReader(new InputStreamReader(cssub.getInputStream()));
					String strresult = br1.readLine();
					System.out.println("Sending Result from subtraction server..." + strresult);

					// sending result to client
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(cs1.getOutputStream()));
					bw1.write(strresult + "\n");
					bw1.flush();
				} else if (int1 == 3) {
					// sending parameters to multiplication server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(csmul.getOutputStream()));
					bw.write(str + "\n");
					bw.write(str1 + "\n");
					bw.flush();

					// getting result from multiplication server
					BufferedReader br1 = new BufferedReader(new InputStreamReader(csmul.getInputStream()));
					String strresult = br1.readLine();
					System.out.println("Sending Result from multiplication server... " + strresult);

					// sending result to client
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(cs1.getOutputStream()));
					bw1.write(strresult + "\n");
					bw1.flush();
				} else if (int1 == 4) {
					// sending parameters to division server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(csdiv.getOutputStream()));
					bw.write(str + "\n");
					bw.write(str1 + "\n");
					bw.flush();

					// getting result from division server
					BufferedReader br1 = new BufferedReader(new InputStreamReader(csdiv.getInputStream()));
					String strresult = br1.readLine();
					System.out.println("Sending Result from division server... " + strresult);

					// sending result to client
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(cs1.getOutputStream()));
					bw1.write(strresult + "\n");
					bw1.flush();
				} else if (int1 == 5 || int1 == 6 || int1 == 7) {
					// sending parameters to logical server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cslog.getOutputStream()));
					bw.write(selection + "\n");
					bw.write(str + "\n");
					bw.write(str1 + "\n");
					bw.flush();

					// getting result from logical server
					BufferedReader br1 = new BufferedReader(new InputStreamReader(cslog.getInputStream()));
					String strresult = br1.readLine();
					System.out.println("Sending Result from logical server... " + strresult);

					// sending result to client
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(cs1.getOutputStream()));
					bw1.write(strresult + "\n");
					bw1.flush();
				} else {
					// sending error message to client
					BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(cs1.getOutputStream()));
					String strresult = "Oops wrong selection";
					bw1.write(strresult + "\n");
					bw1.flush();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}