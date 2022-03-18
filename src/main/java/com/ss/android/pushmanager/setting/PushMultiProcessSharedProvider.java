package com.ss.android.pushmanager.setting;

import android.app.Application;
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
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.utils.C20552c;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.message.AppProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PushMultiProcessSharedProvider extends ContentProvider {

    /* renamed from: a */
    public static String f149485a;

    /* renamed from: b */
    public static Uri f149486b;

    /* renamed from: c */
    private static UriMatcher f149487c;

    /* renamed from: h */
    private static C59969b f149488h;

    /* renamed from: d */
    private SharedPreferences f149489d;

    /* renamed from: e */
    private Map<String, Object> f149490e = new ConcurrentHashMap();

    /* renamed from: f */
    private volatile boolean f149491f = false;

    /* renamed from: g */
    private final Object f149492g = new Object();

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b */
    public static class C59969b {

        /* renamed from: a */
        private Context f149498a;

        /* renamed from: b */
        private boolean f149499b;

        /* renamed from: c */
        private SharedPreferences f149500c;

        /* renamed from: a */
        public C59968a mo204196a() {
            return new C59968a(this.f149498a);
        }

        private C59969b(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.f149498a = applicationContext;
            this.f149500c = applicationContext.getApplicationContext().getSharedPreferences("push_multi_process_config", 4);
            if (C20552c.m74848a()) {
                C20552c.m74845a("PushService", "MultiProcessShared create");
            }
        }

        /* renamed from: a */
        public String mo204197a(String str, String str2) {
            try {
                if (this.f149499b) {
                    return this.f149500c.getString(str, str2);
                }
                return PushMultiProcessSharedProvider.m232713a(this.f149498a.getContentResolver().query(PushMultiProcessSharedProvider.m232709a(this.f149498a, str, "string"), null, null, null, null), str2);
            } catch (Throwable unused) {
                return str2;
            }
        }
    }

    /* renamed from: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a */
    public static class C59968a {

        /* renamed from: a */
        Context f149496a;

        /* renamed from: b */
        private ContentValues f149497b;

        /* renamed from: a */
        public synchronized void mo204195a() {
            try {
                this.f149496a.getContentResolver().insert(PushMultiProcessSharedProvider.m232709a(this.f149496a, "key", ShareHitPoint.f121869d), this.f149497b);
            } catch (Throwable unused) {
            }
        }

        private C59968a(Context context) {
            this.f149497b = new ContentValues();
            this.f149496a = context.getApplicationContext();
        }

        /* renamed from: a */
        public C59968a mo204194a(String str, String str2) {
            this.f149497b.put(str, str2);
            return this;
        }
    }

    /* renamed from: b */
    private static boolean m232715b() {
        if (!TextUtils.isEmpty(f149485a) && f149487c != null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m232716c() {
        if (!this.f149491f) {
            synchronized (this.f149492g) {
                if (!this.f149491f) {
                    m232717d();
                    this.f149491f = true;
                }
            }
        }
    }

    /* renamed from: a */
    private synchronized SharedPreferences m232708a() {
        int i;
        SharedPreferences sharedPreferences = this.f149489d;
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
        SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences("push_multi_process_config", i);
        this.f149489d = sharedPreferences2;
        return sharedPreferences2;
    }

    /* renamed from: d */
    private void m232717d() {
        SharedPreferences a = m232708a();
        if (a != null) {
            for (Map.Entry<String, ?> entry : a.getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(key == null || value == null)) {
                    this.f149490e.put(key, value);
                }
            }
        }
    }

    public boolean onCreate() {
        AppProvider.initApp((Application) getContext().getApplicationContext());
        if (f149487c != null) {
            return true;
        }
        try {
            if (C20552c.m74848a()) {
                C20552c.m74845a("MultiProcessSharedProvider", "init form onCreate");
            }
            m232714b(getContext());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo204185a(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    /* renamed from: a */
    public static synchronized C59969b m232710a(Context context) {
        C59969b bVar;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f149488h == null) {
                f149488h = new C59969b(context);
            }
            bVar = f149488h;
        }
        return bVar;
    }

    public String getType(Uri uri) {
        m232716c();
        return "vnd.android.cursor.item/vnd." + f149485a + ".item";
    }

    /* renamed from: b */
    private static void m232714b(Context context) throws IllegalStateException {
        if (TextUtils.isEmpty(f149485a)) {
            f149485a = m232712a(context, PushMultiProcessSharedProvider.class.getName());
        }
        if (!TextUtils.isEmpty(f149485a)) {
            if (C20552c.m74848a()) {
                C20552c.m74845a("MultiProcessSharedProvider", f149485a);
            }
            UriMatcher uriMatcher = new UriMatcher(-1);
            f149487c = uriMatcher;
            uriMatcher.addURI(f149485a, "*/*", 65536);
            f149486b = Uri.parse("content://" + f149485a);
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    /* renamed from: a */
    private Runnable m232711a(final String str, final String str2) {
        return new Runnable() {
            /* class com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.RunnableC599671 */

            public void run() {
                PushMultiProcessSharedProvider pushMultiProcessSharedProvider = PushMultiProcessSharedProvider.this;
                pushMultiProcessSharedProvider.mo204185a(PushMultiProcessSharedProvider.m232709a(pushMultiProcessSharedProvider.getContext(), str, str2));
            }
        };
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            f149485a = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    public static String m232712a(Context context, String str) {
        if (context == null || StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            ProviderInfo[] providerInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 8).providers;
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (str.equals(providerInfo.name)) {
                    return providerInfo.authority;
                }
            }
        } catch (Exception unused) {
        }
        return context.getPackageName() + ".push.SHARE_PROVIDER_AUTHORITY";
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
    public static java.lang.String m232713a(android.database.Cursor r1, java.lang.String r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m232713a(android.database.Cursor, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0023 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri insert(android.net.Uri r11, android.content.ContentValues r12) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        m232716c();
        if (m232715b() || f149487c.match(uri) == 65536) {
            return 0;
        }
        throw new IllegalArgumentException("Unsupported uri " + uri);
    }

    /* renamed from: a */
    public static final synchronized Uri m232709a(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (f149486b == null) {
                try {
                    if (C20552c.m74848a()) {
                        C20552c.m74845a("MultiProcessSharedProvider", "init form getContentUri");
                    }
                    m232714b(context);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            build = f149486b.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Object obj;
        boolean z;
        int i;
        m232716c();
        MatrixCursor matrixCursor = null;
        if (m232715b()) {
            return null;
        }
        if (f149487c.match(uri) == 65536) {
            try {
                int i2 = 1;
                if ("all".equals(uri.getPathSegments().get(1))) {
                    Map<String, ?> all = m232708a().getAll();
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
                    boolean equal = StringUtils.equal(str4, "current_app_state");
                    boolean equal2 = StringUtils.equal(str4, "current_app_foreground");
                    if (!(this.f149490e.containsKey(str4) || equal || equal2)) {
                        return null;
                    }
                    MatrixCursor matrixCursor3 = new MatrixCursor(new String[]{str4});
                    if (equal) {
                        try {
                            obj = Boolean.valueOf(ActivityLifecycleObserver.getIns().isApplicationActive());
                        } catch (Exception unused2) {
                            matrixCursor = matrixCursor3;
                            return matrixCursor;
                        }
                    } else if (equal2) {
                        if (!ActivityLifecycleObserver.getIns().isBackGround()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        obj = Boolean.valueOf(z);
                    } else {
                        obj = this.f149490e.get(str4);
                    }
                    MatrixCursor.RowBuilder newRow2 = matrixCursor3.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i2 = 0;
                        }
                        obj = Integer.valueOf(i2);
                    }
                    if (C20552c.m74848a()) {
                        C20552c.m74845a("PushService", "MultiProcessShareProvider reallly get key = " + str4 + " value = " + obj.toString());
                    }
                    newRow2.add(obj);
                    return matrixCursor3;
                }
            } catch (Exception unused3) {
                return matrixCursor;
            }
        } else {
            throw new IllegalArgumentException("Unsupported uri " + uri);
        }
    }
}
