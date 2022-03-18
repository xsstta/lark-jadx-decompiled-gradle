package com.bytedance.framwork.core.sdklib;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.framwork.core.sdkmonitor.C14178h;

/* renamed from: com.bytedance.framwork.core.sdklib.a */
public class C14125a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C14125a f37117a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, aid Integer, type VARCHAR, type2 VARCHAR, time Integer, data TEXT, data2 TEXT, data3 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C14125a m57149a(Context context) {
        if (f37117a == null) {
            synchronized (C14125a.class) {
                if (f37117a == null) {
                    String a = C14178h.m57269a(context);
                    f37117a = new C14125a(context, a + "sdkmon_v2.db");
                }
            }
        }
        return f37117a;
    }

    public C14125a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
