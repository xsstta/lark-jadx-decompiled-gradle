package com.ss.ttvideoengine.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static DBHelper mInstance;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private DBHelper(Context context) {
        super(context, "fangqing.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static DBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (DBHelper.class) {
                if (mInstance == null) {
                    mInstance = new DBHelper(context);
                }
            }
        }
        return mInstance;
    }
}
