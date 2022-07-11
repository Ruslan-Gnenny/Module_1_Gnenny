package Level_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void maxDepth() {
Task2.TreeNode root= new Task2.TreeNode(3);
        root.left= new Task2.TreeNode(9);
        root.right= new Task2.TreeNode(20);
        root.right.left= new Task2.TreeNode(15);
        root.right.right= new Task2.TreeNode(7);

       int expected = 3;
       int actual = Task2.maxDepth(root);
        assertEquals(expected, actual, "not work's");
    }
}