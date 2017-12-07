package model;


import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Connection {


	private int port;
	private int timeout = 100;
	private int numOfThreads = 10;
	private Socket socket = new Socket();
	private ServerSocket serverSocket;
	
	public Connection(int port) {
		this.port = port;
	}
	
	public Connection(int port, int numOfThreads) {
		this.port = port;
		this.numOfThreads = numOfThreads;
	}
	
	public Connection(int port, int timeout, int numOfThreads) {
		this.port = port;
		this.timeout = timeout;
		this.numOfThreads = numOfThreads;
	}
	

	
	
	public String start() throws IOException{
		final ExecutorService executor = Executors.newFixedThreadPool(numOfThreads);
		serverSocket = new ServerSocket(port);
		
		while (true) {
			executor.execute(new Runnable() {
				@Override public void run(){
					try {
						System.out.println("[Server] |" + Thread.currentThread().getName() + "| waiting for a Connection");
						Socket client = serverSocket.accept();
						System.out.println("[Server] |" + Thread.currentThread().getName() + "| received Data from " + client.getInetAddress());
					} catch (IOException e) {
						System.out.println("[Server] |" + Thread.currentThread().getName() + "| " + e.getMessage());
					}
				}
			});
		}
	}
	
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getNumOfThreads() {
		return numOfThreads;
	}

	public void setNumOfThreads(int numOfThreads) {
		this.numOfThreads = numOfThreads;
	}

	public Socket getSocket() {
		return socket;
	}
}
