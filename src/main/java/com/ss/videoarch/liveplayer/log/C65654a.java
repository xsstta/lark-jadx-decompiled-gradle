package com.ss.videoarch.liveplayer.log;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.videoarch.liveplayer.AbstractC65605a;
import com.ss.videoarch.liveplayer.C65638g;
import com.ss.videoarch.liveplayer.p3250a.C65607b;
import com.ss.videoarch.liveplayer.p3252c.C65624d;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.net.ntp.C69943a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.log.a */
public class C65654a implements Handler.Callback {
    private static final String ag = "com.ss.videoarch.liveplayer.log.a";

    /* renamed from: A */
    public int f165307A;

    /* renamed from: B */
    public boolean f165308B;

    /* renamed from: C */
    public int f165309C;

    /* renamed from: D */
    public int f165310D = -1;

    /* renamed from: E */
    public String f165311E = "none";

    /* renamed from: F */
    public boolean f165312F;

    /* renamed from: G */
    public int f165313G = -1;

    /* renamed from: H */
    public int f165314H;

    /* renamed from: I */
    public boolean f165315I;

    /* renamed from: J */
    public int f165316J;

    /* renamed from: K */
    public int f165317K = 1;

    /* renamed from: L */
    public long f165318L;

    /* renamed from: M */
    public long f165319M;

    /* renamed from: N */
    public String f165320N = "none";

    /* renamed from: O */
    public boolean f165321O;

    /* renamed from: P */
    public String f165322P = "rad";

    /* renamed from: Q */
    public boolean f165323Q;

    /* renamed from: R */
    public String f165324R = "origin";

    /* renamed from: S */
    public int f165325S = -1;

    /* renamed from: T */
    public int f165326T;

    /* renamed from: U */
    public String f165327U = "none";

    /* renamed from: V */
    public int f165328V = -1;

    /* renamed from: W */
    public int f165329W = -1;

    /* renamed from: X */
    public int f165330X = -1;

    /* renamed from: Y */
    public String f165331Y = "none";

    /* renamed from: Z */
    public int f165332Z = 4;

    /* renamed from: a */
    public String f165333a = "none";
    private String aA = "none";
    private String aB = "none";
    private int aC = -1;
    private int aD = -1;
    private int aE = -1;
    private int aF = -1;
    private int aG = -1;
    private String aH = "none";
    private String aI = "none";
    private String aJ = "";
    private boolean aK;
    private String aL = "none";
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private String aP = "none";
    private boolean aQ;
    private String aR = "flv";
    private boolean aS;
    private long aT;
    private int aU;
    private int aV;
    private long aW;
    private long aX;
    private long aY = -1;
    private long aZ;
    public boolean aa;
    public long ab;
    public long ac;
    public long ad = -1;
    public long ae = -1;
    public long af;
    private Context ah;

    /* renamed from: ai  reason: collision with root package name */
    private Handler f175466ai;
    private AbstractC65605a aj;
    private C65657b ak;
    private C65638g al;
    private final long am;
    private boolean an;
    private String ao = "none";
    private String ap = "none";
    private String aq = "none";
    private String ar = "none";
    private boolean as;
    private String at = "none";
    private boolean au;
    private long av;
    private String aw = "none";
    private String ax = "none";
    private String ay = "none";
    private String az = "none";

    /* renamed from: b */
    public String f165334b = "none";
    private boolean bA;
    private String bB;
    private int bC;
    private int bD;
    private int bE = -1;
    private ArrayList<Long> bF;
    private ArrayList<Long> bG;
    private ArrayList<Long> bH;
    private ArrayList<Long> bI;
    private JSONObject bJ;
    private ArrayList<Integer> bK;
    private ArrayList<Integer> bL;
    private boolean bM;
    private String bN = "none";
    private String bO = "tcp";
    private String bP = "none";
    private int bQ = -1;
    private String bR = "none";
    private String bS = Build.BOARD;
    private String bT = Build.HARDWARE;
    private int bU;
    private long bV;
    private long ba;
    private long bb;
    private long bc;
    private long bd;
    private long be;
    private boolean bf;
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private int bk;
    private int bl;
    private long bm;
    private long bn;
    private int bo;
    private int bp;
    private boolean bq;
    private boolean br;
    private boolean bs;
    private long bt;
    private long bu;
    private long bv;
    private C69943a bw;
    private C65655a bx;
    private final long by = 300000;
    private long bz;

    /* renamed from: c */
    public String f165335c = "none";

    /* renamed from: d */
    public boolean f165336d;

    /* renamed from: e */
    public int f165337e = -1;

    /* renamed from: f */
    public float f165338f = -1.0f;

    /* renamed from: g */
    public int f165339g = -1;

    /* renamed from: h */
    public float f165340h = -1.0f;

    /* renamed from: i */
    public int f165341i;

    /* renamed from: j */
    public String f165342j = "none";

    /* renamed from: k */
    public long f165343k;

    /* renamed from: l */
    public int f165344l;

    /* renamed from: m */
    public int f165345m;

    /* renamed from: n */
    public int f165346n;

    /* renamed from: o */
    public String f165347o = "none";

    /* renamed from: p */
    public int f165348p = -1;

    /* renamed from: q */
    public InetAddress f165349q;

    /* renamed from: r */
    public InetAddress f165350r;

    /* renamed from: s */
    public int f165351s = -1;

    /* renamed from: t */
    public boolean f165352t;

    /* renamed from: u */
    public int f165353u;

    /* renamed from: v */
    public int f165354v;

    /* renamed from: w */
    public int f165355w;

    /* renamed from: x */
    public int f165356x;

    /* renamed from: y */
    public int f165357y = -1;

    /* renamed from: z */
    public String f165358z;

    /* renamed from: i */
    public void mo229750i() {
        this.br = true;
    }

    /* renamed from: o */
    public boolean mo229762o() {
        return this.bs;
    }

    /* renamed from: a */
    public void mo229714a(String str) {
        if (this.an) {
            this.an = false;
            this.f175466ai.removeCallbacksAndMessages(null);
            C65655a aVar = this.bx;
            if (aVar != null) {
                aVar.f165359a.removeCallbacksAndMessages(null);
            }
            this.f165352t = false;
        }
        mo229746g(str);
        mo229742f();
    }

