package emsi.iir4.TpSpringData.Entities;

import java.io.Serializable;


import jakarta.persistence.*;

@Entity
public class Produit implements Serializable{
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increments
	private Integer reference; 
	
	@Column(length = 20) //set length 
	private String designation;
	
	private double prix;
	private int qte;
	
	
	//constructeurs
	public Produit() {
		super();
	}
	
	public Produit(Integer reference, String designation, double prix, int qte) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.qte = qte;
	}
	
	

	public Integer getReference() {
		return reference;
	}

	public void setReference(Integer reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}


	//ToString
	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", designation=" + designation + ", prix=" + prix + ", qte=" + qte
				+ "]";
	}
	
	
	

}
