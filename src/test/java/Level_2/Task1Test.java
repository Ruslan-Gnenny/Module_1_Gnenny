package Level_2;

import Level_1.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void testing() {
        String str = "{test text(more text)[][one more test text]((Some text or numbers (33)))}";
        boolean expected = true;
        boolean actual = Task1.testing(str);
        assertEquals(expected, actual, "not work's");
    }
}