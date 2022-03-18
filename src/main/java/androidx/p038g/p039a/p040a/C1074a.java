package androidx.p038g.p039a.p040a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.text.TextUtils;
import android.util.Pair;
import androidx.p038g.p039a.AbstractC1082b;
import androidx.p038g.p039a.AbstractC1089e;
import androidx.p038g.p039a.AbstractC1090f;
import androidx.p038g.p039a.C1073a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.g.a.a.a */
class C1074a implements AbstractC1082b {

    /* renamed from: a */
    private static final String[] f4056a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: b */
    private static final String[] f4057b = new String[0];

    /* renamed from: c */
    private final SQLiteDatabase f4058c;

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void beginTransaction() {
        this.f4058c.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4058c.close();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void disableWriteAheadLogging() {
        this.f4058c.disableWriteAheadLogging();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void endTransaction() {
        this.f4058c.endTransaction();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public List<Pair<String, String>> getAttachedDbs() {
        return this.f4058c.getAttachedDbs();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public String getPath() {
        return this.f4058c.getPath();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean inTransaction() {
        return this.f4058c.inTransaction();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean isOpen() {
        return this.f4058c.isOpen();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public boolean isWriteAheadLoggingEnabled() {
        return this.f4058c.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void setTransactionSuccessful() {
        this.f4058c.setTransactionSuccessful();
    }

    C1074a(SQLiteDatabase sQLiteDatabase) {
        this.f4058c = sQLiteDatabase;
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public void execSQL(String str) throws SQLException {
        this.f4058c.execSQL(str);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public AbstractC1090f compileStatement(String str) {
        return new C1081e(this.f4058c.compileStatement(str));
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public Cursor query(String str) {
        return query(new C1073a(str));
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public Cursor query(final AbstractC1089e eVar) {
        return this.f4058c.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            /* class androidx.p038g.p039a.p040a.C1074a.C10751 */

            public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                eVar.mo5695a(new C1080d(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, eVar.mo5696b(), f4057b, null);
    }

    @Override // androidx.p038g.p039a.AbstractC1082b
    public long insert(String str, int i, ContentValues contentValues) throws SQLException {
        return this.f4058c.insertWithOnConflict(str, null, contentValues, i);
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
        C1073a.m5178a(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
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
        sb.append(f4056a[i]);
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
        C1073a.m5178a(compileStatement, objArr2);
        return compileStatement.executeUpdateDelete();
    }
}
