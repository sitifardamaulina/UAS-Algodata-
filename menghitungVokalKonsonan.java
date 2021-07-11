
public class menghitungVokalKonsonan {

    
    public static void main(String[] args) {
      
        String kalimat1 = "Universitas Nusa Putra Sukabumi"
                  ;
        int hurufVokal = 0,
         huruf = 0;


        int panjangTeks = kalimat1.length();
        for (int i = 0; i < panjangTeks; i ++)
        {

            char kar = Character.toLowerCase(kalimat1.charAt(i));
            if (kar == 'a' || kar == 'e' || kar == 'i' || kar == 'o' || kar == 'u')
                hurufVokal ++;


            if (Character.isLetter (kar))
                huruf ++;


          
        }

        System.out.println("Kalimat : "+kalimat1);
        System.out.println("Jumlah Vokal = " + hurufVokal);
        System.out.println("Jumlah Konsonan = " + (huruf - hurufVokal));
      
    }
}
   
