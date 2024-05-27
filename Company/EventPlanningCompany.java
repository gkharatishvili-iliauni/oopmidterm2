package Company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningCompany {
    List<Event> events = new ArrayList<Event>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public boolean removeEvent(Event event) {
        return events.remove(event);
    }

    public List<Event> getEvents() {
        return new ArrayList<>(events);
    }

    public void saveState() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("state.csv"))) {
            for (Event event : events) {
                writer.write(event.toCsv());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void restoreState() {
        events.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("state.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                events.add(Event.fromCsv(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
