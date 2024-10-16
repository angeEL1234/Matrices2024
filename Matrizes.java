import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Matrizes {

    public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void imprimirMatriz(int[][] m) { // m es el parámetro
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        int[][] matriz1 = new int[3][3];
        int numero = 1;
        int renglones, columnas;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = numero;
                numero++;
            }
        }
        System.out.println("Los valores de matriz1 son: ");
        imprimirMatriz(matriz1); // Llamar con argumento

        // Manipulando matrices irregulares
        int[][] matriz2;
        System.out.println("Escriba el total de renglones: ");
        entrada = buffer.readLine();
        renglones = Integer.parseInt(entrada);

        // Construyendo la matriz irregular
        matriz2 = new int[renglones][];
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Escribir columnas para este renglón: ");
            entrada = buffer.readLine();
            columnas = Integer.parseInt(entrada);
            matriz2[i] = new int[columnas];
            numero = 1;
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = numero;
                numero++;
            }
        }

        System.out.println(" Valores de la matriz irregular: ");
        imprimirMatriz(matriz2);
    }
}
