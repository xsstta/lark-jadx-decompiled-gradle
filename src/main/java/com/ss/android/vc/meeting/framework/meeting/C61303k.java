package com.ss.android.vc.meeting.framework.meeting;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.vc.apm.VCApmSampleMemInfo;
import com.ss.android.vc.apm.VCOnlineApmCollector;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3080d.C60724i;
import com.ss.android.vc.common.p3083e.C60784w;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.p3083e.C60788y;
import com.ss.android.vc.common.singleinstance.AbsSingleInstanceControl;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.C60998v;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatInMeetingInfo;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.bytertc.MeetingSdkListener;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.rtcstream.StreamManagerGlobal;
import com.ss.android.vc.meeting.framework.statemachine.C61334a;
import com.ss.android.vc.meeting.framework.statemachine.C61335b;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.C61345k;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.model.MeetingSpecificData;
import com.ss.android.vc.meeting.model.data.SmStateTransformData;
import com.ss.android.vc.meeting.model.util.MeetingTimerHelper;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.meeting.module.base.AbstractC61417a;
import com.ss.android.vc.meeting.module.base.C61433l;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.breakoutroom.AbsBreakoutRoomControl;
import com.ss.android.vc.meeting.module.busyring.AbstractC61540a;
import com.ss.android.vc.meeting.module.calendar.C61562e;
import com.ss.android.vc.meeting.module.chat.AbstractC61566a;
import com.ss.android.vc.meeting.module.chat.p3115a.AbstractC61567a;
import com.ss.android.vc.meeting.module.codeinterview.AbsCodeInterviewControl;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61658a;
import com.ss.android.vc.meeting.module.floatingwindow.AbstractC61728a;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.p3121b.C61775b;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import com.ss.android.vc.meeting.module.gallery.AbsGalleryControl;
import com.ss.android.vc.meeting.module.interpretation.p3126a.AbstractC61935a;
import com.ss.android.vc.meeting.module.joinmeetingauth.SecuritySettingManager;
import com.ss.android.vc.meeting.module.livestream.AbstractC62011a;
import com.ss.android.vc.meeting.module.lobby.AbsLobbyControl;
import com.ss.android.vc.meeting.module.lobby.pb.C62149b;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsPerfChecker;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.gridcontent.AbsGridContentControl;
import com.ss.android.vc.meeting.module.multi.gridcontent.TriggerType;
import com.ss.android.vc.meeting.module.multi.p3140a.AbstractC62485a;
import com.ss.android.vc.meeting.module.multi.sharecontent.AbsShareContentControl;
import com.ss.android.vc.meeting.module.p3114c.AbstractC61547a;
import com.ss.android.vc.meeting.module.p3118e.AbstractC61601a;
import com.ss.android.vc.meeting.module.p3129j.AbstractC61994a;
import com.ss.android.vc.meeting.module.p3132l.AbstractC62004a;
import com.ss.android.vc.meeting.module.p3148o.AbstractC62555a;
import com.ss.android.vc.meeting.module.p3151p.AbstractC62612a;
import com.ss.android.vc.meeting.module.p3155q.AbstractC62782a;
import com.ss.android.vc.meeting.module.p3156r.AbstractC62787a;
import com.ss.android.vc.meeting.module.p3159s.AbstractC62904a;
import com.ss.android.vc.meeting.module.reaction.AbsReactionControl;
import com.ss.android.vc.meeting.module.receiver.VcScreenMonitor;
import com.ss.android.vc.meeting.module.record.AbstractC62894a;
import com.ss.android.vc.meeting.module.screenmonitor.ScreenMonitorForCamera;
import com.ss.android.vc.meeting.module.sharebox.AbstractC63022a;
import com.ss.android.vc.meeting.module.sketch.AbsSketchControl;
import com.ss.android.vc.meeting.module.speakrequest.AbsSpeakRequestControl;
import com.ss.android.vc.meeting.module.subtitle.AbstractC63121a;
import com.ss.android.vc.meeting.module.topbar.AbstractC63441a;
import com.ss.android.vc.meeting.module.volumeIndicator.AudioVolumeIndicatorControl;
import com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.net.service.VideoChatUserRole;
import com.ss.android.vc.net.service.VideoChatUserService;
import com.ss.android.vc.p3069b.C60680d;
import com.ss.android.vc.p3069b.p3072c.C60675a;
import com.ss.android.vc.service.VideoChatManager;
import com.ss.android.vc.service.impl.RegisterClientInfoExecuter;
import com.ss.android.vc.statistics.event.C63732ac;
import com.ss.android.vc.statistics.p3180a.C63688c;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.ss.android.vc.statistics.p3180a.C63694f;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vcxp.C63801c;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.k */
public class C61303k extends AbstractC61294b implements AbstractC61298f, AbstractC61300h {

