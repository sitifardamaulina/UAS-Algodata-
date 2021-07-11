
import java.util.Scanner;


public class menghapusKata1 {
    
    public static void main(String[] args) {
        
        String kalimat, kata;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Saya sedang belajar struktur data");
        kalimat = scanner.nextLine();
 
        System.out.println("sedang");
        kata = scanner.nextLine();
        
        kalimat = kalimat.replaceAll(kata, "");
 
        System.out.println("Saya belajar struktur data" + kalimat);
    }
}

    

   

 