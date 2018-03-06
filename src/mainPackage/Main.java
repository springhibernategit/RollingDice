package mainPackage;

import viewPackage.JOptionPaneView;

public class Main {

	public static void main(String[] args) {
		boolean isFinished = true;
		do {
			int option = JOptionPaneView.menuStart();

			switch (option) {
			case 0:
				break;

			case 1:
				break;

			case 2:
				JOptionPaneView.author();
				break;

			case 3:
				isFinished = false;
				break;

			}

		} while (isFinished);

		System.exit(0);
	}

}
