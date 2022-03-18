package com.bytedance.common.wschannel;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.wschannel.utils.Utils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WsChannelMultiProcessSharedProvider extends ContentProvider {
    public static Uri sBaseUri;
    private static MultiProcessShared sInstance;
    public static boolean sIsRegisterInMainProcess;
    private static volatile boolean sLoadValuesInit;
    private static UriMatcher sMatcher;
    public static String sShareAuthority;
    private Map<String, Object> mContentValues = new ConcurrentHashMap();
    private SharedPreferences mSharedPreferences;
    private final Object sLoadValuesInitLock = new Object();

    public static class Editor {
        Context mContext;
        private ContentValues mValues;

        public synchronized void commit() {
            apply();
        }

        public synchronized void apply() {
            try {
                this.mContext.getContentResolver().insert(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, "key", ShareHitPoint.f121869d), this.mValues);
            } catch (Throwable unused) {
            }
        }

        private Editor(Context context) {
            this.mValues = new ContentValues();
            this.mContext = context.getApplicationContext();
        }

        public Editor putString(String str, String str2) {
            this.mValues.put(str, str2);
            return this;
        }

        public Editor putBoolean(String str, boolean z) {
            this.mValues.put(str, Boolean.valueOf(z));
            return this;
        }

        public Editor putLong(String str, long j) {
            this.mValues.put(str, Long.valueOf(j));
            return this;
        }
    }

    public static class MultiProcessShared {
        private Context mContext;
        private boolean mIsMainProcess;
        private SharedPreferences mSharedPreferences;

        public Editor edit() {
            return new Editor(this.mContext);
        }

        private MultiProcessShared(Context context) {
            boolean z;
            if (!Utils.isMainProcess(context) || !WsChannelMultiProcessSharedProvider.sIsRegisterInMainProcess) {
                z = false;
            } else {
                z = true;
            }
            this.mIsMainProcess = z;
            Context applicationContext = context.getApplicationContext();
            this.mContext = applicationContext;
            this.mSharedPreferences = applicationContext.getApplicationContext().getSharedPreferences("wschannel_multi_process_config", 4);
            if (Logger.debug()) {
                Logger.m15178v("PushService", "MultiProcessShared create");
            }
        }

        public boolean getBoolean(String str, boolean z) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getBoolean(str, z);
                }
                return WsChannelMultiProcessSharedProvider.getBooleanValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "boolean"), null, null, null, null), z);
            } catch (Throwable unused) {
                return z;
            }
        }

        public long getLong(String str, long j) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getLong(str, j);
                }
                return WsChannelMultiProcessSharedProvider.getLongValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "long"), null, null, null, null), j);
            } catch (Throwable unused) {
                return j;
            }
        }

        public String getString(String str, String str2) {
            try {
                if (this.mIsMainProcess) {
                    return this.mSharedPreferences.getString(str, str2);
                }
                return WsChannelMultiProcessSharedProvider.getStringValue(this.mContext.getContentResolver().query(WsChannelMultiProcessSharedProvider.getContentUri(this.mContext, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }
    }

    private synchronized SharedPreferences getMultiProcessSharedPreferences() {
        int i;
        SharedPreferences sharedPreferences = this.mSharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        int i2 = Build.VERSION.SDK_INT;
        Context applicationContext = getContext().getApplicationContext();
        if (i2 >= 11) {
            i = 4;
        } else {
            i = 0;
        }
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("wschannel_multi_process_config", i);
        this.mSharedPreferences = sharedPreferences2;
        return sharedPreferences2;
    }

    public boolean onCreate() {
        if (Utils.isMainProcess(getContext())) {
            sIsRegisterInMainProcess = true;
        }
        if (sMatcher == null) {
            try {
                if (Logger.debug()) {
                    Logger.m15178v("MultiProcessSharedProvider", "init form onCreate");
                }
                init(getContext());
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    private void loadValues() {
        if (!sLoadValuesInit) {
            synchronized (this.sLoadValuesInitLock) {
                if (!sLoadValuesInit) {
                    SharedPreferences multiProcessSharedPreferences = getMultiProcessSharedPreferences();
                    if (multiProcessSharedPreferences == null) {
                        sLoadValuesInit = true;
                        return;
                    }
                    for (Map.Entry<String, ?> entry : multiProcessSharedPreferences.getAll().entrySet()) {
                        Object value = entry.getValue();
                        this.mContentValues.put(entry.getKey(), value);
                    }
                    sLoadValuesInit = true;
                }
            }
        }
    }

    public void notifyContentChanged(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    public static synchronized MultiProcessShared getMultiprocessShared(Context context) {
        MultiProcessShared multiProcessShared;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (sInstance == null) {
                sInstance = new MultiProcessShared(context);
            }
            multiProcessShared = sInstance;
        }
        return multiProcessShared;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + sShareAuthority + ".item";
    }

    private static void init(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(sShareAuthority)) {
            sShareAuthority = getProviderAuthority(context, WsChannelMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(sShareAuthority)) {
            if (Logger.debug()) {
                Logger.m15178v("MultiProcessSharedProvider", sShareAuthority);
            }
            UriMatcher uriMatcher = new UriMatcher(-1);
            sMatcher = uriMatcher;
            uriMatcher.addURI(sShareAuthority, "*/*", 65536);
            sBaseUri = Uri.parse("content://" + sShareAuthority);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    private Runnable createNotifyRunnable(final String str, final String str2) {
        return new Runnable() {
            /* class com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.RunnableC36381 */

            public void run() {
                WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider = WsChannelMultiProcessSharedProvider.this;
                wsChannelMultiProcessSharedProvider.notifyContentChanged(WsChannelMultiProcessSharedProvider.getContentUri(wsChannelMultiProcessSharedProvider.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            sShareAuthority = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getBooleanValue(android.database.Cursor r1, boolean r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0013
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x0019 }
            if (r2 <= 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r1 == 0) goto L_0x001c
        L_0x0015:
            r1.close()     // Catch:{ Exception -> 0x001c }
            goto L_0x001c
        L_0x0019:
            if (r1 == 0) goto L_0x001c
            goto L_0x0015
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getBooleanValue(android.database.Cursor, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r1 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getLongValue(android.database.Cursor r1, long r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            long r2 = r1.getLong(r0)     // Catch:{ all -> 0x0014 }
        L_0x000e:
            if (r1 == 0) goto L_0x0017
        L_0x0010:
            r1.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0017
        L_0x0014:
            if (r1 == 0) goto L_0x0017
            goto L_0x0010
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getLongValue(android.database.Cursor, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r1 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStringValue(android.database.Cursor r1, java.lang.String r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            java.lang.String r2 = r1.getString(r0)     // Catch:{ all -> 0x0014 }
        L_0x000e:
            if (r1 == 0) goto L_0x0017
        L_0x0010:
            r1.close()     // Catch:{ Exception -> 0x0017 }
            goto L_0x0017
        L_0x0014:
            if (r1 == 0) goto L_0x0017
            goto L_0x0010
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.getStringValue(android.database.Cursor, java.lang.String):java.lang.String");
    }

    public static String getProviderAuthority(Context context, String str) {
        if (context != null && !StringUtils.isEmpty(str)) {
            try {
                ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
                for (ProviderInfo providerInfo : providerInfoArr) {
                    if (str.equals(providerInfo.name)) {
                        return providerInfo.authority;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x001c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public static final synchronized Uri getContentUri(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (sBaseUri == null) {
                try {
                    if (Logger.debug()) {
                        Logger.m15167d("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    init(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            build = sBaseUri.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (sMatcher.match(uri) == 65536) {
            try {
                getMultiProcessSharedPreferences().edit().clear().commit();
                this.mContentValues.clear();
                notifyContentChanged(getContentUri(getContext(), "key", ShareHitPoint.f121869d));
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        if (sMatcher.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = getMultiProcessSharedPreferences().getAll();
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor2.newRow();
                            String str3 = "string";
                            if (!(value instanceof String)) {
                                if (value instanceof Boolean) {
                                    str3 = "boolean";
                                    if (((Boolean) value).booleanValue()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    value = Integer.valueOf(i);
                                } else if (value instanceof Integer) {
                                    str3 = "integer";
                                } else if (value instanceof Long) {
                                    str3 = "long";
                                } else if (value instanceof Float) {
                                    str3 = "float";
                                }
                            }
                            newRow.add(key);
                            newRow.add(value);
                            newRow.add(str3);
                        }
                        return matrixCursor2;
                    } catch (Exception unused) {
                        matrixCursor = matrixCursor2;
                        return matrixCursor;
                    }
                } else {
                    String str4 = uri.getPathSegments().get(0);
                    loadValues();
                    if (!this.mContentValues.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.mContentValues.get(str4);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        obj = Integer.valueOf(i2);
                    }
                    if (Logger.debug()) {
                        Logger.m15178v("PushService", "MultiProcessShareProvider reallly get key = " + str4 + " value = " + obj.toString());
                    }
                    newRow2.add(obj);
                    return matrixCursor3;
                }
            } catch (Exception unused2) {
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }
}
