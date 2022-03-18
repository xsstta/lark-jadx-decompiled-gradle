package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.p974a.C21454ab;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.ae */
final /* synthetic */ class C21458ae implements C21454ab.AbstractC21455a {

    /* renamed from: a */
    private static final C21458ae f52094a = new C21458ae();

    private C21458ae() {
    }

    /* renamed from: a */
    public static C21454ab.AbstractC21455a m77624a() {
        return f52094a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21454ab.AbstractC21455a
    /* renamed from: a */
    public void mo72718a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
