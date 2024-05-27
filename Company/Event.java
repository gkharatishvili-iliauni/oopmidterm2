package Company;

public class Event {
    private String name;
    private String date;
    private String location;

    public Event(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toCsv() {
        return name + ", " + date + ", " + location;
    }

    public static Event fromCsv(String csv) {
        String[] parts = csv.split(",");
        return new Event(parts[0], parts[1].trim(), parts[2].trim());
        // Without trim it adds a space after the =' for every value except the name, for example date=' June 27', so trim is required.
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
