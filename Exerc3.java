import javax.swing.JOptionPane;

public class Exerc3{
   public static void main (String[] args){
      double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o N�mero: "));
   
   
      if(numero>=0){
      double resultado = Math.pow(numero, 0.5);
      JOptionPane.showMessageDialog(null, "O valor �: " + resultado);
      } else{
      double resultado = Math.pow(numero, 2);
      JOptionPane.showMessageDialog(null, "O valor �: " + resultado);
      
      }
   }

}