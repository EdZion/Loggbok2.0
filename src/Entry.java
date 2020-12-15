public class Entry {
    private String text;
    private String time;
    private String user;

    public Entry(String user, String text, String time) {
        this.user = user;
        this.text = text;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public void setText(String text) {
        this.text = text;
    }
}
