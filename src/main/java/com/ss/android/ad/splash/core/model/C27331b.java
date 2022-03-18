package com.ss.android.ad.splash.core.model;

import android.text.TextUtils;
import com.ss.android.ad.splash.C27461q;
import com.ss.android.ad.splash.core.C27287e;
import com.ss.android.ad.splash.core.C27368t;
import com.ss.android.ad.splash.core.model.C27345m;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.model.b */
public class C27331b extends C27343k implements AbstractC27456a, Cloneable {

    /* renamed from: A */
    private int f68142A;

    /* renamed from: B */
    private int f68143B = 0;

    /* renamed from: C */
    private C27349o f68144C;

    /* renamed from: D */
    private C27349o f68145D;

    /* renamed from: E */
    private int f68146E = 0;

    /* renamed from: F */
    private boolean f68147F = false;

    /* renamed from: G */
    private int f68148G = 0;

    /* renamed from: H */
    private List<String> f68149H;

    /* renamed from: I */
    private List<String> f68150I;

    /* renamed from: J */
    private List<String> f68151J;

    /* renamed from: K */
    private List<String> f68152K;

    /* renamed from: L */
    private boolean f68153L = false;

    /* renamed from: M */
    private int f68154M;

    /* renamed from: N */
    private C27350p f68155N;

    /* renamed from: O */
    private C27330a f68156O;

    /* renamed from: P */
    private boolean f68157P = false;

    /* renamed from: Q */
    private String f68158Q;

    /* renamed from: R */
    private String f68159R;

    /* renamed from: S */
    private JSONObject f68160S;

    /* renamed from: T */
    private int f68161T = 0;

    /* renamed from: U */
    private String f68162U;

    /* renamed from: V */
    private int f68163V;

    /* renamed from: W */
    private int f68164W = 1;

    /* renamed from: X */
    private int f68165X = 0;

    /* renamed from: Y */
    private C27339g f68166Y;

    /* renamed from: Z */
    private C27344l f68167Z;

    /* renamed from: a */
    public long f68168a;
    private String aa;
    private boolean ab = false;
    private int ac = 0;
    private C27347n ad;
    private JSONObject ae;
    private int af = 0;
    private int ag = 0;
    private String ah;

    /* renamed from: ai  reason: collision with root package name */
    private C27341i f175442ai;
    private C27337e aj;
    private String ak = "web";
    private int al = 0;
    private String am;
    private int an = Integer.MAX_VALUE;
    private String ao;
    private int ap;
    private int aq = 0;
    private String ar;
    private long as;
    private String at;
    private String au;
    private String av;

    /* renamed from: b */
    public int f68169b = 0;

    /* renamed from: d */
    private C27338f f68170d;

    /* renamed from: e */
    private long f68171e;

    /* renamed from: f */
    private long f68172f;

    /* renamed from: g */
    private long f68173g;

    /* renamed from: h */
    private long f68174h;

    /* renamed from: i */
    private long f68175i;

    /* renamed from: j */
    private int f68176j;

    /* renamed from: k */
    private int f68177k;

    /* renamed from: l */
    private int f68178l;

    /* renamed from: m */
    private int f68179m;

    /* renamed from: n */
    private String f68180n;

    /* renamed from: o */
    private String f68181o;

    /* renamed from: p */
    private String f68182p;

    /* renamed from: q */
    private String f68183q;

    /* renamed from: r */
    private int f68184r;

    /* renamed from: s */
    private String f68185s;

    /* renamed from: t */
    private String f68186t;

    /* renamed from: u */
    private String f68187u;

    /* renamed from: v */
    private int f68188v;

    /* renamed from: w */
    private int f68189w;

    /* renamed from: x */
    private int f68190x;

    /* renamed from: y */
    private final List<C27331b> f68191y = new ArrayList();

    /* renamed from: z */
    private long f68192z;

    /* renamed from: l */
    public void mo97498l() {
        this.f68147F = true;
    }

    /* renamed from: C */
    public String mo97437C() {
        return this.ao;
    }

