package com.bytedance.ee.bear.list.p427e.p428a;

import android.view.View;
import android.view.Window;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.list.e.a.b */
public class C8280b implements AbstractC10397d<C10403a> {

    /* renamed from: a */
    private final String f22396a;

    /* renamed from: b */
    private final int f22397b;

    /* renamed from: c */
    private final int f22398c;

    /* renamed from: d */
    private final String f22399d;

    /* renamed from: e */
    private final View f22400e;

    /* renamed from: f */
    private final Window f22401f;

    /* renamed from: g */
    private final OnBoardingListener f22402g;

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "space";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: c */
    public /* synthetic */ String mo21356c() {
        return AbstractC10397d.CC.$default$c(this);
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return this.f22396a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34078b(C10403a aVar) {
        aVar.mo39604a(this.f22401f, new C10390c(this.f22399d, this.f22397b, this.f22398c, C13749l.m55743a(this.f22400e, -2, 0, -2, 0)), this.f22402g);
    }

    /* renamed from: a */
    public boolean mo24400a(C10403a aVar) {
        View view = this.f22400e;
        if (view == null) {
            C13479a.m54764b("CreateTemplateOnBoardingMission", "show()...anchorView is null");
            return false;
        }
        view.post(new Runnable(aVar) {
            /* class com.bytedance.ee.bear.list.p427e.p428a.$$Lambda$b$1UqVrAIr8YrWpwN2sMbA_UJF788 */
            public final /* synthetic */ C10403a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C8280b.lambda$1UqVrAIr8YrWpwN2sMbA_UJF788(C8280b.this, this.f$1);
            }
        });
        return true;
    }

    public C8280b(String str, int i, int i2, String str2, View view, Window window, OnBoardingListener cVar) {
        this.f22396a = str;
        this.f22397b = i;
        this.f22398c = i2;
        this.f22399d = str2;
        this.f22400e = view;
        this.f22401f = window;
        this.f22402g = cVar;
    }
}
