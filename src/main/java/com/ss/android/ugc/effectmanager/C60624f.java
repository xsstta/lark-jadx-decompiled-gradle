package com.ss.android.ugc.effectmanager;

import com.ss.android.ugc.effectmanager.common.C60540i;
import com.ss.android.ugc.effectmanager.common.ThreadFactoryC60514f;
import com.ss.android.ugc.effectmanager.common.cache.EffectCacheManager;
import com.ss.android.ugc.effectmanager.common.cache.EffectDiskLruCache;
import com.ss.android.ugc.effectmanager.common.cachemanager.FileICache;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60531j;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60561a;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60566f;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j;
import com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60581a;
import com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60583b;
import com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c;
import com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60591d;
import com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60592e;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository;
import com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository;
import com.ss.android.ugc.effectmanager.effect.repository.IUpdateTagRepository;
import com.ss.android.ugc.effectmanager.knadapt.KNEPDecryptor;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import com.ss.android.ugc.effectmanager.p3055e.C60553h;
import com.ss.ugc.effectplatform.EffectPlatform;
import com.ss.ugc.effectplatform.EffectPlatformEncryptor;
import com.ss.ugc.effectplatform.util.EffectPlatformAES;
import com.ss.ugc.effectplatform.util.PlatformType;
import com.ss.ugc.effectplatform.util.PlatformUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ss.android.ugc.effectmanager.f */
public class C60624f {

    /* renamed from: a */
    protected IEffectRepository f151596a;

    /* renamed from: b */
    public C60583b f151597b;

    /* renamed from: c */
    public ICache f151598c;

    /* renamed from: d */
    protected C60483a f151599d;

    /* renamed from: e */
    private IEffectListRepository f151600e;

    /* renamed from: f */
    private IFavoriteRepository f151601f;

    /* renamed from: g */
    private IUpdateTagRepository f151602g;

    /* renamed from: h */
    private EffectPlatform f151603h;

    /* renamed from: i */
    private boolean f151604i;

    /* renamed from: b */
    public EffectPlatform mo208013b() {
        return this.f151603h;
    }

