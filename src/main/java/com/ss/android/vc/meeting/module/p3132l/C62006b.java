package com.ss.android.vc.meeting.module.p3132l;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.model.C61381c;
import com.ss.android.vc.meeting.module.p3132l.AbstractC62004a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.l.b */
public class C62006b extends AbstractC62004a implements C61373b.AbstractC61374a, C61381c.AbstractC61382a {

    /* renamed from: c */
    private final List<AbstractC62004a.AbstractC62005a> f155797c = new CopyOnWriteArrayList();

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public /* synthetic */ void mo212486a(List list) {
        C61381c.AbstractC61382a.CC.$default$a(this, list);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: b */
    public /* synthetic */ void mo212445b(boolean z) {
        C61373b.AbstractC61374a.CC.$default$b(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bF_() {
        C61373b.AbstractC61374a.CC.$default$bF_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: c */
    public /* synthetic */ void mo212449c(boolean z) {
        C61373b.AbstractC61374a.CC.$default$c(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void c_(String str, String str2) {
        C61373b.AbstractC61374a.CC.$default$c_(this, str, str2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: d */
    public /* synthetic */ void mo212451d(boolean z) {
        C61373b.AbstractC61374a.CC.$default$d(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void h_(boolean z) {
        C61381c.AbstractC61382a.CC.$default$h_(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void i_(boolean z) {
        C61373b.AbstractC61374a.CC.$default$i_(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    public /* synthetic */ void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        C61381c.AbstractC61382a.CC.$default$onInMeetingInfoUpdate(this, videoChatInMeetingInfo);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void onOnlyPresenterCanAnnotateChanged(boolean z) {
        C61373b.AbstractC61374a.CC.$default$onOnlyPresenterCanAnnotateChanged(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void bC_() {
        C60700b.m235851b("PopupControl", "[onHostOpenMicrophone]", "onHostOpenMicrophone");
        this.f155796b = true;
        for (AbstractC62004a.AbstractC62005a aVar : this.f155797c) {
            if (aVar != null) {
                aVar.mo214641b();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void bX_() {
        C60700b.m235851b("PopupControl", "[onHostOpenCamera]", "onHostOpenCamera");
        this.f155795a = true;
        for (AbstractC62004a.AbstractC62005a aVar : this.f155797c) {
            if (aVar != null) {
                aVar.mo214639a();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3132l.AbstractC62004a
    /* renamed from: a */
    public void mo214637a(AbstractC62004a.AbstractC62005a aVar) {
        this.f155797c.add(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3132l.AbstractC62004a
    /* renamed from: b */
    public void mo214638b(AbstractC62004a.AbstractC62005a aVar) {
        this.f155797c.remove(aVar);
    }

    public C62006b(C61303k kVar) {
        super(kVar);
        kVar.mo212091I().mo212498e().mo212443a(this);
        kVar.mo212091I().mo212490a().mo212468a(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61381c.AbstractC61382a
    /* renamed from: a */
    public void mo212487a(boolean z) {
        C60700b.m235851b("PopupControl", "[onAllowPartiUnMuteChanged]", "allow = " + z);
        for (AbstractC62004a.AbstractC62005a aVar : this.f155797c) {
            if (aVar != null) {
                aVar.mo214640a(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            getMeeting().mo212091I().mo212498e().mo212444b(this);
            getMeeting().mo212091I().mo212490a().mo212470b(this);
        }
    }
}
