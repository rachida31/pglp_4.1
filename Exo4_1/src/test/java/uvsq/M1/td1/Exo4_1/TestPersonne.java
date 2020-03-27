package uvsq.M1.td1.Exo4_1;
import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.*;

import uvsq.M1.td1.Exo4_1.Personne.PersonneBuilder;

public class TestPersonne {

	private Personne p;
	private Fonction fonc;
	private Telephone tel;
@Before()
public void setUp() {
p=new PersonneBuilder("aissou", "rachel", fonc.directeur).
date(LocalDate.parse("2011-12-01")).
addNumeroTelephone(new ClasseTele(tel.fixePerso,"06 89 51 12 53")).build();

}
@Test
public void TestA()
{
	assertTrue(p.getNom().compareTo("aissou")==0);
	assertTrue(p.getPrenom().compareTo("rachel")==0);
	assertTrue(p.getFonc()==fonc.directeur);

}
@Test
public void TestDate()
{
	assertTrue(p.getDate()==LocalDate.parse("2011-12-01"));
}
/*@After()
public void */

}
