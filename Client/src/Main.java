import java.io.IOException;

import model.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = new Connection("localhost", 6666);
		System.out.println("[Client] Connecting...");
		try {
			connection.start();
			System.out.println("[Client] Connected!");
		} catch (IOException e) {
			System.out.println("[Client] " + e.getMessage());
		}
	}

}
