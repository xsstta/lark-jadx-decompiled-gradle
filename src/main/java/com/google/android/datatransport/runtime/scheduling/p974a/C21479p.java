package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.p */
public final /* synthetic */ class C21479p implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final Map f52119a;

    private C21479p(Map map) {
        this.f52119a = map;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77720a(Map map) {
        return new C21479p(map);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return C21468i.m77676a(this.f52119a, (Cursor) obj);
    }
}
