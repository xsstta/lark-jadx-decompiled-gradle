package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1089e;
import com.C1711a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.SQLException;
import net.sqlcipher.database.SQLiteDebug;

public class SQLiteDatabase extends SQLiteClosable implements AbstractC1082b {
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private static int sQueryLogTimeInMillis = 0;
    private int mCacheFullWarnings;
    Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface LibraryLoader {
        void loadLibraries(String... strArr);
    }

    /* access modifiers changed from: private */
    public enum SQLiteDatabaseTransactionType {
        Deferred,
        Immediate,
        Exclusive
    }

    private native void dbclose();

    private native void dbopen(String str, int i);

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    private native int native_getDbLookaside();

    private native void native_rawExecSQL(String str);

    private native int native_status(int i, boolean z);

    private native void rekey(byte[] bArr) throws SQLException;

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    public native void key(byte[] bArr) throws SQLException;

    public native void key_mutf8(char[] cArr) throws SQLException;

    /* access modifiers changed from: package-private */
    public native int lastChangeCount();

    /* access modifiers changed from: package-private */
    public native long lastInsertRow();

    /* access modifiers changed from: package-private */
    public native void native_execSQL(String str) throws SQLException;

    /* access modifiers changed from: package-private */
    public native void native_setLocale(String str, int i);

    @Override // androidx.p038g.p039a.AbstractC1082b
    public final String getPath() {
        return this.mPath;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, 268435456, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, 268435456, (SQLiteDatabaseHook) null);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void beginTransaction() {
        beginTransactionWithListener((SQLiteTransactionListener) null);
    }

