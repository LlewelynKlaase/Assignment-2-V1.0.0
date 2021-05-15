package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    List<String> myPersonList = new ArrayList<>();

    @BeforeEach
    void main() {
        for(int i = 0; i < 10; i++) {
            String firstName = "firstName" + i;
            myPersonList.add(i, firstName);
        }
    }


    @Test
    void addTest() {
        String firstName = "John";
        myPersonList.add(firstName);
        assertEquals(11, 11);
    }

    @Test
    void removeTest() {
        myPersonList.remove(6);
        assertEquals(9, myPersonList.size());
    }

    @Test
    void findTest() {
        assertTrue(myPersonList.contains("firstName4"));
    }

}