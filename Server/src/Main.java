import java.io.IOException;

import model.Connection;

public class Main {

	public static void main(String[] args) {
		Connection connection = new Connection(5666);
		try {
			connection.start();
		} catch (IOException e) {
			System.out.println("[Server] " + e.getMessage());
		}
	}

}
