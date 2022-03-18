package com.ss.android.vc.meeting.model;

import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.CalendarInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.model.d */
public class C61383d {

    /* renamed from: a */
    private CalendarInfo f153828a;

    /* renamed from: b */
    private boolean f153829b;

    /* renamed from: c */
    private C61303k f153830c;

    /* renamed from: d */
    private boolean f153831d;

    /* renamed from: e */
    private boolean f153832e;

    /* renamed from: f */
    private C61388g f153833f;

    /* renamed from: g */
    private C61371a f153834g;

    /* renamed from: h */
    private LobbyData f153835h;

    /* renamed from: i */
    private C61373b f153836i;

    /* renamed from: j */
    private C61381c f153837j;

    /* renamed from: a */
    public C61381c mo212490a() {
        return this.f153837j;
    }

    /* renamed from: b */
    public C61388g mo212494b() {
        return this.f153833f;
    }

    /* renamed from: d */
    public LobbyData mo212497d() {
        return this.f153835h;
    }

    /* renamed from: e */
    public C61373b mo212498e() {
        return this.f153836i;
    }

    /* renamed from: f */
    public boolean mo212499f() {
        return this.f153829b;
    }

    /* renamed from: h */
    public CalendarInfo mo212501h() {
        return this.f153828a;
    }

    /* renamed from: i */
    public boolean mo212502i() {
        return this.f153831d;
    }

    /* renamed from: j */
    public boolean mo212503j() {
        return this.f153832e;
    }

    /* renamed from: c */
    public C61371a mo212496c() {
        return this.f153834g;
    }

    /* renamed from: g */
    public void mo212500g() {
        C60700b.m235851b("MeetingData", "[clear]", "clear");
        this.f153835h.mo212423e();
        this.f153836i.mo212441a();
        this.f153837j.mo212485q();
    }

    /* renamed from: a */
    public void mo212493a(boolean z) {
        this.f153831d = z;
    }

    /* renamed from: b */
    public void mo212495b(boolean z) {
        this.f153832e = z;
    }

    /* renamed from: a */
    public void mo212491a(VideoChat videoChat) {
        C26171w.m94675a(new Runnable(videoChat) {
            /* class com.ss.android.vc.meeting.model.$$Lambda$d$OWrgizvuIzochnyvCS1baBcTwkU */
            public final /* synthetic */ VideoChat f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61383d.this.m239233c(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m239233c(VideoChat videoChat) {
        this.f153829b = true;
        this.f153837j.mo212466a(videoChat);
        this.f153833f.mo212592a(videoChat);
        this.f153834g.mo212425a(videoChat);
    }

    /* renamed from: a */
    public void mo212492a(VideoChatCombinedInfo videoChatCombinedInfo) {
        if (this.f153833f.mo212595a()) {
            this.f153828a = videoChatCombinedInfo.getCalendarInfo();
            this.f153837j.mo212467a(videoChatCombinedInfo.getVideoChatInMeetingInfo());
        }
    }

    public C61383d(C61303k kVar) {
        this.f153830c = kVar;
        this.f153836i = new C61373b(kVar);
        this.f153837j = new C61381c(kVar);
        this.f153833f = new C61388g(kVar);
        this.f153834g = new C61371a(kVar);
        this.f153835h = new LobbyData(kVar);
    }
}
