package model;


import java.io.IOException;
import java.net.*;

public class Connection {
	private String host;
	private int port;
	private int timeout = 100;
	private Socket socket = new Socket();
	private SocketAddress sockAddress;
	
	public Connection(String host, int port, int timeout) {
		this.host = host;
		this.port = port;
		this.timeout = timeout;
	}

	public Connection(String host, int port) {
		this.host = host;
		this.port = port;
	}
	
	public void start() throws IOException {
			sockAddress=new InetSocketAddress(host, port);
			socket.connect(sockAddress, timeout);
			}
	}
	
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
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
