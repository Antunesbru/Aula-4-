import javax.swing.JOptionPane;

public class Exerc2{
   public static void main (String[] args){
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro N�mero: "));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo N�mero: "));
      
      int soma = numero1 + numero2;
      int resultado = 0;
   
      if(soma<=20){
       resultado = soma - 5;
       JOptionPane.showMessageDialog(null, "O Resultado �: " + resultado);
      }else{
       JOptionPane.showMessageDialog(null," A soma dos n�meros �: " + soma);
      }
   
   }

}