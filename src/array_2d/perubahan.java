package array_2d;
import javax.swing.JOptionPane;

public class perubahan {
    public static void main(String[] args) {
        int data[][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};
        for (int a=0; a < data.length; a++){
            for (int b=0; b < data[0].length; b++){
                System.out.print(data[a][b]+" ");
            }
            System.out.print("\n");
        }
        //menghitung rara-rata
        int total = 0;
        int count = 0;
        for (int a = 0; a<data.length; a++){
            for (int b = 0; b<data.length; b++){
                total += data[a][b];
                count++;//menghitungjumlah elemen
            }
        }
        double average = (double) total/count; //menghitung jumlah rata-rata
        System.out.println("Rata-rata nilai array: " + average);
        
        //input posisi index untuk pertukaran nilai
        int row1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan indeks baris 1:"));
        int colom1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan indeks kolom 1:"));
        int row2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan indeks baris 2:"));
        int colom2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan indeks baris 2:"));
        
        //menukar nilai dalam array
        int temp = data[row1][colom1];
        data[row1][colom1] = data[row2][colom2];
        data[row2][colom2] = temp;
        
        //menampilkan Array setelah pertukaran
        System.out.println("\nArray setelah pertukaran");
        printArray(data);
        
        //menjumlahkan elemen dengan indeks nomor ganjil
        int sumOddColumns = 0;
        for (int[] row : data){
            for (int j = 1; j<row.length; j +=2){
                sumOddColumns += row[j];
            }
        }
        System.out.println("\nJumlah elemen pada kolom ganjil: " + sumOddColumns);
         
    }
    //metode mencetak array
    public static void printArray(int[][] data) {
        for (int[] row : data){ //looping untuk setiap baris dalam array
            for (int num : row){ //looping untuk setiap elemen dalam baris
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
