package androidx.p038g.p039a.p040a;

import android.database.sqlite.SQLiteProgram;
import androidx.p038g.p039a.AbstractC1088d;

/* renamed from: androidx.g.a.a.d */
class C1080d implements AbstractC1088d {

    /* renamed from: a */
    private final SQLiteProgram f4067a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4067a.close();
    }

    C1080d(SQLiteProgram sQLiteProgram) {
        this.f4067a = sQLiteProgram;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        this.f4067a.bindNull(i);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindBlob(int i, byte[] bArr) {
        this.f4067a.bindBlob(i, bArr);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        this.f4067a.bindDouble(i, d);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        this.f4067a.bindLong(i, j);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        this.f4067a.bindString(i, str);
    }
}
