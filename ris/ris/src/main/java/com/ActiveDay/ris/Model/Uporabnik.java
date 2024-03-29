package com.ActiveDay.ris.Model;

import java.util.ArrayList;

import org.hibernate.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.persistence.CascadeType;

@Entity
public class Uporabnik {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ime;
	private String priimek;
	private String uporabniskoIme;
	private String email;
	private String geslo;
	@ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "arhiv.id") @OnDelete(action = OnDeleteAction.CASCADE) @JsonIgnore
	private Arhiv arhiv;
	//mappedBy = "objava" ne deluje
	@OneToMany(mappedBy = "", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Objava> objave = new ArrayList<Objava>();
	
	public Uporabnik(){}

	public void ustvariObjavo(Objava objava) {
		throw new UnsupportedOperationException();
	}

	public void izbrisiObjavo(Objava objava) {
		throw new UnsupportedOperationException();
	}

	public Uporabnik(String email) {
		throw new UnsupportedOperationException();
	}

	public Uporabnik(String ime, String priimek, String uporabniskoIme, String email, String geslo) {
		throw new UnsupportedOperationException();
	}

	public void setArhiv(Arhiv arhiv) {
		this.arhiv = arhiv;
	}

	public Arhiv getArhiv() {
		return this.arhiv;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIme() {
		return this.ime;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public String getPriimek() {
		return this.priimek;
	}

	public void setUporabniskoIme(String uporabniskoIme) {
		this.uporabniskoIme = uporabniskoIme;
	}

	public String getUporabniskoIme() {
		return this.uporabniskoIme;
	}

	public String getEmail() {
		return this.email;
	}

	public void setGeslo(String geslo) {
		this.geslo = geslo;
	}

	public String getGeslo() {
		return this.geslo;
	}
	
    public void setId(Long id) { this.id = id; }

    public Long getId() { return id; }
}