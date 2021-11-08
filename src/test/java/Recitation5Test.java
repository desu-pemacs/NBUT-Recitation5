import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Recitation5Test {

    @Test
    void leftRightTriangle() {
        String expected = "*\n";
        String actual = Recitation5.leftRightTriangle(1);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "*\n**\n";
        actual = Recitation5.leftRightTriangle(2);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "*\n**\n***\n****\n*****\n******\n*******\n********\n";
        actual = Recitation5.leftRightTriangle(8);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
    }

    @Test
    void rightRightTriangle() {
        String expected = "*\n";
        String actual = Recitation5.rightRightTriangle(1);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = " *\n**\n";
        actual = Recitation5.rightRightTriangle(2);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "  *\n **\n***\n";
        actual = Recitation5.rightRightTriangle(3);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "       *\n      **\n     ***\n    ****\n   *****\n  ******\n *******\n********\n";
        actual = Recitation5.rightRightTriangle(8);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
    }

    @Test
    void circle() {
        String expected = "  ****\n ******\n ******\n********\n ******\n ******\n  ****\n";
        String actual = Recitation5.circle(4);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
        expected = "        ********\n      ************\n     **************\n    ****************\n   ******************\n  ********************\n  ********************\n **********************\n **********************\n **********************\n **********************\n************************\n **********************\n **********************\n **********************\n **********************\n  ********************\n  ********************\n   ******************\n    ****************\n     **************\n      ************\n        ********\n";
        actual = Recitation5.circle(12);
        assertEquals(expected,actual,"Expecting: "+expected+"\nActual:"+actual);
    }
}