
public class ejercicio7 {

    int cont;
    boolean aceptado;
    char[] car = {0, 0, 1, 0, 1};  // Cadena a evaluar

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
                double decision = Math.floor(Math.random() * 2);
                if (decision == 1) {
                    q0();
                } else {
                    q1();
                }
            } else if (car[cont] == 1) {
                cont++;
                q0();
            }
        }
    }

    public void q1() {
        System.out.println("Entro al estado q1");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 1) {
                cont++;
                q1();
            }
        }
    }

    public void q2() {
        System.out.println("Entro al estado q2");
        aceptado = true; // Nunca se puede llegar a esta parte
    }
}
