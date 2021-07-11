
public class jumlahKata1 {
static int jumlahkata(String string)  
        {  
          int jumlah=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    jumlah++;  
            }  
            return jumlah;  
        }  
    
    public static void main(String[] args) {
         String string =" Universitas Nusa Putra Sukabumi ";  
         System.out.println(jumlahkata(string) + " jumlah kata = 2");   
    }  
    }
    

