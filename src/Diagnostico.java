import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Diagnostico {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> conteo = new HashMap<>();
        //Se crea el HashMap, que es lo que realizará el conteo

        BufferedReader br = new BufferedReader(new FileReader("C:\\codigos_postales_hmo.txt"));
        //Se crea el BufferedReader, que leerá de manera más eficiente que el FileReader

        String linea;

        while((linea = br.readLine())!=null){
            if (linea.length() >= 5){
                String codigoPostal = linea.substring(0, 5);
                conteo.put(codigoPostal, conteo.getOrDefault(codigoPostal, 0) + 1);
            } //Aquí se lee el archivo tomando en cuenta solamente los dígitos de los códigos postales
        } //También se asigna el HashMap a los dígitos de los códigos Postales para realizar el conteo

        for(Map.Entry<String, Integer> entry : conteo.entrySet()) {
            String codigoPostal = entry.getKey();
            int contador = entry.getValue();
            System.out.println("Código Postal: " + codigoPostal + ", compartido por " + contador + " asentamientos.");
        } //Se obtienen los valores y se imprimen los resultados

        br.close();

    }
}
