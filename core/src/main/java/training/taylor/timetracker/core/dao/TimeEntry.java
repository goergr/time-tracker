package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String description;
    private float rate;
    private int time;

    final public String getDescription() {
        return description;
    }

    final public void setDescription(final String value) {
        this.description = value;
    }

    final public float getRate() {
        return rate;
    }

    final public void setRate(final float value) {
        this.rate = value;
    }

    final public int getTime() {
        return time;
    }

    final public void setTime(final int value) {
        this.time = value;
    }

    @Override
    final public String toString() {
        return "TimeEntry{" +
                "description='" + description + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}
