package net.sqlcipher.database;

import android.util.Log;

/* access modifiers changed from: package-private */
public class SQLiteCompiledSql {
    SQLiteDatabase mDatabase;
    private boolean mInUse;
    private String mSqlStmt;
    private Throwable mStackTrace;
    long nHandle;
    long nStatement;

    private final native void native_compile(String str);

    private final native void native_finalize();

    /* access modifiers changed from: package-private */
    public synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v("SQLiteCompiledSql", "Acquired DbObj (id#" + this.nStatement + ") from DB cache");
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v("SQLiteCompiledSql", "Released DbObj (id#" + this.nStatement + ") back to DB cache");
        }
        this.mInUse = false;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.nStatement != 0) {
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    Log.v("SQLiteCompiledSql", "** warning ** Finalized DbObj (id#" + this.nStatement + ")");
                }
                int length = this.mSqlStmt.length();
                StringBuilder sb = new StringBuilder();
                sb.append("Releasing statement in a finalizer. Please ensure that you explicitly call close() on your cursor: ");
                String str = this.mSqlStmt;
                if (length > 100) {
                    length = 100;
                }
                sb.append(str.substring(0, length));
                Log.w("SQLiteCompiledSql", sb.toString(), this.mStackTrace);
                releaseSqlStatement();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v("SQLiteCompiledSql", "closed and deallocated DbObj (id#" + this.nStatement + ")");
            }
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase.isOpen()) {
            this.mDatabase = sQLiteDatabase;
            this.mSqlStmt = str;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.nHandle = sQLiteDatabase.mNativeHandle;
            compile(str, true);
            return;
        }
        throw new IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        } else if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }
}
