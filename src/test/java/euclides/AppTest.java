package euclides;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Instance of App class - just to get 100% coverage
     */
    @Test
    public void mdc() {
        App t = new App();
    }

    /**
     * Test Set - Minimal LOC coverage
     */

/*    @Test
    public void min1()
    {
        *//*
         * Minimal coverage:
         *//*

        assertEquals("10", App.mdc(10, 0)); //n2 == 0
        assertEquals("2", App.mdc(10, 6)); // while
        assertEquals("5", App.mdc(10, 5)); // r == 0
        assertEquals("Valor invalido", App.mdc(10, -6)); //n2 < 0
        assertEquals("Valor invalido", App.mdc(-10, 6));
    }*/

    /**
     * Test Set - Testes randomicos
     * randomized.txt
     */

/*
    @Test
    public void rdn1()
    {
        assertEquals("Valor invalido", App.mdc(-9, 9));
        assertEquals("8", App.mdc(8, 0));
        assertEquals("5", App.mdc(0, 5));
        assertEquals("1", App.mdc(4, 9));
        assertEquals("1", App.mdc(7, 3));
    }*/
/*
    @Test
    public void rdn2()
    {
        assertEquals("5", App.mdc(10, 5));
        assertEquals("1", App.mdc(7, 5));
        assertEquals("1", App.mdc(5, 2));
        assertEquals("7", App.mdc(7, 0));
        assertEquals("Valor invalido", App.mdc(-2, -1));
    }*/

/*
    @Test
    public void rdn3()
    {
        assertEquals("Valor invalido", App.mdc(-2, 8));
        assertEquals("Valor invalido", App.mdc(7, -2));
        assertEquals("1", App.mdc(2, 7));
        assertEquals("2", App.mdc(4, 2));
        assertEquals("6", App.mdc(6, 0));
    }*/

/*
    @Test
    public void rdn4()
    {
        assertEquals("2", App.mdc(2, 8));
        assertEquals("1", App.mdc(8, 7));
        assertEquals("1", App.mdc(7, 1));
        assertEquals("Valor invalido", App.mdc(2, -2));
        assertEquals("6", App.mdc(6, 0));
    }*/

/*
    @Test
    public void rdn5()
    {
        assertEquals("1", App.mdc(9, 2));
        assertEquals("Valor invalido", App.mdc(-2, 5));
        assertEquals("1", App.mdc(1, 2));
        assertEquals("2", App.mdc(6, 4));
        assertEquals("9", App.mdc(9, 0));
        assertEquals("2", App.mdc(0, 2));
    }*/

/*
    @Test
    public void rdn6()
    {
        assertEquals("1", App.mdc(1, 8));
        assertEquals("Valor invalido", App.mdc(6, -1));
        assertEquals("1", App.mdc(2, 1));
        assertEquals("1", App.mdc(7, 2));
        assertEquals("1", App.mdc(0, 1));
        assertEquals("2", App.mdc(2, 0));
    }*/
/*
    @Test
    public void rdn7()
    {
        assertEquals("3", App.mdc(9, 3));
        assertEquals("1", App.mdc(8, 9));
        assertEquals("Valor invalido", App.mdc(0, -1));
        assertEquals("Valor invalido", App.mdc(8, -2));
        assertEquals("1", App.mdc(0, 1));
        assertEquals("Valor invalido", App.mdc(-2, -1));
        assertEquals("9", App.mdc(9, 0));
    }*/

/*
    @Test
    public void rdn8()
    {
        assertEquals("Valor invalido", App.mdc(-2, 6));
        assertEquals("1", App.mdc(3, 10));
        assertEquals("7", App.mdc(7, 0));
        assertEquals("Valor invalido", App.mdc(9, -1));
        assertEquals("1", App.mdc(3, 5));
        assertEquals("2", App.mdc(0, 2));
    }*/

    @Test
    public void rdn9()
    {
        assertEquals("5", App.mdc(5, 0));
        assertEquals("Valor invalido", App.mdc(0, -2));
        assertEquals("10", App.mdc(10, 10));
        assertEquals("Valor invalido", App.mdc(7, -1));
        assertEquals("1", App.mdc(2, 5));
    }

/*
    @Test
    public void rdn10()
    {
        assertEquals("1", App.mdc(3, 5));
        assertEquals("10", App.mdc(0, 10));
        assertEquals("1", App.mdc(10, 3));
        assertEquals("4", App.mdc(4, 0));
        assertEquals("Valor invalido", App.mdc(10, -1));
    }*/

/*
    @Test
    public void rdn11()
    {
        assertEquals("Valor invalido", App.mdc(-1, 1));
        assertEquals("Valor invalido", App.mdc(10, -1));
        assertEquals("Valor invalido", App.mdc(4, -1));
        assertEquals("6", App.mdc(6, 0));
        assertEquals("7", App.mdc(7, 0));
        assertEquals("2", App.mdc(6, 8));
        assertEquals("2", App.mdc(8, 2));
    }*/

}
