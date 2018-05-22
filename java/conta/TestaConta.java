import javax.swing.JOptionPane;
import java.util.ArrayList;
class TestaConta{
  public static void main(String[] args) {
    ArrayList<Conta> listaContas = new ArrayList<Conta>();
    int index = 0;

    while(true){
      int novoCadastro = JOptionPane.showConfirmDialog(null, "Cadastrar nova conta?");
      if(novoCadastro == JOptionPane.NO_OPTION) break;


      int tipo = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de conta\n(1-Corrente 2-Conta Salário 3-poupança)"));

      if(tipo == 1){
        ContaCorrente temp = new ContaCorrente();
        temp.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:")));
        listaContas.add(temp);
      }else if(tipo == 2){
        ContaSalario temp = new ContaSalario();
        temp.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:")));
        listaContas.add(temp);
      }else if(tipo == 3){
        ContaPoupanca temp = new ContaPoupanca();
        temp.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:")));
        listaContas.add(temp);
      }else{
        JOptionPane.showMessageDialog(null, "Opção Incorreta");
        continue;
      }

      Cliente novo = new Cliente();
      novo.setNome(JOptionPane.showInputDialog("Digite o nome do cliente: "));
      novo.setTelefone(JOptionPane.showInputDialog("Digite o numero de celular do cliente: "));

      listaContas.get(index).setDono(novo);;
      index++;

    }

    for(Conta i : listaContas){
      System.out.println(i);
    }

  }
}
