package Level_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

       @Test
    void uniqueCount() {
           int[] array = {1, 4, 5, 1, 1, 3};
           int expected = 4;
           int actual = Task1.uniqueCount(array);
    }
}