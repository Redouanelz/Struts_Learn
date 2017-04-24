package learn.struts.actions;

import org.apache.commons.lang.xwork.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport implements Action{
	
	private int id;
	private String nom;
	private String prenom;
	private int age;
	
	
	public String execute(){
		System.out.println("UsersAction execute called");
		return "";
	}
	
	public void validate(){
		if(StringUtils.isEmpty( Integer.toString(getId()))){
			addFieldError("id", "Identifiant invalide, Veuillez saisir un id valide.");
		}
		if(StringUtils.isEmpty(getNom())){
			addFieldError("nom", "Nom invalide, Veuillez saisir un nom valide.");
		}
		if(StringUtils.isEmpty(getPrenom())){
			addFieldError("prenom", "Nom invalide, Veuillez saisir un prenomnom valide.");
		}
		if(StringUtils.isEmpty( Integer.toString(getAge()))){
			addFieldError("age", "Age invalide, Veuillez saisir un age valide.");
		}
	}
	
	public String AddUser(){
		System.out.println("UsersAction AddUsers called");
		return SUCCESS;
	}
	
	public String DeleteUser(){
		System.out.println("UsersAction DeleteUsers called");
		return SUCCESS;
	}

	
	
	/* getters & setters */
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
