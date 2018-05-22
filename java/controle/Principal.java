import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		DecimalFormat dc = new DecimalFormat("0,00");
		Calc c = new Calc();

    boolean continuar = true;

    do{
      try{
  		c.setN1(Integer.parseInt(JOptionPane.showInputDialog(null,
  				"Entre com o primeiro número:")));

  		c.setN2(Integer.parseInt(JOptionPane.showInputDialog(null,
  				"Entre com o segundo número:")));


  		JOptionPane.showMessageDialog(null,
  				"Soma : " + dc.format(c.somar()));
  		JOptionPane.showMessageDialog(null,
  				"Subtração : " + dc.format(c.diminuir()));
  		JOptionPane.showMessageDialog(null,
  				"Multiplicação : " + dc.format(c.multiplicar()));
  		JOptionPane.showMessageDialog(null,
  				"Divisão : " + dc.format(c.dividir()));
      }
      catch( NumberFormatException nfe){
        System.out.println("Valor Inválido");
      }catch( ArithmeticException ae){
        System.out.println("Erro divisão por zero");
      }catch( InputMismatchException ime){
        System.out.println("Entrada de Dados Inválida");
      }


    }while(continuar);

	}
}
