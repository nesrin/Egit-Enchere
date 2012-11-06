package com.isamm.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(
		name="Vendeur.findPersonneByLogin",
	    query="SELECT v FROM Vendeur v WHERE v.login = :login"
		)

public class Vendeur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_vendeur;
	private String login;
	private String mot_de_passe;
	private String nom;
	private String prenom;
	private String adresse;
	
	@OneToMany(cascade=CascadeType.MERGE)
	private List<Produit> produits;
	
	
	public Vendeur() {
		
		// TODO Auto-generated constructor stub
	}
	
	public int getId_vendeur() {
		return id_vendeur;
	}
	public void setId_vendeur(int id_vendeur) {
		this.id_vendeur = id_vendeur;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}
