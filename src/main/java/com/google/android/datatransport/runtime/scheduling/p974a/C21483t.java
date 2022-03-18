package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.t */
public final /* synthetic */ class C21483t implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private static final C21483t f52123a = new C21483t();

    private C21483t() {
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77728a() {
        return f52123a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