    /* renamed from: a */
    public boolean mo208010a() {
        if (!this.f151604i || this.f151603h == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m235559c() {
        String absolutePath = this.f151599d.mo207066a().mo207326k().getAbsolutePath();
        if (this.f151599d.mo207066a().mo207335t() == null) {
            if (EffectCacheManager.f151232b.mo207127a().mo207125a(absolutePath) == null) {
                EffectCacheManager.f151232b.mo207127a().mo207126a(absolutePath, new FileICache(this.f151599d.mo207066a().mo207326k().getAbsolutePath()));
            }
            this.f151598c = EffectCacheManager.f151232b.mo207127a().mo207125a(absolutePath);
            this.f151599d.mo207066a().mo207315a(this.f151598c);
            return;
        }
        this.f151598c = this.f151599d.mo207066a().mo207335t();
        EffectCacheManager.f151232b.mo207127a().mo207126a(absolutePath, this.f151598c);
    }

    /* renamed from: d */
    private void m235560d() {
        this.f151597b = new C60583b(this.f151599d.mo207066a());
        this.f151600e = new C60581a(this.f151599d);
        this.f151596a = new C60584c(this.f151599d);
        this.f151601f = new C60591d(this.f151599d);
        this.f151602g = new C60592e(this.f151599d);
        IEffectListRepository aVar = this.f151600e;
        if (aVar instanceof C60581a) {
            ((C60581a) aVar).mo207414a(new C60581a.AbstractC60582a() {
                /* class com.ss.android.ugc.effectmanager.C60624f.C606251 */

                @Override // com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60581a.AbstractC60582a
                /* renamed from: a */
                public void mo207415a(String str, EffectChannelResponse effectChannelResponse, int i, C60519c cVar) {
                    C60624f.this.f151597b.mo207417a(str, effectChannelResponse, i, cVar);
                }
            });
        }
        IEffectRepository bVar = this.f151596a;
        if (bVar instanceof C60584c) {
            ((C60584c) bVar).mo207419a(new C60584c.AbstractC60590a() {
                /* class com.ss.android.ugc.effectmanager.C60624f.C606262 */

                @Override // com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.AbstractC60590a
                /* renamed from: a */
                public void mo207426a(String str, List<Effect> list, C60519c cVar) {
                    C60624f.this.f151597b.mo207418a(str, list, cVar);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.AbstractC60590a
                /* renamed from: a */
                public void mo207425a(String str, Effect effect, int i, C60519c cVar) {
                    C60624f.this.f151597b.mo207416a(str, effect, i, cVar);
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo208015b(Effect effect) {
        EffectPlatform aVar;
        if (this.f151604i && (aVar = this.f151603h) != null) {
            return aVar.mo227636b(effect);
        }
        if (this.f151599d.mo207066a().mo207317b() == null || !C60531j.m235268a(effect) || !this.f151599d.mo207066a().mo207317b().mo207408a(effect.getFileUrl().getUri())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m235557a(ExecutorService executorService) {
        ExecutorService executorService2;
        C60540i iVar = new C60540i();
        C60540i.C60542a aVar = new C60540i.C60542a();
        boolean z = true;
        if (executorService == null) {
            executorService2 = Executors.newCachedThreadPool(new ThreadFactoryC60514f("EffectManager", true));
        } else {
            executorService2 = executorService;
        }
        if (executorService != null) {
            z = false;
        }
        iVar.mo207282a(aVar.mo207284a(executorService2, z));
        this.f151599d.mo207066a().mo207316a(iVar);
    }

    /* renamed from: b */
    private boolean m235558b(C60549e eVar) {
        if (eVar == null) {
            EPLog.m235180c("EffectManager", "Not set configuration");
        } else if (eVar.mo207312C() == null || eVar.mo207312C().isEmpty()) {
            EPLog.m235180c("EffectManager", "Not set host !!!");
        } else if (eVar.mo207331p() == null) {
            EPLog.m235180c("EffectManager", "Not set json convert");
        } else if (eVar.mo207332q() == null) {
            EPLog.m235180c("EffectManager", "Not set net worker");
        } else if (eVar.mo207326k() != null && eVar.mo207326k().exists()) {
            return true;
        } else {
            EPLog.m235180c("EffectManager", "Cache directory error");
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo208011a(C60549e eVar) {
        if (!m235558b(eVar)) {
            return false;
        }
        this.f151599d = new C60483a(eVar);
        m235557a(eVar.mo207340y());
        m235559c();
        m235560d();
        this.f151604i = UseKNPlatform.f151450a;
        this.f151603h = new EffectPlatform(eVar.mo207314a());
        if (this.f151604i || PlatformUtil.f165131a.mo228354b() != PlatformType.ANDROID) {
            return true;
        }
        if (eVar.mo207314a() != null) {
            EffectPlatformAES.f165107a.mo228309b().mo8626a(eVar.mo207314a().mo227572s().mo8625a());
        }
        EffectPlatformEncryptor.f164860a.mo227730a(KNEPDecryptor.f151435a);
        return true;
    }

    /* renamed from: a */
    public boolean mo208012a(Effect effect) {
        EffectPlatform aVar;
        if (this.f151604i && (aVar = this.f151603h) != null) {
            return aVar.mo227635a(effect);
        }
        if (this.f151599d.mo207066a() != null && (this.f151599d.mo207066a().mo207335t() instanceof EffectDiskLruCache)) {
            ((EffectDiskLruCache) this.f151599d.mo207066a().mo207335t()).mo207130a(effect);
        }
        this.f151596a.mo207413b(effect, null);
        if (this.f151599d.mo207066a().mo207317b() == null || !this.f151599d.mo207066a().mo207317b().mo207407a(effect) || !C60531j.m235268a(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo208007a(Effect effect, AbstractC60570j jVar) {
        IEffectRepository bVar;
        EffectPlatform aVar;
        if (this.f151604i && (aVar = this.f151603h) != null) {
            aVar.mo227631a(effect, C60553h.m235400a(jVar));
        } else if (this.f151599d != null && (bVar = this.f151596a) != null) {
            bVar.mo207412a(effect, jVar);
        } else if (jVar != null) {
            jVar.mo207391a(effect, new C60519c(new IllegalStateException("EffectManager had not been initialized")));
        }
    }

    /* renamed from: a */
    public void mo208009a(String str, String str2, AbstractC60561a aVar) {
        m235556a(str, str2, 1, null, aVar);
    }

    /* renamed from: a */
    private void m235556a(String str, String str2, int i, Map<String, String> map, AbstractC60561a aVar) {
        IEffectListRepository aVar2;
        EffectPlatform aVar3;
        if (this.f151604i && (aVar3 = this.f151603h) != null) {
            aVar3.mo227634a(str, str2, i, map, C60553h.m235398a(aVar));
        } else if (this.f151599d != null && (aVar2 = this.f151600e) != null) {
            aVar2.mo207403a(str, str2, i, map, aVar);
        } else if (aVar != null) {
            aVar.mo207380a(new C60519c(new IllegalStateException("EffectManager had not been initialized")));
        }
    }

    /* renamed from: b */
    public void mo208014b(String str, String str2, int i, int i2, int i3, String str3, AbstractC60566f fVar) {
        IEffectListRepository aVar;
        if (mo208010a()) {
            this.f151603h.mo227632a(str, str2, i, i2, i3, str3, C60553h.m235399a(fVar));
        } else if (this.f151599d != null && (aVar = this.f151600e) != null) {
            aVar.mo207402a(str, str2, i, i2, i3, str3, true, fVar);
        } else if (fVar != null) {
            fVar.mo207386a(new C60519c(new IllegalStateException("EffectManager had not been initialized")));
        }
    }

    /* renamed from: a */
    public void mo208008a(String str, String str2, int i, int i2, int i3, String str3, AbstractC60566f fVar) {
        IEffectListRepository aVar;
        if (mo208010a()) {
            this.f151603h.mo227633a(str, str2, i, i2, i3, str3, null, C60553h.m235399a(fVar));
        } else if (this.f151599d != null && (aVar = this.f151600e) != null) {
            aVar.mo207402a(str, str2, i, i2, i3, str3, false, fVar);
        } else if (fVar != null) {
            fVar.mo207386a(new C60519c(new IllegalStateException("EffectManager had not been initialized")));
        }
    }
}
