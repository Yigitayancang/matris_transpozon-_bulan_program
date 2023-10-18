import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satirSayisi = input.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutunSayisi = input.nextInt();

        int[][] matris = new int[satirSayisi][sutunSayisi];
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                matris[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }
        System.out.println("Orijinal Matris:");
        yazdirMatris(matris);
        System.out.println("Transpoz Matris:");
        yazdirMatris(transpozMatris);
    }
    public static void yazdirMatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
}
