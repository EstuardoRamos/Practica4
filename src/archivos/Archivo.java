

package archivos;

import java.io.*;

/**
 * 
 * @author Estuardo Ramos
 */
public class Archivo {
    
    public static void main(String[] args) {
        String lectura = Archivo.lecturaArchivoTexto("/home/estuardo/Descargas/sinErrores.txt");
        System.out.println(lectura);
    }
    
    public static String lecturaArchivoTexto(String pathArchivo) {
        String res = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File(pathArchivo);
            if (archivo.exists()) {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String linea;
                
                linea = br.readLine();
                while(linea!=null){
                    res += "\n" + linea;
                    linea = br.readLine();
                }
                
                /*while ((linea = br.readLine()) != null) {
                    res += "\n" + linea;
                }*/
            } else {
                System.out.println("El archivo no existe ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return res;
    }

    public static void escrituraArchivoTexto(String texto, String pathArchivo) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(pathArchivo);
            pw = new PrintWriter(fichero);

            pw.println(texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
