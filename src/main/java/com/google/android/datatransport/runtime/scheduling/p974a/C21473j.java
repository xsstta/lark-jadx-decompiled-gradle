package com.google.android.datatransport.runtime.scheduling.p974a;

import com.google.android.datatransport.runtime.scheduling.p974a.C21468i;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.j */
public final /* synthetic */ class C21473j implements C21468i.AbstractC21472c {

    /* renamed from: a */
    private final C21454ab f52110a;

    private C21473j(C21454ab abVar) {
        this.f52110a = abVar;
    }

    /* renamed from: a */
    public static C21468i.AbstractC21472c m77708a(C21454ab abVar) {
        return new C21473j(abVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.C21468i.AbstractC21472c
    /* renamed from: a */
    public Object mo72740a() {
        return this.f52110a.getWritableDatabase();
    }
}
