//Explorar na aula 02
import java.util.Scanner;

//Este progroma deve receber o nome de usu�rio e exibir a mensagem de boas vindas
public class ProgramaNome {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome:");
		//Esse c�digo l� um texto um texto do teclado do usu�rio
		System.out.println("Que legal que seu nome � " + leitor.next());
		
		String nome;
		//A linha abaixo pega o texto digitado pelo usu�rio e guarda na vari�vel "nome"
		nome = leitor.next();
		
		//Esse c�digo l� um texto do teclado do usu�rio
		System.out.println("Que legal que seu nome �" + nome);
		
		System.out.println(nome + ", fico feliz que voc� esteja usando o meu programa");
		
		//Ap�s terminarmos de usar o leitor, precisamos fechar
		
		
		
	}

}
