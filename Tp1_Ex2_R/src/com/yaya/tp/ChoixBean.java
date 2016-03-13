package com.yaya.tp;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//CDI gere le cycle de vie des beans
@Named // ce bean est un bean CDI
@RequestScoped  // class javax.enterprise.cCOntext
public class ChoixBean  {  // implement seriazible n'est bas obligatoire car  on a comme portée la requette
	
	private String loisir;
	private String gout;
	
	public String getLoisir() {
		return loisir;
	}
	public void setLoisir(String loisir) {
		this.loisir = loisir;
	}
	public String getGout() {
		return gout;
	}
	public void setGout(String gout) {
		this.gout = gout;
	}
	
	public String affiche(){
		return "affiche";
	}
	
	
	

}
