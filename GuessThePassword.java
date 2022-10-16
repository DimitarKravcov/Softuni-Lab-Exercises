import java.util.Scanner;

public class GuessThePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String password = scan.nextLine();
		String correctPassword = "s3cr3t!P@ssw0rd";
		
				if(password.equals(correctPassword)){
					System.out.println("Welcome");
				}else {
					System.out.println("Wrong password!");
				}
		scan.close();

	}

}