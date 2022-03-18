package com.ss.android.ugc.effectmanager;

import android.content.Context;
import android.content.res.AssetManager;
import bytekn.foundation.concurrent.executor.ExecutorService;
import bytekn.foundation.logger.ILogger;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60509a;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60538q;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutor;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.p3055e.C60557i;
import com.ss.android.ugc.effectmanager.p3065f.p3066a.p3067a.C60627a;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class DownloadableModelConfig {

    /* renamed from: a */
    private final AssetManager f151075a;

    /* renamed from: b */
    private final String f151076b;

    /* renamed from: c */
    private final AbstractC60509a f151077c;

    /* renamed from: d */
    private final List<C60627a> f151078d;

    /* renamed from: e */
    private final AbstractC60510b f151079e;

    /* renamed from: f */
    private final Executor f151080f;

    /* renamed from: g */
    private final String f151081g;

    /* renamed from: h */
    private final String f151082h;

    /* renamed from: i */
    private final Pattern f151083i;

    /* renamed from: j */
    private final ModelEventListener f151084j;

    /* renamed from: k */
    private final C60549e f151085k;

    /* renamed from: l */
    private final ModelFileEnv f151086l;

    /* renamed from: m */
    private final String f151087m;

    /* renamed from: n */
    private final String f151088n;

    /* renamed from: o */
    private final AbstractC60511c f151089o;

    /* renamed from: p */
    private final FetchModelType f151090p;

    /* renamed from: q */
    private final Context f151091q;

    /* renamed from: r */
    private EffectConfig f151092r;

    public enum ModelFileEnv {
        TEST,
        ONLINE
    }

    /* renamed from: a */
    public ModelFileEnv mo206972a() {
        return this.f151086l;
    }

    /* renamed from: b */
    public AssetManager mo206973b() {
        return this.f151075a;
    }

    /* renamed from: c */
    public String mo206974c() {
        return this.f151076b;
    }

    /* renamed from: d */
    public AbstractC60509a mo206975d() {
        return this.f151077c;
    }

    /* renamed from: e */
    public List<C60627a> mo206976e() {
        return this.f151078d;
    }

    /* renamed from: f */
    public AbstractC60510b mo206977f() {
        return this.f151079e;
    }

    /* renamed from: g */
    public Executor mo206978g() {
        return this.f151080f;
    }

    /* renamed from: h */
    public String mo206979h() {
        return this.f151081g;
    }

    /* renamed from: i */
    public String mo206980i() {
        return this.f151082h;
    }

    /* renamed from: j */
    public Pattern mo206981j() {
        return this.f151083i;
    }

    /* renamed from: k */
    public ModelEventListener mo206982k() {
        return this.f151084j;
    }

    /* renamed from: l */
    public String mo206983l() {
        return this.f151087m;
    }

    /* renamed from: m */
    public String mo206984m() {
        return this.f151088n;
    }

    /* renamed from: n */
    public AbstractC60511c mo206985n() {
        return this.f151089o;
    }

    /* renamed from: o */
    public FetchModelType mo206986o() {
        return this.f151090p;
    }

    /* renamed from: p */
    public C60549e mo206987p() {
        return this.f151085k;
    }

    /* renamed from: q */
    public EffectConfig mo206988q() {
        return this.f151092r;
    }

    /* renamed from: r */
    public Context mo206989r() {
        return this.f151091q;
    }

    /* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelConfig$a */
    public static final class C60466a {

        /* renamed from: a */
        AssetManager f151094a;

        /* renamed from: b */
        String f151095b;

        /* renamed from: c */
        AbstractC60509a f151096c;

        /* renamed from: d */
        List<C60627a> f151097d = new ArrayList();

        /* renamed from: e */
        AbstractC60510b f151098e;

        /* renamed from: f */
        Executor f151099f;

        /* renamed from: g */
        String f151100g;

        /* renamed from: h */
        String f151101h;

        /* renamed from: i */
        String f151102i;

        /* renamed from: j */
        String f151103j;

        /* renamed from: k */
        AbstractC60511c f151104k;

        /* renamed from: l */
        Pattern f151105l;

        /* renamed from: m */
        ModelEventListener f151106m;

        /* renamed from: n */
        ModelFileEnv f151107n;

        /* renamed from: o */
        FetchModelType f151108o;

        /* renamed from: p */
        C60549e f151109p;

        /* renamed from: q */
        Context f151110q;

        /* renamed from: r */
        private EffectConfig.Builder f151111r = new EffectConfig.Builder();

        /* renamed from: b */
        public EffectConfig mo207001b() {
            return this.f151111r.mo227585F();
        }

        /* renamed from: a */
        public DownloadableModelConfig mo206999a() {
            return new DownloadableModelConfig(this);
        }

        /* renamed from: a */
        public C60466a mo206991a(AssetManager assetManager) {
            this.f151094a = assetManager;
            return this;
        }

        /* renamed from: a */
        public C60466a mo206996a(String str) {
            this.f151095b = str;
            this.f151111r.mo227610i(str);
            return this;
        }

        /* renamed from: b */
        public C60466a mo207000b(String str) {
            this.f151100g = str;
            this.f151111r.mo227606g(str);
            return this;
        }

        /* renamed from: c */
        public C60466a mo207002c(String str) {
            this.f151101h = str;
            this.f151111r.mo227596b(str);
            return this;
        }

        /* renamed from: d */
        public C60466a mo207003d(String str) {
            this.f151102i = str;
            this.f151111r.mo227612j(str);
            return this;
        }

        /* renamed from: e */
        public C60466a mo207004e(String str) {
            this.f151103j = str;
            this.f151111r.mo227594a(str);
            return this;
        }

        /* renamed from: a */
        public C60466a mo206990a(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.f151110q = applicationContext;
            this.f151111r.mo227593a(applicationContext);
            return this;
        }

        /* renamed from: a */
        public C60466a mo206992a(ModelFileEnv modelFileEnv) {
            this.f151107n = modelFileEnv;
            this.f151111r.mo227588a(C60557i.m235415a(modelFileEnv));
            return this;
        }

        /* renamed from: a */
        public C60466a mo206993a(FetchModelType fetchModelType) {
            this.f151108o = fetchModelType;
            this.f151111r.mo227592a(C60557i.m235416a(fetchModelType));
            return this;
        }

        /* renamed from: a */
        public C60466a mo206994a(AbstractC60509a aVar) {
            this.f151096c = aVar;
            this.f151111r.mo227591a((INetworkClient) new KNNetworkClient(aVar));
            return this;
        }

        /* renamed from: a */
        public C60466a mo206995a(AbstractC60510b bVar) {
            this.f151098e = bVar;
            this.f151111r.mo227590a(new IJsonConverter(new KNJsonConverter(bVar)));
            return this;
        }

        /* renamed from: a */
        public C60466a mo206997a(List<C60627a> list) {
            this.f151097d.addAll(list);
            if (!list.isEmpty()) {
                this.f151111r.mo227614k(list.get(0).mo208018c());
            }
            return this;
        }

        /* renamed from: a */
        public C60466a mo206998a(Executor executor) {
            this.f151099f = executor;
            this.f151111r.mo227587a((ExecutorService) new KNExecutor(executor));
            return this;
        }
    }

    private DownloadableModelConfig(C60466a aVar) {
        ModelFileEnv modelFileEnv;
        FetchModelType fetchModelType;
        this.f151075a = (AssetManager) C60538q.m235322a(aVar.f151094a);
        this.f151076b = (String) C60538q.m235322a(aVar.f151095b);
        this.f151077c = (AbstractC60509a) C60538q.m235322a(aVar.f151096c);
        this.f151078d = Collections.unmodifiableList(aVar.f151097d);
        this.f151079e = (AbstractC60510b) C60538q.m235322a(aVar.f151098e);
        this.f151080f = (Executor) C60538q.m235322a(aVar.f151099f);
        this.f151081g = (String) C60538q.m235322a(aVar.f151100g);
        this.f151082h = (String) C60538q.m235322a(aVar.f151101h);
        this.f151087m = (String) C60538q.m235322a(aVar.f151102i);
        this.f151088n = (String) C60538q.m235322a(aVar.f151103j);
        this.f151089o = aVar.f151104k;
        this.f151083i = aVar.f151105l;
        this.f151084j = aVar.f151106m;
        if (aVar.f151107n == null) {
            modelFileEnv = ModelFileEnv.ONLINE;
        } else {
            modelFileEnv = aVar.f151107n;
        }
        this.f151086l = modelFileEnv;
        if (aVar.f151108o == null) {
            fetchModelType = FetchModelType.ORIGIN;
        } else {
            fetchModelType = aVar.f151108o;
        }
        this.f151090p = fetchModelType;
        this.f151085k = aVar.f151109p;
        this.f151091q = aVar.f151110q;
        EffectConfig b = aVar.mo207001b();
        this.f151092r = b;
        if (b != null) {
            b.mo227553a(new ILogger() {
                /* class com.ss.android.ugc.effectmanager.DownloadableModelConfig.C604651 */

                @Override // bytekn.foundation.logger.ILogger
                /* renamed from: a */
                public boolean mo8659a() {
                    return EPLog.f151297a.mo207194a();
                }

                @Override // bytekn.foundation.logger.ILogger
                /* renamed from: a */
                public void mo8657a(String str, String str2) {
                    EPLog.m235179b(str, str2);
                }

                @Override // bytekn.foundation.logger.ILogger
                /* renamed from: b */
                public void mo8660b(String str, String str2) {
                    EPLog.m235180c(str, str2);
                }

                @Override // bytekn.foundation.logger.ILogger
                /* renamed from: a */
                public void mo8658a(String str, String str2, Throwable th) {
                    EPLog.m235177a(str, str2, th);
                }
            });
        }
    }
}
