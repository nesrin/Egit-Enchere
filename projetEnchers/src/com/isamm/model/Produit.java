package com.isamm.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(
		name="Produit.findPersonneByNom_produit",
	    query="SELECT p FROM Produit p WHERE p.nom_produit = :nom_produit"
		)

public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_produit ;
	private String nom_produit;
	private String description;
	private String categorie ;
	private String nom_image;
	private float prix ;
	private Date date_postulation ;
	private Date date_finale ;
	
	
	
	
	
	public Produit() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getNom_image() {
		return nom_image;
	}
	public void setNom_image(String nom_image) {
		this.nom_image = nom_image;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Date getDate_postulation() {
		return date_postulation;
	}
	public void setDate_postulation(Date date_postulation) {
		this.date_postulation = date_postulation;
	}
	public Date getDate_finale() {
		return date_finale;
	}
	public void setDate_finale(Date date_finale) {
		this.date_finale = date_finale;
	}
	

	
	
}
