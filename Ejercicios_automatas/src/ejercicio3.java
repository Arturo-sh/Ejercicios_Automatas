
public class ejercicio3 {

    int cont;
    boolean aceptado;
    char[] car = {'a', 'a', 'b', 'b', 'a'};  // Cadena a evaluar

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
            if (car[cont] == 'a') {
                cont++;
                q1();
            } else if (car[cont] == 'b') {
                cont++;
                q3();
            }
        }
    }

    public void q1() {
        System.out.println("Entro al estado q1");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 'a') {
                cont++;
                q1();
            } else if (car[cont] == 'b') {
                cont++;
                q2();
            }
        }
    }

    public void q2() {
        System.out.println("Entro al estado q2");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 'a') {
                cont++;
                q3();
            } else if (car[cont] == 'b') {
                cont++;
                q2();
            }
        }
    }

    public void q3() {
        System.out.println("Entro al estado q3");
        aceptado = true;
        if (cont < car.length) {
            if (car[cont] == 'a' || car[cont] == 'b') {
                cont++;
                q3();
            }
        }
    }
}
