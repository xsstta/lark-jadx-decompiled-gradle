package com.ss.android.socialbase.downloader.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.socialbase.downloader.constants.AbstractC59995a;
import com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl;
import com.ss.android.socialbase.downloader.downloader.AbstractC60068r;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class SqlDownloadCache extends ISqlDownloadCacheAidl.Stub implements AbstractC60068r {
    public static volatile SQLiteDatabase database;
    public volatile boolean cacheSynced;
    ISqlCacheLoadCompleteCallbackAidl callback;
    public C60022d chunkTableStatements;
    public C60022d downloadTableStatements;

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean ensureDownloadCacheSyncSuccess() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo onDownloadTaskStart(int i) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadChunks(int i, List<DownloadChunk> list) {
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfo(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean isDownloadCacheSyncSuccess() {
        return this.cacheSynced;
    }

    public SqlDownloadCache() {
        this(false);
    }

    private void safeBeginTransaction() {
        database.beginTransaction();
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void init() {
        init(null, null, null);
    }

    private void safeEndTransaction() {
        try {
            if (database != null && database.inTransaction()) {
                database.endTransaction();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void clearData() {
        ensureDataBaseInit();
        if (database != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600052 */

                public void run() {
                    SqlDownloadCache.this.clearDataInSubThread();
                }
            });
        }
    }

    public synchronized void clearDataInSubThread() {
        try {
            safeBeginTransaction();
            database.delete("downloader", null, null);
            database.delete("downloadChunk", null, null);
            database.setTransactionSuccessful();
        } catch (Throwable th) {
            safeEndTransaction();
            throw th;
        }
        safeEndTransaction();
    }

    public void ensureDataBaseInit() {
        if (database == null) {
            synchronized (SqlDownloadCache.class) {
                if (database == null) {
                    try {
                        database = C60013a.m232878a().getWritableDatabase();
                        this.downloadTableStatements = new C60022d(database, "downloader", AbstractC59995a.f149575a, AbstractC59995a.f149576b);
                        this.chunkTableStatements = new C60022d(database, "downloadChunk", AbstractC59995a.f149577c, AbstractC59995a.f149578d);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addSubDownloadChunk(DownloadChunk downloadChunk) {
        addDownloadChunk(downloadChunk);
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void setInitCallback(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) {
        this.callback = iSqlCacheLoadCompleteCallbackAidl;
    }

    public SqlDownloadCache(boolean z) {
        if (z) {
            this.cacheSynced = false;
            init();
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean cacheExist(int i) {
        try {
            if (getDownloadInfo(i) != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadTaskData(final int i) {
        C60046b.m232976a(new Runnable() {
            /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.AnonymousClass11 */

            public void run() {
                SqlDownloadCache.this.removeDownloadInfo(i);
                SqlDownloadCache.this.removeAllDownloadChunk(i);
            }
        });
        return true;
    }

    private void addDownloadInfo(final DownloadInfo downloadInfo) {
        ensureDataBaseInit();
        if (database != null && this.downloadTableStatements != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600129 */

                public void run() {
                    try {
                        SqlDownloadCache sqlDownloadCache = SqlDownloadCache.this;
                        sqlDownloadCache.insertDownloadInfoInner(downloadInfo, sqlDownloadCache.downloadTableStatements.mo204379a());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskIntercept(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) -7);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPrepare(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) 1);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskRetry(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void addDownloadChunk(final DownloadChunk downloadChunk) {
        ensureDataBaseInit();
        if (database != null && this.chunkTableStatements != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600085 */

                public void run() {
                    try {
                        SqlDownloadCache.this.insertDownloadChunkInner(downloadChunk, SqlDownloadCache.this.chunkTableStatements.mo204379a());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public void clearAntiHijackDirIfNeeded(List<DownloadInfo> list) {
        if (list != null) {
            try {
                for (DownloadInfo downloadInfo : list) {
                    if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                        C60161d.m233789b(downloadInfo);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void removeAllDownloadChunk(final int i) {
        ensureDataBaseInit();
        if (database != null && this.chunkTableStatements != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600074 */

                public void run() {
                    try {
                        SqlDownloadCache.this.deleteInner(i, SqlDownloadCache.this.chunkTableStatements.mo204380b());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean removeDownloadInfo(int i) {
        C60022d dVar;
        ensureDataBaseInit();
        if (!(database == null || (dVar = this.downloadTableStatements) == null)) {
            try {
                deleteInner(i, dVar.mo204380b());
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public boolean updateDownloadInfo(final DownloadInfo downloadInfo) {
        ensureDataBaseInit();
        if (downloadInfo == null || database == null) {
            return false;
        }
        C60046b.m232976a(new Runnable() {
            /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.AnonymousClass10 */

            public void run() {
                SqlDownloadCache.this.updateDownloadInfoForCurrentThread(downloadInfo);
            }
        });
        return true;
    }

    public synchronized void updateDownloadInfoForCurrentThread(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (!cacheExist(downloadInfo.getId())) {
                    addDownloadInfo(downloadInfo);
                } else {
                    C60022d dVar = this.downloadTableStatements;
                    if (dVar != null) {
                        try {
                            updateDownloadInfoInner(downloadInfo, dVar.mo204381c());
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            return;
        }
        return;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadChunk> getDownloadChunk(int i) {
        ArrayList arrayList = new ArrayList();
        ensureDataBaseInit();
        if (database != null) {
            try {
                Cursor rawQuery = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "downloadChunk", "_id"), new String[]{Integer.toString(i)});
                while (rawQuery.moveToNext()) {
                    arrayList.add(new DownloadChunk(rawQuery));
                }
                C60161d.m233767a(rawQuery);
            } catch (Throwable th) {
                C60161d.m233767a(null);
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo getDownloadInfo(int i) {
        Cursor cursor;
        Throwable th;
        ensureDataBaseInit();
        if (database != null) {
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "downloader", "_id"), new String[]{Integer.toString(i)});
                try {
                    if (cursor.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo(cursor);
                        C60161d.m233767a(cursor);
                        return downloadInfo;
                    }
                    C60161d.m233767a(cursor);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        C60161d.m233767a(cursor);
                        return null;
                    } catch (Throwable th3) {
                        C60161d.m233767a(cursor);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                th.printStackTrace();
                C60161d.m233767a(cursor);
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public List<DownloadInfo> getDownloadInfoList(String str) {
        ensureDataBaseInit();
        ArrayList arrayList = new ArrayList();
        if (database != null) {
            try {
                Cursor rawQuery = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", "downloader", "url"), new String[]{str});
                if (rawQuery.moveToNext()) {
                    arrayList.add(new DownloadInfo(rawQuery));
                }
                C60161d.m233767a(rawQuery);
            } catch (Throwable th) {
                C60161d.m233767a(null);
                throw th;
            }
        }
        return arrayList;
    }

    public void onInitFinish(SparseArray<DownloadInfo> sparseArray, SparseArray<List<DownloadChunk>> sparseArray2) {
        try {
            HashMap a = C60161d.m233753a(sparseArray);
            HashMap a2 = C60161d.m233753a(sparseArray2);
            ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl = this.callback;
            if (iSqlCacheLoadCompleteCallbackAidl != null) {
                iSqlCacheLoadCompleteCallbackAidl.callback(a, a2);
            }
        } catch (Throwable unused) {
        }
    }

    private void update(final int i, final ContentValues contentValues) {
        ensureDataBaseInit();
        if (database != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600063 */

                public void run() {
                    SqlDownloadCache.this.updateInner(i, contentValues);
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskCancel(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) -4);
        contentValues.put("curBytes", Long.valueOf(j));
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskPause(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) -2);
        contentValues.put("curBytes", Long.valueOf(j));
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskProgress(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j));
        update(i, contentValues);
        return null;
    }

    public void deleteInner(int i, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    sQLiteStatement.bindLong(1, (long) i);
                    sQLiteStatement.execute();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void insertDownloadChunkInner(DownloadChunk downloadChunk, SQLiteStatement sQLiteStatement) {
        if (downloadChunk != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadChunk.mo204999a(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void insertDownloadInfoInner(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.executeInsert();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void updateDownloadInfoInner(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo != null && sQLiteStatement != null) {
            try {
                synchronized (sQLiteStatement) {
                    downloadInfo.bindValue(sQLiteStatement);
                    sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, (long) downloadInfo.getId());
                    sQLiteStatement.execute();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskCompleted(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) -3);
        contentValues.put("curBytes", Long.valueOf(j));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskError(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) -1);
        contentValues.put("curBytes", Long.valueOf(j));
        if (j > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) {
        try {
            removeAllDownloadChunk(i);
            if (list != null) {
                for (DownloadChunk downloadChunk : list) {
                    if (downloadChunk != null) {
                        addDownloadChunk(downloadChunk);
                        if (downloadChunk.mo205014f()) {
                            for (DownloadChunk downloadChunk2 : downloadChunk.mo205015g()) {
                                addDownloadChunk(downloadChunk2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void updateInner(int i, ContentValues contentValues) {
        int i2 = 10;
        while (database.isDbLockedByCurrentThread() && i2 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        try {
            database.update("downloader", contentValues, "_id = ? ", new String[]{String.valueOf(i)});
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo updateChunkCount(int i, int i2) {
        ensureDataBaseInit();
        if (database == null) {
            return null;
        }
        int i3 = 10;
        while (database.isDbLockedByCurrentThread() && i3 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("chunkCount", Integer.valueOf(i2));
        database.update("downloader", contentValues, "_id = ? ", new String[]{Integer.toString(i)});
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.AbstractC60068r
    public void init(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<DownloadChunk>> sparseArray2, final AbstractC60014b bVar) {
        try {
            RunnableC600041 r0 = new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600041 */

                /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ac, code lost:
                    if (r0 == null) goto L_0x01cf;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c6, code lost:
                    if (r0 != null) goto L_0x01c8;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:110:0x01c8, code lost:
                    r0.mo204366a();
                    r20.f149609d.cacheSynced = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:111:0x01cf, code lost:
                    r20.f149609d.onInitFinish(r0, r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:151:0x026f, code lost:
                    if (r0 == null) goto L_0x01cf;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:159:0x028a, code lost:
                    if (r0 == null) goto L_0x01cf;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:160:0x028e, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:200:0x0329, code lost:
                    if (r0 == null) goto L_0x034c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:208:0x0343, code lost:
                    if (r0 == null) goto L_0x034c;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:209:0x0345, code lost:
                    r0.mo204366a();
                    r20.f149609d.cacheSynced = true;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:210:0x034c, code lost:
                    r20.f149609d.onInitFinish(r0, r0);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:211:0x0351, code lost:
                    throw r0;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:48:0x00da A[Catch:{ all -> 0x01d6, all -> 0x028f, all -> 0x0269 }] */
                /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9 A[Catch:{ all -> 0x01d6, all -> 0x028f, all -> 0x0269 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 850
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600041.run():void");
                }
            };
            ExecutorService q = C60046b.m233007q();
            if (q != null) {
                q.execute(r0);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateDownloadChunk(final int i, final int i2, final long j) {
        ensureDataBaseInit();
        if (i != 0 && i2 >= 0 && j >= 0 && database != null && this.chunkTableStatements != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600096 */

                public void run() {
                    try {
                        SqlDownloadCache.this.updateDownloadChunkInner(i, i2, j, SqlDownloadCache.this.chunkTableStatements.mo204381c());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(UpdateKey.STATUS, (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        update(i, contentValues);
        return null;
    }

    public void updateDownloadChunkInner(int i, int i2, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                database.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunk(final int i, final int i2, final int i3, final long j) {
        ensureDataBaseInit();
        if (i != 0 && i2 >= 0 && i3 >= 0 && j >= 0 && database != null && this.chunkTableStatements != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600107 */

                public void run() {
                    try {
                        SqlDownloadCache.this.updateSubDownloadChunkInner(i, i2, i3, j, SqlDownloadCache.this.chunkTableStatements.mo204381c());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl, com.ss.android.socialbase.downloader.downloader.AbstractC60059i
    public void updateSubDownloadChunkIndex(final int i, final int i2, final int i3, final int i4) {
        ensureDataBaseInit();
        if (i != 0 && i3 >= 0 && i4 != i2 && i4 >= 0 && database != null && this.chunkTableStatements != null) {
            C60046b.m232976a(new Runnable() {
                /* class com.ss.android.socialbase.downloader.db.SqlDownloadCache.RunnableC600118 */

                public void run() {
                    try {
                        SqlDownloadCache.this.updateSubDownloadChunkIndexInner(i, i2, i3, i4, SqlDownloadCache.this.chunkTableStatements.mo204381c());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public void updateSubDownloadChunkIndexInner(int i, int i2, int i3, int i4, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chunkIndex", Integer.valueOf(i4));
                database.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void updateSubDownloadChunkInner(int i, int i2, int i3, long j, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j));
                database.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", new String[]{Integer.toString(i), Integer.toString(i2), Integer.toString(i3)});
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void loadCacheFromDB(List<DownloadInfo> list, List<Integer> list2, SparseArray<DownloadInfo> sparseArray, SparseArray<DownloadInfo> sparseArray2, SparseArray<List<DownloadChunk>> sparseArray3) {
        int size = sparseArray.size();
        if (size >= 0 && database != null) {
            synchronized (database) {
                try {
                    safeBeginTransaction();
                    if (!list.isEmpty()) {
                        if (C60148a.m233727c().mo205473a("clear_invalid_task_error")) {
                            String[] strArr = new String[list.size()];
                            for (int i = 0; i < list.size(); i++) {
                                strArr[i] = String.valueOf(list.get(i));
                            }
                            String str = "CAST(_id AS TEXT) IN (" + new String(new char[(list.size() - 1)]).replace("\u0000", "?,") + "?)";
                            database.delete("downloader", str, strArr);
                            database.delete("downloadChunk", str, strArr);
                        } else {
                            String join = TextUtils.join(", ", list2);
                            database.delete("downloader", "_id IN (?)", new String[]{join});
                            database.delete("downloadChunk", "_id IN (?)", new String[]{join});
                        }
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = sparseArray.keyAt(i2);
                        DownloadInfo downloadInfo = sparseArray.get(keyAt);
                        database.delete("downloader", "_id = ?", new String[]{String.valueOf(keyAt)});
                        database.insert("downloader", null, downloadInfo.toContentValues());
                        if (downloadInfo.getChunkCount() > 1) {
                            List<DownloadChunk> downloadChunk = getDownloadChunk(keyAt);
                            if (downloadChunk.size() > 0) {
                                database.delete("downloadChunk", "_id = ?", new String[]{String.valueOf(keyAt)});
                                for (DownloadChunk downloadChunk2 : downloadChunk) {
                                    downloadChunk2.mo205005b(downloadInfo.getId());
                                    database.insert("downloadChunk", null, downloadChunk2.mo204995a());
                                }
                            }
                        }
                    }
                    if (!(sparseArray2 == null || sparseArray3 == null)) {
                        synchronized (sparseArray2) {
                            int size2 = sparseArray2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                int id = sparseArray2.valueAt(i3).getId();
                                List<DownloadChunk> a = C60161d.m233754a(getDownloadChunk(id));
                                if (a != null && a.size() > 0) {
                                    sparseArray3.put(id, a);
                                }
                            }
                        }
                    }
                    database.setTransactionSuccessful();
                } catch (Throwable th) {
                    safeEndTransaction();
                    throw th;
                }
                safeEndTransaction();
            }
        }
    }
}
