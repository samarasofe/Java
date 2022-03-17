package empresa;

public class Principal {

	public static void main(String[] args) {
		Avaliacao saulo = new Avaliacao(6,5,8);  //utilizando constructor
		
		Avaliacao leticia = new Avaliacao();
		leticia.n1 = 7;
		leticia.n2 = 4;
		leticia.n3 = 6;
		
				
		System.out.println("Media aritmetica de leticia: " + leticia.mediaAritmetica());
		System.out.println("Media ponderada de leticia: " + leticia.mediaPonderada());
		
		System.out.println("Media aritmetica de saulo: " + saulo.mediaAritmetica());
		System.out.println("Media ponderada de saulo: " + saulo.mediaPonderada());


	}

}
