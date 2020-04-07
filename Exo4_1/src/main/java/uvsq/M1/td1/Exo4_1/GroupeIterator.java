package uvsq.M1.td1.Exo4_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
public abstract class GroupeIterator implements Iterator<CompositePersonne>{
	private ArrayList<CompositePersonne> listComposite;
	private int index;
	
	public GroupeIterator(ArrayList<CompositePersonne> listComposite )
	{
		this.index=-1;
		this.listComposite=listComposite;
	}
	
	
	public boolean hasNext() {
		return !listComposite.isEmpty();
	}

	public CompositePersonne next() {
        if (!hasNext()) {
        throw new NoSuchElementException();
        }
        else 
        {	System.out.println(listComposite.get(index++));
        listComposite.get(index++).print();
        	return listComposite.get(index++);
        }
	}


	public  ArrayList<CompositePersonne> getList() {
		return listComposite;
		//return( ArrayList<InterfacePersonne>) Collections.unmodifiableList(this.listComposite);

	}
	
	public abstract void afficheGroupeIterator();
	

	
	
	
	
	
	
}
