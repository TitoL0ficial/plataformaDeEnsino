import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Dados da " + i + "a aula:");
			System.out.print("Conteudo ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			if(type == 'c') {
				System.out.print("Titulo: ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("URL do video: ");
				String url = sc.nextLine();
				System.out.print("Duracao em segundos: ");
				int duration = sc.nextInt();
				list.add(new Video(title, url, duration));
			}
			else {
				System.out.print("Titulo: ");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("Descricao: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questoes: ");
				int quantity = sc.nextInt();
				list.add(new Task(title, description, quantity));
			}
		}
		
		int sum = 0;
		for(Lesson lesson : list) {
			sum += lesson.duration();
		}
		
		System.out.println();
		System.out.println("DURACAO TOTAL DO CURSO = " + sum + " segundos");
		
		sc.close();
	}
}
