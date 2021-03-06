package uvsq.M1.td1.Exo4_1;

/**
 * implemantation de la classe ClasseTele pour definir un telephone.
 * @author rachida ouchene.
 */
public class ClasseTele {
	/**
	 * le type de telephone qu'est de type enum, soit portable soit pro .
	 * @see ClasseTele#ClasseTele().
	 * @see ClasseTele#getType().
	 */
	private Telephone type;
	/**
	 * le numero de telephone qu'est de type String.
	 * @see ClasseTele#ClasseTele()
	 * @see ClasseTele#getNum()
	 */
	private String num;

	/**
	 * Constructor ClasseTele qu'inisialise @see type par
	 * le type et @see num par num.
	 * @param type  le type de telephone qui eqt une enum.
	 * @param num   le numero de telephone .
	 */
	public ClasseTele(final Telephone type, final String num) {
		this.num = num;
		this.type = type;
	}

	/**
	 * Retourne Le type de telephone.
	 * @return type.
	 * @see type
	 */
	public final Telephone getType() {
		return type;
	}

	/**
	 * Retourne Le numero de telephone.
	 * @return numero.
	 * @see num.
	 */
	public final String getNum() {
		return num;
	}

}
