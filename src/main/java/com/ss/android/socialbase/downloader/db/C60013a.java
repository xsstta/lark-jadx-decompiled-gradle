package com.ss.android.socialbase.downloader.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import java.io.File;

/* renamed from: com.ss.android.socialbase.downloader.db.a */
public class C60013a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C60013a f149638a;

    /* renamed from: b */
    private boolean f149639b = false;

    private C60013a() {
        super(C60046b.m232945G(), "downloader.db", (SQLiteDatabase.CursorFactory) null, 13);
    }

    /* renamed from: a */
    public static C60013a m232878a() {
        if (f149638a == null) {
            synchronized (C60013a.class) {
                if (f149638a == null) {
                    f149638a = new C60013a();
                }
            }
        }
        return f149638a;
    }

    public SQLiteDatabase getReadableDatabase() {
        Context G = C60046b.m232945G();
        if (this.f149639b || G == null) {
            return super.getReadableDatabase();
        }
        try {
            File file = new File("/data/data/" + G.getPackageName() + "/database/main/");
            if (!file.exists()) {
                file.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.f149639b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.getReadableDatabase();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloader( _id INTEGER PRIMARY KEY, url TEXT, savePath TEXT, tempPath TEXT, name TEXT, chunkCount INTEGER, status INTEGER, curBytes INTEGER, totalBytes INTEGER, eTag TEXT, onlyWifi INTEGER, force INTEGER, retryCount INTEGER, extra TEXT, mimeType TEXT, title TEXT, notificationEnable INTEGER, notificationVisibility INTEGER, isFirstDownload INTEGER, isFirstSuccess INTEGER, needHttpsToHttpRetry INTEGER, downloadTime INTEGER, packageName TEXT, md5 TEXT, retryDelay INTEGER, curRetryTime INTEGER, retryDelayStatus INTEGER, defaultHttpServiceBackUp INTEGER, chunkRunnableReuse INTEGER, retryDelayTimeArray TEXT, chunkDowngradeRetry INTEGER, backUpUrlsStr TEXT, backUpUrlRetryCount INTEGER, realDownloadTime INTEGER, retryScheduleMinutes INTEGER, independentProcess INTEGER, auxiliaryJsonobjectString TEXT, iconUrl TEXT, appVersionCode INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS downloadChunk( _id INTEGER, chunkIndex INTEGER, startOffset INTEGER, curOffset INTEGER, endOffset INTEGER, chunkContentLen INTEGER, hostChunkIndex INTEGER )");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C59990a.m232836a()) {
            C59990a.m232833a("onDowngrade");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD chunkContentLen INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloadChunk ADD hostChunkIndex INTEGER");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
                break;
            case HwBuildEx.VersionCodes.EMUI_5_1:
                break;
            default:
                return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
    }
}
