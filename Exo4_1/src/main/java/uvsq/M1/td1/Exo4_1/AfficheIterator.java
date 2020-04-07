package uvsq.M1.td1.Exo4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class AfficheIterator extends ClassIterator implements 
Iterator<InterfacePersonne>{

	public AfficheIterator(CompositePersonne personnelGroupe, ArrayList<InterfacePersonne> list) {
		super(personnelGroupe, list);


	
	}

	@Override
	public void afficheIterator() {

	    Iterator<InterfacePersonne> iterator = this.getList().iterator();
		System.out.println("0000000000000000000");

	    while(iterator.hasNext()) {
           
             iterator.next().print();
        }
	    
	}



	
	
	
	
	
	
	
	
}
