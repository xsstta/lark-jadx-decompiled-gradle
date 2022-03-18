package com.ss.ttvideoengine.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class KVDBHelper extends SQLiteOpenHelper {
    private static Integer Version = 1;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public KVDBHelper(Context context, String str) {
        this(context, str, Version.intValue());
    }

    public KVDBHelper(Context context, String str, int i) {
        this(context, str, null, i);
    }

    public KVDBHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }
}
