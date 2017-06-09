package org.helloworldmvc.controller;

public class controlleur {
	private final IVeiw view;
	private final IModel model;
	
	public controlleur(final IVeiw view,final IModel model){
		this.view = view;
		this.model = model;
		
	}
	public void run(){
		this.view.displayMessage(this.model.getHelloWorld);
	}
	
}
