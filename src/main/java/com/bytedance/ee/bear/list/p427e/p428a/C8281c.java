package com.bytedance.ee.bear.list.p427e.p428a;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.e.a.c */
public class C8281c implements AbstractC10397d<C10403a> {

    /* renamed from: a */
    private final String f22403a;

    /* renamed from: b */
    private final int f22404b;

    /* renamed from: c */
    private final int f22405c;

    /* renamed from: d */
    private final View f22406d;

    /* renamed from: e */
    private final OnBoardingListener f22407e;

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
        return this.f22403a;
    }

    /* renamed from: a */
    public boolean mo24400a(C10403a aVar) {
        C13479a.m54764b("NavigationOnBoardingMission", "show()...");
        if (this.f22406d == null) {
            C13479a.m54764b("NavigationOnBoardingMission", "anchorView is null");
            return false;
        }
        FragmentActivity d = aVar.mo39612d();
        this.f22406d.post(new Runnable(aVar, d, d.getString(R.string.CreationMobile_Onboarding_Tooltip3)) {
            /* class com.bytedance.ee.bear.list.p427e.p428a.$$Lambda$c$43OWOoZRwQUwSf2OJf3FuvGV7Io */
            public final /* synthetic */ C10403a f$1;
            public final /* synthetic */ FragmentActivity f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C8281c.lambda$43OWOoZRwQUwSf2OJf3FuvGV7Io(C8281c.this, this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m34084a(C10403a aVar, FragmentActivity fragmentActivity, String str) {
        aVar.mo39604a(fragmentActivity.getWindow(), new C10390c(str, this.f22404b, this.f22405c, C13749l.m55743a(this.f22406d, 0, 12, 0, 0)), this.f22407e);
    }

    public C8281c(String str, int i, int i2, View view, OnBoardingListener cVar) {
        this.f22403a = str;
        this.f22404b = i;
        this.f22405c = i2;
        this.f22406d = view;
        this.f22407e = cVar;
    }
}
