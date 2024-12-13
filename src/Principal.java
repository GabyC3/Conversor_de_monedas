import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
    int opcion=0;

    try {
        while (opcion != 8) {
            System.out.println("*****************************************\n" +
                    "BIENVENIDOS AL CONVERSOR DE MONEDAS\n\n" +
                    "Ingrese la conversion que desea realizar:\n\n" +
                    "1) Dolar =>> Peso argentino\n" +
                    "2) Peso argentino =>> Dolar\n" +
                    "3) Dolar =>> Real brasileño\n" +
                    "4) Real brasileño =>> Dolar\n" +
                    "5) Dolar =>> Peso colombiano\n" +
                    "6) Peso colombiano =>> Dolar\n" +
                    "7) Convertir otra moneda\n" +
                    "8) Salir \n\n" +
                    "Elija una opcion\n" +
                    "*****************************************\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("FIN \n" + "GRACIAS POR REALIZAR LA CONSULTA");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }

        }
        }catch (Exception e){
            System.out.println("Ingreso invalido");
            System.out.println("Finalizando la aplicación.");

    }

    }
}
