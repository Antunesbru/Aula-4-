import javax.swing.JOptionPane;

public class Exerc4{
   public static void main(String[] args){
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: " ));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
      int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
      
      if(a<b){
         if(b<c)
         {
         JOptionPane.showMessageDialog(null, a + " " + b + " " + c);
         } 
         else if (a<c)
         {
         JOptionPane.showMessageDialog(null, a + "  " + c + " " + b);
         }
         else
         {
         JOptionPane.showMessageDialog(null, c + "  " + a + " " + b);
         }   
      }
      else if(b<c){
         if(a<c)
         {
         JOptionPane.showMessageDialog(null, b + " " + a + " " + c);
         } 
         else 
         {
         JOptionPane.showMessageDialog(null,b + " " + c + " " + a);
         }
         if(c<b)
         {
         JOptionPane.showMessageDialog(null,c + " " + b + " " + a);
         }
      }
       
      
     }
      
   }