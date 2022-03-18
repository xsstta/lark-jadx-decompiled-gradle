package com.huawei.hms.common;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Objects;

public class Preconditions {
    public Preconditions() {
        throw new AssertionError("illegal Argument");
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
        }
    }

    public static void checkHandlerThread(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("The given thread is not the current thread.");
        }
    }

    public static void checkMainThread(String str) {
        if (!isMainThread()) {
            throw new IllegalStateException(str);
        }
    }

    public static String checkNotEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("The input parameter is empty.");
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void checkNotMainThread() {
        checkNotMainThread("The given thread is main thread.");
    }

    public static void checkNotMainThread(String str) {
        if (isMainThread()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T checkNotNull(T t) {
        Objects.requireNonNull(t, "The input parameter is null.");
        return t;
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("The input parameter is 0.");
    }

    public static int checkNotZero(int i, Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("The input parameter is 0.");
    }

    public static long checkNotZero(long j, Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(Locale.ROOT, str, objArr));
        }
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
