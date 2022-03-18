package com.ss.ttvideoengine.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

public class VideoModelDBManager {
    private static int mCacheSize = 200;
    private static SQLiteDatabase mDB;
    private static VideoModelDBManager mInstance;

    public static class CacheInfo {
        public long time;
        public String vid;
        public String videoModelStr;
    }

    public static void clear() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = mDB;
        if (sQLiteDatabase2 != null) {
            try {
                sQLiteDatabase2.beginTransaction();
                try {
                    mDB.execSQL(String.format("DELETE FROM %s ", "videomodel"));
                    mDB.setTransactionSuccessful();
                    TTVideoEngineLog.m256505i("VideoModelDBManager", "all cleared");
                    sQLiteDatabase = mDB;
                } catch (Exception e) {
                    TTVideoEngineLog.m256501d(e);
                    sQLiteDatabase = mDB;
                } catch (Throwable th) {
                    mDB.endTransaction();
                    throw th;
                }
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                TTVideoEngineLog.m256501d(e2);
            }
        }
    }

    public static int count() {
        if (mDB == null) {
            return -1;
        }
        int i = 0;
        try {
            Cursor rawQuery = mDB.rawQuery(String.format("SELECT COUNT(*) FROM %s", "videomodel"), null);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
        }
        TTVideoEngineLog.m256500d("VideoModelDBManager", "count:" + i);
        return i;
    }

    public static VideoModelDBManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (VideoModelDBManager.class) {
                if (mInstance == null) {
                    mInstance = new VideoModelDBManager(context);
                }
            }
        }
        return mInstance;
    }

    private VideoModelDBManager(Context context) {
        DBHelper instance;
        if (context != null && (instance = DBHelper.getInstance(context)) != null) {
            try {
                SQLiteDatabase writableDatabase = instance.getWritableDatabase();
                mDB = writableDatabase;
                if (writableDatabase != null) {
                    mDB.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", "videomodel"));
                }
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
            }
        }
    }

    public static void delete(String str) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = mDB;
        if (sQLiteDatabase2 != null) {
            try {
                sQLiteDatabase2.beginTransaction();
                try {
                    mDB.execSQL(String.format("DELETE FROM %s WHERE vid='%s'", "videomodel", str));
                    mDB.setTransactionSuccessful();
                    sQLiteDatabase = mDB;
                } catch (Exception e) {
                    TTVideoEngineLog.m256501d(e);
                    sQLiteDatabase = mDB;
                } catch (Throwable th) {
                    mDB.endTransaction();
                    throw th;
                }
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                TTVideoEngineLog.m256501d(e2);
            }
            TTVideoEngineLog.m256505i("VideoModelDBManager", "deleted vid:" + str);
        }
    }

    public static CacheInfo query(String str) {
        Exception e;
        CacheInfo cacheInfo = null;
        if (TextUtils.isEmpty(str) || mDB == null) {
            return null;
        }
        try {
            Cursor rawQuery = mDB.rawQuery(String.format("SELECT * FROM %s WHERE vid='%s'", "videomodel", str), null);
            CacheInfo cacheInfo2 = new CacheInfo();
            try {
                cacheInfo2.vid = str;
                if (rawQuery.moveToFirst()) {
                    cacheInfo2.videoModelStr = rawQuery.getString(rawQuery.getColumnIndex("videomodel"));
                    cacheInfo2.time = rawQuery.getLong(rawQuery.getColumnIndex("time"));
                }
                rawQuery.close();
                TTVideoEngineLog.m256500d("VideoModelDBManager", "query vid:" + str + " videomodel:" + cacheInfo2.videoModelStr);
                return cacheInfo2;
            } catch (Exception e2) {
                e = e2;
                cacheInfo = cacheInfo2;
                TTVideoEngineLog.m256501d(e);
                return cacheInfo;
            }
        } catch (Exception e3) {
            e = e3;
            TTVideoEngineLog.m256501d(e);
            return cacheInfo;
        }
    }

    public static void insert(String str, String str2) {
        int count;
        SQLiteDatabase sQLiteDatabase;
        if (mDB != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("VideoModelDBManager", "insert vid:" + str + " videomodel:" + str2);
            boolean z = true;
            try {
                mDB.beginTransaction();
                try {
                    mDB.execSQL(String.format("REPLACE INTO %s VALUES ('%s','%s',%d)", "videomodel", str, str2, Long.valueOf(System.currentTimeMillis())));
                    mDB.execSQL(String.format("DELETE FROM %s WHERE vid IN (SELECT vid FROM %s ORDER BY time DESC LIMIT -1 OFFSET %d)", "videomodel", "videomodel", Integer.valueOf(mCacheSize)));
                    mDB.setTransactionSuccessful();
                    sQLiteDatabase = mDB;
                } catch (SQLException e) {
                    TTVideoEngineLog.m256501d(e);
                    mDB.endTransaction();
                } catch (IllegalStateException e2) {
                    TTVideoEngineLog.m256501d(e2);
                    sQLiteDatabase = mDB;
                } catch (Throwable th) {
                    mDB.endTransaction();
                    throw th;
                }
                sQLiteDatabase.endTransaction();
                z = false;
            } catch (Exception e3) {
                TTVideoEngineLog.m256501d(e3);
            }
            if (z && (count = count()) > 0) {
                int i = count - 10;
                mCacheSize = i;
                if (i < 20) {
                    mCacheSize = 20;
                }
            }
        }
    }
}
