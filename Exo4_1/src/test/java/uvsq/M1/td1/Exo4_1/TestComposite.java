package uvsq.M1.td1.Exo4_1;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import uvsq.M1.td1.Exo4_1.Personne.PersonneBuilder;

public class TestComposite {
	
	
	
	
	private  ArrayList<InterfacePersonne> personnel ;
	private Fonction fonc;
	private Telephone tel;
	private CompositePersonne perso;
	private Personne  p1;
@Before()
public void setUp() {
	this.personnel=new ArrayList<InterfacePersonne>();

p1=(new PersonneBuilder("aissou", "rachel", fonc.directeur).
date(LocalDate.parse("2011-12-01")).
addNumeroTelephone(new ClasseTele(tel.fixePro,"06 89 51 12 53")).build());
personnel.add(p1);
	personnel.add(new PersonneBuilder("aissou", "aylan", fonc.chargeMission).
date(LocalDate.parse("2014-11-01")).
addNumeroTelephone(new ClasseTele(tel.portable,"06 89 51 12 53")).build());
	personnel.add(new PersonneBuilder("aissou", "silas", fonc.chargeMission).
date(LocalDate.parse("2019-07-01")).
addNumeroTelephone(new ClasseTele(tel.fixePerso,"06 89 51 12 53")).build());
	perso=new CompositePersonne(personnel,"comptabilité");
}
@Test
public void TestPrint()
{
	perso.print();
	assertTrue(perso.size()==3);

}
@Test
public void TestAdd()
{
	Personne p=new PersonneBuilder("ouchene", "siham", fonc.directeur).
			date(LocalDate.parse("1995-01-16")).
			addNumeroTelephone(new ClasseTele(tel.fixePerso,"06 89 51 12 53")).build();
	perso.add(p1);
	assertTrue(perso.size()==4);

}

@Test(expected=InExistArgumentException.class)
public void TestRemove ()
{
	perso.remove(p1);
	perso.remove(p1);


	assertTrue(perso.size()==3);
}
@After()
public void end()
{
	
	personnel.removeAll(personnel);	
}
	
	
	
	
	
	
	
	
	

}
