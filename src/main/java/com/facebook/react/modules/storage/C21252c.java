package com.facebook.react.modules.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.facebook.react.modules.storage.c */
public class C21252c extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C21252c f51769a;

    /* renamed from: b */
    private Context f51770b;

    /* renamed from: c */
    private SQLiteDatabase f51771c;

    /* renamed from: d */
    private long f51772d = 6291456;

    /* renamed from: b */
    public synchronized SQLiteDatabase mo72105b() {
        mo72104a();
        return this.f51771c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo72107d() {
        mo72105b().delete("catalystLocalStorage", null, null);
    }

    /* renamed from: e */
    private synchronized boolean m77044e() {
        m77045f();
        return this.f51770b.deleteDatabase("RKStorage");
    }

    /* renamed from: f */
    private synchronized void m77045f() {
        SQLiteDatabase sQLiteDatabase = this.f51771c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f51771c.close();
            this.f51771c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo72104a() {
        SQLiteDatabase sQLiteDatabase = this.f51771c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e = null;
        int i = 0;
        while (true) {
            if (i < 2) {
                if (i <= 0) {
                    break;
                }
                try {
                    m77044e();
                    break;
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                    i++;
                }
            } else {
                break;
            }
        }
        this.f51771c = getWritableDatabase();
        SQLiteDatabase sQLiteDatabase2 = this.f51771c;
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.setMaximumSize(this.f51772d);
            return true;
        }
        throw e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        throw new java.lang.RuntimeException("Clearing and deleting database RKStorage failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (m77044e() != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        com.facebook.common.logging.FLog.m76562d("ReactNative", "Deleted Local Database RKStorage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo72106c() throws java.lang.RuntimeException {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.mo72107d()     // Catch:{ Exception -> 0x0012 }
            r2.m77045f()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Cleaned RKStorage"
            com.facebook.common.logging.FLog.m76562d(r0, r1)     // Catch:{ Exception -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            goto L_0x0029
        L_0x0012:
            boolean r0 = r2.m77044e()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Deleted Local Database RKStorage"
            com.facebook.common.logging.FLog.m76562d(r0, r1)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            return
        L_0x0021:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Clearing and deleting database RKStorage failed"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.storage.C21252c.mo72106c():void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    private C21252c(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f51770b = context;
    }

    /* renamed from: a */
    public static C21252c m77043a(Context context) {
        if (f51769a == null) {
            f51769a = new C21252c(context.getApplicationContext());
        }
        return f51769a;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m77044e();
            onCreate(sQLiteDatabase);
        }
    }
}