    public void beginTransactionNonExclusive() {
        beginTransactionWithListenerInternal(null, SQLiteDatabaseTransactionType.Immediate);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public List<Pair<String, String>> getAttachedDbs() {
        return getAttachedDbs(this);
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    /* access modifiers changed from: package-private */
    public void onCorruption() {
        this.mErrorHandler.onCorruption(this);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (isOpen()) {
            closeClosable();
            onAllReferencesReleased();
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean inTransaction() {
        if (this.mLock.getHoldCount() > 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean isOpen() {
        if (this.mNativeHandle != 0) {
            return true;
        }
        return false;
    }

    public boolean isReadOnly() {
        if ((this.mFlags & 1) == 1) {
            return true;
        }
        return false;
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    public boolean yieldIfContended() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(false, -1);
    }

    public boolean yieldIfContendedSafely() {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, -1);
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
    }

    private void lockForced() {
        this.mLock.lock();
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
        }
    }

    private void unlockForced() {
        if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (isOpen()) {
            lock();
            try {
                closeClosable();
                onAllReferencesReleased();
            } finally {
                unlock();
            }
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void disableWriteAheadLogging() {
        if (!inTransaction()) {
            rawExecSQL("PRAGMA journal_mode = DELETE;");
            return;
        }
        throw new IllegalStateException("Write Ahead Logging cannot be disabled while in a transaction");
    }

    public boolean isDbLockedByOtherThreads() {
        if (this.mLock.isHeldByCurrentThread() || !this.mLock.isLocked()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void unlock() {
        if (this.mLockingEnabled) {
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                checkLockHoldTime();
            }
            this.mLock.unlock();
        }
    }

    private void checkLockHoldTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.mLockAcquiredWallTime;
        int i = (j > 2000 ? 1 : (j == 2000 ? 0 : -1));
        if ((i < 0 && !Log.isLoggable("Database", 2) && elapsedRealtime - this.mLastLockMessageTime < 20000) || j <= 300) {
            return;
        }
        if (((int) ((Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000)) > 100 || i > 0) {
            this.mLastLockMessageTime = elapsedRealtime;
            boolean z = SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE;
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        for (Map.Entry<SQLiteClosable, Object> entry : this.mPrograms.entrySet()) {
            SQLiteClosable key = entry.getKey();
            if (key != null) {
                key.onAllReferencesReleasedFromContainer();
            }
        }
    }

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            for (SQLiteCompiledSql sQLiteCompiledSql : this.mCompiledQueries.values()) {
                sQLiteCompiledSql.releaseSqlStatement();
            }
            this.mCompiledQueries.clear();
        }
    }

    private String getPathForLogs() {
        String str = this.mPathForLogs;
        if (str != null) {
            return str;
        }
        String str2 = this.mPath;
        if (str2 == null) {
            return null;
        }
        if (str2.indexOf(64) == -1) {
            this.mPathForLogs = this.mPath;
        } else {
            this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        }
        return this.mPathForLogs;
    }

    public boolean enableWriteAheadLogging() {
        if (!inTransaction()) {
            ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(this);
            if ((attachedDbs != null && attachedDbs.size() > 1) || isReadOnly() || getPath().equals(":memory:")) {
                return false;
            }
            rawExecSQL("PRAGMA journal_mode = WAL;");
            return true;
        }
        throw new IllegalStateException("Write Ahead Logging cannot be enabled while in a transaction");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getMaximumSize() {
        /*
            r7 = this;
            r7.lock()
            r0 = 0
            boolean r1 = r7.isOpen()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0024
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "PRAGMA max_page_count;"
            r1.<init>(r7, r2)     // Catch:{ all -> 0x002c }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0022 }
            long r4 = r7.getPageSize()     // Catch:{ all -> 0x0022 }
            long r2 = r2 * r4
            r1.close()
            r7.unlock()
            return r2
        L_0x0022:
            r0 = move-exception
            goto L_0x0030
        L_0x0024:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "database not open"
            r1.<init>(r2)
            throw r1
        L_0x002c:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()
        L_0x0035:
            r7.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getMaximumSize():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getPageSize() {
        /*
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x001e
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "PRAGMA page_size;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0026 }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x001c }
            r1.close()
            r5.unlock()
            return r2
        L_0x001c:
            r0 = move-exception
            goto L_0x002a
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "database not open"
            r1.<init>(r2)
            throw r1
        L_0x0026:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPageSize():long");
    }

    public Map<String, String> getSyncedTables() {
        HashMap hashMap;
        synchronized (this.mSyncUpdateInfo) {
            hashMap = new HashMap();
            for (String str : this.mSyncUpdateInfo.keySet()) {
                SyncUpdateInfo syncUpdateInfo = this.mSyncUpdateInfo.get(str);
                if (syncUpdateInfo.deletedTable != null) {
                    hashMap.put(str, syncUpdateInfo.deletedTable);
                }
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getVersion() {
        /*
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x001f
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0027 }
            java.lang.String r2 = "PRAGMA user_version;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0027 }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x001d }
            int r0 = (int) r2
            r1.close()
            r5.unlock()
            return r0
        L_0x001d:
            r0 = move-exception
            goto L_0x002b
        L_0x001f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "database not open"
            r1.<init>(r2)
            throw r1
        L_0x0027:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getVersion():int");
    }

    public boolean isDatabaseIntegrityOk() {
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA integrity_check;");
        if (((Boolean) resultFromPragma.first).booleanValue()) {
            return ((String) resultFromPragma.second).equals("ok");
        }
        return ((Boolean) resultFromPragma.first).booleanValue();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean isWriteAheadLoggingEnabled() {
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA journal_mode;");
        if (((Boolean) resultFromPragma.first).booleanValue()) {
            return ((String) resultFromPragma.second).equals("wal");
        }
        return ((Boolean) resultFromPragma.first).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void lock() {
        if (this.mLockingEnabled) {
            this.mLock.lock();
            if (SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // net.sqlcipher.database.SQLiteClosable
    public void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (!this.mLock.isHeldByCurrentThread()) {
            throw new IllegalStateException("no transaction pending");
        } else if (!this.mInnerTransactionIsSuccessful) {
            this.mInnerTransactionIsSuccessful = true;
        } else {
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void endTransaction() {
        RuntimeException e;
        if (!isOpen()) {
            throw new IllegalStateException("database not open");
        } else if (this.mLock.isHeldByCurrentThread()) {
            try {
                if (this.mInnerTransactionIsSuccessful) {
                    this.mInnerTransactionIsSuccessful = false;
                } else {
                    this.mTransactionIsSuccessful = false;
                }
                if (this.mLock.getHoldCount() == 1) {
                    SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
                    if (sQLiteTransactionListener != null) {
                        try {
                            if (this.mTransactionIsSuccessful) {
                                sQLiteTransactionListener.onCommit();
                            } else {
                                sQLiteTransactionListener.onRollback();
                            }
                        } catch (RuntimeException e2) {
                            e = e2;
                            this.mTransactionIsSuccessful = false;
                        }
                    }
                    e = null;
                    if (this.mTransactionIsSuccessful) {
                        execSQL("COMMIT;");
                    } else {
                        try {
                            execSQL("ROLLBACK;");
                            if (e != null) {
                                throw e;
                            }
                        } catch (SQLException unused) {
                        }
                    }
                    this.mTransactionListener = null;
                    unlockForced();
                }
            } finally {
                this.mTransactionListener = null;
                unlockForced();
            }
        } else {
            throw new IllegalStateException("no transaction pending");
        }
    }

    static ArrayList<SQLiteDebug.DbStats> getDbStats() {
        int i;
        String str;
        int i2;
        ArrayList<SQLiteDebug.DbStats> arrayList = new ArrayList<>();
        Iterator<SQLiteDatabase> it = getActiveDatabases().iterator();
        while (it.hasNext()) {
            SQLiteDatabase next = it.next();
            if (next != null && next.isOpen()) {
                int native_getDbLookaside = next.native_getDbLookaside();
                String path = next.getPath();
                int lastIndexOf = path.lastIndexOf("/");
                if (lastIndexOf != -1) {
                    i = lastIndexOf + 1;
                } else {
                    i = 0;
                }
                String substring = path.substring(i);
                ArrayList<Pair<String, String>> attachedDbs = getAttachedDbs(next);
                if (attachedDbs != null) {
                    for (int i3 = 0; i3 < attachedDbs.size(); i3++) {
                        Pair<String, String> pair = attachedDbs.get(i3);
                        long pragmaVal = getPragmaVal(next, ((String) pair.first) + ".page_count;");
                        if (i3 == 0) {
                            str = substring;
                        } else {
                            String str2 = "  (attached) " + ((String) pair.first);
                            if (((String) pair.second).trim().length() > 0) {
                                int lastIndexOf2 = ((String) pair.second).lastIndexOf("/");
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(" : ");
                                String str3 = (String) pair.second;
                                if (lastIndexOf2 != -1) {
                                    i2 = lastIndexOf2 + 1;
                                } else {
                                    i2 = 0;
                                }
                                sb.append(str3.substring(i2));
                                str2 = sb.toString();
                            }
                            str = str2;
                            native_getDbLookaside = 0;
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new SQLiteDebug.DbStats(str, pragmaVal, next.getPageSize(), native_getDbLookaside));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public void setLockingEnabled(boolean z) {
        this.mLockingEnabled = z;
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Exclusive);
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Immediate);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public android.database.Cursor query(AbstractC1089e eVar) {
        return query(eVar, (CancellationSignal) null);
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir());
        }
    }

    public void beginTransactionWithListener(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListener(new SQLiteTransactionListener() {
            /* class net.sqlcipher.database.SQLiteDatabase.C696404 */

            @Override // net.sqlcipher.database.SQLiteTransactionListener
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.sqlcipher.database.SQLiteTransactionListener
            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.sqlcipher.database.SQLiteTransactionListener
            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public void beginTransactionWithListenerNonExclusive(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerNonExclusive(new SQLiteTransactionListener() {
            /* class net.sqlcipher.database.SQLiteDatabase.C696415 */

            @Override // net.sqlcipher.database.SQLiteTransactionListener
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            @Override // net.sqlcipher.database.SQLiteTransactionListener
            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            @Override // net.sqlcipher.database.SQLiteTransactionListener
            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public boolean needUpgrade(int i) {
        if (i > getVersion()) {
            return true;
        }
        return false;
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public android.database.Cursor query(String str) {
        return rawQuery(str, (String[]) null);
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c : cArr) {
            if (c == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        ByteBuffer encode = Charset.forName("UTF-8").encode(CharBuffer.wrap(cArr));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }

    public static char[] getChars(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        CharBuffer decode = Charset.forName("UTF-8").decode(ByteBuffer.wrap(bArr));
        char[] cArr = new char[decode.limit()];
        decode.get(cArr);
        return cArr;
    }

    /* access modifiers changed from: package-private */
    public void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, null);
        } finally {
            unlock();
        }
    }

    public void changePassword(String str) throws SQLiteException {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (str != null) {
            byte[] bytes = getBytes(str.toCharArray());
            rekey(bytes);
            Arrays.fill(bytes, (byte) 0);
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public SQLiteStatement compileStatement(String str) throws SQLException {
        lock();
        try {
            if (isOpen()) {
                return new SQLiteStatement(this, str);
            }
            throw new IllegalStateException("database not open");
        } finally {
            unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    public void setLocale(Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public boolean yieldIfContendedSafely(long j) {
        if (!isOpen()) {
            return false;
        }
        return yieldIfContendedHelper(true, j);
    }

    public static String findEditTable(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
                return str.substring(0, indexOf);
            }
            if (indexOf2 <= 0) {
                return str;
            }
            if (indexOf2 < indexOf || indexOf < 0) {
                return str.substring(0, indexOf2);
            }
            return str;
        }
        throw new IllegalStateException("Invalid tables");
    }

    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", (String[]) null);
        while (rawQuery.moveToNext()) {
            arrayList.add(new Pair<>(rawQuery.getString(1), rawQuery.getString(2)));
        }
        rawQuery.close();
        return arrayList;
    }

    private Pair<Boolean, String> getResultFromPragma(String str) {
        Cursor rawQuery = rawQuery(str, new Object[0]);
        if (rawQuery == null) {
            return new Pair<>(false, "");
        }
        rawQuery.moveToFirst();
        String string = rawQuery.getString(0);
        rawQuery.close();
        return new Pair<>(true, string);
    }

    public void changePassword(char[] cArr) throws SQLiteException {
        if (!isOpen()) {
            throw new SQLiteException("database not open");
        } else if (cArr != null) {
            byte[] bytes = getBytes(cArr);
            rekey(bytes);
            Arrays.fill(bytes, (byte) 0);
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void execSQL(String str) throws SQLException {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (isOpen()) {
                native_execSQL(str);
                unlock();
                return;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r3.mNumCacheHits++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r3.mNumCacheMisses++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            int r1 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x000c
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE     // Catch:{ all -> 0x002b }
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r4
        L_0x000c:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x002b }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x002b }
            net.sqlcipher.database.SQLiteCompiledSql r4 = (net.sqlcipher.database.SQLiteCompiledSql) r4     // Catch:{ all -> 0x002b }
            r1 = 1
            if (r4 == 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0023
            int r0 = r3.mNumCacheHits
            int r0 = r0 + r1
            r3.mNumCacheHits = r0
            goto L_0x0028
        L_0x0023:
            int r0 = r3.mNumCacheMisses
            int r0 = r0 + r1
            r3.mNumCacheMisses = r0
        L_0x0028:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            return r4
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getCompiledStatementForSql(java.lang.String):net.sqlcipher.database.SQLiteCompiledSql");
    }

    public void rawExecSQL(String str) {
        SystemClock.uptimeMillis();
        lock();
        try {
            if (isOpen()) {
                native_rawExecSQL(str);
                unlock();
                return;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        String str;
        if (!inTransaction()) {
            Object[] objArr = new Object[1];
            if (z) {
                str = "ON";
            } else {
                str = "OFF";
            }
            objArr[0] = str;
            execSQL(String.format("PRAGMA foreign_keys = %s;", objArr));
            return;
        }
        throw new IllegalStateException("Foreign key constraints may not be changed while in a transaction");
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        if (i > 250 || i < 0) {
            throw new IllegalStateException("expected value between 0 and 250");
        } else if (i >= this.mMaxSqlCacheSize) {
            this.mMaxSqlCacheSize = i;
        } else {
            throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long setMaximumSize(long r9) {
        /*
            r8 = this;
            r8.lock()
            r0 = 0
            boolean r1 = r8.isOpen()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0040
            long r1 = r8.getPageSize()     // Catch:{ all -> 0x0048 }
            long r3 = r9 / r1
            long r9 = r9 % r1
            r5 = 0
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x001a
            r9 = 1
            long r3 = r3 + r9
        L_0x001a:
            net.sqlcipher.database.SQLiteStatement r9 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r10.<init>()     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = "PRAGMA max_page_count = "
            r10.append(r5)     // Catch:{ all -> 0x0048 }
            r10.append(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0048 }
            r9.<init>(r8, r10)     // Catch:{ all -> 0x0048 }
            long r3 = r9.simpleQueryForLong()     // Catch:{ all -> 0x003d }
            long r3 = r3 * r1
            r9.close()
            r8.unlock()
            return r3
        L_0x003d:
            r10 = move-exception
            r0 = r9
            goto L_0x0049
        L_0x0040:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "database not open"
            r9.<init>(r10)
            throw r9
        L_0x0048:
            r10 = move-exception
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            r8.unlock()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.setMaximumSize(long):long");
    }

    private void openDatabaseInternal(char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        openDatabaseInternal(getBytes(cArr), sQLiteDatabaseHook);
    }

    public Cursor rawQuery(String str, String[] strArr) {
        return rawQueryWithFactory(null, str, strArr, null);
    }

    public int status(int i, boolean z) {
        return native_status(i, z);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(":memory:", cArr, cursorFactory, 268435456);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        char[] cArr;
        if (str == null) {
            cArr = null;
        } else {
            cArr = str.toCharArray();
        }
        return openDatabase(":memory:", cArr, cursorFactory, 268435456);
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, file, new LibraryLoader() {
                /* class net.sqlcipher.database.SQLiteDatabase.C696371 */

                @Override // net.sqlcipher.database.SQLiteDatabase.LibraryLoader
                public void loadLibraries(String... strArr) {
                    for (String str : strArr) {
                        C1711a.m7628a(str);
                    }
                }
            });
        }
    }

    public void markTableSyncable(String str, String str2) {
        if (isOpen()) {
            markTableSyncable(str, "_id", str, str2);
            return;
        }
        throw new SQLiteException("database not open");
    }

    public android.database.Cursor query(AbstractC1089e eVar, CancellationSignal cancellationSignal) {
        BindingsRecorder bindingsRecorder = new BindingsRecorder();
        eVar.mo5695a(bindingsRecorder);
        return rawQuery(eVar.mo5696b(), bindingsRecorder.getBindings());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase r4, java.lang.String r5) {
        /*
            boolean r0 = r4.isOpen()
            if (r0 != 0) goto L_0x0009
            r4 = 0
            return r4
        L_0x0009:
            r0 = 0
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r3 = "PRAGMA "
            r2.append(r3)     // Catch:{ all -> 0x002b }
            r2.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x002b }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x002b }
            long r4 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0028 }
            r1.close()
            return r4
        L_0x0028:
            r4 = move-exception
            r0 = r1
            goto L_0x002c
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            if (r0 == 0) goto L_0x0031
            r0.close()
        L_0x0031:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPragmaVal(net.sqlcipher.database.SQLiteDatabase, java.lang.String):long");
    }

    private void keyDatabase(SQLiteDatabaseHook sQLiteDatabaseHook, Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        try {
            Cursor rawQuery = rawQuery("select count(*) from sqlite_master;", new String[0]);
            if (rawQuery != null) {
                rawQuery.moveToFirst();
                rawQuery.getInt(0);
                rawQuery.close();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void addToCompiledQueries(String str, SQLiteCompiledSql sQLiteCompiledSql) {
        if (this.mMaxSqlCacheSize == 0) {
            boolean z = SQLiteDebug.DEBUG_SQL_CACHE;
            return;
        }
        synchronized (this.mCompiledQueries) {
            if (this.mCompiledQueries.get(str) == null) {
                if (this.mCompiledQueries.size() == this.mMaxSqlCacheSize) {
                    this.mCacheFullWarnings++;
                } else {
                    this.mCompiledQueries.put(str, sQLiteCompiledSql);
                    boolean z2 = SQLiteDebug.DEBUG_SQL_CACHE;
                }
            }
        }
    }

    public android.database.Cursor query(String str, Object[] objArr) {
        return rawQuery(str, objArr);
    }

    private void beginTransactionWithListenerInternal(SQLiteTransactionListener sQLiteTransactionListener, SQLiteDatabaseTransactionType sQLiteDatabaseTransactionType) {
        lockForced();
        if (isOpen()) {
            try {
                if (this.mLock.getHoldCount() <= 1) {
                    if (sQLiteDatabaseTransactionType == SQLiteDatabaseTransactionType.Exclusive) {
                        execSQL("BEGIN EXCLUSIVE;");
                    } else if (sQLiteDatabaseTransactionType == SQLiteDatabaseTransactionType.Immediate) {
                        execSQL("BEGIN IMMEDIATE;");
                    } else if (sQLiteDatabaseTransactionType == SQLiteDatabaseTransactionType.Deferred) {
                        execSQL("BEGIN DEFERRED;");
                    } else {
                        throw new IllegalArgumentException(String.format("%s is an unsupported transaction type", sQLiteDatabaseTransactionType));
                    }
                    this.mTransactionListener = sQLiteTransactionListener;
                    this.mTransactionIsSuccessful = true;
                    this.mInnerTransactionIsSuccessful = false;
                    if (sQLiteTransactionListener != null) {
                        try {
                            sQLiteTransactionListener.onBegin();
                        } catch (RuntimeException e) {
                            execSQL("ROLLBACK;");
                            throw e;
                        }
                    }
                } else if (this.mInnerTransactionIsSuccessful) {
                    throw new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                }
            } catch (Throwable th) {
                unlockForced();
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public static synchronized void loadLibs(Context context, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            loadLibs(context, context.getFilesDir(), libraryLoader);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openDatabaseInternal(final byte[] r6, net.sqlcipher.database.SQLiteDatabaseHook r7) {
        /*
            r5 = this;
            java.lang.String r0 = r5.mPath
            int r1 = r5.mFlags
            r5.dbopen(r0, r1)
            r0 = 0
            r1 = 1
            net.sqlcipher.database.SQLiteDatabase$2 r2 = new net.sqlcipher.database.SQLiteDatabase$2     // Catch:{ RuntimeException -> 0x0015 }
            r2.<init>(r6)     // Catch:{ RuntimeException -> 0x0015 }
            r5.keyDatabase(r7, r2)     // Catch:{ RuntimeException -> 0x0015 }
            goto L_0x003b
        L_0x0012:
            r6 = move-exception
            r0 = 1
            goto L_0x003d
        L_0x0015:
            r2 = move-exception
            char[] r3 = getChars(r6)     // Catch:{ all -> 0x0012 }
            boolean r4 = r5.containsNull(r3)     // Catch:{ all -> 0x0012 }
            if (r4 == 0) goto L_0x003c
            net.sqlcipher.database.SQLiteDatabase$3 r2 = new net.sqlcipher.database.SQLiteDatabase$3     // Catch:{ all -> 0x0012 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0012 }
            r5.keyDatabase(r7, r2)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x0030
            int r7 = r6.length     // Catch:{ all -> 0x0012 }
            if (r7 <= 0) goto L_0x0030
            r5.rekey(r6)     // Catch:{ all -> 0x0012 }
        L_0x0030:
            if (r3 == 0) goto L_0x003b
            int r6 = r3.length     // Catch:{ all -> 0x0039 }
            if (r6 <= 0) goto L_0x003b
            java.util.Arrays.fill(r3, r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r6 = move-exception
            goto L_0x003d
        L_0x003b:
            return
        L_0x003c:
            throw r2
        L_0x003d:
            if (r0 == 0) goto L_0x004c
            r5.dbclose()
            boolean r7 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            if (r7 == 0) goto L_0x004c
            java.lang.String r7 = r5.getTime()
            r5.mTimeClosed = r7
        L_0x004c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabaseInternal(byte[], net.sqlcipher.database.SQLiteDatabaseHook):void");
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        long j2;
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (!z || !isDbLockedByCurrentThread()) {
            if (j > 0) {
                while (j > 0) {
                    if (j < 1000) {
                        j2 = j;
                    } else {
                        j2 = 1000;
                    }
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException unused) {
                        Thread.interrupted();
                    }
                    j -= 1000;
                    if (this.mLock.getQueueLength() == 0) {
                        break;
                    }
                }
            }
            beginTransactionWithListener(sQLiteTransactionListener);
            return true;
        }
        throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
    }

    public void execSQL(String str, Object[] objArr) throws SQLException {
        if (objArr != null) {
            SystemClock.uptimeMillis();
            lock();
            SQLiteStatement sQLiteStatement = null;
            try {
                if (isOpen()) {
                    SQLiteStatement compileStatement = compileStatement(str);
                    if (objArr != null) {
                        int length = objArr.length;
                        int i = 0;
                        while (i < length) {
                            int i2 = i + 1;
                            DatabaseUtils.bindObjectToProgram(compileStatement, i2, objArr[i]);
                            i = i2;
                        }
                    }
                    compileStatement.execute();
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                    unlock();
                    return;
                }
                throw new IllegalStateException("database not open");
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                if (0 != 0) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Empty bindArgs");
        }
    }

    public SQLiteQueryStats getQueryStats(String str, Object[] objArr) {
        try {
            execSQL(String.format("CREATE TABLE tempstat AS %s", str), objArr);
            Cursor rawQuery = rawQuery("SELECT sum(payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery == null) {
                return new SQLiteQueryStats(0, 0);
            }
            rawQuery.moveToFirst();
            long j = rawQuery.getLong(0);
            rawQuery.close();
            Cursor rawQuery2 = rawQuery("SELECT max(mx_payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery2 == null) {
                return new SQLiteQueryStats(j, 0);
            }
            rawQuery2.moveToFirst();
            long j2 = rawQuery2.getLong(0);
            rawQuery2.close();
            execSQL("DROP TABLE tempstat;");
            return new SQLiteQueryStats(j, j2);
        } catch (SQLiteException e) {
            execSQL("DROP TABLE IF EXISTS tempstat;");
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public void rowUpdated(String str, long j) {
        SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            execSQL("UPDATE " + syncUpdateInfo.masterTable + " SET _sync_dirty=1 WHERE _id=(SELECT " + syncUpdateInfo.foreignKey + " FROM " + str + " WHERE _id=" + j + ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085 A[SYNTHETIC, Splitter:B:45:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d A[Catch:{ IOException -> 0x0089 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadICUData(android.content.Context r5, java.io.File r6) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.loadICUData(android.content.Context, java.io.File):void");
    }

    /* JADX INFO: finally extract failed */
    public Cursor rawQuery(String str, Object[] objArr) {
        if (isOpen()) {
            long j = 0;
            int i = -1;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null);
            try {
                Cursor query = sQLiteDirectCursorDriver.query(this.mFactory, objArr);
                if (this.mSlowQueryThreshold != -1) {
                    if (query != null) {
                        i = query.getCount();
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                        Log.v("Database", "query (" + currentTimeMillis + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + i);
                    }
                }
                return new CrossProcessCursorWrapper(query);
            } catch (Throwable th) {
                if (this.mSlowQueryThreshold != -1) {
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                        Log.v("Database", "query (" + currentTimeMillis2 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + -1);
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, (SQLiteDatabaseHook) null);
    }

    public int delete(String str, String str2, String[] strArr) {
        return delete(str, str2, (Object[]) strArr);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public long insert(String str, int i, ContentValues contentValues) throws android.database.SQLException {
        return insertWithOnConflict(str, null, contentValues, i);
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    /* access modifiers changed from: private */
    public static class SyncUpdateInfo {
        String deletedTable;
        String foreignKey;
        String masterTable;

        SyncUpdateInfo(String str, String str2, String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (SQLException unused) {
            return -1;
        }
    }

    public static synchronized void loadLibs(Context context, File file, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            libraryLoader.loadLibraries("sqlcipher");
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, 268435456, (SQLiteDatabaseHook) null);
    }

    public void markTableSyncable(String str, String str2, String str3) {
        if (isOpen()) {
            markTableSyncable(str, str2, str3, null);
            return;
        }
        throw new SQLiteException("database not open");
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        lock();
        SQLiteStatement sQLiteStatement = null;
        try {
            if (isOpen()) {
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM ");
                sb.append(str);
                if (!TextUtils.isEmpty(str2)) {
                    str3 = " WHERE " + str2;
                } else {
                    str3 = "";
                }
                sb.append(str3);
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                if (objArr != null) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        DatabaseUtils.bindObjectToProgram(compileStatement, i2, objArr[i]);
                        i = i2;
                    }
                }
                compileStatement.execute();
                int lastChangeCount = lastChangeCount();
                if (compileStatement != null) {
                    compileStatement.close();
                }
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            unlock();
            throw th;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory) {
        return openDatabase(str, bArr, cursorFactory, 268435456, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i) {
        return openDatabase(str, str2, cursorFactory, i, (SQLiteDatabaseHook) null);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, (SQLiteDatabaseHook) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public Cursor rawQuery(String str, String[] strArr, int i, int i2) {
        CursorWrapper cursorWrapper = (CursorWrapper) rawQueryWithFactory(null, str, strArr, null);
        ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        return cursorWrapper;
    }

    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0;
        this.mLockAcquiredThreadTime = 0;
        this.mLastLockMessageTime = 0;
        this.mLastSqlStatement = null;
        this.mNativeHandle = 0;
        this.mTempTableSequence = 0;
        this.mPathForLogs = null;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = 250;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str != null) {
            this.mFlags = i;
            this.mPath = str;
            this.mSlowQueryThreshold = -1;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.mFactory = cursorFactory;
            this.mPrograms = new WeakHashMap<>();
            this.mErrorHandler = databaseErrorHandler;
            return;
        }
        throw new IllegalArgumentException("path should not be null");
    }

    /* JADX INFO: finally extract failed */
    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            native_execSQL("SELECT _sync_dirty FROM " + str3 + " LIMIT 0");
            native_execSQL("SELECT " + str2 + " FROM " + str + " LIMIT 0");
            unlock();
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        return openDatabase(str, cArr, cursorFactory, i, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, 268435456, sQLiteDatabaseHook);
    }

    public long insertWithOnConflict(String str, String str2, ContentValues contentValues, int i) {
        Set<Map.Entry<String, Object>> set;
        long j;
        if (isOpen()) {
            StringBuilder sb = new StringBuilder(152);
            sb.append("INSERT");
            sb.append(CONFLICT_VALUES[i]);
            sb.append(" INTO ");
            sb.append(str);
            StringBuilder sb2 = new StringBuilder(40);
            int i2 = 0;
            SQLiteStatement sQLiteStatement = null;
            if (contentValues == null || contentValues.size() <= 0) {
                sb.append("(" + str2 + ") ");
                sb2.append("NULL");
                set = null;
            } else {
                set = contentValues.valueSet();
                sb.append('(');
                boolean z = false;
                for (Map.Entry<String, Object> entry : set) {
                    if (z) {
                        sb.append(", ");
                        sb2.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb2.append('?');
                    z = true;
                }
                sb.append(')');
            }
            sb.append(" VALUES(");
            sb.append((CharSequence) sb2);
            sb.append(");");
            lock();
            try {
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                if (set != null) {
                    int size = set.size();
                    Iterator<Map.Entry<String, Object>> it = set.iterator();
                    while (i2 < size) {
                        i2++;
                        DatabaseUtils.bindObjectToProgram(compileStatement, i2, it.next().getValue());
                    }
                }
                compileStatement.execute();
                if (lastChangeCount() > 0) {
                    j = lastInsertRow();
                } else {
                    j = -1;
                }
                if (compileStatement != null) {
                    compileStatement.close();
                }
                unlock();
                return j;
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (Throwable th) {
                if (0 != 0) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        if (isOpen()) {
            long j = 0;
            int i = -1;
            if (this.mSlowQueryThreshold != -1) {
                j = System.currentTimeMillis();
            }
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
            if (cursorFactory == null) {
                try {
                    cursorFactory = this.mFactory;
                } catch (Throwable th) {
                    if (this.mSlowQueryThreshold != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - j;
                        if (currentTimeMillis >= ((long) this.mSlowQueryThreshold)) {
                            Log.v("Database", "query (" + currentTimeMillis + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + -1);
                        }
                    }
                    throw th;
                }
            }
            Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
            if (this.mSlowQueryThreshold != -1) {
                if (query != null) {
                    i = query.getCount();
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                if (currentTimeMillis2 >= ((long) this.mSlowQueryThreshold)) {
                    Log.v("Database", "query (" + currentTimeMillis2 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is " + i);
                }
            }
            return new CrossProcessCursorWrapper(query);
        }
        throw new IllegalStateException("database not open");
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, bArr, cursorFactory, 268435456, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public SQLiteDatabase(String str, byte[] bArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(bArr, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        String str2;
        if (file == null) {
            str2 = null;
        } else {
            str2 = file.getPath();
        }
        return openOrCreateDatabase(str2, str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            strArr[i2] = objArr[i2].toString();
        }
        return updateWithOnConflict(str, contentValues, str2, strArr, i);
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        char[] cArr;
        if (str2 == null) {
            cArr = null;
        } else {
            cArr = str2.toCharArray();
        }
        return openDatabase(str, cArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public int updateWithOnConflict(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder((int) SmEvents.EVENT_NW);
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(str);
        sb.append(" SET ");
        Set<Map.Entry<String, Object>> valueSet = contentValues.valueSet();
        Iterator<Map.Entry<String, Object>> it = valueSet.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getKey());
            sb.append("=?");
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        SQLiteStatement sQLiteStatement = null;
        lock();
        try {
            if (isOpen()) {
                SQLiteStatement compileStatement = compileStatement(sb.toString());
                int size = valueSet.size();
                Iterator<Map.Entry<String, Object>> it2 = valueSet.iterator();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    DatabaseUtils.bindObjectToProgram(compileStatement, i2, it2.next().getValue());
                    i2++;
                }
                if (strArr != null) {
                    for (String str3 : strArr) {
                        compileStatement.bindString(i2, str3);
                        i2++;
                    }
                }
                compileStatement.execute();
                int lastChangeCount = lastChangeCount();
                if (compileStatement != null) {
                    compileStatement.close();
                }
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e) {
            onCorruption();
            throw e;
        } catch (SQLException e2) {
            throw e2;
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            unlock();
            throw th;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, bArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        char[] cArr;
        if (str2 == null) {
            cArr = null;
        } else {
            cArr = str2.toCharArray();
        }
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r2, byte[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
        /*
            if (r7 == 0) goto L_0x0003
            goto L_0x0008
        L_0x0003:
            net.sqlcipher.DefaultDatabaseErrorHandler r7 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r7.<init>()
        L_0x0008:
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.<init>(r2, r4, r5, r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.openDatabaseInternal(r3, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0013 }
            goto L_0x001e
        L_0x0012:
            r1 = r0
        L_0x0013:
            r7.onCorruption(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase
            r1.<init>(r2, r4, r5, r7)
            r1.openDatabaseInternal(r3, r6)
        L_0x001e:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            if (r3 == 0) goto L_0x0025
            r1.enableSqlTracing(r2)
        L_0x0025:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME
            if (r3 == 0) goto L_0x002c
            r1.enableSqlProfiling(r2)
        L_0x002c:
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases
            monitor-enter(r2)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r3 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases     // Catch:{ all -> 0x0036 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return r1
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabase(java.lang.String, byte[], net.sqlcipher.database.SQLiteDatabase$CursorFactory, int, net.sqlcipher.database.SQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler):net.sqlcipher.database.SQLiteDatabase");
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, getBytes(cArr), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public Cursor queryWithFactory(CursorFactory cursorFactory, boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (isOpen()) {
            return rawQueryWithFactory(cursorFactory, SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
        }
        throw new IllegalStateException("database not open");
    }
}
