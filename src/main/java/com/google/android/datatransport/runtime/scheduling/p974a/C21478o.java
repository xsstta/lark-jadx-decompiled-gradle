package com.google.android.datatransport.runtime.scheduling.p974a;

import android.database.Cursor;
import com.google.android.datatransport.runtime.AbstractC21439l;
import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.o */
public final /* synthetic */ class C21478o implements C21468i.AbstractC21470a {

    /* renamed from: a */
    private final List f52117a;

    /* renamed from: b */
    private final AbstractC21439l f52118b;

    private C21478o(List list, AbstractC21439l lVar) {
        this.f52117a = list;
        this.f52118b = lVar;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21470a m77718a(List list, AbstractC21439l lVar) {
        return new C21478o(list, lVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21470a
    /* renamed from: a */
    public Object mo72739a(Object obj) {
        return C21468i.m77675a(this.f52117a, this.f52118b, (Cursor) obj);
    }
}
