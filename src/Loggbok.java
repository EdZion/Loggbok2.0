import java.io.*;

/**
 * Loggbok skapar och sparar data i Strings.
 */
public class Loggbok {
    private String data[];
    private String textFile = "data.txt";

    /**
     * Metoden skapar och läser in en fil med hjälp utav en bufferdWriter och en bufferdReader.
     * @throws IOException Kastar ett error meddelande om de blir fel.
     */


    private void CharStreamExample() throws IOException {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(textFile)));
            for (int i = 0; i < data.length ; i ++) {
                out.println(data[i]);
            }
        } finally {
            out.close();
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(textFile));
            System.out.println("Reading from textfile " + textFile);
            for (int i = 0 ; i < data.length ; i++) {
                double d = Double.parseDouble(in.readLine());
                System.out.println(d);
            }
        } finally {
            in.close();
        }
    }
}
