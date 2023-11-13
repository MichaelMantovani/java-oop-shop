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
		setPrezzo(prezzo);
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
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public void setPrezzo (float prezzo) {
		this.prezzo = prezzo;
	}
	
	public float getPrezzo() {
		return this.prezzo;
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
		+ "codice: " + getCodice() + "\n"
		+ "Nome: " + getNome() + "\n"
		+ "descrizione: " + getDescrizione() + "\n"
		+ "Prezzo: €" + getPrezzo() + "\n"
		+ "IVA: " + getIVA();
	}
}
