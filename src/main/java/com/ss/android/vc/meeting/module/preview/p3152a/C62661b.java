package com.ss.android.vc.meeting.module.preview.p3152a;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.statistics.event.bq;

/* renamed from: com.ss.android.vc.meeting.module.preview.a.b */
public class C62661b extends AbstractC62684c<C62663d> {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "会议 ID";
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public String mo216561a() {
        return ((C62663d) this.f157735b).mo216573p();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
        bq.m250208a(false, "", this.f157736c);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.vc.meeting.module.preview.AbstractC62684c
    public void onResume() {
        super.onResume();
        ((C62663d) this.f157735b).mo216574q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62663d mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62663d(baseFragment, hVar);
    }
}
