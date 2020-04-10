package uvsq.M1.td1.Exo4_1;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *implemantation de la classe AfficheGroupeIterator 
 *pour afficher le groupe de personnel.
 * @author rachida ouchene.
 * 
 */
public class AfficheGroupeIterator extends GroupeIterator implements 
Iterator<CompositePersonne> {
	/**
	* constructeur AfficheGroupeIterator qui appelle le constructeur de 
	* la classe mere GroupeIterator.
	 * @param listComposite.
	 * liste de groupe de personnel.
	 * */
	public AfficheGroupeIterator(ArrayList<CompositePersonne> listComposite) {
		super(listComposite);
	}
	/**
	 * methode afficheGroupeIterator qui affiche
	 *  la liste de groupe de personnel.
	 * 
	 * */
	@Override
	public void afficheGroupeIterator() {

	    Iterator<CompositePersonne> iterator = this.getList().iterator();

	    while(iterator.hasNext()) {
           
             iterator.next().print();
        }
		
	}

	
	
	
	

}
