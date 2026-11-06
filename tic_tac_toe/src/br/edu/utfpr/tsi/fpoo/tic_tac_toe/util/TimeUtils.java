package br.edu.utfpr.tsi.fpoo.tic_tac_toe.util;

public class TimeUtils {

    /**
     * Pauses the execution of the current thread for the specified number of milliseconds.
     * 
     * @param millis The time to pause in milliseconds.
     */
    public static void pauseMillis(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // Restore interrupted status so high-level frameworks can handle it if needed
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Pauses the execution of the current thread for the specified number of seconds.
     * Reuses the millisecond pause logic.
     * 
     * @param seconds The time to pause in seconds.
     */
    public static void pauseSeconds(long seconds) {
        pauseMillis(seconds * 1000);
    }
}
