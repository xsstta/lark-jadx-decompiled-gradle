package com.ss.android.vc.meeting.module.p3155q;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63756f;
import com.ss.android.vc.statistics.event.C63763l;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.vc.meeting.module.q.c */
public class C62786c extends AbstractC62782a {

    /* renamed from: a */
    private C62784b f157952a;

    /* renamed from: b */
    private List<AbstractC62782a.AbstractC62783a> f157953b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private int f157954c = 0;

    /* renamed from: d */
    private int f157955d = 0;

    /* renamed from: e */
    private boolean f157956e;

    /* renamed from: f */
    private boolean f157957f = false;

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: e */
    public boolean mo216827e() {
        if (this.f157954c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m245692h() {
        runOnUiThread(new Runnable() {
            /* class com.ss.android.vc.meeting.module.p3155q.$$Lambda$c$vz_kf8JOK2o__meYtaMZRaBQRKk */

            public final void run() {
                C62786c.this.m245695k();
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: c */
    public boolean mo216825c() {
        int i = this.f157954c;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: d */
    public boolean mo216826d() {
        if (!this.f157956e || !mo216827e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo216833f() {
        runOnUiThread(new Runnable() {
            /* class com.ss.android.vc.meeting.module.p3155q.$$Lambda$c$Ozy3USm34b585vr1zqfQLGcH60 */

            public final void run() {
                C62786c.this.m245694j();
            }
        });
    }

    /* renamed from: g */
    public void mo216834g() {
        C62784b bVar = this.f157952a;
        if (bVar != null) {
            bVar.mo216830b();
            this.f157952a = null;
            this.f157957f = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m245694j() {
        if (this.f157952a == null) {
            C62784b bVar = new C62784b(ar.m236694a());
            this.f157952a = bVar;
            bVar.mo216829a(this);
        }
        this.f157952a.mo216828a();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m245695k() {
        if (this.f157952a == null) {
            C62784b bVar = new C62784b(ar.m236694a());
            this.f157952a = bVar;
            bVar.mo216829a(this);
        }
    }

    /* renamed from: i */
    private void m245693i() {
        C60700b.m235851b("VCTelephoneControl", "[callingCancel]", "1v1 calling Cancel when telephone is off hook.");
        getMeeting().mo212051a(C61344j.m239002a().mo212329a(104).mo212331a(EventSource.EVENT_ACTIVITY));
        C63756f.m250285a(getMeeting().mo212056e());
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: a */
    public void mo216820a() {
        String str;
        C60700b.m235851b("VCTelephoneControl", "[muteLocalMic]", "meetingType= " + getMeeting().mo212058g());
        getMeeting().mo212165y().mo212016c(true);
        if (!getMeeting().al().mo213182i() || getMeeting().al().mo213184k() == null) {
            str = "";
        } else {
            str = getMeeting().al().mo213184k().getBreakoutRoomId();
        }
        VcBizService.muteAudio(getMeeting().mo212055d(), str, true, false, C60788y.m236250b(ar.m236694a()));
        getMeeting().mo212092J().mo212542f(true);
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: b */
    public void mo216823b() {
        C60700b.m235851b("VCTelephoneControl", "[muteLocalVideo]", "meetingType= " + getMeeting().mo212058g());
        getMeeting().mo212165y().mo212017d();
        VcBizService.muteCamera(getMeeting().mo212055d(), true, false, C60788y.m236247a(ar.m236694a()));
        getMeeting().mo212165y().mo212018d(true);
        getMeeting().mo212092J().mo212539e(true);
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: a */
    public void mo216822a(boolean z) {
        this.f157956e = z;
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: a */
    public void mo216821a(AbstractC62782a.AbstractC62783a aVar) {
        if (!this.f157953b.contains(aVar)) {
            this.f157953b.add(aVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.AbstractC62782a
    /* renamed from: b */
    public void mo216824b(AbstractC62782a.AbstractC62783a aVar) {
        if (aVar != null && !CollectionUtils.isEmpty(this.f157953b)) {
            this.f157953b.remove(aVar);
        }
    }

    public C62786c(C61303k kVar) {
        super(kVar);
        m245692h();
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        super.onDisplayModeChange(displayMode, displayMode2);
        C60700b.m235851b("VCTelephoneControl", "[onDisplayModeChange]", "[src,dst] = [" + displayMode + " ," + displayMode2 + "]");
        if (displayMode2 == DisplayMode.ACTIVITY && mo216825c()) {
            mo216822a(false);
        }
    }

    @Override // com.ss.android.vc.meeting.module.p3155q.C62784b.AbstractC62785a
    /* renamed from: a */
    public void mo213483a(int i, String str) {
        boolean z;
        this.f157954c = i;
        if (i != 0) {
            MeetingAudioManager.m239471k().mo212698d(false);
        }
        if (i == 0) {
            C60700b.m235851b("VCTelephoneControl", "[onCallStateChanged]", "VC_TELE_STATE_IDLE meetingType: " + getMeeting().mo212058g());
            if (!getMeeting().mo212092J().mo212510G()) {
                C60700b.m235851b("VCTelephoneControl", "[onCallStateChanged2]", "idle: unmute AllRemoteAudioStreams");
                getMeeting().mo212165y().mo212022f(false);
            }
            for (AbstractC62782a.AbstractC62783a aVar : this.f157953b) {
                aVar.mo213815g();
            }
            if (this.f157955d != i) {
                MeetingAudioManager.m239471k().mo212698d(true);
            }
        } else if (i == 1 || i == 2) {
            C60700b.m235851b("VCTelephoneControl", "[onCallStateChanged4]", "VC_TELE_TATE_OFFHOOK meetingType: " + getMeeting().mo212058g());
            boolean A = getMeeting().mo212092J().mo212504A();
            boolean B = getMeeting().mo212092J().mo212505B();
            boolean G = getMeeting().mo212092J().mo212510G();
            C60700b.m235851b("VCTelephoneControl", "[onCallStateChanged5]", "isVideoMuted: " + A + " isMicrophoneMuted: " + B + " isPlaybackDigitalMute: " + G + " needCancel: " + this.f157957f);
            if (!A || !B) {
                z = true;
            } else {
                z = false;
            }
            mo216822a(z);
            if (getMeeting().mo212058g() == VideoChat.Type.CALL && getMeeting().mo212064m()) {
                if (this.f157957f) {
                    m245693i();
                    this.f157957f = false;
                }
                C63763l.m250307b(false, getMeeting().mo212056e());
            }
            if (getMeeting().mo212065n()) {
                if (!A) {
                    mo216823b();
                }
                if (!B) {
                    mo216820a();
                }
                if (!G) {
                    C60700b.m235851b("VCTelephoneControl", "[onCallStateChanged6]", "setPlaybackDigitalMute true");
                    getMeeting().mo212165y().mo212022f(true);
                }
                if (getMeeting().mo212058g() == VideoChat.Type.CALL) {
                    C63763l.m250307b(true, getMeeting().mo212056e());
                } else if (getMeeting().mo212058g() == VideoChat.Type.MEET) {
                    C63742at.m250094e(true, getMeeting().mo212056e());
                }
            }
            for (AbstractC62782a.AbstractC62783a aVar2 : this.f157953b) {
                aVar2.mo213816j();
            }
        } else if (i == 3) {
            C60700b.m235851b("VCTelephoneControl", "[onCallStateChanged3]", "VC_TELE_STATE_RINGING meetingType: " + getMeeting().mo212058g());
            this.f157957f = true;
        }
        this.f157955d = i;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            C60700b.m235851b("VCTelephoneControl", "[onTransform]", "State.SmState.IDLE");
            getMeeting().mo212165y().mo212022f(false);
            mo216834g();
            if (!CollectionUtils.isEmpty(this.f157953b)) {
                this.f157953b.clear();
            }
        } else if (i2 == 4 && mo216825c()) {
            C60700b.m235851b("VCTelephoneControl", "[onTransform2]", "State.SmState.ON_THE_CALL, telephone is off hook: " + mo216825c());
            if (!getMeeting().mo212092J().mo212510G()) {
                C60700b.m235851b("VCTelephoneControl", "[onTransform3]", "setPlaybackDigitalMute");
                getMeeting().mo212165y().mo212022f(true);
            }
        }
    }
}
