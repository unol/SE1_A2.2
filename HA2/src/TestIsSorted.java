import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIsSorted {

	@Test
	void Test_IsWellSorted_ReturnVal() {
		
		assertEquals(true,"*");//* Hier IsWellSorted mit Sequenz aufrufen, Rückgabewert sollte true sein
		
		assertEquals(false, "*");//* Hier IsWellSorted mit Sequenz aufrufen, Rückgabewert sollte false sein
	}

}
