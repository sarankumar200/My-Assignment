package org.system;

public class Disktop extends Computer {
	public void desktopSize() {
		System.out.println("desktopSize");
	}
	public static void main(String[] args) {
		Disktop objet=new Disktop();
		objet.computerModel();
		objet.desktopSize();
	}

}
