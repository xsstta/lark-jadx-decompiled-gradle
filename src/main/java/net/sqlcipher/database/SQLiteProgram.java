package net.sqlcipher.database;

import android.util.Log;
import androidx.p038g.p039a.AbstractC1088d;

public abstract class SQLiteProgram extends SQLiteClosable implements AbstractC1088d {
    boolean mClosed;
    private SQLiteCompiledSql mCompiledSql;
    protected SQLiteDatabase mDatabase;
    final String mSql;
    protected long nHandle;
    protected long nStatement;

    private final native void native_clear_bindings();

    /* access modifiers changed from: protected */
    public void compile(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    public final native void native_bind_blob(int i, byte[] bArr);

    /* access modifiers changed from: protected */
    public final native void native_bind_double(int i, double d);

    /* access modifiers changed from: protected */
    public final native void native_bind_long(int i, long j);

    /* access modifiers changed from: protected */
    public final native void native_bind_null(int i);

    /* access modifiers changed from: protected */
    public final native void native_bind_string(int i, String str);

    /* access modifiers changed from: protected */
    public final native void native_compile(String str);

    /* access modifiers changed from: protected */
    public final native void native_finalize();

    /* access modifiers changed from: package-private */
    public String getSqlString() {
        return this.mSql;
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    /* access modifiers changed from: protected */
    @Override // net.sqlcipher.database.SQLiteClosable
    public void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    /* access modifiers changed from: protected */
    @Override // net.sqlcipher.database.SQLiteClosable
    public void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql != null) {
            synchronized (this.mDatabase.mCompiledQueries) {
                if (!this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                    this.mCompiledSql.releaseSqlStatement();
                    this.mCompiledSql = null;
                    this.nStatement = 0;
                } else {
                    this.mCompiledSql.release();
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mDatabase.unlock();
                this.mClosed = true;
            } catch (Throwable th) {
                this.mDatabase.unlock();
                throw th;
            }
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_clear_bindings();
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_null(i);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("the bind value at index " + i + " is null");
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_blob(i, bArr);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_double(i, d);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_long(i, j);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException("the bind value at index " + i + " is null");
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_string(i, str);
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.mDatabase = sQLiteDatabase;
        String trim = str.trim();
        this.mSql = trim;
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        trim = trim.length() >= 6 ? trim.substring(0, 6) : trim;
        if (trim.equalsIgnoreCase("INSERT") || trim.equalsIgnoreCase("UPDATE") || trim.equalsIgnoreCase("REPLAC") || trim.equalsIgnoreCase("DELETE") || trim.equalsIgnoreCase("SELECT")) {
            SQLiteCompiledSql compiledStatementForSql = sQLiteDatabase.getCompiledStatementForSql(str);
            this.mCompiledSql = compiledStatementForSql;
            if (compiledStatementForSql == null) {
                SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                this.mCompiledSql = sQLiteCompiledSql;
                sQLiteCompiledSql.acquire();
                sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    Log.v("SQLiteProgram", "Created DbObj (id#" + this.mCompiledSql.nStatement + ") for sql: " + str);
                }
            } else if (!compiledStatementForSql.acquire()) {
                long j = this.mCompiledSql.nStatement;
                this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    Log.v("SQLiteProgram", "** possible bug ** Created NEW DbObj (id#" + this.mCompiledSql.nStatement + ") because the previously created DbObj (id#" + j + ") was not released for sql:" + str);
                }
            }
            this.nStatement = this.mCompiledSql.nStatement;
            return;
        }
        SQLiteCompiledSql sQLiteCompiledSql2 = new SQLiteCompiledSql(sQLiteDatabase, str);
        this.mCompiledSql = sQLiteCompiledSql2;
        this.nStatement = sQLiteCompiledSql2.nStatement;
    }
}
