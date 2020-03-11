package uvsq.M1.td1.Exo4_1;
import static org.junit.Assert.*;
import org.junit.*;

import uvsq.M1.td1.Exo4_1.Personne.PersonneBuilder;

public class TestPersonne {

	private Personne p;
	private PersonneBuilder b;
	private Fonction fonc;
@Before()
public void setUp() {
b=new PersonneBuilder("aissou", "rachel", fonc.directeur);
p=new Personne(b);
}
@Test
public void TestA()
{
	assertTrue(p.getNom().compareTo("aissou")==0);
	assertTrue(p.getPrenom().compareTo("rachel")==0);
	assertTrue(p.getFonc()==fonc.directeur);

}
@After()
public void 

}