    /* renamed from: a */
    public void mo229715a(String str, String str2) {
        mo229742f();
        this.ak.f165389a = System.currentTimeMillis();
        this.ak.ak = str2;
        this.aq = str;
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                b.put("event_key", "start_play").put("set_surface_cost", this.f165318L).put("start_play_time", this.ak.f165389a).put("suggest_format", this.bN).put("play_format", this.aR).put("origin_url", this.bR);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229719a(boolean z, boolean z2) {
        this.ak.f165390b = System.currentTimeMillis();
        this.aM = z2;
        this.aO = z;
    }

    /* renamed from: a */
    public void mo229716a(String str, String str2, String str3, int i) {
        if (this.al != null && this.aj != null) {
            try {
                JSONObject b = mo229720b();
                JSONObject put = b.put("event_key", "switch_url");
                if (str == null) {
                    str = "null";
                }
                JSONObject put2 = put.put("last_cdn_play_url", str);
                if (str2 == null) {
                    str2 = "null";
                }
                put2.put("next_cdn_play_url", str2).put("code", i).put("reason", str3);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229711a(long j, long j2) {
        C65657b bVar;
        this.aS = true;
        this.bU = this.bp;
        this.bV = this.af;
        this.aT = System.currentTimeMillis();
        if (this.al != null && this.aj != null && (bVar = this.ak) != null) {
            try {
                bVar.f165377O = System.currentTimeMillis();
                this.al.mo229668a(this.ak, 0);
                JSONObject a = m257352a(this.ak, j, this.aO, j2);
                String str = this.aR;
                if (str != null && (str.equals("cmaf") || this.aR.equals("avph"))) {
                    a.put("video_tcp_connect_time", this.ak.f165411w).put("audio_tcp_connect_time", this.ak.f165412x).put("video_tcp_first_packet_time", this.ak.f165413y).put("audio_tcp_first_packet_time", this.ak.f165414z).put("video_http_req_finish_time", this.ak.f165365C).put("audio_http_req_finish_time", this.ak.f165366D).put("video_http_res_finish_time", this.ak.f165367E).put("audio_http_res_finish_time", this.ak.f165368F);
                    if (this.aR.equals("cmaf")) {
                        a.put("cmaf_mpd_connect_time", this.ak.f165408t).put("cmaf_audio_firstseg_connect_time", this.ak.f165409u).put("cmaf_video_firstseg_connect_time", this.ak.f165410v).put("cmaf_mpd_http_req_finish_time", this.ak.f165363A).put("cmaf_mpd_http_res_finish_time", this.ak.f165364B);
                    }
                    m257353a(a);
                }
                this.aj.mo142871a(a);
                this.f165342j = "1.0:" + this.aT;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229718a(boolean z) {
        if (this.bf) {
            this.bf = false;
            JSONObject b = mo229720b();
            if (this.aU == -100015) {
                this.aU = 0;
            }
            if (this.bI == null) {
                this.bI = new ArrayList<>();
            }
            this.bI.add(Long.valueOf(-(System.currentTimeMillis() - this.ak.f165389a)));
            if (this.bn == 0) {
                this.bn = System.currentTimeMillis();
            }
            this.al.mo229668a(this.ak, 6);
            if (b != null && this.aW != 0) {
                try {
                    if (this.aX != 0) {
                        this.bg++;
                        this.bh = (int) (((long) this.bh) + (System.currentTimeMillis() - this.aX));
                    }
                    this.aZ++;
                    this.ba += System.currentTimeMillis() - this.aW;
                    b.put("event_key", "stall").put("stall_start", this.aW).put("stall_end", System.currentTimeMillis()).put("video_buffer_time_stall_start", this.ak.ar).put("audio_buffer_time_stall_start", this.ak.as).put("video_buffer_time_stall_end", this.ak.at).put("audio_buffer_time_stall_end", this.ak.au).put("reason", this.aY);
                    this.aj.mo142871a(b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo229712a(long j, String str, boolean z) {
        if (this.al != null && this.aj != null) {
            try {
                JSONObject b = mo229720b();
                b.put("event_key", "abr_switch").put("is_auto_switch", z).put("target_resoultion", str).put("predict_bitrate", j).put("abr_switch_info", this.f165331Y).put("cur_download_speed", this.f165328V).put("cur_audio_buffer_time", this.f165329W).put("cur_video_buffer_time", this.f165330X);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229710a(long j, int i, boolean z, boolean z2) {
        if (j > System.currentTimeMillis() - this.ak.f165389a || j <= ((long) i)) {
            C65658c.m257426b(ag, "abnormal render stall time" + j);
            return;
        }
        if (z) {
            C65658c.m257426b(ag, "video render stall time " + j);
            this.bi = this.bi + 1;
            this.bb = this.bb + 1;
            this.bj = (int) (((long) this.bj) + j);
            this.bc += j;
        } else {
            C65658c.m257426b(ag, "audio render stall time " + j);
            this.bk = this.bk + 1;
            this.bd = this.bd + 1;
            this.bl = (int) (((long) this.bl) + j);
            this.be += j;
        }
        if (z2) {
            JSONObject b = mo229720b();
            this.al.mo229668a(this.ak, 4);
            if (b != null) {
                try {
                    b.put("event_key", "render_stall").put(ShareHitPoint.f121869d, z ? "video" : "audio").put("render_stall_time", j).put("video_buffer_time", this.ak.f165381S).put("audio_buffer_time", this.ak.f165382T);
                    this.aj.mo142871a(b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo229709a(long j, int i, boolean z) {
        if (j > System.currentTimeMillis() - this.ak.f165389a || j <= ((long) i)) {
            String str = ag;
            C65658c.m257426b(str, "abnormal demux stall time" + j);
            return;
        }
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                b.put("event_key", "demux_stall").put(ShareHitPoint.f121869d, z ? "video" : "audio").put("demux_stall_time", j);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229713a(LiveError liveError) {
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                JSONObject put = b.put("event_key", "prepare_result").put("error_msg", liveError.getInfoJSON()).put("result", liveError.code);
                String str = this.aw;
                if (str == null) {
                    str = "none";
                }
                put.put("sdk_params", str).put("stream_type", this.ak.av);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229717a(String str, boolean z) {
        this.ar = str;
        this.as = z;
    }

    /* renamed from: c */
    public long mo229729c() {
        return this.ak.f165375M;
    }

    /* renamed from: j */
    public boolean mo229753j() {
        return this.bf;
    }

    /* renamed from: k */
    public boolean mo229755k() {
        return this.au;
    }

    /* renamed from: d */
    public void mo229735d() {
        if (!this.aS) {
            this.ak.f165391c = System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    public void mo229739e() {
        if (!this.aS) {
            this.ak.f165402n = System.currentTimeMillis();
        }
    }

    /* renamed from: n */
    public void mo229760n() {
        this.bs = true;
        this.bt = System.currentTimeMillis();
    }

    /* renamed from: s */
    private void m257358s() {
        m257357r();
        C65658c.m257426b("zdh", "update session series");
        if (this.an) {
            this.f175466ai.sendEmptyMessageDelayed(102, 5000);
        }
    }

    /* renamed from: g */
    public void mo229745g() {
        this.f165353u = 1;
        if (this.bx == null) {
            C65655a aVar = new C65655a(this);
            this.bx = aVar;
            aVar.mo229764a(104, 0);
        }
    }

    /* renamed from: l */
    public boolean mo229757l() {
        int i;
        String str;
        NetworkInfo a = C65624d.m257253a(this.ah);
        if (a == null || !a.isAvailable()) {
            str = null;
            i = -1;
        } else {
            i = a.getType();
            str = a.getExtraInfo();
        }
        if (i == -1) {
            this.f165351s = i;
            this.bB = str;
            return true;
        } else if (i != this.f165351s) {
            this.f165351s = i;
            this.bB = str;
            return true;
        } else if (str == null) {
            return false;
        } else {
            String str2 = this.bB;
            if (str2 != null && str.equals(str2)) {
                return false;
            }
            this.f165351s = i;
            this.bB = str;
            return true;
        }
    }

    /* renamed from: p */
    public void mo229763p() {
        this.bs = false;
        long currentTimeMillis = System.currentTimeMillis() - this.bt;
        Log.i(ag, "recover from error time " + currentTimeMillis);
        if (this.bt != 0) {
            this.bu++;
            this.bv += System.currentTimeMillis() - this.bt;
        }
    }

    /* renamed from: a */
    public void mo229703a() {
        C65655a aVar;
        if (!this.an) {
            this.f175466ai.sendEmptyMessageDelayed(101, this.am);
            if (this.f165312F) {
                this.f175466ai.sendEmptyMessageDelayed(102, 5000);
            }
            if (this.f165353u == 1 && !this.f165352t && (aVar = this.bx) != null) {
                aVar.mo229764a(103, 0);
                this.f165352t = true;
            }
            this.an = true;
        }
    }

    /* renamed from: m */
    public void mo229758m() {
        if (this.ak.f165400l > 0 && this.ak.f165399k > 0) {
            this.aV = 0;
        } else if (this.ak.f165400l > 0 && this.ak.f165399k <= 0) {
            this.aV = 1;
        } else if (this.ak.f165400l > 0 || this.ak.f165399k <= 0) {
            this.aV = 3;
        } else {
            this.aV = 2;
        }
    }

    /* renamed from: q */
    private JSONObject m257356q() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        m257357r();
        try {
            JSONObject put = new JSONObject().put("start_time", this.ak.f165389a).put("duration", System.currentTimeMillis() - this.ak.f165389a).put("render_fps_series", new JSONArray((Collection) this.bF)).put("download_bitrate_series", new JSONArray((Collection) this.bG)).put("play_buffer_series", new JSONArray((Collection) this.bH));
            if (this.bK == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray((Collection) this.bK);
            }
            JSONObject put2 = put.put("push_bitrate_series", jSONArray);
            if (this.bL == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray((Collection) this.bL);
            }
            JSONObject put3 = put2.put("push_fps_series", jSONArray2);
            if (this.bI == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray((Collection) this.bI);
            }
            JSONObject put4 = put3.put("stall_series", jSONArray3);
            JSONObject jSONObject = this.bJ;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            return put4.put("error_series", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    private void m257357r() {
        C65657b bVar;
        C65638g gVar = this.al;
        if (gVar != null && this.aj != null && (bVar = this.ak) != null) {
            gVar.mo229668a(bVar, 3);
            if (this.bF == null) {
                this.bF = new ArrayList<>();
                this.bH = new ArrayList<>();
                this.bG = new ArrayList<>();
            }
            this.bF.add(Long.valueOf((long) this.ak.f165379Q));
            this.bH.add(Long.valueOf(this.ak.f165382T));
            this.bG.add(Long.valueOf(this.ak.f165380R));
            if (this.bM) {
                if (this.bL == null) {
                    this.bL = new ArrayList<>();
                    this.bK = new ArrayList<>();
                }
                this.bL.add(Integer.valueOf(this.ak.ac));
                this.bK.add(Integer.valueOf(this.ak.ab));
            }
        }
    }

    /* renamed from: f */
    public void mo229742f() {
        this.aq = "none";
        this.ar = "none";
        this.as = false;
        this.av = 0;
        this.ax = "none";
        this.ay = "none";
        this.az = "none";
        this.aA = "none";
        this.aB = "none";
        this.aC = -1;
        this.aD = -1;
        this.aE = -1;
        this.aF = -1;
        this.aG = -1;
        this.aH = "none";
        this.aI = "none";
        this.aL = "none";
        this.aM = false;
        this.aN = false;
        this.aO = false;
        this.aa = false;
        this.f165336d = false;
        this.f165337e = -1;
        this.f165338f = -1.0f;
        this.f165339g = -1;
        this.f165340h = -1.0f;
        this.f165341i = 0;
        this.f165342j = "none";
        this.f165343k = 0;
        this.f165344l = 0;
        this.f165345m = 0;
        this.f165346n = 0;
        this.f165310D = -1;
        this.f165309C = 0;
        this.aS = false;
        this.aT = 0;
        this.aU = 0;
        this.aW = 0;
        this.aY = -1;
        this.aZ = 0;
        this.ba = 0;
        this.bc = 0;
        this.bb = 0;
        this.be = 0;
        this.bd = 0;
        this.bu = 0;
        this.bv = 0;
        this.bs = false;
        this.bf = false;
        this.bg = 0;
        this.bh = 0;
        this.bk = 0;
        this.bl = 0;
        this.bi = 0;
        this.bj = 0;
        this.aX = 0;
        this.bm = 0;
        this.bn = 0;
        this.bo = 0;
        this.bp = 0;
        this.f165348p = -1;
        this.bA = false;
        this.bz = 0;
        this.f165353u = 0;
        this.bC = 0;
        this.bD = 0;
        this.f165313G = -1;
        this.bF = null;
        this.bG = null;
        this.bH = null;
        this.bK = null;
        this.bL = null;
        this.bJ = null;
        this.bI = null;
        C65657b bVar = this.ak;
        if (bVar != null) {
            bVar.mo229766a();
        }
        this.f165335c = "none";
        this.aP = "none";
        this.f165317K = 1;
        this.f165347o = "none";
        this.f165320N = "none";
        this.f165355w = 0;
        this.f165354v = 0;
        this.f165356x = 0;
        this.f165357y = -1;
        this.ac = 0;
        this.ab = 0;
        this.f165321O = false;
        this.f165323Q = false;
        this.f165322P = "rad";
        this.f165324R = "origin";
        this.f165325S = -1;
        this.f165326T = 0;
        this.f165327U = "none";
        this.f165331Y = "none";
        this.f165328V = -1;
        this.f165329W = -1;
        this.f165330X = -1;
        this.f165332Z = 4;
        this.bU = 0;
        this.bV = 0;
        this.af = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo229747h() {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.liveplayer.log.C65654a.mo229747h():void");
    }

    /* renamed from: b */
    public JSONObject mo229720b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.al.mo229684j();
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.3.72.1").put("product_line", "live").put("client_timestamp", System.currentTimeMillis());
            String str = this.at;
            String str2 = "-1";
            if (str == null) {
                str = str2;
            }
            JSONObject put2 = put.put("player_sdk_version", str);
            String str3 = this.ap;
            if (str3 == null) {
                str3 = str2;
            }
            JSONObject put3 = put2.put("project_key", str3);
            String str4 = this.f165333a;
            String str5 = "none";
            if (str4 == null) {
                str4 = str5;
            }
            JSONObject put4 = put3.put("live_stream_enter_method", str4);
            String str6 = this.f165334b;
            if (str6 == null) {
                str6 = str5;
            }
            JSONObject put5 = put4.put("live_stream_enter_action", str6);
            String str7 = this.aq;
            if (str7 != null) {
                str2 = str7;
            }
            JSONObject put6 = put5.put("cdn_play_url", str2);
            String str8 = this.ar;
            if (str8 == null) {
                str8 = str5;
            }
            JSONObject put7 = put6.put("cdn_ip", str8);
            int i10 = 1;
            if (this.as) {
                i = 1;
            } else {
                i = 0;
            }
            JSONObject put8 = put7.put("ip_from_player_core", i);
            if (this.au) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            JSONObject put9 = put8.put("is_preview", i2).put("push_client_sdk_version", this.ax).put("push_client_platform", this.ay).put("push_client_os_version", this.az).put("push_client_model", this.aA).put("push_client_start_time", this.aB).put("push_client_is_hardware_encode", this.aC).put("push_client_min_bitrate", this.aD).put("push_client_max_bitrate", this.aE).put("push_client_default_bitrate", this.aF).put("push_client_push_protocol", this.aH).put("push_client_qid", this.aI).put("push_client_hit_node_optimize", this.aG);
            if (this.aK) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            JSONObject put10 = put9.put("open_dns_optimizer", i3);
            if (this.aM) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            JSONObject put11 = put10.put("hit_node_optimize", i4).put("evaluator_symbol", this.aL);
            if (this.aN) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            JSONObject put12 = put11.put("remote_sorted", i5).put("common_tag", this.ao).put("codec_type", this.aP).put("codec_name", this.f165335c);
            if (this.aQ) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            JSONObject put13 = put12.put("hardware_decode", i6);
            if (this.br) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            JSONObject put14 = put13.put("sharp", i7);
            if (this.f165336d) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            JSONObject put15 = put14.put("enable_hurry", i8).put("hurry_time", this.f165337e).put("catch_speed", new DecimalFormat("0.00").format((double) this.f165338f)).put("slow_play_time", this.f165339g).put("slow_speed", new DecimalFormat("0.00").format((double) this.f165340h));
            if (this.aS) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            JSONObject put16 = put15.put("first_screen", i9);
            if (!this.f165308B) {
                i10 = 0;
            }
            JSONObject put17 = put16.put("enable_httpDns", i10).put("enable_ntp", this.f165353u).put("enable_media_codec_async", this.f165309C).put("default_codec_id", this.f165310D).put("url_ability", this.f165311E).put("max_cache_seconds", this.f165313G).put("enable_fast_open", this.f165316J).put("enable_mdl", this.f165354v).put("enable_p2p", this.f165355w).put("p2p_loader_type", this.f165357y).put("used_p2p", this.f165356x);
            String str9 = this.f165358z;
            if (str9 == null) {
                str9 = str5;
            }
            JSONObject put18 = put17.put("mdl_version", str9).put("enable_mdl_proto", this.f165307A);
            if (this.ak.ak != null) {
                str5 = this.ak.ak;
            }
            JSONObject put19 = put18.put("dns_ip", str5).put("in_main_looper", this.f165317K).put("start_play_buffer_threshold", this.f165343k).put("buffering_end_ignore_video", this.f165344l).put("start_direct_after_prepared", this.f165345m).put("check_buffering_end_advance", this.f165346n).put("live_stream_session_id", this.f165347o).put("channel_id", this.ak.aa).put("sei_delay", this.ak.f165387Y).put("sei_source", this.ak.f165388Z).put("chip_board", this.bS).put("chip_hardware", this.bT).put("width", this.bC).put("height", this.bD).put("settings_info", this.f165320N).put("play_format", this.aR).put("play_protocol", this.bO).put("url_set_method", this.al.mo229685k()).put("enable_resolution_auto_degrade", this.f165321O).put("has_abr_info", this.f165323Q).put("quic_load_succ", this.bQ).put("link_info", this.aJ);
            if ((this.f165321O || this.f165323Q) && put19 != null) {
                put19.put("abr_strategy", this.f165322P).put("defualt_res", this.f165324R).put("defualt_res_bitrate", this.f165325S).put("stall_count_rad", this.f165332Z);
            }
            if (!(this.ak.ao == -1 || this.ak.ap == -1)) {
                if (!TextUtils.equals(this.bO, "quic")) {
                    String str10 = ag;
                    Log.e(str10, "Logging QUIC handshake info while using " + this.bO);
                }
                put19.put("quic_config_cached", this.ak.ao).put("quic_CHLO_count", this.ak.ap);
            }
            return put19;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public void mo229704a(int i) {
        this.bQ = i;
    }

    /* renamed from: b */
    public void mo229726b(String str) {
        this.bR = str;
    }

    /* renamed from: c */
    public void mo229732c(String str) {
        this.aq = str;
    }

    /* renamed from: d */
    public void mo229738d(boolean z) {
        this.aQ = z;
    }

    /* renamed from: e */
    public void mo229740e(int i) {
        this.bE = i;
    }

    /* renamed from: j */
    public void mo229752j(String str) {
        this.ap = str;
    }

    /* renamed from: k */
    public void mo229754k(String str) {
        this.at = str;
    }

    /* renamed from: m */
    public void mo229759m(String str) {
        this.aP = str;
    }

    /* renamed from: n */
    public void mo229761n(String str) {
        this.aw = str;
    }

    /* renamed from: b */
    public void mo229723b(long j) {
        this.ak.f165400l = j;
    }

    /* renamed from: l */
    public void mo229756l(String str) {
        if (str != null) {
            this.aL = str;
        }
    }

    /* renamed from: a */
    public void mo229708a(long j) {
        C65657b bVar = this.ak;
        if (bVar != null) {
            bVar.f165386X = j;
        }
    }

    /* renamed from: f */
    public void mo229743f(int i) {
        boolean z;
        int i2 = 0;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.bq = z;
        if (i <= 0) {
            i2 = -1;
        }
        this.f165348p = i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.videoarch.liveplayer.log.a$a */
    public static class C65655a {

        /* renamed from: a */
        public Handler f165359a;

        /* renamed from: b */
        private HandlerThread f165360b;

        /* renamed from: a */
        public static HandlerThread m257420a(String str) {
            return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
        }

        public C65655a(final C65654a aVar) {
            HandlerThread a = m257420a("DnsHandlerThread");
            this.f165360b = a;
            a.start();
            this.f165359a = new Handler(this.f165360b.getLooper()) {
                /* class com.ss.videoarch.liveplayer.log.C65654a.C65655a.HandlerC656561 */

                public void handleMessage(Message message) {
                    if (message != null) {
                        if ((message.what == 104 && aVar.f165351s == -1) || aVar.mo229757l() || (aVar.f165349q == null && aVar.f165350r == null)) {
                            try {
                                aVar.f165349q = InetAddress.getByName("time1.byteoversea.com");
                            } catch (UnknownHostException e) {
                                aVar.f165349q = null;
                                e.printStackTrace();
                            }
                            try {
                                aVar.f165350r = InetAddress.getByName("time2.byteoversea.com");
                            } catch (UnknownHostException e2) {
                                aVar.f165350r = null;
                                e2.printStackTrace();
                            }
                        }
                        if (message.what == 103) {
                            aVar.mo229747h();
                            if (aVar.f165352t) {
                                C65655a.this.f165359a.sendEmptyMessageDelayed(103, 300000);
                            }
                        }
                    }
                }
            };
        }

        /* renamed from: a */
        public void mo229764a(int i, long j) {
            Handler handler;
            if (this.f165360b != null && (handler = this.f165359a) != null) {
                if (j == 0) {
                    handler.sendEmptyMessage(i);
                } else {
                    handler.sendEmptyMessageDelayed(i, j);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo229728b(boolean z) {
        this.aK = z;
    }

    /* renamed from: c */
    public void mo229734c(boolean z) {
        this.aN = z;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (101 == i) {
            m257355f(false);
        }
        if (102 != i) {
            return true;
        }
        m257358s();
        return true;
    }

    /* renamed from: a */
    private void m257353a(JSONObject jSONObject) throws JSONException {
        if (TextUtils.equals(this.bO, "quic")) {
            jSONObject.put("quic_open_result", this.ak.aq);
            String str = ag;
            C65658c.m257426b(str, "quic_open_result = " + this.ak.aq);
        }
    }

    /* renamed from: e */
    private void m257354e(boolean z) {
        int i;
        String str;
        C65607b a = C65607b.m257152a();
        if (z) {
            i = 8013;
        } else {
            i = 8014;
        }
        a.mo229550a(i, this.f165347o, -1);
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                JSONObject put = b.put("event_key", "link");
                if (z) {
                    str = "start";
                } else {
                    str = "end";
                }
                put.put("info", str);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo229721b(int i) {
        C65638g gVar;
        if (!this.aS && (gVar = this.al) != null && this.aj != null) {
            gVar.mo229668a(this.ak, 2);
            JSONObject b = mo229720b();
            if (b != null) {
                try {
                    b.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i);
                    m257353a(b);
                    this.aj.mo142871a(b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: f */
    public void mo229744f(String str) {
        if (this.al != null && this.aj != null) {
            try {
                JSONObject b = mo229720b();
                b.put("event_key", "recved_spspps").put("spspps", str);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public void mo229748h(String str) {
        C65638g gVar = this.al;
        if (gVar != null && this.aj != null) {
            gVar.mo229668a(this.ak, 2);
            JSONObject b = mo229720b();
            if (b != null) {
                try {
                    b.put("event_key", "illegal_call").put("api_name", str);
                    m257353a(b);
                    this.aj.mo142871a(b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo229751i(String str) {
        JSONObject b;
        if (this.al != null && this.aj != null && (b = mo229720b()) != null) {
            try {
                b.put("event_key", "call_not_in_main_thread").put("api_name", str);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m257355f(boolean z) {
        C65657b bVar;
        if (this.al != null && this.aj != null && (bVar = this.ak) != null) {
            try {
                long j = bVar.f165375M;
                long j2 = this.ak.f165376N;
                long j3 = this.ak.f165377O;
                long j4 = this.ak.f165378P;
                this.al.mo229668a(this.ak, 1);
                this.aj.mo142871a(m257351a(this.ak, j, j2, j3, j4, z));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (this.an) {
                this.f175466ai.sendEmptyMessageDelayed(101, this.am);
            }
        }
    }

    /* renamed from: c */
    public void mo229730c(int i) {
        this.bo++;
        this.bp++;
        this.al.mo229668a(this.ak, 2);
        JSONObject b = mo229720b();
        mo229758m();
        if (b != null) {
            try {
                b.put("event_key", "retry").put("reason", this.aU).put("code", i).put("render_fail_type", this.aV);
                m257353a(b);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void mo229736d(int i) {
        String str;
        int i2;
        if (this.al != null) {
            JSONObject b = mo229720b();
            this.al.mo229668a(this.ak, 7);
            if (b != null) {
                try {
                    JSONObject put = b.put("event_key", "prepare_result");
                    String str2 = "none";
                    if (i != 0) {
                        str = this.al.mo229683i();
                    } else {
                        str = str2;
                    }
                    JSONObject put2 = put.put("error_msg", str).put("result", i);
                    String str3 = this.aw;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    JSONObject put3 = put2.put("sdk_params", str2);
                    if (this.ad < this.ae) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    put3.put("first_audio_packet_dts_rollback", i2).put("first_audio_packet_dts", this.ad).put("previous_audio_packet_dts", this.ae).put("stream_type", this.ak.av);
                    this.aj.mo142871a(b);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo229737d(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("sdk_version")) {
                    this.ax = jSONObject.getString("sdk_version");
                }
                if (jSONObject.has("platform")) {
                    this.ay = jSONObject.getString("platform");
                }
                if (jSONObject.has("os_version")) {
                    this.az = jSONObject.getString("os_version");
                }
                if (jSONObject.has("model")) {
                    this.aA = jSONObject.getString("model");
                }
                if (jSONObject.has("start_time")) {
                    this.aB = jSONObject.getString("start_time");
                }
                if (jSONObject.has("is_hardware_encode")) {
                    this.aC = jSONObject.getInt("is_hardware_encode");
                }
                if (jSONObject.has("min_bitrate")) {
                    this.aD = jSONObject.getInt("min_bitrate");
                }
                if (jSONObject.has("max_bitrate")) {
                    this.aE = jSONObject.getInt("max_bitrate");
                }
                if (jSONObject.has("default_bitrate")) {
                    this.aF = jSONObject.getInt("default_bitrate");
                }
                if (jSONObject.has("hit_node_optimize")) {
                    this.aG = jSONObject.getInt("hit_node_optimize");
                }
                if (jSONObject.has("push_protocol")) {
                    this.aH = jSONObject.getString("push_protocol");
                }
                if (jSONObject.has("qId")) {
                    this.aI = jSONObject.getString("qId");
                }
                if (jSONObject.has("link_info")) {
                    this.aJ = jSONObject.getString("link_info");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public void mo229741e(String str) {
        C65655a aVar;
        if (!TextUtils.isEmpty(str) && this.ak != null && this.al != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ts")) {
                    long j = jSONObject.getLong("ts");
                    long j2 = 0;
                    if (this.f165353u == 1 && jSONObject.has("tt_ntp") && jSONObject.getInt("tt_ntp") == 1) {
                        if (!this.f165352t && (aVar = this.bx) != null) {
                            aVar.mo229764a(103, 0);
                            this.f165352t = true;
                        }
                        j2 = this.bz;
                        this.bA = true;
                    } else {
                        if (this.f165352t && !jSONObject.has("tt_ntp")) {
                            C65655a aVar2 = this.bx;
                            if (aVar2 != null) {
                                aVar2.f165359a.removeCallbacksAndMessages(null);
                            }
                            this.f165352t = false;
                        }
                        this.bA = false;
                    }
                    this.ak.f165387Y = (System.currentTimeMillis() - j) + j2;
                    String str2 = this.ak.f165388Z;
                    if (jSONObject.has(ShareHitPoint.f121868c)) {
                        this.ak.f165388Z = jSONObject.getString(ShareHitPoint.f121868c);
                    } else if (jSONObject.has("app_data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("app_data"));
                        if (jSONObject2.has("vendor")) {
                            this.ak.f165388Z = jSONObject2.getString("vendor");
                        }
                    }
                    if (!str2.equals("none") && !this.ak.f165388Z.equals(str2)) {
                        if (str2.startsWith("TTLiveSDK")) {
                            m257354e(true);
                        } else {
                            m257354e(false);
                        }
                    }
                    if (jSONObject.has("app_data")) {
                        JSONObject jSONObject3 = new JSONObject(jSONObject.optString("app_data"));
                        if (jSONObject3.has("channel_id")) {
                            this.ak.aa = jSONObject3.getString("channel_id");
                        }
                    } else {
                        this.ak.aa = "none";
                    }
                    if (jSONObject.has("real_bitrate")) {
                        this.ak.ab = jSONObject.getInt("real_bitrate");
                        this.bM = true;
                    }
                    if (jSONObject.has("real_video_framerate")) {
                        this.ak.ac = jSONObject.getInt("real_video_framerate");
                        this.bM = true;
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    public void mo229746g(String str) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long j6;
        long j7;
        if (this.aS) {
            m257355f(true);
        }
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                if (this.aS) {
                    j2 = System.currentTimeMillis() - this.aT;
                    j = 0;
                } else if (this.aU != 0 || this.ak.f165389a == 0) {
                    j2 = 0;
                    j = 0;
                } else {
                    j = System.currentTimeMillis() - this.ak.f165389a;
                    j2 = 0;
                }
                long j8 = this.bm;
                if (j8 > 0) {
                    j4 = j8 - this.ak.f165399k;
                    j3 = this.bn - this.bm;
                } else {
                    j4 = 0;
                    j3 = 0;
                }
                if (!this.aS) {
                    this.al.mo229668a(this.ak, 2);
                    this.bU = this.bp;
                    this.bV = this.af;
                }
                if (mo229753j()) {
                    this.aZ++;
                    this.ba += System.currentTimeMillis() - this.aW;
                }
                if (!mo229762o() || this.bt == 0) {
                    j5 = j;
                } else {
                    this.bu++;
                    j5 = j;
                    this.bv += System.currentTimeMillis() - this.bt;
                }
                mo229758m();
                long j9 = this.ac + this.ak.f165375M;
                JSONObject put = b.put("event_key", "play_stop").put("stop_time", System.currentTimeMillis()).put("play_time", j2);
                int i2 = 0;
                if (this.aS) {
                    i = 1;
                } else {
                    i = 0;
                }
                JSONObject put2 = put.put("is_stream_received", i).put("render_fail_type", this.aV).put("code", this.aU).put("stall_count", this.aZ).put("stall_time", this.ba).put("audio_render_stall_count", this.bd).put("audio_render_stall_time", this.be).put("video_render_stall_count", this.bb).put("video_render_stall_time", this.bc).put("error_recover_count", this.bu).put("error_recover_time", this.bv).put("start", this.ak.f165389a).put("sdk_dns_analysis_end", this.ak.f165390b).put("player_dns_analysis_end", this.ak.f165392d).put("tcp_first_package_end", this.ak.f165394f).put("first_video_package_end", this.ak.f165395g).put("first_audio_package_end", this.ak.f165396h).put("first_video_frame_decode_end", this.ak.f165397i).put("first_audio_frame_decode_end", this.ak.f165398j).put("first_frame_render_end", this.ak.f165399k).put("first_audio_frame_end", this.ak.f165400l).put("video_device_open_start", this.ak.f165403o).put("video_device_open_end", this.ak.f165404p).put("audio_device_open_start", this.ak.f165405q).put("audio_device_open_end", this.ak.f165406r).put("video_device_wait_start", this.ak.f175467ai).put("video_device_wait_end", this.ak.aj).put("find_stream_info_start", this.ak.ag).put("find_stream_info_end", this.ak.ah).put("video_param_send_outlet_time", this.ak.ad).put("first_video_frame_send_outlet_time", this.ak.ae).put("video_first_pkt_pos", this.ak.f165369G).put("video_first_pkt_pts", this.ak.f165370H).put("audio_first_pkt_pos", this.ak.f165371I).put("audio_first_pkt_pts", this.ak.f165372J).put("set_surface_time", this.f165319M).put("set_surface_cost", this.f165318L).put("video_render_type", this.ak.af).put("prepare_block_end", this.ak.f165391c).put("prepare_end", this.ak.f165402n).put("retry_count", this.bp).put("download_speed", this.ak.f165383U).put("video_buffer_time", this.ak.f165384V).put("audio_buffer_time", this.ak.f165385W);
                if (this.ak.f165386X > 0) {
                    j6 = this.ak.f165386X;
                } else {
                    j6 = -this.ak.f165386X;
                }
                JSONObject put3 = put2.put("wait_time", j6);
                if (this.ak.f165386X < 0) {
                    i2 = 1;
                }
                JSONObject put4 = put3.put("is_waiting", i2).put("first_stall_time", j4).put("first_stall_duration", j3).put("call_api_name", str).put("play_time_on_no_frame", j5).put("abr_switch_count", this.f165326T).put("abr_switch_count_info", this.f165327U);
                String str2 = this.aw;
                if (str2 == null) {
                    str2 = "none";
                }
                put4.put("sdk_params", str2).put("total_download_size", j9).put("drop_audio_pts_diff", this.ak.f165373K).put("drop_audio_cost", this.ak.f165374L).put("first_frame_retry_count", this.bU).put("first_frame_retry_duration", this.bV);
                m257353a(b);
                String str3 = this.aq;
                if (str3 == null) {
                    b.put("tcp_connect_end", this.ak.f165393e);
                } else {
                    if (str3.startsWith("httpk")) {
                        j7 = this.ak.f165392d;
                    } else {
                        j7 = this.ak.f165393e;
                    }
                    b.put("tcp_connect_end", j7);
                }
                String str4 = this.aR;
                if (str4 != null && (str4.equals("cmaf") || this.aR.equals("avph"))) {
                    b.put("video_tcp_connect_time", this.ak.f165411w).put("audio_tcp_connect_time", this.ak.f165412x).put("video_tcp_first_packet_time", this.ak.f165413y).put("audio_tcp_first_packet_time", this.ak.f165414z).put("video_http_req_finish_time", this.ak.f165365C).put("audio_http_req_finish_time", this.ak.f165366D).put("video_http_res_finish_time", this.ak.f165367E).put("audio_http_res_finish_time", this.ak.f165368F);
                    if (this.aR.equals("cmaf")) {
                        b.put("cmaf_mpd_connect_time", this.ak.f165408t).put("cmaf_audio_firstseg_connect_time", this.ak.f165409u).put("cmaf_video_firstseg_connect_time", this.ak.f165410v).put("cmaf_mpd_http_req_finish_time", this.ak.f165363A).put("cmaf_mpd_http_res_finish_time", this.ak.f165364B);
                    }
                }
                if (this.f165312F) {
                    b.put("session_time_series", m257356q());
                }
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229705a(int i, int i2) {
        this.bC = i;
        this.bD = i2;
    }

    /* renamed from: b */
    public void mo229727b(String str, String str2) {
        this.bN = str;
        this.aR = str2;
    }

    /* renamed from: c */
    public void mo229733c(String str, String str2) {
        this.bP = str;
        this.bO = str2;
    }

    /* renamed from: a */
    public long mo229702a(int i, long j) {
        C65638g gVar;
        if (i == 0) {
            int i2 = this.aE;
            if (i2 != -1 || (gVar = this.al) == null) {
                return (long) i2;
            }
            return gVar.mo229665a(i, j);
        } else if (i != 100) {
            return j;
        } else {
            return this.ak.f165387Y;
        }
    }

    /* renamed from: c */
    public void mo229731c(int i, String str) {
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                b.put("event_key", "p2p_error").put("error_msg", str).put("code", i);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo229722b(int i, String str) {
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                if (str.equals("cdn_to_p2p")) {
                    this.f165356x = 1;
                }
                JSONObject put = b.put("event_key", "p2p_switch");
                if (str == null) {
                    str = "none";
                }
                put.put("switch_info", str).put("p2p_vendor", "none").put("reason", i);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229706a(int i, String str) {
        if (this.bJ == null) {
            this.bJ = new JSONObject();
        }
        try {
            this.bJ.put(Long.toString(System.currentTimeMillis() - this.ak.f165389a), i);
        } catch (JSONException e) {
            this.bJ = null;
            e.printStackTrace();
        }
        this.al.mo229668a(this.ak, 2);
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                b.put("event_key", "play_error").put("code", i).put("info", str);
                m257353a(b);
                this.aj.mo142871a(b);
                this.aU = i;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo229725b(long j, long j2) {
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                b.put("event_key", "timestamp_rollback").put("packet_type", "audio").put("timestamp_type", "dts").put("latest_ts", j2).put("previous_ts", j);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo229707a(int i, boolean z) {
        this.aU = -100015;
        if (z) {
            this.al.mo229668a(this.ak, 5);
            long currentTimeMillis = System.currentTimeMillis();
            this.aW = currentTimeMillis;
            if (this.bm == 0) {
                this.bm = currentTimeMillis;
            }
            this.aX = currentTimeMillis;
            this.aY = (long) i;
            this.bf = true;
            if (this.bI == null) {
                this.bI = new ArrayList<>();
            }
            this.bI.add(Long.valueOf(this.aW - this.ak.f165389a));
        }
    }

    /* renamed from: b */
    public void mo229724b(long j, int i, boolean z) {
        String str;
        if (j > System.currentTimeMillis() - this.ak.f165389a || j <= ((long) i)) {
            String str2 = ag;
            C65658c.m257426b(str2, "abnormal decode stall time" + j);
            return;
        }
        JSONObject b = mo229720b();
        if (b != null) {
            try {
                JSONObject put = b.put("event_key", "decode_stall");
                if (z) {
                    str = "video";
                } else {
                    str = "audio";
                }
                put.put(ShareHitPoint.f121869d, str).put("decode_stall_time", j);
                this.aj.mo142871a(b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public C65654a(C65638g gVar, AbstractC65605a aVar, long j, Context context) {
        this.ah = context;
        this.f175466ai = new Handler(this);
        this.am = j <= 0 ? 60000 : j;
        this.aj = aVar;
        this.al = gVar;
        this.ak = new C65657b();
        C69943a aVar2 = new C69943a();
        this.bw = aVar2;
        aVar2.mo245779a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    }

    /* renamed from: a */
    private JSONObject m257352a(C65657b bVar, long j, boolean z, long j2) throws JSONException {
        long j3;
        long j4;
        JSONObject b = mo229720b();
        if (b == null) {
            return null;
        }
        JSONObject put = b.put("event_key", "first_frame").put("last_retry_end", j).put("hit_cache", z ? 1 : 0).put("start", bVar.f165389a).put("sdk_dns_analysis_end", bVar.f165390b).put("prepare_block_end", bVar.f165391c).put("player_dns_analysis_end", bVar.f165392d);
        if (bVar.f165407s <= 0) {
            j3 = bVar.f165392d;
        } else {
            j3 = bVar.f165407s;
        }
        JSONObject put2 = put.put("tfo_fall_back_time", j3).put("pre_connect", this.bE);
        if (this.aq.startsWith("httpk") || this.aq.startsWith("httpq")) {
            j4 = bVar.f165392d;
        } else {
            j4 = bVar.f165393e;
        }
        return put2.put("tcp_connect_end", j4).put("tcp_first_package_end", bVar.f165394f).put("first_video_package_end", bVar.f165395g).put("first_audio_package_end", bVar.f165396h).put("first_video_frame_decode_end", bVar.f165397i).put("first_audio_frame_decode_end", bVar.f165398j).put("first_frame_from_player_core", bVar.f165401m).put("first_frame_render_end", bVar.f165399k).put("video_param_send_outlet_time", bVar.ad).put("first_video_frame_send_outlet_time", bVar.ae).put("set_surface_time", this.f165319M).put("set_surface_cost", this.f165318L).put("video_render_type", bVar.af).put("video_device_open_start", bVar.f165403o).put("video_device_open_end", bVar.f165404p).put("audio_device_open_start", bVar.f165405q).put("audio_device_open_end", bVar.f165406r).put("video_device_wait_start", bVar.f175467ai).put("video_device_wait_end", bVar.aj).put("find_stream_info_start", bVar.ag).put("find_stream_info_end", bVar.ah).put("video_first_pkt_pos", bVar.f165369G).put("video_first_pkt_pts", bVar.f165370H).put("audio_first_pkt_pos", bVar.f165371I).put("audio_first_pkt_pts", bVar.f165372J).put("video_buffer_time", this.ak.f165381S).put("audio_buffer_time", this.ak.f165382T).put("download_speed", this.ak.f165380R).put("stall_time", j2).put("first_sei_delay", this.ak.f165387Y).put("response_header_X-Server-IP", this.ak.am).put("response_header_Via", this.ak.an).put("prepare_end", bVar.f165402n).put("drop_audio_pts_diff", bVar.f165373K).put("drop_audio_cost", bVar.f165374L);
    }

    /* renamed from: a */
    private JSONObject m257351a(C65657b bVar, long j, long j2, long j3, long j4, boolean z) throws JSONException {
        long j5;
        long j6;
        JSONObject b = mo229720b();
        if (b == null) {
            return null;
        }
        long j7 = bVar.f165377O - j3;
        long j8 = bVar.f165378P - j4;
        long j9 = bVar.f165376N - j2;
        if (j8 <= 0 || j9 <= 0) {
            j5 = 0;
        } else {
            j5 = (j9 * 8) / j8;
        }
        this.av++;
        int i = this.bg;
        int i2 = this.bh;
        if (this.bf && this.aX != 0) {
            i++;
            i2 = (int) (((long) i2) + (System.currentTimeMillis() - this.aX));
            this.aX = System.currentTimeMillis();
        }
        long j10 = bVar.f165375M + this.ac;
        if (!this.aa) {
            j6 = bVar.f165375M - j;
        } else {
            j6 = bVar.f165375M + this.ab;
            this.ab = 0;
        }
        int i3 = 0;
        this.aa = false;
        b.put("event_key", "playing").put("download_size_delta", j6).put("download_size", j10).put("video_play_size", bVar.f165376N).put("render_fps", (double) bVar.f165379Q).put("video_rate", j5).put("download_speed", this.ak.f165380R).put("play_time", j7).put("retry_count", this.bo).put("stall_count", i).put("stall_time", i2).put("audio_render_stall_count", this.bk).put("audio_render_stall_time", this.bl).put("video_render_stall_count", this.bi).put("video_render_stall_time", this.bj).put("silence_detected_count", this.f165348p).put("is_last", z ? 1 : 0).put("index", this.av).put("speed_switch_count", this.f165341i).put("speed_switch_info", this.f165342j).put("video_buffer_time", this.ak.f165381S).put("audio_buffer_time", this.ak.f165382T).put("enable_sei_check", this.f165315I ? 1 : 0).put("ntp_sync", this.bA ? 1 : 0);
        this.bo = 0;
        this.bg = 0;
        this.bh = 0;
        this.bk = 0;
        this.bl = 0;
        this.bi = 0;
        this.bj = 0;
        this.f165341i = 0;
        this.f165342j = "none";
        if (!this.bq) {
            i3 = -1;
        }
        this.f165348p = i3;
        return b;
    }
}
