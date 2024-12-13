import java.io.IOException;
import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaAConvertir, String monedaConvertida, ConsultaMoneda consulta, Scanner lectura) throws IOException {
        double cantidad;
        double cantidadConvertida;


        Moneda moneda = consulta.buscarMoneda(monedaAConvertir,monedaConvertida);
        System.out.println("La tasa de conversion actualizada es:\n 1 " +monedaAConvertir+ " = "+moneda.conversion_rate()+" "+monedaConvertida);
        System.out.println("Ingrese la cantidad en "+monedaAConvertir);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaAConvertir+" = "+cantidadConvertida+" "+monedaConvertida+"\n");

        registroConsultas registro = new registroConsultas();
          registro.guardarConversiones(moneda);

    }
    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner lectura) throws IOException {
        System.out.println("Ingrese el código de la moneda:");
        String monedaAConvertir = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese el código de la moneda a convertir:");
        String monedaConvertida = lectura.nextLine().toUpperCase();
        convertir(monedaAConvertir,monedaConvertida,consulta,lectura);

    }
}
