package com.ss.android.vc.meeting.module.p3148o;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.background.ViewDeviceSetting;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62604b;
import com.ss.android.vc.net.service.VCSyncGetService;
import com.ss.android.vc.service.C63634c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.o.e */
public class C62611e extends AbstractC62604b {

    /* renamed from: a */
    private boolean f157616a = true;

    /* renamed from: b */
    private final int f157617b = 1;

    /* renamed from: c */
    private final int f157618c = 2;

    /* renamed from: d */
    private final List<AbstractC62604b.AbstractC62605a> f157619d = new CopyOnWriteArrayList();

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b
    /* renamed from: a */
    public boolean mo216377a() {
        return this.f157616a;
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b
    /* renamed from: c */
    public boolean mo216380c() {
        return C63634c.m249496b("byteview.meeting.android.mirror");
    }

    /* renamed from: d */
    private void m244902d() {
        ViewDeviceSetting viewDeviceSetting = VCSyncGetService.getViewDeviceSetting();
        if (viewDeviceSetting != null && viewDeviceSetting.video != null) {
            this.f157616a = viewDeviceSetting.video.mirror;
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b
    /* renamed from: b */
    public void mo216378b() {
        if (!getMeeting().mo212165y().mo212029l()) {
            C60700b.m235851b("SettingsControl", "[refreshWhenCameraSwitch]", "backCamera, mirror disabled!");
        }
        m244900a(getMeeting().mo212165y().mo212029l(), this.f157616a);
        for (AbstractC62604b.AbstractC62605a aVar : this.f157619d) {
            aVar.mo216359a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b
    /* renamed from: b */
    public void mo216379b(AbstractC62604b.AbstractC62605a aVar) {
        this.f157619d.remove(aVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b
    /* renamed from: a */
    public void mo216375a(AbstractC62604b.AbstractC62605a aVar) {
        if (!this.f157619d.contains(aVar)) {
            this.f157619d.add(aVar);
        }
    }

    public C62611e(C61303k kVar) {
        super(kVar);
        m244902d();
    }

    @Override // com.ss.android.vc.meeting.module.p3148o.AbstractC62604b
    /* renamed from: a */
    public void mo216376a(boolean z) {
        C60700b.m235851b("SettingsControl", "[setMirrorSwitch]", "enable = " + z);
        this.f157616a = z;
    }

    /* renamed from: a */
    private void m244900a(boolean z, boolean z2) {
        C60700b.m235851b("SettingsControl", "[setMirror]", "isFrontCamera = " + z + ", isMirrorSwitchOn = " + z2);
        if (!z) {
            m244901a(false, false, -1);
        } else if (!mo216380c()) {
        } else {
            if (z2) {
                m244901a(true, false, 2);
            } else {
                m244901a(false, false, 2);
            }
        }
    }

    /* renamed from: a */
    private void m244901a(boolean z, boolean z2, int i) {
        C60700b.m235851b("SettingsControl", "[setMirrorParams]", "flipCamera = " + z + ", flipVideo = " + z2 + ", mode = " + i);
        if (i == 1 || i == 2) {
            getMeeting().mo212165y().mo212005b(i);
        }
        getMeeting().mo212165y().mo212004a(z, z2);
    }
}
