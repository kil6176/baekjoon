import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        String days[] ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        if(dayOfWeekNumber == 7)
            dayOfWeekNumber = 0;
        return days[dayOfWeekNumber];
    }
}