    /* renamed from: A */
    private final transient C1177w<SmStateTransformData> f153563A;

    /* renamed from: B */
    private VcMsgInfo f153564B;

    /* renamed from: C */
    private final transient List<AbstractC61298f> f153565C;

    /* renamed from: D */
    private final transient StreamManagerGlobal f153566D;

    /* renamed from: E */
    private final transient LabsPerfChecker f153567E;

    /* renamed from: F */
    private final transient SecuritySettingManager f153568F;

    /* renamed from: G */
    private transient VCNotice f153569G;

    /* renamed from: H */
    private transient VCNotice f153570H;

    /* renamed from: I */
    private transient VCNotice f153571I;

    /* renamed from: J */
    private transient VcScreenMonitor.AbstractC62891b f153572J;

    /* renamed from: K */
    private transient ScreenMonitorForCamera f153573K;

    /* renamed from: L */
    private transient int f153574L;

    /* renamed from: M */
    private transient VCOnlineApmCollector f153575M;

    /* renamed from: N */
    private transient boolean f153576N;

    /* renamed from: O */
    private volatile boolean f153577O;

    /* renamed from: P */
    private final transient Runnable f153578P;

    /* renamed from: Q */
    private final transient Runnable f153579Q;

    /* renamed from: R */
    private final transient AbstractC38769a f153580R;

    /* renamed from: i */
    public transient String f153581i = ("Meeting@" + hashCode());

    /* renamed from: j */
    public final transient MeetingSpecificData f153582j = new MeetingSpecificData(this);

    /* renamed from: k */
    public transient LiveData<SmStateTransformData> f153583k;

    /* renamed from: l */
    public transient MeetingTimerHelper f153584l;

    /* renamed from: m */
    public transient AbstractC61417a f153585m;

    /* renamed from: n */
    private final C61316q f153586n = new C61316q();

    /* renamed from: o */
    private boolean f153587o = false;

    /* renamed from: p */
    private boolean f153588p = false;

    /* renamed from: q */
    private final transient VideoChatUserService f153589q = new VideoChatUserService();

    /* renamed from: r */
    private final transient List<AbstractC61299g> f153590r = new CopyOnWriteArrayList();

    /* renamed from: s */
    private final transient ByteRtc f153591s;

    /* renamed from: t */
    private boolean f153592t = true;

    /* renamed from: u */
    private boolean f153593u = false;

    /* renamed from: v */
    private final transient C61383d f153594v = new C61383d(this);

    /* renamed from: w */
    private String f153595w = UUID.randomUUID().toString();

    /* renamed from: x */
    private transient MeetingSdkListener f153596x;

    /* renamed from: y */
    private transient ActiveSpeakerCalculator f153597y;

    /* renamed from: z */
    private final transient Handler f153598z = new Handler(Looper.getMainLooper());

    /* renamed from: B */
    public C61316q mo212084B() {
        return this.f153586n;
    }

    /* renamed from: C */
    public boolean mo212085C() {
        return this.f153587o;
    }

    /* renamed from: D */
    public boolean mo212086D() {
        return this.f153592t;
    }

    /* renamed from: E */
    public boolean mo212087E() {
        return this.f153588p;
    }

    /* renamed from: F */
    public VideoChatUserService mo212088F() {
        return this.f153589q;
    }

    /* renamed from: H */
    public VideoChat.MeetingSource mo212090H() {
        return this.f153553f;
    }

    /* renamed from: I */
    public C61383d mo212091I() {
        return this.f153594v;
    }

    /* renamed from: J */
    public MeetingSpecificData mo212092J() {
        return this.f153582j;
    }

    /* renamed from: K */
    public String mo212093K() {
        return this.f153595w;
    }

