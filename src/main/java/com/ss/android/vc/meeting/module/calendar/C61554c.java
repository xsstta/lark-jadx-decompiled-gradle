package com.ss.android.vc.meeting.module.calendar;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event.C63742at;

/* renamed from: com.ss.android.vc.meeting.module.calendar.c */
public class C61554c extends AbstractView$OnAttachStateChangeListenerC61219a {

    /* renamed from: h */
    View$OnClickListenerC61555d f154406h;

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: j */
    public void mo211681j() {
        this.f154406h.mo213339b();
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    public void dismiss() {
        this.f153319b.ah().mo219486c();
        super.dismiss();
    }

    /* renamed from: o */
    private void m240256o() {
        mo211670a(R.color.ud_N00);
        ((FrameLayout.LayoutParams) mo211676e().getLayoutParams()).topMargin = m240257p();
    }

    /* renamed from: p */
    private int m240257p() {
        int i;
        if (C60776r.m236143a(mo211677f())) {
            i = C60776r.m236147e() - C60773o.m236115a(20.0d);
        } else {
            i = C60776r.m236146d();
        }
        return (i * 1) / 10;
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a, com.ss.android.vc.meeting.basedialog.AbstractC61222a
    /* renamed from: a */
    public void mo211606a() {
        super.mo211606a();
        m240256o();
        if (this.f153319b != null) {
            C63742at.m250114u(this.f153319b.mo212056e());
        }
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public View mo211669a(Activity activity) {
        View$OnClickListenerC61555d dVar = new View$OnClickListenerC61555d();
        this.f154406h = dVar;
        return dVar.mo213334a(mo211675d(), mo211677f(), this, null);
    }

    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public void mo211671a(boolean z) {
        C60700b.m235851b("CalendarInfoDialog", "onOrientationChanged", "isLandscape=" + z);
    }

    public C61554c(Activity activity, C61303k kVar) {
        super(activity, kVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.basedialog.HalfScreen.AbstractView$OnAttachStateChangeListenerC61219a
    /* renamed from: a */
    public boolean mo211672a(int i, int i2) {
        int[] iArr = new int[2];
        this.f154406h.f154429o.getLocationOnScreen(iArr);
        if (i2 < iArr[1]) {
            return true;
        }
        if (i == 0) {
            return this.f154406h.f154429o.mo114057b();
        }
        return this.f154406h.f154429o.mo114050a();
    }
}
