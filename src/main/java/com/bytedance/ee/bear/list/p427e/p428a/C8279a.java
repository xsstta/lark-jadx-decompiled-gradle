package com.bytedance.ee.bear.list.p427e.p428a;

import android.view.View;
import android.view.Window;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.list.e.a.a */
public class C8279a implements AbstractC10397d<C10403a> {

    /* renamed from: a */
    private final String f22389a;

    /* renamed from: b */
    private final int f22390b;

    /* renamed from: c */
    private final int f22391c;

    /* renamed from: d */
    private final String f22392d;

    /* renamed from: e */
    private final View f22393e;

    /* renamed from: f */
    private final Window f22394f;

    /* renamed from: g */
    private final OnBoardingListener f22395g;

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
        return this.f22389a;
    }

    /* renamed from: a */
    public boolean mo24400a(C10403a aVar) {
        View view = this.f22393e;
        if (view == null) {
            C13479a.m54764b("CreateDocumentOnBoardingMission", "show()...anchorView = null");
            return false;
        }
        view.postDelayed(new Runnable(aVar) {
            /* class com.bytedance.ee.bear.list.p427e.p428a.$$Lambda$a$317UugMftvL8_JqUnIkbbgv0KM */
            public final /* synthetic */ C10403a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C8279a.m269622lambda$317UugMftvL8_JqUnIkbbgv0KM(C8279a.this, this.f$1);
            }
        }, 300);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m34072b(C10403a aVar) {
        if (!C13726a.m55676b(aVar.mo39612d()) || this.f22394f == null) {
            C13479a.m54764b("CreateDocumentOnBoardingMission", "activity is not active or window is null");
            return;
        }
        aVar.mo39604a(this.f22394f, new C10390c(this.f22392d, this.f22390b, this.f22391c, C13749l.m55743a(this.f22393e, -10, 0, -10, 0)), this.f22395g);
    }

    public C8279a(String str, int i, int i2, String str2, View view, Window window, OnBoardingListener cVar) {
        this.f22389a = str;
        this.f22390b = i;
        this.f22391c = i2;
        this.f22392d = str2;
        this.f22393e = view;
        this.f22394f = window;
        this.f22395g = cVar;
    }
}
