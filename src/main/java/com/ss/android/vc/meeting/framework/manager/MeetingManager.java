package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61286c;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61340f;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@XClass(isSingleton = true, runOnProcess = XProcess.VC)
public class MeetingManager implements AbstractC61288e {

    /* renamed from: a */
    private static volatile MeetingManager f153492a;

    /* renamed from: b */
    private AbstractC61286c f153493b;

    /* renamed from: c */
    private C61281d f153494c = new C61281d();

    /* renamed from: d */
    private AbstractC61285b f153495d = new C61283f();

    /* renamed from: e */
    private AbstractC61284a f153496e;

    /* renamed from: f */
    private C61275c f153497f;

    /* renamed from: g */
    private List<IMeetingsStateChangedListener> f153498g;

    /* renamed from: m */
    private AbstractC61286c m238347m() {
        return this.f153493b;
    }

    /* renamed from: c */
    public C61281d mo211896c() {
        return this.f153494c;
    }

    /* renamed from: d */
    public AbstractC61285b mo211897d() {
        return this.f153495d;
    }

    /* renamed from: b */
    public List<AbstractC61294b> mo211894b() {
        return this.f153496e.mo211922c();
    }

    /* renamed from: e */
    public boolean mo211898e() {
        return this.f153496e.mo211924e();
    }

    /* renamed from: f */
    public boolean mo211899f() {
        return this.f153496e.mo211923d();
    }

    /* renamed from: g */
    public boolean mo211900g() {
        return this.f153496e.mo211925f();
    }

    /* renamed from: h */
    public boolean mo211902h() {
        return this.f153496e.mo211926g();
    }

    /* renamed from: i */
    public boolean mo211903i() {
        return this.f153496e.mo211929j();
    }

    /* renamed from: j */
    public AbstractC61294b mo211906j() {
        return this.f153496e.mo211927h();
    }

    /* renamed from: k */
    public AbstractC61294b mo211907k() {
        return this.f153496e.mo211928i();
    }

    /* renamed from: l */
    public AbstractC61294b mo211908l() {
        return this.f153496e.mo211918b();
    }

    @XSingleton
    /* renamed from: a */
    public static MeetingManager m238341a() {
        if (f153492a == null) {
            synchronized (MeetingManager.class) {
                if (f153492a == null) {
                    AbstractC61286c cVar = null;
                    if (C61266a.m238332a() != null) {
                        cVar = C61266a.m238332a().mo210462a();
                    } else {
                        C60871a.m236611b("MeetingManager", "[getInstance] MeetingModule.getDependency()==null");
                    }
                    f153492a = new MeetingManager(cVar);
                }
            }
        }
        if (!(f153492a == null || f153492a.m238347m() != null || C61266a.m238332a() == null)) {
            f153492a.m238342a(C61266a.m238332a().mo210462a());
        }
        return f153492a;
    }

    /* renamed from: a */
    private void m238342a(AbstractC61286c cVar) {
        this.f153493b = cVar;
    }

    /* renamed from: a */
    public boolean mo211892a(boolean z) {
        return this.f153496e.mo211917a(z);
    }

    @XMethod
    public void addMeetingsSizeChangeListener(IMeetingsSizeChangeListener iMeetingsSizeChangeListener) {
        this.f153496e.mo211914a(iMeetingsSizeChangeListener);
    }

    @XMethod(isBigResult = true, methodId = "1")
    public AbstractC61294b getMeeting(String str) {
        return this.f153496e.mo211921c(str);
    }

    @XMethod
    public void removeMeetingsSizeChangeListener(IMeetingsSizeChangeListener iMeetingsSizeChangeListener) {
        this.f153496e.mo211919b(iMeetingsSizeChangeListener);
    }

    @XMethod
    public boolean isOnTheCall(String str) {
        AbstractC61294b c = this.f153496e.mo211921c(str);
        if (c == null || !c.mo212065n()) {
            return false;
        }
        return true;
    }

    @XMethod
    public boolean isWaiting(String str) {
        AbstractC61294b c = this.f153496e.mo211921c(str);
        if (c == null || !c.mo212066o()) {
            return false;
        }
        return true;
    }

    private MeetingManager(AbstractC61286c cVar) {
        C61269a aVar = new C61269a(this.f153494c);
        this.f153496e = aVar;
        this.f153497f = new C61275c(this.f153495d, aVar);
        this.f153498g = new CopyOnWriteArrayList();
        this.f153493b = cVar;
    }

    @XMethod
    public void registerMeetingsStateChangeListener(IMeetingsStateChangedListener iMeetingsStateChangedListener) {
        C60871a.m236609a("MeetingManager", "[registerMeetingsStateChangeListener]listener=" + iMeetingsStateChangedListener);
        if (iMeetingsStateChangedListener != null && !this.f153498g.contains(iMeetingsStateChangedListener)) {
            this.f153498g.add(iMeetingsStateChangedListener);
        }
    }

    @XMethod
    public void unRegisterMeetingsStateChangeListener(IMeetingsStateChangedListener iMeetingsStateChangedListener) {
        C60871a.m236609a("MeetingManager", "[unRegisterMeetingsStateChangeListener]listener=" + iMeetingsStateChangedListener);
        if (this.f153498g.contains(iMeetingsStateChangedListener)) {
            this.f153498g.remove(iMeetingsStateChangedListener);
        }
    }

