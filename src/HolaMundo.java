public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "hola";
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 11;

        boolean valor = true;

        int numero2 = 5;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 15;

        String nombre;

        nombre = "Claus";

        if (numero > 10) {
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }
}
