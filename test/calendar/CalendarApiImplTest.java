package calendar;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CalendarApiImplTest {

    private static EventDateTime currentTime;
    private static CalendarApi calendarApi;

    @BeforeClass
    public static void initializeVariables() {
        currentTime = new EventDateTime().setDateTime(new DateTime(new Date()));
        calendarApi = new CalendarApiImpl();
    }

    @Test
    public void shouldExistEvent_whenAddEvent() {
        // given
        String testId = "testId";
        Event event = new Event().setSummary("testing").setStart(currentTime).setEnd(currentTime).setId(testId);

        // when
        calendarApi.addEvent(event);
        // then
        assertEquals(event, calendarApi.getEvent(testId));
    }

}
