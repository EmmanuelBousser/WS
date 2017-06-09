package org.helloworldmvc.main;

public class Main {
	public static void main(String[] args) {
		View view = new View();
		Model model = new Model();
		Controlleur controlleur = new Controlleur (view , model);
		
		controlleur.run();
	}

}
