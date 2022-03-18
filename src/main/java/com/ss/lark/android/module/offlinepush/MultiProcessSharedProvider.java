package com.ss.lark.android.module.offlinepush;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.p1317a.C28446a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f162446a;

    /* renamed from: b */
    public static Uri f162447b;

    /* renamed from: c */
    private static UriMatcher f162448c;

    /* renamed from: d */
    private SharedPreferences f162449d;

    /* renamed from: e */
    private Map<String, Object> f162450e = new ConcurrentHashMap();

    /* renamed from: a */
    private synchronized SharedPreferences m252712a() {
        int i;
        SharedPreferences sharedPreferences = this.f162449d;
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
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("multi_process_config", i);
        this.f162449d = sharedPreferences2;
        return sharedPreferences2;
    }

    /* renamed from: b */
    private void m252716b() {
        SharedPreferences a = m252712a();
        if (a != null) {
            for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                Object value = entry.getValue();
                this.f162450e.put(entry.getKey(), value);
            }
        }
    }

    public boolean onCreate() {
        if (f162448c != null) {
            return true;
        }
        try {
            if (Logger.debug()) {
                Logger.m15167d("MultiProcessSharedProvider", "init form onCreate");
            }
            m252714a(getContext());
            m252716b();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private void m252715a(Uri uri) {
        try {
            getContext().getContentResolver().notifyChange(uri, null);
        } catch (Exception unused) {
        }
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f162446a + ".item";
    }

    /* renamed from: a */
    private static void m252714a(Context context) throws IllegalStateException {
        String b = C28446a.m104271b(context, MultiProcessSharedProvider.class.getName());
        f162446a = b;
        if (!TextUtils.isEmpty(b)) {
            if (Logger.debug()) {
                Logger.m15167d("MultiProcessSharedProvider", f162446a);
            }
            UriMatcher uriMatcher = new UriMatcher(-1);
            f162448c = uriMatcher;
            uriMatcher.addURI(f162446a, "*/*", 65536);
            f162447b = Uri.parse("content://" + f162446a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r10, android.content.ContentValues r11) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.module.offlinepush.MultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    /* renamed from: a */
    public static final synchronized Uri m252713a(Context context, String str, String str2) {
        Uri build;
        synchronized (MultiProcessSharedProvider.class) {
            if (f162447b == null) {
                try {
                    if (Logger.debug()) {
                        Logger.m15167d("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    m252714a(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            build = f162447b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f162448c.match(uri) == 65536) {
            try {
                m252712a().edit().clear().commit();
                this.f162450e.clear();
                m252715a(m252713a(getContext(), "key", ShareHitPoint.f121869d));
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
        if (f162448c.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m252712a().getAll();
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
                    if (!this.f162450e.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f162450e.get(str4);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        obj = Integer.valueOf(i2);
                    }
                    if (Logger.debug()) {
                        Logger.m15167d("PushService", "MultiProcessShareProvider reallly get key = " + str4 + " value = " + obj.toString());
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
