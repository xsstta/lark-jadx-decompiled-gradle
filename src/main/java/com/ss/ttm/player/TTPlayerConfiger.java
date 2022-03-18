package com.ss.ttm.player;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.messaging.Constants;
import java.io.File;

public final class TTPlayerConfiger {
    private static String APP_PATH = null;
    private static String CRASH_FILE_NAME = "ttplayer_crash.log";
    private static String CRASH_FILE_PATH = null;
    public static boolean IS_PRINT_INFO = false;
    private static final SparseArray<Value> KEYS = new SparseArray<>();
    private static String LIBRARY_DIR = null;
    private static String PLAYER_LIBRARY_NAME = "libttmplayer.so";
    private static String TTPLAYER_FILE_CACHE_DIR = null;
    private static final String VERSION_NAME = "999.999.999.9";

    public static void checkDebugTTPlayerLib() {
    }

    public static final String getExternalStorageDirectoryCrashFilePath(Context context) {
        return null;
    }

    public static final int getVersion() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public static final class IntValue extends Value {
        private int mValue;

        public int getValue() {
            return this.mValue;
        }

        public void setValue(int i) {
            this.mValue = i;
        }

        public IntValue(int i, int i2) {
            super(i);
            this.mValue = i2;
        }
    }

    static class LongValue extends Value {
        private long mValue;

        public long getValue() {
            return this.mValue;
        }

        public void setValue(long j) {
            this.mValue = j;
        }

        public LongValue(int i, long j) {
            super(i);
            this.mValue = j;
        }
    }

    /* access modifiers changed from: package-private */
    public static class StringValue extends Value {
        private String mValue;

        public String getValue() {
            return this.mValue;
        }

        public void setValue(String str) {
            this.mValue = str;
        }

