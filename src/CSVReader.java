
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\karee\\Documents\\NetBeansProjects\\excel/CustFltHst.csv";
        try{
       List<String> lines=Files.readAllLines(Paths.get("C:\\Users\\karee\\Documents\\NetBeansProjects\\excel/CustFltHst.csv"));
                for(String line:lines){
                line=line.replace("\"","" );
                System.out.println(line);
                }
        }catch(Exception e){
            e.printStackTrace();
        }
     

}}