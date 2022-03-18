package net.sqlcipher.database;

import android.os.SystemClock;
import android.util.Log;
import net.sqlcipher.CursorWindow;

public class SQLiteQuery extends SQLiteProgram {
    private String[] mBindArgs;
    private Object[] mObjectBindArgs;
    private int mOffsetIndex;

    private final native int native_column_count();

    private final native String native_column_name(int i);

    private final native int native_fill_window(CursorWindow cursorWindow, int i, int i2, int i3, int i4, int i5);

    /* access modifiers changed from: package-private */
    public int columnCountLocked() {
        acquireReference();
        try {
            return native_column_count();
        } finally {
            releaseReference();
        }
    }

    public String toString() {
        return "SQLiteQuery: " + this.mSql;
    }

    /* access modifiers changed from: package-private */
    public void requery() {
        String[] strArr = this.mBindArgs;
        if (strArr != null) {
            int length = strArr.length;
            try {
                Object[] objArr = this.mObjectBindArgs;
                if (objArr != null) {
                    bindArguments(objArr);
                    return;
                }
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    super.bindString(i2, this.mBindArgs[i]);
                    i = i2;
                }
            } catch (SQLiteMisuseException e) {
                StringBuilder sb = new StringBuilder("mSql " + this.mSql);
                for (int i3 = 0; i3 < length; i3++) {
                    sb.append(" ");
                    sb.append(this.mBindArgs[i3]);
                }
                sb.append(" ");
                throw new IllegalStateException(sb.toString(), e);
            }
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram, androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        this.mBindArgs[i - 1] = null;
        if (!this.mClosed) {
            super.bindNull(i);
        }
    }

    /* access modifiers changed from: package-private */
    public String columnNameLocked(int i) {
        acquireReference();
        try {
            return native_column_name(i);
        } finally {
            releaseReference();
        }
    }

    public void bindArguments(Object[] objArr) {
        long j;
        if (objArr != null && objArr.length > 0) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    bindNull(i + 1);
                } else if (obj instanceof Double) {
                    bindDouble(i + 1, ((Double) obj).doubleValue());
                } else if (obj instanceof Float) {
                    bindDouble(i + 1, Double.valueOf((double) ((Number) obj).floatValue()).doubleValue());
                } else if (obj instanceof Long) {
                    bindLong(i + 1, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    bindLong(i + 1, Long.valueOf((long) ((Number) obj).intValue()).longValue());
                } else if (obj instanceof Boolean) {
                    int i2 = i + 1;
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    bindLong(i2, j);
                } else if (obj instanceof byte[]) {
                    bindBlob(i + 1, (byte[]) obj);
                } else {
                    bindString(i + 1, obj.toString());
                }
            }
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram, androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        this.mBindArgs[i - 1] = str;
        if (!this.mClosed) {
            super.bindString(i, str);
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram, androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        this.mBindArgs[i - 1] = Double.toString(d);
        if (!this.mClosed) {
            super.bindDouble(i, d);
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram, androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        this.mBindArgs[i - 1] = Long.toString(j);
        if (!this.mClosed) {
            super.bindLong(i, j);
        }
    }

    /* access modifiers changed from: package-private */
    public int fillWindow(CursorWindow cursorWindow, int i, int i2) {
        int i3;
        SystemClock.uptimeMillis();
        this.mDatabase.lock();
        try {
            acquireReference();
            try {
                cursorWindow.acquireReference();
                i3 = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), cursorWindow.getRequiredPosition(), this.mOffsetIndex, i, i2);
                if (SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                    Log.d("Cursor", "fillWindow(): " + this.mSql);
                }
            } catch (IllegalStateException unused) {
                i3 = 0;
            } catch (SQLiteDatabaseCorruptException e) {
                this.mDatabase.onCorruption();
                throw e;
            } catch (Throwable th) {
                cursorWindow.releaseReference();
                throw th;
            }
            cursorWindow.releaseReference();
            return i3;
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, String[] strArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mBindArgs = strArr;
    }

    SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, int i, Object[] objArr) {
        super(sQLiteDatabase, str);
        int i2;
        this.mOffsetIndex = i;
        this.mObjectBindArgs = objArr;
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        this.mBindArgs = new String[i2];
    }
}
