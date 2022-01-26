package studsluzba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SrednjaSkola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSrednjeSkole;
	
	private String naziv;
	
	private String mesto;
	
	private String tipSkole;

	public int getIdSrednjeSkole() {
		return idSrednjeSkole;
	}

	public void setIdSrednjeSkole(int idSrednjeSkole) {
		this.idSrednjeSkole = idSrednjeSkole;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	

	public String getMesto() {
		return mesto;
	}

	public void setMesto(String mesto) {
		this.mesto = mesto;
	}

	public String getTipSkole() {
		return tipSkole;
	}

	public void setTipSkole(String tipSkole) {
		this.tipSkole = tipSkole;
	}

	@Override
	public String toString() {
		return naziv + ", " + mesto + ","+ tipSkole;
	}
	
	
	
	

}
