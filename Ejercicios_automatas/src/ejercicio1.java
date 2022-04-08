
import javax.swing.JOptionPane;

public class ejercicio1 {

    public void seleccionarForma() {
        while (true) {
            try {
                char opcion = JOptionPane.showInputDialog(null, "Menu de opciones\n"
                        + "1.- Solucion de acuerdo al video 1\n"
                        + "2.- Solucion de acuerdo al video 2\n\n"
                        + "Selecccione una opcion del menu:").charAt(0);
                if (opcion == '1') {
                    forma1();
                    break;
                } else if (opcion == '2') {
                    inicio();
                    if (aceptado) {
                        System.out.println("La cadena ha sido aceptada");
                    } else {
                        System.out.println("La cadena no ha sido aceptada");
                    }
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite solo valores del menu!");
                    continue;
                }
            } catch (NullPointerException e) {
                break;
            } catch (StringIndexOutOfBoundsException w) {
                System.out.println("No puede dejar vacio el campo de entrada!");
            }
        }
    }

    public void forma1() {
        int[] input = {1, 0, 0, 1}; // Cadena a evaluar
        int inicio = 1;
        int finalizar = 3;
        int actual = inicio;

        boolean fin = false;

        int contador = 0;
        while (fin == false) {
            if (contador > input.length - 1) {
                fin = true;
                break;
            }
            if (actual == 1) {
                if (input[contador] == 1) {
                    actual = 1;
                }
                if (input[contador] == 0) {
                    actual = 2;
                }
                contador++;
                continue;
            }
            if (actual == 2) {
                if (input[contador] == 1) {
                    actual = 3;
                }
                if (input[contador] == 0) {
                    actual = 2;
                }
                contador++;
                continue;
            }
            if (actual == 3) {
                if (input[contador] == 1 || input[contador] == 0) {
                    actual = 3;
                }
                contador++;
                continue;
            }
        }
        if (actual == finalizar) {
            System.out.println("La cadena es correcta");
        } else {
            System.out.println("La cadena no es correcta");
        }
    }

    int cont;
    boolean aceptado;
    int[] car = {1, 0, 0, 1};  // Cadena a evaluar

    public void inicio() {
        cont = 0;
        aceptado = false;
        q1();
    }

    public void q1() {
        System.out.println("Entro al estado q1");
        aceptado = false;
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

    public void q2() {
        System.out.println("Entro al estado q2");
        aceptado = false;
        if (cont < car.length) {
            if (car[cont] == 0) {
                cont++;
                q2();
            } else if (car[cont] == 1) {
                cont++;
                q3();
            }
        }
    }

    public void q3() {
        System.out.println("Entro al estado q3");
        aceptado = true;
        if (cont < car.length) {
            if (car[cont] == 0 || car[cont] == 1) {
                cont++;
                q3();
            }
        }
    }
}
