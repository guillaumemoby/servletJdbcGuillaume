package com.formation.model;

public class Client {

	private String nom;
	private String prenom;
	private int age;
	
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Client() {
		super();
	}
	
	
	public Client(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
	
}
