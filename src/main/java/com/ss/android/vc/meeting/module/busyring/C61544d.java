package com.ss.android.vc.meeting.module.busyring;

import android.app.Activity;
import android.view.ViewGroup;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.busyring.AbstractC61540a;
import com.ss.android.vc.meeting.module.busyring.BusyRingView;

/* renamed from: com.ss.android.vc.meeting.module.busyring.d */
public class C61544d extends AbstractC61424d implements AbstractC61540a.AbstractC61541a {

    /* renamed from: a */
    private BusyRingView f154386a;

    /* renamed from: b */
    private ViewGroup f154387b;

    /* renamed from: c */
    private C61303k f154388c;

    /* renamed from: d */
    private Activity f154389d;

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        this.f154388c.mo212108Z().mo213264b(this);
        BusyRingView busyRingView = this.f154386a;
        if (busyRingView != null) {
            busyRingView.mo212177a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.busyring.AbstractC61540a.AbstractC61541a
    /* renamed from: a */
    public void mo213265a() {
        C61303k kVar = (C61303k) this.f154388c.mo212068q();
        if (kVar == null || !kVar.mo212063l() || kVar.mo212068q() != this.f154388c) {
            BusyRingView busyRingView = this.f154386a;
            if (busyRingView != null) {
                busyRingView.mo213248g();
            }
            this.f154386a = null;
            C60700b.m235851b("BusyRingViewControl", "[processBusyRingView4]", "not show");
            return;
        }
        boolean z = false;
        if (this.f154386a != null && C60733aa.m235990a(kVar.mo212054c(), this.f154386a.mo212184e()) && this.f154386a.mo213249h()) {
            z = true;
        }
        C60700b.m235851b("BusyRingViewControl", "[processBusyRingView]", "isExist=" + z);
        if (!z) {
            try {
                BusyRingView busyRingView2 = new BusyRingView(this.f154389d, this.f154387b, kVar.mo212054c(), C60776r.m236143a(this.f154389d));
                this.f154386a = busyRingView2;
                busyRingView2.mo213244a(BusyRingView.PageType.Video);
                this.f154386a.mo213247f();
                C60700b.m235851b("BusyRingViewControl", "[processBusyRingView2]", "show");
            } catch (MeetingNullException unused) {
                this.f154386a = null;
                C60700b.m235851b("BusyRingViewControl", "[processBusyRingView3]", "show occur MeetingNullException");
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        BusyRingView busyRingView = this.f154386a;
        if (busyRingView != null) {
            busyRingView.mo213245a(z);
        }
    }

    public C61544d(C61303k kVar, ViewGroup viewGroup) {
        super(null);
        this.f154388c = kVar;
        this.f154387b = viewGroup;
        this.f154389d = C60773o.m236124b(viewGroup.getContext());
        this.f154388c.mo212108Z().mo213263a(this);
        mo213265a();
    }

    public C61544d(AbstractC61429i iVar, ViewGroup viewGroup) {
        super(iVar);
        this.f154388c = iVar.mo212921f();
        this.f154387b = viewGroup;
        this.f154389d = getActivity();
        this.f154388c.mo212108Z().mo213263a(this);
        mo213265a();
    }
}
