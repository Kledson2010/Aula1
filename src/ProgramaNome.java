//Explorar na aula 02
import java.util.Scanner;

//Este progroma deve receber o nome de usuário e exibir a mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome:");
		//Esse código lê um texto um texto do teclado do usuário
		System.out.println("Que legal que seu nome é " + leitor.next());
		
		String nome;
		//A linha abaixo pega o texto digitado pelo usuário e guarda na variável "nome"
		nome = leitor.next();
		
		//Esse código lê um texto do teclado do usuário
		System.out.println("Que legal que seu nome é" + nome);
		
		System.out.println(nome + ", fico feliz que você esteja usando o meu programa");
		
		//Após terminarmos de usar o leitor, precisamos fechar
		
		
		
	}

}
