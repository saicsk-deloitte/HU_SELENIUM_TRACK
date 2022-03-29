package MAINASSIGNMENT.test.java.CustomerDB;
import java.io.BufferedReader;
import java.io.FileReader;
public class DataBase {
    public static String FirstName=" ";
    public static String SecondName=" ";
    public static String PostCode=" ";
    public static String customerName=" ";
    public static Integer Amount=0;
    public static String FN(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chamkumar\\Desktop\\XYZBank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return FirstName;
    }
    public static String SN(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chamkumar\\Desktop\\XYZBank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SecondName;
    }
    public static String PC(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chamkumar\\Desktop\\XYZBank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return PostCode;
    }

    public static String FullName(){
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chamkumar\\Desktop\\XYZBank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return customerName;
    }

    public int Amount() {
        try {
            String line = "";
            String splitBy = ",";
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Chamkumar\\Desktop\\XYZBank.csv"));
            while ((line = br.readLine()) != null) {
                String[] Username = line.split(splitBy);
                FirstName = Username[0];
                SecondName = Username[1];
                PostCode = Username[2];
                Amount= Integer.valueOf(Username[3]);
            }
            customerName = FirstName + " " + SecondName;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return Amount;

    }
}

