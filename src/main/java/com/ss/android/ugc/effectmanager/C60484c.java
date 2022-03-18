package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.AbstractC60547d;
import com.ss.android.ugc.effectmanager.common.C60512d;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.common.p3053h.C60531j;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3056a.AbstractC60559a;
import com.ss.android.ugc.effectmanager.knadapt.KNEPDecryptor;
import com.ss.android.ugc.effectmanager.knadapt.KNResourceFinder;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.p3042a.C60467a;
import com.ss.android.ugc.effectmanager.p3042a.C60468b;
import com.ss.android.ugc.effectmanager.p3042a.C60471c;
import com.ss.ugc.effectplatform.EffectPlatformEncryptor;
import com.ss.ugc.effectplatform.algorithm.AlgorithmResourceManager;
import com.ss.ugc.effectplatform.util.EffectPlatformAES;
import com.ss.ugc.effectplatform.util.PlatformType;
import com.ss.ugc.effectplatform.util.PlatformUtil;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.effectmanager.c */
public final class C60484c {

    /* renamed from: a */
    static AbstractC60547d f151170a = new AbstractC60547d.C60548a();

    /* renamed from: c */
    private static C60484c f151171c;

    /* renamed from: b */
    public C60471c f151172b;

    /* renamed from: d */
    private final C60467a f151173d;

    /* renamed from: e */
    private final String f151174e;

    /* renamed from: f */
    private final C60515a f151175f;

    /* renamed from: g */
    private final String f151176g;

    /* renamed from: h */
    private final DownloadableModelConfig f151177h;

    /* renamed from: i */
    private DownloadableModelSupportEffectFetcher f151178i;

    /* renamed from: j */
    private DownloadableModelSupportResourceFinder f151179j;

    /* renamed from: k */
    private KNResourceFinder f151180k;

    /* renamed from: l */
    private boolean f151181l = UseKNPlatform.f151450a;

    /* renamed from: m */
    private IModelCache f151182m;

