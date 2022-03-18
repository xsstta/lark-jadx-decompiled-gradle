package com.ss.android.vc.meeting.model;

import android.text.TextUtils;
import android.util.Log;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.C60940j;
import com.ss.android.vc.entity.GetsuggetedParticipants;
import com.ss.android.vc.entity.InMeetingUpdateMessage;
import com.ss.android.vc.entity.InterpreterSetting;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantChange;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61388g;
import com.ss.android.vc.meeting.model.p3108b.C61377b;
import com.ss.android.vc.meeting.module.bottombar.BottomBarControl;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62377n;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.View$OnClickListenerC62379p;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.net.service.VideoChatUser;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.model.g */
public class C61388g {

    /* renamed from: a */
    public Map<String, Participant> f153887a = new ConcurrentHashMap();

    /* renamed from: b */
    public C61303k f153888b;

    /* renamed from: c */
    public List<Participant> f153889c;

    /* renamed from: d */
    private List<Participant> f153890d;

    /* renamed from: e */
    private List<Participant> f153891e = new LinkedList();

    /* renamed from: f */
    private List<Participant> f153892f = new LinkedList();

    /* renamed from: g */
    private List<Participant> f153893g;

    /* renamed from: h */
    private List<Participant> f153894h = new LinkedList();

    /* renamed from: i */
    private Map<String, Participant> f153895i = new HashMap();

    /* renamed from: j */
    private Map<String, Participant> f153896j = new HashMap();

    /* renamed from: k */
    private Set<String> f153897k = new HashSet();

    /* renamed from: l */
    private Set<String> f153898l = new HashSet();

    /* renamed from: m */
    private Map<String, String> f153899m = new HashMap();

    /* renamed from: n */
    private Map<String, Long> f153900n = new HashMap();

    /* renamed from: o */
    private int f153901o = 0;

    /* renamed from: p */
    private String f153902p = VideoChatModuleDependency.m236629b();

    /* renamed from: q */
    private String f153903q;

    /* renamed from: r */
    private String f153904r;

    /* renamed from: s */
    private int f153905s;

    /* renamed from: t */
    private List<AbstractC61393a> f153906t;

    /* renamed from: u */
    private List<Participant> f153907u;

    /* renamed from: v */
    private boolean f153908v;

    /* renamed from: com.ss.android.vc.meeting.model.g$a */
    public interface AbstractC61393a {

        /* renamed from: com.ss.android.vc.meeting.model.g$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(AbstractC61393a aVar, InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
            }

            public static void $default$a(AbstractC61393a aVar, LanguageType languageType, LanguageType languageType2) {
            }

            public static void $default$a(AbstractC61393a aVar, Participant participant) {
            }

            public static void $default$a(AbstractC61393a aVar, Participant participant, Participant participant2) {
            }

            public static void $default$b(AbstractC61393a aVar, Participant participant, Participant participant2) {
            }

            public static void $default$bB_(AbstractC61393a aVar) {
            }

            public static void $default$bD_(AbstractC61393a aVar) {
            }

            public static void $default$bG_(AbstractC61393a aVar) {
            }

            public static void $default$onSelfRtcModeUpdate(AbstractC61393a aVar, Participant participant, Participant participant2) {
            }
        }

        /* renamed from: a */
        void mo212617a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2);

        /* renamed from: a */
        void mo212618a(LanguageType languageType, LanguageType languageType2);

        /* renamed from: a */
        void mo212619a(Participant participant);

        /* renamed from: a */
        void mo212620a(Participant participant, Participant participant2);

        /* renamed from: b */
        void mo212621b(Participant participant, Participant participant2);

        void bB_();

        void bD_();

        void bG_();

