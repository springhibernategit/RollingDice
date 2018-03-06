package viewPackage;

import java.awt.Color;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import mainPackage.Main;

public class JOptionPaneView {

	public static int menuStart() {

		UIManager UI = new UIManager();
		ImageIcon icon = new ImageIcon(Main.class.getResource("/rollingdice.jpg"));
		UI.put("OptionPane.background", new ColorUIResource(Color.white));
		UI.put("Panel.background", new ColorUIResource(Color.white));
		UI.put("OptionPane.messageForeground", Color.red);
		UI.put("Button.background", Color.red);
		UI.put("OptionPane.messageFont", new FontUIResource("Arial", Font.BOLD, 20));


		int option = JOptionPane.showOptionDialog(null, "Rolling Dice Version 1.0", "RollingDice 1.0",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon,
				new String[] { "Start game", "Rules", "Author", "Exit" }, "default");

		return option;

	}
	
	public static void author(){
	
		
		UIManager UI = new UIManager();
		UI.put("OptionPane.background", new ColorUIResource(Color.white));
		UI.put("Panel.background", new ColorUIResource(Color.white));
		UI.put("OptionPane.messageForeground", Color.red);
		UI.put("Button.background", Color.red);
		UI.put("OptionPane.messageFont", new FontUIResource("Arial", Font.BOLD, 20));
		
		URL domain = null;
		try {
			domain = new URL("http://example.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

		
		JOptionPane.showMessageDialog(null,"Michal Sowinski\nEmail:sowinskim@interia.eu:\nGitHub"+ domain, "Author", JOptionPane.PLAIN_MESSAGE, null);
		
		
	}
	
	

}
