package com.ss.android.ugc.effectmanager.effect.p3058c.p3060b;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.common.HandlerC60543j;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60530h;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60562b;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60563c;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60564d;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60565e;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60568h;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60572l;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60575o;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60579s;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60593a;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60596d;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60600h;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60603k;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60604l;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60606n;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60609q;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60615b;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.p3064a.C60619e;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.p3043b.C60483a;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.c */
public class C60584c implements HandlerC60543j.AbstractC60544a, IEffectRepository {

    /* renamed from: a */
    public Handler f151464a = new HandlerC60543j(this);

    /* renamed from: b */
    private C60549e f151465b;

    /* renamed from: c */
    private C60483a f151466c;

    /* renamed from: d */
    private AbstractC60590a f151467d;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.c.b.c$a */
    public interface AbstractC60590a {
        /* renamed from: a */
        void mo207425a(String str, Effect effect, int i, C60519c cVar);

        /* renamed from: a */
        void mo207426a(String str, List<Effect> list, C60519c cVar);
    }

    /* renamed from: a */
    public void mo207419a(AbstractC60590a aVar) {
        this.f151467d = aVar;
    }

    public C60584c(C60483a aVar) {
        this.f151466c = aVar;
        this.f151465b = aVar.mo207066a();
    }

    @Override // com.ss.android.ugc.effectmanager.common.HandlerC60543j.AbstractC60544a
    /* renamed from: a */
    public void mo207058a(Message message) {
        if (this.f151467d != null) {
            if (message.what == 15 && (message.obj instanceof C60597e)) {
                C60597e eVar = (C60597e) message.obj;
                Effect b = eVar.mo207439b();
                C60519c c = eVar.mo207440c();
                if (c == null) {
                    this.f151467d.mo207425a(eVar.mo207215a(), b, 20, null);
                } else {
                    this.f151467d.mo207425a(eVar.mo207215a(), b, 26, c);
                }
            }
            if (message.what == 17 && (message.obj instanceof C60596d)) {
                C60596d dVar = (C60596d) message.obj;
                C60519c c2 = dVar.mo207436c();
                if (c2 == null) {
                    this.f151467d.mo207426a(dVar.mo207215a(), dVar.mo207435b(), null);
                } else {
                    this.f151467d.mo207426a(dVar.mo207215a(), dVar.mo207435b(), c2);
                }
            }
            if (message.what == 23 && (message.obj instanceof C60600h)) {
                C60600h hVar = (C60600h) message.obj;
                C60519c c3 = hVar.mo207449c();
                AbstractC60568h e = this.f151465b.mo207338w().mo208033e(hVar.mo207215a());
                if (e != null) {
                    if (c3 == null) {
                        e.mo207223a(hVar.mo207448b());
                    } else {
                        e.mo207388a(c3);
                    }
                    this.f151465b.mo207338w().mo208034f(hVar.mo207215a());
                }
            }
            if (message.what == 24 && (message.obj instanceof C60603k)) {
                C60603k kVar = (C60603k) message.obj;
                C60519c c4 = kVar.mo207455c();
                AbstractC60575o oVar = (AbstractC60575o) this.f151465b.mo207338w().mo208045q(kVar.mo207215a());
                if (oVar != null) {
                    if (c4 == null) {
                        oVar.mo207223a(kVar.mo207454b());
                    } else {
                        oVar.mo207396a(c4);
                    }
                }
                this.f151465b.mo207338w().mo208046r(kVar.mo207215a());
            }
            if (message.what == 60 && (message.obj instanceof C60609q)) {
                C60609q qVar = (C60609q) message.obj;
                C60519c c5 = qVar.mo207465c();
                AbstractC60579s sVar = (AbstractC60579s) this.f151465b.mo207338w().mo208045q(qVar.mo207215a());
                if (sVar != null) {
                    if (c5 == null) {
                        sVar.mo207223a(qVar.mo207464b());
                    } else {
                        sVar.mo207400a(c5);
                    }
                    this.f151465b.mo207338w().mo208046r(qVar.mo207215a());
                }
            }
            if (message.what == 62 && (message.obj instanceof C60604l)) {
                C60604l lVar = (C60604l) message.obj;
                C60519c c6 = lVar.mo207457c();
                AbstractC60572l lVar2 = (AbstractC60572l) this.f151465b.mo207338w().mo208045q(lVar.mo207215a());
                if (lVar2 != null) {
                    if (c6 == null) {
                        lVar2.mo207223a(lVar.mo207456b());
                    } else {
                        lVar2.mo207393a(c6);
                    }
                    this.f151465b.mo207338w().mo208046r(lVar.mo207215a());
                }
            }
            if (message.what == 19 && (message.obj instanceof C60593a)) {
                C60593a aVar = (C60593a) message.obj;
                C60519c c7 = aVar.mo207428c();
                AbstractC60562b C = this.f151465b.mo207338w().mo208022C(aVar.mo207215a());
                if (C != null) {
                    if (c7 == null) {
                        C.mo207223a(aVar.mo207427b());
                    } else {
                        C.mo207382a(aVar.mo207427b(), aVar.mo207428c());
                    }
                }
                this.f151465b.mo207338w().mo208023D(aVar.mo207215a());
            }
            if (message.what == 54 && (message.obj instanceof C60593a)) {
                C60593a aVar2 = (C60593a) message.obj;
                AbstractC60562b C2 = this.f151465b.mo207338w().mo208022C(aVar2.mo207215a());
                if (C2 instanceof AbstractC60563c) {
                    ((AbstractC60563c) C2).mo207383a(aVar2.mo207427b(), aVar2.mo207429d(), aVar2.mo207430e());
                }
            }
            if (message.what == 42 && (message.obj instanceof C60597e)) {
                C60597e eVar2 = (C60597e) message.obj;
                AbstractC60570j g = this.f151465b.mo207338w().mo208035g(eVar2.mo207215a());
                if (g != null) {
                    g.mo207390a(eVar2.mo207439b());
                }
            }
            if (message.what == 53 && (message.obj instanceof C60597e)) {
                C60597e eVar3 = (C60597e) message.obj;
                AbstractC60570j g2 = this.f151465b.mo207338w().mo208035g(eVar3.mo207215a());
                if (g2 instanceof AbstractC60564d) {
                    ((AbstractC60564d) g2).mo207384a(eVar3.mo207439b(), eVar3.mo207441d(), eVar3.mo207442e());
                }
            }
            if (message.what == 61 && (message.obj instanceof C60606n)) {
                C60606n nVar = (C60606n) message.obj;
                C60519c c8 = nVar.mo207461c();
                AbstractC60565e eVar4 = (AbstractC60565e) this.f151465b.mo207338w().mo208045q(nVar.mo207215a());
                if (eVar4 != null) {
                    if (c8 == null) {
                        eVar4.mo207223a(nVar.mo207460b());
                    } else {
                        eVar4.mo207385a(c8);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    /* renamed from: b */
    public String mo207413b(Effect effect, AbstractC60570j jVar) {
        String a = TaskUtil.f151362a.mo207279a();
        this.f151466c.mo207066a().mo207338w().mo208029a(a, jVar);
        this.f151465b.mo207333r().mo207281a(new C60619e(this.f151466c, effect, this.f151464a, a));
        return a;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    /* renamed from: a */
    public synchronized String mo207412a(Effect effect, final AbstractC60570j jVar) {
        EffectDownloadManager b = this.f151466c.mo207066a().mo207317b();
        if (b == null || !b.mo207408a(C60530h.m235257a(effect))) {
            if (b != null) {
                b.mo207411d(effect);
            }
            String a = TaskUtil.f151362a.mo207279a();
            this.f151466c.mo207066a().mo207338w().mo208029a(a, jVar);
            C60615b bVar = new C60615b(effect, this.f151466c, a, this.f151464a);
            this.f151467d.mo207425a("", effect, 21, null);
            this.f151465b.mo207333r().mo207281a(bVar);
            return a;
        }
        if (jVar != null) {
            jVar.mo207390a(effect);
            b.mo207406a(effect, new AbstractC60564d() {
                /* class com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.C605851 */

                @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j
                /* renamed from: a */
                public void mo207390a(final Effect effect) {
                    C60584c.this.f151464a.post(new Runnable() {
                        /* class com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.C605851.RunnableC605883 */

                        public void run() {
                            jVar.mo207390a(effect);
                        }
                    });
                }

                /* renamed from: b */
                public void mo207223a(final Effect effect) {
                    C60584c.this.f151464a.post(new Runnable() {
                        /* class com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.C605851.RunnableC605894 */

                        public void run() {
                            jVar.mo207223a((Object) effect);
                        }
                    });
                }

                @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j
                /* renamed from: a */
                public void mo207391a(final Effect effect, final C60519c cVar) {
                    C60584c.this.f151464a.post(new Runnable() {
                        /* class com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.C605851.RunnableC605872 */

                        public void run() {
                            jVar.mo207391a(effect, cVar);
                        }
                    });
                }

                @Override // com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60564d
                /* renamed from: a */
                public void mo207384a(final Effect effect, final int i, final long j) {
                    if (jVar instanceof AbstractC60564d) {
                        C60584c.this.f151464a.post(new Runnable() {
                            /* class com.ss.android.ugc.effectmanager.effect.p3058c.p3060b.C60584c.C605851.RunnableC605861 */

                            public void run() {
                                ((AbstractC60564d) jVar).mo207384a(effect, i, j);
                            }
                        });
                    }
                }
            });
        }
        return "";
    }
}