        public StringValue(int i, String str) {
            super(i);
            this.mValue = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static class Value {
        private int mKey = -1;

        public int getKey() {
            return this.mKey;
        }

        protected Value(int i) {
            this.mKey = i;
        }
    }

    public static boolean isPrintInfo() {
        return IS_PRINT_INFO;
    }

    public static String getPlayerLibraryPath() {
        return getPlayerLibraryPath(null);
    }

    public static final boolean isOnTTPlayer() {
        if (getValue(6, 0) == 1) {
            return true;
        }
        if (getValue(1, 0) == 0) {
            return false;
        }
        if (getValue(11, 0) == 1) {
            return true;
        }
        if (getValue(7, 0) == 1 || getValue(8, 0) == 1 || getValue(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    static {
        setValue(13, 1);
        setValue(14, VERSION_NAME);
        setValue(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        setValue(0, false);
        setValue(1, true);
        setValue(2, true);
        setValue(3, false);
        setValue(4, false);
        setValue(5, false);
        setValue(6, false);
        setValue(7, false);
        setValue(8, false);
        setValue(10, 0);
        setValue(11, false);
        setValue(18, 2);
        setValue(25, 32);
    }

    public static final void setCrashFileName(String str) {
        CRASH_FILE_NAME = str;
    }

    public static final void setCrashFilePath(String str) {
        CRASH_FILE_PATH = str;
    }

    public static final void setLibraryName(String str) {
        PLAYER_LIBRARY_NAME = str;
    }

    public static final void setLibrarysDir(String str) {
        LIBRARY_DIR = str;
    }

    public static final String getAppFilesPath(Context context) {
        String str = APP_PATH;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            APP_PATH = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String getAppFileCachePath(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        String str = TTPLAYER_FILE_CACHE_DIR;
        if (str != null) {
            return str;
        }
        String str2 = APP_PATH;
        if (str2 != null) {
            return str2;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            APP_PATH = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPlayerLibrarysDir(Context context) {
        String str = LIBRARY_DIR;
        if (str == null) {
            String str2 = getAppFilesPath(context) + File.separatorChar;
            LIBRARY_DIR = str2;
            return str2;
        } else if (str.endsWith(String.valueOf(File.separatorChar))) {
            return LIBRARY_DIR;
        } else {
            return LIBRARY_DIR + File.separatorChar;
        }
    }

    public static final String getAppCrashFilePath(Context context) {
        if (CRASH_FILE_PATH != null || new File(getAppCrashFileStorePath(context)).exists()) {
            if (isPrintInfo()) {
                Log.i("ttplayer", "<TTPlayerConfigure.java,getAppCrashFileStorePath,278>carsh file path:" + CRASH_FILE_PATH);
            }
            return CRASH_FILE_PATH;
        }
        return APP_PATH + File.separatorChar + "plugins" + File.separatorChar + "com.ss.ttm" + File.separatorChar + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + File.separatorChar + "files" + File.separatorChar + CRASH_FILE_NAME;
    }

    public static final String getAppCrashFilePath2(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (CRASH_FILE_PATH == null) {
            if (APP_PATH == null) {
                APP_PATH = getAppFilesPath(context);
            }
            if (isPrintInfo()) {
                Log.i("ttplayer", "<TTPlayerConfigure.java,getAppCrashFilePath2,211>app files path:" + APP_PATH);
            }
            if (APP_PATH == null) {
                return null;
            }
            return APP_PATH + File.separatorChar + CRASH_FILE_NAME;
        }
        if (isPrintInfo()) {
            Log.i("ttplayer", "<TTPlayerConfigure.java,getAppCrashFileStorePath,195>carsh file path:" + CRASH_FILE_PATH);
        }
        return CRASH_FILE_PATH;
    }

    public static final String getAppCrashFileStorePath(Context context) {
        if (context != null && APP_PATH == null) {
            APP_PATH = context.getApplicationContext().getFilesDir().getAbsolutePath();
        }
        if (CRASH_FILE_PATH == null) {
            if (APP_PATH == null) {
                APP_PATH = getAppFilesPath(context);
            }
            if (isPrintInfo()) {
                Log.i("ttplayer", "<TTPlayerConfigure.java,getAppCrashFileStorePath,245>app files path:" + APP_PATH);
            }
            if (APP_PATH == null) {
                return null;
            }
            return APP_PATH + File.separatorChar + CRASH_FILE_NAME;
        }
        if (isPrintInfo()) {
            Log.i("ttplayer", "<TTPlayerConfigure.java,getAppCrashFileStorePath,253>carsh file path:" + CRASH_FILE_PATH);
        }
        return CRASH_FILE_PATH;
    }

    public static String getPlayerLibraryPath(Context context) {
        if (APP_PATH == null || context != null) {
            APP_PATH = getAppFilesPath(context);
        }
        if (APP_PATH == null && LIBRARY_DIR == null) {
            return null;
        }
        String str = LIBRARY_DIR;
        if (str == null) {
            return APP_PATH + File.separatorChar + PLAYER_LIBRARY_NAME;
        } else if (str.endsWith(String.valueOf(File.separatorChar))) {
            return LIBRARY_DIR + PLAYER_LIBRARY_NAME;
        } else {
            return LIBRARY_DIR + File.separatorChar + PLAYER_LIBRARY_NAME;
        }
    }

    public static final String getPlugerCrashFilePath(Context context) {
        return APP_PATH + File.separatorChar + "plugins" + File.separatorChar + "com.ss.ttm" + File.separatorChar + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + File.separatorChar + "files" + File.separatorChar + CRASH_FILE_NAME;
    }

    public static final void setValue(int i, boolean z) {
        setValue(i, z ? 1 : 0);
    }

    public static final int getValue(int i, int i2) {
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof IntValue)) {
            return i2;
        }
        return ((IntValue) value).getValue();
    }

    public static final void setValue(int i, long j) {
        SparseArray<Value> sparseArray = KEYS;
        Value value = sparseArray.get(i);
        if (value != null) {
            if (value instanceof LongValue) {
                ((LongValue) value).setValue(j);
                return;
            }
            sparseArray.remove(i);
        }
        sparseArray.append(i, new LongValue(i, j));
    }

    public static final long getValue(int i, long j) {
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof LongValue)) {
            return j;
        }
        return ((LongValue) value).getValue();
    }

    public static final void setValue(int i, int i2) {
        SparseArray<Value> sparseArray = KEYS;
        Value value = sparseArray.get(i);
        if (value != null) {
            if (!(value instanceof IntValue)) {
                sparseArray.remove(i);
            } else if (i != 2 || !getValue(6, false)) {
                ((IntValue) value).setValue(i2);
                return;
            } else {
                return;
            }
        }
        sparseArray.append(i, new IntValue(i, i2));
    }

    public static final String getValue(int i, String str) {
        if (i == 17) {
            return CRASH_FILE_NAME;
        }
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof StringValue)) {
            return str;
        }
        return ((StringValue) value).getValue();
    }

    public static final void setValue(int i, String str) {
        SparseArray<Value> sparseArray = KEYS;
        Value value = sparseArray.get(i);
        if (value != null) {
            if (value instanceof StringValue) {
                ((StringValue) value).setValue(str);
                return;
            }
            sparseArray.remove(i);
        }
        sparseArray.append(i, new StringValue(i, str));
    }

    public static final boolean getValue(int i, boolean z) {
        Value value = KEYS.get(i);
        if (value == null || !(value instanceof IntValue)) {
            return z;
        }
        if (((IntValue) value).getValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        return copyFile(str, str2, z, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080 A[SYNTHETIC, Splitter:B:46:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0088 A[Catch:{ IOException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0093 A[SYNTHETIC, Splitter:B:58:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x009b A[Catch:{ IOException -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00a6 A[SYNTHETIC, Splitter:B:70:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ae A[Catch:{ IOException -> 0x00aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r4, java.lang.String r5, boolean r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTPlayerConfiger.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
