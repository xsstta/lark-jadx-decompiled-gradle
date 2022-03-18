package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;
import net.sqlcipher.AbstractCursor;

public final class BulkCursorToCursorAdaptor extends AbstractWindowedCursor {
    private IBulkCursor mBulkCursor;
    private String[] mColumns;
    private int mCount;
    private AbstractCursor.SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    @Override // net.sqlcipher.AbstractCursor, net.sqlcipher.AbstractWindowedCursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getCount() {
        return this.mCount;
    }

    @Override // net.sqlcipher.AbstractCursor
    public Bundle getExtras() {
        try {
            return this.mBulkCursor.getExtras();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // net.sqlcipher.AbstractCursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            this.mBulkCursor.close();
        } catch (RemoteException unused) {
            Log.w("BulkCursor", "Remote process exception when closing");
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor
    public void deactivate() {
        super.deactivate();
        try {
            this.mBulkCursor.deactivate();
        } catch (RemoteException unused) {
            Log.w("BulkCursor", "Remote process exception when deactivating");
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor
    public String[] getColumnNames() {
        if (this.mColumns == null) {
            try {
                this.mColumns = this.mBulkCursor.getColumnNames();
            } catch (RemoteException unused) {
                Log.e("BulkCursor", "Unable to fetch column names because the remote process is dead");
                return null;
            }
        }
        return this.mColumns;
    }

    public synchronized IContentObserver getObserver() {
        if (this.mObserverBridge == null) {
            this.mObserverBridge = new AbstractCursor.SelfContentObserver(this);
        }
        return null;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        try {
            boolean deleteRow = this.mBulkCursor.deleteRow(this.mPos);
            if (deleteRow) {
                this.mWindow = null;
                this.mCount = this.mBulkCursor.count();
                int i = this.mPos;
                int i2 = this.mCount;
                if (i < i2) {
                    int i3 = this.mPos;
                    this.mPos = -1;
                    moveToPosition(i3);
                } else {
                    this.mPos = i2;
                }
                onChange(true);
            }
            return deleteRow;
        } catch (RemoteException unused) {
            Log.e("BulkCursor", "Unable to delete row because the remote process is dead");
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean requery() {
        try {
            int requery = this.mBulkCursor.requery(getObserver(), new CursorWindow(false));
            this.mCount = requery;
            if (requery != -1) {
                this.mPos = -1;
                this.mWindow = null;
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (Exception e) {
            Log.e("BulkCursor", "Unable to requery because the remote process exception " + e.getMessage());
            deactivate();
            return false;
        }
    }

    public static int findRowIdColumnIndex(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor
    public Bundle respond(Bundle bundle) {
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (RemoteException e) {
            Log.w("BulkCursor", "respond() threw RemoteException, returning an empty bundle.", e);
            return Bundle.EMPTY;
        }
    }

    public void set(IBulkCursor iBulkCursor) {
        this.mBulkCursor = iBulkCursor;
        try {
            this.mCount = iBulkCursor.count();
            this.mWantsAllOnMoveCalls = this.mBulkCursor.getWantsAllOnMoveCalls();
            String[] columnNames = this.mBulkCursor.getColumnNames();
            this.mColumns = columnNames;
            this.mRowIdColumnIndex = findRowIdColumnIndex(columnNames);
        } catch (RemoteException unused) {
            Log.e("BulkCursor", "Setup failed because the remote process is dead");
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            Log.e("BulkCursor", "commitUpdates not supported on this cursor, did you include the _id column?");
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
            }
            if (this.mUpdatedRows.size() <= 0) {
                return false;
            }
            try {
                boolean updateRows = this.mBulkCursor.updateRows(this.mUpdatedRows);
                if (updateRows) {
                    this.mUpdatedRows.clear();
                    onChange(true);
                }
                return updateRows;
            } catch (RemoteException unused) {
                Log.e("BulkCursor", "Unable to commit updates because the remote process is dead");
                return false;
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean onMove(int i, int i2) {
        try {
            if (this.mWindow != null) {
                if (i2 >= this.mWindow.getStartPosition()) {
                    if (i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
                        if (this.mWantsAllOnMoveCalls) {
                            this.mBulkCursor.onMove(i2);
                        }
                    }
                }
                this.mWindow = this.mBulkCursor.getWindow(i2);
            } else {
                this.mWindow = this.mBulkCursor.getWindow(i2);
            }
            if (this.mWindow == null) {
                return false;
            }
            return true;
        } catch (RemoteException unused) {
            Log.e("BulkCursor", "Unable to get window because the remote process is dead");
            return false;
        }
    }

    public void set(IBulkCursor iBulkCursor, int i, int i2) {
        this.mBulkCursor = iBulkCursor;
        this.mColumns = null;
        this.mCount = i;
        this.mRowIdColumnIndex = i2;
    }
}
