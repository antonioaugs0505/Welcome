//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		String nome;
		int idade;
		String email;
		
		//Usando Joptionpane
//		nome = JOptionPane.showInputDialog("Digite seu nome");
//		email = JOptionPane.showInputDialog("Digite seu email");
//		idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade"));
//		
//		JOptionPane.showMessageDialog(null, "Bem vindo: " + nome + ", " + "seu email é: "
//		+ email + ", " +  " sua idade é: " + idade);
		
		//Usando Scanner
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = leitor.nextLine();
		System.out.print("Digite seu email: ");
		email = leitor.nextLine();
		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		leitor.close();
		
		System.out.println("Bem vindo " + nome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Seu email: " + email);

	}

}
