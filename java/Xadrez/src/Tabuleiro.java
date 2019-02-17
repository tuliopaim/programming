import java.util.ArrayList;

public class Tabuleiro {
	
	private Peca [][] table = new Peca [8][8];
	Jogador a, b;
	
	
	public Tabuleiro(Jogador a, Jogador b) {
		setPosicoes(a, b);
		this.a = a;
		this.b = b;
	}
	
	public void setPosicoes(Jogador a, Jogador b) {
		for(int i=0; i<8;i++) { //ZERAR TABULEIRO
			for(int j=0;j<8;j++) {
				table[i][j] = null;
			}
		}
		setPosicoesA(a);
		setPosicoesB(b);
	}
	
	private void setPosicoesA(Jogador a) {
		
		for(int i=0; i<8;i++) {
			table[1][i] = a.getPeca(i);
		}
		
		table[0][0] = a.getPeca(8);
		table[0][7] = a.getPeca(9);			/*	TORRES	*/
		
		table[0][1] = a.getPeca(10);
		table[0][6] = a.getPeca(11);		/*	CAVALOS	*/
		
		table[0][2] = a.getPeca(12);
		table[0][5] = a.getPeca(13);		/*	BISPOS	*/
		
		table[0][3] = a.getPeca(14);		/*  RAINHA	*/
		table[0][4] = a.getPeca(15);		/*  REI		*/
		
	}
	
	private void setPosicoesB(Jogador b) {

		for(int i=0; i<8;i++) {
			table[6][i] = b.getPeca(i);
		}
		
		table[7][0] = b.getPeca(8);
		table[7][7] = b.getPeca(9);			/*	TORRES	*/
		
		table[7][1] = b.getPeca(10);
		table[7][6] = b.getPeca(11);		/*	CAVALOS	*/
		
		table[7][2] = b.getPeca(12);
		table[7][5] = b.getPeca(13);		/*	BISPOS	*/
		
		table[7][3] = b.getPeca(14);		/*  RAINHA	*/
		table[7][4] = b.getPeca(15);		/*  REI		*/
	}
		
	public void printTable() {
		
		a.printaComidas();
		
		for(int i = 0; i <= 8; i++) {
			for(int j = 0; j <= 8; j++) {
				if(i == 0) {
					System.out.print(j + "    ");
				}else if(j == 0) {
					System.out.print(i);
				}else {
					if(table[i-1][j-1] == null) {
						System.out.print("    _");
					}else {
						System.out.print("   "+table[i-1][j-1].getSimbolo());
						if(table[i-1][j-1].getJogador()==a) {
							System.out.print("a");
						}else {
							System.out.print("b");
						}
					}
					
				}
			}
			System.out.println("\n");
		}
		b.printaComidas();
	}

	public Peca getTable(Pos i) {
		return table[i.getX()-1][i.getY()-1];
	}

	public void jogar(Jogador j, Pos ini, Pos fim) {
		//MOVEU
		if(getTable(fim) == null) {
			System.out.println("Moveu!");
			table[fim.getX()-1][fim.getY()-1] = getTable(ini);
			table[ini.getX()-1][ini.getY()-1] = null;	
		}
		//OU COMEU
		else if(verificarSeComeu(j, fim)) {
			System.out.println("Comeu!");
			j.addComidas(getTable(fim));
			j.removePeca(getTable(fim));
			table[fim.getX()-1][fim.getY()-1] = getTable(ini);
			table[ini.getX()-1][ini.getY()-1] = null;
		}	
	}
	
	
	public boolean verificarSeComeu(Jogador j, Pos fim) {
		return (getTable(fim).getJogador() != j);
	}
	
