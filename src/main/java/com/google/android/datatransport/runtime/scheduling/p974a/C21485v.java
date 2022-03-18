package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.v */
final /* synthetic */ class C21485v implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final C21468i f52125a;

    /* renamed from: b */
    private final AbstractC21439l f52126b;

    /* renamed from: c */
    private final AbstractC21433h f52127c;

    private C21485v(C21468i iVar, AbstractC21439l lVar, AbstractC21433h hVar) {
        this.f52125a = iVar;
        this.f52126b = lVar;
        this.f52127c = hVar;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77732a(C21468i iVar, AbstractC21439l lVar, AbstractC21433h hVar) {
        return new C21485v(iVar, lVar, hVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return C21468i.m77667a(this.f52125a, this.f52126b, this.f52127c, (SQLiteDatabase) obj);
    }
}