    /* renamed from: D */
    public String mo97438D() {
        return this.f68182p;
    }

    /* renamed from: E */
    public String mo97439E() {
        return this.f68183q;
    }

    /* renamed from: F */
    public int mo97440F() {
        return this.f68188v;
    }

    /* renamed from: G */
    public int mo97441G() {
        return this.f68189w;
    }

    /* renamed from: H */
    public int mo97442H() {
        return this.f68190x;
    }

    /* renamed from: I */
    public List<C27331b> mo97443I() {
        return this.f68191y;
    }

    @Override // com.ss.android.ad.splash.origin.AbstractC27456a
    /* renamed from: J */
    public int mo97444J() {
        return this.f68143B;
    }

    /* renamed from: K */
    public C27349o mo97445K() {
        return this.f68144C;
    }

    /* renamed from: L */
    public C27349o mo97446L() {
        return this.f68145D;
    }

    /* renamed from: M */
    public boolean mo97447M() {
        return this.f68147F;
    }

    /* renamed from: N */
    public int mo97448N() {
        return this.f68148G;
    }

    /* renamed from: O */
    public List<String> mo97449O() {
        return this.f68149H;
    }

    /* renamed from: P */
    public List<String> mo97450P() {
        return this.f68150I;
    }

    /* renamed from: Q */
    public List<String> mo97451Q() {
        return this.f68151J;
    }

    @Override // com.ss.android.ad.splash.origin.AbstractC27456a
    /* renamed from: R */
    public List<String> mo97452R() {
        return this.f68152K;
    }

    /* renamed from: S */
    public int mo97453S() {
        return this.f68179m;
    }

    /* renamed from: T */
    public C27350p mo97454T() {
        return this.f68155N;
    }

    /* renamed from: U */
    public JSONObject mo97455U() {
        return this.f68160S;
    }

    /* renamed from: V */
    public int mo97456V() {
        return this.f68161T;
    }

    /* renamed from: W */
    public String mo97457W() {
        return this.f68162U;
    }

    /* renamed from: X */
    public int mo97458X() {
        return this.f68164W;
    }

    /* renamed from: Y */
    public int mo97459Y() {
        return this.f68165X;
    }

    /* renamed from: Z */
    public C27344l mo97460Z() {
        return this.f68167Z;
    }

    public C27339g aa() {
        return this.f68166Y;
    }

    public String ab() {
        return this.aa;
    }

    public boolean ac() {
        return this.ab;
    }

    public int ae() {
        return this.ap;
    }

    public int ak() {
        return this.ac;
    }

    @Override // com.ss.android.ad.splash.origin.AbstractC27456a
    /* renamed from: f */
    public long mo97491f() {
        return this.f68171e;
    }

    /* renamed from: g */
    public int mo97492g() {
        return this.aq;
    }

    /* renamed from: h */
    public String mo97493h() {
        return this.ar;
    }

    /* renamed from: i */
    public long mo97495i() {
        return this.as;
    }

    /* renamed from: j */
    public String mo97496j() {
        return this.f68181o;
    }

    /* renamed from: m */
    public boolean mo97499m() {
        return this.f68157P;
    }

    /* renamed from: n */
    public String mo97500n() {
        return this.f68158Q;
    }

    /* renamed from: o */
    public String mo97501o() {
        return this.f68159R;
    }

    /* renamed from: t */
    public C27338f mo97506t() {
        return this.f68170d;
    }

    /* renamed from: u */
    public int mo97508u() {
        return this.f68184r;
    }

    @Override // com.ss.android.ad.splash.origin.AbstractC27456a
    /* renamed from: v */
    public long mo97509v() {
        return this.f68168a;
    }

    /* renamed from: w */
    public String mo97510w() {
        return this.f68180n;
    }

    @Override // com.ss.android.ad.splash.origin.AbstractC27456a
    /* renamed from: x */
    public String mo97511x() {
        return this.f68185s;
    }

