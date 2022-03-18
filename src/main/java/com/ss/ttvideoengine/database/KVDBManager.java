package com.ss.ttvideoengine.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

public class KVDBManager {
    private boolean createDBSuccess;
    private SQLiteDatabase mDB;
    private KVDBHelper mHelper;
    private String mTableName;

    public boolean isCreateDBSuccess() {
        return this.createDBSuccess;
    }

    public String get(String str) {
        Exception e;
        String str2;
        if (TextUtils.isEmpty(str) || this.mDB == null) {
            TTVideoEngineLog.m256503e("KVDBManager", "open db fail");
            return null;
        }
        try {
            Cursor rawQuery = this.mDB.rawQuery(String.format("SELECT * FROM %s WHERE key='%s'", this.mTableName, str), null);
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(rawQuery.getColumnIndex("value"));
            } else {
                str2 = null;
            }
            try {
                rawQuery.close();
                TTVideoEngineLog.m256500d("KVDBManager", "get key: " + str + " value: " + str2);
                return str2;
            } catch (Exception e2) {
                e = e2;
                try {
                    TTVideoEngineLog.m256501d(e);
                    return null;
                } catch (Throwable unused) {
                    return str2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str2 = null;
            TTVideoEngineLog.m256501d(e);
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean remove(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.database.KVDBManager.remove(java.lang.String):boolean");
    }

    public KVDBManager(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256503e("KVDBManager", "context or name is invalid");
            return;
        }
        this.mTableName = str;
        KVDBHelper kVDBHelper = new KVDBHelper(context, this.mTableName);
        this.mHelper = kVDBHelper;
        if (kVDBHelper != null) {
            boolean z = true;
            try {
                SQLiteDatabase writableDatabase = kVDBHelper.getWritableDatabase();
                this.mDB = writableDatabase;
                if (writableDatabase != null) {
                    this.mDB.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(key TEXT PRIMARY KEY,value TEXT,time INTEGER)", this.mTableName));
                }
                if (this.mHelper == null) {
                    TTVideoEngineLog.m256503e("KVDBManager", "create db fail, mHelper == null, table name " + this.mTableName);
                }
                this.createDBSuccess = this.mHelper == null ? false : z;
            } catch (Throwable th) {
                if (this.mHelper == null) {
                    TTVideoEngineLog.m256503e("KVDBManager", "create db fail, mHelper == null, table name " + this.mTableName);
                }
                this.createDBSuccess = this.mHelper == null ? false : z;
                throw th;
            }
        }
    }

    public boolean save(String str, String str2) {
        if (this.mDB == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TTVideoEngineLog.m256503e("KVDBManager", "open db fail");
            return false;
        }
        TTVideoEngineLog.m256505i("KVDBManager", "save key: " + str + " value: " + str2);
        this.mDB.beginTransaction();
        try {
            this.mDB.execSQL(String.format("REPLACE INTO %s VALUES ('%s','%s',%d)", this.mTableName, str, str2, Long.valueOf(System.currentTimeMillis())));
            this.mDB.setTransactionSuccessful();
            this.mDB.endTransaction();
            return true;
        } catch (SQLException e) {
            TTVideoEngineLog.m256501d(e);
            this.mDB.endTransaction();
            return false;
        } catch (IllegalStateException e2) {
            TTVideoEngineLog.m256501d(e2);
            this.mDB.endTransaction();
            return true;
        } catch (Throwable unused) {
            this.mDB.endTransaction();
            return true;
        }
    }
}
