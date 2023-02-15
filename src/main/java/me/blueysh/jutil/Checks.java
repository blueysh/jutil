package me.blueysh.jutil;

import org.jetbrains.annotations.NotNull;

public class Checks {
    /**
     * Throws a RuntimeException if the give object is null.
     * @param object The object to test.
     */
    public static void exitIfNull(Object object) {
        if (object == null) throw new RuntimeException("(exitIfNull) Null-check failed!");
    }

    /**
     * Throws a RuntimeException with an inputted message if the given object is null.
     * @param object The object to test.
     * @param failMessage The message included in the RuntimeException upon failure.
     */
    public static void exitIfNull(Object object, @NotNull String failMessage) {
        if (object == null) throw new RuntimeException("(exitIfNull) " + failMessage);
    }

    /**
     * Tests whether the given object is null.
     * @param object The object to test.
     * @return Whether the given object is null.
     */
    public static boolean isNull(Object object) {
        return object == null;
    }

    /**
     * Tests whether the given object is null, and executes a callback if the test fails.
     * @param object The object to test.
     * @param callback The callback to execute if the test fails.
     * @return Whether the given object is null.
     */
    public static boolean isNull(Object object, Runnable callback) {
        if (isNull(object)) {
            callback.run();
            return true;
        }
        return false;
    }
}