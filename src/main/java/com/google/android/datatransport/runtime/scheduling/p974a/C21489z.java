package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.z */
final /* synthetic */ class C21489z implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final C21468i f52131a;

    /* renamed from: b */
    private final AbstractC21439l f52132b;

    private C21489z(C21468i iVar, AbstractC21439l lVar) {
        this.f52131a = iVar;
        this.f52132b = lVar;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77740a(C21468i iVar, AbstractC21439l lVar) {
        return new C21489z(iVar, lVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return C21468i.m77684b(this.f52131a, this.f52132b, (SQLiteDatabase) obj);
    }
}
