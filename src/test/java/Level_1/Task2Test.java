package Level_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void Horse() {
        int x = 2;
        int y = 3;
        int fx = 1;
        int fy = 1;
       boolean expected = true;
       boolean actual = Task2.Horse(x, y, fx, fy);
        assertEquals(expected, actual, "Unreal position");
    }

}