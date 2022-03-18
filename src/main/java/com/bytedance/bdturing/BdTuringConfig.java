package com.bytedance.bdturing;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bdturing.net.HttpClient;
import com.bytedance.bdturing.setting.ServiceInterceptor;
import com.bytedance.bdturing.twiceverify.AbstractC3580b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

public class BdTuringConfig {

    /* renamed from: A */
    private String f11058A;

    /* renamed from: B */
    private boolean f11059B;

    /* renamed from: C */
    private String f11060C;

    /* renamed from: D */
    private boolean f11061D;

    /* renamed from: E */
    private String f11062E;

    /* renamed from: F */
    private String f11063F;

    /* renamed from: G */
    private AbstractC3541d f11064G;

    /* renamed from: H */
    private ServiceInterceptor f11065H;

    /* renamed from: a */
    private RegionType f11066a;

    /* renamed from: b */
    private String f11067b;

    /* renamed from: c */
    private String f11068c;

    /* renamed from: d */
    private String f11069d;

    /* renamed from: e */
    private String f11070e;

    /* renamed from: f */
    private String f11071f;

    /* renamed from: g */
    private String f11072g;

    /* renamed from: h */
    private String f11073h;

    /* renamed from: i */
    private String f11074i;

    /* renamed from: j */
    private String f11075j;

    /* renamed from: k */
    private String f11076k;

    /* renamed from: l */
    private String f11077l;

    /* renamed from: m */
    private String f11078m;

    /* renamed from: n */
    private String f11079n;

    /* renamed from: o */
    private Context f11080o;

    /* renamed from: p */
    private HashMap<Integer, Pair<String, String>> f11081p;

    /* renamed from: q */
    private String f11082q;

    /* renamed from: r */
    private boolean f11083r;

    /* renamed from: s */
    private JSONObject f11084s;

    /* renamed from: t */
    private JSONObject f11085t;

    /* renamed from: u */
    private JSONObject f11086u;

    /* renamed from: v */
    private AbstractC3527c f11087v;

    /* renamed from: w */
    private HttpClient f11088w;

    /* renamed from: x */
    private AbstractC3580b f11089x;

    /* renamed from: y */
    private boolean f11090y;

    /* renamed from: z */
    private String f11091z;

    /* renamed from: a */
    public int mo14204a() {
        return 0;
    }

    public enum RegionType {
        REGION_CN("cn"),
        REGION_SINGAPOER("sg"),
        REGION_USA_EAST("va"),
        REGION_INDIA("in"),
        REGION_BOE("boe");
        
        private String mName;

        public String getName() {
            return this.mName;
        }

        private RegionType(String str) {
            this.mName = str;
        }
    }

    /* renamed from: b */
    public RegionType mo14210b() {
        return this.f11066a;
    }

    /* renamed from: d */
    public String mo14215d() {
        return this.f11069d;
    }

    /* renamed from: e */
    public String mo14216e() {
        return this.f11074i;
    }

    /* renamed from: f */
    public String mo14217f() {
        return this.f11068c;
    }

    /* renamed from: g */
    public String mo14218g() {
        return this.f11071f;
    }

    /* renamed from: h */
    public String mo14219h() {
        return this.f11072g;
    }

    /* renamed from: i */
    public String mo14220i() {
        return this.f11070e;
    }

    /* renamed from: j */
    public String mo14221j() {
        return this.f11078m;
    }

    /* renamed from: k */
    public String mo14222k() {
        return this.f11079n;
    }

    /* renamed from: l */
    public String mo14223l() {
        return this.f11076k;
    }

    /* renamed from: m */
    public Context mo14224m() {
        return this.f11080o;
    }

    /* renamed from: n */
    public String mo14225n() {
        return this.f11073h;
    }

    /* renamed from: o */
    public String mo14226o() {
        return this.f11077l;
    }

    /* renamed from: p */
    public String mo14227p() {
        return this.f11062E;
    }

    /* renamed from: r */
    public boolean mo14229r() {
        return this.f11090y;
    }

    /* renamed from: s */
    public AbstractC3527c mo14230s() {
        return this.f11087v;
    }

    /* renamed from: t */
    public HttpClient mo14231t() {
        return this.f11088w;
    }

    /* renamed from: u */
    public AbstractC3580b mo14232u() {
        return this.f11089x;
    }

    /* renamed from: v */
    public ServiceInterceptor mo14233v() {
        return this.f11065H;
    }

