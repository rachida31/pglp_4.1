package uvsq.M1.td1.Exo4_1;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.*;

import java.util.ArrayList;

import uvsq.M1.td1.Exo4_1.Personne.PersonneBuilder;

public class TestComposite {

	private ArrayList<InterfacePersonne> personnel;
	private Fonction fonc;
	private Telephone tel;
	private CompositePersonne perso;
	private Personne p1;
	private AfficheIterator iter;

	@Before()
	public void setUp() {
		this.personnel = new ArrayList<InterfacePersonne>();

		p1 = (new PersonneBuilder("aissou", "rachel", fonc.directeur).date(LocalDate.parse("2011-12-01"))
				.addNumeroTelephone(new ClasseTele(tel.fixePro, "06 89 51 12 53")).build());
		personnel.add(p1);
		personnel.add(new PersonneBuilder("aissou", "aylan", fonc.chargeMission).date(LocalDate.parse("2014-11-01"))
				.addNumeroTelephone(new ClasseTele(tel.portable, "06 89 51 12 53")).build());
		personnel.add(new PersonneBuilder("aissou", "silas", fonc.chargeMission).date(LocalDate.parse("2019-07-01"))
				.addNumeroTelephone(new ClasseTele(tel.fixePerso, "06 89 51 12 53")).build());
		perso = new CompositePersonne(personnel, "comptabilité");

	}

	@Test
	public void TestPrint() {
		perso.print();
		assertTrue(perso.size() == 3);

	}

	@Test
	public void TestAdd() {
		Personne p = new PersonneBuilder("ouchene", "siham", fonc.directeur).date(LocalDate.parse("1995-01-16"))
				.addNumeroTelephone(new ClasseTele(tel.fixePerso, "06 89 51 12 53")).build();
		perso.add(p);
		assertTrue(perso.size() == 4);

	}

	@Test(expected = InExistArgumentException.class)
	public void TestRemove() {
		perso.remove(p1);
		perso.remove(p1);

		assertTrue(perso.size() == 3);
	}

	@Test
	public void afficheiter() {
		Personne p = new PersonneBuilder("ouchene", "nadira", fonc.directeur).date(LocalDate.parse("1995-01-16"))
				.addNumeroTelephone(new ClasseTele(tel.fixePerso, "06 89 51 12 53")).build();
		iter = new AfficheIterator(perso, personnel);
		iter.afficheIterator();
	}

	@Test
	public void afficheiterGroupe() {
		ArrayList<InterfacePersonne> personnel1 = new ArrayList<InterfacePersonne>();
		ArrayList<CompositePersonne> comp = new ArrayList<CompositePersonne>();

		p1 = (new PersonneBuilder("ouchene", "noura", fonc.directeur).date(LocalDate.parse("2011-12-01"))
				.addNumeroTelephone(new ClasseTele(tel.fixePro, "06 89 51 12 53")).build());
		personnel1.add(p1);
		personnel1.add(new PersonneBuilder("khaled", "missi", fonc.chargeMission).date(LocalDate.parse("2014-11-01"))
				.addNumeroTelephone(new ClasseTele(tel.portable, "06 89 51 12 53")).build());
		personnel1.add(new PersonneBuilder("ouchene", "malika", fonc.chargeMission).date(LocalDate.parse("2019-07-01"))
				.addNumeroTelephone(new ClasseTele(tel.fixePerso, "06 89 51 12 53")).build());
		CompositePersonne perso1 = new CompositePersonne(personnel1, "informatique");
		comp.add(perso);
		// comp.add(perso1);
		AfficheGroupeIterator Giter = new AfficheGroupeIterator(comp);
		Giter.afficheGroupeIterator();
	}

	@After()
	public void end() {

		personnel.removeAll(personnel);
	}

}
