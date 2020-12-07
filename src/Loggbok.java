import java.io.*;

public class Loggbok {
    private String time;
    private String text;
    private String log;
    private String data[];
    private String textFile = "data.txt";

    public Loggbok(String time, String text, String log) {
        this.time = time;
        this.text = text;
        this.log = log;
    }

    public String getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public String getLog() {
        return log;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "Loggbok{" +
                "log='" + log + '\'' +
                '}';
    }
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