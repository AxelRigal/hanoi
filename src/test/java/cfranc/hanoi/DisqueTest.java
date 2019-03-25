package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque petit2 = new Disque(2);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
		assertEquals(0, petit.compareTo(petit2));
	}

	@Test
	public void compareTo_SmallMedium_Negative(){
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		int expected = -1;
		int actual = petit.compareTo(moyen);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_MediumSmall_Positive(){
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		int expected = 1;
		int actual = moyen.compareTo(petit);
		assertEquals(expected, actual);
	}
	@Test
	public void compareTo_SmallSmall_Equal(){
		Disque petit1 = new Disque(1);
		Disque petit2 = new Disque(1);
		int expected = 0;
		int actual = petit1.compareTo(petit2);
		assertEquals(expected, actual);
	}

}
