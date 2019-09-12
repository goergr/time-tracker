/**
 * core.dao
 */
package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    /**
     * description
     */
    private String description;

    /**
     * rate
     */
    private float rate;

    /**
     * time
     */
    private int time;

    /**
     * Getter
     *
     * @return description
     */
    final public String getDescription() {
        return description;
    }

    /**
     * Setter
     *
     * @param value
     *            description
     */
    final public void setDescription(final String value) {
        this.description = value;
    }

    /**
     * Getter
     *
     * @return rate
     */
    final public float getRate() {
        return rate;
    }

    /**
     * Setter
     *
     * @param value
     *            rate
     */
    final public void setRate(final float value) {
        this.rate = value;
    }

    /**
     * Getter
     *
     * @return time
     */
    final public int getTime() {
        return time;
    }

    /**
     * Setter
     *
     * @param value
     *            time
     */
    final public void setTime(final int value) {
        this.time = value;
    }

    @Override
    final public String toString() {
        return "TimeEntry{"
                + "description='" + description + '\''
                + ", rate=" + rate
                + ", time=" + time
                + '}';
    }
}
