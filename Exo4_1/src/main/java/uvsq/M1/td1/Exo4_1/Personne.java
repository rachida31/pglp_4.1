package uvsq.M1.td1.Exo4_1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public final class Personne implements  InterfacePersonne {
	
	private final String nom;	
	private final String prenom;
	private final List<ClasseTele> tel;
	private final Fonction fonc;
	private final  LocalDate date;
	private final  int   idPerso;

public static class PersonneBuilder {
	private final String nom;	
	private final String prenom;
	private  List<ClasseTele> tel=new ArrayList<ClasseTele>();
	private final Fonction fonc;
	private   LocalDate date;
	private static    int idPerso;
		
		public PersonneBuilder(String nom, String prenom, Fonction fonc) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonc = fonc;
			this.idPerso+=1;  
		}
		
		public PersonneBuilder date(LocalDate date) {
			this.date = date;
			return this;
		}
		
		public PersonneBuilder addNumeroTelephone(ClasseTele numeroTelephone) {
			this.tel.add(numeroTelephone);
			return this;
		}
		
		public Personne build() {
			return new Personne(this);
		}
	}
	
	
	
Personne(PersonneBuilder builder) {
	nom = builder.nom;
	prenom = builder.prenom;
	fonc = builder.fonc;
	date = builder.date;
	tel = builder.tel;
	idPerso=builder.idPerso;
}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	public int getIdPersonne() {
		return this.idPerso;
	}

	public List<ClasseTele> getTel() {
		return ( List<ClasseTele>) Collections.unmodifiableList(this.tel);

		
	}

	public Fonction getFonc() {
		return fonc;
	}

	public LocalDate getDate() {
		return date;
	}

	public void print() {
		System.out.println(" Je suis le personnel numéro  : " + this.idPerso +" Mon nom est "+this.nom+" "+this.prenom);
		
	}
}
