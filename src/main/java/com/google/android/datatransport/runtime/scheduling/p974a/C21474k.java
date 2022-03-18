package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.k */
final /* synthetic */ class C21474k implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final long f52111a;

    /* renamed from: b */
    private final AbstractC21439l f52112b;

    private C21474k(long j, AbstractC21439l lVar) {
        this.f52111a = j;
        this.f52112b = lVar;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77710a(long j, AbstractC21439l lVar) {
        return new C21474k(j, lVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return C21468i.m77668a(this.f52111a, this.f52112b, (SQLiteDatabase) obj);
    }
}
