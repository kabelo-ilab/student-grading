import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradesTest {

    @Test
    @DisplayName("Greetings")
    void getGreetingsTest(){
        String expected = "Welcome to Java Training";
        String actual = StudentGrades.getGreetings();
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Determine Grade")
    void determineGradeTest(){
        String expected = "A";
        String actual = StudentGrades.determineGrade(89);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Determine Age")
    void determineAgeTest(){
        int expected = 28;
        int actual = StudentGrades.determineAge(1996);
        assertEquals(expected,actual);
    }

}