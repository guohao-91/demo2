package com.example.demo.webServer;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyWebServer {

	private ServerSocket serverSocket;

	public MyWebServer () {
		try {
			serverSocket = new ServerSocket(9880, 50);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start(){
		System.out.println("start ");
		Integer count = 0;
		while(true){
			count ++;

			try {
				Socket socket = serverSocket.accept();
				System.out.println("connect : " + count);
//				if(count%2 == 0) continue;
				PrintStream ps = new PrintStream(socket.getOutputStream());
				ps.println("HTTP/1.1 200 OK");
				ps.println("Content-Type:text/html");
				String s = "server is running->->->->";
				ps.println("Content-Length:" + s.length());
				ps.println("");
				ps.write(s.getBytes());
				socket.close();

				System.out.println("connect continue: ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	public static void main(String[] arg){
		MyWebServer server = new MyWebServer();
		server.start();
	}

}
