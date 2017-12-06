import model.Connection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = new Connection("localhost", 6666);
		System.out.println(connection.start());
	}

}
