import javax.swing.JOptionPane;

public class Exerc3{
   public static void main (String[] args){
      double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número: "));
   
   
      if(numero>=0){
      double resultado = Math.pow(numero, 0.5);
      JOptionPane.showMessageDialog(null, "O valor é: " + resultado);
      } else{
      double resultado = Math.pow(numero, 2);
      JOptionPane.showMessageDialog(null, "O valor é: " + resultado);
      
      }
   }

}