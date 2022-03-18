package com.tt.miniapp.p3289g.p3290a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.tt.miniapp.g.a.a */
public class C66181a {

    /* renamed from: a */
    protected SQLiteOpenHelper f167063a;

    /* renamed from: b */
    protected SQLiteDatabase f167064b;

    /* renamed from: c */
    protected Cursor f167065c;

    /* renamed from: a */
    public void mo231507a() {
        SQLiteDatabase writableDatabase = this.f167063a.getWritableDatabase();
        this.f167064b = writableDatabase;
        writableDatabase.beginTransaction();
    }

    /* renamed from: b */
    public void mo231508b() {
        this.f167064b.setTransactionSuccessful();
        this.f167064b.endTransaction();
        this.f167064b.close();
    }

    /* renamed from: c */
    public void mo231509c() {
        Cursor cursor = this.f167065c;
        if (cursor != null) {
            cursor.close();
            this.f167065c = null;
        }
    }

    public C66181a(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f167063a = sQLiteOpenHelper;
    }
}
