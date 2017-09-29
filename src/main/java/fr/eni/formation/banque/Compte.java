package fr.eni.formation.banque;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compte implements Serializable {

	private static final long serialVersionUID = -1636719122497893091L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idCompte")
	private long id;
	
	private String numero;
	
	private transient double solde;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client titulaire;

	public Compte() {
		super();
	}

	public Compte(String numero) {
		super();
		this.setNumero(numero);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return String.format("Compte [numero=%s]", getNumero());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Client getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Client titulaire) {
		this.titulaire = titulaire;
	}

	

}
