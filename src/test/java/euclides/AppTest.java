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
     * Test Set - Kill Survived Mutants
     */
/*
    @Test
    public void killer()
    {

        //while (n2 != 0): Negated integer local variable number 1 → SURVIVED
        //Equivalente: mudar o sinal de n2 nao faz diferença pois so esta comparando se é diferente de 0

        //while (n2 != 0): equal to less or equal → KILLED
        //assertEquals(-5, App.mdc(10, -5));

        //r = (n1 % n2): Negated integer local variable number 0 → KILLED
        //assertEquals(3, App.mdc(21, 12));

        //r = (n1 % n2) Negated integer local variable number 1 → SURVIVED
        //assertEquals(5, App.mdc(10, 5));

        //r = (n1 % n2) Incremented (a++) integer local variable number 0 → SURVIVED
        //Equivalente: pois na linha abaixo n1 recebe n2 (sobregrava)

        //r = (n1 % n2) Decremented (a--) integer local variable number 0 → SURVIVED
        //Equivalente: pois na linha abaixo n1 recebe n2 (sobregrava)

        //n1 = n2: Incremented (a++) integer local variable number 1 → SURVIVED
        //Equivalente: pois na linha abaixo n2 recebe r (sobregrava)

        //n1 = n2: Decremented (a--) integer local variable number 1 → SURVIVED
        //Equivalente: pois na linha abaixo n2 recebe r (sobregrava)

        //n2 = r: Incremented (a++) integer local variable number 2 → SURVIVED
        //Equivalente: pois na o valor alterado de r não é mais usado

        //n2 = r: Decremented (a--) integer local variable number 2 → SURVIVED
        //Equivalente: pois na o valor alterado de r não é mais usado

        //return n1: Incremented (a++) integer local variable number 0 → SURVIVED
        //Equivalente: pois retorna o valor antes de incremetnar

        //return n1: Decremented (a--) integer local variable number 0 → SURVIVED
        //Equivalente: pois retorna o valor antes de decrementar


    }*/

    /**
     * Test Set 1 - Testes randomicos
     * randomized.txt
     */

/*
    @Test
    public void rdn1()
    {
        assertEquals("1", App.mdc(3, 8));
        assertEquals("Valor invalido", App.mdc(2, -9));
        assertEquals("1", App.mdc(8, 5));
        assertEquals("1", App.mdc(6, 1));
        assertEquals("Valor invalido", App.mdc(-5, 8));
    }


    @Test
    public void rdn2()
    {
        assertEquals("Valor invalido", App.mdc(-9, 1));
        assertEquals("Valor invalido", App.mdc(-5, -6));
        assertEquals("Valor invalido", App.mdc(-9, 8));
        assertEquals("Valor invalido", App.mdc(2, -4));
        assertEquals("Valor invalido", App.mdc(-8, -6));
    }


    @Test
    public void rdn3()
    {
        assertEquals("Valor invalido", App.mdc(-5, -3));
        assertEquals("1", App.mdc(1, 2));
        assertEquals("1", App.mdc(7, 6));
        assertEquals("Valor invalido", App.mdc(3, -10));
        assertEquals("Valor invalido", App.mdc(-10, -2));
    }


    @Test
    public void rdn4()
    {
        assertEquals("1", App.mdc(9, 8));
        assertEquals("3", App.mdc(9, 6));
        assertEquals("Valor invalido", App.mdc(2, -6));
        assertEquals("Valor invalido", App.mdc(-1, -6));
        assertEquals("8", App.mdc(8, 0));
    }


    @Test
    public void rdn5()
    {
        assertEquals("Valor invalido", App.mdc(-10, 10));
        assertEquals("Valor invalido", App.mdc(-5, -4));
        assertEquals("Valor invalido", App.mdc(2, -1));
        assertEquals("Valor invalido", App.mdc(-10, 1));
        assertEquals("1", App.mdc(1, 3));
    }



    @Test
    public void rdn6()
    {
        assertEquals("Valor invalido", App.mdc(-9, 7));
        assertEquals("1", App.mdc(9, 7));
        assertEquals("Valor invalido", App.mdc(10, -9));
        assertEquals("Valor invalido", App.mdc(4, -10));
        assertEquals("Valor invalido", App.mdc(-5, 5));
    }

    @Test
    public void rdn7()
    {
        assertEquals("1", App.mdc(1, 10));
        assertEquals("Valor invalido", App.mdc(-10, -6));
        assertEquals("1", App.mdc(7, 4));
        assertEquals("Valor invalido", App.mdc(-4, 5));
        assertEquals("2", App.mdc(4, 6));
    }

    @Test
    public void rdn8()
    {
        assertEquals("Valor invalido", App.mdc(-9, 9));
        assertEquals("8", App.mdc(8, 0));
        assertEquals("5", App.mdc(0, 5));
        assertEquals("1", App.mdc(4, 9));
        assertEquals("1", App.mdc(7, 3));
    }

    @Test
    public void rdn9()
    {
        assertEquals("2", App.mdc(6, 8));
        assertEquals("Valor invalido", App.mdc(4, -8));
        assertEquals("1", App.mdc(5, 8));
        assertEquals("3", App.mdc(3, 3));
        assertEquals("1", App.mdc(2, 7));
    }*/

    @Test
    public void rdn10()
    {
        assertEquals("1", App.mdc(3, 8));
        assertEquals("Valor invalido", App.mdc(2, -9));
        assertEquals("1", App.mdc(8, 5));
        assertEquals("1", App.mdc(6, 1));
        assertEquals("Valor invalido", App.mdc(-5, 8));
    }



}
