
public class ejercicio5 {

    int cont;
    boolean aceptado;
    char[] car = {0, 1, 1, 1, 0, 0, 1};  // Cadena a evaluar

    public void inicio() {
        cont = 0;
        aceptado = false;
        q0();
        System.out.println(aceptado ? "Cadena aceptada" : "Cadena no aceptada");
    }

    public void q0() {
        System.out.println("Entro al estado q0");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q0();
            } else if (car[cont] == 1) {
                cont++;
                q1();
            }
        }
    }

    public void q1() {
        System.out.println("Entro al estado q1");
        aceptado = true;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q0();
            } else if (car[cont] == 1) {
                cont++;
                q2();
            }
        }
    }

    public void q2() {
        System.out.println("Entro al estado q2");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 1) {
                cont++;
                double decision = Math.floor(Math.random() * 2);
                if (decision == 1) {
                    q1();
                } else {
                    q3();
                }
            }
        }
    }

    public void q3() {
        System.out.println("Entro al estado q3");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                double decision = Math.floor(Math.random() * 2);
                if (decision == 1) {
                    q2();
                } else {
                    q3();
                }
            }
        }
    }
}
