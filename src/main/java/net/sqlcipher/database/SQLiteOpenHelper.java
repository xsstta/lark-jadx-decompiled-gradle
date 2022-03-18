package net.sqlcipher.database;

import android.content.Context;
import android.util.Log;
import java.io.File;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DefaultDatabaseErrorHandler;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class SQLiteOpenHelper {
    private static final String TAG = "SQLiteOpenHelper";
    private final Context mContext;
    private SQLiteDatabase mDatabase;
    private boolean mDeferSetWriteAheadLoggingEnabled;
    private boolean mEnableWriteAheadLogging;
    private final DatabaseErrorHandler mErrorHandler;
    private final SQLiteDatabase.CursorFactory mFactory;
    private final SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final String mName;
    private final int mNewVersion;

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public String getDatabaseName() {
        return this.mName;
    }

    public synchronized void close() {
        if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        } else {
            throw new IllegalStateException("Closed during initialization");
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase(String str) {
        char[] cArr;
        if (str == null) {
            cArr = null;
        } else {
            cArr = str.toCharArray();
        }
        return getReadableDatabase(cArr);
    }

    public synchronized SQLiteDatabase getWritableDatabase(String str) {
        char[] cArr;
        if (str == null) {
            cArr = null;
        } else {
            cArr = str.toCharArray();
        }
        return getWritableDatabase(cArr);
    }

    public synchronized SQLiteDatabase getReadableDatabase(char[] cArr) {
        byte[] bArr;
        if (cArr == null) {
            bArr = null;
        } else {
            bArr = SQLiteDatabase.getBytes(cArr);
        }
        return getReadableDatabase(bArr);
    }

    public synchronized SQLiteDatabase getWritableDatabase(char[] cArr) {
        byte[] bArr;
        if (cArr == null) {
            bArr = null;
        } else {
            bArr = SQLiteDatabase.getBytes(cArr);
        }
        return getWritableDatabase(bArr);
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || this.mDatabase.isReadOnly()) {
                    this.mDeferSetWriteAheadLoggingEnabled = z;
                } else {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                    this.mEnableWriteAheadLogging = z;
                }
            }
        }
    }

    public synchronized SQLiteDatabase getWritableDatabase(byte[] bArr) {
        SQLiteDatabase openOrCreateDatabase;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
            return this.mDatabase;
        } else if (!this.mIsInitializing) {
            SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.lock();
            }
            SQLiteDatabase sQLiteDatabase3 = null;
            try {
                this.mIsInitializing = true;
                String str = this.mName;
                if (str == null) {
                    openOrCreateDatabase = SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null, "");
                } else {
                    String path = this.mContext.getDatabasePath(str).getPath();
                    File file = new File(path);
                    if (!file.exists()) {
                        file.getParentFile().mkdirs();
                    }
                    openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(path, bArr, this.mFactory, this.mHook, this.mErrorHandler);
                }
                if (this.mDeferSetWriteAheadLoggingEnabled) {
                    this.mEnableWriteAheadLogging = openOrCreateDatabase.enableWriteAheadLogging();
                }
                onConfigure(openOrCreateDatabase);
                int version = openOrCreateDatabase.getVersion();
                if (version != this.mNewVersion) {
                    openOrCreateDatabase.beginTransaction();
                    if (version == 0) {
                        try {
                            onCreate(openOrCreateDatabase);
                        } catch (Throwable th) {
                            openOrCreateDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        int i = this.mNewVersion;
                        if (version > i) {
                            onDowngrade(openOrCreateDatabase, version, i);
                        } else {
                            onUpgrade(openOrCreateDatabase, version, i);
                        }
                    }
                    openOrCreateDatabase.setVersion(this.mNewVersion);
                    openOrCreateDatabase.setTransactionSuccessful();
                    openOrCreateDatabase.endTransaction();
                }
                onOpen(openOrCreateDatabase);
                this.mIsInitializing = false;
                SQLiteDatabase sQLiteDatabase4 = this.mDatabase;
                if (sQLiteDatabase4 != null) {
                    try {
                        sQLiteDatabase4.close();
                    } catch (Exception unused) {
                    }
                    this.mDatabase.unlock();
                }
                this.mDatabase = openOrCreateDatabase;
                return openOrCreateDatabase;
            } catch (Throwable th2) {
                this.mIsInitializing = false;
                SQLiteDatabase sQLiteDatabase5 = this.mDatabase;
                if (sQLiteDatabase5 != null) {
                    sQLiteDatabase5.unlock();
                }
                if (0 != 0) {
                    sQLiteDatabase3.close();
                }
                throw th2;
            }
        } else {
            throw new IllegalStateException("getWritableDatabase called recursively");
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase(byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
            return this.mDatabase;
        } else if (!this.mIsInitializing) {
            try {
                return getWritableDatabase(bArr);
            } catch (SQLiteException e) {
                if (this.mName != null) {
                    String str = TAG;
                    Log.e(str, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                    sQLiteDatabase = null;
                    this.mIsInitializing = true;
                    String path = this.mContext.getDatabasePath(this.mName).getPath();
                    File file = new File(path);
                    File file2 = new File(this.mContext.getDatabasePath(this.mName).getParent());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    if (!file.exists()) {
                        this.mIsInitializing = false;
                        SQLiteDatabase writableDatabase = getWritableDatabase(bArr);
                        this.mIsInitializing = true;
                        writableDatabase.close();
                    }
                    SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(path, bArr, this.mFactory, 1, this.mHook, this.mErrorHandler);
                    if (openDatabase.getVersion() == this.mNewVersion) {
                        onOpen(openDatabase);
                        Log.w(str, "Opened " + this.mName + " in read-only mode");
                        this.mDatabase = openDatabase;
                        this.mIsInitializing = false;
                        if (!(openDatabase == null || openDatabase == openDatabase)) {
                            openDatabase.close();
                        }
                        return openDatabase;
                    }
                    throw new SQLiteException("Can't upgrade read-only database from version " + openDatabase.getVersion() + " to " + this.mNewVersion + ": " + path);
                }
                throw e;
            } catch (Throwable th) {
                this.mIsInitializing = false;
                if (!(0 == 0 || null == this.mDatabase)) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("getReadableDatabase called recursively");
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(context, str, cursorFactory, i, sQLiteDatabaseHook, new DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        if (i < 1) {
            throw new IllegalArgumentException("Version must be >= 1, was " + i);
        } else if (databaseErrorHandler != null) {
            this.mContext = context;
            this.mName = str;
            this.mFactory = cursorFactory;
            this.mNewVersion = i;
            this.mHook = sQLiteDatabaseHook;
            this.mErrorHandler = databaseErrorHandler;
        } else {
            throw new IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
        }
    }
}
