import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int random = r.nextInt(100);
		int guess, life = 3;
		Scanner input = new Scanner(System.in);
		String name;
		char i;
		
		System.out.println(random);
		
		name = JOptionPane.showInputDialog(null, "Emm, hey! Cual es tu nombre? ");
		
		i = name.charAt(0);
		
		JOptionPane.showMessageDialog(null, "Sabia que tu nombre empezaba con " + i + "! " + name + ", ready para el juego de adivinanzas? Let's do it!");
		JOptionPane.showMessageDialog(null, "El juego va asi: Tienes tres oportunidades para adivinar, si llegas a 0 de vidas, el juego concluye. *-|Vamos al lio|-*");
		
		for(int a = 1; a <= life; a++) {
			JOptionPane.showMessageDialog(null, "Tienes " + life + " vidas");
			
			guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Entra el numero a adivinanza: "));
			
			if(guess == random) {JOptionPane.showMessageDialog(null,"Eres una eminencia! Haz adivinado el numero. Gracias por tu brillante mente " + name + "! Bye"); System.exit(0);}
			else if(guess != random){
				if(random >= 0 && random <= 25) {
					life--;
					
					guess = Integer.parseInt(JOptionPane.showInputDialog(null,"El numero esta entre 0 - 25. Cual crees que es? "));
				}
				
				else if(random > 25 && random <= 50) {
				life--;
				
				guess = Integer.parseInt(JOptionPane.showInputDialog("El numero esta entre 25 - 50. Cual crees que es? "));
				}
				
				else if(random > 50 && random <= 75) {
					life--;
					
					guess = Integer.parseInt(JOptionPane.showInputDialog("El numero esta entre 50 - 75. Cual crees que es? "));
				}
				
				else if(random > 75 && random <= 100) {
					life--;
					
					guess = Integer.parseInt(JOptionPane.showInputDialog("El numero esta entre 75 - 100. Cual crees que es? "));
				}
			}
			else{JOptionPane.showMessageDialog(null, "Perdiste! Gracias por jugar.");}
		}
		
		// Closing the Scanner object
		input.close();
	}
}