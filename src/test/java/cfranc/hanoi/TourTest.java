package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayDeque;
import java.util.Queue;

public class TourTest {

	@Test
	public void Empiler_TourPleine_False() {
			Tour t = new Tour();
			Queue<Disque> disques=new ArrayDeque<>();
			disques.offer(new Disque(3));
			disques.offer(new Disque(2));
			disques.offer(new Disque(1));
			t.hauteurMax = 3;
			t.disques = disques;
			assertEquals(false, t.empiler(new Disque(4)));
	}
	@Test
	public void Empiler_TourNonPleine_True() {
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		disques.offer(new Disque(3));
		disques.offer(new Disque(2));
		t.hauteurMax = 3;
		t.disques = disques;
		assertEquals(true, t.empiler(new Disque(1)));
	}
	@Test
	public void Empiler_DisquePlusGrandSurPlusPetit_False() {
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		disques.offer(new Disque(1));
		disques.offer(new Disque(2));
		t.hauteurMax = 3;
		t.disques = disques;
		assertEquals(false, t.empiler(new Disque(1)));
	}
	@Test
	public void estPleine(){
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		disques.offer(new Disque(3));
		disques.offer(new Disque(2));
		t.hauteurMax = 3;
		t.disques = disques;
		assertEquals(false, t.estPleine());
		disques.offer(new Disque(1));
		t.disques = disques;
		assertEquals(true, t.estPleine());
	}
	@Test
	public void Empiler_disquesVide_true()
	{
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		t.disques = disques;
		assertEquals(true,t.empiler(new Disque(1)));
	}
	@Test
	public void estVide_Different(){
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		disques.offer(new Disque(2));
		disques.offer(new Disque(1));
		t.hauteurMax = 3;
		t.disques = disques;
		assertEquals(false, t.estVide());
		Queue<Disque> disquesVide =new ArrayDeque<>();
		t.disques = disquesVide;
		assertEquals(true, t.estVide());
	}
	@Test
	public void diam_SommetNull_maxInt(){
		Tour t = new Tour();
		assertEquals(Integer.MAX_VALUE, t.diam());
	}
	@Test
	public void diam_SommetEqual1_Int(){
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		disques.offer(new Disque(2));
		disques.offer(new Disque(1));
		t.disques = disques;
		Tour t2 = new Tour();
		t2.disques = disques ;
		assertEquals(t2.sommet().d, t.diam());
	}

	@Test
	public void depiler_TourVide_null()
	{
		Tour t = new Tour();
		assertEquals(null, t.depiler());
	}
	@Test
	public void depiler_TourRempli_Int()
	{
		Tour t = new Tour();
		Queue<Disque> disques=new ArrayDeque<>();
		disques.offer(new Disque(2));
		disques.offer(new Disque(1));
		t.disques = disques;
		assertEquals(2, t.depiler().d);
		assertEquals(1, t.depiler().d);
	}

	@Test
	public void Tour_Constructeur_Int(){
		Tour t = new Tour(3);
		assertEquals(3, t.hauteurMax);
	}


}
