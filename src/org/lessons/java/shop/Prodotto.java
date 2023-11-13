package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float IVA;
	
	public Prodotto(String nome, String descrizione, float prezzo, float IVA ) {
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzoBase(prezzo);
		setIVA(IVA);
	}
	
	private void  setCodice(int codice) {
		Random rdn = new Random ();
		this.codice = rdn.nextInt(100);
	}
	
	public int getCodice() {
		return this.codice;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCodiceNome() {
		return this.codice + "-" + this.nome;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public void setPrezzoBase (float prezzo) {
		this.prezzo = prezzo;
	}
	
	public float getPrezzoBase() {
		return this.prezzo;
	}
	
	public float getPrezzo() {
		return this.prezzo + this.prezzo * (this.IVA / 100);
	}
	
	public void setIVA(float IVA) {
		this.IVA = IVA;
	}
	
	public float getIVA() {
		return this.IVA;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prodotto:\n"
		+ "Codice: " + getCodice() + "\n"
		+ "Nome: " + getNome() + "\n"
		+ "Codice-Nome :" + getCodiceNome() + "\n"
		+ "descrizione: " + getDescrizione() + "\n"
		+ "Prezzo senza Iva : € " + String.format("%.2f", getPrezzoBase()) + "\n"
		+ "IVA: " + String.format("%.2f", getIVA()) + "\n"
		+ "Prezzo con Iva: € " + String.format("%.2f", getPrezzo());
	}
}
