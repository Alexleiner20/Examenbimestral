//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //PROGRAMA QUE DETERMINE SI UN NUMERO INGRESADO POR EL USUARIO ES PAR O IMPAR
        int numero;
        System.out.println(" Ingrese un numero : ");
        numero = Integer.parseInt(System.console().readLine());
        if (numero % 2 == 0) {
            System.out.println(" El numero es par ");
        } else {
            System.out.println("El numero es impar");
        }
    }
}