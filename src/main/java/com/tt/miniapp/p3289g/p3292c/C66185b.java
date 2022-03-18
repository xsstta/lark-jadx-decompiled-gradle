package com.tt.miniapp.p3289g.p3292c;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.miniapp.g.c.b */
public class C66185b extends SQLiteOpenHelper {
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m259156a(sQLiteDatabase);
    }

    public C66185b(Context context) {
        super(context, "DB_NAME_USAGE_RECORD", (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* renamed from: a */
    private void m259156a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(String.format("create table %s(_id integer primary key autoincrement,appID text,startTime long,duration long,scene text,subScene text);", "TB_USAGE_RECODR"));
        } catch (SQLException e) {
            AppBrandLogger.m52829e("UsageRecordDbOpenHelper", e);
        }
    }

    /* renamed from: b */
    private void m259157b(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(String.format("create table %s(_id integer primary key autoincrement,appID text,startTime long,duration long,scene text,subScene text);", "TB_TEMP_USAGE_RECODR"));
            sQLiteDatabase.execSQL(String.format("insert into %s select * from %s;", "TB_TEMP_USAGE_RECODR", "TB_USAGE_RECODR"));
            sQLiteDatabase.execSQL(String.format("drop table if exists %s;", "TB_USAGE_RECODR"));
            sQLiteDatabase.execSQL(String.format("alter table %s rename to %s;", "TB_TEMP_USAGE_RECODR", "TB_USAGE_RECODR"));
        } catch (SQLException e) {
            AppBrandLogger.m52829e("UsageRecordDbOpenHelper", e);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < i2 && 2 == i2 && i == 1) {
            m259157b(sQLiteDatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            sQLiteDatabase.execSQL(String.format("drop table if exists %s;", "TB_USAGE_RECODR"));
            m259156a(sQLiteDatabase);
        }
    }
}
