package array_2d;

public class tugas2 {
    public static void main(String[] args) {
        String[][] data ={
            {"ABDUL","Kediri","\t085646668991"},
            {"KUSNO","Trenggalek","\t085646668992"},
            {"PONIRAN","Bojonegoro","\t085646668999"}}; 
        System.out.print("NAMA\t");
        System.out.print(" ALAMAT\t\t");
        System.out.print("TELEPON\t");
        System.out.println();
        String nama ="";
        
        for(int a=0; a<data.length; a++){
            System.out.print(String.format("%-10s", data[a][0]));
            System.out.print(String.format("%-10s", data[a][1]));
            System.out.print(String.format("%-10s", data[a][2]));
            System.out.println("");
        }
            }
        }
   