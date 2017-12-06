package model;


import java.io.IOException;
import java.net.*;

public class Connection {
	private int port;
	private int timeout = 100;
	private Socket socket = new Socket();
	private ServerSocket serverSocket;
	
	public Connection(String host, int port, int timeout) {
		this.port = port;
		this.timeout = timeout;
	}

	public Connection(String host, int port) {
		this.port = port;
	}
	
	public String start() {
		try {
			serverSocket = new ServerSocket(port);
			Socket client = serverSocket.accept();
		} catch (IOException e) {
			return "[ERROR] " + e.getMessage();
		}
		
		return "[Server: " + serverSocket.getInetAddress() + "] Server Started.";
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

	public Socket getSocket() {
		return socket;
	}
}
