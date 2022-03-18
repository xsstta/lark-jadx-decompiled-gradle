package net.sqlcipher.database;

import android.os.SystemClock;
import androidx.p038g.p039a.AbstractC1090f;

public class SQLiteStatement extends SQLiteProgram implements AbstractC1090f {
    private final native long native_1x1_long();

    private final native String native_1x1_string();

    private final native void native_execute();

    public void execute() {
        if (this.mDatabase.isOpen()) {
            SystemClock.uptimeMillis();
            this.mDatabase.lock();
            acquireReference();
            try {
                native_execute();
            } finally {
                releaseReference();
                this.mDatabase.unlock();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1090f
    public long executeInsert() {
        long j;
        if (this.mDatabase.isOpen()) {
            SystemClock.uptimeMillis();
            this.mDatabase.lock();
            acquireReference();
            try {
                native_execute();
                if (this.mDatabase.lastChangeCount() > 0) {
                    j = this.mDatabase.lastInsertRow();
                } else {
                    j = -1;
                }
                return j;
            } finally {
                releaseReference();
                this.mDatabase.unlock();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1090f
    public int executeUpdateDelete() {
        if (this.mDatabase.isOpen()) {
            SystemClock.uptimeMillis();
            this.mDatabase.lock();
            acquireReference();
            try {
                native_execute();
                return this.mDatabase.lastChangeCount();
            } finally {
                releaseReference();
                this.mDatabase.unlock();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public long simpleQueryForLong() {
        if (this.mDatabase.isOpen()) {
            SystemClock.uptimeMillis();
            this.mDatabase.lock();
            acquireReference();
            try {
                return native_1x1_long();
            } finally {
                releaseReference();
                this.mDatabase.unlock();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    public String simpleQueryForString() {
        if (this.mDatabase.isOpen()) {
            SystemClock.uptimeMillis();
            this.mDatabase.lock();
            acquireReference();
            try {
                return native_1x1_string();
            } finally {
                releaseReference();
                this.mDatabase.unlock();
            }
        } else {
            throw new IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
    }

    SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str);
    }
}
