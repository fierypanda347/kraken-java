import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
public class FiletxtEditor
{
    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = "UserDatabase.txt";
    static Scanner sc = new Scanner(System.in);//initiliaze scanner to get user input
    public static void op(String userpass) 
    {
        boolean fileRead = readFile();//call the method to read the file with the files name
        if(fileRead) 
        {//if the read file was successfull
            replacement(userpass);//call method to get text to replace, replacement text and output replaced String buffer
            writeToFile();
        }
        System.exit(0);
    }
    private static boolean readFile() 
    {
        Scanner fileToRead = null;
        try 
        {
            fileToRead = new Scanner(new File(filename)); //point the scanner method to a file
            //check if there is a next line and it is not null and then read it in
            for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) 
            {
                //System.out.println(line);//print each line as its read
                stringBufferOfData.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
            }
            fileToRead.close();//this is used to release the scanner from file
            return true;
        } 
        catch (FileNotFoundException ex) 
        {//if the file cannot be found an exception will be thrown
            System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            return false;
        } 
        finally 
        {//if an error occurs now we close the file to exit gracefully
            fileToRead.close();
            return true;
        }
    }
    private static void writeToFile()
    {
        try 
        {
            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
            bufwriter.close();//closes the file
        } 
        catch (Exception e)
        {//if an exception occurs
            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }
    }
    public static void replacement(String replacementText) 
    {
        String lineToEdit = "";
        int startIndex = stringBufferOfData.indexOf(lineToEdit);//now we get the starting point of the text we want to edit
        int endIndex = startIndex + lineToEdit.length();//now we add the staring index of the text with text length to get the end index
        stringBufferOfData.replace(startIndex, endIndex, replacementText+"\n");//this is where the actual replacement of the text happens
    }
} 