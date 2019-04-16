import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIsSorted {

	@Test
	void Test_IsWellSorted_ReturnVal() {
		Sorted s = new Sorted();
		assertEquals(true, s.isWellSorted(new String[] {"A", "B", "C", "D"}));
		assertEquals(false, s.isWellSorted(new String[] {"D", "C", "B", "A"}));
		assertEquals(false, s.isWellSorted(new String[] {"C", "D", "B", "A"}));
		assertEquals(true, s.isWellSorted(new String[] {"A", "E", "B", "K", "C", "D"}));
	}

}
