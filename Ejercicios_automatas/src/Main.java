
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        boolean salirPrograma = false;
        while (!salirPrograma) {
            try {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu de opciones\n"
                        + "1.- Ejercicio 1\n"
                        + "2.- Ejercicio 2\n"
                        + "3.- Ejercicio 3\n"
                        + "4.- Ejercicio 4\n"
                        + "5.- Ejercicio 5\n"
                        + "6.- Ejercicio 6\n"
                        + "7.- Ejercicio 7\n"
                        + "8.- Ejercicio 8\n"
                        + "9.- Ejercicio 9\n"
                        + "10.- Salir\n\n"
                        + "Digite una opcion del menu:"));

                switch (opcion) {
                    case 1:
                        ejercicio1 ejer1 = new ejercicio1();
                        ejer1.seleccionarForma();
                        break;
                    case 2:
                        ejercicio2 ejer2 = new ejercicio2();
                        ejer2.inicio();
                        break;
                    case 3:
                        ejercicio3 ejer3 = new ejercicio3();
                        ejer3.inicio();
                        break;
                    case 4:
                        ejercicio4 ejer4 = new ejercicio4();
                        ejer4.inicio();
                        break;
                    case 5:
                        ejercicio5 ejer5 = new ejercicio5();
                        ejer5.inicio();
                        break;
                    case 6:
                        ejercicio6 ejer6 = new ejercicio6();
                        ejer6.inicio();
                        break;
                    case 7:
                        ejercicio7 ejer7 = new ejercicio7();
                        ejer7.inicio();
                        break;
                    case 8:
                        ejercicio8 ejer8 = new ejercicio8();
                        ejer8.inicio();
                        break;
                    case 9:
                        ejercicio9 ejer9 = new ejercicio9();
                        ejer9.inicio();
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Gracias por usar este software");
                        salirPrograma = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite solo valores del menu!");
                }
            
            } catch (NumberFormatException w) {
                System.out.println("Digite solo numeros!");
            }
        }
    }
}
