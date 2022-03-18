package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.x */
final /* synthetic */ class C21487x implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final String f52129a;

    private C21487x(String str) {
        this.f52129a = str;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77736a(String str) {
        return new C21487x(str);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return C21468i.m77673a(this.f52129a, (SQLiteDatabase) obj);
    }
}