        void onSelfRtcModeUpdate(Participant participant, Participant participant2);
    }

    /* renamed from: t */
    private void m239353t() {
        VcBizService.triggerPushFullMeetingInfo();
    }

    /* renamed from: u */
    private void m239354u() {
        VcBizSender.m249297k();
    }

    /* renamed from: a */
    public boolean mo212595a() {
        return this.f153908v;
    }

    /* renamed from: b */
    public Map<String, String> mo212596b() {
        return this.f153899m;
    }

    /* renamed from: c */
    public Map<String, Long> mo212598c() {
        return this.f153900n;
    }

    /* renamed from: d */
    public int mo212599d() {
        return this.f153905s;
    }

    /* renamed from: e */
    public List<Participant> mo212600e() {
        return this.f153894h;
    }

    /* renamed from: f */
    public List<Participant> mo212601f() {
        return this.f153890d;
    }

    /* renamed from: g */
    public List<Participant> mo212602g() {
        return this.f153892f;
    }

    /* renamed from: h */
    public List<Participant> mo212603h() {
        return this.f153891e;
    }

    /* renamed from: i */
    public List<Participant> mo212604i() {
        return this.f153893g;
    }

    /* renamed from: k */
    public Map<String, Participant> mo212606k() {
        return this.f153895i;
    }

    /* renamed from: l */
    public Set<String> mo212607l() {
        return this.f153898l;
    }

    /* renamed from: a */
    public void mo212592a(VideoChat videoChat) {
        List<Participant> list;
        C60700b.m235851b("ParticipantData", "[initInternal]", " videoChat = " + videoChat);
        m239353t();
        if (videoChat == null || TextUtils.isEmpty(videoChat.getId()) || (((list = this.f153890d) != null && !list.isEmpty()) || C60742af.m236059a(videoChat.getParticipants()))) {
            C60700b.m235851b("ParticipantData", "[initInternal3]", " init fail");
        } else {
            C60700b.m235851b("ParticipantData", "[initInternal2]", " init success");
            m239343a(videoChat.getParticipants(), false);
            mo212611p();
        }
        if (ParticipantUtil.m248722a(this.f153888b.mo212091I().mo212490a().mo212477i(), this.f153888b.mo212091I().mo212490a().mo212479k(), this.f153888b.mo212091I().mo212490a().mo212478j())) {
            C60700b.m235851b("ParticipantData", "[initInternal4]", " host triggerPushFullLobbyParticipant");
            m239354u();
        }
    }

    /* renamed from: a */
    public void mo212594a(List<Participant> list) {
        C60700b.m235851b("BreakoutRoom_ParticipantData", "[setInMeetingParticipants]", " originSize= " + list.size());
        this.f153890d = list;
        m239351r();
    }

    /* renamed from: a */
    public void mo212591a(ParticipantChange participantChange) {
        String str;
        String str2;
        String str3;
        String meetingId = participantChange.getMeetingId();
        C61303k kVar = this.f153888b;
        if (kVar != null) {
            str = kVar.mo212055d();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && !str.equals(meetingId)) {
            C60700b.m235864f("ParticipantData", "[onPushParticipantChange]", " current meeting = " + str + ", push id = " + meetingId);
        } else if (!this.f153908v) {
            C60700b.m235851b("ParticipantData", "[onPushParticipantChange1]", "hasInitParticipant = false, return");
        } else {
            boolean z = false;
            for (Participant participant : participantChange.getRemoveParticipants()) {
                if (!ParticipantUtil.m248717a(participant, this.f153903q, this.f153902p, ParticipantType.LARK_USER)) {
                    Participant remove = this.f153895i.remove(C60938g.m237060a(participant));
                    this.f153887a.remove(participant.getRtcJoinId());
                    if (remove != null && C60938g.m237062b(remove)) {
                        m239338a(remove);
                    }
                    if (!z && remove != null && remove.isHostOrCoHost()) {
                        C60700b.m235851b("ParticipantData", "[onPushParticipantChange2]", "host or coHost leave");
                        z = true;
                    }
                }
                this.f153896j.remove(participant.getId());
            }
            Participant j = mo212605j();
            this.f153898l.clear();
            InterpreterSetting interpreterSetting = null;
            Participant participant2 = null;
            for (Participant participant3 : participantChange.getUpsertParticipants()) {
                if (!TextUtils.isEmpty(participant3.getDeviceId()) && participant3.getStatus() == Participant.Status.ON_THE_CALL) {
                    Participant participant4 = this.f153895i.get(C60938g.m237060a(participant3));
                    if (participant4 == null) {
                        this.f153898l.add(ParticipantUtil.m248706a(participant3));
                    }
                    if (!z && participant4 == null && participant3.isHostOrCoHost()) {
                        C60700b.m235851b("ParticipantData", "[onPushParticipantChange3]", "host or coHost enter meeting");
                        z = true;
                    }
                    if (!(z || participant4 == null || (participant4.isCoHost() == participant3.isCoHost() && participant4.is_host() == participant3.is_host()))) {
                        C60700b.m235851b("ParticipantData", "[onPushParticipantChange4]", "host or coHost role changed");
                        z = true;
                    }
                    this.f153895i.put(C60938g.m237060a(participant3), participant3);
                    this.f153887a.put(participant3.getRtcJoinId(), participant3);
                    if (participant3.is_host()) {
                        participant2 = participant3;
                    }
                    this.f153896j.remove(participant3.getId());
                } else if (participant3.getStatus() == Participant.Status.RINGING) {
                    this.f153896j.put(participant3.getId(), participant3);
                }
                if (ParticipantUtil.m248732c(participant3)) {
                    C60700b.m235851b("ParticipantData", "[onPushParticipantChange5]", "self change." + participant3);
                }
            }
            if (z) {
                m239331A();
            }
            Participant j2 = mo212605j();
            if (!(j == null || j2 == null || j.getParticipantMeetingRole() == null || j2.getParticipantMeetingRole() == null || j2.getParticipantMeetingRole() == j.getParticipantMeetingRole())) {
                m239344b(j, j2);
            }
            if (!(j == null || j2 == null || j.getParticipantSettings() == null || j2.getParticipantSettings() == null)) {
                if (j2.getParticipantSettings().isMicrophoneMuted() != j.getParticipantSettings().isMicrophoneMuted()) {
                    C60700b.m235851b("ParticipantData", "[onPushParticipantChange6]", "self isMicrophoneMuted, new:" + j2.getParticipantSettings().isMicrophoneMuted() + ", old:" + j.getParticipantSettings().isMicrophoneMuted());
                }
                if (j2.getParticipantSettings().isCameraMuted() != j.getParticipantSettings().isCameraMuted()) {
                    C60700b.m235851b("ParticipantData", "[onPushParticipantChange7]", "self isCameraMuted, new:" + j2.getParticipantSettings().isCameraMuted() + ", old:" + j.getParticipantSettings().isCameraMuted());
                }
                if (j2.getParticipantSettings().getRtcMode() != j.getParticipantSettings().getRtcMode()) {
                    m239347c(j, j2);
                }
            }
            if (!(j == null || j2 == null || C60938g.m237062b(j) == C60938g.m237062b(j2))) {
                m239349d(j, j2);
            }
            if (!(j2 == null || j2.getParticipantSettings() == null || j2.getParticipantSettings().getInterpreterSetting() == null || j2.getParticipantSettings().getInterpreterSetting().confirmStatus == null || j2.getParticipantSettings().getInterpreterSetting().confirmStatus != InterpreterSetting.ConfirmStatus.WAIT_CONFIRM)) {
                m239337a(j2.getParticipantSettings().getInterpreterSetting().firstLanguage, j2.getParticipantSettings().getInterpreterSetting().secondLanguage);
            }
            InterpreterSetting interpreterSetting2 = (j == null || j.getParticipantSettings() == null) ? null : j.getParticipantSettings().getInterpreterSetting();
            if (!(j2 == null || j2.getParticipantSettings() == null)) {
                interpreterSetting = j2.getParticipantSettings().getInterpreterSetting();
            }
            m239336a(interpreterSetting2, interpreterSetting);
            m239340a(j, j2, participant2);
            ArrayList arrayList = new ArrayList(this.f153895i.values());
            this.f153894h = arrayList;
            arrayList.addAll(this.f153896j.values());
            this.f153905s = this.f153895i.size();
            this.f153888b.mo212116a(false);
            Iterator<Participant> it = this.f153894h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Participant next = it.next();
                if (next.getStatus() == Participant.Status.ON_THE_CALL && ParticipantUtil.m248735d(next)) {
                    this.f153888b.mo212116a(true);
                    break;
                }
            }
            if (j2 != null) {
                str2 = j2.getBreakoutRoomId();
            } else {
                str2 = "";
            }
            if (this.f153888b.mo212056e().getVideoChatSettings().isOpenBreakoutRoom() || !TextUtils.isEmpty(str2)) {
                ArrayList arrayList2 = new ArrayList();
                C60700b.m235851b("BreakoutRoom_ParticipantData", "[onPushParticipantChange8]", "update room participants with selfId=" + str2);
                if (!TextUtils.isEmpty(str2)) {
                    for (Participant participant5 : this.f153894h) {
                        if (participant5.is_host()) {
                            AbsBreakoutRoomControl al = this.f153888b.al();
                            if (TextUtils.isEmpty(participant5.getBreakoutRoomId())) {
                                str3 = "";
                            } else {
                                str3 = participant5.getBreakoutRoomId();
                            }
                            al.mo213178e(str3);
                        }
                        String breakoutRoomId = participant5.getBreakoutRoomId();
                        if (!TextUtils.isEmpty(breakoutRoomId) && breakoutRoomId.equals(str2)) {
                            arrayList2.add(participant5);
                        }
                    }
                } else {
                    for (Participant participant6 : this.f153894h) {
                        if (TextUtils.isEmpty(participant6.getBreakoutRoomId())) {
                            arrayList2.add(participant6);
                        }
                    }
                }
                this.f153894h = arrayList2;
            }
            m239342a(this.f153894h, "onPushParticipantChange", new Runnable() {
                /* class com.ss.android.vc.meeting.model.$$Lambda$g$u1373iN3cuQGpgujm6UVuBJzLt4 */

                public final void run() {
                    C61388g.this.m239334D();
                }
            });
            m239339a(j, j2);
        }
    }

    /* renamed from: a */
    public void mo212590a(InMeetingUpdateMessage inMeetingUpdateMessage) {
        String meetingId = inMeetingUpdateMessage.getMeetingId();
        C61303k kVar = this.f153888b;
        String d = kVar != null ? kVar.mo212055d() : "";
        if (TextUtils.isEmpty(d) || d.equals(meetingId)) {
            C60700b.m235851b("ParticipantData", "[onPushFullMeetingInfo2]", " updateMessage = " + inMeetingUpdateMessage.toString());
            m239343a(inMeetingUpdateMessage.getParticipants(), true);
            mo212611p();
            return;
        }
        C60700b.m235864f("ParticipantData", "[onPushFullMeetingInfo]", " current meeting = " + d + ", push id = " + meetingId);
    }

    /* renamed from: a */
    public Participant mo212588a(String str) {
        Participant participant = this.f153887a.get(str);
        if (participant == null) {
            participant = ParticipantUtil.m248703a(str, this.f153894h);
        }
        if (participant == null) {
            C60700b.m235864f("ParticipantData", "[getParticipantByRtcJoinId]", "getParticipantByStreamId p is null - " + str);
        }
        return participant;
    }

    /* renamed from: a */
    public void mo212593a(AbstractC61393a aVar) {
        if (!this.f153906t.contains(aVar)) {
            C61377b.m239188a(aVar, this.f153906t);
            this.f153906t.add(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m239332B() {
        mo212611p();
        m239355v();
    }

    /* renamed from: v */
    private void m239355v() {
        m239356w();
        C26171w.m94675a(new Runnable() {
            /* class com.ss.android.vc.meeting.model.$$Lambda$g$Vc7p6IyFJn2Eo07ceG7a_w0wBO0 */

            public final void run() {
                C61388g.this.m239333C();
            }
        });
    }

    /* renamed from: A */
    private void m239331A() {
        C60700b.m235851b("ParticipantData", "[onParticipantsRoleChanged]", "onParticipantsRoleChanged");
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.bG_();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m239335E() {
        m239345b(this.f153888b.mo212055d());
        mo212609n();
        mo212611p();
        m239355v();
    }

    /* renamed from: y */
    private void m239358y() {
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.bB_();
        }
    }

    /* renamed from: z */
    private void m239359z() {
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.bD_();
        }
    }

    /* renamed from: m */
    public void mo212608m() {
        if (!this.f153908v) {
            C60700b.m235851b("ParticipantData", "[updateInMeetingInfo]", "hasInitParticipant = false, return.");
        } else {
            m239342a(this.f153894h, "updateInMeetingInfo", new Runnable() {
                /* class com.ss.android.vc.meeting.model.$$Lambda$g$pI2gqfl90ydcU2kndjax0fjaSjg */

                public final void run() {
                    C61388g.this.m239335E();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m239333C() {
        C61303k kVar = this.f153888b;
        if (kVar != null) {
            kVar.onInMeetingInfoUpdate(kVar.mo212091I().mo212490a().mo212471c());
        } else {
            C60700b.m235864f("ParticipantData", "[processParticipantsUpdate]", " meeting is null");
        }
        this.f153888b.mo212091I().mo212490a().mo212484p();
    }

    /* renamed from: s */
    private void m239352s() {
        View$OnClickListenerC62379p k;
        BottomBarControl bVar = (BottomBarControl) this.f153888b.ai();
        if (bVar != null && bVar.mo213079q() != null && (bVar.mo213079q() instanceof C62377n) && (k = ((C62377n) bVar.mo213079q()).mo215092k()) != null) {
            k.mo215672e();
        }
    }

    /* renamed from: n */
    public void mo212609n() {
        if (this.f153890d != null) {
            if (this.f153893g == null) {
                this.f153893g = new ArrayList();
            }
            this.f153893g.clear();
            for (Participant participant : this.f153889c) {
                if (!this.f153897k.contains(participant.getId())) {
                    this.f153893g.add(participant);
                }
            }
        }
    }

    /* renamed from: o */
    public int mo212610o() {
        int i;
        int i2 = 0;
        if (C60742af.m236059a(mo212601f())) {
            i = 0;
        } else {
            i = mo212601f().size();
        }
        if (!C60742af.m236059a(this.f153888b.mo212091I().mo212497d().mo212422d())) {
            i2 = this.f153888b.mo212091I().mo212497d().mo212422d().size();
        }
        return i + i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m239334D() {
        C60700b.m235851b("ParticipantData", "[onPushParticipantChange9]", "new size = " + this.f153894h.size() + ", onTheCall size = " + this.f153895i.size() + ", ringing size = " + this.f153896j.size());
        m239345b(this.f153888b.mo212055d());
        mo212609n();
        mo212611p();
        m239355v();
        m239358y();
    }

    /* renamed from: r */
    private void m239351r() {
        ArrayList arrayList = new ArrayList(this.f153907u);
        this.f153907u.clear();
        this.f153891e.clear();
        this.f153892f.clear();
        this.f153897k.clear();
        for (Participant participant : mo212601f()) {
            if (participant.getStatus() == Participant.Status.ON_THE_CALL && C60938g.m237062b(participant)) {
                this.f153907u.add(participant);
            }
            if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
                this.f153892f.add(participant);
            } else if (participant.getStatus() == Participant.Status.RINGING) {
                this.f153891e.add(participant);
            }
            this.f153897k.add(participant.getId());
        }
        if (arrayList.size() != this.f153907u.size()) {
            m239359z();
        }
    }

    /* renamed from: w */
    private void m239356w() {
        List<Participant> list = this.f153890d;
        if (list != null) {
            List<Participant> e = ParticipantUtil.m248737e(list);
            for (Participant participant : this.f153890d) {
                if (ParticipantUtil.m248717a(participant, this.f153903q, this.f153902p, ParticipantType.LARK_USER) && participant.getParticipantSettings() != null) {
                    this.f153888b.mo212092J().mo212554l(participant.getParticipantSettings().isPlayMeetingTone());
                }
            }
            if (this.f153901o > 0) {
                if (e.size() - this.f153901o == 1) {
                    C63492g.m248821a(true, Boolean.valueOf(this.f153888b.mo212092J().mo212512I()));
                }
                if (e.size() - this.f153901o == -1) {
                    C63492g.m248824b(true, Boolean.valueOf(this.f153888b.mo212092J().mo212512I()));
                }
            }
            this.f153901o = e.size();
        }
    }

    /* renamed from: x */
    private List<Participant> m239357x() {
        List<Participant> f = this.f153888b.mo212091I().mo212494b().mo212601f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (f != null && !f.isEmpty()) {
            for (Participant participant : f) {
                if (participant.getStatus() == Participant.Status.RINGING) {
                    arrayList2.add(participant);
                } else {
                    arrayList.add(participant);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public Participant mo212605j() {
        Participant participant = this.f153895i.get(this.f153904r);
        if (participant == null) {
            participant = ParticipantUtil.m248731c(this.f153894h);
        }
        if (participant == null) {
            C60700b.m235864f("ParticipantData", "[getSelfParticipant]", this.f153895i.size() + ", getSelfParticipant is null " + this.f153894h.size());
            participant = ParticipantUtil.m248731c(this.f153888b.mo212056e().getParticipants());
        }
        if (participant == null) {
            C60700b.m235864f("ParticipantData", "[getSelfParticipant2]", "impossible");
        }
        return participant;
    }

    /* renamed from: q */
    public List<C60940j> mo212612q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<Participant> x = m239357x();
        for (int i = 0; i < x.size(); i++) {
            if (C60938g.m237063c(x.get(i))) {
                Participant participant = x.get(i);
                arrayList2.add(new C60940j(new ByteviewUser(participant.getId(), participant.getDeviceId(), participant.getParticipantType()), InterpreterSetting.copyInterpreterSetting(participant.getParticipantSettings().getInterpreterSetting()), false));
            }
        }
        Collections.sort(arrayList2, new Comparator<C60940j>() {
            /* class com.ss.android.vc.meeting.model.C61388g.C613924 */

            /* renamed from: a */
            public int compare(C60940j jVar, C60940j jVar2) {
                if (jVar2.f152502b.interpreteSetTime > jVar.f152502b.interpreteSetTime) {
                    return 1;
                }
                return -1;
            }
        });
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            arrayList.add(arrayList2.get(i2));
        }
        return arrayList;
    }

    /* renamed from: p */
    public void mo212611p() {
        ArrayList<Participant> arrayList = new ArrayList();
        List<Participant> list = this.f153894h;
        if (list != null) {
            for (Participant participant : list) {
                if (UserInfoService.getUserInfoInCache(participant.getId(), participant.getParticipantType()) == null) {
                    arrayList.add(participant);
                }
            }
        }
        List<Participant> list2 = this.f153893g;
        if (list2 != null) {
            for (Participant participant2 : list2) {
                if (UserInfoService.getUserInfoInCache(participant2.getId(), participant2.getParticipantType()) == null) {
                    arrayList.add(participant2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C60700b.m235843a("ParticipantData", "[loadParticipantsUserInfo]", "no cache user size: " + arrayList.size());
            HashMap hashMap = new HashMap();
            for (Participant participant3 : arrayList) {
                if (participant3 != null && !TextUtils.isEmpty(participant3.getId())) {
                    hashMap.put(participant3.getId(), participant3.getParticipantType());
                }
            }
            UserInfoService.getUserInfoByIds(this.f153888b.mo212055d(), hashMap);
        }
    }

    /* renamed from: b */
    private void m239346b(List<Participant> list) {
        if (!C60742af.m236059a(list)) {
            Collections.sort(list, new Comparator() {
                /* class com.ss.android.vc.meeting.model.$$Lambda$g$eHuSvFRavO9Bps9MAdpRQV9Srz8 */

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C61388g.this.m239350e((Participant) obj, (Participant) obj2);
                }
            });
        }
    }

    /* renamed from: b */
    public void mo212597b(AbstractC61393a aVar) {
        if (this.f153906t.contains(aVar)) {
            this.f153906t.remove(aVar);
        }
    }

    public C61388g(C61303k kVar) {
        String c = VideoChatModuleDependency.m236630c();
        this.f153903q = c;
        this.f153904r = ParticipantUtil.m248729b(c, ParticipantType.LARK_USER, this.f153902p);
        this.f153905s = 0;
        this.f153906t = new CopyOnWriteArrayList();
        this.f153907u = new ArrayList();
        this.f153908v = false;
        this.f153889c = new CopyOnWriteArrayList();
        this.f153888b = kVar;
    }

    /* renamed from: a */
    private void m239338a(Participant participant) {
        if (participant != null) {
            for (AbstractC61393a aVar : this.f153906t) {
                aVar.mo212619a(participant);
            }
        }
    }

    /* renamed from: b */
    private void m239345b(String str) {
        if (this.f153888b.mo212057f() == VideoChat.Type.MEET && !TextUtils.isEmpty(str)) {
            boolean d = this.f153888b.mo212091I().mo212490a().mo212472d();
            C60700b.m235844a("ParticipantData", "[getSuggestedParticipants]", "shouldPullSuggested=" + d, 16000);
            if (d) {
                VcBizSender.m249280g(str).mo219889a(new AbstractC63598b<GetsuggetedParticipants>() {
                    /* class com.ss.android.vc.meeting.model.C61388g.C613891 */

                    /* renamed from: a */
                    public void onSuccess(GetsuggetedParticipants dVar) {
                        C26171w.m94675a(new Runnable(dVar) {
                            /* class com.ss.android.vc.meeting.model.$$Lambda$g$1$WcGes_k1PhoBwDUMqtQKao2e68A */
                            public final /* synthetic */ GetsuggetedParticipants f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C61388g.C613891.this.m239386b(this.f$1);
                            }
                        });
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235851b("ParticipantData", "[getSuggestedParticipants3]", eVar.toString());
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: b */
                    public /* synthetic */ void m239386b(GetsuggetedParticipants dVar) {
                        if (dVar != null && dVar.mo209709a() != null) {
                            C61388g.this.f153889c.clear();
                            C61388g.this.f153889c.addAll(dVar.mo209709a());
                            C60700b.m235851b("ParticipantData", "[getSuggestedParticipants2]", "<SuggestedParticipant> size=" + C61388g.this.f153889c.size());
                            C61388g.this.mo212609n();
                            C61388g.this.mo212611p();
                            C61388g.this.f153888b.mo212091I().mo212490a().mo212484p();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m239348c(List<Participant> list) {
        this.f153894h.clear();
        this.f153895i.clear();
        this.f153887a.clear();
        this.f153896j.clear();
        int i = 0;
        this.f153888b.mo212116a(false);
        if (!C60742af.m236059a(list)) {
            for (Participant participant : list) {
                if (participant.getStatus() == Participant.Status.ON_THE_CALL) {
                    this.f153895i.put(C60938g.m237060a(participant), participant);
                    this.f153887a.put(participant.getRtcJoinId(), participant);
                    i++;
                    if (ParticipantUtil.m248735d(participant)) {
                        this.f153888b.mo212116a(true);
                    }
                } else if (participant.getStatus() == Participant.Status.RINGING) {
                    this.f153896j.put(participant.getId(), participant);
                }
            }
            this.f153894h.addAll(this.f153895i.values());
            this.f153894h.addAll(this.f153896j.values());
        }
        this.f153905s = i;
        m239342a(this.f153894h, "preprocessParticipants", new Runnable() {
            /* class com.ss.android.vc.meeting.model.$$Lambda$g$y0N4yOOkiAbRJl6ap_oFbk_KNxo */

            public final void run() {
                C61388g.this.m239332B();
            }
        });
    }

    /* renamed from: a */
    public Participant mo212587a(ByteviewUser byteviewUser) {
        if (byteviewUser != null) {
            return mo212589a(byteviewUser.getUserId(), byteviewUser.getParticipantType(), byteviewUser.getDeviceId());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m239341a(List list, ObservableEmitter observableEmitter) throws Exception {
        m239346b(list);
        observableEmitter.onComplete();
    }

    /* renamed from: a */
    private void m239336a(InterpreterSetting interpreterSetting, InterpreterSetting interpreterSetting2) {
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.mo212617a(interpreterSetting, interpreterSetting2);
        }
    }

    /* renamed from: b */
    private void m239344b(Participant participant, Participant participant2) {
        C60700b.m235851b("ParticipantData", "[onSelfParticipantRoleUpdate]", "onSelfParticipantRoleUpdate");
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.mo212620a(participant, participant2);
        }
    }

    /* renamed from: c */
    private void m239347c(Participant participant, Participant participant2) {
        C60700b.m235851b("ParticipantData", "[onSelfRtcModeUpdate]", "onSelfRtcModeUpdate");
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.onSelfRtcModeUpdate(participant, participant2);
        }
    }

    /* renamed from: d */
    private void m239349d(Participant participant, Participant participant2) {
        C60700b.m235851b("ParticipantData", "[onSelfInterpretationRoleUpdate]", "onSelfInterpretationRoleUpdate");
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.mo212621b(participant, participant2);
        }
    }

    /* renamed from: a */
    private void m239337a(LanguageType languageType, LanguageType languageType2) {
        C60700b.m235851b("ParticipantData", "[onSelfToConfirmInterpretation]", "onSelfToConfirmInterpretation");
        for (AbstractC61393a aVar : this.f153906t) {
            aVar.mo212618a(languageType, languageType2);
        }
    }

    /* renamed from: a */
    private void m239339a(Participant participant, Participant participant2) {
        if (participant2 != null && participant != null) {
            if ((participant.isHostOrCoHost() && !participant2.isHostOrCoHost()) || (!participant.isHostOrCoHost() && participant2.isHostOrCoHost())) {
                m239352s();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ int m239350e(Participant participant, Participant participant2) {
        if (participant == null && participant2 == null) {
            return 0;
        }
        if (participant == null) {
            return 1;
        }
        if (participant2 == null) {
            return -1;
        }
        int number = C60938g.m237059a(participant, this.f153888b, this.f153902p).getNumber();
        int number2 = C60938g.m237059a(participant2, this.f153888b, this.f153902p).getNumber();
        if (number != number2) {
            return Integer.compare(number, number2);
        }
        String sortName = participant.getSortName();
        String sortName2 = participant2.getSortName();
        if (number == Participant.SortType.HANDS_UP.getNumber()) {
            return Long.compare(participant.getHandsUpTime(), participant2.getHandsUpTime());
        }
        if (number == Participant.SortType.CO_HOST.getNumber()) {
            if (sortName.toLowerCase().equals(sortName2.toLowerCase())) {
                return Long.compare(participant.getJoinTime(), participant2.getJoinTime());
            }
            return sortName.toLowerCase().compareTo(sortName2.toLowerCase());
        } else if (number == Participant.SortType.INTERPRETER.getNumber()) {
            if (participant.getParticipantSettings() == null || participant.getParticipantSettings().getInterpreterSetting() == null || participant2.getParticipantSettings() == null || participant2.getParticipantSettings().getInterpreterSetting() == null) {
                return 0;
            }
            return Long.compare(participant.getParticipantSettings().getInterpreterSetting().confirmInterpretationTime, participant2.getParticipantSettings().getInterpreterSetting().confirmInterpretationTime);
        } else if (number == Participant.SortType.ON_THE_CALL.getNumber()) {
            if (participant.getParticipantSettings().isMicrophoneMuted() == participant2.getParticipantSettings().isMicrophoneMuted()) {
                if (sortName.toLowerCase().equals(sortName2.toLowerCase())) {
                    return Long.compare(participant.getJoinTime(), participant2.getJoinTime());
                }
                return sortName.toLowerCase().compareTo(sortName2.toLowerCase());
            } else if (participant.getParticipantSettings().isMicrophoneMuted() || !participant2.getParticipantSettings().isMicrophoneMuted()) {
                return 1;
            } else {
                return -1;
            }
        } else if (number == Participant.SortType.RINGING.getNumber()) {
            return Long.compare(participant.getJoinTime(), participant2.getJoinTime());
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    private void m239343a(List<Participant> list, boolean z) {
        if (!z) {
            m239348c(list);
        } else if (!this.f153908v) {
            this.f153908v = true;
            m239348c(list);
        }
    }

    /* renamed from: a */
    public Participant mo212589a(String str, ParticipantType participantType, String str2) {
        return ParticipantUtil.m248702a(str, participantType, str2, this.f153894h);
    }

    /* renamed from: a */
    private void m239340a(Participant participant, Participant participant2, Participant participant3) {
        VideoChatUser userInfoInCache;
        if (participant2 != null && participant != null) {
            if (!participant.isCoHost() && participant2.isCoHost()) {
                C60738ac.m236037c((int) R.string.View_M_YouBecameCoHost);
            } else if (participant.isCoHost() && participant2.isParticipant()) {
                C60738ac.m236037c((int) R.string.View_M_CoHostPermissionWithdrawn);
            } else if (participant.is_host() && participant2.isParticipant() && participant3 != null && participant2.getParticipantRole() != ParticipantRole.INTERVIEWEE && (userInfoInCache = UserInfoService.getUserInfoInCache(participant3.getId(), participant3.getParticipantType())) != null) {
                C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_M_NameBecameHost, "name", userInfoInCache.getName()));
            }
        }
    }

    /* renamed from: a */
    private void m239342a(List<Participant> list, final String str, final Runnable runnable) {
        final ArrayList arrayList = new ArrayList(list);
        Observable.create(new ObservableOnSubscribe(arrayList) {
            /* class com.ss.android.vc.meeting.model.$$Lambda$g$yflMqlQa_bkMBr738ooHtlMjPk */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C61388g.this.m239341a((C61388g) this.f$1, (List) observableEmitter);
            }
        }).subscribeOn(C68279a.m265025d()).observeOn(AndroidSchedulers.mainThread()).doOnComplete(new AbstractC68309a() {
            /* class com.ss.android.vc.meeting.model.C61388g.C613913 */

            @Override // io.reactivex.functions.AbstractC68309a
            public void run() {
                C60700b.m235851b("ParticipantData", "[sortParticipantInChildThread]", str + " doOnComplete");
                C61388g.this.f153888b.mo212056e().setParticipants(arrayList);
                C61388g.this.mo212594a(arrayList);
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }).subscribe(new AbstractC69009q<Integer>() {
            /* class com.ss.android.vc.meeting.model.C61388g.C613902 */

            /* renamed from: a */
            public void onNext(Integer num) {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                C60735ab.m236019f(new Runnable(th, str) {
                    /* class com.ss.android.vc.meeting.model.$$Lambda$g$2$xTV6p99dvRZ_I5DPeUNe27cebmc */
                    public final /* synthetic */ Throwable f$0;
                    public final /* synthetic */ String f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C61388g.C613902.m239388a(this.f$0, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m239388a(Throwable th, String str) {
                String str2;
                String str3 = "---There's an error when/after sort participant, please check----" + th.getMessage();
                if (C60775q.m236138a()) {
                    str2 = Log.getStackTraceString(new Throwable(str3));
                } else {
                    str2 = str3;
                }
                C60775q.m236136a(str2);
                C60700b.m235851b("ParticipantData", "[sortParticipantInChildThread2]", str + " onError: " + str3);
            }
        });
    }
}