    /* renamed from: c */
    private boolean m238345c(C61344j jVar) {
        boolean z;
        List<AbstractC61294b> b = mo211894b();
        int i = jVar.f153703a;
        if (i != 211) {
            z = false;
        } else {
            for (AbstractC61294b bVar : b) {
                bVar.mo212051a(jVar.mo212331a(EventSource.EVENT_MANAGER));
            }
            z = true;
        }
        if (z) {
            C60871a.m236609a("MeetingManager", "[dispatchSpecialEvent] event=" + C61340f.m238967a(i));
        }
        return z;
    }

    /* renamed from: d */
    private boolean m238346d(C61344j jVar) {
        if (jVar == null || jVar.f153704b == null) {
            C60871a.m236609a("MeetingManager", "[attachMeetingInfoToEvent] messageArgs or videoChat null then return");
            return false;
        }
        C60871a.m236609a("MeetingManager", "[attachMeetingInfoToEvent] event=" + C61340f.m238967a(jVar.f153703a));
        this.f153494c.mo211939b(jVar.f153704b);
        C60871a.m236609a("MeetingManager", "[attachMeetingInfoToEvent] videochat=" + String.valueOf(jVar.f153704b));
        if (!TextUtils.isEmpty(jVar.f153704b.getCreatingId())) {
            return true;
        }
        C60871a.m236609a("MeetingManager", "[attachMeetingInfoToEvent] creatingId empty , then return");
        return false;
    }

    /* renamed from: a */
    public AbstractC61294b mo211890a(VideoChat videoChat) {
        if (videoChat == null) {
            return null;
        }
        AbstractC61294b meeting = getMeeting(videoChat.getCreatingId());
        if (meeting == null) {
            return getMeeting(videoChat.getId());
        }
        return meeting;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo211895b(C61344j jVar) {
        AbstractC61294b bVar;
        C63784a.m250428a("[VideoChat_MeetingManager_sendMessageImmediately]");
        int i = jVar.f153703a;
        C60871a.m236611b("MeetingManager", "[sendMessageImmediately] event=" + C61340f.m238967a(i));
        String creatingId = jVar.f153704b.getCreatingId();
        if (this.f153496e.mo211920b(creatingId)) {
            bVar = this.f153496e.mo211921c(creatingId);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            C60871a.m236611b("MeetingManager", "[sendMessageImmediately] meeting alread exist");
            bVar.mo212051a(jVar.mo212331a(EventSource.EVENT_MANAGER));
        } else if (i == 100 || i == 109 || i == 110 || i == 120 || i == 108) {
            C60871a.m236611b("MeetingManager", "[sendMessageImmediately] meeting not exist , event valid then new");
            AbstractC61294b a = this.f153496e.mo211913a(jVar);
            if (a != null) {
                AbstractC61286c cVar = this.f153493b;
                if (cVar != null) {
                    cVar.mo211955a(a, i);
                } else {
                    C60871a.m236611b("MeetingManager", "[sendMessageImmediately] meetingManagerListener == null");
                }
                a.mo212046a(this);
                a.mo212051a(jVar.mo212331a(EventSource.EVENT_MANAGER));
            } else {
                return;
            }
        } else if (i == 111) {
            this.f153495d.mo211947a(jVar.f153704b, StatusNode.Idle);
        } else {
            C60871a.m236611b("MeetingManager", "[sendMessageImmediately] meeting not exist , abandon valid event=" + C61340f.m238967a(i));
        }
        C63784a.m250429b("[VideoChat_MeetingManager_sendMessageImmediately]");
    }

    /* renamed from: a */
    public void mo211891a(C61344j jVar) {
        C63784a.m250428a("[VideoChat_MeetingManager_sendMessage]");
        C60871a.m236609a("MeetingManager", "[sendMessage]");
        if (!m238345c(jVar) && m238346d(jVar)) {
            this.f153497f.mo211932a(jVar);
            C63784a.m250429b("[VideoChat_MeetingManager_sendMessage]");
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
    public void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
        AbstractC61294b meeting = getMeeting(videoChat.getCreatingId());
        m238343a(meeting, videoChat, statusNode);
        this.f153495d.mo211947a(videoChat, statusNode);
        this.f153497f.mo211931a();
        m238344a(meeting, statusNode, videoChat);
    }

    /* renamed from: a */
    private void m238344a(AbstractC61294b bVar, StatusNode statusNode, VideoChat videoChat) {
        if (bVar != null) {
            for (IMeetingsStateChangedListener iMeetingsStateChangedListener : this.f153498g) {
                iMeetingsStateChangedListener.stateChanged(bVar.mo212055d(), statusNode, videoChat);
            }
        }
    }

    /* renamed from: a */
    private void m238343a(AbstractC61294b bVar, VideoChat videoChat, StatusNode statusNode) {
        if (statusNode == StatusNode.Idle) {
            C60871a.m236611b("MeetingManager", "[remove] " + videoChat.getCreatingId());
            this.f153496e.mo211915a(videoChat.getCreatingId());
            AbstractC61286c cVar = this.f153493b;
            if (cVar != null) {
                cVar.mo211954a(bVar);
            }
        }
    }
}
