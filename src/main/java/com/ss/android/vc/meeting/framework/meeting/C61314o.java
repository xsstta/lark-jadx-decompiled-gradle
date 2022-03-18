package com.ss.android.vc.meeting.framework.meeting;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.o */
public class C61314o {

    /* renamed from: a */
    protected C61303k f153610a;

    /* renamed from: a */
    public C61303k mo212185a() {
        return this.f153610a;
    }

    /* renamed from: b */
    public ByteRtc mo212190b() {
        C61303k kVar = this.f153610a;
        if (kVar != null) {
            return kVar.mo212165y();
        }
        return null;
    }

    /* renamed from: c */
    public String mo212192c() {
        C61303k kVar = this.f153610a;
        if (kVar != null) {
            return kVar.mo212055d();
        }
        return "";
    }

    /* renamed from: d */
    public String mo212193d() {
        C61303k kVar = this.f153610a;
        if (kVar != null) {
            return kVar.mo212054c();
        }
        return "";
    }

    /* renamed from: a */
    public void mo212189a(AbstractC61299g gVar) {
        C60700b.m235851b("MeetingHolder@", "[unbindMeeting]", "unbind");
        C61303k kVar = this.f153610a;
        if (kVar != null && gVar != null) {
            kVar.mo212153b(gVar);
        }
    }

    /* renamed from: a */
    public void mo212188a(DisplayMode displayMode, int i) {
        C61303k kVar = this.f153610a;
        if (kVar != null) {
            kVar.mo212047a(displayMode, i);
        }
    }

    /* renamed from: b */
    public void mo212191b(DisplayMode displayMode, int i) {
        C61303k kVar = this.f153610a;
        if (kVar != null) {
            kVar.mo212053b(displayMode, i);
        }
    }

    /* renamed from: a */
    public C61303k mo212186a(C61303k kVar, AbstractC61299g gVar) {
        String str;
        C60700b.m235851b("MeetingHolder@", "[bindMeeting3]", "bind");
        this.f153610a = kVar;
        if (kVar != null && !kVar.mo212158c(gVar)) {
            this.f153610a.mo212113a(gVar);
        }
        if (this.f153610a != null) {
            str = "success" + this.f153610a.mo212054c();
        } else {
            str = "fail";
        }
        C60700b.m235851b("MeetingHolder@", "[bindMeeting4]", str);
        return this.f153610a;
    }

    /* renamed from: a */
    public C61303k mo212187a(String str, AbstractC61299g gVar) {
        String str2;
        C60700b.m235851b("MeetingHolder@", "[bindMeeting]", str);
        C61303k kVar = (C61303k) MeetingManager.m238341a().getMeeting(str);
        this.f153610a = kVar;
        if (kVar != null && !kVar.mo212158c(gVar)) {
            this.f153610a.mo212113a(gVar);
        }
        if (this.f153610a != null) {
            str2 = "success" + this.f153610a.mo212054c();
        } else {
            str2 = "fail";
        }
        C60700b.m235851b("MeetingHolder@", "[bindMeeting2]", str2);
        return this.f153610a;
    }
}
