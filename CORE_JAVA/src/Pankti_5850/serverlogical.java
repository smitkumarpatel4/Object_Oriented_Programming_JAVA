package Pankti_5850;

import java.net.*;
import java.io.*;
import java.util.*;

class serverlogical implements Runnable {
	Thread t1, t2;
	Socket cs1, cs2;

	serverlogical() throws Exception {
		// Accepting connection request from main server
		ServerSocket ss1 = new ServerSocket(2904);
		System.out.println("logical server Started!");
		cs2 = ss1.accept();
		System.out.println("Main server Connected! " + cs2);
		t2 = new Thread(this);
		t2.start();
	}

	public static void main(String[] s) throws Exception {
		new serverlogical();
	}

	public void run() {
		while (true) {
			try {
				// getting parameters from main server
				BufferedReader br = new BufferedReader(new InputStreamReader(cs2.getInputStream()));
				String selection = br.readLine();
				int int3 = Integer.parseInt(selection);
				String str = br.readLine();
				String str1 = br.readLine();

				int int1 = Integer.parseInt(str);
				int int2 = Integer.parseInt(str1);
				int ans = 0;

				if (int3 == 5) {
					// and operation
					ans = int1 & int2;

					// sending result to main server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs2.getOutputStream()));
					bw.write(ans + "\n");
					System.out.println("Sending Result for and operation ... " + ans);
					bw.flush();
				} else if (int3 == 6) {
					// or operation
					ans = int1 | int2;
					// sending result to main server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs2.getOutputStream()));
					bw.write(ans + "\n");
					System.out.println("Sending Result for or operation ... " + ans);
					bw.flush();
				} else if (int3 == 7) {
					// xor operation
					ans = int1 ^ int2;
					// sending result to main server
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(cs2.getOutputStream()));
					bw.write(ans + "\n");
					System.out.println("Sending Result for x-or operation... " + ans);
					bw.flush();
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
