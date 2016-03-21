package calendar;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;

import java.util.List;

public interface CalendarApi {
    void addEvent(String name, DateTime startDate, int duration);

    void addEvent(String name, DateTime startDate, DateTime endDate);

    void addEvent(Event event);

    List<Event> getAllEvents();

    List<Event> getNFirstEvents(int amount);

    List<Event> getEvents(DateTime endDate);

    Event getEvent(String eventId);

    void deleteEvent(String name);

    void deleteEvent(Event event);

    void editEvent(Event event);
}
