package com.tt.miniapp.p3289g.p3291b;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.miniapp.g.b.b */
public class C66183b extends SQLiteOpenHelper {
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m259152a(sQLiteDatabase);
    }

    public C66183b(Context context) {
        super(context, "DB_NAME_RECENT_APPS", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    private void m259152a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(String.format("create table %s(appID text,appName text, ttid text,icon text,type integer,orientation integer,mark integer,minJssdk text,schema text,state integer,summary text,timestamp Long,UNIQUE(appID));", "TB_RECENT_APPS"));
        } catch (SQLException e) {
            AppBrandLogger.m52829e("RecentAppsDbOpenHelper", e);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            sQLiteDatabase.execSQL(String.format("drop table if exists %s;", "TB_RECENT_APPS"));
        }
    }
}
