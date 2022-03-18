package com.ss.android.vc.meeting.module.base;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.common.singleinstance.SingleInstanceControl;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.meeting.bytertc.AbsMediaDeviceWarningControl;
import com.ss.android.vc.meeting.bytertc.MediaDeviceWarningControl;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.DisplayMode;
import com.ss.android.vc.meeting.module.bottombar.BottomBarControl;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.breakoutroom.C61511a;
import com.ss.android.vc.meeting.module.busyring.AbstractC61540a;
import com.ss.android.vc.meeting.module.busyring.C61542b;
import com.ss.android.vc.meeting.module.chat.C61576c;
import com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a;
import com.ss.android.vc.meeting.module.chat.p3115a.C61569b;
import com.ss.android.vc.meeting.module.codeinterview.AbsCodeInterviewControl;
import com.ss.android.vc.meeting.module.codeinterview.CodeInterviewControl;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61658a;
import com.ss.android.vc.meeting.module.fastentry.FastEntryControl;
import com.ss.android.vc.meeting.module.floatingwindow.C61731d;
import com.ss.android.vc.meeting.module.follow.FollowControl;
import com.ss.android.vc.meeting.module.gallery.AbsGalleryControl;
import com.ss.android.vc.meeting.module.gallery.GalleryControl;
import com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a;
import com.ss.android.vc.meeting.module.interpretation.p3126a.C61937c;
import com.ss.android.vc.meeting.module.livestream.C62067f;
import com.ss.android.vc.meeting.module.lobby.AbsLobbyControl;
import com.ss.android.vc.meeting.module.lobby.C62121d;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.gridcontent.GridContentControl;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.p3140a.C62488c;
import com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl;
import com.ss.android.vc.meeting.module.multi.sharecontent.ShareContentControl;
import com.ss.android.vc.meeting.module.p3114c.AbstractC61547a;
import com.ss.android.vc.meeting.module.p3114c.C61549b;
import com.ss.android.vc.meeting.module.p3118e.AbstractC61601a;
import com.ss.android.vc.meeting.module.p3118e.C61603b;
import com.ss.android.vc.meeting.module.p3129j.C61997c;
import com.ss.android.vc.meeting.module.p3132l.AbstractC62004a;
import com.ss.android.vc.meeting.module.p3132l.C62006b;
import com.ss.android.vc.meeting.module.p3148o.C62607d;
import com.ss.android.vc.meeting.module.p3148o.C62611e;
import com.ss.android.vc.meeting.module.p3151p.C62614c;
import com.ss.android.vc.meeting.module.p3155q.C62786c;
import com.ss.android.vc.meeting.module.p3156r.C62788b;
import com.ss.android.vc.meeting.module.reaction.ReactionControl;
import com.ss.android.vc.meeting.module.record.C62897d;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.module.sharebox.C63053o;
import com.ss.android.vc.meeting.module.sketch.SketchControl;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.meeting.module.speakrequest.C63112b;
import com.ss.android.vc.meeting.module.subtitle.C63167m;
import com.ss.android.vc.meeting.module.topbar.TopBarControl;
import com.ss.android.vc.meeting.module.toptips.TopTipsControl;
import com.ss.android.vc.meeting.module.volumeIndicator.AudioVolumeIndicatorControl;
import com.ss.android.vc.meeting.utils.ParticipantUtil;

/* renamed from: com.ss.android.vc.meeting.module.base.l */
public class C61433l extends AbstractC61417a {

    /* renamed from: A */
    private C62006b f154028A;

    /* renamed from: B */
    private C61569b f154029B;

    /* renamed from: C */
    private C62611e f154030C;

    /* renamed from: D */
    private CodeInterviewControl f154031D;

    /* renamed from: E */
    private TopBarControl f154032E;

    /* renamed from: F */
    private BottomBarControl f154033F;

    /* renamed from: G */
    private FastEntryControl f154034G;

    /* renamed from: H */
    private GridContentControl f154035H;

    /* renamed from: I */
    private TopTipsControl f154036I;

    /* renamed from: J */
    private MediaDeviceWarningControl f154037J;

    /* renamed from: K */
    private SingleInstanceControl f154038K;

    /* renamed from: a */
    private C61303k f154039a;

    /* renamed from: b */
    private C62788b f154040b;

    /* renamed from: c */
    private C62897d f154041c;

    /* renamed from: d */
    private C63167m f154042d;

    /* renamed from: e */
    private C61542b f154043e;

    /* renamed from: f */
    private C62607d f154044f;

    /* renamed from: g */
    private FollowControl f154045g;

    /* renamed from: h */
    private C61731d f154046h;

    /* renamed from: i */
    private C62786c f154047i;

    /* renamed from: j */
    private SketchControl f154048j;

    /* renamed from: k */
    private C62067f f154049k;

