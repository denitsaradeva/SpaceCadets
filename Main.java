import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String emailID = bf.readLine();
        String pageURL = "https://www.ecs.soton.ac.uk/people/" + emailID;
        URL url = new URL(pageURL);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = reader.readLine();
        int lineWithName=7;
        for (int i = 0; i < lineWithName; i++) {
            line = reader.readLine();
        }

        int startIndex=line.indexOf(">");
        int endIndex = line.indexOf("|");
        String name = line.substring(startIndex +1, endIndex - 1);
        System.out.println(name);
        reader.close();
    }
}
