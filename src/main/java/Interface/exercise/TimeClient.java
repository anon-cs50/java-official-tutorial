package Interface.exercise;

import java.time.LocalDateTime;

public interface TimeClient {
    void setTime(int hour, int minute, int second);

    void setDate(int year, int month, int day);

    void setDateAndTime(int hour, int minute, int second, int year, int month, int day);

    LocalDateTime getLocalDateTime();
}
