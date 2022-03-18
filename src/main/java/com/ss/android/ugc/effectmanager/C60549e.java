package com.ss.android.ugc.effectmanager;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.C60540i;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60509a;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.android.ugc.effectmanager.effect.p3056a.AbstractC60559a;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.C60611a;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNLogger;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.p3065f.p3066a.p3067a.C60627a;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.AlgorithmResourceManager;
import com.ss.ugc.effectplatform.bridge.EffectFetcher;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.util.PlatformUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.effectmanager.e */
public class C60549e {

    /* renamed from: A */
    private Context f151375A;

    /* renamed from: B */
    private List<C60627a> f151376B;

    /* renamed from: C */
    private EffectDownloadManager f151377C;

    /* renamed from: D */
    private int f151378D;

    /* renamed from: E */
    private EffectConfig f151379E;

    /* renamed from: a */
    private String f151380a;

    /* renamed from: b */
    private String f151381b;

    /* renamed from: c */
    private String f151382c;

    /* renamed from: d */
    private String f151383d;

    /* renamed from: e */
    private String f151384e;

    /* renamed from: f */
    private String f151385f;

    /* renamed from: g */
    private String f151386g;

    /* renamed from: h */
    private String f151387h;

    /* renamed from: i */
    private String f151388i;

    /* renamed from: j */
    private File f151389j;

    /* renamed from: k */
    private String f151390k;

    /* renamed from: l */
    private String f151391l;

    /* renamed from: m */
    private String f151392m;

    /* renamed from: n */
    private HashMap<String, String> f151393n;

    /* renamed from: o */
    private C60540i f151394o;

    /* renamed from: p */
    private ICache f151395p;

    /* renamed from: q */
    private int f151396q;

    /* renamed from: r */
    private ArrayList<String> f151397r;

    /* renamed from: s */
    private int f151398s;

    /* renamed from: t */
    private AbstractC60510b f151399t;

    /* renamed from: u */
    private C60515a f151400u;

    /* renamed from: v */
    private AbstractC60511c f151401v;

    /* renamed from: w */
    private ExecutorService f151402w;

    /* renamed from: x */
    private String f151403x;

    /* renamed from: y */
    private C60628g f151404y;

    /* renamed from: z */
    private AbstractC60559a f151405z;

    /* renamed from: A */
    public int mo207310A() {
        return this.f151398s;
    }

    /* renamed from: B */
    public Context mo207311B() {
        return this.f151375A;
    }

    /* renamed from: C */
    public List<C60627a> mo207312C() {
        return this.f151376B;
    }

    /* renamed from: D */
    public int mo207313D() {
        return this.f151378D;
    }

    /* renamed from: a */
    public EffectConfig mo207314a() {
        return this.f151379E;
    }

    /* renamed from: b */
    public EffectDownloadManager mo207317b() {
        return this.f151377C;
    }

    /* renamed from: c */
    public String mo207318c() {
        return this.f151381b;
    }

    /* renamed from: d */
    public String mo207319d() {
        return this.f151382c;
    }

    /* renamed from: e */
    public String mo207320e() {
        return this.f151383d;
    }

    /* renamed from: f */
    public String mo207321f() {
        return this.f151384e;
    }

    /* renamed from: g */
    public String mo207322g() {
        return this.f151385f;
    }

    /* renamed from: h */
    public String mo207323h() {
        return this.f151386g;
    }

    /* renamed from: i */
    public String mo207324i() {
        return this.f151387h;
    }

    /* renamed from: j */
    public String mo207325j() {
        return this.f151380a;
    }

    /* renamed from: k */
    public File mo207326k() {
        return this.f151389j;
    }

    /* renamed from: l */
    public int mo207327l() {
        return this.f151396q;
    }

    /* renamed from: m */
    public String mo207328m() {
        return this.f151390k;
    }

    /* renamed from: n */
    public String mo207329n() {
        return this.f151391l;
    }

    /* renamed from: o */
    public String mo207330o() {
        return this.f151392m;
    }

    /* renamed from: p */
    public AbstractC60510b mo207331p() {
        return this.f151399t;
    }

    /* renamed from: q */
    public C60515a mo207332q() {
        return this.f151400u;
    }

    /* renamed from: r */
    public C60540i mo207333r() {
        return this.f151394o;
    }

