
public class ejercicio6 {

    int cont;
    boolean aceptado;
    char[] car = {1, 1, 0, 1, 1, 0};  // Cadena a evaluar

    public void inicio() {
        cont = 0;
        aceptado = false;
        a();
        System.out.println(aceptado ? "Cadena aceptada" : "Cadena no aceptada");
    }

    public void a() {
        System.out.println("Entro al estado a");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                b();
            } else if (car[cont] == 1) {
                cont++;
                a();
            }
        }
    }

    public void b() {
        System.out.println("Entro al estado b");
        aceptado = true;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                b();
            } else if (car[cont] == 1) {
                cont++;
                a();
            }
        }
    }
}