    /* renamed from: L */
    public VcMsgInfo mo212094L() {
        return this.f153564B;
    }

    /* renamed from: M */
    public VCNotice mo212095M() {
        return this.f153569G;
    }

    /* renamed from: N */
    public VCNotice mo212096N() {
        return this.f153570H;
    }

    /* renamed from: O */
    public VCNotice mo212097O() {
        return this.f153571I;
    }

    /* renamed from: T */
    public StreamManagerGlobal mo212102T() {
        return this.f153566D;
    }

    /* renamed from: U */
    public LabsPerfChecker mo212103U() {
        return this.f153567E;
    }

    /* renamed from: V */
    public int mo212104V() {
        return this.f153574L;
    }

    /* renamed from: u */
    public SecuritySettingManager mo212161u() {
        return this.f153568F;
    }

    /* renamed from: v */
    public boolean mo212162v() {
        return this.f153577O;
    }

    /* renamed from: w */
    public ActiveSpeakerCalculator mo212163w() {
        return this.f153597y;
    }

    /* renamed from: x */
    public MeetingSdkListener mo212164x() {
        return this.f153596x;
    }

    /* renamed from: y */
    public ByteRtc mo212165y() {
        return this.f153591s;
    }

    /* renamed from: z */
    public boolean mo212166z() {
        return this.f153593u;
    }

    /* renamed from: a */
    public void mo212116a(boolean z) {
        this.f153577O = z;
    }

    /* renamed from: a */
    public void mo212114a(Boolean bool, Boolean bool2) {
        ai().mo213009a(bool, bool2);
    }

