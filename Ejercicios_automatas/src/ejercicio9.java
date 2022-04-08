
public class ejercicio9 {

    int cont;
    boolean aceptado;
    char[] car = {'b', 'a'};  // Cadena a evaluar

    public void inicio() {
        cont = 0;
        aceptado = false;
        b();
        System.out.println(aceptado ? "Cadena aceptada" : "Cadena no aceptada");
    }

    public void a() {
        System.out.println("Entro al estado A");
        aceptado = false;
        if (cont < car.length) {
            
        }
    }

    public void b() {
        System.out.println("Entro al estado B");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 'b') {
                cont++;
                c();
            } else if (car[cont] == 'c') {
                cont++;
                a();
            }
        }
    }

    public void c() {
        System.out.println("Entro al estado C");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 'a') {
                cont++;
                d();
            }
        }
    }
    
    public void d() {
        System.out.println("Entro al estado D");
        aceptado = true;
        if (cont < car.length) {
            
        }
    }
}
