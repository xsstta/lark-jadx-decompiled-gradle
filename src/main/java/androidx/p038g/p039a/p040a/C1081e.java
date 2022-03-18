package androidx.p038g.p039a.p040a;

import android.database.sqlite.SQLiteStatement;
import androidx.p038g.p039a.AbstractC1090f;

/* renamed from: androidx.g.a.a.e */
class C1081e extends C1080d implements AbstractC1090f {

    /* renamed from: a */
    private final SQLiteStatement f4068a;

    @Override // androidx.p038g.p039a.AbstractC1090f
    public long executeInsert() {
        return this.f4068a.executeInsert();
    }

    @Override // androidx.p038g.p039a.AbstractC1090f
    public int executeUpdateDelete() {
        return this.f4068a.executeUpdateDelete();
    }

    C1081e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f4068a = sQLiteStatement;
    }
}
