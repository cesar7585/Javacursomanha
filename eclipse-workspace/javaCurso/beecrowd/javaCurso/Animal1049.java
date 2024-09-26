package javaCurso;
import java.util.Scanner;
public class Animal1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ent1 = sc.nextLine();
		String ent2= sc.nextLine();
		String ent3 = sc.nextLine();
		
		
		String [] aguia = {"vertabrado", "ave", "carnivoro"}; 
		String [] pombo = {"vertabrado", "ave", "onivoro"}; 
		String [] homem = {"vertabrado", "mamifero", "carnivoro"}; 
		String [] vaca = {"vertabrado", "mamifero", "herbivoro"}; 
		
		String [] pulga = {"invertebrado", "inseto", "hematofago"};
		String [] largata = {"invertebrado", "inseto", "herbivoro"};
		String [] sanssugar= {"invertebrado", "anelideo", "hematofago"};
		String [] minhoca = {"invertebrado", "inseto", "onivoro"};
		
		
		if (ent1.equals (aguia[0])   ) {
			System.out.println("deu certo");
		}else {
			System.out.println(aguia[1]);
		}
	

}
	
}
