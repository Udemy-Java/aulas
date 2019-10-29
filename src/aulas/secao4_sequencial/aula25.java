package aulas.secao4_sequencial;
/**
 * Aula 25 - Entrada de dados 2
 */
import java.util.Scanner;

public class aula25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3, y;
		
		x = sc.nextInt();
		y = sc.next();
		// Sem inserir esse nextLine a próxima variável iria consumir a quebra de linha.
		sc.nextLine();
		// Quando queremos ler até a quebra de linha devemos usar o nextLine:
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);
		System.out.println("S3 = " + s3);
		
		sc.close();
		
	}

}