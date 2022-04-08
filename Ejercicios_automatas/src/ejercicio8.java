
public class ejercicio8 {

    int cont;
    boolean aceptado;
    char[] car = {'b', 'a', 'a', 'b', 'a'};  // Cadena a evaluar

    public void inicio() {
        cont = 0;
        aceptado = false;
        s1();
        System.out.println(aceptado ? "Cadena aceptada" : "Cadena no aceptada");
    }

    public void s1() {
        System.out.println("Entro al estado s1");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 'a') {
                cont++;
                s2();
            } else if (car[cont] == 'b') {
                cont++;
                s1();
            }
        }
    }

    public void s2() {
        System.out.println("Entro al estado s2");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 'a') {
                cont++;
                s2();
            } else if (car[cont] == 'b') {
                cont++;
                s3();
            }
        }
    }

    public void s3() {
        System.out.println("Entro al estado s3");
        aceptado = true;
        if (cont < car.length) {
            if (car[cont] == 'a') {
                cont++;
                s3();
            }
        }
    }
}
