import java.util.ArrayList;
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    while(true){

      System.out.println("Matricula: ");
      int matriculaTmp = sc.nextInt();
      sc.nextLine();
      //PARADA
      if(matriculaTmp == 0) break;

      System.out.println("CPF: ");
      String cpfTemp = sc.nextLine();

      System.out.println("Nome: ");
      String nomeTemp = sc.nextLine();

      //CONSTRUTOR
      Funcionario temp = new Funcionario(nomeTemp, cpfTemp, matriculaTmp);

      System.out.println("Cargo: ");
      temp.setCargo(sc.nextLine());

      System.out.println("Salario: ");
      temp.setSalario(sc.nextDouble());
      sc.nextLine();

      System.out.println("Departamento: ");
      temp.setDepartamento(sc.nextLine());

      //ENDERECO
      System.out.println("Informações sobre endereço");

      System.out.println("Rua: ");
      String ruaTemp = sc.nextLine();

      System.out.println("Numero: ");
      int numTemp = sc.nextInt();
      sc.nextLine();

      //CONSTRUTOR
      Endereco tempEnd = new Endereco(ruaTemp,numTemp);

      System.out.println("Quadra: ");
      tempEnd.setQuadra(sc.nextInt());
      sc.nextLine();

      System.out.println("Lote: ");
      tempEnd.setLote(sc.nextInt());
      sc.nextLine();

      System.out.println("Complemento: ");
      tempEnd.setComplemento(sc.nextLine());

      System.out.println("Bairro: ");
      tempEnd.setBairro(sc.nextLine());

      System.out.println("Cidade: ");
      tempEnd.setCidade(sc.nextLine());

      System.out.println("Estado: ");
      tempEnd.setEstado(sc.nextLine());

      temp.setEndereco(tempEnd);

      listaFuncionarios.add(temp);

    }

    //MOSTRA TODOS
    for(int i = 0 ; i < listaFuncionarios.size(); i++)
      listaFuncionarios.get(i).mostrarDados();

    //AUMENTAR EM 30%
    for(Funcionario i : listaFuncionarios){
      i.aumentaSalario(30);
      i.mostrarDados();
    }
  }
}
