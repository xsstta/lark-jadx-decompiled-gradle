package com.ss.android.lark.audit.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.lark.audit.db.a */
public class C29312a extends SQLiteOpenHelper {

    /* renamed from: a */
    private List<String> f73358a;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (String str : this.f73358a) {
            Log.m165389i("WsDB", "create table: " + str);
            sQLiteDatabase.execSQL("create table if not exists " + str + " ( " + "time" + " long primary key, " + Constants.ScionAnalytics.MessageType.DATA_MESSAGE + " TEXT )");
        }
    }

    public C29312a(Context context, List<String> list) {
        super(context, "audit_sdk", (SQLiteDatabase.CursorFactory) null, 1);
        this.f73358a = list;
    }
}