    /* renamed from: a */
    public static boolean m235023a() {
        if (f151171c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public AbstractC60559a mo207071c() {
        return mo207072d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public DownloadableModelSupportEffectFetcher mo207072d() {
        return f151171c.mo207073e();
    }

    /* renamed from: f */
    public DownloadableModelSupportResourceFinder mo207074f() {
        return m235027h();
    }

    /* renamed from: b */
    public static C60484c m235025b() {
        C60484c cVar = f151171c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("downloadableModelSupport not initialize");
    }

    /* renamed from: g */
    private void m235026g() {
        C60471c cVar = new C60471c(this.f151177h);
        this.f151172b = cVar;
        cVar.mo207027a(this.f151182m);
    }

    /* renamed from: i */
    private DownloadableModelSupportResourceFinder m235028i() {
        if (this.f151180k == null) {
            this.f151180k = new KNResourceFinder(AlgorithmResourceManager.m256707c().mo227712a());
        }
        return this.f151180k;
    }

    /* renamed from: e */
    public DownloadableModelSupportEffectFetcher mo207073e() {
        if (this.f151178i == null) {
            this.f151178i = new DownloadableModelSupportEffectFetcher(this.f151177h, this.f151182m, this.f151175f, this.f151172b);
        }
        return this.f151178i;
    }

    /* renamed from: h */
    private DownloadableModelSupportResourceFinder m235027h() {
        if (this.f151181l && AlgorithmResourceManager.m256708d()) {
            return m235028i();
        }
        if (this.f151179j == null) {
            this.f151179j = new DownloadableModelSupportResourceFinder(this.f151172b, this.f151182m, this.f151177h, this.f151173d);
        }
        return this.f151179j;
    }

    /* renamed from: a */
    private boolean m235024a(String str) {
        boolean isResourceAvailable = m235027h().isResourceAvailable(str);
        try {
            if (!mo207072d().collectNeedDownloadModelsListNonBlocking(new String[]{str}).isEmpty()) {
                isResourceAvailable = false;
            }
            return isResourceAvailable;
        } catch (Exception unused) {
            return false;
        }
    }

    private C60484c(DownloadableModelConfig downloadableModelConfig) {
        C60467a aVar = new C60467a(downloadableModelConfig.mo206973b(), downloadableModelConfig.mo206981j());
        this.f151173d = aVar;
        String c = downloadableModelConfig.mo206974c();
        this.f151174e = c;
        this.f151175f = new C60515a(downloadableModelConfig.mo206975d(), downloadableModelConfig.mo206989r());
        String i = downloadableModelConfig.mo206980i();
        this.f151176g = i;
        this.f151177h = downloadableModelConfig;
        this.f151182m = C60468b.m234951a(c, i, aVar);
    }

    /* renamed from: a */
    public static void m235022a(DownloadableModelConfig downloadableModelConfig) {
        Objects.requireNonNull(downloadableModelConfig);
        if (f151171c == null) {
            C60484c cVar = new C60484c(downloadableModelConfig);
            f151171c = cVar;
            cVar.m235026g();
            if (UseKNPlatform.f151450a && downloadableModelConfig.mo206988q() != null && !AlgorithmResourceManager.m256708d()) {
                AlgorithmResourceManager.m256706a(downloadableModelConfig.mo206988q());
            }
            if (!UseKNPlatform.f151450a && PlatformUtil.f165131a.mo228354b() == PlatformType.ANDROID) {
                if (downloadableModelConfig.mo206988q() != null) {
                    EffectPlatformAES.f165107a.mo228309b().mo8626a(downloadableModelConfig.mo206988q().mo227572s().mo8625a());
                }
                EffectPlatformEncryptor.f164860a.mo227730a(KNEPDecryptor.f151435a);
                return;
            }
            return;
        }
        throw new IllegalStateException("Duplicate initialization");
    }

    /* renamed from: a */
    public boolean mo207069a(C60624f fVar, Effect effect) {
        if (this.f151181l && AlgorithmResourceManager.m256708d() && fVar.mo208013b() != null) {
            return AlgorithmResourceManager.m256707c().mo227713a(fVar.mo208013b(), effect);
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = fVar.mo208012a(effect);
        if (a) {
            a = mo207070b(fVar, effect);
        }
        EPLog.m235179b("DownloadableModelSupport", "effect: " + effect.getEffectId() + " name: " + effect.getName() + " result: " + a + " time cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        return a;
    }

    /* renamed from: b */
    public boolean mo207070b(C60624f fVar, Effect effect) {
        boolean z;
        String str;
        if (this.f151181l && AlgorithmResourceManager.m256708d()) {
            return AlgorithmResourceManager.m256707c().mo227714a(effect);
        }
        if (C60531j.m235270b(effect)) {
            StringBuilder sb = new StringBuilder();
            sb.append("decrypt error effect_id: ");
            sb.append(effect.getId());
            sb.append(", effect_name: ");
            sb.append(effect.getName());
            sb.append(", requirements_sec: ");
            if (effect.getRequirements_sec() != null) {
                str = effect.getRequirements_sec().toString();
            } else {
                str = "";
            }
            sb.append(str);
            EPLog.m235179b("DownloadableModelSupport", sb.toString());
            return false;
        }
        String[] b = AlgorithmUtils.m235017b(effect);
        if (b == null || b.length == 0) {
            EPLog.m235179b("DownloadableModelSupport", "effect: " + effect.getEffectId() + " name: " + effect.getName() + " returned empty resourceNameArrayOfEffect");
            return true;
        }
        for (String str2 : b) {
            if (AlgorithmModelInfoMemoryCache.m234943a()) {
                z = AlgorithmModelInfoMemoryCache.m234944a(C60512d.m235165a(str2));
                if (!z) {
                    z = m235024a(str2);
                }
            } else {
                z = m235024a(str2);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
