package viewPackage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import mainPackage.Main;

public class JOptionPaneView extends JFrame {

	public static int menuStart() {
		
		
		
		UIManager UI = new UIManager();
		ImageIcon icon = new ImageIcon(Main.class.getResource("/rollingdice.jpg"));
		UI.put("OptionPane.background", new ColorUIResource(Color.white));
		UI.put("Panel.background", new ColorUIResource(Color.white));
		UI.put("OptionPane.messageForeground", Color.red);
		UI.put("Button.background", Color.red);
		UI.put("OptionPane.messageFont",new FontUIResource("Arial", Font.BOLD, 20));
		
		
		
		String menuText;
		
		
		

		int option =JOptionPane.showOptionDialog(null,"Rolling Dice Version 1.0"
		, "RollingDice 1.0", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, icon, new String[] { "Start game", "Rules","Author", "Exit" }, 
				"default");
		
		
		
		return option;

	}

}
