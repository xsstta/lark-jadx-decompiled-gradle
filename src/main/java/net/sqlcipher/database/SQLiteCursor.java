package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

public class SQLiteCursor extends AbstractWindowedCursor {
    private boolean fillWindowForwardOnly;
    private Map<String, Integer> mColumnNameMap;
    private String[] mColumns;
    public int mCount = -1;
    public int mCursorState;
    private int mCursorWindowCapacity;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    private int mInitialRead = Integer.MAX_VALUE;
    public ReentrantLock mLock;
    public int mMaxRead = Integer.MAX_VALUE;
    protected MainThreadNotificationHandler mNotificationHandler;
    public boolean mPendingData;
    public SQLiteQuery mQuery;
    private Throwable mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // net.sqlcipher.AbstractCursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    /* access modifiers changed from: private */
    public final class QueryThread implements Runnable {
        private final int mThreadState;

        private void sendMessage() {
            if (SQLiteCursor.this.mNotificationHandler != null) {
                SQLiteCursor.this.mNotificationHandler.sendEmptyMessage(1);
                SQLiteCursor.this.mPendingData = false;
                return;
            }
            SQLiteCursor.this.mPendingData = true;
        }

        public void run() {
            CursorWindow cursorWindow = SQLiteCursor.this.mWindow;
            Process.setThreadPriority(Process.myTid(), 10);
            while (true) {
                if (SQLiteCursor.this.mLock == null) {
                    SQLiteCursor.this.mLock = new ReentrantLock(true);
                }
                SQLiteCursor.this.mLock.lock();
                if (SQLiteCursor.this.mCursorState != this.mThreadState) {
                    SQLiteCursor.this.mLock.unlock();
                    return;
                }
                try {
                    int fillWindow = SQLiteCursor.this.mQuery.fillWindow(cursorWindow, SQLiteCursor.this.mMaxRead, SQLiteCursor.this.mCount);
                    if (fillWindow != 0) {
                        if (fillWindow != -1) {
                            SQLiteCursor.this.mCount = fillWindow;
                            sendMessage();
                            break;
                        }
                        SQLiteCursor.this.mCount += SQLiteCursor.this.mMaxRead;
                        sendMessage();
                        SQLiteCursor.this.mLock.unlock();
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    SQLiteCursor.this.mLock.unlock();
                    throw th;
                }
            }
            SQLiteCursor.this.mLock.unlock();
        }

        QueryThread(int i) {
            this.mThreadState = i;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /* access modifiers changed from: protected */
    @Override // net.sqlcipher.AbstractCursor, java.lang.Object
    public void finalize() {
        try {
            if (this.mWindow != null) {
                this.mQuery.mSql.length();
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        boolean z;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            SQLiteDatabase sQLiteDatabase = this.mDatabase;
            String str = this.mEditTable;
            sQLiteDatabase.delete(str, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
            z = true;
        } catch (SQLException unused) {
            z = false;
        }
        try {
            int i = this.mPos;
            requery();
            moveToPosition(i);
            if (!z) {
                return false;
            }
            onChange(true);
            return true;
        } finally {
            this.mDatabase.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // net.sqlcipher.AbstractCursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mQuery.requery();
                queryThreadUnlock();
                this.mDatabase.unlock();
                return super.requery();
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.mDatabase.unlock();
            throw th2;
        }
    }

    public void setFillWindowForwardOnly(boolean z) {
        this.fillWindowForwardOnly = z;
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    /* access modifiers changed from: protected */
    public static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap hashMap = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = hashMap;
        }
        if (str.lastIndexOf(46) != -1) {
            new Exception();
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    private void fillWindow(int i) {
        int i2;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i2 = i;
        } else if (this.mCount == -1) {
            i2 = cursorPickFillWindowStartPosition(i, 0);
        } else {
            i2 = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i2);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = i2 + this.mInitialRead;
            new_insert_after_java_lang_Thread_by_knot(new Thread(new QueryThread(this.mCursorState), "query thread")).start();
        }
    }

    /* JADX INFO: finally extract failed */
    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            try {
                StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
                for (Map.Entry entry : this.mUpdatedRows.entrySet()) {
                    Map map2 = (Map) entry.getValue();
                    Long l = (Long) entry.getKey();
                    if (l == null || map2 == null) {
                        throw new IllegalStateException("null rowId or values found! rowId = " + l + ", values = " + map2);
                    } else if (map2.size() != 0) {
                        long longValue = l.longValue();
                        Iterator it = map2.entrySet().iterator();
                        sb.setLength(0);
                        sb.append("UPDATE " + this.mEditTable + " SET ");
                        Object[] objArr = new Object[map2.size()];
                        int i = 0;
                        while (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            sb.append((String) entry2.getKey());
                            sb.append("=?");
                            objArr[i] = entry2.getValue();
                            if (it.hasNext()) {
                                sb.append(", ");
                            }
                            i++;
                        }
                        sb.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + longValue);
                        sb.append(';');
                        this.mDatabase.execSQL(sb.toString(), objArr);
                        this.mDatabase.rowUpdated(this.mEditTable, longValue);
                    }
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            } catch (Throwable th) {
                this.mDatabase.endTransaction();
                throw th;
            }
        }
    }

    public int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new ReentrantLock(true);
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean onMove(int i, int i2) {
        if (this.mWindow != null && i2 >= this.mWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        int i2;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
            } finally {
                queryThreadUnlock();
            }
        }
        if (this.fillWindowForwardOnly) {
            i2 = i;
        } else if (this.mCount == -1) {
            i2 = cursorPickFillWindowStartPosition(i, 0);
        } else {
            i2 = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(i2);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = i2 + this.mInitialRead;
            new_insert_after_java_lang_Thread_by_knot(new Thread(new QueryThread(this.mCursorState), "query thread")).start();
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mColumnNameMap = null;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int columnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[columnCountLocked];
            for (int i = 0; i < columnCountLocked; i++) {
                String columnNameLocked = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = columnNameLocked;
                if ("_id".equals(columnNameLocked)) {
                    this.mRowIdColumnIndex = i;
                }
            }
        } finally {
            sQLiteDatabase.unlock();
        }
    }
}
