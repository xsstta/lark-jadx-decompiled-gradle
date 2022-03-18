package com.ss.android.lark.mm.module.player.core;

import com.larksuite.suite.R;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.videoshop.api.AbstractC64099h;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.mm.module.player.core.q */
public class C46691q extends AbstractC64099h.C64100a {

    /* renamed from: a */
    protected AbstractC46598e f117449a;

    /* renamed from: b */
    protected AbstractC46595b f117450b;

    /* renamed from: c */
    private final List<AbstractC46599f> f117451c = new ArrayList();

    /* renamed from: d */
    private float f117452d = 1.0f;

    /* renamed from: e */
    private boolean f117453e = false;

    /* renamed from: a */
    public void mo163959a() {
    }

    /* renamed from: a */
    public void mo163968a(boolean z) {
        this.f117453e = z;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163965a(AbstractC64108o oVar, C64116b bVar, Error error) {
        this.f117449a.mo163711a(MmPlayerStatus.ERROR);
        StringBuilder sb = new StringBuilder();
        sb.append("onError ");
        sb.append(error != null ? error.toString() : "");
        C45855f.m181666e("PlayerListenerAdapter", sb.toString());
        this.f117450b.mo163686b().mo163702a(oVar.mo221910b());
        C45858j.m181677a((int) R.string.MMWeb_G_FailedToLoad);
        C45859k.m181685a(new Runnable(error) {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$Zzfn83SnWLW2KklmJToMYXowd9A */
            public final /* synthetic */ Error f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46691q.this.m184707a((C46691q) this.f$1);
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163966a(AbstractC64108o oVar, C64116b bVar, boolean z) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoSeekComplete");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$RZcIyWRG79EAw0SGP3KgbJKNcCs */

            public final void run() {
                C46691q.this.m184713f();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163967a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2, boolean z3) {
        C45855f.m181664c("PlayerListenerAdapter", "onFullScreen");
        C45859k.m181685a(new Runnable(z) {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$pGwsameFRR3GoL7fIhGtiF2AE */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46691q.this.m184709b((C46691q) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m184708b() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163668j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m184710c() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163667i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m184711d() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163661c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m184712e() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163666h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m184713f() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163665g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m184714g() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163664f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m184715h() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163662d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m184716i() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163660b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m184717j() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163663e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m184718k() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163655a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m184719l() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163669k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m184720m() {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163667i();
        }
    }

    /* renamed from: a */
    public void mo163960a(float f) {
        this.f117452d = f;
    }

    /* renamed from: b */
    public void mo163969b(AbstractC46599f fVar) {
        this.f117451c.remove(fVar);
    }

    /* renamed from: a */
    public void mo163961a(AbstractC46599f fVar) {
        if (!this.f117451c.contains(fVar)) {
            this.f117451c.add(fVar);
        }
    }

    public C46691q(AbstractC46595b bVar) {
        this.f117450b = bVar;
        this.f117449a = bVar.mo163685a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m184704a(int i) {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163656a((long) i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m184705a(AbstractC64108o oVar) {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163657a(oVar.mo221920l());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m184709b(boolean z) {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163659a(z);
        }
    }

    /* renamed from: a */
    private void m184706a(TTVideoEngine tTVideoEngine) {
        PlaybackParams h = this.f117449a.mo163719h();
        if (h == null) {
            h = new PlaybackParams();
        }
        h.setSpeed(this.f117452d);
        tTVideoEngine.setPlaybackParams(h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m184707a(Error error) {
        for (AbstractC46599f fVar : this.f117451c) {
            fVar.mo163658a(error);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo163971c(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoPlay");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$KXCF4HiENwdvdv6BMMudXmlwrgo */

            public final void run() {
                C46691q.this.m184718k();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo163973e(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoPause");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$zHcw8mwWoByfdO4aiexp8vFiQLg */

            public final void run() {
                C46691q.this.m184716i();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo163975g(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoReplay");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$1_W2yARsIMrxevaKw78fMVGPMk8 */

            public final void run() {
                C46691q.this.m184712e();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: i */
    public void mo163977i(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onBufferStart");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$zxvh_MgyTRmxv40Kiu3Rl5BCMI */

            public final void run() {
                C46691q.this.m184710c();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: j */
    public void mo163978j(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onBufferEnd");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$9lm6xOEoxylZQkL_1pPkGwazFz8 */

            public final void run() {
                C46691q.this.m184708b();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo163972d(AbstractC64108o oVar, C64116b bVar) {
        int intOption = oVar.mo221920l().getIntOption(43);
        if (intOption == 2) {
            C45855f.m181664c("PlayerListenerAdapter", "onRenderStart: hardware decoded");
        } else if (intOption == 3) {
            C45855f.m181664c("PlayerListenerAdapter", "onRenderStart: H264 software decoded");
        } else if (intOption == 6) {
            C45855f.m181664c("PlayerListenerAdapter", "onRenderStart: H265 software decoded");
        } else {
            C45855f.m181664c("PlayerListenerAdapter", "onRenderStart");
        }
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$GoMewgAI3BuPVJn11DfoXxP3g */

            public final void run() {
                C46691q.this.m184717j();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo163974f(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoCompleted");
        this.f117449a.mo163711a(MmPlayerStatus.IDLE);
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$nSnWzPR9zhUw6sbEfO4VcVe4x6w */

            public final void run() {
                C46691q.this.m184715h();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: h */
    public void mo163976h(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoPreRelease");
        this.f117449a.mo163711a(MmPlayerStatus.IDLE);
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$tbDhTbfefONiltd0QVO27fSkifI */

            public final void run() {
                C46691q.this.m184711d();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo163970b(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onPrepared");
        this.f117449a.mo163711a(MmPlayerStatus.PREPARED);
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$po6tn4jXf4sdzhnNowFaSiCDkps */

            public final void run() {
                C46691q.this.m184719l();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: k */
    public void mo163979k(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onEngineInitPlay");
        m184706a(oVar.mo221920l());
        this.f117449a.mo163720i();
        if (this.f117453e) {
            oVar.mo221920l().setIntOption(480, 1);
        }
        int c = this.f117450b.mo163686b().mo163708c();
        if (c > 0) {
            oVar.mo221920l().setStartTime(c);
        }
        for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
            oVar.mo221920l().setCustomHeader(entry.getKey(), entry.getValue());
        }
        C45859k.m181685a(new Runnable(oVar) {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$Z43mYx1xVlVWMPg0EYo2mZZ7Jys */
            public final /* synthetic */ AbstractC64108o f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46691q.this.m184705a((C46691q) this.f$1);
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163962a(AbstractC64108o oVar, C64116b bVar) {
        C45855f.m181664c("PlayerListenerAdapter", "onPrepare");
        this.f117449a.mo163711a(MmPlayerStatus.PREPARING);
        this.f117449a.mo163712a(oVar);
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$xF20n0QGfghepRNIkY_0SCAk94 */

            public final void run() {
                C46691q.this.m184720m();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163964a(AbstractC64108o oVar, C64116b bVar, long j) {
        C45855f.m181664c("PlayerListenerAdapter", "onVideoSeekStart");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$0UQ5idGBGgvkcq3u3vi78LspixM */

            public final void run() {
                C46691q.this.m184714g();
            }
        });
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163963a(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        C45859k.m181685a(new Runnable(i) {
            /* class com.ss.android.lark.mm.module.player.core.$$Lambda$q$oL70edOg2UHVx1mkluNUBGDd2Ow */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46691q.this.m184704a((C46691q) this.f$1);
            }
        });
    }
}