	public boolean jogadaValida(Jogador atual, Pos i, Pos f) {
		
		Peca peca = getTable(i);
		
		if(peca == null) return false;
		
		//verificar se está mexendo na peça
		if(peca.getJogador() != atual) {
			System.out.println("Mexa nas suas proprias peças!");
			return false;
		}
		
		if(!verificarBorda(f)) return false; //VERIFICA BORDA
		
		boolean flag = true;
		
		//VERIFICA VALIDADE DOS MOVIMENTOS
		if(peca instanceof Peao) {
			flag = ((Peao) peca).movimentoValido(i, f);
		}else if( peca instanceof Torre) {
			flag = ((Torre) peca).movimentoValido(i, f);
		}else if( peca instanceof Cavalo) {
			flag = ((Cavalo) peca).movimentoValido(i, f);
		}else if( peca instanceof Bispo) {
			flag = ((Bispo) peca).movimentoValido(i, f);
		}else if( peca instanceof Rainha) {
			flag = ((Rainha) peca).movimentoValido(i, f);
		}else if( peca instanceof Rei) {
			flag = ((Rei) peca).movimentoValido(i, f);
		}	
		
		if(flag == false) return flag;
		
		//VERIFICA SE HÁ ALGO NA FRENTE
		flag = !algoNaFrente(i,f);
	
		return flag;
	}
	
	public boolean algoNaFrente(Pos i, Pos f) {
		int xI = i.getX(),	xF = f.getX();
		int yI = i.getY(),	yF = f.getY();
		Peca peca = getTable(i);
		
		if(peca instanceof Peao ) {
			if(peca.getJogador() == a) {
				return(getTable(new Pos(xI+1, yI)) != null);
			}else {
				return(getTable(new Pos(xI-1, yI)) != null);
			}
		}		
		else if( peca instanceof Torre || peca instanceof Rainha) {
			/*CASO 1 --- MESMA COLUNA EM CIMA*/
			if(xF < xI) {
				for(int c = xI; c > xF; c--) {
					if((getTable(new Pos(c, yI)) != null)){
						return true;
					}
				}
			}
			/*CASO 2 --- MESMA COLUNA EM BAIXO*/
			if(xF > xI) {
				for(int c = xI; c < xF; c++) {
					if((getTable(new Pos(c, yI)) != null)){
						return true;
					}
				}
			}
			/*CASO 3 --- MESMA LINHA NA ESQUERDA*/
			if(yF < yI) {
				for(int c = yI; c > yF; c--) {
					if((getTable(new Pos(c, yI)) != null)){
						return true;
					}
				}
			}
			/*CASO 4 --- MESMA LINHA NA DIREITA*/
			if(yF > yI) {
				for(int c = yI; c < yF; c++) {
					if((getTable(new Pos(c, yI)) != null)){
						return true;
					}
				}
			}
			
			
		}else if( peca instanceof Cavalo) {
			return false;
		}else if( peca instanceof Bispo || peca instanceof Rainha) {
			
			/*CASO 1 --- PRIMEIRO QUADRANTE*/
			if(xI > xF && yI < yF) {
				for(int c = 1; xI-c > xF; c++) {
					if(getTable(new Pos(xI-c,yI+c)) != null) return true;
				}
			}
			
			/*CASO 2 --- SEGUNDO QUADRANTE*/
			if(xI > xF && yI > yF) {
				for(int c = 1; xI-c > xF; c++) {
					if(getTable(new Pos(xI-c,yI-c)) != null) return true;
				}
			}
		
			/*CASO 3 --- TERCEIRO QUADRANTE*/
			if(xI < xF && yI > yF) {
				for(int c = 1; c+xI < xF; c++) {
					if(getTable(new Pos(xI+c,yI-c)) != null) return true;
				}
			}
			
			/*CASO 4 --- QUARTO QUADRANTE*/
			if(xI < xF && yI < yF) {
				for(int c = 1; c+xI < xF; c++) {
					if(getTable(new Pos(xI+c,yI+c)) != null) return true;
				}
			}
			
		}else if( peca instanceof Rei) {
			return getTable(f) != null;
		}	
		return false;
	}
	
	
	public boolean verificarBorda(Pos f) {
		return ((f.getX() >= 0 && f.getX() <=8) && ((f.getY() >=0 && f.getY()<=8)));
	}
	
	
	public boolean verificarRival(Pos i, Pos f) {	
		int Xa = i.getX();
		int Ya = i.getY();
		int Xb = f.getX();
		int Yb = f.getY();
		return table[Xa-1][Ya-1].getJogador() != table[Xb-1][Yb-1].getJogador();
			
	}
	
	
}
