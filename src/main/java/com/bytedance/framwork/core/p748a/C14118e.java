package com.bytedance.framwork.core.p748a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdklib.C14125a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.framwork.core.a.e */
public class C14118e {

    /* renamed from: a */
    static final String[] f37098a = {"_id", "value", ShareHitPoint.f121869d, "timestamp", "retry_count", "retry_time"};

    /* renamed from: b */
    private static C14118e f37099b;

    /* renamed from: c */
    private SQLiteDatabase f37100c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo51885a() {
        SQLiteDatabase sQLiteDatabase = this.f37100c;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        C14117d.m57119a("db not establish and open");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo51887b() {
        if (mo51885a()) {
            try {
                this.f37100c.execSQL("DROP TABLE IF EXISTS queue");
                this.f37100c.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            } catch (Exception e) {
                C14117d.m57119a("recreateTableQueue db exception " + e);
            }
        }
    }

    /* renamed from: a */
    static void m57127a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C14118e(Context context) {
        if (context != null) {
            try {
                this.f37100c = C14125a.m57149a(context).getWritableDatabase();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static C14118e m57126a(Context context) {
        if (f37099b == null) {
            synchronized (C14118e.class) {
                if (f37099b == null) {
                    f37099b = new C14118e(context);
                }
            }
        }
        return f37099b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo51881a(String str) {
        long j = 0;
        if (!mo51885a()) {
            return 0;
        }
        Cursor cursor = null;
        String str2 = "select count(*) from queue";
        try {
            if (!TextUtils.isEmpty(str)) {
                str2 = str2 + " " + str;
            }
            cursor = this.f37100c.rawQuery(str2, null);
            if (cursor.moveToNext()) {
                j = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        m57127a(cursor);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.bytedance.framwork.core.a.b] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.bytedance.framwork.core.a.b] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r1 = r12;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0026] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bytedance.framwork.core.p748a.C14113b mo51883a(long r12) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p748a.C14118e.mo51883a(long):com.bytedance.framwork.core.a.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized long mo51882a(String str, byte[] bArr) {
        if (mo51885a() && bArr != null) {
            if (bArr.length > 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", bArr);
                contentValues.put(ShareHitPoint.f121869d, str);
                contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("retry_count", (Integer) 0);
                contentValues.put("retry_time", (Long) 0L);
                return this.f37100c.insert("queue", null, contentValues);
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo51884a(String str, int i, long j) {
        String[] strArr;
        String str2;
        if (mo51885a()) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (TextUtils.isEmpty(str)) {
                str2 = "timestamp <= ? ";
                strArr = new String[]{String.valueOf(currentTimeMillis)};
            } else {
                String[] strArr2 = {String.valueOf(currentTimeMillis), str};
                str2 = "(timestamp <= ? OR retry_count > " + i + ") and " + ShareHitPoint.f121869d + " = ?";
                strArr = strArr2;
            }
            try {
                this.f37100c.delete("queue", str2, strArr);
            } catch (Exception e) {
                C14117d.m57119a("delete expire log error:" + e);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean mo51886a(long j, boolean z, long j2, int i) {
        if (mo51885a()) {
            if (j > 0) {
                boolean z2 = true;
                String[] strArr = {String.valueOf(j)};
                if (!z) {
                    Cursor cursor = null;
                    try {
                        cursor = this.f37100c.query("queue", new String[]{"timestamp", "retry_count"}, "_id = ?", strArr, null, null, null);
                        if (!cursor.moveToNext()) {
                            m57127a(cursor);
                            return false;
                        }
                        long j3 = cursor.getLong(0);
                        int i2 = cursor.getInt(1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - j3 >= j2 || i2 >= i) {
                            m57127a(cursor);
                        } else {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("retry_count", Integer.valueOf(i2 + 1));
                            contentValues.put("retry_time", Long.valueOf(currentTimeMillis));
                            this.f37100c.update("queue", contentValues, "_id = ?", strArr);
                            m57127a(cursor);
                            return true;
                        }
                    } catch (Exception e) {
                        C14117d.m57119a("onLogSent exception: " + e);
                        m57127a(cursor);
                        z2 = false;
                    } catch (Throwable th) {
                        m57127a(cursor);
                        throw th;
                    }
                }
                if (!z2) {
                    return false;
                }
                try {
                    this.f37100c.delete("queue", "_id = ?", strArr);
                } catch (Throwable unused) {
                }
                C14117d.m57119a("delete app_log: " + j);
                return false;
            }
        }
        return false;
    }
}