    /* renamed from: y */
    public String mo97512y() {
        return this.f68186t;
    }

    public boolean ah() {
        if (this.f68146E == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ad.splash.core.model.C27343k
    public String aj() {
        return mo97501o();
    }

    public boolean al() {
        if (this.af == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ad.splash.core.model.C27343k
    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k */
    public boolean mo97497k() {
        if (this.f68176j == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo97502p() {
        if (this.f68161T == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public int mo97436B() {
        C27344l lVar = this.f68167Z;
        if (lVar != null) {
            return lVar.mo97563h();
        }
        return 0;
    }

    public int ad() {
        C27349o oVar = this.f68144C;
        if (oVar != null) {
            return oVar.mo97577f();
        }
        return 0;
    }

    public int af() {
        C27349o oVar = this.f68144C;
        if (oVar != null) {
            return oVar.mo97578g();
        }
        return 0;
    }

    public boolean am() {
        if (this.f68161T == 1 && this.f68143B == 2) {
            return true;
        }
        return false;
    }

    public boolean ao() {
        if (mo97492g() == 5) {
            return true;
        }
        return false;
    }

    public boolean ap() {
        int i = this.an;
        if (i != 0 && this.f68169b >= i) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public Object clone() {
        C27331b bVar;
        try {
            bVar = (C27331b) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            bVar = null;
        }
        return bVar == null ? this : bVar;
    }

    /* renamed from: d */
    public long mo97488d() {
        return this.f68171e + (this.f68173g * 1000);
    }

    /* renamed from: e */
    public long mo97489e() {
        return this.f68171e + (this.f68173g * 1000) + (this.f68172f * 1000);
    }

    /* renamed from: q */
    public boolean mo97503q() {
        if (this.f68161T == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo97504r() {
        if (!mo97502p() || this.f68143B != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean mo97505s() {
        if (!mo97502p() || this.f68143B != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public boolean mo97435A() {
        if (this.f68174h > ((long) mo97436B()) * 1000) {
            return true;
        }
        return false;
    }

    public void an() {
        this.f68169b++;
        C27287e.m99211J().execute(new Runnable() {
            /* class com.ss.android.ad.splash.core.model.C27331b.RunnableC273321 */

            public void run() {
                JSONObject h = C27478h.m100380h();
                if (h == null) {
                    h = new JSONObject();
                }
                try {
                    C27471a.m100283a("show times added, times:" + C27331b.this.f68169b);
                    h.put(String.valueOf(C27331b.this.f68168a), C27331b.this.f68169b);
                    C27368t.m99732a().mo97650a(h.toString()).mo97681l();
                } catch (Exception unused) {
                }
            }
        });
    }

    /* renamed from: z */
    public boolean mo97513z() {
        if (!TextUtils.isEmpty(this.f68180n) || !TextUtils.isEmpty(this.f68182p) || !TextUtils.isEmpty(this.f68186t)) {
            return true;
        }
        return false;
    }

    private C27345m aq() {
        return new C27345m.C27346a().mo97565a(this.f68180n).mo97568b(this.f68182p).mo97570c(this.f68186t).mo97566a(this.f68150I).mo97569b(this.f68149H).mo97567a();
    }

    public boolean ag() {
        long currentTimeMillis = System.currentTimeMillis();
        if (C27287e.at() && C27478h.m100379g() != -1) {
            currentTimeMillis = C27478h.m100379g();
        }
        if (currentTimeMillis < mo97488d() || currentTimeMillis > mo97489e()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public long mo97486c() {
        long j = this.f68174h;
        if (j < 1000) {
            return 1000;
        }
        if (j > 17000) {
            return 17000;
        }
        return j;
    }

    public C27461q ai() {
        return new C27461q.C27463a().mo98037a(this.f68168a).mo98042a(this.f68185s).mo98043a(this.f68153L).mo98046b(this.f68187u).mo98036a(this.f68154M).mo98045b(this.f68142A).mo98047c(this.f68178l).mo98040a(this.f68155N).mo98038a(this.f68156O).mo98041a(this.aj).mo98039a(aq()).mo98048c(this.at).mo98049d(this.au).mo98050e(this.av).mo98044a();
    }

    /* renamed from: b */
    public int mo97484b() {
        if (mo97509v() <= 0) {
            return 4003;
        }
        int i = this.f68143B;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                C27349o oVar = this.f68144C;
                if (oVar == null || !oVar.mo97580i()) {
                    return 4002;
                }
                int i2 = this.f68161T;
                if (i2 == 2 && this.ae == null) {
                    return 4005;
                }
                if (i2 != 3) {
                    return 2000;
                }
                C27349o oVar2 = this.f68145D;
                if (oVar2 == null || !oVar2.mo97580i()) {
                    return 4006;
                }
                return 2000;
            } else if (i == 3) {
                C27338f fVar = this.f68170d;
                if (fVar == null || !fVar.mo97538e()) {
                    return 4001;
                }
                C27349o oVar3 = this.f68144C;
                if (oVar3 == null || !oVar3.mo97580i()) {
                    return 4002;
                }
                return 2000;
            } else if (i != 4) {
                return 4000;
            }
        }
        C27338f fVar2 = this.f68170d;
        if (fVar2 == null || !fVar2.mo97538e()) {
            return 4001;
        }
        return 2000;
    }

    /* renamed from: a */
    public boolean mo97467a() {
        if (mo97484b() == 2000) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SplashAd{mSplashAdImageInfo=" + this.f68170d + ", mFetchTime=" + this.f68171e + ", mExpireSeconds=" + this.f68172f + ", mDisplayAfter=" + this.f68173g + ", mDisplayTimeMs=" + this.f68174h + ", mBannerMode=" + this.f68176j + ", mRepeat=" + this.f68177k + ", mId=" + this.f68168a + ", mOpenUrl='" + this.f68180n + '\'' + ", mAppOpenUrl='" + this.f68181o + '\'' + ", mMicroAppOpenUrl='" + this.f68182p + '\'' + ", mBtnText='" + this.f68183q + '\'' + ", mOpenExtraSize=" + this.f68184r + ", mLogExtra='" + this.f68185s + '\'' + ", mWebUrl='" + this.f68186t + '\'' + ", mWebTitle='" + this.f68187u + '\'' + ", mImageMode=" + this.f68188v + ", mClickBtnShow=" + this.f68189w + ", mSkipBtnShow=" + this.f68190x + ", mTimeGapSplash=" + this.f68191y + ", mSplashId=" + this.f68192z + ", mInterceptedFlag=" + this.f68142A + ", mSplashType=" + this.f68143B + ", mSplashVideoInfo=" + this.f68144C + ", mHasCallBack=" + this.f68147F + ", mSplashAdLoadType=" + this.f68148G + ", mWebUrlList=" + this.f68149H + ", mOpenUrlList=" + this.f68150I + ", mTrackUrlList=" + this.f68151J + ", mClickTrackUrlList=" + this.f68152K + ", mIsForbidJump=" + this.f68153L + ", mOrientation=" + this.f68154M + ", mCanvasInfo=" + this.f68155N + ", mShareAdInfo=" + this.f68156O + ", mRealTimeShow=" + this.f68157P + ", mSplashOpenNewUIExperiment=" + this.f68146E + ", mSplashShowType=" + this.f68161T + ", mSplashAdId=" + this.f68162U + ", mPredownload=" + this.f68164W + ", mMicroPreload=" + this.f68165X + ", mPreloadWeb=" + this.ag + '}';
    }

    /* renamed from: a */
    public void mo97461a(int i) {
        this.f68169b = i;
    }

    /* renamed from: m */
    private void m99480m(JSONObject jSONObject) {
        this.ad = C27347n.m99602a(jSONObject);
    }

    /* renamed from: n */
    private void m99481n(JSONObject jSONObject) {
        this.f175442ai = C27341i.m99583a(jSONObject);
    }

    /* renamed from: a */
    public void mo97462a(String str) {
        this.f68185s = str;
    }

    /* renamed from: f */
    private void m99473f(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("share_info");
        if (optJSONObject != null) {
            this.f68156O = new C27330a(optJSONObject);
        }
    }

    /* renamed from: h */
    private void m99475h(JSONObject jSONObject) {
        this.aq = jSONObject.optInt("swipe_up_type", 0);
    }

    /* renamed from: l */
    private void m99479l(JSONObject jSONObject) {
        if (this.f68161T == 2) {
            this.ae = jSONObject.optJSONObject("search_info");
        }
    }

    /* renamed from: c */
    private void m99470c(JSONObject jSONObject) {
        this.at = jSONObject.optString("native_site_config");
        this.au = jSONObject.optString("native_site_ad_info");
        this.av = jSONObject.optString("native_site_custom_data");
    }

    /* renamed from: k */
    private void m99478k(JSONObject jSONObject) {
        this.f68166Y = C27339g.m99567a(jSONObject.optJSONObject("label_info"));
        this.f68167Z = C27344l.m99585a(jSONObject.optJSONObject("skip_info"));
    }

    /* renamed from: a */
    public void mo97466a(boolean z) {
        this.f68157P = z;
    }

    @Override // com.ss.android.ad.splash.core.model.C27343k
    public boolean equals(Object obj) {
        if (!C27287e.ai()) {
            return super.equals(obj);
        }
        if ((obj instanceof C27331b) && ((C27331b) obj).mo97509v() == this.f68168a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m99471d(JSONObject jSONObject) {
        this.am = jSONObject.optString("site_id", "");
        if ("canvas".equalsIgnoreCase(jSONObject.optString("style")) && !C27480i.m100385a(this.am)) {
            C27350p pVar = new C27350p();
            this.f68155N = pVar;
            pVar.mo97581a(this.am);
        }
    }

    /* renamed from: g */
    private void m99474g(JSONObject jSONObject) {
        String optString = jSONObject.optString("download_url", "");
        String optString2 = jSONObject.optString("package", "");
        this.aj = C27337e.m99560a(this.ak, optString, jSONObject.optString("app_name", ""), optString2, jSONObject.optString("avatar_url", ""));
    }

    /* renamed from: j */
    private void m99477j(JSONObject jSONObject) {
        if (this.f68143B == 3 || mo97444J() == 2) {
            C27349o oVar = new C27349o();
            this.f68144C = oVar;
            try {
                oVar.mo97572a(jSONObject.getJSONObject("video_info"));
                if (jSONObject.has("extra_video_info")) {
                    C27349o oVar2 = new C27349o();
                    this.f68145D = oVar2;
                    oVar2.mo97572a(jSONObject.getJSONObject("extra_video_info"));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo97463a(JSONObject jSONObject) {
        this.f68160S = jSONObject;
        m99469b(jSONObject);
        m99471d(jSONObject);
        mo97485b(jSONObject, this.f68171e);
        m99472e(jSONObject);
        m99473f(jSONObject);
        m99477j(jSONObject);
        m99476i(jSONObject);
        m99478k(jSONObject);
        m99479l(jSONObject);
        m99481n(jSONObject);
        m99480m(jSONObject);
        m99474g(jSONObject);
        m99475h(jSONObject);
        m99470c(jSONObject);
    }

    /* renamed from: e */
    private void m99472e(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f68151J = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    this.f68151J.add(optJSONArray.getString(i));
                } catch (Exception unused) {
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("click_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f68152K = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    this.f68152K.add(optJSONArray2.getString(i2));
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: i */
    private void m99476i(JSONObject jSONObject) {
        if (this.f68143B == 4) {
            if (jSONObject.has("web_url_list")) {
                this.f68149H = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("web_url_list");
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f68149H.add(optJSONArray.optString(i));
                }
            }
            if (jSONObject.has("open_url_list")) {
                this.f68150I = new ArrayList();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("open_url_list");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    this.f68150I.add(optJSONArray2.optString(i2));
                }
            }
        }
    }

    /* renamed from: b */
    private void m99469b(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.f68168a = jSONObject.optLong("id");
        this.f68186t = jSONObject.optString("web_url");
        this.f68180n = jSONObject.optString("open_url");
        this.f68181o = jSONObject.optString("app_open_url");
        this.f68182p = jSONObject.optString("mp_url");
        this.f68184r = jSONObject.optInt("open_extra_size");
        this.f68185s = jSONObject.optString("log_extra");
        this.f68147F = jSONObject.optBoolean("has_callback");
        this.f68170d = C27338f.m99561a(jSONObject.optJSONObject("image_info"));
        this.f68174h = jSONObject.optLong("display_time_ms");
        this.f68177k = jSONObject.optInt("repeat");
        this.f68176j = jSONObject.optInt("banner_mode");
        this.f68183q = jSONObject.optString("button_text");
        this.f68148G = jSONObject.optInt("splash_load_type", 0);
        this.f68188v = jSONObject.optInt("image_mode", 0);
        this.f68154M = jSONObject.optInt("orientation");
        this.f68187u = jSONObject.optString("web_title");
        this.f68173g = jSONObject.optLong("display_after", 0);
        this.f68172f = jSONObject.optLong("expire_seconds");
        this.f68189w = jSONObject.optInt("click_btn", 0);
        this.f68190x = jSONObject.optInt("skip_btn", 1);
        this.f68192z = jSONObject.optLong("splash_id");
        this.f68142A = jSONObject.optInt("intercept_flag");
        if (jSONObject.optInt("forbid_jump") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f68153L = z;
        this.f68143B = jSONObject.optInt("splash_type");
        this.f68178l = jSONObject.optInt("ad_lp_style");
        this.f68179m = jSONObject.optInt("show_expected");
        this.f68146E = jSONObject.optInt("skip_btn_style", 0);
        this.f68158Q = jSONObject.optString("report_key");
        this.f68159R = jSONObject.optString("item_key");
        this.f68161T = jSONObject.optInt("splash_show_type", 0);
        this.f68162U = jSONObject.optString("splash_ad_id", "");
        this.f68164W = jSONObject.optInt("predownload", 1);
        this.f68165X = jSONObject.optInt("preload_mp", 0);
        this.aa = jSONObject.optString("predownload_text");
        if (jSONObject.optInt("enable_splash_count_down", 0) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ab = z2;
        this.ac = jSONObject.optInt("sound_control", 0);
        this.f68175i = jSONObject.optLong("show_sound_time", 0);
        this.af = jSONObject.optInt("enable_open_type", 0);
        this.ag = jSONObject.optInt("preload_web", 0);
        this.ah = jSONObject.optString("web_channel_name");
        this.f68163V = jSONObject.optInt("brand_safety", 1);
        this.ar = jSONObject.optString("enter_app_text");
        this.ak = jSONObject.optString(ShareHitPoint.f121869d, "web");
        this.al = jSONObject.optInt("ad_style", 0);
        this.an = jSONObject.optInt("repeat_times", Integer.MAX_VALUE);
        this.ao = jSONObject.optString("action");
        this.ap = jSONObject.optInt("logo_color", 0);
        long j = this.f68171e;
        if (j <= 0) {
            this.f68171e = jSONObject.optLong("model_fetch_time", 0);
            return;
        }
        try {
            this.f68160S.put("model_fetch_time", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97464a(JSONObject jSONObject, long j) {
        if (j > 0) {
            this.f68171e = j;
        }
        mo97463a(jSONObject);
    }

    /* renamed from: b */
    public void mo97485b(JSONObject jSONObject, long j) {
        JSONArray optJSONArray = jSONObject.optJSONArray("interval_creative");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C27331b bVar = new C27331b();
                    bVar.mo97464a(optJSONObject, j);
                    mo97443I().add(bVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m99468a(JSONObject jSONObject, boolean z) {
        boolean z2;
        boolean z3;
        this.f68168a = jSONObject.optLong("id");
        this.f68186t = jSONObject.optString("web_url");
        this.f68180n = jSONObject.optString("open_url");
        this.f68181o = jSONObject.optString("app_open_url");
        this.f68182p = jSONObject.optString("mp_url");
        this.f68184r = jSONObject.optInt("open_extra_size");
        this.f68185s = jSONObject.optString("log_extra");
        this.f68147F = jSONObject.optBoolean("has_callback");
        this.f68170d = C27338f.m99561a(jSONObject.optJSONObject("image_info"));
        this.f68174h = jSONObject.optLong("display_time_ms");
        this.f68177k = jSONObject.optInt("repeat");
        this.f68176j = jSONObject.optInt("banner_mode");
        this.f68183q = jSONObject.optString("button_text");
        this.f68148G = jSONObject.optInt("splash_load_type", 0);
        this.f68188v = jSONObject.optInt("image_mode", 0);
        this.f68154M = jSONObject.optInt("orientation");
        this.f68187u = jSONObject.optString("web_title");
        this.f68173g = jSONObject.optLong("display_after", 0);
        this.f68172f = jSONObject.optLong("expire_seconds");
        this.f68189w = jSONObject.optInt("click_btn", 0);
        this.f68190x = jSONObject.optInt("skip_btn", 1);
        this.f68192z = jSONObject.optLong("splash_id");
        this.f68142A = jSONObject.optInt("intercept_flag");
        if (jSONObject.optInt("forbid_jump") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f68153L = z2;
        this.f68143B = jSONObject.optInt("splash_type");
        this.f68178l = jSONObject.optInt("ad_lp_style");
        this.f68179m = jSONObject.optInt("show_expected");
        this.f68146E = jSONObject.optInt("skip_btn_style", 0);
        this.f68161T = jSONObject.optInt("splash_show_type", 0);
        this.f68162U = jSONObject.optString("splash_ad_id", "");
        this.f68164W = jSONObject.optInt("predownload", 1);
        this.f68165X = jSONObject.optInt("preload_mp", 0);
        this.aa = jSONObject.optString("predownload_text");
        if (jSONObject.optInt("enable_splash_count_down", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.ab = z3;
        this.ac = jSONObject.optInt("sound_control", 0);
        this.f68175i = jSONObject.optLong("show_sound_time", 0);
        this.af = jSONObject.optInt("enable_open_type", 0);
        this.ag = jSONObject.optInt("preload_web", 0);
        this.ah = jSONObject.optString("web_channel_name");
        this.ak = jSONObject.optString(ShareHitPoint.f121869d, "web");
        this.al = jSONObject.optInt("ad_style", 0);
        this.an = jSONObject.optInt("repeat_times", Integer.MAX_VALUE);
        this.ao = jSONObject.optString("action");
        this.ap = jSONObject.optInt("logo_color", 0);
        if (z) {
            this.f68171e = jSONObject.optLong("model_fetch_time", 0);
        } else {
            try {
                this.f68160S.putOpt("model_fetch_time", Long.valueOf(this.f68171e));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f68163V = jSONObject.optInt("brand_safety", 1);
        this.ar = jSONObject.optString("enter_app_text");
        this.as = jSONObject.optLong("swipe_up_delay");
    }

    /* renamed from: a */
    public void mo97465a(JSONObject jSONObject, long j, boolean z) {
        if (j > 0) {
            this.f68171e = j;
        }
        this.f68160S = jSONObject;
        m99468a(jSONObject, z);
        m99471d(jSONObject);
        mo97485b(jSONObject, j);
        m99472e(jSONObject);
        m99473f(jSONObject);
        m99477j(jSONObject);
        m99476i(jSONObject);
        m99478k(jSONObject);
        m99479l(jSONObject);
        m99481n(jSONObject);
        m99474g(jSONObject);
        m99480m(jSONObject);
        m99475h(jSONObject);
        m99470c(jSONObject);
    }
}
