package com.ss.android.appcenter.business.tab.fragmentv2.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView;
import com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a;
import com.ss.android.appcenter.common.adapter.p1288a.C28111c;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.a */
public class C27988a extends AbstractC28109a<OnboardingAppInfo, C28112d> {

    /* renamed from: a */
    public OnboardingView.AbstractC27850a f70028a;

    /* renamed from: b */
    public List<OnboardingAppInfo> f70029b;

    /* renamed from: c */
    public boolean f70030c;

    /* renamed from: e */
    private Context f70031e;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98489a() {
        mo100063a(new C28111c() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.C27988a.C279891 */

            @Override // com.ss.android.appcenter.common.adapter.p1288a.C28111c, com.ss.android.appcenter.common.adapter.p1288a.AbstractC28110b
            /* renamed from: a */
            public void mo98493a(AbstractC28109a aVar, View view, int i) {
                OnboardingAppInfo onboardingAppInfo = (OnboardingAppInfo) C27988a.this.mo100065b(i);
                if (onboardingAppInfo != null) {
                    C27988a.this.f70028a.mo99347a(onboardingAppInfo.getMobileAppStoreUrl());
                    if (C27988a.this.f70030c) {
                        C27710b.m101317q(onboardingAppInfo.getAppId());
                    } else {
                        C27710b.m101321u(onboardingAppInfo.getAppId());
                    }
                }
            }

            @Override // com.ss.android.appcenter.common.adapter.p1288a.C28111c, com.ss.android.appcenter.common.adapter.p1288a.AbstractC28110b
            /* renamed from: b */
            public void mo98494b(AbstractC28109a aVar, View view, int i) {
                OnboardingAppInfo onboardingAppInfo = (OnboardingAppInfo) C27988a.this.mo100065b(i);
                if (C27988a.this.f70029b != null && onboardingAppInfo != null) {
                    if (C27988a.this.f70029b.contains(onboardingAppInfo)) {
                        view.findViewById(R.id.check_icon).setActivated(false);
                        C27988a.this.f70028a.mo99348b(onboardingAppInfo);
                        return;
                    }
                    view.findViewById(R.id.check_icon).setActivated(true);
                    C27988a.this.f70028a.mo99346a(onboardingAppInfo);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo99746a(boolean z) {
        this.f70030c = z;
    }

    /* renamed from: b */
    public void mo99747b(List<OnboardingAppInfo> list) {
        this.f70029b = list;
    }

    /* renamed from: b */
    public void mo99748b(boolean z) {
        this.f70029b.clear();
        if (z) {
            this.f70029b.addAll(this.f70402d);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo99745a(List<OnboardingAppInfo> list) {
        this.f70402d.clear();
        this.f70402d.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public C28112d mo98307a(ViewGroup viewGroup, int i) {
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.appcenter_select_install_item, viewGroup, false));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98309a(C28112d dVar, int i) {
        OnboardingAppInfo onboardingAppInfo = (OnboardingAppInfo) mo100065b(i);
        if (onboardingAppInfo != null) {
            TextView textView = (TextView) dVar.mo100072a(R.id.app_introduce);
            dVar.mo100074a(R.id.app_name, onboardingAppInfo.getName());
            dVar.mo100074a(R.id.app_introduce, onboardingAppInfo.getDescription());
            if (C28183g.m103243a(C27548m.m100547m().mo98218b().mo98170a())) {
                textView.setMaxLines(1);
            } else {
                textView.setMaxLines(2);
            }
            C27688a.m101208a(this.f70031e, onboardingAppInfo.getIcon(), (ImageView) dVar.mo100072a(R.id.icon));
            List<OnboardingAppInfo> list = this.f70029b;
            if (list == null || !list.contains(onboardingAppInfo)) {
                dVar.mo100072a(R.id.check_icon).setActivated(false);
            } else {
                dVar.mo100072a(R.id.check_icon).setActivated(true);
            }
            if (!TextUtils.isEmpty(onboardingAppInfo.getAppId())) {
                mo100066b(dVar.mo100072a(R.id.check_wrapper), i);
            }
            mo100062a(dVar.mo100071a(), i);
        }
    }

    public C27988a(Context context, List<OnboardingAppInfo> list, List<OnboardingAppInfo> list2, OnboardingView.AbstractC27850a aVar) {
        super(list);
        this.f70031e = context;
        this.f70029b = list2;
        this.f70028a = aVar;
    }
}
