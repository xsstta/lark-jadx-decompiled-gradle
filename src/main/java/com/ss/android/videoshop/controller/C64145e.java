package com.ss.android.videoshop.controller;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.videoshop.api.AbstractC64093b;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.api.AbstractC64097f;
import com.ss.android.videoshop.api.AbstractC64098g;
import com.ss.android.videoshop.api.AbstractC64099h;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.api.C64107n;
import com.ss.android.videoshop.api.stub.C64112d;
import com.ss.android.videoshop.api.stub.C64113e;
import com.ss.android.videoshop.api.stub.C64114f;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.p3195b.C64115a;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3201g.C64168a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.android.videoshop.p3203i.C64172a;
import com.ss.android.videoshop.p3203i.C64173b;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.DataSource;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.SeekCompletionListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineInfos;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.model.VideoRef;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.videoshop.controller.e */
public class C64145e implements AbstractC64142b {

    /* renamed from: A */
    private List<VideoInfo> f161987A;

    /* renamed from: B */
    private int f161988B;

    /* renamed from: C */
    private boolean f161989C;

    /* renamed from: D */
    private boolean f161990D;

    /* renamed from: E */
    private Error f161991E;

    /* renamed from: F */
    private boolean f161992F;

    /* renamed from: G */
    private int f161993G;

    /* renamed from: H */
    private boolean f161994H = true;

    /* renamed from: I */
    private boolean f161995I = true;

    /* renamed from: J */
    private boolean f161996J;

    /* renamed from: K */
    private boolean f161997K;

    /* renamed from: L */
    private boolean f161998L;

    /* renamed from: M */
    private boolean f161999M;

    /* renamed from: N */
    private int f162000N;

    /* renamed from: O */
    private int f162001O;

    /* renamed from: P */
    private boolean f162002P;

    /* renamed from: Q */
    private String f162003Q = "";

    /* renamed from: R */
    private C64150a f162004R = new C64150a();

    /* renamed from: S */
    private PlaybackParams f162005S;

    /* renamed from: T */
    private VideoModel f162006T;

    /* renamed from: U */
    private Map<String, VideoEngineInfos> f162007U = new HashMap();

    /* renamed from: V */
    private boolean f162008V;

    /* renamed from: W */
    private Resolution f162009W;

    /* renamed from: X */
    private C64172a f162010X;

    /* renamed from: Y */
    private int f162011Y;

    /* renamed from: Z */
    private int f162012Z;

