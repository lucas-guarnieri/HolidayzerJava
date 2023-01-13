public class Holiday {
    private String name;
    private String date;

    public Holiday() {
    }

    public Holiday(String name, String date) {
        this.date = date;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }
}