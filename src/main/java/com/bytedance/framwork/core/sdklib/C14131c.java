package com.bytedance.framwork.core.sdklib;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.framwork.core.sdklib.p751b.C14130a;
import com.bytedance.framwork.core.sdklib.util.C14156c;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.framwork.core.sdklib.c */
public class C14131c {

    /* renamed from: a */
    static boolean f37137a = false;

    /* renamed from: b */
    static boolean f37138b = false;

    /* renamed from: c */
    static long f37139c = 5000;

    /* renamed from: d */
    static final String[] f37140d = {"_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE};

    /* renamed from: j */
    private static C14131c f37141j;

    /* renamed from: k */
    private static String f37142k = "SELECT count(*) FROM monitor_log WHERE aid = ?";

    /* renamed from: l */
    private static String f37143l = "SELECT count(*) FROM monitor_log";

    /* renamed from: e */
    String f37144e = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    /* renamed from: f */
    private Map<String, Integer> f37145f = new HashMap(2);

    /* renamed from: g */
    private int f37146g = 0;

    /* renamed from: h */
    private Context f37147h;

    /* renamed from: i */
    private SQLiteDatabase f37148i;

    /* renamed from: a */
    public synchronized void mo51921a(String str, List<C14130a> list) {
        SQLiteDatabase sQLiteDatabase;
        if (this.f37148i != null) {
            if (!C14156c.m57242a(list)) {
                m57178b();
                this.f37148i.beginTransaction();
                try {
                    SQLiteStatement compileStatement = this.f37148i.compileStatement(this.f37144e);
                    for (C14130a aVar : list) {
                        compileStatement.bindString(1, String.valueOf(aVar.f37132b));
                        compileStatement.bindString(2, aVar.f37133c == null ? "" : aVar.f37133c);
                        compileStatement.bindString(3, aVar.f37134d == null ? "" : aVar.f37134d);
                        compileStatement.bindLong(4, aVar.f37136f);
                        compileStatement.bindString(5, aVar.f37135e == null ? "" : aVar.f37135e);
                        compileStatement.executeInsert();
                    }
                    this.f37148i.setTransactionSuccessful();
                    m57176a(str, list.size());
                    sQLiteDatabase = this.f37148i;
                } catch (Exception e) {
                    e.printStackTrace();
                    sQLiteDatabase = this.f37148i;
                } catch (Throwable th) {
                    this.f37148i.endTransaction();
                    throw th;
                }
                sQLiteDatabase.endTransaction();
            }
        }
    }

    /* renamed from: c */
    private void m57179c() {
        m57180c("psdkmon");
    }

    /* renamed from: a */
    private synchronized int m57173a() {
        SQLiteDatabase sQLiteDatabase = this.f37148i;
        int i = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f37148i.rawQuery(f37143l, null);
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m57175a((Cursor) null);
            throw th;
        }
        m57175a(cursor);
        return i;
    }

    /* renamed from: b */
    private synchronized void m57178b() {
        if (!f37138b) {
            f37138b = true;
            if (((long) m57173a()) >= f37139c) {
                mo51920a(500);
            }
        }
        if (!f37137a) {
            f37137a = true;
            m57179c();
        }
    }

    /* renamed from: a */
    protected static void m57175a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C14131c(Context context) {
        this.f37147h = context;
        this.f37148i = C14125a.m57149a(context).getWritableDatabase();
    }

    /* renamed from: a */
    public static C14131c m57174a(Context context) {
        if (f37141j == null) {
            synchronized (C14125a.class) {
                if (f37141j == null) {
                    f37141j = new C14131c(context);
                }
            }
        }
        return f37141j;
    }

    /* renamed from: b */
    private synchronized int m57177b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f37148i;
        int i = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f37148i.rawQuery(f37142k, new String[]{str});
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m57175a((Cursor) null);
            throw th;
        }
        m57175a(cursor);
        return i;
    }

    /* renamed from: c */
    private void m57180c(String str) {
        try {
            Context context = this.f37147h;
            File databasePath = context.getDatabasePath(str + ".db");
            if (databasePath.exists()) {
                databasePath.delete();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public synchronized int mo51917a(String str) {
        int i;
        if (this.f37146g <= 10) {
            if (this.f37145f.containsKey(str)) {
                i = this.f37145f.get(str).intValue();
                this.f37146g++;
            }
        }
        int b = m57177b(str);
        this.f37145f.put(str, Integer.valueOf(b));
        this.f37146g = 0;
        i = b;
        return i;
    }

    /* renamed from: a */
    public synchronized void mo51920a(long j) {
        if (this.f37148i != null && j > 0) {
            try {
                this.f37148i.execSQL(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT " + j + ")");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m57176a(String str, int i) {
        if (this.f37145f.containsKey(str) || i <= 0) {
            this.f37145f.put(str, Integer.valueOf(Math.max(0, i + this.f37145f.get(str).intValue())));
            return;
        }
        this.f37145f.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public synchronized int mo51918a(String str, long j) {
        if (this.f37148i != null) {
            if (j >= 0) {
                int delete = this.f37148i.delete("monitor_log", "aid = ? AND _id<= ? ", new String[]{str, String.valueOf(j)});
                m57176a(str, delete * -1);
                return delete;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public List<C14130a> mo51919a(int i, int i2) {
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f37148i;
            String[] strArr = f37140d;
            String[] strArr2 = {String.valueOf(i)};
            Cursor query = sQLiteDatabase.query("monitor_log", strArr, "aid= ?", strArr2, null, null, "_id ASC ", i2 + "");
            try {
                if (query.getCount() == 0) {
                    m57175a(query);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (query.moveToNext()) {
                    linkedList.add(new C14130a(query.getLong(query.getColumnIndex("_id")), query.getString(query.getColumnIndex(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))));
                }
                m57175a(query);
                return linkedList;
            } catch (Throwable unused) {
                cursor = query;
                m57175a(cursor);
                return Collections.emptyList();
            }
        } catch (Throwable unused2) {
            m57175a(cursor);
            return Collections.emptyList();
        }
    }
}