    /* renamed from: a */
    public TTVideoEngine f162013a;
    private Runnable aa = new Runnable() {
        /* class com.ss.android.videoshop.controller.C64145e.RunnableC641461 */

        public void run() {
            C64159a.m252083b("VideoController", "playRunnable videoEngine:" + C64145e.this.f162013a + ", vid:" + C64145e.this.f162014b.mo221934b() + ", hashCode:" + C64145e.this.hashCode() + ", thread:" + Thread.currentThread() + " title:" + C64145e.this.f162014b.mo221952l());
            C64145e.this.mo222190v();
        }
    };
    private WeakHandler.IHandler ab = new WeakHandler.IHandler() {
        /* class com.ss.android.videoshop.controller.C64145e.C641472 */

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
            int i;
            boolean z = true;
            if (C641494.f162042a[EnumC64141a.getMsg(message.what).ordinal()] == 1) {
                C64169a x = C64145e.this.mo222192x();
                if (x == null || x.mo222313h() <= 0) {
                    i = ParticipantRepo.f117150c;
                } else {
                    i = x.mo222313h();
                }
                if (C64145e.this.f162013a != null) {
                    if (message.obj == null || !((Boolean) message.obj).booleanValue()) {
                        z = false;
                    }
                    int currentPlaybackTime = C64145e.this.f162013a.getCurrentPlaybackTime();
                    int duration = C64145e.this.f162013a.getDuration();
                    if (currentPlaybackTime >= duration) {
                        currentPlaybackTime = duration;
                    }
                    if (duration > 0 && ((!z || currentPlaybackTime < i) && C64145e.this.f162015c != null)) {
                        C64145e.this.f162015c.mo163963a(C64145e.this.f162017e, C64145e.this.f162014b, currentPlaybackTime, duration);
                    }
                    if (!C64145e.this.f162016d && currentPlaybackTime > 0 && C64145e.this.f162014b != null && !TextUtils.isEmpty(C64145e.this.f162014b.mo221934b())) {
                        C64168a.m252175a(C64145e.this.f162014b.mo221934b(), (long) currentPlaybackTime, C64145e.this.f162018f);
                    }
                }
                if (!C64145e.this.mo222174j() && C64145e.this.mo222170f()) {
                    C64145e.this.f162019g.sendMessageDelayed(C64145e.this.f162019g.obtainMessage(EnumC64141a.UPDATE_PROGRESS.getWhat()), (long) i);
                }
            }
        }
    };
    private SeekCompletionListener ac = new SeekCompletionListener() {
        /* class com.ss.android.videoshop.controller.C64145e.C641483 */

        @Override // com.ss.ttvideoengine.SeekCompletionListener
        public void onCompletion(boolean z) {
            C64145e.this.mo222187g(z);
        }
    };

    /* renamed from: b */
    public C64116b f162014b;

    /* renamed from: c */
    public AbstractC64099h f162015c;

    /* renamed from: d */
    public boolean f162016d;

    /* renamed from: e */
    public C64114f f162017e;

    /* renamed from: f */
    public boolean f162018f;

    /* renamed from: g */
    public WeakHandler f162019g = new WeakHandler(this.ab);

    /* renamed from: h */
    private Surface f162020h;

    /* renamed from: i */
    private int f162021i;

    /* renamed from: j */
    private TTVNetClient f162022j;

    /* renamed from: k */
    private boolean f162023k;

    /* renamed from: l */
    private long f162024l;

    /* renamed from: m */
    private int f162025m;

    /* renamed from: n */
    private boolean f162026n;

    /* renamed from: o */
    private boolean f162027o;

    /* renamed from: p */
    private boolean f162028p;

    /* renamed from: q */
    private AbstractC64097f f162029q;

    /* renamed from: r */
    private AbstractC64095d f162030r;

    /* renamed from: s */
    private Resolution f162031s;

    /* renamed from: t */
    private Resolution f162032t;

    /* renamed from: u */
    private int f162033u;

    /* renamed from: v */
    private int f162034v;

    /* renamed from: w */
    private VideoContext f162035w;

    /* renamed from: x */
    private boolean f162036x = true;

    /* renamed from: y */
    private long f162037y;

    /* renamed from: z */
    private SparseArray<VideoInfo> f162038z;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.videoshop.controller.e$a */
    public static class C64150a implements DataSource {

        /* renamed from: a */
        public AbstractC64093b f162043a;

        /* renamed from: b */
        public C64116b f162044b;

        private C64150a() {
        }

        @Override // com.ss.ttvideoengine.DataSource
        public String apiForFetcher(Map<String, String> map, int i) {
            AbstractC64093b bVar = this.f162043a;
            if (bVar != null) {
                return bVar.mo221868a(this.f162044b, map, i);
            }
            return null;
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: d */
    public C64116b mo222165d() {
        return this.f162014b;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: l */
    public boolean mo222176l() {
        return this.f161996J;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: r */
    public PlaybackParams mo222182r() {
        return this.f162005S;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: s */
    public TTVideoEngine mo222183s() {
        return this.f162013a;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: t */
    public AbstractC64108o mo222184t() {
        return this.f162017e;
    }

    /* renamed from: z */
    public Resolution mo222194z() {
        return this.f162031s;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222146a(int i, Object obj) {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine == null) {
            return;
        }
        if (obj instanceof Integer) {
            tTVideoEngine.setIntOption(i, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            tTVideoEngine.setLongOption(i, ((Long) obj).longValue());
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222158a(String str, boolean z, boolean z2, String str2) {
        boolean z3;
        if (this.f162013a != null) {
            boolean z4 = this.f162002P;
            String w = mo222191w();
            if (z4 == z && (TextUtils.isEmpty(str) || str.equals(w))) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f162015c != null && ((z2 || !TextUtils.isEmpty(str)) && z3)) {
                this.f162015c.mo221885a(this.f162017e, this.f162014b, str, z, z2);
            }
            this.f162002P = z;
            if (z) {
                this.f162013a.setIntOption(29, 1);
            } else if (!TextUtils.isEmpty(str)) {
                List<String> G = m251921G();
                if (G == null || G.size() == 0 || (G.size() == 1 && TextUtils.isEmpty(G.get(0)))) {
                    for (Map.Entry<Resolution, String> entry : VideoContext.f161934n.entrySet()) {
                        if (entry != null && str.equals(entry.getValue())) {
                            Resolution key = entry.getKey();
                            if (key != null) {
                                this.f162003Q = str;
                                this.f162013a.configResolution(key);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                this.f162003Q = str;
                HashMap hashMap = new HashMap();
                hashMap.put(32, str);
                this.f162013a.configParams(Resolution.Standard, hashMap);
            }
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222154a(PlaybackParams playbackParams) {
        this.f162005S = playbackParams;
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null && playbackParams != null) {
            tTVideoEngine.setPlaybackParams(playbackParams);
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222156a(TTVideoEngine tTVideoEngine) {
        TTVideoEngine tTVideoEngine2 = this.f162013a;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.setNetworkClient(null);
            this.f162013a.setListener(null);
            this.f162013a.setVideoInfoListener(null);
        }
        this.f162013a = tTVideoEngine;
        if (tTVideoEngine != null) {
            TTVNetClient tTVNetClient = this.f162022j;
            if (tTVNetClient != null) {
                tTVideoEngine.setNetworkClient(tTVNetClient);
            }
            this.f162013a.setListener(this);
            this.f162013a.setVideoInfoListener(this);
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222147a(long j) {
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221892b(this.f162017e, this.f162014b, j);
        }
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            this.f161992F = j >= ((long) tTVideoEngine.getDuration());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("seekTo:");
        String str = "end";
        sb.append(this.f161992F ? str : Long.valueOf(j));
        C64159a.m252079a(sb.toString());
        C64116b bVar = this.f162014b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" seekTo: ");
        sb2.append(this.f161992F ? str : Long.valueOf(j));
        C64159a.m252077a(bVar, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("seek:");
        if (!this.f161992F) {
            str = "" + j;
        }
        sb3.append(str);
        C64159a.m252083b("VideoController", sb3.toString());
        if (this.f162013a != null) {
            this.f161994H = false;
            m251925K();
            this.f162013a.seekTo((int) j, this.ac);
            AbstractC64099h hVar2 = this.f162015c;
            if (hVar2 != null) {
                hVar2.mo163964a(this.f162017e, this.f162014b, j);
            }
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222148a(Surface surface) {
        if (this.f162020h != surface) {
            this.f162020h = surface;
            TTVideoEngine tTVideoEngine = this.f162013a;
            if (tTVideoEngine != null) {
                tTVideoEngine.setSurface(surface);
            }
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222159a(boolean z) {
        this.f162026n = z;
        if (this.f162013a != null) {
            C64159a.m252083b("VideoController", "setMute:" + z);
            this.f162013a.setIsMute(z);
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222157a(TTVNetClient tTVNetClient) {
        this.f162022j = tTVNetClient;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222153a(C64116b bVar) {
        this.f162014b = bVar;
        this.f162004R.f162044b = bVar;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222145a(int i) {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            tTVideoEngine.setStartTime(i);
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222155a(Resolution resolution, boolean z) {
        m251931a(resolution, z, true);
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222152a(AbstractC64099h hVar) {
        this.f162015c = hVar;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222150a(AbstractC64095d dVar) {
        if (dVar != null) {
            this.f162030r = dVar;
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222149a(AbstractC64093b bVar) {
        if (bVar != null) {
            this.f162004R.f162043a = bVar;
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: k */
    public boolean mo222175k() {
        if (this.f162013a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private void m251924J() {
        WeakHandler weakHandler = this.f162019g;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(EnumC64141a.UPDATE_PROGRESS.getWhat());
        }
    }

    /* renamed from: K */
    private void m251925K() {
        WeakHandler weakHandler = this.f162019g;
        if (weakHandler != null) {
            weakHandler.removeMessages(EnumC64141a.UPDATE_PROGRESS.getWhat());
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: e */
    public boolean mo222168e() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine == null || !tTVideoEngine.isShouldPlay()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: f */
    public boolean mo222170f() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: g */
    public boolean mo222171g() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: h */
    public boolean mo222172h() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            return tTVideoEngine.isStarted();
        }
        return false;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: i */
    public boolean mo222173i() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine == null || tTVideoEngine.getPlaybackState() != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: j */
    public boolean mo222174j() {
        if (this.f162013a == null || !this.f162016d) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: m */
    public int mo222177m() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getDuration();
        }
        return 0;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: n */
    public int mo222178n() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getCurrentPlaybackTime();
        }
        return 0;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: o */
    public int mo222179o() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            return tTVideoEngine.getWatchedDuration();
        }
        return 0;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: p */
    public boolean mo222180p() {
        VideoContext videoContext = this.f162035w;
        if (videoContext == null || !videoContext.mo222049f()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: q */
    public boolean mo222181q() {
        VideoContext videoContext = this.f162035w;
        if (videoContext == null || !videoContext.mo222051g()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public C64169a mo222192x() {
        C64116b bVar = this.f162014b;
        if (bVar != null) {
            return bVar.mo221960t();
        }
        return null;
    }

    /* renamed from: y */
    public Context mo222193y() {
        VideoContext videoContext = this.f162035w;
        if (videoContext != null) {
            return videoContext.mo222006a();
        }
        return null;
    }

    /* renamed from: com.ss.android.videoshop.controller.e$4 */
    static /* synthetic */ class C641494 {

        /* renamed from: a */
        static final /* synthetic */ int[] f162042a;

        static {
            int[] iArr = new int[EnumC64141a.values().length];
            f162042a = iArr;
            try {
                iArr[EnumC64141a.UPDATE_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: B */
    private void m251916B() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            tTVideoEngine.setIntOption(341, this.f162011Y);
            this.f162013a.setIntOption(342, this.f162012Z);
        }
    }

    /* renamed from: C */
    private void m251917C() {
        this.f162017e = new C64114f(this);
        this.f162030r = new C64112d();
        this.f162029q = new C64113e();
        this.f162010X = new C64172a();
    }

    /* renamed from: E */
    private void m251919E() {
        this.f162033u = 0;
        this.f162034v = 0;
        this.f162016d = false;
        this.f161990D = false;
        this.f162008V = false;
        this.f162009W = null;
        this.f162031s = null;
        this.f161988B = 0;
        this.f162007U.clear();
        m251922H();
    }

    /* renamed from: A */
    public Resolution mo222186A() {
        Resolution currentResolution;
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (!(tTVideoEngine == null || (currentResolution = tTVideoEngine.getCurrentResolution()) == null || this.f162009W == currentResolution)) {
            this.f162009W = currentResolution;
        }
        return this.f162009W;
    }

    public C64145e() {
        m251917C();
    }

    /* renamed from: D */
    private void m251918D() {
        Error error;
        if (this.f161990D) {
            if (!(this.f162013a == null || (error = this.f161991E) == null || error.internalCode == 10408 || this.f161991E.internalCode == 50401)) {
                if (this.f162028p) {
                    this.f162013a.releaseAsync();
                } else {
                    this.f162013a.release();
                }
                m251935b(this.f162013a);
                EngineInspector.ENUM.onReleaseEngine(this.f162013a, mo222193y());
                this.f162013a = null;
            }
            this.f161991E = null;
        }
    }

    /* renamed from: M */
    private void m251927M() {
        C64159a.m252079a("onBufferEnd");
        C64116b bVar = this.f162014b;
        C64159a.m252077a(bVar, getClass().getSimpleName() + " onBufferEnd");
        C64159a.m252083b("VideoController", "onBufferEnd");
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163978j(this.f162017e, this.f162014b);
        }
    }

    /* renamed from: v */
    public void mo222190v() {
        m251920F();
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null && !this.f161999M) {
            if (this.f161990D) {
                hVar.mo221902n(this.f162017e, this.f162014b);
            } else if (mo222174j()) {
                this.f162015c.mo163975g(this.f162017e, this.f162014b);
            }
        }
        this.f162013a.setSurface(this.f162020h);
        this.f162024l = -1;
        this.f161990D = false;
        m251923I();
    }

    /* renamed from: w */
    public String mo222191w() {
        TTVideoEngine tTVideoEngine;
        TTVideoEngine tTVideoEngine2 = this.f162013a;
        if (tTVideoEngine2 != null && !TextUtils.isEmpty(tTVideoEngine2.getCurrentQualityDesc())) {
            return this.f162013a.getCurrentQualityDesc();
        }
        if (!(!TextUtils.isEmpty(this.f162003Q) || (tTVideoEngine = this.f162013a) == null || tTVideoEngine.getCurrentResolution() == null)) {
            this.f162003Q = VideoContext.f161934n.get(this.f162013a.getCurrentResolution());
        }
        return this.f162003Q;
    }

    /* renamed from: G */
    private List<String> m251921G() {
        String[] supportedQualityInfos;
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (!(tTVideoEngine == null || (supportedQualityInfos = tTVideoEngine.supportedQualityInfos()) == null || supportedQualityInfos.length <= 0 || (supportedQualityInfos.length == 1 && TextUtils.isEmpty(supportedQualityInfos[0])))) {
            return Arrays.asList(this.f162013a.supportedQualityInfos());
        }
        ArrayList arrayList = new ArrayList();
        VideoModel videoModel = this.f162006T;
        if (!(videoModel == null || videoModel.getVideoInfoList() == null)) {
            for (VideoInfo videoInfo : this.f162006T.getVideoInfoList()) {
                if (videoInfo != null) {
                    String valueStr = videoInfo.getValueStr(32);
                    if (!TextUtils.isEmpty(valueStr)) {
                        arrayList.add(valueStr);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: H */
    private void m251922H() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            tTVideoEngine.setSurface(null);
            if (this.f162028p) {
                this.f162013a.releaseAsync();
            } else {
                this.f162013a.release();
            }
            m251935b(this.f162013a);
            EngineInspector.ENUM.onReleaseEngine(this.f162013a, mo222193y());
        }
        TTVideoEngine a = this.f162030r.mo163943a(C64107n.m251616a(), this.f162021i, this.f162014b, this.f162035w);
        this.f162013a = a;
        Objects.requireNonNull(a, "video engine can't be null");
        TTVNetClient tTVNetClient = this.f162022j;
        if (tTVNetClient != null) {
            a.setNetworkClient(tTVNetClient);
        }
        this.f162013a.setListener(this);
        this.f162013a.setVideoInfoListener(this);
        this.f162013a.setStreamInfoListener(this);
        this.f162013a.setVideoEngineInfoListener(this);
    }

    /* renamed from: L */
    private void m251926L() {
        C64159a.m252079a("onBufferStart");
        C64159a.m252077a(this.f162014b, getClass().getSimpleName() + " onBufferStart");
        C64159a.m252083b("VideoController", "onBufferStart");
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163977i(this.f162017e, this.f162014b);
        }
        if (this.f161994H) {
            this.f161993G++;
        } else {
            this.f161994H = true;
        }
        AbstractC64099h hVar2 = this.f162015c;
        if (hVar2 != null) {
            hVar2.mo221896d(this.f162017e, this.f162014b, this.f161993G);
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: u */
    public VideoInfo mo222185u() {
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (!(tTVideoEngine == null || TextUtils.isEmpty(tTVideoEngine.getCurrentQualityDesc()) || this.f161987A == null)) {
            String currentQualityDesc = this.f162013a.getCurrentQualityDesc();
            for (VideoInfo videoInfo : this.f161987A) {
                if (currentQualityDesc.equals(videoInfo.getValueStr(32))) {
                    return videoInfo;
                }
            }
        }
        Resolution z = mo222194z();
        if (z == Resolution.Auto) {
            z = mo222186A();
        }
        if (this.f162038z == null || z == null) {
            return null;
        }
        for (int i = 0; i < this.f162038z.size(); i++) {
            VideoInfo valueAt = this.f162038z.valueAt(i);
            if (valueAt != null && valueAt.getResolution() == z) {
                return valueAt;
            }
        }
        return null;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: b */
    public void mo222160b() {
        String str;
        C64159a.m252079a("pause_video");
        C64116b bVar = this.f162014b;
        C64159a.m252077a(bVar, getClass().getSimpleName() + " pause_video");
        StringBuilder sb = new StringBuilder();
        sb.append("pause_video vid:");
        C64116b bVar2 = this.f162014b;
        String str2 = "entity null";
        if (bVar2 != null) {
            str = bVar2.mo221934b();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(" hashCode:");
        sb.append(hashCode());
        sb.append(" title:");
        C64116b bVar3 = this.f162014b;
        if (bVar3 != null) {
            str2 = bVar3.mo221952l();
        }
        sb.append(str2);
        C64159a.m252083b("VideoController", sb.toString());
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            tTVideoEngine.pause();
        }
        m251925K();
        this.f162010X.mo222326b();
    }

    /* renamed from: F */
    private void m251920F() {
        C64159a.m252083b("VideoController", "videoEngine setPlayAPIVersion. videoEngine:" + this.f162013a + ", vid:" + this.f162014b.mo221934b() + ", hashCode:" + hashCode() + ", thread:" + Thread.currentThread());
        m251916B();
        if (this.f162014b.mo221953m() == 2) {
            this.f162013a.setPlayAPIVersion(2, this.f162014b.mo221954n());
        } else if (!TextUtils.isEmpty(this.f162014b.mo221955o())) {
            this.f162013a.setPlayAPIVersion(1, this.f162014b.mo221955o());
        } else {
            this.f162013a.setPlayAPIVersion(0, "");
        }
        if (TextUtils.isEmpty(this.f162014b.mo221958r())) {
            this.f162013a.setTag("");
        } else {
            this.f162013a.setTag(this.f162014b.mo221958r());
        }
        if (TextUtils.isEmpty(this.f162014b.mo221959s())) {
            this.f162013a.setSubTag("");
        } else {
            this.f162013a.setSubTag(this.f162014b.mo221959s());
        }
        if (this.f162014b.mo221924A() != null) {
            this.f162013a.setDataSource(this.f162014b.mo221924A());
        } else {
            this.f162013a.setDataSource(this.f162004R);
        }
        if (!TextUtils.isEmpty(this.f162014b.mo221956p())) {
            this.f162013a.setEncodedKey(this.f162014b.mo221956p());
        } else {
            this.f162013a.setEncodedKey("");
        }
        if (!TextUtils.isEmpty(this.f162014b.mo221957q())) {
            this.f162013a.setDecryptionKey(this.f162014b.mo221957q());
        } else {
            this.f162013a.setDecryptionKey("");
        }
        PlaybackParams playbackParams = this.f162005S;
        if (playbackParams != null) {
            this.f162013a.setPlaybackParams(playbackParams);
        }
    }

    /* renamed from: I */
    private void m251923I() {
        AbstractC64097f fVar;
        if (this.f162013a != null) {
            try {
                if (!this.f161989C || ((this.f162038z == null && this.f161987A == null) || (fVar = this.f162029q) == null || !fVar.mo221875a(VideoContext.m251727i()))) {
                    if (mo222174j()) {
                        this.f162001O = 3;
                    } else if (mo222171g()) {
                        this.f162001O = 2;
                    } else if (this.f161999M) {
                        this.f162001O = 5;
                    } else if (this.f161998L) {
                        this.f162001O = 4;
                    } else {
                        this.f162001O = 1;
                    }
                    C64159a.m252083b("VideoController", "doPlay mute:" + this.f162026n);
                    C64116b bVar = this.f162014b;
                    C64159a.m252077a(bVar, getClass().getSimpleName() + " doPlay mute: " + this.f162026n + " volume: " + this.f162013a.getVolume() + " max volume: " + this.f162013a.getMaxVolume());
                    this.f162013a.setIsMute(this.f162026n);
                    mo222161b(this.f162025m);
                    this.f162013a.setLooping(this.f162027o);
                    this.f162016d = false;
                    C64159a.m252083b("VideoController", "play volume:" + this.f162013a.getVolume() + " max volume:" + this.f162013a.getMaxVolume());
                    if (this.f161997K) {
                        this.f162013a.setIntOption(100, 1);
                    }
                    this.f162013a.play();
                    AbstractC64099h hVar = this.f162015c;
                    if (hVar != null && !this.f161999M) {
                        hVar.mo221880a((AbstractC64108o) this.f162017e, this.f162014b, this.f162001O);
                        return;
                    }
                    return;
                }
                C64159a.m252083b("VideoController", "intercept play");
            } catch (Exception e) {
                Logger.throwException(e);
            }
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: c */
    public void mo222163c() {
        C64116b bVar;
        if (!mo222175k()) {
            this.f162010X.mo222326b();
            C64116b bVar2 = this.f162014b;
            C64159a.m252077a(bVar2, getClass().getSimpleName() + " releaseEngineEnabled: " + this.f161995I + ", asyncRelease: " + this.f162028p + ", vid: " + this.f162014b);
            C64159a.m252083b("VideoController", "releaseEngineEnabled:" + this.f161995I + ", asyncRelease:" + this.f162028p + ", vid:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
            TTVideoEngine tTVideoEngine = this.f162013a;
            if (tTVideoEngine != null) {
                if (this.f162027o) {
                    this.f162034v = tTVideoEngine.getWatchedDuration() - this.f162033u;
                } else {
                    this.f162034v = tTVideoEngine.getWatchedDuration();
                }
                this.f162033u = this.f162013a.getWatchedDuration();
            }
            AbstractC64099h hVar = this.f162015c;
            if (hVar != null) {
                hVar.mo163976h(this.f162017e, this.f162014b);
            }
            m251925K();
            if (!this.f162016d) {
                long n = (long) mo222178n();
                if (n > 0 && (bVar = this.f162014b) != null && !TextUtils.isEmpty(bVar.mo221934b())) {
                    C64168a.m252175a(this.f162014b.mo221934b(), n, this.f162018f);
                    C64159a.m252083b("VideoController", "Release Vid:" + this.f162014b.mo221934b() + " Push Pos:" + n);
                    C64116b bVar3 = this.f162014b;
                    C64159a.m252077a(bVar3, getClass().getSimpleName() + " Release Vid: " + this.f162014b.mo221934b() + " Push Pos: " + n);
                }
            }
            this.f161998L = false;
            this.f162016d = false;
            this.f162031s = null;
            this.f162033u = 0;
            this.f162034v = 0;
            this.f162024l = -1;
            this.f162038z = null;
            this.f161987A = null;
            this.f161990D = false;
            this.f161991E = null;
            this.f162009W = null;
            this.f162008V = false;
            this.f162006T = null;
            this.f161988B = 0;
            this.f162005S = null;
            this.f162007U.clear();
            this.f161996J = false;
            this.f161997K = false;
            this.f161999M = false;
            TTVideoEngine tTVideoEngine2 = this.f162013a;
            if (tTVideoEngine2 != null && this.f161995I) {
                tTVideoEngine2.setSurface(null);
                if (this.f162028p) {
                    tTVideoEngine2.releaseAsync();
                } else {
                    tTVideoEngine2.release();
                }
                m251935b(tTVideoEngine2);
                EngineInspector.ENUM.onReleaseEngine(tTVideoEngine2, mo222193y());
            }
            this.f162013a = null;
            AbstractC64099h hVar2 = this.f162015c;
            if (hVar2 != null) {
                hVar2.mo221901m(this.f162017e, this.f162014b);
            }
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222143a() {
        boolean z;
        AbstractC64099h hVar;
        AbstractC64097f fVar;
        VideoModel videoModel;
        if (this.f162014b == null) {
            C64159a.m252084c("VideoController", "playEntity can't be null when play");
            return;
        }
        C64159a.m252083b("VideoController", "play:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
        C64159a.m252083b("VideoController", "play videoEngine:" + this.f162013a + ", vid:" + this.f162014b.mo221934b() + ", hashCode:" + hashCode() + ", thread:" + Thread.currentThread() + " title:" + this.f162014b.mo221952l());
        boolean z2 = false;
        this.f161993G = 0;
        m251918D();
        if (this.f162013a == null) {
            m251919E();
            EngineInspector engineInspector = EngineInspector.ENUM;
            TTVideoEngine tTVideoEngine = this.f162013a;
            Context y = mo222193y();
            engineInspector.onCreateEngine(tTVideoEngine, y, "play vid:" + this.f162014b.mo221934b());
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f162000N = 0;
            boolean c = m251938c(0);
            AbstractC64099h hVar2 = this.f162015c;
            if (hVar2 != null) {
                hVar2.mo163979k(this.f162017e, this.f162014b);
            }
            if (!c) {
                mo222190v();
            }
        } else if (this.f161997K) {
            C64159a.m252083b("VideoController", "prepareCalled play:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
            if (!this.f161996J) {
                if (!(!this.f161989C || (fVar = this.f162029q) == null || (videoModel = this.f162006T) == null)) {
                    z2 = fVar.mo221876a(videoModel.getVideoRef());
                }
                AbstractC64099h hVar3 = this.f162015c;
                if (hVar3 != null) {
                    hVar3.mo221893b(this.f162017e, this.f162014b, z2);
                    this.f162015c.mo163979k(this.f162017e, this.f162014b);
                }
                if (z2) {
                    this.f161996J = true;
                    return;
                }
            }
            if (this.f161998L) {
                C64159a.m252083b("VideoController", "prepared play:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
                mo222190v();
                if (!this.f161996J && (hVar = this.f162015c) != null) {
                    hVar.mo163970b(this.f162017e, this.f162014b);
                }
            } else {
                this.f161999M = true;
                C64159a.m252083b("VideoController", "preparing play:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
                AbstractC64099h hVar4 = this.f162015c;
                if (hVar4 != null) {
                    if (this.f161990D) {
                        hVar4.mo221902n(this.f162017e, this.f162014b);
                    } else if (mo222174j()) {
                        this.f162015c.mo163975g(this.f162017e, this.f162014b);
                    }
                }
                this.f162001O = 5;
                AbstractC64099h hVar5 = this.f162015c;
                if (hVar5 != null) {
                    hVar5.mo221880a((AbstractC64108o) this.f162017e, this.f162014b, 5);
                }
                this.f162010X.mo222325a(this.aa);
            }
        } else {
            C64159a.m252083b("VideoController", "pause play:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
            mo222190v();
        }
        this.f161996J = true;
        C64159a.m252083b("VideoController", "Play Engine State:" + EngineInspector.ENUM.getStateDesc());
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222151a(AbstractC64097f fVar) {
        this.f162029q = fVar;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: c */
    public void mo222164c(boolean z) {
        this.f162028p = z;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: e */
    public void mo222167e(boolean z) {
        this.f162036x = z;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: f */
    public void mo222169f(boolean z) {
        this.f161989C = z;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: d */
    public void mo222166d(boolean z) {
        this.f161995I = z;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: b */
    public void mo222161b(int i) {
        this.f162025m = i;
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            tTVideoEngine.setIntOption(4, i);
        }
    }

    /* renamed from: b */
    private void m251935b(TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine != null) {
            tTVideoEngine.setListener(null);
            tTVideoEngine.setVideoInfoListener(null);
            tTVideoEngine.setStreamInfoListener(null);
            tTVideoEngine.setVideoEngineInfoListener(null);
            tTVideoEngine.setABRListener(null);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepare(TTVideoEngine tTVideoEngine) {
        C64159a.m252083b("VideoController", "onPrepare");
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163962a(this.f162017e, this.f162014b);
        }
    }

    /* renamed from: a */
    private VideoEngineInfos m251928a(VideoEngineInfos videoEngineInfos) {
        VideoEngineInfos videoEngineInfos2 = new VideoEngineInfos();
        videoEngineInfos2.setKey(videoEngineInfos.getKey());
        videoEngineInfos2.setUrlInfos(videoEngineInfos.getUrlInfos());
        videoEngineInfos2.setObject(videoEngineInfos.getObject());
        videoEngineInfos2.setUsingMDLHitCacheSize(videoEngineInfos.getUsingMDLHitCacheSize());
        String usingMDLPlayTaskKey = videoEngineInfos.getUsingMDLPlayTaskKey();
        if (!TextUtils.isEmpty(usingMDLPlayTaskKey)) {
            videoEngineInfos2.setUsingMDLPlayTaskKey(usingMDLPlayTaskKey);
        }
        return videoEngineInfos2;
    }

    /* renamed from: b */
    private void m251936b(VideoRef videoRef) {
        SparseArray<VideoInfo> a = C64173b.m252207a(videoRef);
        int i = 0;
        for (int size = a.size() - 1; size >= 0; size--) {
            if (a.valueAt(size) != null) {
                i++;
            }
        }
        this.f161988B = i;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoStatusException(int i) {
        C64159a.m252083b("VideoController", "onVideoStatusException status:" + i);
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221899g(this.f162017e, this.f162014b, i);
        }
    }

    public C64145e(VideoContext videoContext) {
        this.f162035w = videoContext;
        m251917C();
    }

    /* renamed from: a */
    private String m251929a(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return null;
        }
        return videoInfo.getValueStr(8) + ", size:" + videoInfo.getValueInt(1) + "*" + videoInfo.getValueInt(2) + ", definition:" + videoInfo.getValueStr(7);
    }

    /* renamed from: g */
    public void mo222187g(boolean z) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("seekComplete:");
        String str3 = "done";
        if (z) {
            str = str3;
        } else {
            str = "fail";
        }
        sb.append(str);
        C64159a.m252079a(sb.toString());
        C64116b bVar = this.f162014b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" seekComplete: ");
        if (z) {
            str2 = str3;
        } else {
            str2 = "fail";
        }
        sb2.append(str2);
        C64159a.m252077a(bVar, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("seek_complete:");
        if (!z) {
            str3 = "fail";
        }
        sb3.append(str3);
        C64159a.m252083b("VideoController", sb3.toString());
        if (!mo222174j() && mo222170f() && (!this.f161992F || this.f162027o)) {
            m251924J();
        }
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163966a(this.f162017e, this.f162014b, z);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        C64159a.m252083b("VideoController", "onCompletion");
        this.f162016d = true;
        this.f161990D = false;
        this.f161991E = null;
        if (!this.f162027o) {
            m251925K();
        }
        if (this.f162027o) {
            this.f162034v = tTVideoEngine.getWatchedDuration() - this.f162033u;
        } else {
            this.f162034v = tTVideoEngine.getWatchedDuration();
        }
        this.f162033u = tTVideoEngine.getWatchedDuration();
        C64116b bVar = this.f162014b;
        if (bVar != null && !TextUtils.isEmpty(bVar.mo221934b())) {
            C64168a.m252174a(this.f162014b.mo221934b());
        }
        this.f162024l = -1;
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221900l(this.f162017e, this.f162014b);
            this.f162015c.mo163974f(this.f162017e, this.f162014b);
            if (this.f162027o) {
                this.f162015c.mo163975g(this.f162017e, this.f162014b);
                this.f162016d = false;
            }
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onError(Error error) {
        C64159a.m252083b("VideoController", "onError:" + error.description + " errorCode:" + error.code + " internalCode:" + error.internalCode);
        this.f162033u = 0;
        this.f161990D = true;
        this.f161997K = false;
        this.f161996J = false;
        this.f161998L = false;
        this.f161999M = false;
        this.f161991E = error;
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163965a(this.f162017e, this.f162014b, error);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPrepared(TTVideoEngine tTVideoEngine) {
        this.f161998L = true;
        C64116b bVar = this.f162014b;
        C64159a.m252077a(bVar, getClass().getSimpleName() + " onPrepared");
        C64159a.m252079a("onPrepared");
        C64159a.m252083b("VideoController", "onPrepared:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
        StringBuilder sb = new StringBuilder();
        sb.append("onPrepared hashCode:");
        sb.append(hashCode());
        C64159a.m252083b("VideoController", sb.toString());
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163970b(this.f162017e, this.f162014b);
        }
        this.f162010X.mo222324a();
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        C64159a.m252083b("VideoController", "onRenderStart:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
        StringBuilder sb = new StringBuilder();
        sb.append("onRenderStart hashCode:");
        sb.append(hashCode());
        C64159a.m252083b("VideoController", sb.toString());
        this.f162008V = true;
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo163972d(this.f162017e, this.f162014b);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineInfoListener
    public void onVideoEngineInfos(VideoEngineInfos videoEngineInfos) {
        boolean z;
        if (videoEngineInfos != null) {
            VideoEngineInfos a = m251928a(videoEngineInfos);
            this.f162007U.put(a.getKey(), a);
            AbstractC64099h hVar = this.f162015c;
            if (hVar != null) {
                hVar.mo221884a(this.f162017e, this.f162014b, a);
            }
            if (a.getKey().equals("renderSeekComplete") && this.f162015c != null) {
                if (!(a.getObject() instanceof Integer) || ((Integer) a.getObject()).intValue() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.f162015c.mo221895c(this.f162017e, this.f162014b, z);
            }
        }
    }

    /* renamed from: a */
    private List<VideoInfo> m251930a(VideoRef videoRef) {
        ArrayList arrayList = new ArrayList();
        if (!(videoRef == null || videoRef.getVideoInfoList() == null)) {
            for (VideoInfo videoInfo : videoRef.getVideoInfoList()) {
                if (!TextUtils.isEmpty(videoInfo.getValueStr(7))) {
                    arrayList.add(videoInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: b */
    public void mo222162b(boolean z) {
        this.f162027o = z;
        TTVideoEngine tTVideoEngine = this.f162013a;
        if (tTVideoEngine != null) {
            tTVideoEngine.setLooping(z);
        }
    }

    @Override // com.ss.ttvideoengine.VideoInfoListener
    public boolean onFetchedVideoInfo(VideoModel videoModel) {
        AbstractC64097f fVar;
        VideoInfo videoInfo;
        boolean z = false;
        if (videoModel == null) {
            return false;
        }
        this.f162006T = videoModel;
        VideoRef videoRef = videoModel.getVideoRef();
        this.f162038z = C64173b.m252207a(videoRef);
        this.f161987A = m251930a(videoRef);
        AbstractC64097f fVar2 = this.f162029q;
        if (fVar2 != null) {
            if (fVar2 instanceof AbstractC64098g) {
                AbstractC64098g gVar = (AbstractC64098g) fVar2;
                videoInfo = gVar.mo221878a(this.f162017e, videoModel, this.f162014b);
                gVar.mo221879a(videoInfo, this.f162017e, videoModel, this.f162014b);
            } else {
                videoInfo = null;
            }
            if (videoInfo == null) {
                videoInfo = this.f162029q.mo221874a(videoModel);
            }
            if (videoInfo == null) {
                videoInfo = this.f162029q.mo221877b(videoRef);
            }
            if (videoInfo != null) {
                C64159a.m252079a("onGetVideoInfo:" + m251929a(videoInfo));
                C64159a.m252077a(this.f162014b, getClass().getSimpleName() + " onGetVideoInfo: " + m251929a(videoInfo));
                StringBuilder sb = new StringBuilder();
                sb.append("get_video_info:");
                sb.append(m251929a(videoInfo));
                C64159a.m252083b("VideoController", sb.toString());
                if (!videoModel.isDashSource() || videoInfo.getResolution() != Resolution.Auto) {
                    String valueStr = videoInfo.getValueStr(7);
                    this.f162003Q = videoInfo.getValueStr(32);
                    this.f162002P = false;
                    this.f162031s = C64173b.m252208a(valueStr);
                    if (VideoContext.f161933m && TextUtils.isEmpty(this.f162003Q)) {
                        this.f162003Q = VideoContext.f161934n.get(this.f162031s);
                    }
                    if (TextUtils.isEmpty(this.f162003Q) || !VideoContext.f161933m) {
                        m251933a(valueStr, false);
                    } else {
                        mo222158a(this.f162003Q, false, false, "");
                        m251934a(valueStr, false, false);
                    }
                } else {
                    Resolution resolution = Resolution.Auto;
                    this.f162031s = resolution;
                    this.f162002P = true;
                    mo222155a(resolution, false);
                    if (this.f162015c != null) {
                        Resolution[] allResolutions = Resolution.getAllResolutions();
                        int length = allResolutions.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            VideoInfo videoInfo2 = videoRef.getVideoInfo(allResolutions[i], null);
                            if (videoInfo2 != null) {
                                this.f162015c.mo221886a(videoInfo2);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        m251936b(videoRef);
        if (this.f161989C && (fVar = this.f162029q) != null) {
            z = fVar.mo221876a(videoRef);
        }
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221893b(this.f162017e, this.f162014b, z);
        }
        return z;
    }

    /* renamed from: c */
    private boolean m251938c(int i) {
        String str;
        C64169a x = mo222192x();
        if (x != null) {
            this.f162031s = x.mo222319n();
        }
        if (i == 1) {
            str = "try_prepare";
        } else {
            str = "try_play";
        }
        TTVideoEngine.setForceUseLitePlayer(this.f162023k);
        boolean z = false;
        if (this.f162014b.mo221943f() != null) {
            C64159a.m252077a(this.f162014b, getClass().getSimpleName());
            C64159a.m252079a(str + " preload:");
            C64159a.m252083b("VideoController", str + "_preload:");
            this.f162013a.setPreloaderItem(this.f162014b.mo221943f());
            mo222155a(Resolution.values()[this.f162014b.mo221943f().mResolution], false);
        } else if (this.f162014b.mo221925B() != null) {
            C64116b bVar = this.f162014b;
            C64159a.m252077a(bVar, getClass().getSimpleName() + " playInternal directUrlUseDataLoader");
            C64159a.m252079a(str + " directUrlUseDataLoader");
            C64159a.m252083b("VideoController", str + "_direct_url_use_data_loader");
            Resolution resolution = this.f162031s;
            if (resolution != null) {
                mo222155a(resolution, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
            this.f162013a.setDirectUrlUseDataLoader(this.f162014b.mo221925B(), this.f162014b.mo221926C());
            if (this.f162014b.mo221931a() != null) {
                for (Map.Entry<String, String> entry : this.f162014b.mo221931a().entrySet()) {
                    this.f162013a.setCustomHeader(entry.getKey(), entry.getValue());
                }
            }
        } else if (this.f162014b.mo221940e() != null) {
            C64116b bVar2 = this.f162014b;
            C64159a.m252077a(bVar2, getClass().getSimpleName() + " playInternal cache VideoModel");
            C64159a.m252079a(str + " cacheUrl");
            C64159a.m252083b("VideoController", str + "_cache_video_model vid:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
            this.f162013a.setVideoModel(this.f162014b.mo221940e());
            z = onFetchedVideoInfo(this.f162014b.mo221940e());
        } else if (!TextUtils.isEmpty(this.f162014b.mo221946h())) {
            C64116b bVar3 = this.f162014b;
            C64159a.m252077a(bVar3, getClass().getSimpleName() + " playInternal local url:" + this.f162014b.mo221946h());
            C64159a.m252079a(str + " local url:" + this.f162014b.mo221946h());
            C64159a.m252083b("VideoController", str + "_local_url:" + this.f162014b.mo221946h());
            Resolution resolution2 = this.f162031s;
            if (resolution2 != null) {
                mo222155a(resolution2, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
            this.f162013a.setLocalURL(this.f162014b.mo221946h());
        } else if (!TextUtils.isEmpty(this.f162014b.mo221944g())) {
            C64116b bVar4 = this.f162014b;
            C64159a.m252077a(bVar4, getClass().getSimpleName() + " playInternal direct url: " + this.f162014b.mo221944g());
            C64159a.m252079a(str + " direct url:" + this.f162014b.mo221944g());
            C64159a.m252083b("VideoController", str + "_direct_url:" + this.f162014b.mo221944g());
            Resolution resolution3 = this.f162031s;
            if (resolution3 != null) {
                mo222155a(resolution3, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
            this.f162013a.setDirectURL(this.f162014b.mo221944g());
            if (this.f162014b.mo221931a() != null) {
                for (Map.Entry<String, String> entry2 : this.f162014b.mo221931a().entrySet()) {
                    this.f162013a.setCustomHeader(entry2.getKey(), entry2.getValue());
                }
            }
        } else if (this.f162014b.mo221962v() != null) {
            C64116b bVar5 = this.f162014b;
            C64159a.m252077a(bVar5, getClass().getSimpleName() + " playInternal local source");
            C64159a.m252079a(str + " local source");
            C64159a.m252083b("VideoController", str + "_local_source");
            Resolution resolution4 = this.f162031s;
            if (resolution4 != null) {
                mo222155a(resolution4, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
            C64115a v = this.f162014b.mo221962v();
            this.f162013a.setDataSource(v.mo221921a(), v.mo221922b(), v.mo221923c());
        } else if (!TextUtils.isEmpty(this.f162014b.mo221964x())) {
            C64116b bVar6 = this.f162014b;
            C64159a.m252077a(bVar6, getClass().getSimpleName() + " playInternal music url:" + this.f162014b.mo221964x());
            C64159a.m252079a(str + " music url:" + this.f162014b.mo221964x());
            C64159a.m252083b("VideoController", str + "_music_url:" + this.f162014b.mo221964x());
            Resolution resolution5 = this.f162031s;
            if (resolution5 != null) {
                mo222155a(resolution5, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
            this.f162013a.setDirectURL(this.f162014b.mo221964x());
        } else if (!TextUtils.isEmpty(this.f162014b.mo221965y())) {
            C64159a.m252079a(str + " local music path:" + this.f162014b.mo221965y());
            C64159a.m252083b("VideoController", str + "_music_path:" + this.f162014b.mo221965y());
            Resolution resolution6 = this.f162031s;
            if (resolution6 != null) {
                mo222155a(resolution6, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
            this.f162013a.setLocalURL(this.f162014b.mo221965y());
        } else {
            C64116b bVar7 = this.f162014b;
            C64159a.m252077a(bVar7, getClass().getSimpleName() + " playInternal vid");
            C64159a.m252079a(str + " vid");
            C64159a.m252083b("VideoController", str + "_vid:" + this.f162014b.mo221934b() + " title:" + this.f162014b.mo221952l());
            this.f162013a.setVideoID(this.f162014b.mo221934b());
            Resolution resolution7 = this.f162031s;
            if (resolution7 != null) {
                mo222155a(resolution7, false);
            } else {
                m251933a(this.f162014b.mo221951k(), false);
            }
        }
        m251937b(this.f162014b.mo221934b(), this.f162014b.mo221935c());
        return z;
    }

    /* renamed from: a */
    private void m251933a(String str, boolean z) {
        m251934a(str, z, true);
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221897e(this.f162017e, this.f162014b, i);
        }
    }

    /* renamed from: a */
    private void m251932a(String str, long j) {
        if (this.f162036x) {
            Long a = C64168a.m252173a(str, this.f162018f);
            if (a != null) {
                this.f162024l = a.longValue();
                return;
            }
            return;
        }
        this.f162024l = j;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        Resolution resolution;
        C64159a.m252083b("VideoController", "onStreamChanged type:" + i);
        if (i == 0 && (resolution = this.f162032t) != null) {
            this.f162031s = resolution;
            this.f162032t = null;
        }
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221898f(this.f162017e, this.f162014b, i);
        }
    }

    @Override // com.ss.ttvideoengine.StreamInfoListener
    public void onVideoStreamBitrateChanged(Resolution resolution, int i) {
        C64159a.m252083b("VideoController", "onVideoStreamBitrateChanged resolution:" + resolution.toString());
        this.f162009W = resolution;
        Resolution resolution2 = this.f162032t;
        if (resolution2 != null) {
            this.f162031s = resolution2;
            this.f162032t = null;
        }
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221882a(this.f162017e, this.f162014b, resolution, i);
        }
    }

    /* renamed from: b */
    private void m251937b(String str, long j) {
        m251932a(str, j);
        if (this.f162024l > 0) {
            if (this.f161998L) {
                C64159a.m252083b("VideoController", "updateStartPlayPosition videoEngine.seekTo:" + this.f162024l + " vid:" + this.f162014b.mo221934b());
                mo222147a(this.f162024l);
            } else {
                C64159a.m252083b("VideoController", "videoEngine.setStartTime:" + this.f162024l + " vid:" + this.f162014b.mo221934b());
                this.f162013a.setStartTime((int) this.f162024l);
            }
            this.f162037y = this.f162024l;
            return;
        }
        this.f162037y = 0;
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        C64159a.m252079a("onLoadStateChanged:" + i);
        C64116b bVar = this.f162014b;
        C64159a.m252077a(bVar, getClass().getSimpleName() + " onLoadStateChanged: " + i);
        if (i == 1) {
            C64159a.m252083b("VideoController", "load_state_changed -> playable");
            m251927M();
        } else if (i == 2) {
            C64159a.m252083b("VideoController", "load_state_changed -> stalled");
            m251926L();
        } else if (i == 3) {
            C64159a.m252083b("VideoController", "load_state_changed -> error");
        }
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221894c(this.f162017e, this.f162014b, i);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        hashCode();
        if (i == 0) {
            C64159a.m252083b("VideoController", "play_back_state_changed -> stopped");
            C64159a.m252079a("play_back_state_changed -> stopped");
            C64116b bVar = this.f162014b;
            C64159a.m252077a(bVar, getClass().getSimpleName() + " play_back_state_changed -> stopped");
        } else if (i == 1) {
            C64159a.m252083b("VideoController", "play_back_state_changed -> playing");
            C64159a.m252079a("play_back_state_changed -> playing");
            C64116b bVar2 = this.f162014b;
            C64159a.m252077a(bVar2, getClass().getSimpleName() + " play_back_state_changed -> playing");
            m251924J();
            AbstractC64099h hVar = this.f162015c;
            if (hVar != null) {
                hVar.mo163971c(this.f162017e, this.f162014b);
            }
        } else if (i == 2) {
            C64159a.m252083b("VideoController", "play_back_state_changed -> paused");
            C64159a.m252079a("play_back_state_changed -> paused");
            C64116b bVar3 = this.f162014b;
            C64159a.m252077a(bVar3, getClass().getSimpleName() + " play_back_state_changed -> paused");
            AbstractC64099h hVar2 = this.f162015c;
            if (hVar2 != null) {
                hVar2.mo163973e(this.f162017e, this.f162014b);
            }
        } else if (i == 3) {
            C64159a.m252083b("VideoController", "play_back_state_changed -> error");
            C64159a.m252079a("play_back_state_changed -> error");
            C64116b bVar4 = this.f162014b;
            C64159a.m252077a(bVar4, getClass().getSimpleName() + " play_back_state_changed -> error");
            m251925K();
        }
        AbstractC64099h hVar3 = this.f162015c;
        if (hVar3 != null) {
            hVar3.mo221890b((AbstractC64108o) this.f162017e, this.f162014b, i);
        }
    }

    @Override // com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d
    /* renamed from: a */
    public void mo222144a(float f, float f2) {
        if (this.f162013a != null) {
            C64159a.m252083b("VideoController", "setVolume left:" + f + " right:" + f2);
            this.f162013a.setVolume(f, f2);
        }
    }

    /* renamed from: a */
    private void m251934a(String str, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            m251931a(C64173b.m252208a(str), z, z2);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineListener
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        AbstractC64099h hVar = this.f162015c;
        if (hVar != null) {
            hVar.mo221891b(this.f162017e, this.f162014b, i, i2);
        }
    }

    /* renamed from: a */
    private void m251931a(Resolution resolution, boolean z, boolean z2) {
        boolean z3;
        String str;
        Resolution resolution2;
        if (resolution != null) {
            Resolution resolution3 = this.f162031s;
            boolean z4 = false;
            if (resolution3 != resolution) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f162032t = resolution;
            if (resolution3 == null) {
                this.f162031s = resolution;
            }
            if (resolution == Resolution.Auto) {
                this.f162031s = Resolution.Auto;
            } else if (this.f162031s == Resolution.Auto && (resolution2 = this.f162032t) == this.f162009W) {
                this.f162031s = resolution2;
            }
            C64116b bVar = this.f162014b;
            if (bVar != null) {
                C64169a t = bVar.mo221960t();
                if (t != null) {
                    t.mo222302a(resolution);
                }
                AbstractC64099h hVar = this.f162015c;
                if (hVar != null && z3) {
                    hVar.mo221883a(this.f162017e, bVar, resolution, z);
                }
            }
            if (this.f162013a != null) {
                if (resolution != Resolution.Auto || !z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("setResolution:");
                    sb.append(resolution);
                    sb.append(" title:");
                    if (bVar == null) {
                        str = "entity null";
                    } else {
                        str = bVar.mo221952l();
                    }
                    sb.append(str);
                    C64159a.m252083b("VideoController", sb.toString());
                    if (z2) {
                        this.f162013a.configResolution(resolution);
                    }
                } else {
                    this.f162013a.setIntOption(29, 1);
                }
                if (resolution == Resolution.Auto) {
                    z4 = true;
                }
                this.f162002P = z4;
                if (this.f161997K && !this.f162008V) {
                    this.f162031s = resolution;
                }
            }
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (this.f162011Y != i9 || this.f162012Z != i10) {
            C64159a.m252083b("VideoController", "onLayoutChange width:" + i9 + " height:" + i10);
            this.f162011Y = i9;
            this.f162012Z = i10;
            m251916B();
        }
    }
}
