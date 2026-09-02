package bismillah;
import javax .swing.JOptionPane;
public class Bismillah {

 
    public static void main(String[] args) {
        // TODO code application logic here
    
        int z [][] = {{4,6,4,2,8,2,10},{4,6,4,2,8,2,10}};
        int jumlah = 0;
        int elemen = 0;
        
        System.out.println("Data Array: ");
        for (int a = 0; a< z.length; a++){
            for (int b = 0; b < z[0].length; b++){
                System.out.print(z[a][b]+ " ");
                jumlah += z[a][b];elemen++;
                
            }
            System.out.println();
        }
        //a.rata"
        double rata = (double)jumlah/elemen;
        System.out.println("\n Rata-rata= " + rata);
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang dicari: "));
        boolean ketemu = false;
        
        for (int a=0; a< z.length; a++){
            for (int b = 0; b < z[0].length; b++){
                if (z[a][b]== cari){
                    
                    ketemu = true;
                    JOptionPane.showMessageDialog(null, "Nilai ditemukan diindeks [" + a + "][" + b + "]");
                    int baru = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai baru: "));
                    z[a][b]=baru;
                    
                }
            }
        }
        if (!ketemu){
            JOptionPane.showMessageDialog (null, "Nilai tidak ditemukan!");
        }
        System.out.println("\n Array setelah perubahan: ");
        for (int a = 0; a < z.length; a++){
            for (int b = 0; b < z[0].length; b++){
                System.out.print(z[a][b]+ " ");   
                }
            System.out.println();
            }
        int ganjil = 0;
        for (int a = 0; a < z.length; a++){
            for(int b = 0; b < z[0].length; b++){
                if (b % 2 == 1){
                ganjil += z[a][b];
                }
            }
        }
        System.out.println("\nElemendengan indeks kolom ganjil= " + ganjil);
   


    }
    
}
