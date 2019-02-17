import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
		
		
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Digite o nome do Player 1: ");
		String nomeA = sc.nextLine();
		System.out.print("Digite o nome do Player 2: ");
		String nomeB = sc.nextLine();*/
		
		Jogador a = new Jogador("Tulio");
		Jogador b = new Jogador("Rodrigo");
		
		System.out.println();
		System.out.println(" -----------XADREZ DOS BRODERS-----------");
		
		Tabuleiro table = new Tabuleiro(a, b);
		
		System.out.println();
				
		boolean vezDoJogador = true;
		int xI, yI, xF, yF;
		Pos ini = new Pos(0,0);
		Pos fim = new Pos(0,0);
		while(true) {
			
			Jogador atual;
			if(vezDoJogador) {
				atual = a;
			}else {
				atual = b;
			}
			
			table.printTable();
			
			while(true) {
				if(vezDoJogador) {
					System.out.println(a.getName() + " é sua vez!");
				}else{
					System.out.println(b.getName() + " é sua vez!");
				}
			
				System.out.println("Selecione a peça (x y): ");
				xI = sc.nextInt();
				yI = sc.nextInt();
				
				
				System.out.println("("+xI+","+yI+") selecionado!");
			
				System.out.println("Mover para: (x y): ");
				xF = sc.nextInt();
				yF = sc.nextInt();
				
				ini.setX(xI); ini.setY(yI);
				fim.setX(xF); fim.setY(yF);
				
				if(!table.jogadaValida(atual, ini, fim)) {
					System.out.println("Jogada invalida!");
				}else {
					break;
				}
			}
			
			
			
			table.jogar(atual, ini, fim);
			
			vezDoJogador = !vezDoJogador;
			
		}
		
		
	}

}
