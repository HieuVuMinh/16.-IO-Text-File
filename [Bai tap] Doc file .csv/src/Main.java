import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br;
        try {
            String line;
            br = new BufferedReader(new FileReader("Country.csv"));

            while ((line = br.readLine()) != null){
                printCountry(addCountryLine(line));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static List<String> addCountryLine(String line){
        List<String> countryLine = new ArrayList<>();
        if (line != null){
            String[] splitLine = line.split(",");
            for (int i = 0; i < splitLine.length; i++) {
                countryLine.add(splitLine[i]);
            }
        }
        return countryLine;
    }

    private static void printCountry(List<String> addCountryLine) {
        System.out.println(
                "Country [id= "
                        + addCountryLine.get(0)
                        + ", code= " + addCountryLine.get(1)
                        + " , name=" + addCountryLine.get(2)
                        + "]");
    }
}
