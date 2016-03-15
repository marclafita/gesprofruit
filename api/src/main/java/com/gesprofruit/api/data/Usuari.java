package com.gesprofruit.api.data;

import java.util.Date;

public class Usuari implements java.io.Serializable{
	
	private int id_usuari;
	private String nom_usuari;
	private String correu_electronic;
	private String contrasenya;
	private Date ultima_conexio;
	
	
	public int getId_usuari() {
		return id_usuari;
	}
	public void setId_usuari(int id_usuari) {
		this.id_usuari = id_usuari;
	}
	public String getNom_usuari() {
		return nom_usuari;
	}
	public void setNom_usuari(String nom_usuari) {
		this.nom_usuari = nom_usuari;
	}
	public String getCorreu_electronic() {
		return correu_electronic;
	}
	public void setCorreu_electronic(String correu_electronic) {
		this.correu_electronic = correu_electronic;
	}
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	public Date getUltima_conexio() {
		return ultima_conexio;
	}
	public void setUltima_conexio(Date ultima_conexio) {
		this.ultima_conexio = ultima_conexio;
	}
	
}
