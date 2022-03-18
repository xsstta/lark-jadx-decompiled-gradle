package com.ss.android.vc.meeting.module.p3156r;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.r.b */
public class C62788b extends AbstractC62787a {

    /* renamed from: a */
    private boolean f157958a;

    /* renamed from: b */
    private boolean f157959b;

    /* renamed from: c */
    private boolean f157960c;

    @Override // com.ss.android.vc.meeting.module.p3156r.AbstractC62787a
    /* renamed from: c */
    public boolean mo216839c() {
        return this.f157959b;
    }

    @Override // com.ss.android.vc.meeting.module.p3156r.AbstractC62787a
    /* renamed from: a */
    public boolean mo216836a() {
        return this.f157958a;
    }

    @Override // com.ss.android.vc.meeting.module.p3156r.AbstractC62787a
    /* renamed from: b */
    public boolean mo216838b() {
        return this.f157960c;
    }

    public C62788b(C61303k kVar) {
        super(kVar);
    }

    @Override // com.ss.android.vc.meeting.module.p3156r.AbstractC62787a
    /* renamed from: a */
    public void mo216835a(boolean z) {
        this.f157958a = z;
    }

    @Override // com.ss.android.vc.meeting.module.p3156r.AbstractC62787a
    /* renamed from: b */
    public void mo216837b(boolean z) {
        this.f157959b = z;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        boolean z;
        if (videoChatInMeetingInfo.getVideoChatSettings().getCountDownDuration() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f157960c = z;
        C60700b.m235851b("TipsControl", "[onInMeetingInfoUpdate]", "isRoomIn = " + this.f157960c);
    }
}
