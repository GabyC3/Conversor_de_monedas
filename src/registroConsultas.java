import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class registroConsultas {
    public void guardarConversiones(Moneda moneda) throws IOException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        FileWriter escritura = new FileWriter("Registro_de_Consultas.json");
        escritura.write(gson.toJson(moneda));
        escritura.close();
    }
}
