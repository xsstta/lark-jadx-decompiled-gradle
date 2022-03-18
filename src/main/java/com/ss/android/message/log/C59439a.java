package com.ss.android.message.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.push.utils.C20552c;

/* renamed from: com.ss.android.message.log.a */
public class C59439a {

    /* renamed from: a */
    static final String[] f147565a = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};

    /* renamed from: b */
    private static final Object f147566b = new Object();

    /* renamed from: c */
    private static C59439a f147567c;

    /* renamed from: d */
    private SQLiteDatabase f147568d;

    /* renamed from: com.ss.android.message.log.a$a */
    private static class C59440a extends SQLiteOpenHelper {
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C59440a(Context context) {
            super(context, "ss_push_log.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
            } catch (Exception e) {
                C20552c.m74850b("PushLog", "create db exception " + e);
            }
        }
    }

    private C59439a(Context context) {
        this.f147568d = new C59440a(context).getWritableDatabase();
    }

    /* renamed from: a */
    protected static void m230754a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static C59439a m230753a(Context context) {
        synchronized (f147566b) {
            if (f147567c == null) {
                f147567c = new C59439a(context.getApplicationContext());
            }
        }
        return f147567c;
    }

    /* renamed from: a */
    public synchronized boolean mo202713a(long j) {
        SQLiteDatabase sQLiteDatabase = this.f147568d;
        boolean z = false;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                if (this.f147568d.delete("event", "_id = ?", new String[]{String.valueOf(j)}) > 0) {
                    z = true;
                }
                return z;
            }
        }
        C20552c.m74845a("PushLog", "db not establish and open");
        return false;
    }

    /* renamed from: a */
    public synchronized long mo202711a(C59441b bVar) {
        SQLiteDatabase sQLiteDatabase = this.f147568d;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", bVar.f147569a);
                contentValues.put("tag", bVar.f147570b);
                if (!StringUtils.isEmpty(bVar.f147571c)) {
                    contentValues.put("label", bVar.f147571c);
                }
                contentValues.put("value", Long.valueOf(bVar.f147572d));
                contentValues.put("ext_value", Long.valueOf(bVar.f147573e));
                if (!StringUtils.isEmpty(bVar.f147574f)) {
                    contentValues.put("ext_json", bVar.f147574f);
                }
                return this.f147568d.insert("event", null, contentValues);
            }
        }
        C20552c.m74845a("PushLog", "db not establish and open");
        return -1;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fd A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ff A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.json.JSONArray mo202712a(long r21, int r23) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.C59439a.mo202712a(long, int):org.json.JSONArray");
    }
}
