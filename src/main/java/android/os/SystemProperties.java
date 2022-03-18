package android.os;

import android.util.MutableInt;
import java.util.ArrayList;
import java.util.HashMap;

public class SystemProperties {
    private static final ArrayList<Runnable> sChangeCallbacks = new ArrayList<>();
    private static final HashMap<String, MutableInt> sRoReads = null;

    private static native void native_add_change_callback();

    private static native String native_get(String str);

    private static native String native_get(String str, String str2);

    private static native boolean native_get_boolean(String str, boolean z);

    private static native int native_get_int(String str, int i);

    private static native long native_get_long(String str, long j);

    private static native void native_report_sysprop_change();

    private static native void native_set(String str, String str2);

    private static void onKeyAccess(String str) {
    }

    public static void reportSyspropChanged() {
        native_report_sysprop_change();
    }

    static void callChangeCallbacks() {
        ArrayList<Runnable> arrayList = sChangeCallbacks;
        synchronized (arrayList) {
            if (arrayList.size() != 0) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (int i = 0; i < arrayList2.size(); i++) {
                    ((Runnable) arrayList2.get(i)).run();
                }
            }
        }
    }

    public static String get(String str) {
        return native_get(str);
    }

    public static void addChangeCallback(Runnable runnable) {
        ArrayList<Runnable> arrayList = sChangeCallbacks;
        synchronized (arrayList) {
            if (arrayList.size() == 0) {
                native_add_change_callback();
            }
            arrayList.add(runnable);
        }
    }

    public static boolean getBoolean(String str, boolean z) {
        return native_get_boolean(str, z);
    }

    public static int getInt(String str, int i) {
        return native_get_int(str, i);
    }

    public static long getLong(String str, long j) {
        return native_get_long(str, j);
    }

    public static String get(String str, String str2) {
        return native_get(str, str2);
    }

    public static void set(String str, String str2) {
        if (str2 == null || str2.length() <= 91) {
            native_set(str, str2);
            return;
        }
        throw newValueTooLargeException(str, str2);
    }

    private static IllegalArgumentException newValueTooLargeException(String str, String str2) {
        return new IllegalArgumentException("value of system property '" + str + "' is longer than " + 91 + " characters: " + str2);
    }
}
