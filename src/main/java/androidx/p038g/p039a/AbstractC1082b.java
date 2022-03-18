package androidx.p038g.p039a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: androidx.g.a.b */
public interface AbstractC1082b extends Closeable {
    void beginTransaction();

    AbstractC1090f compileStatement(String str);

    int delete(String str, String str2, Object[] objArr);

    void disableWriteAheadLogging();

    void endTransaction();

    void execSQL(String str) throws SQLException;

    List<Pair<String, String>> getAttachedDbs();

    String getPath();

    boolean inTransaction();

    long insert(String str, int i, ContentValues contentValues) throws SQLException;

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(AbstractC1089e eVar);

    Cursor query(String str);

    void setTransactionSuccessful();

    int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr);
}
