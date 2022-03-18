package com.ss.videoarch.liveplayer;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.C1711a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.p1238a.p1239a.p1240a.p1241a.AbstractC27213b;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.TTPlayerConfiger;
import com.ss.videoarch.liveplayer.log.C65654a;
import com.ss.videoarch.liveplayer.log.C65657b;
import com.ss.videoarch.liveplayer.log.C65658c;
import com.ss.videoarch.liveplayer.log.LiveError;
import com.ss.videoarch.liveplayer.p3250a.AbstractC65606a;
import com.ss.videoarch.liveplayer.p3250a.C65607b;
import com.ss.videoarch.liveplayer.p3251b.C65611a;
import com.ss.videoarch.liveplayer.p3251b.C65612b;
import com.ss.videoarch.liveplayer.p3251b.C65613c;
import com.ss.videoarch.liveplayer.p3252c.C65615a;
import com.ss.videoarch.liveplayer.p3252c.C65623c;
import com.ss.videoarch.liveplayer.p3253d.C65631a;
import com.ss.videoarch.liveplayer.p3253d.C65632b;
import com.ss.videoarch.liveplayer.p3254e.C65634a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.g */
public final class C65638g implements AbstractC65610b {

    /* renamed from: C */
    public static int f165222C = 500;

    /* renamed from: D */
    public static int f165223D = 200;

    /* renamed from: F */
    public static int f165224F = 900;

    /* renamed from: G */
    public static int f165225G = 600;

    /* renamed from: A */
    public String f165226A;

    /* renamed from: B */
    public String f165227B;

    /* renamed from: E */
    public boolean f165228E;

    /* renamed from: H */
    public long f165229H;

    /* renamed from: I */
    public long f165230I;

    /* renamed from: J */
    public long f165231J;

    /* renamed from: K */
    public int f165232K;

    /* renamed from: L */
    public boolean f165233L;

    /* renamed from: M */
    public boolean f165234M;

    /* renamed from: N */
    public long f165235N;

    /* renamed from: O */
    public int f165236O;

    /* renamed from: P */
    public boolean f165237P;

    /* renamed from: Q */
    public boolean f165238Q;

    /* renamed from: R */
    public boolean f165239R;

    /* renamed from: S */
    private final ExecutorService f165240S;

    /* renamed from: T */
    private final Context f165241T;

    /* renamed from: U */
    private final AbstractC65627d f165242U;

    /* renamed from: V */
    private final AbstractC65614c f165243V;

    /* renamed from: W */
    private final int f165244W;

    /* renamed from: X */
    private final C65632b f165245X;

    /* renamed from: Y */
    private SurfaceHolder f165246Y;

    /* renamed from: Z */
    private Surface f165247Z;

    /* renamed from: a */
    public final Handler f165248a;
    private int aA;
    private String aB;
    private String aC;
    private boolean aD;
    private boolean aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private long aK;
    private long aL;
    private long aM;
    private Object aN;
    private C65637f aO;
    private String aP;
    private long aQ;
    private int aR;
    private String aS;
    private String aT;
    private String aU;
    private String aV;
    private String aW;
    private int aX;
    private int aY;
    private int aZ;
    private int aa;
    private int ab;
    private boolean ac;
    private EnumC65643b ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;

    /* renamed from: ai  reason: collision with root package name */
    private int f175465ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private float ax;
    private int ay;
    private float az;

    /* renamed from: b */
    public C65654a f165249b;
    private int bA;
    private int bB;
    private int bC;
    private int bD;
    private String bE;
    private int bF;
    private boolean bG;
    private boolean bH;
    private boolean bI;
    private boolean bJ;
    private boolean bK;
    private int bL;
    private boolean bM;
    private String bN;
    private int bO;
    private int ba;
    private int bb;
    private int bc;
    private int bd;
    private int be;
    private int bf;
    private long bg;
    private long bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private AbstractC27213b bm;
    private int bn;
    private boolean bo;
    private boolean bp;
    private boolean bq;
    private int br;
    private int bs;
    private int bt;
    private int bu;
    private int bv;
    private int bw;
    private int bx;
    private long by;
    private long bz;

    /* renamed from: c */
    public final AbstractC65605a f165250c;

    /* renamed from: d */
    public final C65615a f165251d;

    /* renamed from: e */
    public final C65634a f165252e;

    /* renamed from: f */
    public final C65611a f165253f;

    /* renamed from: g */
    public MediaPlayer f165254g;

    /* renamed from: h */
    public C65623c f165255h;

    /* renamed from: i */
    public EnumC65653l f165256i;

    /* renamed from: j */
    public boolean f165257j;

    /* renamed from: k */
    public boolean f165258k;

    /* renamed from: l */
    public boolean f165259l;

    /* renamed from: m */
    public boolean f165260m;

    /* renamed from: n */
    public int f165261n;

    /* renamed from: o */
    public String f165262o;

    /* renamed from: p */
    public boolean f165263p;

    /* renamed from: q */
    public String f165264q;

    /* renamed from: r */
    public int f165265r;

    /* renamed from: s */
    public boolean f165266s;

    /* renamed from: t */
    public boolean f165267t;

    /* renamed from: u */
    public String f165268u;

    /* renamed from: v */
    public int f165269v;

    /* renamed from: w */
    public boolean f165270w;

    /* renamed from: x */
    public boolean f165271x;

    /* renamed from: y */
    public String f165272y;

    /* renamed from: z */
    public String f165273z;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$b */
    public enum EnumC65643b {
        IDLE,
        PLAYED,
        STOPPED
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$l */
    public enum EnumC65653l {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED
    }

