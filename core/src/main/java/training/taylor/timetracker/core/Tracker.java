/**
 * Created by Jason on 6/19/2015.
 */
package training.taylor.timetracker.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
public class Tracker {
	/**
	 * time entries
	 */
    @Autowired
    private List<TimeEntry> entries;

	/**
	 * add entry.
	 * 
	 * @param entry
	 *            entry
	 */
    public final void add(final TimeEntry entry) {
        entries.add(entry);
    }

	/**
	 * remove entry.
	 * 
	 * @param entry
	 *            entry
	 */
    public final void remove(final TimeEntry entry) {
//        if (true) {
//            entries.remove(entry);
//        }

        entries.remove(entry);
    }

	/**
	 * size.
	 * 
	 * @return size
	 */
    public final int size() {
        return entries.size();
    }

	/**
	 * Getter.
	 * 
	 * @param index
	 *            index
	 * @return entry
	 */
    public final TimeEntry get(final int index) {
        return entries.get(index);
    }
}


