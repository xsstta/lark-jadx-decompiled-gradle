package com.ss.android.vc.meeting.module.p3151p;

import android.os.Build;
import android.view.View;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.module.base.content.AbstractC61422a;
import com.ss.android.vc.meeting.module.base.content.AbstractC61423b;
import com.ss.android.vc.meeting.module.base.content.ContentViewType;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.statistics.event.C63742at;

/* renamed from: com.ss.android.vc.meeting.module.p.e */
public class C62622e extends AbstractC61422a implements AbstractC62612a.AbstractC62613a {

    /* renamed from: b */
    private AbstractC62612a f157656b;

    /* renamed from: c */
    private ShareScreenStub f157657c;

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: f */
    public void mo212885f() {
        this.f157657c = null;
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: h */
    public boolean mo212887h() {
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: g */
    public ContentViewType mo212886g() {
        return ContentViewType.HOST_SHARE_SCREEN_AUDIO;
    }

    @Override // com.ss.android.vc.meeting.module.base.content.AbstractC61422a
    /* renamed from: e */
    public View mo212884e() {
        ShareScreenStub dVar = new ShareScreenStub(getRootView());
        this.f157657c = dVar;
        dVar.mo216440a(getMeeting());
        return this.f157657c.mo216439a();
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a.AbstractC62613a
    /* renamed from: a */
    public void mo216424a() {
        C60700b.m235851b("ShareScreenViewControl", "[showMobileShareScreenUi]", "showMobileShareScreenUi");
        if (C62614c.m244945q()) {
            m244998a(this.f157656b.mo216421k());
        }
        bR_();
        ShareScreenStub dVar = this.f157657c;
        if (dVar != null) {
            dVar.mo216440a(getMeeting());
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a.AbstractC62613a
    /* renamed from: b */
    public void mo216426b() {
        C60700b.m235851b("ShareScreenViewControl", "[hideMobileShareScreenUi]", "hideMobileShareScreenUi");
        boolean e = getMeeting().ay().mo216074e();
        boolean f = getMeeting().ab().mo213880f();
        if (!e && !f) {
            getMeeting().aw().mo216154i();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a.AbstractC62613a
    /* renamed from: c */
    public void mo216427c() {
        if (getMeeting().mo212092J().mo212553k()) {
            getMeeting().mo212092J().mo212526a(false);
            getMeeting().aj().mo216412c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        C60700b.m235851b("ShareScreenViewControl", "[destroy]", "destroy");
        this.f157656b.mo216402a(this);
        if (this.f157657c != null) {
            if (this.f157656b.mo216408a()) {
                this.f157656b.mo216411b(false);
            }
            mo212885f();
            super.destroy();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        super.init();
        AbstractC62612a aj = getMeeting().aj();
        this.f157656b = aj;
        aj.mo216403a(this, getActivity());
        if (getMeeting().mo212092J().mo212553k()) {
            getMeeting().mo212092J().mo212526a(false);
            getMeeting().aj().mo216412c();
        }
    }

    public C62622e(AbstractC61423b bVar) {
        super(bVar);
        init();
    }

    /* renamed from: a */
    private void m244998a(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            C63742at.m250065a(getMeeting().mo212056e(), z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3151p.AbstractC62612a.AbstractC62613a
    /* renamed from: a */
    public void mo216425a(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        boolean z;
        ShareScreenStub dVar;
        if (getMeeting() == null || !getMeeting().aj().mo216408a()) {
            z = false;
        } else {
            z = true;
        }
        if (z && (dVar = this.f157657c) != null) {
            dVar.mo216440a(getMeeting());
        }
        if (getMeeting() != null && getMeeting().ay() != null) {
            getMeeting().ay().mo216068b();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void onOrientation(boolean z, boolean z2) {
        super.onOrientation(z, z2);
        C60700b.m235851b("ShareScreenViewControl", "[onOrientation]", "isLandscape: " + z + ", isRotate = " + z2);
        if (z2 && getMeeting().aj().mo216408a()) {
            getMeeting().aj().mo216411b(z);
        }
    }
}
