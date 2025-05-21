package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {

	StudentManager st;
	String student = "jehui";
	
	@BeforeEach
	void setUp(){
		 st = new StudentManager();
	}

	@Test
	void testAddStudent() {
		st.addStudent(student);	
		assertTrue(st.hasStudent(student));
	}

	@Test
	void testRemoveStudent() {
		st.addStudent(student);	
		st.removeStudent(student);
		assertFalse(st.hasStudent(student));
	}

	@Test
	void testEmptyRemoveStudent() {
		assertThrows(IllegalArgumentException.class, () -> st.removeStudent(student));
	}
	
	@Test
	void testRedundantAddStudent() {
		st.addStudent(student);
		assertThrows(IllegalArgumentException.class, () -> st.addStudent(student));
	}

}
