package array_2d;
public class Array_2D {

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
    }
    
}