    /* renamed from: l */
    private C62614c f154050l;

    /* renamed from: m */
    private C63053o f154051m;

    /* renamed from: n */
    private C61511a f154052n;

    /* renamed from: o */
    private C61997c f154053o;

    /* renamed from: p */
    private ReactionControl f154054p;

    /* renamed from: q */
    private C61576c f154055q;

    /* renamed from: r */
    private C62121d f154056r;

    /* renamed from: s */
    private AudioVolumeIndicatorControl f154057s;

    /* renamed from: t */
    private C63112b f154058t;

    /* renamed from: u */
    private C61937c f154059u;

    /* renamed from: v */
    private C61549b f154060v;

    /* renamed from: w */
    private C61603b f154061w;

    /* renamed from: x */
    private GalleryControl f154062x;

    /* renamed from: y */
    private ShareContentControl f154063y;

    /* renamed from: z */
    private C62488c f154064z;

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: A */
    public AbstractC61601a mo212812A() {
        if (this.f154061w == null) {
            this.f154061w = new C61603b(this.f154039a);
        }
        return this.f154061w;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: B */
    public AbsGalleryControl mo212813B() {
        if (this.f154062x == null) {
            this.f154062x = new GalleryControl(this.f154039a);
        }
        return this.f154062x;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: C */
    public AbsShareContentControl mo212814C() {
        if (this.f154063y == null) {
            this.f154063y = new ShareContentControl(this.f154039a);
        }
        return this.f154063y;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: D */
    public AbstractC62485a mo212815D() {
        if (this.f154064z == null) {
            this.f154064z = new C62488c(this.f154039a);
        }
        return this.f154064z;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: E */
    public AbstractC62004a mo212816E() {
        if (this.f154028A == null) {
            this.f154028A = new C62006b(this.f154039a);
        }
        return this.f154028A;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: F */
    public AbstractC61567a mo212817F() {
        if (this.f154029B == null) {
            this.f154029B = new C61569b(this.f154039a);
        }
        return this.f154029B;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: H */
    public AbsCodeInterviewControl mo212819H() {
        if (this.f154031D == null) {
            this.f154031D = new CodeInterviewControl(this.f154039a);
        }
        return this.f154031D;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: I */
    public AbsMediaDeviceWarningControl mo212820I() {
        if (this.f154037J == null) {
            this.f154037J = new MediaDeviceWarningControl(this.f154039a);
        }
        return this.f154037J;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: J */
    public AbsSingleInstanceControl mo212821J() {
        if (this.f154038K == null) {
            this.f154038K = new SingleInstanceControl(this.f154039a);
        }
        return this.f154038K;
    }

    /* renamed from: K */
    public C62788b mo212826e() {
        if (this.f154040b == null) {
            this.f154040b = new C62788b(this.f154039a);
        }
        return this.f154040b;
    }

    /* renamed from: L */
    public TopTipsControl mo212827f() {
        if (this.f154036I == null) {
            this.f154036I = new TopTipsControl(this.f154039a);
        }
        return this.f154036I;
    }

    /* renamed from: M */
    public C62607d mo212825d() {
        if (this.f154044f == null) {
            this.f154044f = new C62607d(this.f154039a);
        }
        return this.f154044f;
    }

    /* renamed from: N */
    public C61997c mo212838q() {
        if (this.f154053o == null) {
            this.f154053o = new C61997c(this.f154039a);
        }
        return this.f154053o;
    }

    /* renamed from: O */
    public C62897d mo212822a() {
        if (this.f154041c == null) {
            this.f154041c = new C62897d(this.f154039a);
        }
        return this.f154041c;
    }

    /* renamed from: P */
    public C63167m mo212823b() {
        if (this.f154042d == null) {
            this.f154042d = new C63167m(this.f154039a);
        }
        return this.f154042d;
    }

    /* renamed from: Q */
    public FollowControl mo212828g() {
        if (this.f154045g == null) {
            this.f154045g = new FollowControl(this.f154039a);
        }
        return this.f154045g;
    }

    /* renamed from: R */
    public C61731d mo212829h() {
        if (this.f154046h == null) {
            this.f154046h = new C61731d(this.f154039a);
        }
        return this.f154046h;
    }

    /* renamed from: S */
    public C62786c mo212830i() {
        if (this.f154047i == null) {
            this.f154047i = new C62786c(this.f154039a);
        }
        return this.f154047i;
    }

    /* renamed from: T */
    public SketchControl mo212831j() {
        if (this.f154048j == null) {
            this.f154048j = new SketchControl(this.f154039a);
        }
        return this.f154048j;
    }

    /* renamed from: U */
    public TopBarControl mo212832k() {
        if (this.f154032E == null) {
            this.f154032E = new TopBarControl(this.f154039a);
        }
        return this.f154032E;
    }

    /* renamed from: V */
    public BottomBarControl mo212833l() {
        if (this.f154033F == null) {
            this.f154033F = new BottomBarControl(this.f154039a);
        }
        return this.f154033F;
    }

    /* renamed from: W */
    public C62614c mo212834m() {
        if (this.f154050l == null) {
            this.f154050l = new C62614c(this.f154039a);
        }
        return this.f154050l;
    }

    /* renamed from: X */
    public C62067f mo212837p() {
        if (this.f154049k == null) {
            this.f154049k = new C62067f(this.f154039a);
        }
        return this.f154049k;
    }

    /* renamed from: Y */
    public ReactionControl mo212839r() {
        if (this.f154054p == null) {
            this.f154054p = new ReactionControl(this.f154039a);
        }
        return this.f154054p;
    }

    /* renamed from: Z */
    public C61576c mo212840s() {
        if (this.f154055q == null) {
            this.f154055q = new C61576c(this.f154039a);
        }
        return this.f154055q;
    }

    /* renamed from: aa */
    public C62611e mo212818G() {
        if (this.f154030C == null) {
            this.f154030C = new C62611e(this.f154039a);
        }
        return this.f154030C;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: c */
    public AbstractC61540a mo212824c() {
        if (this.f154043e == null) {
            this.f154043e = new C61542b(this.f154039a);
        }
        return this.f154043e;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: n */
    public AbstractC63022a mo212835n() {
        if (this.f154051m == null) {
            this.f154051m = new C63053o(this.f154039a);
        }
        return this.f154051m;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: o */
    public AbsBreakoutRoomControl mo212836o() {
        if (this.f154052n == null) {
            this.f154052n = new C61511a(this.f154039a);
        }
        return this.f154052n;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: t */
    public AudioVolumeIndicatorControl mo212841t() {
        if (this.f154057s == null) {
            this.f154057s = new AudioVolumeIndicatorControl(this.f154039a);
        }
        return this.f154057s;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: u */
    public AbsLobbyControl mo212842u() {
        if (this.f154056r == null) {
            this.f154056r = new C62121d(this.f154039a);
        }
        return this.f154056r;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: v */
    public AbstractC61658a mo212843v() {
        if (this.f154034G == null) {
            this.f154034G = new FastEntryControl(this.f154039a);
        }
        return this.f154034G;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: w */
    public AbsSpeakRequestControl mo212844w() {
        if (this.f154058t == null) {
            this.f154058t = new C63112b(this.f154039a);
        }
        return this.f154058t;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: x */
    public AbstractC61935a mo212845x() {
        if (this.f154059u == null) {
            this.f154059u = new C61937c(this.f154039a);
        }
        return this.f154059u;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: y */
    public AbsGridContentControl mo212846y() {
        if (this.f154035H == null) {
            this.f154035H = new GridContentControl(this.f154039a);
        }
        return this.f154035H;
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61417a
    /* renamed from: z */
    public AbstractC61547a mo212847z() {
        if (this.f154060v == null) {
            this.f154060v = new C61549b(this.f154039a);
        }
        return this.f154060v;
    }

    public C61433l(C61303k kVar) {
        this.f154039a = kVar;
        mo212830i().mo216833f();
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
        C61731d dVar = this.f154046h;
        if (dVar != null) {
            dVar.mo212080a(type);
        }
        C62067f fVar = this.f154049k;
        if (fVar != null) {
            fVar.mo212080a(type);
        }
        FastEntryControl fastEntryControl = this.f154034G;
        if (fastEntryControl != null) {
            fastEntryControl.mo212080a(type);
        }
        BottomBarControl bVar = this.f154033F;
        if (bVar != null) {
            bVar.mo213075a(type);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        ParticipantSettings b;
        if (videoChatInMeetingInfo == null) {
            C60700b.m235864f("MeetingControl", "[onInMeetingInfoUpdate]", "inMeetingInfo is null");
            return;
        }
        C62067f fVar = this.f154049k;
        if (fVar != null) {
            fVar.mo214792a(videoChatInMeetingInfo.getLiveInfo());
        }
        mo212822a().mo217359a(videoChatInMeetingInfo.isRecording(), videoChatInMeetingInfo.isHasRecorded());
        if (!(this.f154042d == null || (b = ParticipantUtil.m248724b(this.f154039a.mo212091I().mo212494b().mo212601f())) == null)) {
            this.f154042d.mo218627a(b.isSubtitleOn(), b.getSubtitleLanguage(), b.getSpokenLanguage());
        }
        FollowControl followControl = this.f154045g;
        if (followControl != null) {
            followControl.mo213853a(videoChatInMeetingInfo);
        }
        C61511a aVar = this.f154052n;
        if (aVar != null) {
            aVar.mo213206a(videoChatInMeetingInfo);
        }
        TopBarControl bVar = this.f154032E;
        if (bVar != null) {
            bVar.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        BottomBarControl bVar2 = this.f154033F;
        if (bVar2 != null) {
            bVar2.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        FastEntryControl fastEntryControl = this.f154034G;
        if (fastEntryControl != null) {
            fastEntryControl.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        C61731d dVar = this.f154046h;
        if (dVar != null) {
            dVar.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        C63112b bVar3 = this.f154058t;
        if (bVar3 != null) {
            bVar3.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        GridContentControl cVar = this.f154035H;
        if (cVar != null) {
            cVar.mo216162a(videoChatInMeetingInfo);
        }
        C62788b bVar4 = this.f154040b;
        if (bVar4 != null) {
            bVar4.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        GalleryControl cVar2 = this.f154062x;
        if (cVar2 != null) {
            cVar2.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
        C62488c cVar3 = this.f154064z;
        if (cVar3 != null) {
            cVar3.mo216063a(videoChatInMeetingInfo);
        }
        C62614c cVar4 = this.f154050l;
        if (cVar4 != null) {
            cVar4.onInMeetingInfoUpdate(videoChatInMeetingInfo);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61297e
    public void onDisplayModeChange(DisplayMode displayMode, DisplayMode displayMode2) {
        C62897d dVar = this.f154041c;
        if (dVar != null) {
            dVar.onDisplayModeChange(displayMode, displayMode2);
        }
        C61731d dVar2 = this.f154046h;
        if (dVar2 != null) {
            dVar2.onDisplayModeChange(displayMode, displayMode2);
        }
        C62786c cVar = this.f154047i;
        if (cVar != null) {
            cVar.onDisplayModeChange(displayMode, displayMode2);
        }
        C62067f fVar = this.f154049k;
        if (fVar != null) {
            fVar.onDisplayModeChange(displayMode, displayMode2);
        }
        C61997c cVar2 = this.f154053o;
        if (cVar2 != null) {
            cVar2.onDisplayModeChange(displayMode, displayMode2);
        }
        FastEntryControl fastEntryControl = this.f154034G;
        if (fastEntryControl != null) {
            fastEntryControl.onDisplayModeChange(displayMode, displayMode2);
        }
        C61937c cVar3 = this.f154059u;
        if (cVar3 != null) {
            cVar3.onDisplayModeChange(displayMode, displayMode2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j
    public void onTransform(int i, int i2, int i3) {
        C62607d dVar = this.f154044f;
        if (dVar != null) {
            dVar.onTransform(i, i2, i3);
        }
        C62788b bVar = this.f154040b;
        if (bVar != null) {
            bVar.onTransform(i, i2, i3);
        }
        C62897d dVar2 = this.f154041c;
        if (dVar2 != null) {
            dVar2.onTransform(i, i2, i3);
        }
        C63167m mVar = this.f154042d;
        if (mVar != null) {
            mVar.onTransform(i, i2, i3);
        }
        C61731d dVar3 = this.f154046h;
        if (dVar3 != null) {
            dVar3.onTransform(i, i2, i3);
        }
        FollowControl followControl = this.f154045g;
        if (followControl != null) {
            followControl.onTransform(i, i2, i3);
        }
        FastEntryControl fastEntryControl = this.f154034G;
        if (fastEntryControl != null) {
            fastEntryControl.onTransform(i, i2, i3);
        }
        C62786c cVar = this.f154047i;
        if (cVar != null) {
            cVar.onTransform(i, i2, i3);
        }
        SketchControl sketchControl = this.f154048j;
        if (sketchControl != null) {
            sketchControl.onTransform(i, i2, i3);
        }
        TopBarControl bVar2 = this.f154032E;
        if (bVar2 != null) {
            bVar2.onTransform(i, i2, i3);
        }
        BottomBarControl bVar3 = this.f154033F;
        if (bVar3 != null) {
            bVar3.onTransform(i, i2, i3);
        }
        C62067f fVar = this.f154049k;
        if (fVar != null) {
            fVar.onTransform(i, i2, i3);
        }
        C62614c cVar2 = this.f154050l;
        if (cVar2 != null) {
            cVar2.onTransform(i, i2, i3);
        }
        C61511a aVar = this.f154052n;
        if (aVar != null) {
            aVar.onTransform(i, i2, i3);
        }
        C61997c cVar3 = this.f154053o;
        if (cVar3 != null) {
            cVar3.onTransform(i, i2, i3);
        }
        AudioVolumeIndicatorControl aVar2 = this.f154057s;
        if (aVar2 != null) {
            aVar2.onTransform(i, i2, i3);
        }
        GridContentControl cVar4 = this.f154035H;
        if (cVar4 != null) {
            cVar4.onTransform(i, i2, i3);
        }
        C62006b bVar4 = this.f154028A;
        if (bVar4 != null) {
            bVar4.onTransform(i, i2, i3);
        }
    }
}
