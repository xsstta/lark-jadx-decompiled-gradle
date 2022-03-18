package com.ss.android.vc.meeting.framework.meeting;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61287d;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.statemachine.AbstractC61338d;
import com.ss.android.vc.meeting.framework.statemachine.C61340f;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.b */
public abstract class AbstractC61294b implements AbstractC61288e, AbstractC61302j {

    /* renamed from: a */
    protected VideoChat f153548a;

    /* renamed from: b */
    protected String f153549b;

    /* renamed from: c */
    public VideoChat.Type f153550c;

    /* renamed from: d */
    protected AtomicBoolean f153551d = new AtomicBoolean(false);

    /* renamed from: e */
    protected int f153552e = 0;

    /* renamed from: f */
    protected VideoChat.MeetingSource f153553f;

    /* renamed from: g */
    protected boolean f153554g;

    /* renamed from: h */
    protected transient AbstractC61301i f153555h;

    /* renamed from: i */
    private DisplayMode f153556i = DisplayMode.NONE;

    /* renamed from: j */
    private int f153557j;

    /* renamed from: k */
    private transient AbstractC61294b f153558k;

    /* renamed from: l */
    private MeetingDerive f153559l = MeetingDerive.NORNAL;

    /* renamed from: m */
    private transient C61329v f153560m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo212048a(DisplayMode displayMode, DisplayMode displayMode2) {
    }

    /* renamed from: b */
    public C61329v mo212052b() {
        return this.f153560m;
    }

    /* renamed from: c */
    public String mo212054c() {
        return this.f153549b;
    }

    /* renamed from: e */
    public VideoChat mo212056e() {
        return this.f153548a;
    }

    /* renamed from: g */
    public VideoChat.Type mo212058g() {
        return this.f153550c;
    }

    /* renamed from: p */
    public DisplayMode mo212067p() {
        return this.f153556i;
    }

    /* renamed from: q */
    public final AbstractC61294b mo212068q() {
        return this.f153558k;
    }

    /* renamed from: s */
    public MeetingDerive mo212070s() {
        return this.f153559l;
    }

    /* renamed from: t */
    public boolean mo212071t() {
        return this.f153554g;
    }

    /* renamed from: u */
    private AbstractC61338d mo212161u() {
        return this.f153560m.mo212273g();
    }

    /* renamed from: h */
    public int mo212059h() {
        return this.f153560m.mo212269c();
    }

    /* renamed from: i */
    public boolean mo212060i() {
        return this.f153560m.mo212270d();
    }

    /* renamed from: f */
    public VideoChat.Type mo212057f() {
        VideoChat videoChat = this.f153548a;
        if (videoChat == null) {
            return VideoChat.Type.UNKNOWN;
        }
        return videoChat.getType();
    }

    /* renamed from: j */
    public boolean mo212061j() {
        AbstractC61338d u = mo212161u();
        if (u == null || u.mo212287b() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo212062k() {
        AbstractC61338d u = mo212161u();
        if (u == null || u.mo212287b() != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo212063l() {
        AbstractC61338d u = mo212161u();
        if (u == null || u.mo212287b() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo212064m() {
        AbstractC61338d u = mo212161u();
        if (u == null || u.mo212287b() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo212065n() {
        AbstractC61338d u = mo212161u();
        if (u == null || u.mo212287b() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public boolean mo212066o() {
        AbstractC61338d u = mo212161u();
        if (u == null || u.mo212287b() != 6) {
            return false;
        }
        return true;
    }

    AbstractC61294b() {
    }

    /* renamed from: a */
    public void mo212042a() {
        if (!this.f153551d.get()) {
            this.f153560m.mo212261a();
            this.f153551d.set(true);
        }
    }

    /* renamed from: d */
    public String mo212055d() {
        if (mo212056e() != null) {
            return mo212056e().getId();
        }
        return "";
    }

    /* renamed from: r */
    public final void mo212069r() {
        AbstractC61294b q = mo212068q();
        if (q != null) {
            mo212049a((AbstractC61294b) null, MeetingDerive.NORNAL);
            if (q.mo212068q() == this) {
                q.mo212049a((AbstractC61294b) null, MeetingDerive.NORNAL);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo212043a(int i) {
        this.f153552e = i;
    }

    /* renamed from: a */
    public final void mo212045a(AbstractC61287d dVar) {
        this.f153560m.mo212262a(dVar);
    }

    /* renamed from: b */
    private void mo212154b(C61344j jVar) {
        AbstractC61301i iVar = this.f153555h;
        if (iVar != null) {
            iVar.mo212081a(jVar);
            if (jVar != null) {
                this.f153560m.mo212266a(jVar);
                return;
            }
            return;
        }
        C60871a.m236612c("BaseMeeting@", "[sendMessageInternal] mMessagePreAssembler is null");
    }

    public AbstractC61294b(VideoChat videoChat) {
        mo212151b(videoChat);
        C61329v vVar = new C61329v(this);
        this.f153560m = vVar;
        vVar.mo212264a((AbstractC61302j) this);
        this.f153560m.mo212263a((AbstractC61288e) this);
    }

    /* renamed from: a */
    public void mo212044a(VideoChat videoChat) {
        C60871a.m236611b("BaseMeeting@", "[updateVideoChat] paramsVideoChat = " + C61340f.m238968a(videoChat));
        if (videoChat != null) {
            this.f153548a = videoChat;
        } else {
            C60871a.m236612c("BaseMeeting@", "[updateVideoChat] videochat is null");
        }
    }

    /* renamed from: b */
    private void mo212151b(VideoChat videoChat) {
        this.f153549b = videoChat.getCreatingId();
        this.f153550c = videoChat.getType();
        this.f153553f = videoChat.getMeetingSource();
        C60871a.m236611b("BaseMeeting@", "[initFromVideoChat] mCreatingId = " + this.f153549b + ", mMeetingType = " + this.f153550c + ", meetingSource = " + this.f153553f);
        VideoChat videoChat2 = new VideoChat();
        this.f153548a = videoChat2;
        videoChat2.setCreatingId(this.f153549b);
        this.f153548a.setType(this.f153550c);
        this.f153554g = videoChat.isVoiceCall();
    }

    /* renamed from: a */
    public void mo212046a(AbstractC61288e eVar) {
        this.f153560m.mo212263a(eVar);
    }

    /* renamed from: a */
    public void mo212050a(AbstractC61301i iVar) {
        this.f153555h = iVar;
    }

    /* renamed from: a */
    public final void mo212051a(C61344j jVar) {
        mo212154b(jVar);
    }

    /* renamed from: a */
    public final synchronized void mo212047a(DisplayMode displayMode, int i) {
        C60871a.m236611b("BaseMeeting@", "[setDisplayMode] " + displayMode + " old = " + this.f153556i);
        mo212048a(this.f153556i, displayMode);
        this.f153556i = displayMode;
        this.f153557j = i;
    }

    /* renamed from: b */
    public final synchronized void mo212053b(DisplayMode displayMode, int i) {
        C60871a.m236611b("BaseMeeting@", "[clearDisplayMode] mDisplayMode = " + this.f153556i + ", mode = " + displayMode + ", mDisplayModeId = " + this.f153557j + ", displayModeId = " + i);
        if (i == this.f153557j) {
            mo212048a(this.f153556i, DisplayMode.NONE);
            this.f153556i = DisplayMode.NONE;
        }
    }

    /* renamed from: a */
    public final void mo212049a(AbstractC61294b bVar, MeetingDerive meetingDerive) {
        this.f153558k = bVar;
        this.f153559l = meetingDerive;
    }
}