    /* renamed from: s */
    public String mo207334s() {
        return this.f151403x;
    }

    /* renamed from: t */
    public ICache mo207335t() {
        return this.f151395p;
    }

    /* renamed from: u */
    public AbstractC60559a mo207336u() {
        return this.f151405z;
    }

    /* renamed from: v */
    public HashMap<String, String> mo207337v() {
        return this.f151393n;
    }

    /* renamed from: w */
    public C60628g mo207338w() {
        return this.f151404y;
    }

    /* renamed from: x */
    public AbstractC60511c mo207339x() {
        return this.f151401v;
    }

    /* renamed from: y */
    public ExecutorService mo207340y() {
        return this.f151402w;
    }

    /* renamed from: z */
    public String mo207341z() {
        return this.f151388i;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.e$a */
    public static final class C60551a {

        /* renamed from: B */
        private static boolean f151406B;

        /* renamed from: A */
        private EffectConfig.Builder f151407A;

        /* renamed from: a */
        public String f151408a;

        /* renamed from: b */
        public String f151409b;

        /* renamed from: c */
        public String f151410c;

        /* renamed from: d */
        public String f151411d;

        /* renamed from: e */
        public String f151412e;

        /* renamed from: f */
        public String f151413f;

        /* renamed from: g */
        public String f151414g;

        /* renamed from: h */
        public String f151415h;

        /* renamed from: i */
        public File f151416i;

        /* renamed from: j */
        public String f151417j;

        /* renamed from: k */
        public String f151418k;

        /* renamed from: l */
        public AbstractC60509a f151419l;

        /* renamed from: m */
        public AbstractC60510b f151420m;

        /* renamed from: n */
        public ICache f151421n;

        /* renamed from: o */
        public int f151422o = 3;

        /* renamed from: p */
        public String f151423p;

        /* renamed from: q */
        public AbstractC60559a f151424q;

        /* renamed from: r */
        public AbstractC60511c f151425r;

        /* renamed from: s */
        public ExecutorService f151426s;

        /* renamed from: t */
        public String f151427t;

        /* renamed from: u */
        public HashMap<String, String> f151428u = new HashMap<>();

        /* renamed from: v */
        public ArrayList<String> f151429v;

        /* renamed from: w */
        public int f151430w;

        /* renamed from: x */
        public Context f151431x;

        /* renamed from: y */
        public List<C60627a> f151432y;

        /* renamed from: z */
        public int f151433z;

        /* renamed from: b */
        public EffectConfig mo207352b() {
            return this.f151407A.mo227585F();
        }

        public C60551a() {
            if (!f151406B) {
                if (UseKNPlatform.f151450a) {
                    EPLog.m235175a(PlatformUtil.f165131a.mo228353a());
                } else {
                    EPLog.m235175a(EPUtils.m235253a());
                }
                f151406B = true;
            }
            this.f151407A = new EffectConfig.Builder();
        }

        /* renamed from: a */
        public C60549e mo207350a() {
            return new C60549e(this);
        }

        /* renamed from: a */
        public C60551a mo207342a(int i) {
            this.f151422o = i;
            this.f151407A.mo227586a(i);
            return this;
        }

        /* renamed from: b */
        public C60551a mo207351b(String str) {
            this.f151409b = str;
            this.f151407A.mo227596b(str);
            return this;
        }

        /* renamed from: c */
        public C60551a mo207353c(String str) {
            this.f151410c = str;
            this.f151407A.mo227598c(str);
            return this;
        }

        /* renamed from: d */
        public C60551a mo207354d(String str) {
            this.f151411d = str;
            this.f151407A.mo227600d(str);
            return this;
        }

        /* renamed from: e */
        public C60551a mo207355e(String str) {
            this.f151412e = str;
            this.f151407A.mo227602e(str);
            return this;
        }

        /* renamed from: f */
        public C60551a mo207356f(String str) {
            this.f151413f = str;
            this.f151407A.mo227604f(str);
            return this;
        }

        /* renamed from: g */
        public C60551a mo207357g(String str) {
            this.f151414g = str;
            this.f151407A.mo227606g(str);
            return this;
        }

        /* renamed from: a */
        public C60551a mo207343a(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.f151431x = applicationContext;
            this.f151407A.mo227593a(applicationContext);
            return this;
        }

        /* renamed from: a */
        public C60551a mo207344a(AbstractC60509a aVar) {
            this.f151419l = aVar;
            this.f151407A.mo227591a((INetworkClient) new KNNetworkClient(aVar));
            return this;
        }

        /* renamed from: a */
        public C60551a mo207345a(AbstractC60510b bVar) {
            this.f151420m = bVar;
            this.f151407A.mo227590a(new IJsonConverter(new KNJsonConverter(bVar)));
            return this;
        }

        /* renamed from: a */
        public C60551a mo207346a(AbstractC60559a aVar) {
            this.f151424q = aVar;
            if (aVar != null && "DownloadableModelSupportEffectFetcher".equals(aVar.getClass().getSimpleName()) && AlgorithmResourceManager.m256708d()) {
                this.f151407A.mo227589a((EffectFetcher) AlgorithmResourceManager.m256707c().mo227715b());
            }
            return this;
        }

        /* renamed from: a */
        public C60551a mo207347a(File file) {
            this.f151416i = file;
            if (file == null) {
                return this;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f151407A.mo227608h(file.getAbsolutePath());
            return this;
        }

        /* renamed from: a */
        public C60551a mo207348a(String str) {
            this.f151408a = str;
            this.f151407A.mo227594a(str);
            return this;
        }

        /* renamed from: a */
        public C60551a mo207349a(List<C60627a> list) {
            this.f151432y = list;
            if (!list.isEmpty()) {
                this.f151407A.mo227614k(list.get(0).mo208018c());
            }
            return this;
        }
    }

    /* renamed from: a */
    public void mo207315a(ICache bVar) {
        this.f151395p = bVar;
    }

    /* renamed from: a */
    public void mo207316a(C60540i iVar) {
        this.f151394o = iVar;
    }

    private C60549e(C60551a aVar) {
        String str;
        String str2;
        String str3;
        AbstractC60559a aVar2;
        this.f151385f = "online";
        this.f151393n = new HashMap<>();
        this.f151396q = 3;
        this.f151380a = "/effect/api";
        this.f151381b = aVar.f151408a;
        this.f151382c = aVar.f151409b;
        this.f151383d = aVar.f151410c;
        this.f151384e = aVar.f151411d;
        this.f151385f = (TextUtils.equals("test", aVar.f151412e) || TextUtils.equals("local_test", aVar.f151412e)) ? "test" : str;
        if (aVar.f151413f == null) {
            str2 = "android";
        } else {
            str2 = aVar.f151413f;
        }
        this.f151386g = str2;
        this.f151387h = aVar.f151414g;
        this.f151375A = aVar.f151431x;
        if (aVar.f151416i != null || this.f151375A == null) {
            this.f151389j = aVar.f151416i;
        } else {
            this.f151389j = new File(this.f151375A.getFilesDir(), "effect");
        }
        this.f151389j = aVar.f151416i;
        this.f151400u = new C60515a(aVar.f151419l, aVar.f151431x);
        this.f151390k = aVar.f151417j;
        this.f151395p = aVar.f151421n;
        this.f151396q = aVar.f151422o;
        this.f151399t = aVar.f151420m;
        if (aVar.f151418k == null) {
            str3 = "0";
        } else {
            str3 = aVar.f151418k;
        }
        this.f151391l = str3;
        this.f151392m = aVar.f151423p;
        this.f151393n = aVar.f151428u;
        this.f151401v = aVar.f151425r;
        this.f151402w = aVar.f151426s;
        if (aVar.f151424q == null) {
            aVar2 = new C60611a(this.f151400u, this.f151401v, this.f151391l, this.f151381b);
        } else {
            aVar2 = aVar.f151424q;
        }
        this.f151405z = aVar2;
        this.f151403x = aVar.f151427t;
        this.f151404y = new C60628g();
        this.f151377C = EffectDownloadManager.f151455a;
        this.f151397r = aVar.f151429v;
        this.f151388i = aVar.f151415h;
        this.f151398s = aVar.f151430w;
        this.f151376B = aVar.f151432y;
        this.f151378D = aVar.f151433z;
        EffectConfig b = aVar.mo207352b();
        this.f151379E = b;
        b.mo227553a(KNLogger.f151439a);
    }
}
