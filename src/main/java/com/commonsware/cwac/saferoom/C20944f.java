package com.commonsware.cwac.saferoom;

import androidx.p038g.p039a.AbstractC1090f;
import net.sqlcipher.database.SQLiteStatement;

/* renamed from: com.commonsware.cwac.saferoom.f */
class C20944f extends C20939d implements AbstractC1090f {

    /* renamed from: a */
    private final SQLiteStatement f51281a;

    @Override // androidx.p038g.p039a.AbstractC1090f
    public long executeInsert() {
        return this.f51281a.executeInsert();
    }

    @Override // androidx.p038g.p039a.AbstractC1090f
    public int executeUpdateDelete() {
        return this.f51281a.executeUpdateDelete();
    }

    C20944f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f51281a = sQLiteStatement;
    }
}
