package com.uvdev.logging;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 */
public final class Log {

    @IntDef({Level.VERBOSE, Level.DEBUG, Level.INFO, Level.WARN, Level.ERROR, Level.ASSERT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Level {
        int VERBOSE = android.util.Log.VERBOSE;
        int DEBUG = android.util.Log.DEBUG;
        int INFO = android.util.Log.INFO;
        int WARN = android.util.Log.WARN;
        int ERROR = android.util.Log.ERROR;
        int ASSERT = android.util.Log.ASSERT;
    }

    public static int v(String tag, String message, Throwable tr) {
        return android.util.Log.v(tag, message, tr);
    }

    public static int v(String tag, String message) {
        return android.util.Log.v(tag, message);
    }

    public static int d(String tag, String message, Throwable tr) {
        return android.util.Log.d(tag, message, tr);
    }

    public static int d(String tag, String message) {
        return android.util.Log.d(tag, message);
    }

    public static int i(String tag, String message, Throwable tr) {
        return android.util.Log.i(tag, message, tr);
    }

    public static int i(String tag, String message) {
        return android.util.Log.i(tag, message);
    }

    public static int w(String tag, String message, Throwable tr) {
        return android.util.Log.w(tag, message, tr);
    }

    public static int w(String tag, Throwable tr) {
        return android.util.Log.w(tag, tr);
    }

    public static int w(String tag, String message) {
        return android.util.Log.w(tag, message);
    }

    public static int e(String tag, String message, Throwable tr) {
        return android.util.Log.e(tag, message, tr);
    }

    public static int e(String tag, String message) {
        return android.util.Log.e(tag, message);
    }

    public static int wtf(String tag, String message, Throwable tr) {
        return android.util.Log.wtf(tag, message, tr);
    }

    public static int wtf(String tag, Throwable tr) {
        return android.util.Log.wtf(tag, tr);
    }

    public static int wtf(String tag, String message) {
        return android.util.Log.wtf(tag, message);
    }

    public static int v(String tag, String message, Throwable tr, Object... args) {
        return android.util.Log.v(tag, String.format(message, args), tr);
    }

    public static int v(String tag, String message, Object... args) {
        return android.util.Log.v(tag, String.format(message, args));
    }

    public static int d(String tag, String message, Throwable tr, Object... args) {
        return android.util.Log.d(tag, String.format(message, args), tr);
    }

    public static int d(String tag, String message, Object... args) {
        return android.util.Log.d(tag, String.format(message, args));
    }

    public static int i(String tag, String message, Throwable tr, Object... args) {
        return android.util.Log.i(tag, String.format(message, args), tr);
    }

    public static int i(String tag, String message, Object... args) {
        return android.util.Log.i(tag, String.format(message, args));
    }

    public static int w(String tag, String message, Throwable tr, Object... args) {
        return android.util.Log.w(tag, String.format(message, args), tr);
    }

    public static int w(String tag, String message, Object... args) {
        return android.util.Log.w(tag, String.format(message, args));
    }

    public static int e(String tag, String message, Throwable tr, Object... args) {
        return android.util.Log.e(tag, String.format(message, args), tr);
    }

    public static int e(String tag, String message, Object... args) {
        return android.util.Log.e(tag, String.format(message, args));
    }

    public static int wtf(String tag, String message, Throwable tr, Object... args) {
        return android.util.Log.wtf(tag, String.format(message, args), tr);
    }

    public static int wtf(String tag, String message, Object... args) {
        return android.util.Log.wtf(tag, String.format(message, args));
    }

    public static String getStackTraceString(Throwable tr) {
        return android.util.Log.getStackTraceString(tr);
    }

    public static boolean isLoggable(String tag, @Level int level) {
        return android.util.Log.isLoggable(tag, level);
    }

    public static int println(@Level int priority, String tag, String message) {
        return android.util.Log.println(priority, tag, message);
    }

    public static int println(@Level int priority, String tag, String message, Object... args) {
        return android.util.Log.println(priority, tag, String.format(message, args));
    }

    // Not instantiable.
    private Log() {}
}