    /* renamed from: d */
    public String mo229677d(int i) {
        switch (i) {
            case 1:
                return "IOSHWCodec";
            case 2:
                return "hardware_codec";
            case 3:
                return "ff_H264_codec";
            case 4:
                return "ff_ByteVC1_codec";
            case 5:
                return "KS_ByteVC1_codec";
            case 6:
                return "JX_ByteVC1_codec";
            default:
                return "none_codec";
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.g$k */
    private static class ThreadFactoryC65652k implements ThreadFactory {
        /* renamed from: a */
        public static Thread m257350a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        private ThreadFactoryC65652k() {
        }

        public Thread newThread(Runnable runnable) {
            Thread a = m257350a(new Thread(runnable, "VideoLiveManager"));
            a.setPriority(10);
            return a;
        }
    }

    /* renamed from: k */
    public int mo229685k() {
        return this.bO;
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: a */
    public void mo229558a(SurfaceHolder surfaceHolder) {
        m257292h("setSurfaceHolder");
        this.f165246Y = surfaceHolder;
        if (this.f165254g != null) {
            this.f165249b.f165319M = System.currentTimeMillis();
            this.f165254g.setDisplay(surfaceHolder);
            this.f165249b.f165318L = System.currentTimeMillis() - this.f165249b.f165319M;
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: a */
    public void mo229557a(Surface surface) {
        m257292h("setSurface");
        this.f165247Z = surface;
        if (this.f165254g != null) {
            this.f165249b.f165319M = System.currentTimeMillis();
            this.f165254g.setSurface(surface);
            this.f165249b.f165318L = System.currentTimeMillis() - this.f165249b.f165319M;
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: a */
    public void mo229561a(C65613c[] cVarArr) {
        C65658c.m257426b("VideoLiveManager", "setPlayUrls, sdkParam:" + cVarArr[0].f165159c);
        m257292h("setPlayURLS");
        this.f165253f.mo229573a(cVarArr);
        this.bO = 0;
        if (this.aC != null && this.f165253f.mo229586e().f165157a != this.aC) {
            m257291g("setPlayURLs");
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: a */
    public void mo229560a(String str) {
        JSONObject jSONObject;
        String str2;
        C65658c.m257426b("VideoLiveManager", "setStreamInfo:" + str);
        m257292h("setStreamInfo");
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            jSONObject = null;
            e.printStackTrace();
        }
        if (jSONObject != null) {
            m257291g("setStreamInfo");
            this.f165253f.mo229571a(new C65612b(jSONObject));
            this.bO = 1;
            m257298t();
            String g = this.f165253f.mo229592g(this.f165273z, this.f165226A);
            if (g != null) {
                if (g.equals("cmaf") && !this.bG) {
                    try {
                        C1711a.m7628a("ttmcmaf");
                        this.bG = true;
                        C65658c.m257426b("VideoLiveManager", "cmaf lib is load success");
                    } catch (Throwable unused) {
                        this.f165253f.mo229574a(1);
                        str2 = this.f165227B;
                        this.bG = false;
                        C65658c.m257426b("VideoLiveManager", "cmaf lib is load failed. change default format");
                    }
                }
                str2 = g;
                this.f165227B = str2;
                this.f165249b.mo229727b(g, str2);
            } else {
                this.f165227B = "flv";
                this.f165249b.mo229727b("none", "flv");
            }
            mo229679e();
            if (!this.aU.isEmpty() && !this.aV.isEmpty() && !this.aW.isEmpty() && this.aU.equals("true") && this.aV.equals("only_video=1") && this.aW.equals("only_audio=1")) {
                this.f165227B = "avph";
            }
            String a = this.f165253f.mo229568a(this.f165273z, this.f165227B, this.f165226A);
            if (a != null) {
                this.f165249b.mo229726b(a);
                if (a.startsWith("http")) {
                    this.aT = "tcp";
                }
                if (a.startsWith("httpk")) {
                    this.aT = "kcp";
                }
                if (a.startsWith("https")) {
                    this.aT = "tls";
                }
            }
            String h = this.f165253f.mo229593h(this.f165273z, this.f165226A);
            this.aS = h;
            if (h != null) {
                if (h.equals("quic") && !this.bH) {
                    try {
                        C1711a.m7628a("ttquic");
                        this.bH = true;
                        C65658c.m257426b("VideoLiveManager", "ttquic lib is load success");
                        this.f165249b.mo229704a(1);
                    } catch (Throwable unused2) {
                        h = this.aT;
                        this.bH = false;
                        C65658c.m257426b("VideoLiveManager", "ttquic lib is load failed. change default protocol");
                        this.f165249b.mo229704a(0);
                    }
                }
                this.aT = h;
                return;
            }
            this.aS = "none";
        }
    }

    /* renamed from: a */
    public String mo229666a(String str, String str2) {
        int indexOf = str.indexOf(".com");
        int indexOf2 = str.indexOf(".com:");
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            if (indexOf2 != -1) {
                int i = indexOf2 + 5;
                int i2 = i + 1;
                while (i2 < sb.length() && sb.charAt(i2) - '0' >= 0 && sb.charAt(i2) - '0' <= 9) {
                    i2++;
                }
                sb.replace(i, i2, str2);
            } else if (indexOf != -1) {
                sb.insert(indexOf + 4, ":" + str2);
            }
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        int indexOf3 = sb2.indexOf("://");
        if (this.aT.equals("kcp")) {
            if (indexOf3 != -1) {
                sb2.replace(0, indexOf3, "httpk");
            }
        } else if (this.aT.equals("quic")) {
            if (indexOf3 != -1) {
                sb2.replace(0, indexOf3, "httpq");
            }
        } else if (this.aT.equals("tls")) {
            if (indexOf3 != -1) {
                sb2.replace(0, indexOf3, "https");
            }
        } else if (this.aT.equals("tcp") && indexOf3 != -1) {
            sb2.replace(0, indexOf3, "http");
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void mo229671a(boolean z) {
        this.f165260m = z;
        if (this.f165254g != null && this.f165271x && !TextUtils.isEmpty(this.aP)) {
            this.f165254g.setLooping(this.f165260m);
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: a */
    public void mo229556a() {
        String str;
        m257292h("play");
        if (this.ad == EnumC65643b.PLAYED) {
            this.f165249b.mo229748h("play");
            return;
        }
        C65658c.m257426b("VideoLiveManager", "play");
        this.ad = EnumC65643b.PLAYED;
        this.aL = -1;
        this.aM = -1;
        String str2 = null;
        C65611a aVar = this.f165253f;
        if (aVar != null) {
            if (aVar.mo229591g() == 1 && this.f165253f.mo229586e() != null) {
                str2 = this.f165253f.mo229586e().f165157a;
                String str3 = this.f165271x ? this.aP : str2;
                if (str3 != null) {
                    if (str3.startsWith("http")) {
                        this.aT = "tcp";
                    }
                    if (str3.startsWith("https")) {
                        this.aT = "tls";
                    }
                    if (str3.startsWith("httpk")) {
                        this.aT = "kcp";
                    }
                }
                if (this.bK) {
                    try {
                        C1711a.m7628a("ttquic");
                        this.bH = true;
                        C65658c.m257426b("VideoLiveManager", "ttquic lib is load success");
                        this.f165249b.mo229704a(1);
                        str = "quic";
                    } catch (Throwable unused) {
                        String str4 = this.aT;
                        this.bH = false;
                        C65658c.m257426b("VideoLiveManager", "ttquic lib is load failed. change default protocol");
                        this.f165249b.mo229704a(0);
                        str = str4;
                    }
                } else {
                    str = "";
                }
                if (str.isEmpty()) {
                    str = this.aT;
                }
                this.aT = str;
            } else if (this.f165253f.mo229591g() == 2) {
                str2 = this.f165253f.mo229568a(this.f165273z, this.f165227B, this.f165226A);
            }
        }
        if (str2 != null) {
            String b = this.f165253f.mo229577b();
            this.bE = b;
            if (TextUtils.isEmpty(b)) {
                this.bE = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            }
            this.f165249b.mo229733c(this.aS, this.aT);
            this.f165249b.mo229715a(this.f165271x ? this.aP : str2, this.f165251d.mo229627c());
            m257289e(str2);
            this.f165252e.mo229657b();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", "no playurl found while play");
        this.f165252e.mo229654a(new LiveError(-100002, "playURL is null", hashMap));
    }

    /* renamed from: a */
    public void mo229668a(C65657b bVar, int i) {
        MediaPlayer mediaPlayer;
        long j;
        if (bVar != null && (mediaPlayer = this.f165254g) != null) {
            bVar.aq = mediaPlayer.getIntOption(355, -1);
            if (i == 0 || i == 2) {
                bVar.f165392d = this.f165254g.getLongOption(68, -1);
                bVar.f165407s = this.f165254g.getLongOption(318, -1);
                bVar.f165392d = this.f165254g.getLongOption(68, -1);
                bVar.f165373K = this.f165254g.getLongOption(345, -1);
                bVar.f165374L = this.f165254g.getLongOption(346, -1);
                String str = this.f165227B;
                if (str == null || (!str.equals("cmaf") && !this.f165227B.equals("avph"))) {
                    j = -1;
                    bVar.f165393e = this.f165254g.getLongOption(69, -1);
                    bVar.f165394f = this.f165254g.getLongOption(70, -1);
                } else {
                    j = -1;
                    bVar.f165411w = this.f165254g.getLongOption(265, -1);
                    bVar.f165412x = this.f165254g.getLongOption(268, -1);
                    bVar.f165414z = this.f165254g.getLongOption(269, -1);
                    bVar.f165413y = this.f165254g.getLongOption(266, -1);
                    bVar.f165365C = this.f165254g.getLongOption(272, -1);
                    bVar.f165366D = this.f165254g.getLongOption(273, -1);
                    bVar.f165367E = this.f165254g.getLongOption(274, -1);
                    bVar.f165368F = this.f165254g.getLongOption(275, -1);
                    if (this.f165227B.equals("cmaf")) {
                        bVar.f165393e = this.f165254g.getLongOption(450, -1);
                        bVar.f165394f = this.f165254g.getLongOption(451, -1);
                        bVar.f165408t = this.f165254g.getLongOption(452, -1);
                        bVar.f165409u = this.f165254g.getLongOption(453, -1);
                        bVar.f165410v = this.f165254g.getLongOption(454, -1);
                        bVar.f165363A = this.f165254g.getLongOption(455, -1);
                        bVar.f165364B = this.f165254g.getLongOption(456, -1);
                    } else {
                        bVar.f165393e = this.f165254g.getLongOption(69, -1);
                        bVar.f165394f = this.f165254g.getLongOption(70, -1);
                    }
                }
                bVar.f165395g = this.f165254g.getLongOption(75, j);
                bVar.f165396h = this.f165254g.getLongOption(76, j);
                bVar.f165397i = this.f165254g.getLongOption(77, j);
                bVar.f165398j = this.f165254g.getLongOption(78, j);
                bVar.f165403o = this.f165254g.getLongOption(155, j);
                bVar.f165404p = this.f165254g.getLongOption(162, j);
                bVar.f165405q = this.f165254g.getLongOption(156, j);
                bVar.f165406r = this.f165254g.getLongOption(163, j);
                bVar.f165380R = (this.f165254g.getLongOption(63, 0) * 8) / 1000;
                bVar.f165382T = this.f165254g.getLongOption(73, 0);
                bVar.f165381S = this.f165254g.getLongOption(72, 0);
                bVar.al = this.f165273z;
                bVar.ad = this.f165254g.getLongOption(458, 0);
                bVar.ae = this.f165254g.getLongOption(459, 0);
                bVar.af = this.f165254g.getVideoType();
                bVar.ag = this.f165254g.getLongOption(624, 0);
                bVar.ah = this.f165254g.getLongOption(338, 0);
                bVar.f175467ai = this.f165254g.getLongOption(336, 0);
                bVar.aj = this.f165254g.getLongOption(337, 0);
                bVar.ao = this.f165254g.getIntOption(351, -1);
                bVar.ap = this.f165254g.getIntOption(352, -1);
                bVar.f165369G = this.f165254g.getLongOption(341, -1);
                bVar.f165370H = this.f165254g.getLongOption(343, -1);
                bVar.f165371I = this.f165254g.getLongOption(342, -1);
                bVar.f165372J = this.f165254g.getLongOption(344, -1);
                if (i == 0) {
                    bVar.f165383U = bVar.f165380R;
                    bVar.f165384V = bVar.f165381S;
                    bVar.f165385W = bVar.f165382T;
                    bVar.ak = this.f165251d.mo229627c();
                    bVar.f165401m = this.f165254g.getLongOption(210, -1);
                    bVar.f165399k = System.currentTimeMillis();
                    m257287a(bVar);
                }
                if (!this.f165259l && i == 2) {
                    bVar.f165386X = this.f165254g.getLongOption(314, 0);
                }
            } else if (i == 1) {
                bVar.f165375M = this.f165254g.getLongOption(45, 0);
                bVar.f165376N = this.f165254g.getLongOption(46, 0);
                bVar.f165379Q = this.f165254g.getFloatOption(150, BitmapDescriptorFactory.HUE_RED);
                bVar.f165380R = (this.f165254g.getLongOption(63, 0) * 8) / 1000;
                bVar.f165382T = this.f165254g.getLongOption(73, 0);
                bVar.f165381S = this.f165254g.getLongOption(72, 0);
                bVar.f165378P = (long) this.f165254g.getCurrentPosition();
                bVar.f165377O = System.currentTimeMillis();
                bVar.ak = this.f165251d.mo229627c();
                bVar.al = this.f165273z;
            } else if (i == 3) {
                bVar.f165379Q = this.f165254g.getFloatOption(150, BitmapDescriptorFactory.HUE_RED);
                bVar.f165380R = (this.f165254g.getLongOption(63, 0) * 8) / 1000;
                bVar.f165382T = this.f165254g.getLongOption(73, 0);
                bVar.al = this.f165273z;
            } else if (i == 4) {
                bVar.f165382T = this.f165254g.getLongOption(73, 0);
                bVar.f165381S = this.f165254g.getLongOption(72, 0);
            } else if (i == 5) {
                bVar.as = this.f165254g.getLongOption(73, -1);
                bVar.ar = this.f165254g.getLongOption(72, -1);
            } else if (i == 6) {
                bVar.au = this.f165254g.getLongOption(73, -1);
                bVar.at = this.f165254g.getLongOption(72, -1);
            } else if (i == 7) {
                int intOption = this.f165254g.getIntOption(61, -1);
                int intOption2 = this.f165254g.getIntOption(62, -1);
                if (intOption == 1) {
                    if (intOption2 == 1) {
                        bVar.av = 2;
                    } else {
                        bVar.av = 1;
                    }
                } else if (intOption2 == 1) {
                    bVar.av = 0;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo229670a(String str, String str2, String str3, String str4) {
        Map<String, String> map;
        String str5;
        long currentTimeMillis = System.currentTimeMillis();
        this.f165249b.af = currentTimeMillis;
        if (str2 != null) {
            map = m257286a(str2, str3, currentTimeMillis);
            if (map != null && map.containsKey("MDL-ProxyURL")) {
                str = map.get("MDL-ProxyURL");
                map.remove("MDL-ProxyURL");
                C65658c.m257426b("VideoLiveManager", "MDL: " + str + " headers: " + map.toString());
            }
        } else {
            map = null;
        }
        C65658c.m257426b("VideoLiveManager", "prepareToPlay:" + str);
        if (str != null && this.f165254g != null) {
            if (map == null) {
                map = new HashMap<>();
            }
            if (str4 != null) {
                map.put("Host", String.format(" %s", str4));
            }
            Map<String, String> c = this.f165253f.mo229581c();
            if (c != null) {
                map.putAll(c);
                C65658c.m257426b("VideoLiveManager", "headers: " + map.toString());
            }
            if (this.aT.equals("quic")) {
                map.put("suggest_protocol", "quic");
                if (this.bI) {
                    this.f165254g.setStringOption(353, this.f165241T.getApplicationInfo().dataDir + "/pullstream.scfg");
                }
                if (this.bJ) {
                    try {
                        Class<?> cls = Class.forName("com.ss.avframework.transport.ContextUtils");
                        if (cls != null) {
                            Method method = cls.getMethod("initApplicationContext", Context.class);
                            method.setAccessible(true);
                            method.invoke(null, this.f165241T.getApplicationContext());
                        }
                        Class<?> cls2 = Class.forName("com.ss.avframework.transport.JNIUtils");
                        if (cls2 != null) {
                            Method method2 = cls2.getMethod("setClassLoader", ClassLoader.class);
                            method2.setAccessible(true);
                            method2.invoke(null, this.f165241T.getClassLoader());
                        }
                    } catch (Throwable th) {
                        this.bJ = false;
                        Log.e("VideoLiveManager", "disable quic cert verify, " + th.toString());
                    }
                }
                this.f165254g.setIntOption(354, this.bJ ? 1 : 0);
            }
            this.f165249b.mo229733c(this.aS, this.aT);
            this.f165249b.mo229761n(this.f165253f.mo229588e(this.f165273z, this.f165226A));
            MediaPlayer mediaPlayer = this.f165254g;
            if (!(mediaPlayer == null || (str5 = this.f165227B) == null)) {
                mediaPlayer.setStringOption(315, str5);
            }
            if (this.f165256i == EnumC65653l.PREPARED) {
                this.f165256i = EnumC65653l.INITIALIZED;
                this.f165254g.reset();
                if (this.f165261n == 1 && !TextUtils.isEmpty(this.f165262o) && !TextUtils.isEmpty(this.aB) && !this.f165263p) {
                    this.f165254g.setStringOption(17, this.aB);
                    this.f165254g.setIntOption(14, 1);
                    this.f165254g.setCacheFile(this.f165262o, 1);
                }
            }
            this.f165254g.setIntOption(340, this.f165253f.mo229583d(this.f165273z, this.f165226A));
            int b = this.f165253f.mo229576b(this.f165273z, this.f165226A);
            this.f165249b.mo229743f(b);
            this.f165254g.setIntOption(339, b);
            C65658c.m257426b("VideoLiveManager", "mEnableResolutionAutoDegrade:" + this.f165267t + ";mAbrStrategy:" + this.f165268u + ";mResolution:" + this.f165273z + ";mSettingResolution:" + this.f165272y);
            this.f165249b.ad = -1;
            this.f165249b.ae = -1;
            if (!((this.aJ != 1 && !this.aE) || this.aL == -1 || this.f165254g == null)) {
                C65658c.m257426b("VideoLiveManager", "prepareToPlay set dts:" + this.aL);
                this.f165254g.setLongOption(633, this.aL);
                this.f165254g.setLongOption(635, this.aK);
            }
            try {
                String a = m257284a(str, currentTimeMillis);
                if (this.f165227B.equals("cmaf")) {
                    a = m257285a(a, "play_start", "1");
                }
                if (this.f165267t && this.f165268u.equals("abr_bb_4live") && this.f165253f.mo229591g() == 2) {
                    m257297s();
                    this.f165253f.mo229582c(this.f165273z);
                    this.f165253f.mo229585d("_session_id=" + this.f165249b.f165347o);
                    String a2 = this.f165253f.mo229569a(this.f165227B, this.f165226A, str3, str4);
                    C65658c.m257426b("VideoLiveManager", "mpd url:" + a2);
                    if (a2 != null) {
                        a = "mem://llash/" + a2;
                    }
                    if (a2 != null) {
                        this.f165254g.setStringOption(315, "llash");
                    }
                    this.f165254g.setIntOption(324, 1);
                }
                C65658c.m257426b("VideoLiveManager", "url:" + a);
                this.f165254g.setDataSource(this.f165241T, Uri.parse(a), map);
                if (this.f165246Y != null) {
                    this.f165249b.f165319M = System.currentTimeMillis();
                    this.f165254g.setDisplay(this.f165246Y);
                    this.f165249b.f165318L = System.currentTimeMillis() - this.f165249b.f165319M;
                } else if (this.f165247Z != null) {
                    this.f165249b.f165319M = System.currentTimeMillis();
                    this.f165254g.setSurface(this.f165247Z);
                    this.f165249b.f165318L = System.currentTimeMillis() - this.f165249b.f165319M;
                }
                this.f165254g.setScreenOnWhilePlaying(true);
                if (this.f165256i == EnumC65653l.INITIALIZED) {
                    try {
                        this.f165254g.prepareAsync();
                        this.f165256i = EnumC65653l.PREPARING;
                    } catch (Exception e) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("url", a);
                        LiveError liveError = new LiveError(-100001, e.getMessage(), hashMap);
                        if (this.f165271x) {
                            this.f165250c.mo142869a(liveError);
                        } else {
                            this.f165252e.mo229654a(liveError);
                        }
                    }
                }
            } catch (Exception e2) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", str);
                LiveError liveError2 = new LiveError(-100002, e2.getMessage(), hashMap2);
                if (this.f165271x) {
                    this.f165250c.mo142869a(liveError2);
                } else {
                    this.f165252e.mo229654a(liveError2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo229672a(int i) {
        String a;
        if (this.f165226A.equals("main")) {
            String a2 = this.f165253f.mo229568a(this.f165273z, this.f165227B, "backup");
            if (a2 != null) {
                this.f165249b.mo229716a(this.aC, a2, "main_to_backup", i);
                this.f165249b.mo229732c(a2);
                this.aC = a2;
                this.f165226A = "backup";
                mo229682h();
                mo229678d(a2);
                this.f165265r = 0;
                return true;
            }
        } else if (this.f165226A.equals("backup") && (a = this.f165253f.mo229568a(this.f165273z, this.f165227B, "main")) != null) {
            this.f165249b.mo229716a(this.aC, a, "backup_to_main", i);
            this.f165249b.mo229732c(a);
            this.aC = a;
            this.f165226A = "main";
            mo229682h();
            mo229678d(a);
            this.f165265r = 0;
            return true;
        }
        return false;
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: d */
    public boolean mo229565d() {
        MediaPlayer mediaPlayer = this.f165254g;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public String mo229683i() {
        return this.f165254g.getStringOption(5002);
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: b */
    public void mo229562b() {
        C65658c.m257426b("VideoLiveManager", "stop");
        m257292h("stop");
        m257288a(true, "stop");
        this.f165252e.mo229658c();
    }

    /* renamed from: n */
    public void mo229688n() {
        if (!this.f165228E && !this.f165266s) {
            this.bh = this.f165254g.getLongOption(320, -1);
            this.bg = this.f165254g.getLongOption(319, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo229679e() {
        /*
            r5 = this;
            com.ss.videoarch.liveplayer.b.a r0 = r5.f165253f
            java.lang.String r1 = r5.f165273z
            java.lang.String r2 = r5.f165226A
            java.lang.String r0 = r0.mo229567a(r1, r2)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            r1 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002b }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x002b }
            java.lang.String r0 = "IsEnable"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ JSONException -> 0x002b }
            java.lang.String r3 = "VideoOnly"
            java.lang.String r3 = r2.optString(r3)     // Catch:{ JSONException -> 0x0028 }
            java.lang.String r4 = "AudioOnly"
            java.lang.String r1 = r2.optString(r4)     // Catch:{ JSONException -> 0x0026 }
            goto L_0x0031
        L_0x0026:
            r2 = move-exception
            goto L_0x002e
        L_0x0028:
            r2 = move-exception
            r3 = r1
            goto L_0x002e
        L_0x002b:
            r2 = move-exception
            r0 = r1
            r3 = r0
        L_0x002e:
            r2.printStackTrace()
        L_0x0031:
            if (r0 == 0) goto L_0x0035
            r5.aU = r0
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r5.aV = r3
        L_0x0039:
            if (r1 == 0) goto L_0x003d
            r5.aW = r1
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.C65638g.mo229679e():void");
    }

    /* renamed from: f */
    public void mo229680f() {
        C65658c.m257426b("VideoLiveManager", "_stopPlayer");
        if (this.f165254g != null && (this.f165256i == EnumC65653l.PREPARED || this.f165256i == EnumC65653l.PREPARING)) {
            Log.d("VideoLiveManager", "call player stop");
            this.f165254g.stop();
        }
        this.f165256i = EnumC65653l.INITIALIZED;
        C65658c.m257426b("VideoLiveManager", "prepareState: " + this.f165256i);
    }

    /* renamed from: h */
    public void mo229682h() {
        C65658c.m257426b("VideoLiveManager", "_resetPlayer");
        MediaPlayer mediaPlayer = this.f165254g;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.f165256i = EnumC65653l.INITIALIZED;
    }

    /* renamed from: j */
    public void mo229684j() {
        MediaPlayer mediaPlayer = this.f165254g;
        if (mediaPlayer != null && this.f165249b != null) {
            int intOption = mediaPlayer.getIntOption(SmActions.ACTION_IDLE_ENTRY, -1);
            if (intOption == 0) {
                this.f165249b.mo229759m("h264");
            } else if (intOption == 1) {
                this.f165249b.mo229759m("bytevc1");
            }
        }
    }

    /* renamed from: m */
    public void mo229687m() {
        if ((this.f165266s || this.f165228E) && this.bf == 1) {
            if (this.bg != -1) {
                this.f165249b.mo229710a((long) ((int) (System.currentTimeMillis() - this.bg)), 0, false, false);
            }
            if (this.bh != -1) {
                this.f165249b.mo229710a((long) ((int) (System.currentTimeMillis() - this.bh)), 0, true, false);
            }
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.g$a */
    public static final class C65642a {

        /* renamed from: a */
        final Context f165281a;

        /* renamed from: b */
        AbstractC65605a f165282b;

        /* renamed from: c */
        String f165283c;

        /* renamed from: d */
        AbstractC65627d f165284d;

        /* renamed from: e */
        AbstractC65614c f165285e;

        /* renamed from: f */
        boolean f165286f;

        /* renamed from: g */
        boolean f165287g;

        /* renamed from: h */
        int f165288h;

        /* renamed from: i */
        int f165289i;

        /* renamed from: j */
        String f165290j;

        /* renamed from: k */
        String f165291k;

        /* renamed from: l */
        boolean f165292l;

        /* renamed from: m */
        boolean f165293m;

        /* renamed from: n */
        public long f165294n;

        /* renamed from: o */
        public long f165295o;

        /* renamed from: p */
        public long f165296p;

        /* renamed from: a */
        public C65638g mo229695a() {
            if (this.f165281a == null) {
                throw new IllegalArgumentException("mContext should not be null");
            } else if (this.f165282b == null) {
                throw new IllegalArgumentException("mListener should not be null");
            } else if (this.f165284d != null) {
                return new C65638g(this);
            } else {
                throw new IllegalArgumentException("mNetworkClient should not be null");
            }
        }

        /* renamed from: a */
        public C65642a mo229690a(int i) {
            this.f165289i = i;
            return this;
        }

        /* renamed from: b */
        public C65642a mo229696b(int i) {
            this.f165288h = i;
            return this;
        }

        /* renamed from: c */
        public C65642a mo229698c(boolean z) {
            this.f165292l = z;
            return this;
        }

        /* renamed from: a */
        public C65642a mo229691a(AbstractC65605a aVar) {
            this.f165282b = aVar;
            return this;
        }

        /* renamed from: b */
        public C65642a mo229697b(boolean z) {
            this.f165287g = z;
            return this;
        }

        /* renamed from: a */
        public C65642a mo229692a(AbstractC65627d dVar) {
            this.f165284d = dVar;
            return this;
        }

        /* renamed from: a */
        public C65642a mo229693a(String str) {
            this.f165283c = str;
            return this;
        }

        private C65642a(Context context) {
            this.f165288h = CalendarSearchResultRv.f82652c;
            this.f165289i = 1;
            this.f165290j = "origin";
            this.f165291k = "flv";
            this.f165293m = true;
            this.f165294n = 10000;
            this.f165295o = 60000;
            this.f165296p = 8000;
            this.f165281a = context;
        }

        /* renamed from: a */
        public C65642a mo229694a(boolean z) {
            this.f165286f = z;
            return this;
        }
    }

    /* renamed from: com.ss.videoarch.liveplayer.g$j */
    private static final class C65651j implements C65634a.AbstractC65636a {

        /* renamed from: a */
        private final WeakReference<C65638g> f165305a;

        @Override // com.ss.videoarch.liveplayer.p3254e.C65634a.AbstractC65636a
        /* renamed from: a */
        public void mo229661a() {
            C65638g gVar = this.f165305a.get();
            if (gVar != null && gVar.f165254g != null) {
                C65658c.m257426b("VideoLiveManager", "onRetryNextPlayURL");
                String str = null;
                if (gVar.f165253f.mo229591g() == 1) {
                    str = gVar.f165253f.mo229590f();
                } else if (gVar.f165253f.mo229591g() == 2) {
                    str = gVar.f165253f.mo229568a(gVar.f165273z, gVar.f165227B, gVar.f165226A);
                }
                gVar.f165249b.mo229732c(str);
                if (!gVar.f165259l) {
                    gVar.f165259l = true;
                    gVar.f165249b.mo229708a(gVar.f165254g.getLongOption(314, 0));
                }
                gVar.mo229680f();
                if (gVar.f165256i == EnumC65653l.PREPARED) {
                    gVar.mo229678d(str);
                    return;
                }
                gVar.mo229682h();
                gVar.mo229678d(str);
            }
        }

        public C65651j(C65638g gVar) {
            this.f165305a = new WeakReference<>(gVar);
        }

        @Override // com.ss.videoarch.liveplayer.p3254e.C65634a.AbstractC65636a
        /* renamed from: a */
        public void mo229662a(LiveError liveError) {
            C65638g gVar = this.f165305a.get();
            if (gVar != null && gVar.f165254g != null) {
                C65658c.m257426b("VideoLiveManager", "onReportOutToApplication");
                gVar.f165250c.mo142869a(liveError);
                gVar.f165255h.mo229641a();
                gVar.f165252e.mo229659d();
            }
        }

        @Override // com.ss.videoarch.liveplayer.p3254e.C65634a.AbstractC65636a
        /* renamed from: a */
        public void mo229663a(boolean z) {
            C65638g gVar = this.f165305a.get();
            if (gVar != null && gVar.f165254g != null) {
                long longOption = gVar.f165254g.getLongOption(45, 0);
                gVar.f165249b.ac += longOption;
                long j = gVar.f165249b.ab;
                if (!gVar.f165249b.aa) {
                    gVar.f165249b.ab = longOption - gVar.f165249b.mo229729c();
                } else {
                    gVar.f165249b.ab = longOption + j;
                }
                gVar.f165249b.aa = true;
                gVar.mo229688n();
                gVar.f165228E = true;
                C65658c.m257426b("VideoLiveManager", "onRetryResetPlayer " + z);
                if (!gVar.f165259l) {
                    gVar.f165259l = true;
                    gVar.f165249b.mo229708a(gVar.f165254g.getLongOption(314, 0));
                }
                gVar.mo229680f();
                String str = null;
                if (gVar.f165253f.mo229591g() == 1) {
                    if (gVar.f165253f.mo229586e() != null) {
                        str = gVar.f165253f.mo229586e().f165157a;
                    }
                } else if (gVar.f165253f.mo229591g() == 2) {
                    str = gVar.f165253f.mo229568a(gVar.f165273z, gVar.f165227B, gVar.f165226A);
                }
                gVar.f165249b.mo229732c(str);
                gVar.f165231J = System.currentTimeMillis();
                if (gVar.f165256i == EnumC65653l.PREPARED) {
                    gVar.mo229678d(str);
                    return;
                }
                gVar.mo229682h();
                gVar.mo229678d(str);
            }
        }
    }

    /* renamed from: o */
    private void m257293o() {
        this.f165254g.setOnPreparedListener(new C65650i(this));
        this.f165254g.setOnErrorListener(new C65645d(this));
        this.f165254g.setOnInfoListener(new C65647f(this));
        this.f165254g.setOnCompletionListener(new C65644c(this));
        this.f165254g.setOnExternInfoListener(new C65646e(this));
        this.f165254g.setOnVideoSizeChangedListener(new C65649h(this));
        if (this.f165254g instanceof C65631a) {
            this.aO = new C65637f(this);
            try {
                Class<?> cls = Class.forName("com.ss.ttm.player.FrameMetadataListener");
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this.aO);
                this.aN = newProxyInstance;
                ((C65631a) this.f165254g).mo229647a(newProxyInstance);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: s */
    private void m257297s() {
        if (this.f165268u.equals("abr_bb_4live") && this.f165267t && !this.f165253f.mo229575a(this.f165273z)) {
            for (int i = 0; i < AbstractC65633e.f165202a.length; i++) {
                if (this.f165253f.mo229575a(AbstractC65633e.f165202a[i])) {
                    C65658c.m257426b("VideoLiveManager", "Abr res check.modify from " + this.f165273z + " to " + AbstractC65633e.f165202a[i]);
                    this.f165273z = AbstractC65633e.f165202a[i];
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private void m257298t() {
        boolean z;
        JSONObject a = this.f165253f.mo229570a();
        if (a != null) {
            boolean z2 = true;
            this.aE = true;
            try {
                if (a.optInt("enable") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f165267t = z;
                this.f165268u = a.getString("strategy");
                this.f165273z = a.getString("default");
                if (a.has("EnableOriginResolution")) {
                    if (a.optInt("EnableOriginResolution") != 1) {
                        z2 = false;
                    }
                    this.aD = z2;
                }
                this.f165269v = a.getJSONObject("demotion").getInt("stall_count");
            } catch (JSONException e) {
                e.printStackTrace();
                this.aE = false;
                this.f165267t = false;
                this.aD = false;
                this.f165268u = "rad";
                this.f165269v = 4;
                this.f165273z = "origin";
            }
        } else {
            this.aE = false;
            this.f165267t = false;
            this.aD = false;
            this.f165268u = "rad";
            this.f165269v = 4;
            this.f165273z = "origin";
        }
        if (this.f165267t) {
            this.f165272y = "auto";
        } else {
            this.f165272y = this.f165273z;
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: c */
    public void mo229564c() {
        C65658c.m257426b("VideoLiveManager", "release start");
        m257292h("release");
        if (this.ad == EnumC65643b.PLAYED) {
            m257288a(true, "release");
        }
        this.f165240S.shutdown();
        this.f165248a.removeCallbacksAndMessages(null);
        MediaPlayer mediaPlayer = this.f165254g;
        if (mediaPlayer != null) {
            mediaPlayer.prevClose();
            this.f165254g.release();
            this.f165254g = null;
            this.f165249b.mo229742f();
            this.f165256i = EnumC65653l.IDLE;
            this.ad = EnumC65643b.IDLE;
            C65658c.m257426b("VideoLiveManager", "release end");
        }
    }

    /* renamed from: g */
    public void mo229681g() {
        C65658c.m257426b("VideoLiveManager", "reset");
        m257292h("reset");
        if (this.f165254g != null) {
            m257291g("reset");
            this.f165249b.mo229742f();
            this.aB = null;
            this.f165262o = null;
            this.f165267t = false;
            this.f165270w = true;
            this.aD = false;
            this.f165272y = "none";
            this.f165273z = "origin";
            this.aR = -1;
            this.f165227B = "flv";
            this.aT = "tcp";
            this.aS = "none";
            this.f165226A = "main";
            this.aP = null;
            this.f165271x = false;
            this.aA = 0;
            this.av = -1;
            this.aU = "";
            this.bI = false;
            this.f165258k = false;
        }
    }

    /* renamed from: u */
    private void m257299u() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f165244W != 0) {
            z = true;
        } else {
            z = false;
        }
        TTPlayerConfiger.setValue(1, z);
        if (this.f165244W == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        TTPlayerConfiger.setValue(2, z2);
        TTPlayerConfiger.setValue(6, false);
        TTPlayerConfiger.setValue(11, true);
        MediaPlayer mediaPlayer = this.f165254g;
        if (mediaPlayer != null) {
            boolean isOSPlayer = mediaPlayer.isOSPlayer();
            if (this.f165244W == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isOSPlayer ^ z3) {
                this.f165254g.releaseAsync();
                this.f165254g = null;
            }
        }
        if (this.f165254g == null) {
            this.f165254g = C65631a.m257264a(this.f165241T, this.ar);
            C65607b.m257152a().mo229551a(this.f165254g);
            if (!(this.f165254g.getPlayerType() == 1 || this.f165254g.getPlayerType() == 2)) {
                this.aj = 0;
                this.br = 0;
                this.bs = 0;
            }
            m257294p();
            m257293o();
        }
        if (this.f165254g.isOSPlayer()) {
            this.f165249b.mo229754k("-1");
        } else {
            this.f165249b.mo229754k(TTPlayerConfiger.getValue(14, "0"));
        }
        this.f165251d.mo229623a(this.bM, this.bN);
        if (this.f165255h == null) {
            this.f165255h = new C65623c(this.f165240S, this.f165242U);
        }
        this.f165245X.mo229649a(this.f165254g);
    }

    /* renamed from: l */
    public boolean mo229686l() {
        String a;
        if (this.f165273z == "ld") {
            return false;
        }
        if (this.aR == -1) {
            int i = 0;
            while (true) {
                if (i >= AbstractC65633e.f165202a.length) {
                    break;
                } else if (AbstractC65633e.f165202a[i].equals(this.f165273z)) {
                    this.aR = i;
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = this.aR + 1;
        while (i2 < AbstractC65633e.f165202a.length && !this.f165253f.mo229579b(AbstractC65633e.f165202a[i2])) {
            i2++;
        }
        if (i2 >= AbstractC65633e.f165202a.length || (a = this.f165253f.mo229568a(AbstractC65633e.f165202a[i2], this.f165227B, "main")) == null) {
            return false;
        }
        C65654a aVar = this.f165249b;
        String str = this.aC;
        aVar.mo229716a(str, a, "auto_" + this.f165273z + "_to_" + AbstractC65633e.f165202a[i2], -100015);
        this.aC = a;
        this.aR = i2;
        String str2 = AbstractC65633e.f165202a[i2];
        this.f165273z = str2;
        AbstractC65605a aVar2 = this.f165250c;
        if (aVar2 != null) {
            aVar2.mo142877c(str2);
        }
        this.f165249b.mo229732c(this.aC);
        this.f165226A = "main";
        this.f165265r = 0;
        mo229678d(a);
        return true;
    }

    /* renamed from: q */
    private void m257295q() {
        AbstractC65614c cVar = this.f165243V;
        if (cVar != null) {
            this.f175465ai = ((Integer) cVar.mo229619a("live_option_render_type", 3)).intValue();
            this.aH = ((Integer) this.f165243V.mo229619a("live_enable_cmaf_fast_mode", 0)).intValue();
            this.bz = ((Long) this.f165243V.mo229619a("live_start_play_buffer_thres", 0L)).longValue();
            this.bA = ((Integer) this.f165243V.mo229619a("live_check_buffering_end_ignore_video", 0)).intValue();
            this.f165236O = ((Integer) this.f165243V.mo229619a("live_direct_start_after_prepared", 0)).intValue();
            this.bB = ((Integer) this.f165243V.mo229619a("live_check_buffering_end_advance", 0)).intValue();
            if (!this.aE) {
                this.f165267t = ((Boolean) this.f165243V.mo229619a("live_enable_resolution_degrade", Boolean.FALSE)).booleanValue();
                this.f165269v = ((Integer) this.f165243V.mo229619a("live_stall_count_thres_for_degrade", 4)).intValue();
            }
            C65658c.m257426b("VideoLiveManager", "mEnableResolutionAutoDegrade:" + this.f165267t + " mStallCountThresOfResolutionDegrade:" + this.f165269v);
            this.aa = ((Integer) this.f165243V.mo229619a("live_open_mdl_enable", 0)).intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("enable mdl:");
            sb.append(this.aa);
            C65658c.m257426b("VideoLiveManager", sb.toString());
            this.bC = ((Integer) this.f165243V.mo229619a("live_enable_tcp_fast_open", 0)).intValue();
            this.bD = ((Integer) this.f165243V.mo229619a("live_enable_check_packet_corrupt", 0)).intValue();
            this.bL = ((Integer) this.f165243V.mo229619a("live_enable_flv_abr", 0)).intValue();
            this.bM = ((Boolean) this.f165243V.mo229619a("live_sdk_http_dns_enabled", Boolean.FALSE)).booleanValue();
            this.bN = (String) this.f165243V.mo229619a("live_sdk_http_dns_server_host", "null");
            this.f165249b.f165308B = this.bM;
            C65658c.m257426b("VideoLiveManager", "enable http dns:" + this.bM + " http dns server: " + this.bN);
            this.f165237P = ((Boolean) this.f165243V.mo229619a("live_sdk_cancel_sdk_dns_fail_retry", Boolean.FALSE)).booleanValue();
            this.bk = ((Integer) this.f165243V.mo229619a("live_enable_close_play_retry", 0)).intValue();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x020c A[Catch:{ JSONException -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0222 A[Catch:{ JSONException -> 0x0244 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0232 A[Catch:{ JSONException -> 0x0244 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m257296r() {
        /*
        // Method dump skipped, instructions count: 600
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.C65638g.m257296r():void");
    }

    /* renamed from: p */
    private void m257294p() {
        boolean z;
        String str;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        boolean z2;
        int i;
        C65613c e;
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        this.f165254g.setIntOption(325, 0);
        this.f165254g.setIntOption(36, this.ah);
        this.f165254g.setIntOption(SmEvents.EVENT_NO, 5000);
        if (this.bx == 1) {
            this.f165254g.setIntOption(52, 1);
        }
        this.f165254g.setIntOption(64, 0);
        this.f165254g.setIntOption(220, this.bw);
        this.f165254g.setIntOption(94, 1);
        this.f165249b.f165316J = this.bw;
        m257295q();
        m257296r();
        this.f165254g.setIntOption(56, this.f175465ai);
        this.f165254g.setIntOption(640, this.aI);
        this.f165254g.setIntOption(641, 1);
        if (this.bk == 1) {
            this.f165254g.setIntOption(197, 0);
            this.f165254g.setIntOption(82, 0);
        }
        this.f165249b.f165323Q = this.aE;
        this.f165249b.f165322P = this.f165268u;
        this.f165249b.f165321O = this.f165267t;
        this.f165249b.f165324R = this.f165273z;
        this.f165249b.f165332Z = this.f165269v;
        int i2 = this.as;
        if (i2 == 1) {
            this.f165254g.setIntOption(189, i2);
            C65654a aVar = this.f165249b;
            if (aVar != null) {
                aVar.mo229750i();
            }
        }
        String str2 = null;
        if (this.f165253f.mo229591g() == 2) {
            str2 = this.f165253f.mo229580c(this.f165273z, this.f165226A);
        } else if (this.f165253f.mo229591g() == 1 && (e = this.f165253f.mo229586e()) != null) {
            str2 = e.mo229618a();
        }
        if (str2 != null) {
            if (str2 != null && str2.equals("h264")) {
                this.aj = this.br;
                this.at = 0;
            } else if (str2 == null || !str2.equals("bytevc1")) {
                this.aj = 0;
            } else {
                this.aj = this.bs;
                this.at = 1;
            }
            C65654a aVar2 = this.f165249b;
            if (str2 == null) {
                str2 = "";
            }
            aVar2.f165311E = str2;
        } else {
            this.aj = 0;
        }
        this.f165254g.setIntOption(59, this.aj);
        C65654a aVar3 = this.f165249b;
        if (this.aj == 1) {
            z = true;
        } else {
            z = false;
        }
        aVar3.mo229738d(z);
        if (this.aj == 1) {
            C65658c.m257426b("VideoLiveManager", "enable hardware decode");
            if (this.at != -1) {
                this.f165254g.setIntOption(181, this.au);
                this.f165254g.setIntOption(182, this.at);
                this.f165249b.f165309C = this.au;
                this.f165249b.f165310D = this.at;
            }
        }
        int i3 = this.an;
        if (!(i3 == -1 || this.bs == 1)) {
            this.f165254g.setIntOption(67, i3);
        }
        int i4 = this.ap;
        if (i4 != -1) {
            this.f165254g.setIntOption(81, i4);
        }
        float f = this.ax;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            this.f165254g.setFloatOption(80, f);
            this.f165249b.f165338f = this.ax;
        }
        if (this.f165261n == -1 && this.f165262o != null) {
            String str3 = System.currentTimeMillis() + "";
            this.aB = str3;
            this.f165254g.setStringOption(17, str3);
            this.f165254g.setIntOption(14, 1);
            this.f165254g.setCacheFile(this.f165262o, 1);
        }
        int i5 = this.av;
        if (i5 != -1) {
            this.f165254g.setIntOption(84, i5);
            this.f165249b.f165336d = true;
        }
        if (this.av == 0 && (i = this.aw) != 0) {
            this.f165254g.setIntOption(15, i);
            this.f165249b.f165337e = this.aw;
        }
        if (this.f165271x && !TextUtils.isEmpty(this.aP) && (z2 = this.f165260m)) {
            this.f165254g.setLooping(z2);
        }
        int i6 = this.ao;
        if (i6 != -1) {
            this.f165254g.setIntOption(86, i6);
        }
        int i7 = this.ay;
        if (i7 != -1) {
            this.f165254g.setIntOption(190, i7);
            this.f165249b.f165339g = this.ay;
        }
        float f2 = this.az;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            this.f165254g.setFloatOption(191, f2);
            this.f165249b.f165340h = this.az;
        }
        int i8 = this.bt;
        if (i8 != -1) {
            this.f165254g.setIntOption(198, i8);
            this.f165249b.f165313G = this.bt;
        }
        int i9 = this.bu;
        if (i9 != 0) {
            this.f165254g.setIntOption(87, i9);
            this.f165249b.f165314H = this.bu;
        }
        long j = this.bz;
        if (j > 0) {
            this.f165254g.setLongOption(309, j);
            this.f165249b.f165343k = this.bz;
        }
        int i10 = this.bA;
        if (i10 == 1) {
            this.f165254g.setIntOption(310, i10);
            this.f165249b.f165344l = this.bA;
        }
        int i11 = this.f165236O;
        if (i11 == 1) {
            this.f165254g.setIntOption(311, i11);
            this.f165249b.f165345m = this.f165236O;
        }
        int i12 = this.bB;
        if (i12 == 1) {
            this.f165254g.setIntOption(313, i12);
            this.f165249b.f165346n = this.bB;
        }
        int i13 = this.bv;
        if (i13 == 1) {
            this.f165254g.setIntOption(132, i13);
        }
        this.f165249b.f165312F = this.bq;
        if (this.bn == 1) {
            this.f165249b.mo229745g();
        }
        if (this.aa == 1) {
            this.f165249b.f165354v = (int) C65607b.m257152a().mo229547a(JosStatusCodes.RTN_CODE_PARAMS_ERROR);
            this.f165249b.f165355w = (int) C65607b.m257152a().mo229547a(8101);
            this.f165249b.f165358z = C65607b.m257152a().mo229554b(11);
            this.f165249b.f165307A = (int) C65607b.m257152a().mo229547a(8102);
            C65607b.m257152a().mo229552a(new C65648g(this));
            if (!this.ac && C65607b.m257152a().mo229547a(8102) == 1) {
                long a = C65607b.m257152a().mo229547a(7218);
                if (a != -1) {
                    if (this.f165254g.setLongOption(ParticipantRepo.f117150c, a) == 0) {
                        z3 = true;
                    }
                    this.ac = z3;
                }
                C65658c.m257426b("VideoLiveManager", "get mdl proto ret:" + a + ", register ret:" + this.ac);
            }
        }
        long j2 = this.aQ;
        if (j2 != -1) {
            this.f165254g.setLongOption(231, j2);
            this.f165254g.setIntOption(223, 1);
        }
        String str4 = this.f165227B;
        if (str4 != null) {
            this.f165254g.setStringOption(315, str4);
        }
        String str5 = this.f165227B;
        if (str5 != null && str5.equals("avph")) {
            this.f165254g.setIntOption(159, this.aX);
            this.f165254g.setIntOption(326, this.aY);
            this.f165254g.setIntOption(327, this.aZ);
            this.f165254g.setIntOption(328, this.ba);
            this.f165254g.setIntOption(329, this.bb);
            this.f165254g.setIntOption(330, this.bc);
            this.f165254g.setIntOption(331, this.bd);
            this.f165254g.setIntOption(332, this.be);
        }
        this.f165254g.setIntOption(323, this.bf);
        if (this.bf == 1) {
            this.f165254g.setIntOption(321, f165223D);
            this.f165254g.setIntOption(322, f165222C);
        }
        this.f165254g.setIntOption(360, this.bi);
        if (this.bi == 1) {
            this.f165254g.setIntOption(362, f165224F);
            this.f165254g.setLongOption(364, -1);
            this.f165254g.setLongOption(365, -1);
        }
        this.f165254g.setIntOption(361, this.bj);
        if (this.bj == 1) {
            this.f165254g.setIntOption(363, f165225G);
            this.f165254g.setLongOption(366, -1);
            this.f165254g.setLongOption(367, -1);
        }
        int i14 = this.bC;
        if (i14 == 1 && (mediaPlayer3 = this.f165254g) != null) {
            mediaPlayer3.setIntOption(316, i14);
            sb.append("live_enable_tcp_fast_open:1,");
        }
        int i15 = this.aH;
        if (i15 == 1 && (mediaPlayer2 = this.f165254g) != null) {
            mediaPlayer2.setIntOption(611, i15);
        }
        MediaPlayer mediaPlayer4 = this.f165254g;
        if (mediaPlayer4 != null) {
            mediaPlayer4.setIntOption(642, this.aG);
        }
        int i16 = this.bD;
        if (i16 == 1 && (mediaPlayer = this.f165254g) != null) {
            mediaPlayer.setIntOption(317, i16);
            sb.append("live_enable_check_packet_corrupt:1,");
        }
        if (this.bL == 1) {
            sb.append("live_enable_flv_abr:1,");
        }
        this.f165249b.f165317K = this.bF;
        C65654a aVar4 = this.f165249b;
        if (sb.length() == 0) {
            str = "none";
        } else {
            str = sb.deleteCharAt(sb.length() - 1).toString();
        }
        aVar4.f165320N = str;
    }

    /* renamed from: a */
    public static C65642a m257283a(Context context) {
        return new C65642a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$c */
    public static final class C65644c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        private final WeakReference<C65638g> f165298a;

        public C65644c(C65638g gVar) {
            this.f165298a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            C65658c.m257425a("VideoLiveManager", "player complete");
            C65638g gVar = this.f165298a.get();
            if (gVar != null && gVar.f165254g != null) {
                C65658c.m257426b("VideoLiveManager", "onCompletion");
                gVar.f165250c.mo142878d();
                if (!gVar.f165271x) {
                    if (gVar.f165270w && gVar.f165253f.mo229591g() == 2 && gVar.mo229672a(-100009)) {
                        return;
                    }
                    if (gVar.f165253f.mo229591g() == 1 && gVar.mo229674b(-100009)) {
                        return;
                    }
                    if (gVar.f165261n == 1) {
                        gVar.f165250c.mo142880i();
                        gVar.f165263p = true;
                        if (gVar.f165260m && !TextUtils.isEmpty(gVar.f165262o)) {
                            gVar.mo229675c(gVar.f165262o);
                            gVar.mo229671a(true);
                            gVar.mo229678d(gVar.f165262o);
                            return;
                        }
                        return;
                    }
                    gVar.f165252e.mo229654a(new LiveError(-100009, "live stream dry up, push stream may occur error", new HashMap()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$d */
    public static final class C65645d implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        private final WeakReference<C65638g> f165299a;

        public C65645d(C65638g gVar) {
            this.f165299a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C65638g gVar = this.f165299a.get();
            if (!(gVar == null || gVar.f165254g == null)) {
                if (i != 0) {
                    gVar.f165249b.mo229736d(i);
                }
                gVar.f165250c.mo142869a(new LiveError(i, "player on error", null));
                if (gVar.f165271x) {
                    return true;
                }
                if (gVar.f165232K == 1 && gVar.mo229676c(i)) {
                    return true;
                }
                if (gVar.f165270w && gVar.f165253f.mo229591g() == 2 && gVar.mo229672a(i)) {
                    return true;
                }
                if (gVar.f165253f.mo229591g() == 1 && gVar.mo229674b(i)) {
                    return true;
                }
                C65658c.m257427c("VideoLiveManager", "onError " + i);
                HashMap hashMap = new HashMap();
                hashMap.put("internalCode", Integer.valueOf(i));
                hashMap.put("internalExtra", Integer.valueOf(i2));
                hashMap.put("playerType", Integer.valueOf(mediaPlayer.getPlayerType()));
                gVar.f165252e.mo229654a(new LiveError(-100003, "player on error", hashMap));
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$e */
    public static final class C65646e implements MediaPlayer.OnExternInfoListener {

        /* renamed from: a */
        private final WeakReference<C65638g> f165300a;

        public C65646e(C65638g gVar) {
            this.f165300a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnExternInfoListener
        public void onExternInfo(MediaPlayer mediaPlayer, int i, String str) {
            C65658c.m257426b("VideoLiveManager", "onExternInfo, what:" + i + ",message:" + str);
            C65638g gVar = this.f165300a.get();
            if (gVar != null && gVar.f165254g != null) {
                if (19 == i) {
                    if (gVar.f165233L && !gVar.f165234M) {
                        gVar.f165234M = true;
                        gVar.f165248a.sendEmptyMessageDelayed(SmEvents.EVENT_NO, 3000);
                    }
                    gVar.f165235N = System.currentTimeMillis();
                    if (str.startsWith("JSON")) {
                        str = str.substring(4);
                        C65658c.m257426b("VideoLiveManager", "new sei:" + str);
                    }
                    gVar.f165249b.mo229741e(str);
                    gVar.f165250c.mo142875b(str);
                } else if (33 == i) {
                    C65658c.m257426b("VideoLiveManager", "recved spspps:" + str);
                    gVar.f165249b.mo229744f(str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$f */
    public static final class C65647f implements MediaPlayer.OnInfoListener {

        /* renamed from: a */
        private final WeakReference<C65638g> f165301a;

        public C65647f(C65638g gVar) {
            this.f165301a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C65638g gVar = this.f165301a.get();
            if (!(gVar == null || gVar.f165254g == null)) {
                if (i != 3) {
                    if (i == 251658247) {
                        Log.d("VideoLiveManager", "speed changed:" + i2);
                        C65654a aVar = gVar.f165249b;
                        aVar.f165341i = aVar.f165341i + 1;
                        StringBuilder sb = new StringBuilder();
                        C65654a aVar2 = gVar.f165249b;
                        sb.append(aVar2.f165342j);
                        sb.append(",");
                        sb.append(((double) i2) / 1000.0d);
                        sb.append(":");
                        sb.append(System.currentTimeMillis());
                        aVar2.f165342j = sb.toString();
                    } else if (i == 701) {
                        Log.d("VideoLiveManager", "MEDIA_INFO_BUFFERING_START");
                        gVar.f165265r++;
                        gVar.mo229688n();
                        gVar.f165266s = true;
                        gVar.f165250c.mo142873b();
                        if (!gVar.f165258k) {
                            gVar.f165229H = System.currentTimeMillis();
                            gVar.f165249b.mo229707a(i2, false);
                        } else {
                            gVar.f165249b.mo229707a(i2, true);
                            C65607b.m257152a().mo229550a(7213, gVar.f165249b.f165347o, i2);
                        }
                        if ((!gVar.f165267t || !gVar.f165268u.equals("rad") || gVar.f165253f.mo229591g() != 2 || gVar.f165265r < gVar.f165269v || !gVar.mo229686l()) && !gVar.f165271x && !gVar.f165267t) {
                            if (gVar.f165254g.getLongOption(530, -1) == 0 && gVar.f165254g.getLongOption(531, -1) == 0) {
                                gVar.f165239R = true;
                            }
                            gVar.f165252e.mo229656a(true, gVar.f165239R);
                        }
                    } else if (i != 702) {
                        switch (i) {
                            case -268435442:
                                Log.d("VideoLiveManager", "MEDIA_INFO_VIDEO_DEMUX_STALL");
                                gVar.f165249b.mo229709a((long) i2, C65638g.f165224F, true);
                                break;
                            case -268435441:
                                Log.d("VideoLiveManager", "MEDIA_INFO_AUDIO_DEMUX_STALL");
                                gVar.f165249b.mo229709a((long) i2, C65638g.f165224F, false);
                                break;
                            case -268435440:
                                Log.d("VideoLiveManager", "MEDIA_INFO_VIDEO_DECODE_STALL");
                                gVar.f165249b.mo229724b((long) i2, C65638g.f165225G, true);
                                break;
                            case -268435439:
                                Log.d("VideoLiveManager", "MEDIA_INFO_AUDIO_DECODE_STALL");
                                gVar.f165249b.mo229724b((long) i2, C65638g.f165225G, false);
                                break;
                            default:
                                switch (i) {
                                    case 251658249:
                                        Log.d("VideoLiveManager", "abr switch:" + i2);
                                        int i3 = i2 / 1000;
                                        long j = (long) i3;
                                        String a = gVar.f165253f.mo229566a(j, gVar.f165226A);
                                        if (!gVar.f165273z.equals(a)) {
                                            if (a != null) {
                                                gVar.f165249b.f165331Y = "abr_" + gVar.f165273z + "_to_" + a;
                                                gVar.f165273z = a;
                                            } else {
                                                gVar.f165249b.f165331Y = "none";
                                            }
                                            gVar.f165249b.f165326T++;
                                            StringBuilder sb2 = new StringBuilder();
                                            C65654a aVar3 = gVar.f165249b;
                                            sb2.append(aVar3.f165327U);
                                            sb2.append(",");
                                            sb2.append(i3);
                                            sb2.append(":");
                                            sb2.append(System.currentTimeMillis());
                                            aVar3.f165327U = sb2.toString();
                                            gVar.f165249b.f165328V = (gVar.f165254g.getIntOption(63, 0) * 8) / 1000;
                                            gVar.f165249b.f165329W = gVar.f165254g.getIntOption(73, 0);
                                            gVar.f165249b.f165330X = gVar.f165254g.getIntOption(72, 0);
                                            gVar.f165250c.mo142870a(a);
                                            gVar.f165249b.mo229712a(j, a, true);
                                            break;
                                        }
                                        break;
                                    case 251658250:
                                        Log.d("VideoLiveManager", "MEDIA_INFO_AUDIO_RENDER_STALL");
                                        gVar.f165250c.mo142874b(i2);
                                        gVar.f165249b.mo229710a((long) i2, C65638g.f165223D, false, true);
                                        break;
                                    case 251658251:
                                        Log.d("VideoLiveManager", "MEDIA_INFO_VIDEO_RENDER_STALL");
                                        gVar.f165250c.mo142866a(i2);
                                        gVar.f165249b.mo229710a((long) i2, C65638g.f165222C, true, true);
                                        break;
                                    case 251658252:
                                        gVar.f165249b.mo229723b(gVar.f165254g.getLongOption(628, -1));
                                        if (gVar.f165254g.getIntOption(62, -1) == 0) {
                                            Log.d("VideoLiveManager", "pure audio");
                                            break;
                                        }
                                        break;
                                    case 251658253:
                                        gVar.f165249b.f165348p++;
                                        break;
                                }
                        }
                    } else {
                        Log.d("VideoLiveManager", "MEDIA_INFO_BUFFERING_END");
                        gVar.f165266s = false;
                        gVar.f165250c.mo142876c();
                        if (!gVar.f165267t) {
                            gVar.f165252e.mo229656a(false, gVar.f165239R);
                        }
                        if (gVar.f165258k && gVar.f165249b.mo229753j()) {
                            gVar.f165249b.mo229718a(false);
                        } else if (!gVar.f165258k && gVar.f165229H != 0) {
                            gVar.f165230I = System.currentTimeMillis() - gVar.f165229H;
                        }
                        C65607b.m257152a().mo229550a(7214, gVar.f165249b.f165347o, i2);
                    }
                }
                Log.d("VideoLiveManager", "MEDIA_INFO_VIDEO_RENDERING_START");
                String stringOption = gVar.f165254g.getStringOption(142);
                Log.d("VideoLiveManager", "meta Data:" + stringOption);
                gVar.f165249b.mo229737d(stringOption);
                int intOption = gVar.f165254g.getIntOption(SmActions.ACTION_IDLE_ENTRY, -1);
                if (intOption == 0) {
                    gVar.f165249b.mo229759m("h264");
                } else if (intOption == 1) {
                    gVar.f165249b.mo229759m("bytevc1");
                }
                gVar.f165249b.f165335c = gVar.mo229677d(gVar.f165254g.getIntOption(157, -1));
                gVar.f165249b.mo229736d(0);
                gVar.f165266s = false;
                String stringOption2 = gVar.f165254g.getStringOption(71);
                if (gVar.f165264q != null && gVar.f165264q.startsWith("[") && stringOption2 != null && !stringOption2.startsWith("[")) {
                    stringOption2 = String.format("[%s]", stringOption2);
                }
                if (stringOption2 != null && !stringOption2.equals(gVar.f165264q)) {
                    gVar.f165249b.mo229717a(stringOption2, true);
                    gVar.f165264q = stringOption2;
                }
                if (!gVar.f165258k) {
                    gVar.f165249b.mo229711a(0L, gVar.f165230I);
                    gVar.f165249b.mo229703a();
                    gVar.f165258k = true;
                    gVar.f165250c.mo142872a(true);
                    C65607b.m257152a().mo229550a(8015, gVar.f165249b.f165347o, -1);
                    if (gVar.f165249b.mo229755k()) {
                        C65607b.m257152a().mo229550a(8016, gVar.f165249b.f165347o, -1);
                    }
                } else {
                    gVar.f165250c.mo142872a(false);
                    if (gVar.f165238Q) {
                        gVar.f165238Q = false;
                        gVar.f165249b.f165328V = (gVar.f165254g.getIntOption(63, 0) * 8) / 1000;
                        gVar.f165249b.f165329W = gVar.f165254g.getIntOption(73, 0);
                        gVar.f165249b.f165330X = gVar.f165254g.getIntOption(72, 0);
                        gVar.f165250c.mo142870a(gVar.f165272y);
                        gVar.f165249b.mo229712a(gVar.f165253f.mo229589f(gVar.f165272y, gVar.f165226A), gVar.f165272y, false);
                    } else {
                        gVar.f165249b.mo229730c(0);
                        if (gVar.f165249b.mo229753j()) {
                            gVar.f165250c.mo142876c();
                            gVar.f165249b.mo229718a(true);
                        }
                        Log.d("VideoLiveManager", "render stall time (from retry to render new first frame again)");
                        gVar.mo229687m();
                    }
                    if (gVar.f165249b.mo229762o()) {
                        gVar.f165249b.mo229763p();
                    }
                    Log.d("VideoLiveManager", "render stall time (from retry to render new first frame again)");
                    gVar.mo229687m();
                }
                gVar.f165228E = false;
                gVar.f165252e.mo229659d();
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$g */
    public static final class C65648g implements AbstractC65606a {

        /* renamed from: a */
        private final WeakReference<C65638g> f165302a;

        public C65648g(C65638g gVar) {
            this.f165302a = new WeakReference<>(gVar);
        }

        @Override // com.ss.videoarch.liveplayer.p3250a.AbstractC65606a
        /* renamed from: a */
        public long mo229544a(int i, long j) {
            C65638g gVar = this.f165302a.get();
            if (gVar == null || gVar.f165254g == null || i != 0) {
                return j;
            }
            return gVar.f165249b.mo229702a(i, j);
        }

        @Override // com.ss.videoarch.liveplayer.p3250a.AbstractC65606a
        /* renamed from: b */
        public void mo229546b(int i, String str) {
            C65638g gVar = this.f165302a.get();
            if (gVar != null && gVar.f165254g != null) {
                gVar.f165249b.mo229722b(i, str);
            }
        }

        @Override // com.ss.videoarch.liveplayer.p3250a.AbstractC65606a
        /* renamed from: a */
        public void mo229545a(int i, String str) {
            C65638g gVar = this.f165302a.get();
            if (gVar != null && gVar.f165254g != null) {
                gVar.f165249b.mo229731c(i, str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$h */
    public static class C65649h implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a */
        private final WeakReference<C65638g> f165303a;

        public C65649h(C65638g gVar) {
            this.f165303a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            C65638g gVar = this.f165303a.get();
            if (gVar != null && gVar.f165254g != null && gVar.f165250c != null) {
                gVar.f165250c.mo142867a(i, i2);
                gVar.f165249b.mo229705a(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.g$i */
    public static final class C65650i implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        private final WeakReference<C65638g> f165304a;

        public C65650i(C65638g gVar) {
            this.f165304a = new WeakReference<>(gVar);
        }

        @Override // com.ss.ttm.player.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C65638g gVar = this.f165304a.get();
            if (gVar != null && gVar.f165256i == EnumC65653l.PREPARING && gVar.f165254g != null) {
                Log.d("VideoLiveManager", "preparing:" + gVar.f165256i);
                gVar.f165249b.mo229739e();
                gVar.f165256i = EnumC65653l.PREPARED;
                if (gVar.f165236O == 0) {
                    Log.d("VideoLiveManager", "prepared:");
                    gVar.f165254g.start();
                }
                gVar.f165250c.mo142879e();
            }
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: a */
    public void mo229559a(Boolean bool) {
        this.f165245X.mo229650a(bool.booleanValue());
    }

    /* renamed from: g */
    private void m257291g(String str) {
        C65658c.m257426b("VideoLiveManager", "_reset");
        mo229680f();
        mo229682h();
        m257290f(str);
        this.aR = -1;
        this.ad = EnumC65643b.IDLE;
    }

    /* renamed from: h */
    private void m257292h(String str) {
        C65654a aVar;
        if (this.bF == 1 && Looper.myLooper() != Looper.getMainLooper() && (aVar = this.f165249b) != null) {
            aVar.mo229751i(str);
        }
    }

    /* renamed from: a */
    public void mo229669a(Runnable runnable) {
        this.f165248a.postAtFrontOfQueue(runnable);
    }

    /* renamed from: c */
    public void mo229675c(String str) {
        m257292h("setLocalURL");
        if (!(str == null || str.equals(this.aP) || this.aP == null)) {
            mo229681g();
        }
        this.aP = str;
        this.f165271x = true;
    }

    /* renamed from: c */
    public boolean mo229676c(int i) {
        String replaceAll;
        String str = this.aC;
        if (str == null || !str.startsWith("httpk") || (replaceAll = this.aC.replaceAll("httpk", "http").replaceAll(":(\\d+)/", "/")) == null) {
            return false;
        }
        this.f165249b.mo229732c(replaceAll);
        this.f165249b.mo229716a(this.aC, replaceAll, "httpk_to_http", i);
        this.aC = replaceAll;
        mo229680f();
        mo229682h();
        mo229678d(this.aC);
        return true;
    }

    /* renamed from: e */
    private void m257289e(String str) {
        if (this.f165256i == EnumC65653l.PREPARED && this.f165254g != null) {
            C65658c.m257426b("VideoLiveManager", "_play resume");
            String str2 = this.f165264q;
            if (str2 != null) {
                this.f165249b.mo229717a(str2, false);
            }
            this.f165254g.start();
        } else if (this.f165256i == EnumC65653l.IDLE || this.f165254g == null) {
            C65658c.m257426b("VideoLiveManager", "_play start");
            m257299u();
            this.f165256i = EnumC65653l.INITIALIZED;
            if (!this.f165271x || TextUtils.isEmpty(this.aP)) {
                mo229678d(str);
            } else {
                this.f165249b.mo229735d();
                mo229670a(this.aP, null, null, null);
            }
        } else {
            m257294p();
            if (!this.f165271x || TextUtils.isEmpty(this.aP)) {
                mo229678d(str);
            } else {
                mo229670a(this.aP, null, null, null);
            }
        }
        this.f165257j = false;
    }

    /* renamed from: b */
    public boolean mo229674b(int i) {
        String str;
        boolean z = false;
        if (this.bl != 2 || (str = this.f165253f.mo229587e("h264").f165157a) == null) {
            return false;
        }
        this.f165249b.mo229732c(str);
        this.f165249b.mo229716a(this.aC, str, "bytevc1_to_h264", i);
        this.aC = str;
        this.bl = 1;
        this.f165249b.f165311E = "h264";
        if (this.aj != 1 && this.br == 1) {
            this.aj = 1;
            this.at = 0;
            this.f165254g.setIntOption(59, 1);
            C65654a aVar = this.f165249b;
            if (this.aj == 1) {
                z = true;
            }
            aVar.mo229738d(z);
        }
        mo229682h();
        mo229678d(str);
        return true;
    }

    /* renamed from: f */
    private void m257290f(String str) {
        C65658c.m257426b("VideoLiveManager", "_stopLiveManager");
        C65623c cVar = this.f165255h;
        if (cVar != null) {
            cVar.mo229641a();
        }
        C65615a aVar = this.f165251d;
        if (aVar != null) {
            aVar.mo229620a();
        }
        if (this.ad == EnumC65643b.PLAYED) {
            Log.d("VideoLiveManager", "check render stall when play stop");
            mo229687m();
            this.f165249b.mo229714a(str);
        }
        this.f165249b.mo229742f();
        this.f165252e.mo229659d();
        if (str.equals("reset")) {
            this.f165253f.mo229594h();
        }
        this.f165258k = false;
        this.f165229H = 0;
        this.f165230I = 0;
        this.f165265r = 0;
        this.f165257j = true;
        this.ad = EnumC65643b.STOPPED;
        this.f165234M = false;
        this.f165235N = 0;
        this.f165266s = false;
        this.f165228E = false;
        this.f165259l = false;
        this.bO = -1;
        this.aI = 0;
        this.aJ = 0;
        this.f165239R = false;
        this.aA = 0;
        this.av = -1;
        this.aU = "";
        this.bI = false;
        this.f165227B = "flv";
        this.aT = "tcp";
        this.aS = "none";
        this.aG = 1;
        this.bJ = false;
        this.f165248a.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65610b
    /* renamed from: b */
    public boolean mo229563b(String str) {
        String str2;
        C65658c.m257426b("VideoLiveManager", "playResolution:" + str);
        m257292h("playResolution");
        if (this.f165253f.mo229591g() != 2 || this.f165256i != EnumC65653l.PREPARED) {
            return false;
        }
        if (this.f165272y.equals(str)) {
            C65658c.m257426b("VideoLiveManager", "playResolution: same res=" + str);
            return true;
        }
        this.f165252e.mo229659d();
        this.aR = -1;
        this.f165265r = 0;
        if (!str.equals("auto")) {
            this.f165267t = false;
        } else {
            this.f165267t = true;
        }
        if (this.f165268u.equals("abr_bb_4live") || (this.f165268u.equals("rad") && !this.f165273z.equals(str) && !str.equals("auto"))) {
            C65654a aVar = this.f165249b;
            aVar.f165331Y = "manual_abr_" + this.f165273z + "_to_" + str;
            if (!str.equals("auto")) {
                this.f165273z = str;
            }
            str2 = this.f165253f.mo229568a(this.f165273z, this.f165227B, this.f165226A);
            mo229680f();
            mo229682h();
            this.f165249b.mo229732c(str2);
            this.f165238Q = true;
            mo229678d(str2);
        } else {
            str2 = "none";
        }
        C65654a aVar2 = this.f165249b;
        String str3 = this.aC;
        aVar2.mo229716a(str3, str2, "setting_" + this.f165272y + "_to_" + str, 0);
        this.f165272y = str;
        return true;
    }

    private C65638g(C65642a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC65652k() {
            /* class com.ss.videoarch.liveplayer.C65638g.C656391 */
        });
        this.f165240S = threadPoolExecutor;
        this.f165248a = new Handler(Looper.myLooper());
        this.f165253f = new C65611a();
        this.aa = 0;
        this.ab = 0;
        this.ac = false;
        this.f165256i = EnumC65653l.IDLE;
        this.ad = EnumC65643b.IDLE;
        this.f165257j = false;
        this.f165258k = false;
        this.f165259l = false;
        this.f165260m = false;
        this.ae = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.f175465ai = 3;
        this.aj = 0;
        this.f165261n = -1;
        this.ak = -1;
        this.al = -1;
        this.am = -1;
        this.an = 1;
        this.ao = -1;
        this.ap = -1;
        this.aq = -1;
        this.ar = 0;
        this.as = 0;
        this.at = -1;
        this.au = 0;
        this.av = -1;
        this.aw = 0;
        this.ax = -1.0f;
        this.ay = -1;
        this.az = -1.0f;
        this.aA = -1;
        this.f165262o = null;
        this.aB = null;
        this.f165263p = false;
        this.aC = null;
        this.f165264q = null;
        this.f165265r = 0;
        this.f165266s = false;
        this.f165267t = false;
        this.aD = false;
        this.f165268u = "rad";
        this.aE = false;
        this.aF = -1;
        this.f165269v = 4;
        this.f165270w = true;
        this.aG = 1;
        this.aH = 0;
        this.aI = 0;
        this.aJ = 0;
        this.aK = 10000;
        this.aL = -1;
        this.aM = -1;
        this.aN = null;
        this.aO = null;
        this.aP = null;
        this.f165271x = false;
        this.aQ = -1;
        this.f165272y = "none";
        this.f165273z = "origin";
        this.aR = -1;
        this.f165226A = "main";
        this.f165227B = "flv";
        this.aS = "none";
        this.aT = "tcp";
        this.aU = "";
        this.aV = "";
        this.aW = "";
        this.aX = 15;
        this.aY = 4096;
        this.aZ = 100000;
        this.ba = 4096;
        this.bb = 100000;
        this.bc = 1;
        this.bd = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        this.be = 0;
        this.bf = 1;
        this.bg = -1;
        this.bh = -1;
        this.f165228E = false;
        this.bi = 1;
        this.bj = 1;
        this.bk = 0;
        this.bl = 1;
        this.bm = null;
        this.f165229H = 0;
        this.f165230I = 0;
        this.f165231J = 0;
        this.bn = 0;
        this.bo = true;
        this.bp = true;
        this.bq = false;
        this.br = 0;
        this.bs = 0;
        this.bt = -1;
        this.bu = 0;
        this.bv = 1;
        this.f165232K = 0;
        this.bw = 1;
        this.bx = 1;
        this.by = 8000;
        this.f165233L = false;
        this.f165234M = false;
        this.f165235N = 0;
        this.bz = 0;
        this.bA = 0;
        this.f165236O = 0;
        this.bB = 0;
        this.bC = 0;
        this.bD = 0;
        this.bF = 1;
        this.bG = false;
        this.bH = false;
        this.bI = false;
        this.bJ = false;
        this.bK = false;
        this.bL = 0;
        this.bM = false;
        this.bN = null;
        this.f165237P = false;
        this.bO = -1;
        this.f165238Q = false;
        this.f165239R = false;
        Context context = aVar.f165281a;
        this.f165241T = context;
        AbstractC65605a aVar2 = aVar.f165282b;
        this.f165250c = aVar2;
        this.f165243V = aVar.f165285e;
        C65654a aVar3 = new C65654a(this, aVar2, aVar.f165295o, context);
        this.f165249b = aVar3;
        aVar3.mo229752j(aVar.f165283c);
        C65607b.m257152a().mo229553a(this.f165249b);
        this.f165252e = new C65634a(new C65651j(this), aVar.f165288h, aVar.f165294n, this.f165249b);
        this.f165245X = new C65632b(context, null);
        boolean z = aVar.f165286f;
        this.bM = z;
        this.f165249b.f165308B = z;
        AbstractC65627d dVar = aVar.f165284d;
        this.f165242U = dVar;
        C65615a aVar4 = new C65615a(context, threadPoolExecutor, dVar);
        this.f165251d = aVar4;
        aVar4.mo229625b();
        this.f165244W = aVar.f165289i;
        this.f165227B = aVar.f165291k;
        this.f165273z = aVar.f165290j;
        this.f165265r = 0;
        this.f165267t = aVar.f165292l;
        this.f165270w = aVar.f165293m;
        this.by = aVar.f165296p;
    }

    /* renamed from: a */
    private void m257287a(C65657b bVar) {
        String stringOption = this.f165254g.getStringOption(335);
        if (stringOption != null) {
            String[] split = stringOption.split("\r\n");
            for (String str : split) {
                if (str.startsWith("X-Server-Ip: ")) {
                    bVar.am = str.split(": ", 2)[1];
                } else if (str.startsWith("Via: ")) {
                    bVar.an = str.split(": ", 2)[1];
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r7.equals("tls") == false) goto L_0x0032;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo229678d(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.C65638g.mo229678d(java.lang.String):void");
    }

    /* renamed from: a */
    private String m257284a(String str, long j) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.bE)) {
            return null;
        }
        String str2 = this.bE + "." + j;
        this.f165249b.f165347o = str2;
        return m257285a(str, "_session_id", str2);
    }

    /* renamed from: a */
    private void m257288a(boolean z, String str) {
        C65658c.m257426b("VideoLiveManager", "_stop");
        if (this.ad != EnumC65643b.PLAYED) {
            this.f165249b.mo229748h(str);
            return;
        }
        if (z) {
            mo229680f();
        } else {
            this.f165256i = EnumC65653l.INITIALIZED;
        }
        m257290f(str);
        this.ad = EnumC65643b.STOPPED;
    }

    /* renamed from: a */
    public long mo229665a(int i, long j) {
        MediaPlayer mediaPlayer;
        if (i == 0) {
            MediaPlayer mediaPlayer2 = this.f165254g;
            if (mediaPlayer2 != null) {
                return (mediaPlayer2.getLongOption(63, 0) * 8) / 1000;
            }
            return j;
        } else if (i == 68 && (mediaPlayer = this.f165254g) != null) {
            return (mediaPlayer.getLongOption(63, 0) * 8) / 1000;
        } else {
            return j;
        }
    }

    /* renamed from: a */
    public void mo229667a(int i, long j, long j2) {
        this.aL = j;
    }

    /* renamed from: b */
    public void mo229673b(int i, long j, long j2) {
        if (i == 1 && this.aI == 1) {
            if (this.f165249b.ad < 0) {
                this.f165249b.ad = j;
                this.f165249b.ae = this.aL;
            } else {
                long j3 = this.aM;
                if (j < j3) {
                    this.f165249b.mo229725b(j3, j);
                }
            }
            this.aM = j;
        }
    }

    /* renamed from: a */
    private String m257285a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str4 = str2 + ContainerUtils.KEY_VALUE_DELIMITER + str3;
        int indexOf = str.indexOf("?");
        if (indexOf == -1) {
            str4 = "?" + str4;
        } else if (indexOf != str.length() - 1) {
            str4 = ContainerUtils.FIELD_DELIMITER + str4;
        }
        return str + str4;
    }

    /* renamed from: a */
    private Map<String, String> m257286a(String str, String str2, long j) {
        C65658c.m257426b("VideoLiveManager", "open mdl:" + this.aa);
        if (this.aa == 1) {
            C65658c.m257426b("VideoLiveManager", "mdl isRunning:" + C65607b.m257152a().mo229555b());
        }
        if (this.aa != 1 || C65607b.m257152a().mo229547a(JosStatusCodes.RTN_CODE_PARAMS_ERROR) != 1 || !C65607b.m257152a().mo229555b()) {
            return null;
        }
        if (this.aQ != -1) {
            C65607b.m257152a().mo229549a(59, this.aQ);
        }
        String a = C65607b.m257152a().mo229548a(str, Boolean.valueOf(this.ac));
        C65658c.m257426b("VideoLiveManager", "proxyUrl: " + a);
        if (a == null || a.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Stream-Type", "live");
        hashMap.put("MDL-ProxyURL", a);
        if (this.bE != null) {
            hashMap.put("X-Tt-Traceid", this.bE + "." + j);
        }
        if (str2 != null && !str2.equals("none")) {
            if (str2.startsWith("[")) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            hashMap.put("X-Given-IPs", str2);
        }
        return hashMap;
    }
}
