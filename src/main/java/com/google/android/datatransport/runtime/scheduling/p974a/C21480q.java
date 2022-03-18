package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.q */
public final /* synthetic */ class C21480q implements C21468i.AbstractC21472c {

    /* renamed from: a */
    private final SQLiteDatabase f52120a;

    private C21480q(SQLiteDatabase sQLiteDatabase) {
        this.f52120a = sQLiteDatabase;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21472c m77722a(SQLiteDatabase sQLiteDatabase) {
        return new C21480q(sQLiteDatabase);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21472c
    /* renamed from: a */
    public Object mo72740a() {
        return this.f52120a.beginTransaction();
    }
}
