package euclides;

public class App {

    public static String mdc(int n1, int n2) {

        int r;
        /**
         * Codigo Original: nao tratava entradas negativas
         */
/*
        while (n2 != 0) {

            r = (n1 % n2);
            n1 = n2;
            n2 = r;

        }
        return n1;
*/

        /**
         * Codigo Modificado: tratando entradas com valor negativo
         */
        if (n1 >= 0 && n2 >= 0){ //exclui entradas negativas

            if (n2 != 0) { // se o n2 for 0 -> mdc = n1

                r = (n1 % n2);

                if (r == 0) { // ja chegou no resultado
                    return Integer.toString(n2);

                } else { // se o resto ainda nao for 0

                    while (n2 != 0) {
                        r = (n1 % n2);
                        n1 = n2;
                        n2 = r;
                    }
                    return Integer.toString(n1);
                }
            } else {
                return Integer.toString(n1);
            }
        } else {
            return "Valor invalido";
        }

    }
}