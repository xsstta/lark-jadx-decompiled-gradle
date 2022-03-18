package com.commonsware.cwac.saferoom;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1089e;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.p038g.p039a.C1073a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.List;
import net.sqlcipher.database.SQLiteCursor;
import net.sqlcipher.database.SQLiteCursorDriver;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteQuery;

/* renamed from: com.commonsware.cwac.saferoom.b */
class C20933b implements AbstractC1082b {

    /* renamed from: a */
    private static final String[] f51259a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private final SQLiteDatabase f51260b;

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void beginTransaction() {
        this.f51260b.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51260b.close();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void disableWriteAheadLogging() {
        this.f51260b.disableWriteAheadLogging();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void endTransaction() {
        this.f51260b.endTransaction();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f51260b.getAttachedDbs();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public String getPath() {
        return this.f51260b.getPath();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean isOpen() {
        return this.f51260b.isOpen();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean isWriteAheadLoggingEnabled() {
        return this.f51260b.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void setTransactionSuccessful() {
        this.f51260b.setTransactionSuccessful();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean inTransaction() {
        if (this.f51260b.isOpen()) {
            return this.f51260b.inTransaction();
        }
        throw new IllegalStateException("You should not be doing this on a closed database");
    }

    C20933b(SQLiteDatabase sQLiteDatabase) {
        this.f51260b = sQLiteDatabase;
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void execSQL(String str) throws SQLException {
        this.f51260b.execSQL(str);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public Cursor query(AbstractC1089e eVar) {
        return mo70776a(eVar, null);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public AbstractC1090f compileStatement(String str) {
        return new C20944f(this.f51260b.compileStatement(str));
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public Cursor query(String str) {
        return query(new C1073a(str));
    }

    /* renamed from: a */
    public Cursor mo70776a(final AbstractC1089e eVar, CancellationSignal cancellationSignal) {
        C20932a aVar = new C20932a();
        eVar.mo5695a(aVar);
        return this.f51260b.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            /* class com.commonsware.cwac.saferoom.C20933b.C209341 */

            @Override // net.sqlcipher.database.SQLiteDatabase.CursorFactory
            public net.sqlcipher.Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo5695a(new C20939d(sQLiteQuery));
                return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo5696b(), aVar.mo70774b(), null);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public long insert(String str, int i, ContentValues contentValues) {
        return this.f51260b.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb.append(str3);
        AbstractC1090f compileStatement = compileStatement(sb.toString());
        try {
            C1073a.m5178a(compileStatement, objArr);
            try {
                return compileStatement.executeUpdateDelete();
            } catch (Exception e) {
                throw new RuntimeException("Exception attempting to close statement", e);
            }
        } finally {
            try {
                compileStatement.close();
            } catch (Exception e2) {
                throw new RuntimeException("Exception attempting to close statement", e2);
            }
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2;
        String str3;
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder((int) SmEvents.EVENT_NW);
        sb.append("UPDATE ");
        sb.append(f51259a[i]);
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        if (objArr == null) {
            i2 = size;
        } else {
            i2 = objArr.length + size;
        }
        Object[] objArr2 = new Object[i2];
        int i3 = 0;
        for (String str4 : contentValues.keySet()) {
            if (i3 > 0) {
                str3 = ",";
            } else {
                str3 = "";
            }
            sb.append(str3);
            sb.append(str4);
            objArr2[i3] = contentValues.get(str4);
            sb.append("=?");
            i3++;
        }
        if (objArr != null) {
            for (int i4 = size; i4 < i2; i4++) {
                objArr2[i4] = objArr[i4 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        AbstractC1090f compileStatement = compileStatement(sb.toString());
        try {
            C1073a.m5178a(compileStatement, objArr2);
            try {
                return compileStatement.executeUpdateDelete();
            } catch (Exception e) {
                throw new RuntimeException("Exception attempting to close statement", e);
            }
        } finally {
            try {
                compileStatement.close();
            } catch (Exception e2) {
                throw new RuntimeException("Exception attempting to close statement", e2);
            }
        }
    }
}
