import javax.swing.JOptionPane;
public class CompruebaEmail {
	
	public static void main(String[] args) {
		boolean arroba = false;
		String mail = JOptionPane.showInputDialog("INGRESE UN EMAIL");
		
		for (int i=0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				
				arroba = true;
			}
			
		}
		if (arroba == true) {
			System.out.println("ES CORRECTO");
		} else {
			System.out.println("ES INCORRECTO");
		}
		
	}

}
