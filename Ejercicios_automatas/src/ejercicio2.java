
public class ejercicio2 {

    int cont;
    boolean aceptado;
    char[] car = {1, 0, 1, 1, 1, 0, 1, 1};  // Cadena a evaluar

    public void inicio() {
        cont = 0;
        aceptado = false;
        q0();
        System.out.println(aceptado ? "Cadena aceptada" : "Cadena no aceptada");
    }

    public void q0() {
        System.out.println("Entro al estado q0");
        aceptado = true;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q2();
            } else if (car[cont] == 1) {
                cont++;
                q1();
            }
        }
    }

    public void q1() {
        System.out.println("Entro al estado q1");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q3();
            } else if (car[cont] == 1) {
                cont++;
                q0();
            }
        }
    }

    public void q2() {
        System.out.println("Entro al estado q2");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q0();
            } else if (car[cont] == 1) {
                cont++;
                q3();
            }
        }
    }

    public void q3() {
        System.out.println("Entro al estado q3");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q1();
            } else if (car[cont] == 1) {
                cont++;
                q2();
            }
        }
    }

}
