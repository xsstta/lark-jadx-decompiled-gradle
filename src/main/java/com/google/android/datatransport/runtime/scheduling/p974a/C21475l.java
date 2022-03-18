package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.l */
final /* synthetic */ class C21475l implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final C21468i f52113a;

    /* renamed from: b */
    private final AbstractC21439l f52114b;

    private C21475l(C21468i iVar, AbstractC21439l lVar) {
        this.f52113a = iVar;
        this.f52114b = lVar;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77712a(C21468i iVar, AbstractC21439l lVar) {
        return new C21475l(iVar, lVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return this.f52113a.m77691c((SQLiteDatabase) obj, this.f52114b);
    }
}
