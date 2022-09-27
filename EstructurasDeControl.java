public class EstructurasDeControl {
    public static void main(String[] args) {

        // Condición If
        int numeroIf = 3;

        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + ", es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número " + numeroIf + ", es negativo.");
        } else {
            System.out.println("El número " + numeroIf + ", es cero.");
        }

        System.out.println(""); // espacio

        // Bucle While
        int numeroWhile = -2;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println(""); // espacio

        // Bucle Do While
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println(""); // espacio

        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++
        ) {
            System.out.println(numeroFor);
        }

        System.out.println(""); // espacio

        // Switch
        String estacion = "PRIMAVERA";

        switch (estacion) {
            case "VERANO":
                System.out.println("Estamos en VERANO.");
                break;
            case "INVIERNO":
                System.out.println("Estamos en INVIERNO.");
                break;
            case "OTOÑO":
                System.out.println("Estamos en OTOÑO.");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en PRIMAVERA.");
                break;
            default:
                System.out.println("No es una estación.");
        }
    }
}