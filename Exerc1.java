import javax.swing.JOptionPane;
public class Exerc1{

	public static void main(String[] args) {

		int leiaNumero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro Numero:"));
		int leiaNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo Numero:"));
		
		int somaNumeros = leiaNumero1 + leiaNumero2;

		if (somaNumeros > 10) {

			System.out.println("o valor é: " + somaNumeros);
		} else {
			System.out.println("Numero menor que 10");
		}
	}
}