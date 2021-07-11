
import java.util.Scanner;


public class membalikKata2 {

    public static void main(String[] args) {
        
 
        
        String kataNormal;
        String kataBalik = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di dunia pemrograman ");
        
        kataNormal = input.nextLine();
        
        for (int i = kataNormal.length() -1; i>= 0; i--)
        {
            kataBalik += kataNormal.charAt(i);
            
        }
            
        System.out.println("Pemrograman dunia di datang Selamat" + kataBalik);
        
    }
    
}

    

 
