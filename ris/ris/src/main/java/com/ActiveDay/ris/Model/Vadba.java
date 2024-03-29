package com.ActiveDay.ris.Model;

import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
public class Vadba extends Objava 
{
	//id ze prevzame od Objave, ki je nadrazred
	private String naziv;
	private int stIntervalov = 1;
	private boolean stanje = false;
	//mappedBy = "vaja" ne deluje
	@OneToMany(mappedBy = "", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Vaja> vaje = new ArrayList<Vaja>();
	//mappedBy = "objava" ne deluje
	/* @OneToMany(mappedBy = "", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Objava> objave = new ArrayList<Objava>(); */

	public Vadba() {} //More bit da se bo lahko objekt sploh shrano iz JSON-a

	public Vadba(String naziv) {
		throw new UnsupportedOperationException();
	}

	public Vadba(String naziv, int stIntervalov) {
		throw new UnsupportedOperationException();
	}

	public Vadba(String naziv, boolean stanje) {
		throw new UnsupportedOperationException();
	}

	public Vadba(String naziv, int stIntervalov, boolean stanje) {
		throw new UnsupportedOperationException();
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setStIntervalov(int stIntervalov) {
		this.stIntervalov = stIntervalov;
	}

	public int getStIntervalov() {
		return this.stIntervalov;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}

	public boolean isStanje() {
		return this.stanje;
	}

	public ArrayList<Vaja> getVaje() {
		return vaje;
	}

	public void setVaje(ArrayList<Vaja> vaje) {
		this.vaje = vaje;
	}

	public void dodajVajo(Vaja vaja) {
		throw new UnsupportedOperationException();
	}

	public void odstraniVajo(Vaja vaja) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return super.toString()+" "+naziv+" "+stIntervalov+" "+stanje+" "+vaje.toString();
	}

}