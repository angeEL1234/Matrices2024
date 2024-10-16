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

    public static int[][] CrearMatrizIrregular(int r) throws IOException{
        int c;
        int[][] matriz2 = new int[r][];
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Escribir columnas para este renglón: ");
            entrada = buffer.readLine();
            c = Integer.parseInt(entrada);
            matriz2[i] = new int[c];
        }
        return matriz2;
    }

    public static int[][] llenarMatrizIrregular(int[][] m) throws IOException{
        System.out.println("Introducciondo valores en una matriz irregular: ");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m [i].length; i++){
                System.out.println("Escriba el valor de ["+i+"]["+j+"]:");
                entrada = buffer.readLine();
                m[i][j] = Integer.parseInt(entrada);

            }
        }
        return m;
    }

    public static void main(String[] args) throws IOException {
        int[][] matriz1 = new int[3][3];
        int numero = 1;
        int renglones;

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
        matriz2 = CrearMatrizIrregular(renglones);
        matriz2 = llenarMatrizIrregular(matriz2);
        System.out.println(" Valores de la matriz irregular: ");
        imprimirMatriz(matriz2);
    }
}
