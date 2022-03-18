package com.ss.android.lark.mail.impl.home.p2184d;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43336x;

/* renamed from: com.ss.android.lark.mail.impl.home.d.b */
public class C42493b implements AbstractC43336x {

    /* renamed from: a */
    private final C1177w<Boolean> f108154a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.d.b$a */
    public static final class C42495a {

        /* renamed from: a */
        public static C42493b f108155a = new C42493b();
    }

    /* renamed from: a */
    public static final C42493b m169603a() {
        return C42495a.f108155a;
    }

    /* renamed from: b */
    public C1177w<Boolean> mo152849b() {
        return this.f108154a;
    }

    private C42493b() {
        this.f108154a = new C1177w<>();
        Watchers.m167206a(this);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43336x
    /* renamed from: a */
    public void mo152848a(boolean z) {
        this.f108154a.mo5926a(Boolean.valueOf(z));
    }
}
