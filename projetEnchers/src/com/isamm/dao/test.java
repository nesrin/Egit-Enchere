package com.isamm.dao;

import com.isamm.dao.impl.ProduitDaoImpl;

public class test {
	
	
	public static void main (String args[])
	{
		System.out.println("avant l'ajout");
		ProduitDaoImpl pdi = new ProduitDaoImpl();
		pdi.insererProduit();
		System.out.println("apr�s l'ajout");
	}

}
