
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private static final String COMMA_DELIMITER = ",";
    
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("CustFltHst.csv"));
            List<lineObj> lineList = new ArrayList<lineObj>(); 
            String line = "";
            //Read to skip the header
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            br.readLine();
            //Reading after the header
            while ((line = br.readLine()) != null) 
            {
                String[] lineDetails = line.split(COMMA_DELIMITER);
                 if(lineDetails.length > 0 )
                {
                    //Save the line details in lineobject
                    lineObj emp = new lineObj(lineDetails[0],lineDetails[1],
                            lineDetails[2],lineDetails[3],lineDetails[4],lineDetails[5]);
                    lineList.add(emp);
                }
                  for(lineObj e : lineList)
            {
                System.out.println(e.getCustomer()+" "+e.getDeparture_date()+" "+e.getDeparture_time()+" "+e.getRoute()+" "+e.getA_c()+" "+e.getRotation());
            }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }
}