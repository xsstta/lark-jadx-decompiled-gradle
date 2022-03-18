package com.ss.android.lark.platform.network.ttnet;

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

public class MultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f128883a;

    /* renamed from: b */
    public static Uri f128884b;

    /* renamed from: c */
    private static UriMatcher f128885c;

    /* renamed from: f */
    private static C51874b f128886f;

    /* renamed from: d */
    private SharedPreferences f128887d;

    /* renamed from: e */
    private Map<String, Object> f128888e = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.platform.network.ttnet.MultiProcessSharedProvider$a */
    public static class C51873a {

        /* renamed from: a */
        Context f128889a;

        /* renamed from: b */
        private ContentValues f128890b;

        /* renamed from: b */
        public synchronized void mo178049b() {
            mo178048a();
        }

        /* renamed from: a */
        public synchronized void mo178048a() {
            try {
                this.f128889a.getContentResolver().insert(MultiProcessSharedProvider.m201161a(this.f128889a, "key", ShareHitPoint.f121869d), this.f128890b);
            } catch (Throwable unused) {
            }
        }

        private C51873a(Context context) {
            this.f128890b = new ContentValues();
            this.f128889a = context.getApplicationContext();
        }

        /* renamed from: a */
        public C51873a mo178046a(String str, String str2) {
            this.f128890b.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public C51873a mo178043a(String str, float f) {
            this.f128890b.put(str, Float.valueOf(f));
            return this;
        }

        /* renamed from: a */
        public C51873a mo178044a(String str, int i) {
            this.f128890b.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: a */
        public C51873a mo178045a(String str, long j) {
            this.f128890b.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: a */
        public C51873a mo178047a(String str, boolean z) {
            this.f128890b.put(str, Boolean.valueOf(z));
            return this;
        }
    }

    /* renamed from: a */
    private synchronized SharedPreferences m201160a() {
        int i;
        SharedPreferences sharedPreferences = this.f128887d;
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
        this.f128887d = sharedPreferences2;
        return sharedPreferences2;
    }

    /* renamed from: b */
    private void m201166b() {
        SharedPreferences a = m201160a();
        if (a != null) {
            for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                Object value = entry.getValue();
                this.f128888e.put(entry.getKey(), value);
            }
        }
    }

    public boolean onCreate() {
        if (f128885c != null) {
            return true;
        }
        try {
            if (Logger.debug()) {
                Logger.m15167d("MultiProcessSharedProvider", "init form onCreate");
            }
            m201167c(getContext());
            m201166b();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static C51873a m201162a(Context context) {
        return new C51873a(context);
    }

    /* renamed from: a */
    private void m201164a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    /* renamed from: com.ss.android.lark.platform.network.ttnet.MultiProcessSharedProvider$b */
    public static class C51874b {

        /* renamed from: a */
        private Context f128891a;

        private C51874b(Context context) {
            this.f128891a = context.getApplicationContext();
            if (Logger.debug()) {
                Logger.m15167d("PushService", "MultiProcessShared create");
            }
        }

        /* renamed from: a */
        public int mo178050a(String str, int i) {
            try {
                return MultiProcessSharedProvider.m201159a(this.f128891a.getContentResolver().query(MultiProcessSharedProvider.m201161a(this.f128891a, str, "integer"), null, null, null, null), i);
            } catch (Throwable unused) {
                return i;
            }
        }

        /* renamed from: a */
        public String mo178051a(String str, String str2) {
            try {
                return MultiProcessSharedProvider.m201163a(this.f128891a.getContentResolver().query(MultiProcessSharedProvider.m201161a(this.f128891a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C51874b m201165b(Context context) {
        C51874b bVar;
        synchronized (MultiProcessSharedProvider.class) {
            if (f128886f == null) {
                f128886f = new C51874b(context);
            }
            bVar = f128886f;
        }
        return bVar;
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/vnd." + f128883a + ".item";
    }

    /* renamed from: c */
    private static void m201167c(Context context) throws IllegalStateException {
        String b = C28446a.m104271b(context, MultiProcessSharedProvider.class.getName());
        f128883a = b;
        if (!TextUtils.isEmpty(b)) {
            if (Logger.debug()) {
                Logger.m15167d("MultiProcessSharedProvider", f128883a);
            }
            UriMatcher uriMatcher = new UriMatcher(-1);
            f128885c = uriMatcher;
            uriMatcher.addURI(f128883a, "*/*", 65536);
            f128884b = Uri.parse("content://" + f128883a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m201159a(android.database.Cursor r1, int r2) {
        /*
            if (r1 != 0) goto L_0x0003
            return r2
        L_0x0003:
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x000e
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x0014 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.network.ttnet.MultiProcessSharedProvider.m201159a(android.database.Cursor, int):int");
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m201163a(android.database.Cursor r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.network.ttnet.MultiProcessSharedProvider.m201163a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r10, android.content.ContentValues r11) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.network.ttnet.MultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    /* renamed from: a */
    public static final synchronized Uri m201161a(Context context, String str, String str2) {
        Uri build;
        synchronized (MultiProcessSharedProvider.class) {
            if (f128884b == null) {
                try {
                    if (Logger.debug()) {
                        Logger.m15167d("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    m201167c(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            build = f128884b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (f128885c.match(uri) == 65536) {
            try {
                m201160a().edit().clear().commit();
                this.f128888e.clear();
                m201164a(m201161a(getContext(), "key", ShareHitPoint.f121869d));
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
        if (f128885c.match(uri) == 65536) {
            MatrixCursor matrixCursor = null;
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m201160a().getAll();
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
                    if (!this.f128888e.containsKey(str4)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    Object obj = this.f128888e.get(str4);
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
