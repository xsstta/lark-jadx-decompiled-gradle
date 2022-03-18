package com.commonsware.cwac.saferoom;

import androidx.p038g.p039a.AbstractC1088d;
import net.sqlcipher.database.SQLiteProgram;

/* renamed from: com.commonsware.cwac.saferoom.d */
class C20939d implements AbstractC1088d {

    /* renamed from: a */
    private final SQLiteProgram f51272a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51272a.close();
    }

    C20939d(SQLiteProgram sQLiteProgram) {
        this.f51272a = sQLiteProgram;
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindNull(int i) {
        this.f51272a.bindNull(i);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindBlob(int i, byte[] bArr) {
        this.f51272a.bindBlob(i, bArr);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindDouble(int i, double d) {
        this.f51272a.bindDouble(i, d);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindLong(int i, long j) {
        this.f51272a.bindLong(i, j);
    }

    @Override // androidx.p038g.p039a.AbstractC1088d
    public void bindString(int i, String str) {
        this.f51272a.bindString(i, str);
    }
}