    /* renamed from: c */
    public String mo14214c() {
        return this.f11067b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo14228q() {
        /*
            r3 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r3.f11082q
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            if (r2 == 0) goto L_0x0012
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
        L_0x0012:
            if (r1 != 0) goto L_0x001b
            goto L_0x001c
        L_0x0015:
            r0 = move-exception
            throw r0
        L_0x0017:
            if (r1 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.BdTuringConfig.mo14228q():java.lang.String");
    }

    /* renamed from: com.bytedance.bdturing.BdTuringConfig$a */
    public static class C3511a {

        /* renamed from: a */
        public RegionType f11092a = RegionType.REGION_CN;

        /* renamed from: b */
        public String f11093b;

        /* renamed from: c */
        public String f11094c;

        /* renamed from: d */
        public String f11095d;

        /* renamed from: e */
        public String f11096e;

        /* renamed from: f */
        public String f11097f = "";

        /* renamed from: g */
        public String f11098g;

        /* renamed from: h */
        public Context f11099h;

        /* renamed from: i */
        public String f11100i;

        /* renamed from: j */
        public String f11101j;

        /* renamed from: k */
        public String f11102k;

        /* renamed from: l */
        public boolean f11103l = true;

        /* renamed from: m */
        public boolean f11104m = true;

        /* renamed from: n */
        public AbstractC3527c f11105n;

        /* renamed from: o */
        public HttpClient f11106o;

        /* renamed from: p */
        public AbstractC3580b f11107p;

        /* renamed from: q */
        public String f11108q;

        /* renamed from: r */
        public String f11109r;

        /* renamed from: s */
        public AbstractC3541d f11110s;

        /* renamed from: t */
        public ServiceInterceptor f11111t;

        /* renamed from: a */
        public C3511a mo14235a(AbstractC3527c cVar) {
            this.f11105n = cVar;
            return this;
        }

        /* renamed from: b */
        public C3511a mo14240b(String str) {
            this.f11095d = str;
            return this;
        }

        /* renamed from: c */
        public C3511a mo14241c(String str) {
            this.f11098g = str;
            return this;
        }

        /* renamed from: d */
        public C3511a mo14242d(String str) {
            this.f11096e = str;
            return this;
        }

        /* renamed from: a */
        public C3511a mo14236a(AbstractC3541d dVar) {
            this.f11110s = dVar;
            return this;
        }

        /* renamed from: a */
        public C3511a mo14237a(ServiceInterceptor eVar) {
            this.f11111t = eVar;
            return this;
        }

        /* renamed from: a */
        public C3511a mo14238a(String str) {
            this.f11093b = str;
            return this;
        }

        /* renamed from: a */
        public BdTuringConfig mo14239a(Context context) {
            this.f11099h = context;
            return new BdTuringConfig(this);
        }
    }

    /* renamed from: c */
    public BdTuringConfig mo14213c(String str) {
        this.f11068c = str;
        return this;
    }

    /* renamed from: a */
    public BdTuringConfig mo14206a(RegionType regionType) {
        this.f11066a = regionType;
        return this;
    }

    /* renamed from: b */
    public BdTuringConfig mo14211b(String str) {
        this.f11077l = str;
        return this;
    }

    /* renamed from: a */
    public Pair<String, String> mo14205a(int i) {
        return this.f11081p.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public JSONObject mo14212b(int i) {
        if (i == 1) {
            return this.f11085t;
        }
        if (i != 3) {
            return this.f11086u;
        }
        return this.f11084s;
    }

    /* renamed from: a */
    public BdTuringConfig mo14207a(String str) {
        this.f11073h = str;
        return this;
    }

    /* renamed from: a */
    public void mo14209a(HttpClient aVar) {
        this.f11088w = aVar;
    }

    private BdTuringConfig(C3511a aVar) {
        String str;
        String str2;
        String[] split;
        this.f11071f = "2.2.2.i18n";
        this.f11075j = "Android";
        this.f11076k = "" + Build.VERSION.SDK_INT;
        this.f11078m = Build.BRAND;
        this.f11079n = Build.MODEL;
        this.f11081p = new HashMap<>();
        this.f11084s = null;
        this.f11085t = null;
        this.f11086u = null;
        this.f11091z = null;
        this.f11058A = null;
        this.f11059B = true;
        this.f11060C = null;
        this.f11061D = false;
        this.f11064G = null;
        this.f11066a = aVar.f11092a;
        this.f11067b = aVar.f11093b;
        this.f11068c = aVar.f11094c;
        this.f11069d = aVar.f11095d;
        this.f11070e = aVar.f11096e;
        this.f11072g = aVar.f11097f;
        this.f11074i = aVar.f11098g;
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(aVar.f11108q)) {
            str = locale.toString();
        } else {
            str = aVar.f11108q;
        }
        this.f11082q = str;
        this.f11087v = aVar.f11105n;
        this.f11088w = aVar.f11106o;
        this.f11089x = aVar.f11107p;
        this.f11064G = aVar.f11110s;
        if (TextUtils.isEmpty(aVar.f11108q) && (str2 = this.f11082q) != null && (split = str2.split("_")) != null && split.length > 2) {
            this.f11082q = split[0] + "_" + split[1];
        }
        try {
            this.f11078m = URLEncoder.encode(Build.BRAND, "utf-8");
            this.f11079n = URLEncoder.encode(Build.MODEL, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f11073h = aVar.f11100i;
        this.f11077l = aVar.f11101j;
        this.f11062E = aVar.f11102k;
        this.f11063F = aVar.f11109r;
        this.f11080o = aVar.f11099h;
        this.f11083r = aVar.f11103l;
        this.f11090y = aVar.f11104m;
        this.f11065H = aVar.f11111t;
    }

    /* renamed from: a */
    public BdTuringConfig mo14208a(JSONObject jSONObject, int i) {
        if (i == 3) {
            this.f11084s = jSONObject;
        } else if (i == 1) {
            this.f11085t = jSONObject;
        } else {
            this.f11086u = jSONObject;
        }
        return this;
    }
}
