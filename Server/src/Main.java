import model.Connection;

public class Main {

	public static void main(String[] args) {
		Connection connection = new Connection("localhost",6666);
		System.out.println(connection.start());
	}

}