    /* renamed from: a */
    public void mo212115a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f153595w = str;
        }
    }

    /* renamed from: G */
    public ParticipantRole mo212089G() {
        Participant b = MeetingUtil.m238370b(this.f153548a);
        if (b != null) {
            return b.getParticipantRole();
        }
        return null;
    }

    /* renamed from: W */
    public AbstractC61417a mo212105W() {
        if (this.f153585m == null) {
            this.f153585m = new C61433l(this);
        }
        return this.f153585m;
    }

    /* renamed from: X */
    public AbstractC62894a mo212106X() {
        return mo212105W().mo212822a();
    }

    /* renamed from: Y */
    public AbstractC63121a mo212107Y() {
        return mo212105W().mo212823b();
    }

    /* renamed from: Z */
    public AbstractC61540a mo212108Z() {
        return mo212105W().mo212824c();
    }

    public AbstractC62004a aA() {
        return mo212105W().mo212816E();
    }

    public AbstractC61935a aB() {
        return mo212105W().mo212845x();
    }

    public AbstractC61567a aC() {
        return mo212105W().mo212817F();
    }

    public AbsCodeInterviewControl aD() {
        return mo212105W().mo212819H();
    }

    public AbsSingleInstanceControl aE() {
        return mo212105W().mo212821J();
    }

    public AbstractC62555a aa() {
        return mo212105W().mo212825d();
    }

    public AbstractC61751a ab() {
        return mo212105W().mo212828g();
    }

    public AbstractC62787a ac() {
        return mo212105W().mo212826e();
    }

    public AbstractC62904a ad() {
        return mo212105W().mo212827f();
    }

    public AbstractC61728a ae() {
        return mo212105W().mo212829h();
    }

    public AbstractC62782a af() {
        return mo212105W().mo212830i();
    }

    public AbsSketchControl ag() {
        return mo212105W().mo212831j();
    }

    public AbstractC63441a ah() {
        return mo212105W().mo212832k();
    }

    public AbstractC61444a ai() {
        return mo212105W().mo212833l();
    }

    public AbstractC62612a aj() {
        return mo212105W().mo212834m();
    }

    public AbstractC63022a ak() {
        return mo212105W().mo212835n();
    }

    public AbsBreakoutRoomControl al() {
        return mo212105W().mo212836o();
    }

    public AbstractC62011a am() {
        return mo212105W().mo212837p();
    }

    public AbstractC61994a an() {
        return mo212105W().mo212838q();
    }

    public AbsSpeakRequestControl ao() {
        return mo212105W().mo212844w();
    }

    public AudioVolumeIndicatorControl ap() {
        return mo212105W().mo212841t();
    }

    public AbsLobbyControl aq() {
        return mo212105W().mo212842u();
    }

    public AbsReactionControl ar() {
        return mo212105W().mo212839r();
    }

    public AbstractC61566a as() {
        return mo212105W().mo212840s();
    }

    public AbstractC61658a at() {
        return mo212105W().mo212843v();
    }

    public AbstractC61547a au() {
        return mo212105W().mo212847z();
    }

    public AbstractC61601a av() {
        return mo212105W().mo212812A();
    }

    public AbsGridContentControl aw() {
        return mo212105W().mo212846y();
    }

    public AbsGalleryControl ax() {
        return mo212105W().mo212813B();
    }

    public AbsShareContentControl ay() {
        return mo212105W().mo212814C();
    }

    public AbstractC62485a az() {
        return mo212105W().mo212815D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.meeting.k$5 */
    public static /* synthetic */ class C613105 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153606a;

        static {
            int[] iArr = new int[StatusNode.values().length];
            f153606a = iArr;
            try {
                iArr[StatusNode.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private void aG() {
        if (this.f153596x == null) {
            this.f153596x = new MeetingSdkListener(this);
            mo212165y().mo211997a(this.f153596x);
        }
    }

    private void aH() {
        if (this.f153597y == null) {
            ActiveSpeakerCalculator aVar = new ActiveSpeakerCalculator(this);
            this.f153597y = aVar;
            aVar.mo219601a(new ActiveSpeakerCalculator.ActiveSpeakerListener() {
                /* class com.ss.android.vc.meeting.framework.meeting.C61303k.C613083 */

                /* renamed from: a */
                long f153603a;

                @Override // com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator.ActiveSpeakerListener
                /* renamed from: a */
                public void mo212171a(String str) {
                    if (System.currentTimeMillis() - this.f153603a > 300) {
                        this.f153603a = System.currentTimeMillis();
                        C61303k.this.f153582j.mo212544g(str);
                    }
                }

                @Override // com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator.ActiveSpeakerListener
                /* renamed from: a */
                public void mo212172a(List<Participant> list, boolean z, String str, TriggerType triggerType) {
                    if (System.currentTimeMillis() - this.f153603a > 300) {
                        this.f153603a = System.currentTimeMillis();
                        C61303k.this.f153582j.mo212524a(list, z, str, triggerType);
                    }
                }

                @Override // com.ss.android.vc.meeting.utils.ActiveSpeakerCalculator.ActiveSpeakerListener
                /* renamed from: a */
                public void mo212173a(List<Participant> list, boolean z, String str, TriggerType triggerType, HashSet<String> hashSet) {
                    C61303k.this.f153582j.mo212525a(list, z, str, triggerType, hashSet);
                }
            });
        }
    }

    /* renamed from: S */
    public boolean mo212101S() {
        if (!mo212100R() || !mo212056e().getVideoChatSettings().isBoxSharing()) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public void mo212083A() {
        if (this.f153582j != null && mo212064m()) {
            this.f153582j.mo212559n(true);
            mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NE_RR).mo212331a(EventSource.EVENT_PUSH));
        }
    }

    /* renamed from: P */
    public boolean mo212098P() {
        if (this.f153550c == null || this.f153550c != VideoChat.Type.MEET || mo212056e() == null || mo212056e().getVideoChatSettings() == null) {
            return false;
        }
        return !mo212056e().getVideoChatSettings().isOwnerJoinedMeeting();
    }

    /* renamed from: Q */
    public boolean mo212099Q() {
        if (this.f153550c == null || this.f153550c != VideoChat.Type.MEET || mo212056e() == null || mo212056e().getVideoChatSettings() == null) {
            return false;
        }
        return mo212056e().getVideoChatSettings().isMeetingOpenInterpretation();
    }

    /* renamed from: R */
    public boolean mo212100R() {
        if (mo212056e() == null || mo212056e().getVideoChatSettings() == null || mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE) {
            return false;
        }
        return true;
    }

    public void aF() {
        if (!this.f153576N && C60788y.m236250b(ar.m236694a())) {
            C61237h.m238223a().mo210529b(false);
            C61237h.m238223a().mo210529b(true);
            mo212165y().mo212016c(this.f153582j.mo212505B());
            this.f153576N = true;
        }
    }

    private C61303k() {
        C1177w<SmStateTransformData> wVar = new C1177w<>();
        this.f153563A = wVar;
        this.f153583k = wVar;
        this.f153584l = new MeetingTimerHelper(new WeakReference(this));
        this.f153565C = new LinkedList();
        this.f153566D = new StreamManagerGlobal(this);
        this.f153567E = new LabsPerfChecker(this);
        this.f153568F = new SecuritySettingManager();
        this.f153569G = null;
        this.f153570H = null;
        this.f153571I = null;
        this.f153574L = 0;
        this.f153575M = new VCOnlineApmCollector();
        this.f153578P = new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613041 */

            public void run() {
                C61869a.m241680a().mo214246a(new C61869a.AbstractC61872b() {
                    /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613041.C613051 */

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public long mo212168a() {
                        return 15000;
                    }

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public void mo212169a(boolean z, long j) {
                        String str = C61303k.this.f153581i;
                        C60700b.m235851b(str, "[run]", "CCMFollowService.preload task time " + j);
                        C61775b.m241313a(ar.m236694a());
                    }
                });
            }
        };
        this.f153579Q = new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613062 */

            public void run() {
                C61869a.m241680a().mo214246a(new C61869a.AbstractC61872b() {
                    /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613062.C613071 */

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public long mo212168a() {
                        return 15000;
                    }

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public void mo212169a(boolean z, long j) {
                        String str = C61303k.this.f153581i;
                        C60700b.m235851b(str, "[run2]", "WebEditorManager.init task time " + j);
                        C61562e.m240298a().mo213349a(ar.m236694a());
                    }
                });
            }
        };
        this.f153580R = new AbstractC38769a() {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$k$KihJ_ol7W00x4POpb5hNldR1vhU */

            @Override // com.ss.android.lark.http.netstate.AbstractC38769a
            public final void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                C61303k.this.m238641a((C61303k) networkType);
            }
        };
        this.f153591s = new ByteRtc(this);
    }

    /* renamed from: a */
    public void mo212109a(VCNotice vCNotice) {
        this.f153569G = vCNotice;
    }

    /* renamed from: b */
    public void mo212149b(int i) {
        this.f153574L = i;
    }

    /* renamed from: c */
    public void mo212156c(VCNotice vCNotice) {
        this.f153571I = vCNotice;
    }

    /* renamed from: d */
    public void mo212159d(boolean z) {
        this.f153592t = z;
    }

    /* renamed from: e */
    public void mo212160e(boolean z) {
        this.f153588p = z;
    }

    /* renamed from: a */
    public void mo212110a(VcMsgInfo vcMsgInfo) {
        this.f153564B = vcMsgInfo;
    }

    /* renamed from: b */
    public void mo212150b(VCNotice vCNotice) {
        this.f153570H = vCNotice;
    }

    /* renamed from: c */
    public void mo212157c(boolean z) {
        this.f153587o = z;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61300h
    /* renamed from: a */
    public void mo212080a(VideoChat.Type type) {
        this.f153550c = type;
        mo212105W().mo212080a(type);
    }

    /* renamed from: b */
    public void mo212152b(AbstractC61298f fVar) {
        this.f153565C.remove(fVar);
    }

    /* renamed from: c */
    public synchronized boolean mo212158c(AbstractC61299g gVar) {
        boolean z;
        if (gVar != null) {
            z = this.f153590r.contains(gVar);
        } else {
            z = false;
        }
        return z;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61294b
    /* renamed from: a */
    public void mo212044a(VideoChat videoChat) {
        C61383d dVar;
        super.mo212044a(videoChat);
        if (videoChat != null && (dVar = this.f153594v) != null) {
            dVar.mo212496c().mo212428b(videoChat);
        }
    }

    /* renamed from: b */
    public synchronized void mo212153b(AbstractC61299g gVar) {
        this.f153590r.remove(gVar);
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61298f
    public void onInMeetingInfoUpdate(VideoChatInMeetingInfo videoChatInMeetingInfo) {
        mo212105W().onInMeetingInfoUpdate(videoChatInMeetingInfo);
        for (AbstractC61298f fVar : this.f153565C) {
            if (fVar != null) {
                fVar.onInMeetingInfoUpdate(videoChatInMeetingInfo);
            }
        }
    }

    /* renamed from: b */
    public void mo212151b(VideoChat videoChat) {
        if (videoChat == null) {
            C60700b.m235851b(this.f153581i, "[updateActionPerformer]", "videoChat is null");
        } else if (videoChat.getType() == VideoChat.Type.CALL) {
            mo212045a(new C61334a(this));
        } else {
            mo212045a(new C61335b(this));
            VideoChatManager.m249444a().mo220134l().mo219635a(videoChat);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238641a(NetworkUtils.NetworkType networkType) {
        if (networkType != NetworkUtils.NetworkType.NONE) {
            String str = this.f153581i;
            C60700b.m235851b(str, "[onNetworkStateChange]", "type = " + networkType.getValue() + ",meetingId = " + mo212055d());
            if (!TextUtils.isEmpty(mo212055d())) {
                VcBizSender.m249218a(mo212055d(), C60785x.m236240d(), (AbstractC63598b<Object>) null);
                return;
            }
            String str2 = this.f153581i;
            C60700b.m235864f(str2, "[onNetworkStateChange]", "meeting state=" + mo212059h() + ", videoChat = " + mo212056e().toString());
        }
    }

    /* renamed from: b */
    public void mo212155b(boolean z) {
        this.f153593u = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238642a(C60680d dVar) {
        VCApmSampleMemInfo eVar = dVar.f151796b;
        String str = this.f153581i;
        C60700b.m235851b(str, "[onSample]", "cpu = " + dVar.f151795a.f151774a + ", mem = " + eVar.mo208242a());
        if (dVar.f151795a.f151774a > 0.0d) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!(mo212091I() == null || mo212091I().mo212494b() == null || mo212091I().mo212494b().mo212601f() == null)) {
                    jSONObject.put("participantNum", mo212091I().mo212494b().mo212601f().size());
                    jSONObject.put("screenshare", aj().mo216408a());
                    jSONObject.put("displayMode", mo212067p().name());
                }
            } catch (Exception unused) {
            }
            String str2 = this.f153581i;
            C60700b.m235851b(str2, "[onTransform2]", "[num] = " + mo212091I().mo212494b().mo212601f().size() + ", displayMode = " + mo212067p().name());
        }
    }

    /* renamed from: b */
    public void mo212154b(C61344j jVar) {
        if (jVar.f153703a == 100) {
            C61345k b = jVar.mo212334b();
            if (jVar.f153704b.getType() == VideoChat.Type.CALL && b != null) {
                if (b.mo212338a() != null) {
                    C60998v a = b.mo212338a();
                    VideoChatUser videoChatUser = new VideoChatUser();
                    videoChatUser.setId(a.f152837b);
                    videoChatUser.setName(a.f152838c);
                    videoChatUser.setAvatarKey(a.f152839d);
                    if (a.f152840e != null) {
                        videoChatUser.setType(a.f152840e);
                    }
                    this.f153589q.setSingleCalleeUser(videoChatUser);
                    this.f153586n.mo212194a(a.f152842g);
                    this.f153586n.mo212195a(a.f152841f);
                    this.f153586n.mo212198b(a.f152856u);
                    this.f153586n.mo212199b(a.f152852q);
                    this.f153586n.mo212201c(a.f152854s);
                    this.f153586n.mo212202d(a.f152857v);
                    mo212115a(a.f152854s);
                }
                this.f153589q.setCurrentUserRole(VideoChatUserRole.SINGLE_CALLER);
            } else if (jVar.f153704b.getType() == VideoChat.Type.MEET && b != null && b.mo212338a() != null) {
                mo212115a(b.mo212338a().f152854s);
            }
        }
    }

    public C61303k(VideoChat videoChat) {
        super(videoChat);
        C1177w<SmStateTransformData> wVar = new C1177w<>();
        this.f153563A = wVar;
        this.f153583k = wVar;
        this.f153584l = new MeetingTimerHelper(new WeakReference(this));
        this.f153565C = new LinkedList();
        this.f153566D = new StreamManagerGlobal(this);
        this.f153567E = new LabsPerfChecker(this);
        this.f153568F = new SecuritySettingManager();
        this.f153569G = null;
        this.f153570H = null;
        this.f153571I = null;
        this.f153574L = 0;
        this.f153575M = new VCOnlineApmCollector();
        this.f153578P = new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613041 */

            public void run() {
                C61869a.m241680a().mo214246a(new C61869a.AbstractC61872b() {
                    /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613041.C613051 */

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public long mo212168a() {
                        return 15000;
                    }

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public void mo212169a(boolean z, long j) {
                        String str = C61303k.this.f153581i;
                        C60700b.m235851b(str, "[run]", "CCMFollowService.preload task time " + j);
                        C61775b.m241313a(ar.m236694a());
                    }
                });
            }
        };
        this.f153579Q = new Runnable() {
            /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613062 */

            public void run() {
                C61869a.m241680a().mo214246a(new C61869a.AbstractC61872b() {
                    /* class com.ss.android.vc.meeting.framework.meeting.C61303k.RunnableC613062.C613071 */

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public long mo212168a() {
                        return 15000;
                    }

                    @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
                    /* renamed from: a */
                    public void mo212169a(boolean z, long j) {
                        String str = C61303k.this.f153581i;
                        C60700b.m235851b(str, "[run2]", "WebEditorManager.init task time " + j);
                        C61562e.m240298a().mo213349a(ar.m236694a());
                    }
                });
            }
        };
        $$Lambda$k$KihJ_ol7W00x4POpb5hNldR1vhU r0 = new AbstractC38769a() {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$k$KihJ_ol7W00x4POpb5hNldR1vhU */

            @Override // com.ss.android.lark.http.netstate.AbstractC38769a
            public final void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                C61303k.this.m238641a((C61303k) networkType);
            }
        };
        this.f153580R = r0;
        C63784a.m250428a("VideoChat_New_Meeting");
        if (!(videoChat.getExtraInfo() == null || videoChat.getExtraInfo().isVoiceOnly == null)) {
            this.f153593u = videoChat.getExtraInfo().isVoiceOnly.booleanValue();
            String str = this.f153581i;
            C60700b.m235851b(str, "[constructor]", "isVoiceOnly = " + this.f153593u);
        }
        mo212151b(videoChat);
        this.f153591s = new ByteRtc(this);
        this.f153576N = C60788y.m236250b(ar.m236694a());
        aH();
        aG();
        C38770b.m153078a().mo142127a(r0);
        VideoChatManager.m249444a().mo220135m();
        VideoChatAdminSettings.m239405a((AbstractC63598b<AdminSettings>) null);
        C63784a.m250429b("VideoChat_New_Meeting");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238643a(StatusNode statusNode) {
        ByteRTCMeetingActivity a;
        String str = this.f153581i;
        C60700b.m235851b(str, "[meetingStateChanged]", "statusNode = " + statusNode);
        if (C613105.f153606a[statusNode.ordinal()] == 1) {
            this.f153568F.mo214270d();
            if (aE().mo208293c()) {
                String str2 = this.f153581i;
                C60700b.m235851b(str2, "[meetingStateChanged]", "Idle, display mode = " + mo212067p());
                if (mo212067p() == DisplayMode.ACTIVITY) {
                    return;
                }
                if ((mo212068q() == null || mo212068q().mo212062k()) && (a = aE().mo208290a()) != null && !a.isFinishing() && !aE().mo208292b()) {
                    a.finishAndRemoveTask();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo212112a(AbstractC61298f fVar) {
        if (fVar != null && !this.f153565C.contains(fVar)) {
            this.f153565C.add(fVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo212113a(AbstractC61299g gVar) {
        if (!this.f153590r.contains(gVar)) {
            this.f153590r.add(gVar);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61288e
    public void meetingStateChanged(VideoChat videoChat, StatusNode statusNode) {
        C26171w.m94675a(new Runnable(statusNode) {
            /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$k$rouh3iNFuYT_4ssDSHMXp3nyP5Y */
            public final /* synthetic */ StatusNode f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61303k.this.m238643a((C61303k) this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo212111a(VideoChat videoChat, C62149b bVar) {
        VideoChat a = MeetingUtil.m238363a(videoChat, bVar);
        aq().mo214936a(bVar);
        if (a == null) {
            C60700b.m235851b(this.f153581i, "[gotoWaitingState]", "videoChat is null");
        } else {
            mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_NW).mo212330a(a));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61294b
    /* renamed from: a */
    public void mo212048a(DisplayMode displayMode, DisplayMode displayMode2) {
        if (C63801c.m250498a()) {
            mo212105W().onDisplayModeChange(displayMode, displayMode2);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j
    public void onTransform(int i, int i2, int i3) {
        String str = this.f153581i;
        C60700b.m235851b(str, "[onTransform]", "src = " + i + ", dst = " + i2 + ", event = " + i3);
        this.f153563A.mo5929b(new SmStateTransformData(i, i2, i3));
        mo212105W().onTransform(i, i2, i3);
        if (this.f153550c == VideoChat.Type.CALL) {
            if (i2 == 3) {
                if (this.f153572J != null) {
                    VcScreenMonitor.m246178a().mo217320b(this.f153572J);
                }
                this.f153572J = new VcScreenMonitor.AbstractC62891b() {
                    /* class com.ss.android.vc.meeting.framework.meeting.C61303k.C613094 */

                    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
                    /* renamed from: a */
                    public void mo212174a() {
                    }

                    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
                    /* renamed from: c */
                    public void mo212176c() {
                    }

                    @Override // com.ss.android.vc.meeting.module.receiver.VcScreenMonitor.AbstractC62891b
                    /* renamed from: b */
                    public void mo212175b() {
                        if (C61303k.this.f153582j != null) {
                            C61303k.this.f153582j.mo212536d(true);
                        }
                    }
                };
                VcScreenMonitor.m246178a().mo217319a(this.f153572J);
            }
            if (i == 3) {
                VcScreenMonitor.m246178a().mo217320b(this.f153572J);
            }
        }
        if (i2 == 5) {
            VCOnlineApmCollector jVar = this.f153575M;
            if (jVar != null) {
                jVar.mo208251b();
                this.f153575M = null;
            }
            C60724i.m235924a().mo208320a(mo212055d());
            this.f153584l.mo212461c();
            mo212102T().mo212226d();
            C63732ac.m249971b(this);
            LabsUtils.m242899a(this);
            mo212103U().mo215421b();
            VcScreenMonitor.m246178a().mo217320b(this.f153573K);
            this.f153598z.removeCallbacks(this.f153578P);
            if (mo212056e() != null && mo212056e().getMeetingSource() == VideoChat.MeetingSource.VC_FROM_CALENDAR) {
                this.f153598z.removeCallbacks(this.f153579Q);
            }
            C60784w.m236234a(this, "Meeting-Object", 10000);
            if (i == 4) {
                C60675a.m235774e().mo208238d();
                C63688c.m249669a();
                C63694f.m249698a(mo212056e());
                C63690d.m249679b(mo212055d(), MeetingUtil.m238372c(mo212056e()));
                VideoChatManager.m249444a().mo220127e(false);
            }
        } else if (i2 == 4) {
            C63690d.m249678a(mo212055d(), MeetingUtil.m238372c(mo212056e()));
            if (mo212056e() != null) {
                this.f153584l.mo212459a(mo212056e().getStartTime());
            }
            RegisterClientInfoExecuter.m249571c();
            C63732ac.m249976c(this);
            mo212103U().mo215419a();
            this.f153573K = new ScreenMonitorForCamera(this);
            VcScreenMonitor.m246178a().mo217319a(this.f153573K);
            this.f153598z.postDelayed(this.f153578P, 7000);
            if (mo212056e() != null && mo212056e().getMeetingSource() == VideoChat.MeetingSource.VC_FROM_CALENDAR) {
                this.f153598z.postDelayed(this.f153579Q, 9000);
            }
            C60675a.m235774e().mo208237c();
            C63694f.m249695a();
            VCOnlineApmCollector jVar2 = this.f153575M;
            if (jVar2 != null) {
                jVar2.mo208250a(new VCOnlineApmCollector.OnOnlineApmCollectorListener() {
                    /* class com.ss.android.vc.meeting.framework.meeting.$$Lambda$k$Ic0iGxM7LyUBwXKSfwz5EUAOkXs */

                    @Override // com.ss.android.vc.apm.VCOnlineApmCollector.OnOnlineApmCollectorListener
                    public final void onSample(C60680d dVar) {
                        C61303k.this.m238642a((C61303k) dVar);
                    }
                });
            }
        }
        for (AbstractC61299g gVar : this.f153590r) {
            gVar.onStateTransform(i, i2, i3);
        }
    }
}
