package uvsq.M1.td1.Exo4_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * implemantation de la classeimmuable Personne pour definir un personnel.
 * @author rachida ouchene.
 */
public final class Personne implements InterfacePersonne {

	/**
	 * Le nom d'un personnel.
	 * @see Personne#Personne().
	 * @see Personne#getNom().
	 */
	private final String nom;
	/**
	 * Le pernom d'un personnel .
	 * @see Personne#Personne().
	 * @see Personne#getPrenom().
	 */
	private final String prenom;
	/**
	 * La liste des telephones d'un personnel.
	 * @see Personne#Personne().
	 * @see Personne#getTel().
	 */
	private final List<ClasseTele> tel;
	/**
	 * La fonction d'un personnel.
	 * @see Personne#Personne().
	 * @see Personne#getFonc().
	 */
	private final Fonction fonc;
	/**
	 * La date de naissonce d'un personnel .
	 * @see Personne#Personne().
	 * @see Personne#getDate().
	 */
	private final LocalDate date;
	/**
	 * le Id d'un personnel.
	 * @see Personne#Personne().
	 * @see Personne#getIdPerso().
	 */
	private final int idPerso;

	/**
	 * implemantation de la classe PersonnelBuilder pour
	 * implementer notre builder.
	 */
	public static class PersonneBuilder {
		/**
		 * variable obligatoire.
		 */
		/**
		 *nom de personnel.
		 **/
		private final String nom;
		/**
		 *Prenon de personnel.
		 **/
		private final String prenom;
		/**
		 *fonctionnalete de personnel.
		 **/
		private final Fonction fonc;
		/**
		 *le id de personnel.
		 **/
		private static int idPerso;

		/**
		 * variable optionnel.
		 * le telephone de personnel.
		 */
		private List<ClasseTele> tel = new ArrayList<ClasseTele>();
		/**
		 *la date de personnel.
		 **/
		private LocalDate date;

		/**
		 * Constructor PersonnelBuilder de notre builder qu'inisialise
		 * les variable obligatoire.
		 * @param nom  Le nom de personnel.
		 * @param prenom Le prenom de personnel.
		 * @param fonc La fonction d'un personnel.
		 */
		public PersonneBuilder(final String nom, final String
				prenom, final Fonction fonc) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonc = fonc;
			idPerso += 1;
		}

		/**
		 * permet d'initialiser la date de notre builder @see date .
		 * @param date : la date .
		 * @return un objet de type PersonnelBuilder
		 * qui est notre builder.
		 * @see num.
		 */
		public final PersonneBuilder date(final LocalDate date) {
			this.date = date;
			return this;
		}

		/**
		 * Ajoute un numero de telephone a la liste des telephone
		 * dans notre builder.
		 * @param numeroTelephone : le numero de telephone.
		 * @return PersonnelBuilder qui est notre builder.
		 */
		public final PersonneBuilder addNumeroTelephone(final
				ClasseTele numeroTelephone) {
			this.tel.add(numeroTelephone);
			return this;
		}

		/**
		 * @return un objet de type Personne,
		 * c'est l'objet que on a crée.
		 */
		public final Personne build() {
			return new Personne(this);
		}
	}

	/**
	 * Constructor Personnel qu'inisialise les informations d'un
	 * personnel a partir de notre builder.
	 * @param builder :de type PersonnelBuilder qui va nous permetre
	 * d'initialiser les informations d'un personnel.
	 */
	Personne(final PersonneBuilder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		fonc = builder.fonc;
		date = builder.date;
		tel = builder.tel;
		idPerso = PersonneBuilder.idPerso;
	}

	/**
	 * @return nom d'un personnel.
	 * @see nom.
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return prenom d'un personnel.
	 * @see prenom.
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @return le Id d'un personnel.
	 * @see idPerso.
	 */
	public int getIdPersonne() {
		return this.idPerso;
	}

	/**
	 * @return la liste des telephone sd'un personnel.
	 * @see tel.
	 */
	public List<ClasseTele> getTel() {
		return (List<ClasseTele>) Collections.
				unmodifiableList(this.tel);

	}

	/**
	 * @return la fonction d'un personnel de type Fonction.
	 * @see fonc.
	 */
	public  Fonction getFonc() {
		return fonc;
	}

	/**
	 * Retourne La date de naissance d'un personnel de type LocalDate.
	 * @return la date de naissance.
	 * @see date.
	 */
	public  LocalDate getDate() {
		return date;
	}

	/**
	 * la methode print elle aaffiche les informations d'un personnel.
	 */
	public  void print() {
		System.out.println(
				" Je suis le personnel "
				+ "numéro  : " + this.idPerso + " "
						+ "Mon nom "
						+ "est " + this.nom + " "
						+ "" + this.prenom);

	}
}
