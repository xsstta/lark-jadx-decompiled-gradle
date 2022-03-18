package com.ss.android.vc.meeting.framework.meeting;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.m */
public class C61312m implements AbstractC61299g {

    /* renamed from: a */
    protected C61314o f153607a = new C61314o();

    /* renamed from: b */
    private DisplayMode f153608b = DisplayMode.NONE;

    /* renamed from: c */
    private AbstractC61299g f153609c;

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingCombinedInfo(VideoChatCombinedInfo videoChatCombinedInfo) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingVideoChat(VideoChat videoChat) {
    }

    /* renamed from: b */
    public C61303k mo212181b() {
        return this.f153607a.mo212185a();
    }

    /* renamed from: c */
    public ByteRtc mo212182c() {
        return this.f153607a.mo212190b();
    }

    /* renamed from: d */
    public String mo212183d() {
        return this.f153607a.mo212192c();
    }

    /* renamed from: e */
    public String mo212184e() {
        return this.f153607a.mo212193d();
    }

    /* renamed from: a */
    public void mo212177a() {
        this.f153607a.mo212191b(this.f153608b, hashCode());
        this.f153607a.mo212189a(this);
    }

    /* renamed from: a */
    public void mo212178a(AbstractC61299g gVar) {
        this.f153609c = gVar;
    }

    /* renamed from: a */
    public boolean mo212179a(C61303k kVar) {
        this.f153607a.mo212186a(kVar, this);
        this.f153607a.mo212188a(this.f153608b, hashCode());
        return true;
    }

    /* renamed from: a */
    public boolean mo212180a(String str) {
        this.f153607a.mo212187a(str, this);
        this.f153607a.mo212188a(this.f153608b, hashCode());
        return true;
    }

    public C61312m(C61303k kVar, DisplayMode displayMode) {
        this.f153608b = displayMode;
        mo212179a(kVar);
    }

    public C61312m(String str, DisplayMode displayMode) {
        this.f153608b = displayMode;
        mo212180a(str);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onStateTransform(int i, int i2, int i3) {
        AbstractC61299g gVar = this.f153609c;
        if (gVar != null) {
            gVar.onStateTransform(i, i2, i3);
        }
    }
}
