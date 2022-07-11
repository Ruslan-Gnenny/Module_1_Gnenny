package Level_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void calcTriangle() {
        double x1 = 1;
        double x2 =2;
        double x3 = 3;
        double y1 = 1;
        double y2 = 2;
        double y3 = 3;
        double expected = 0.0;
        double actual = Task3.CalcTriangle(x1,x2,x3,y1,y2,y3);
        assertEquals(expected, actual, "Test error");
    }
}