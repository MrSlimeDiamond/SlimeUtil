package net.slimediamond.util.date;

import java.time.Duration;
import java.util.StringJoiner;

public class DateUtil {

    /**
     * Formats a duration
     * @param duration The duration to format
     * @return A formatted string of the duration
     */
    public static String formatDuration(Duration duration) {
        final long days = duration.toDays();
        duration = duration.minusDays(days);
        final long hours = duration.toHours();
        duration = duration.minusHours(hours);
        final long minutes = duration.toMinutes();
        duration = duration.minusMinutes(minutes);
        final long seconds = duration.getSeconds();
        final StringJoiner joiner = new StringJoiner(", ");
        if (days > 0) joiner.add(days + " days");
        if (hours > 0) joiner.add(hours + " hours");
        if (minutes > 0) joiner.add(minutes + " minutes");
        if (seconds > 0) joiner.add(seconds + " seconds");
        return joiner.toString();
    }
}
