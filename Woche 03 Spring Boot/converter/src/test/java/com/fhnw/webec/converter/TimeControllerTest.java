package com.fhnw.webec.converter;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeControllerTest {

    @Test
    public void timeController() {
        // arrange
        var timeProvider = new TestTimeProvider();
        var formatter = DateTimeFormatter.ofPattern("HH:mm");
        var controller = new TimeController(timeProvider, formatter);
        ConcurrentModel model = new ConcurrentModel();

        // act
        var view = controller.time(model);

        // assert
        assertEquals("10:30", model.get("time"));
        assertEquals("time-view", view);
    }

    class TestTimeProvider extends TimeProvider {

        @Override
        public LocalTime getTime() {
            return LocalTime.of(10, 30, 0);
        }
    }
}
