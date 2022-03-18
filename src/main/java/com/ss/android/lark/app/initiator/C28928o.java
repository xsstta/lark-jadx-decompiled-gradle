package com.ss.android.lark.app.initiator;

import android.content.Context;
import android.content.res.Configuration;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.platform.statistics.perf.C51995b;

/* renamed from: com.ss.android.lark.app.initiator.o */
public class C28928o implements AbstractC28914d {

    /* renamed from: a */
    private AbstractC28915e f72543a;

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102660a(Configuration configuration) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102662b(Configuration configuration) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: d */
    public void mo102664d(Context context) {
        this.f72543a.mo102529d(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: c */
    public void mo102663c(Context context) {
        C51959a.m201538g();
        this.f72543a.mo102528c(context);
        C51959a.m201539h();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: a */
    public void mo102659a(Context context) {
        C51959a.m201529a(context, false);
        C51959a.m201536e();
        AbstractC28915e a = C28916f.m105987a(context);
        this.f72543a = a;
        a.mo102526a(context);
        C51959a.m201537f();
        C51995b.m201716a("install_content_provider");
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28914d
    /* renamed from: b */
    public void mo102661b(Context context) {
        C51995b.m201714a();
        C51995b.m201716a("before_application_create");
        this.f72543a.mo102527b(context);
        C51995b.m201714a();
    }
}
