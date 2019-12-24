import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class carikata
{
    public static void main(String [] args)
    {        
        System.out.println(" Program Pencarian Kata Pada File Txt");          

        Scanner scan = new Scanner(System.in);

        System.out.print("\nMasukkan Kata Yang Mau Dicari : ");
        String cari = scan.next();        

        System.out.print("Masukan Nama File : ");        
        String inputFileName = scan.next();        
        System.out.println();

        try
        {
            File inputFile = new File(inputFileName);
            Scanner scanfile = new Scanner(inputFile);
            int jml = 0;

            while(scanfile.hasNext())
            {           
                String input = scanfile.next();
                
                if(input.equalsIgnoreCase(cari))
                {                    
                    jml++;
                    System.out.println(jml + ". " + input);                                        
                }                                           
            }
            if (jml == 0){                    
                System.out.println("Kata " + cari + " Tidak Ditemukan");
            }       
            else{
                System.out.println("\nKata " + cari + " Ditemukan Sebanyak : " + jml + " Kata");
            }                        

            scanfile.close();
            scan.close();
        }
        catch(Exception e)
        {    
            System.out.print(" File Tidak Ditemukan \n");     
         
        }
    }
}