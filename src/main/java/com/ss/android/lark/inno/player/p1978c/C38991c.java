package com.ss.android.lark.inno.player.p1978c;

import com.ss.android.lark.inno.player.core.AbstractC39006g;
import com.ss.android.lark.inno.player.core.C39009j;
import com.ss.android.lark.inno.player.core.VcVideoPlayerStatus;
import com.ss.android.lark.inno.player.p1974b.p1977c.C38947a;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineSimpleCallback;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.inno.player.c.c */
public class C38991c extends VideoEngineSimpleCallback implements AbstractC39006g {

    /* renamed from: a */
    private List<AbstractC38995d> f100171a = new ArrayList();

    /* renamed from: b */
    private C38947a f100172b;

    /* renamed from: c */
    private C39009j f100173c;

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onABRPredictBitrate(int i, int i2) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onBufferEnd(int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onBufferStart(int i, int i2, int i3) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onFrameDraw(int i, Map map) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onSARChanged(int i, int i2) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoStreamBitrateChanged(Resolution resolution, int i) {
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoURLRouteFailed(Error error, String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m153880f() {
        this.f100171a.clear();
        this.f100172b.mo142548b();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m153881g() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$h8izcSXghwL2p6h6Zxsd44J4CM */

            public final void run() {
                C38991c.m270584lambda$h8izcSXghwL2p6h6Zxsd44J4CM(C38991c.this);
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39006g
    /* renamed from: a */
    public void mo142569a() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$NQU0hFUrZcCpLA_bvtXydRLTb6Q */

            public final void run() {
                C38991c.lambda$NQU0hFUrZcCpLA_bvtXydRLTb6Q(C38991c.this);
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39006g
    /* renamed from: b */
    public void mo142575b() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$oTdd2fP51GETEQb0FitR4Ilhc0 */

            public final void run() {
                C38991c.m270586lambda$oTdd2fP51GETEQb0FitR4Ilhc0(C38991c.this);
            }
        });
    }

    /* renamed from: c */
    public void mo142672c() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$l7baw9BydV9cBO5qrSFCZbqiUkM */

            public final void run() {
                C38991c.lambda$l7baw9BydV9cBO5qrSFCZbqiUkM(C38991c.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m153876d() {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142575b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m153879e() {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142569a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m153882h() {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142576b(this.f100173c.mo142736l());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m153873c(AbstractC38995d dVar) {
        this.f100171a.remove(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m153877d(AbstractC38995d dVar) {
        this.f100171a.add(dVar);
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        C45855f.m181663b("DelegateVideoEngineListener", "onCompletion");
        C45859k.m181685a(new Runnable(tTVideoEngine) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$kiMkue2njiqcQDKUAy9VcMpRbvM */
            public final /* synthetic */ TTVideoEngine f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$kiMkue2njiqcQDKUAy9VcMpRbvM(C38991c.this, this.f$1);
            }
        });
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onPrepare(TTVideoEngine tTVideoEngine) {
        C45855f.m181663b("DelegateVideoEngineListener", "onPrepare");
        C45859k.m181685a(new Runnable(tTVideoEngine) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$L4vy4epVzv4mvz7wlNtJqOa43f4 */
            public final /* synthetic */ TTVideoEngine f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$L4vy4epVzv4mvz7wlNtJqOa43f4(C38991c.this, this.f$1);
            }
        });
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onPrepared(TTVideoEngine tTVideoEngine) {
        C45855f.m181663b("DelegateVideoEngineListener", "onPrepared");
        C45859k.m181685a(new Runnable(tTVideoEngine) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$ZmVZI_r9Md_HQnhpsrPylsLtCsU */
            public final /* synthetic */ TTVideoEngine f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$ZmVZI_r9Md_HQnhpsrPylsLtCsU(C38991c.this, this.f$1);
            }
        });
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        C45855f.m181663b("DelegateVideoEngineListener", "onRenderStart");
        C45859k.m181685a(new Runnable(tTVideoEngine) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$xyKcXndWsbgziX2YUoRI3HgL8DE */
            public final /* synthetic */ TTVideoEngine f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$xyKcXndWsbgziX2YUoRI3HgL8DE(C38991c.this, this.f$1);
            }
        });
    }

    public C38991c(C39009j jVar) {
        this.f100173c = jVar;
        this.f100172b = new C38947a(ParticipantRepo.f117150c, new C38947a.AbstractC38949a() {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$j22A3PpO4Z69mtJZDBIHvBYUx8 */

            @Override // com.ss.android.lark.inno.player.p1974b.p1977c.C38947a.AbstractC38949a
            public final void onProgressUpdate() {
                C38991c.m270585lambda$j22A3PpO4Z69mtJZDBIHvBYUx8(C38991c.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153865a(int i) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142570a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m153874c(TTVideoEngine tTVideoEngine) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142577b(tTVideoEngine);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoStatusException(int i) {
        C45855f.m181663b("DelegateVideoEngineListener", "onVideoStatusException " + i);
        C45859k.m181685a(new Runnable(i) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$Y1ktAtZynzQgAjH1mFkCXl9TTpg */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$Y1ktAtZynzQgAjH1mFkCXl9TTpg(C38991c.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m153871b(TTVideoEngine tTVideoEngine) {
        this.f100173c.mo142720a(VcVideoPlayerStatus.PREPARED);
        this.f100172b.mo142547a();
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142579c(tTVideoEngine);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m153878d(TTVideoEngine tTVideoEngine) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142571a(tTVideoEngine);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onError(Error error) {
        C45855f.m181663b("DelegateVideoEngineListener", "onError " + error);
        this.f100172b.mo142548b();
        C45859k.m181685a(new Runnable(error) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$4jqcaUV8ibmrtjUXJR_3xZLFCGc */
            public final /* synthetic */ Error f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$4jqcaUV8ibmrtjUXJR_3xZLFCGc(C38991c.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153867a(TTVideoEngine tTVideoEngine) {
        this.f100172b.mo142548b();
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142581d(tTVideoEngine);
        }
    }

    /* renamed from: b */
    public void mo142671b(AbstractC38995d dVar) {
        C45855f.m181663b("DelegateVideoEngineListener", "removeListener");
        C45859k.m181685a(new Runnable(dVar) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$1uE8PZzhni53ygCSEnOEHflm97k */
            public final /* synthetic */ AbstractC38995d f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.lambda$1uE8PZzhni53ygCSEnOEHflm97k(C38991c.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153870a(Error error) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142574a(error);
        }
    }

    /* renamed from: a */
    public void mo142670a(AbstractC38995d dVar) {
        C45855f.m181663b("DelegateVideoEngineListener", "addListener");
        C45859k.m181685a(new Runnable(dVar) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$iXjkNbEVIumPaaBqcW13AQOU68 */
            public final /* synthetic */ AbstractC38995d f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C38991c.m270582lambda$iXjkNbEVIumPaaBqcW13AQOU68(C38991c.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m153872b(TTVideoEngine tTVideoEngine, int i) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142580c(tTVideoEngine, i);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        C45855f.m181663b("DelegateVideoEngineListener", "onBufferingUpdate " + i);
        C45859k.m181685a(new Runnable(tTVideoEngine, i) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$bMFN7sKTtmQpSksXeGOByuv74oc */
            public final /* synthetic */ TTVideoEngine f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C38991c.lambda$bMFN7sKTtmQpSksXeGOByuv74oc(C38991c.this, this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        C45855f.m181663b("DelegateVideoEngineListener", "onLoadStateChanged " + i);
        C45859k.m181685a(new Runnable(tTVideoEngine, i) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$CFeV_4PCTYAabbyE1CSgRkzE2xc */
            public final /* synthetic */ TTVideoEngine f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C38991c.lambda$CFeV_4PCTYAabbyE1CSgRkzE2xc(C38991c.this, this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        C45855f.m181663b("DelegateVideoEngineListener", "onPlaybackStateChanged " + i);
        C45859k.m181685a(new Runnable(i, tTVideoEngine) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$eH0vIBWFD5Q2upY9cDBjdCyq_Lg */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ TTVideoEngine f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C38991c.lambda$eH0vIBWFD5Q2upY9cDBjdCyq_Lg(C38991c.this, this.f$1, this.f$2);
            }
        });
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        C45855f.m181663b("DelegateVideoEngineListener", "onStreamChanged " + i);
        C45859k.m181685a(new Runnable(tTVideoEngine, i) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$KiSzAuPO47ZixonU1Ml2L80guo */
            public final /* synthetic */ TTVideoEngine f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C38991c.m270583lambda$KiSzAuPO47ZixonU1Ml2L80guo(C38991c.this, this.f$1, this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153866a(int i, TTVideoEngine tTVideoEngine) {
        if (i == 1) {
            this.f100172b.mo142547a();
        } else if (i == 2) {
            this.f100172b.mo142548b();
        }
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142572a(tTVideoEngine, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m153875c(TTVideoEngine tTVideoEngine, int i) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142578b(tTVideoEngine, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153868a(TTVideoEngine tTVideoEngine, int i) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142582d(tTVideoEngine, i);
        }
    }

    @Override // com.ss.ttvideoengine.VideoEngineSimpleCallback, com.ss.ttvideoengine.VideoEngineCallback
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        C45855f.m181663b("DelegateVideoEngineListener", "onVideoSizeChanged " + i + " " + i2);
        C45859k.m181685a(new Runnable(tTVideoEngine, i, i2) {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$c$Fnqz9KfGTSR_UpBqOiyGUneHExE */
            public final /* synthetic */ TTVideoEngine f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C38991c.lambda$Fnqz9KfGTSR_UpBqOiyGUneHExE(C38991c.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m153869a(TTVideoEngine tTVideoEngine, int i, int i2) {
        for (AbstractC38995d dVar : this.f100171a) {
            dVar.mo142573a(tTVideoEngine, i, i2);
        }
    }
}
