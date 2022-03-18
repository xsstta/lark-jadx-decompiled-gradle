package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.backends.i */
class C21417i {

    /* renamed from: a */
    private final Context f52011a;

    /* renamed from: b */
    private final AbstractC21523a f52012b;

    /* renamed from: c */
    private final AbstractC21523a f52013c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC21416h mo72657a(String str) {
        return AbstractC21416h.m77486a(this.f52011a, this.f52012b, this.f52013c, str);
    }

    @Inject
    C21417i(Context context, AbstractC21523a aVar, AbstractC21523a aVar2) {
        this.f52011a = context;
        this.f52012b = aVar;
        this.f52013c = aVar2;
    }
}
