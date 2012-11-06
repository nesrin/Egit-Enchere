package com.isamm.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;



@Entity
@NamedQuery(
		name="Enchere.findPersonneByDate_enchere",
	    query="SELECT e FROM Enchere e WHERE e.date_enchere= :date_enchere"
		)
public class Enchere {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_enchere ;
	private int id_produit ;
	private int id_client;
	private List<String> prix_proposé ;
	private Date date_enchere;
	
	
	
	public Enchere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_enchere() {
		return id_enchere;
	}
	public void setId_enchere(int id_enchere) {
		this.id_enchere = id_enchere;
	}
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public List<String> getPrix_proposé() {
		return prix_proposé;
	}
	public void setPrix_proposé(List<String> prix_proposé) {
		this.prix_proposé = prix_proposé;
	}
	public Date getDate_enchere() {
		return date_enchere;
	}
	public void setDate_enchere(Date date_enchere) {
		this.date_enchere = date_enchere;
	}
	
	
	

}
