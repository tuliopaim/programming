/**
 * Main
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array produtos
        Produto produtos[] = new Produto[1000];
        //indice array
        int i = 2;

        //variaveis auxiliares
        String nome;
        String tipo;
        int quantidade;
        int codigo;
        double valor;

        produtos[0] = new Produto(1);
        produtos[0].nome = "Tulio";
        produtos[0].tipo = "lindo";

        produtos[1] = new Produto(2);
        produtos[1].nome = "Tulio";
        produtos[1].tipo = "lindo";


        while(true){

          System.out.println("MENU");
          System.out.println("1- Cadastrar produtos");
          System.out.println("2- Vender");
          System.out.println("3- Comprar");
          System.out.println("4- Consultar");
          System.out.println("5- Inserir informações");
          System.out.println("6- Verificar produtos iguais");
          System.out.println("7- Sair");
          System.out.println("Digite a opção desejada");
          int opMenu = sc.nextInt();
          sc.nextLine();

          switch(opMenu){
            case 1:
              //cadastrar novos produtos
              while(true){
                System.out.println("Produtos cadastrados: " + i + " (max: 1000)");
                System.out.println("Deseja adicionar um produto? (s/n)");
                char opCad = sc.next().charAt(0);
                if(opCad != 's' && opCad != 'S')
                  break;

                //cadastrar como?
                System.out.println("Cadastro de produtos");
                System.out.println("1- Código");
                System.out.println("2- Código e Nome");
                System.out.println("3- Código, Nome e Quantidade");
                System.out.println("4- Código, Nome, Quantidade, Tipo e Valor");
                System.out.println("Digite a opção desejada");

                int opc = sc.nextInt();
                sc.nextLine();

                //ler
                //chamar construtores
                if(opc == 1){
                  System.out.print("Código: ");
                  codigo = sc.nextInt();
                  sc.nextLine();
                  produtos[i++] = new Produto(codigo);
                }
                else if(opc == 2){
                  System.out.print("Código: ");
                  codigo = sc.nextInt();
                  sc.nextLine();
                  System.out.print("Nome: ");
                  nome = sc.nextLine();
                  produtos[i++] = new Produto(codigo,nome);
                }
                else if(opc == 3){
                  System.out.print("Código: ");
                  codigo = sc.nextInt();
                  sc.nextLine();
                  System.out.print("Nome: ");
                  nome = sc.nextLine();
                  System.out.print("Quantidade: ");
                  quantidade = sc.nextInt();
                  sc.nextLine();
                  produtos[i++] = new Produto(codigo,nome,quantidade);
                }
                else if(opc==4){
                  System.out.print("Código: ");
                  codigo = sc.nextInt();
                  sc.nextLine();
                  System.out.print("Nome: ");
                  nome = sc.nextLine();
                  System.out.print("Quantidade: ");
                  quantidade = sc.nextInt();
                  sc.nextLine();
                  System.out.print("Tipo: ");
                  tipo = sc.nextLine();
                  System.out.print("Valor: ");
                  valor = sc.nextDouble();
                  sc.nextLine();
                  produtos[i++] = new Produto(codigo,nome,quantidade,tipo,valor);
                }

            } //FIM CADASTRO DE PRODUTOS
            break;

          case 2:
            //VENDER
            while(true){
              System.out.println("Deseja vender qual produto?");
              System.out.print("Digite o codigo do produto: ");
              int codigoProduto = sc.nextInt();
              sc.nextLine();
              //achar produto
              int j;
              for(j = 0; j < i; j++){
                if(produtos[j].codigo == codigoProduto) break;
              }

              System.out.print("Digite a quantidade: ");
              int qntProduto = sc.nextInt();
              sc.nextLine();

              produtos[j].vender(qntProduto);

              System.out.println("Vender mais algum produto? (1-sim/0-não)");
              int desejaVender = sc.nextInt();
              sc.nextLine();
              if(desejaVender == 0) break;
            }//FIM VENDER
            break;

          case 3:
            //COMPRAR
            while(true){
              System.out.print("Digite o codigo do produto: ");
              int codigoProduto = sc.nextInt();
              sc.nextLine();

              int j;
              //achar produto
              for(j = 0; j < i; j++){
                if(produtos[j].codigo == codigoProduto){
                  System.out.println("indice:"+j);
                  break;
                };
              }

              System.out.print("Quantidade: ");
              int qntProduto = sc.nextInt();
              sc.nextLine();

              System.out.println("Comprar com novo valor? (1-sim/0-não)");
              int comoComprar = sc.nextInt();
              sc.nextLine();


              //COMPRAR SEM VALOR
              if(comoComprar == 0){
                produtos[j].comprar(qntProduto);
              }
              //COM VALOR
              else{
                System.out.print("Novo valor: ");
                double novoValor = sc.nextDouble();
                produtos[j].comprar(qntProduto, novoValor);
              }
              System.out.println("Comprar mais algum produto? (1-sim/0-não)");
              int desejaComprar = sc.nextInt();
              sc.nextLine();
              if(desejaComprar == 0) break;
            }
            break;

          case 4:
            //CONSULTAR
            System.out.println("1- Consultar um produto");
            System.out.println("2- Consultar todos os produtos");
            int consultarOq = sc.nextInt();
            sc.nextLine();

            //UM PRODUTO
            if(consultarOq == 1){
              System.out.print("Digite o codigo do produto: ");
              int codigoProduto = sc.nextInt();
              sc.nextLine();
              int j;
              //achar produto
              for(j = 0; j < i; j++){
                if(produtos[j].codigo == codigoProduto) break;
              }
              produtos[j].consultar();
            }else{
              int j;
              for(j = 0; j < i; j++){
                produtos[j].consultar();
              }
            }
            break;

          case 5:
          //INSERIR INFO
            while(true){

              System.out.print("Digite o codigo do produto: ");
              int codigoProduto = sc.nextInt();
              sc.nextLine();
              int j;
              //achar produto
              for(j = 0; j < i; j++){
                if(produtos[j].codigo == codigoProduto) break;
              }

              System.out.println("Nome: ");
              String inNome = sc.nextLine();
              System.out.println("Quantidade: ");
              int inQnt = sc.nextInt();
              sc.nextLine();
              System.out.println("Tipo: ");
              String inTipo = sc.nextLine();
              System.out.println("Valor: ");
              double inValor = sc.nextDouble();
              sc.nextLine();

              produtos[j].inserir(inNome,inQnt,inTipo,inValor);


              System.out.println("Inserir mais info? (1-sim/0-não)");
              int desejaInserir = sc.nextInt();
              sc.nextLine();
              if(desejaInserir == 0) break;
            }
            break;

          case 6:
            for(int indice1 = 0; indice1 < i; indice1 ++){
              for(int indice2 = indice1+1; indice2 < i; indice2 ++){
                if(produtos[indice1].igual(produtos[indice2])){
                  System.out.println("Os produtos de código " + produtos[indice1].codigo +
                   " e " + produtos[indice2].codigo + " são iguais");
                   System.out.println();
                }
              }
            }
            break;

          default:
            break;
            
        }//FIM SWITCH MENU

      }//FIM WHILE MENU


    }
}
