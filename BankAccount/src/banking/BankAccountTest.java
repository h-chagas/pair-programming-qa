package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	BankAccount ba;
	
	@BeforeEach
	void setUp() throws Exception {
		ba = new BankAccount("Salvador Dali", 300);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		ba = null;
	}

	@Test
	void test() {
		ba.withdraw(200);
		assertEquals(100, ba.balance());
	}

}
