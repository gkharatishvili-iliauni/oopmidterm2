package Company;

public class EventTester {
    public static void main(String[] args) {
        EventPlanningCompany eventPlanningCompany = new EventPlanningCompany();
        Event event1 = new Event("Event 1", "June 27", "Tbilisi");
        Event event2 = new Event("Event 2", "July 14", "Batumi");
        Event event3 = new Event("Event 3", "September 8", "Tusheti");
        eventPlanningCompany.addEvent(event1);
        eventPlanningCompany.addEvent(event2);
        eventPlanningCompany.addEvent(event3);
        eventPlanningCompany.removeEvent(event2);
        eventPlanningCompany.saveState();
        // eventPlanningCompany.restoreState();

        System.out.println(eventPlanningCompany.getEvents());
    }
}
