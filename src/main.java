import java.io.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n;

        System.out.println("Nombre del fichero");
        n=sc.nextLine();

        String nombreFichero = n;

        BufferedReader br = null;
        int contador = 0;
        try {
            br = new BufferedReader(new FileReader(nombreFichero));
            nombreFichero = br.readLine();


            contador = 0;
            while (true) {
                try {
                    if (((nombreFichero = br.readLine()) != null))
                        break;
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo de entrada");
                    System.exit(3);
                }
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        System.out.println("El archivo " + nombreFichero + " tiene " + contador + " lineas");
    }
}
