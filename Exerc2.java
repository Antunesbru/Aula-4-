import javax.swing.JOptionPane;

public class Exerc2{
   public static void main (String[] args){
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Número: "));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Número: "));
      
      int soma = numero1 + numero2;
      int resultado = 0;
   
      if(soma<=20){
       resultado = soma - 5;
       JOptionPane.showMessageDialog(null, "O Resultado é: " + resultado);
      }else{
       JOptionPane.showMessageDialog(null," A soma dos números é: " + soma);
      }
   
   }

}