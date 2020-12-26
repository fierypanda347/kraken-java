import java.io.*;
public class CSVReader
{
    public static void nice()
    {
        String path="Kraken Database.csv";
        String line="";
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(path));
            while((line=br.readLine())!=null)
            {
                //System.out.println(line); 
                String[]values=line.split(",");
                System.out.println("Roll Number: "+values[0]+"\nRegistration Number: "+values[1]+"\nName: "+values[2]+"\nHouse: "+values[3]);
                System.out.println();
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}