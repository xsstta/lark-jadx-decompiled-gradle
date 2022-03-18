package net.sqlcipher;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCursor implements CrossProcessCursor, Cursor {
    protected boolean mClosed = false;
    ContentObservable mContentObservable = new ContentObservable();
    protected ContentResolver mContentResolver;
    protected Long mCurrentRowID = null;
    DataSetObservable mDataSetObservable = new DataSetObservable();
    private Bundle mExtras = Bundle.EMPTY;
    private Uri mNotifyUri;
    protected int mPos = -1;
    protected int mRowIdColumnIndex = -1;
    private ContentObserver mSelfObserver;
    private final Object mSelfObserverLock = new Object();
    private boolean mSelfObserverRegistered;
    protected HashMap<Long, Map<String, Object>> mUpdatedRows = new HashMap<>();

    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        return false;
    }

    public boolean deleteRow() {
        return false;
    }

    public abstract String[] getColumnNames();

    public abstract int getCount();

    public abstract double getDouble(int i);

    public abstract float getFloat(int i);

    public abstract int getInt(int i);

    public abstract long getLong(int i);

    public abstract short getShort(int i);

    public abstract String getString(int i);

    @Override // net.sqlcipher.Cursor
    public abstract int getType(int i);

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public CursorWindow getWindow() {
        return null;
    }

    public abstract boolean isNull(int i);

    public boolean onMove(int i, int i2) {
        return true;
    }

    public void deactivate() {
        deactivateInternal();
    }

    /* access modifiers changed from: protected */
    public DataSetObservable getDataSetObservable() {
        return this.mDataSetObservable;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Uri getNotificationUri() {
        return this.mNotifyUri;
    }

    public final int getPosition() {
        return this.mPos;
    }

    public boolean isClosed() {
        return this.mClosed;
    }

    public boolean commitUpdates() {
        return commitUpdates(null);
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public void notifyDataSetChange() {
        this.mDataSetObservable.notifyChanged();
    }

    public void abortUpdates() {
        synchronized (this.mUpdatedRows) {
            this.mUpdatedRows.clear();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        deactivateInternal();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && this.mSelfObserverRegistered) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
        }
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.mPos == -1) {
            return true;
        }
        return false;
    }

    public final boolean isFirst() {
        if (this.mPos != 0 || getCount() == 0) {
            return false;
        }
        return true;
    }

    public final boolean isLast() {
        int count = getCount();
        if (this.mPos != count - 1 || count == 0) {
            return false;
        }
        return true;
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    public boolean supportsUpdates() {
        if (this.mRowIdColumnIndex != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    public void deactivateInternal() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    public boolean hasUpdates() {
        boolean z;
        synchronized (this.mUpdatedRows) {
            if (this.mUpdatedRows.size() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.mPos == getCount()) {
            return true;
        }
        return false;
    }

    public boolean requery() {
        ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public String getColumnName(int i) {
        return getColumnNames()[i];
    }

    public final boolean move(int i) {
        return moveToPosition(this.mPos + i);
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.mContentObservable.registerObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    public void setExtras(Bundle bundle) {
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        this.mExtras = bundle;
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
    }

    public boolean updateToNull(int i) {
        return update(i, null);
    }

    protected static class SelfContentObserver extends ContentObserver {
        WeakReference<AbstractCursor> mCursor;

        public boolean deliverSelfNotifications() {
            return false;
        }

        public SelfContentObserver(AbstractCursor abstractCursor) {
            super(null);
            this.mCursor = new WeakReference<>(abstractCursor);
        }

        public void onChange(boolean z) {
            AbstractCursor abstractCursor = this.mCursor.get();
            if (abstractCursor != null) {
                abstractCursor.onChange(false);
            }
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.mClosed) {
            this.mContentObservable.unregisterObserver(contentObserver);
        }
    }

    /* access modifiers changed from: protected */
    public Object getUpdatedField(int i) {
        return this.mUpdatedRows.get(this.mCurrentRowID).get(getColumnNames()[i]);
    }

    /* access modifiers changed from: protected */
    public void onChange(boolean z) {
        synchronized (this.mSelfObserverLock) {
            this.mContentObservable.dispatchChange(z);
            Uri uri = this.mNotifyUri;
            if (uri != null && z) {
                this.mContentResolver.notifyChange(uri, this.mSelfObserver);
            }
        }
    }

    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            Log.e("Cursor", "requesting column name with table name -- " + str, exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist");
    }

    /* access modifiers changed from: protected */
    public boolean isFieldUpdated(int i) {
        Map<String, Object> map;
        if (this.mRowIdColumnIndex == -1 || this.mUpdatedRows.size() <= 0 || (map = this.mUpdatedRows.get(this.mCurrentRowID)) == null || !map.containsKey(getColumnNames()[i])) {
            return false;
        }
        return true;
    }

    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        } else if (i < 0) {
            this.mPos = -1;
            return false;
        } else {
            int i2 = this.mPos;
            if (i == i2) {
                return true;
            }
            boolean onMove = onMove(i2, i);
            if (!onMove) {
                this.mPos = -1;
            } else {
                this.mPos = i;
                int i3 = this.mRowIdColumnIndex;
                if (i3 != -1) {
                    this.mCurrentRowID = Long.valueOf(getLong(i3));
                }
            }
            return onMove;
        }
    }

    public void fillWindow(int i, CursorWindow cursorWindow) {
        DatabaseUtils.cursorFillWindow(this, i, cursorWindow);
    }

    public boolean updateBlob(int i, byte[] bArr) {
        return update(i, bArr);
    }

    public boolean updateString(int i, String str) {
        return update(i, str);
    }

    public boolean updateDouble(int i, double d) {
        return update(i, Double.valueOf(d));
    }

    public boolean updateFloat(int i, float f) {
        return update(i, Float.valueOf(f));
    }

    public boolean updateInt(int i, int i2) {
        return update(i, Integer.valueOf(i2));
    }

    public boolean updateLong(int i, long j) {
        return update(i, Long.valueOf(j));
    }

    public boolean updateShort(int i, short s) {
        return update(i, Short.valueOf(s));
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.mSelfObserverLock) {
            this.mNotifyUri = uri;
            this.mContentResolver = contentResolver;
            ContentObserver contentObserver = this.mSelfObserver;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            SelfContentObserver selfContentObserver = new SelfContentObserver(this);
            this.mSelfObserver = selfContentObserver;
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
            this.mSelfObserverRegistered = true;
        }
    }

    public boolean update(int i, Object obj) {
        if (!supportsUpdates()) {
            return false;
        }
        Long valueOf = Long.valueOf(getLong(this.mRowIdColumnIndex));
        if (valueOf != null) {
            synchronized (this.mUpdatedRows) {
                Map<String, Object> map = this.mUpdatedRows.get(valueOf);
                if (map == null) {
                    map = new HashMap<>();
                    this.mUpdatedRows.put(valueOf, map);
                }
                map.put(getColumnNames()[i], obj);
            }
            return true;
        }
        throw new IllegalStateException("null rowid. mRowIdColumnIndex = " + this.mRowIdColumnIndex);
    }
}
