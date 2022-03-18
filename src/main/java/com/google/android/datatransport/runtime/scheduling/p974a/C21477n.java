package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.n */
final /* synthetic */ class C21477n implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final long f52116a;

    private C21477n(long j) {
        this.f52116a = j;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77716a(long j) {
        return new C21477n(j);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f52116a)}));
    }
}
