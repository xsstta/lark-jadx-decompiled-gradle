package com.ss.android.lark.inno.player.live;

import android.os.SystemClock;
import com.ss.android.lark.mm.p2288b.C45850b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.videoarch.liveplayer.AbstractC65605a;
import com.ss.videoarch.liveplayer.log.LiveError;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.inno.player.live.d */
public class C39066d implements AbstractC39069g, AbstractC65605a {

    /* renamed from: a */
    private List<AbstractC39070h> f100308a = new ArrayList();

    /* renamed from: b */
    private C39075k f100309b;

    /* renamed from: c */
    private long f100310c;

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: a */
    public void mo142871a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m154201r() {
        this.f100308a.clear();
    }

    /* renamed from: a */
    public void mo142865a() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$rkxESMHKH2e9QEHEDcTBAsheeU */

            public final void run() {
                C39066d.this.m154201r();
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: b */
    public void mo142873b() {
        C45855f.m181663b("DelegateLiveListener", "onStallStart");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$QyVjffSjxI7a8GI0fF0xXgG3UcM */

            public final void run() {
                C39066d.lambda$QyVjffSjxI7a8GI0fF0xXgG3UcM(C39066d.this);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: c */
    public void mo142876c() {
        C45855f.m181663b("DelegateLiveListener", "onStallEnd");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$LwAtWzii0Y4Y0zvMYyIbF0TdY */

            public final void run() {
                C39066d.m270589lambda$LwAtWzii0Y4Y0zvMYyIbF0TdY(C39066d.this);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: d */
    public void mo142878d() {
        C45855f.m181663b("DelegateLiveListener", "onCompletion");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$ChM7zfG0IQP2l8YJqJIx7HL8Aik */

            public final void run() {
                C39066d.lambda$ChM7zfG0IQP2l8YJqJIx7HL8Aik(C39066d.this);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: e */
    public void mo142879e() {
        C45855f.m181663b("DelegateLiveListener", "onPrepared");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$tpNtRymmjJYPNPNhyNFazksU4g */

            public final void run() {
                C39066d.this.m154194k();
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39069g
    /* renamed from: g */
    public void mo142856g() {
        C45855f.m181663b("DelegateLiveListener", "onStop");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$i0mhNq5NMoo36c4ipFXK9Z4pfU */

            public final void run() {
                C39066d.this.m154199p();
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39069g
    /* renamed from: h */
    public void mo142857h() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$2JWRYjWL8VzMBAASgRKjJnjLJhQ */

            public final void run() {
                C39066d.lambda$2JWRYjWL8VzMBAASgRKjJnjLJhQ(C39066d.this);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: i */
    public void mo142880i() {
        C45855f.m181663b("DelegateLiveListener", "onCacheFileCompletion");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$YukghcWEJENWQA43LdtLU5JFiwk */

            public final void run() {
                C39066d.this.m154192j();
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m154192j() {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142853e();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: l */
    private /* synthetic */ void m154195l() {
        this.f100309b.mo142864a(LivePlayerStatus.Complete);
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142849c();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: m */
    private /* synthetic */ void m154196m() {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142846b();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: n */
    private /* synthetic */ void m154197n() {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142840a();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: o */
    private /* synthetic */ void m154198o() {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142857h();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: p */
    private /* synthetic */ void m154199p() {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142856g();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: q */
    private /* synthetic */ void m154200q() {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142855f();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: k */
    private /* synthetic */ void m154194k() {
        if (this.f100309b.mo142914g()) {
            this.f100309b.mo142864a(LivePlayerStatus.Play);
        } else {
            this.f100309b.mo142864a(LivePlayerStatus.Pause);
        }
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142851d();
        }
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39069g
    /* renamed from: f */
    public void mo142855f() {
        this.f100310c = SystemClock.elapsedRealtime();
        C45855f.m181663b("DelegateLiveListener", "onPlay");
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$acWOZ4L6TIhEeiMDLI61rgGww0 */

            public final void run() {
                C39066d.this.m154200q();
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m154183b(AbstractC39070h hVar) {
        this.f100308a.add(hVar);
    }

    public C39066d(C39075k kVar) {
        this.f100309b = kVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m154186c(int i) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142847b(i);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m154187d(int i) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142841a(i);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m154188f(String str) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142850c(str);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m154189g(String str) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142848b(str);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m154190h(String str) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142844a(str);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m154191i(String str) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142854e(str);
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: a */
    public void mo142866a(int i) {
        C45855f.m181663b("DelegateLiveListener", "onVideoRenderStall " + i);
        C45859k.m181685a(new Runnable(i) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$LMVMdYfkn5USOLkY0YVO5_DTo4A */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.lambda$LMVMdYfkn5USOLkY0YVO5_DTo4A(C39066d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39069g
    /* renamed from: e */
    public void mo142854e(String str) {
        C45855f.m181663b("DelegateLiveListener", "onPlayResolution " + str);
        C45859k.m181685a(new Runnable(str) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$lgnhttx0gcAhvRZAkmPX81FdefE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.this.m154191i(this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m154184b(LiveError liveError) {
        this.f100309b.mo142864a(LivePlayerStatus.Error);
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142843a(liveError);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m154193j(String str) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142852d(str);
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: c */
    public void mo142877c(String str) {
        C45855f.m181663b("DelegateLiveListener", "onResolutionDegrade " + str);
        C45859k.m181685a(new Runnable(str) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$mpiwjFRoy0jAcbIH0dqLYQPbY8 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.this.m154188f(this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39069g
    /* renamed from: d */
    public void mo142852d(String str) {
        C45855f.m181663b("DelegateLiveListener", "onSetStreamInfo");
        C45859k.m181685a(new Runnable(str) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$pCTfBgg_OVNruJrKCBRPIqs6nak */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.this.m154193j(this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m154185b(boolean z) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142845a(z);
        }
    }

    /* renamed from: a */
    public void mo142868a(AbstractC39070h hVar) {
        C45855f.m181663b("DelegateLiveListener", "addListener");
        C45859k.m181685a(new Runnable(hVar) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$tY76w0cx8vyh4SpgD8yVJpffQA */
            public final /* synthetic */ AbstractC39070h f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.this.m154183b((C39066d) this.f$1);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: a */
    public void mo142869a(LiveError liveError) {
        C45855f.m181663b("DelegateLiveListener", "onError " + liveError);
        C45859k.m181685a(new Runnable(liveError) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$fQawm9inmDNw2Lw0pPRYSa0taRY */
            public final /* synthetic */ LiveError f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.this.m154184b((C39066d) this.f$1);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: b */
    public void mo142874b(int i) {
        C45855f.m181663b("DelegateLiveListener", "onAudioRenderStall " + i);
        C45859k.m181685a(new Runnable(i) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$RJDvDtFiENVlyi3PIKmyIcYP1Ro */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.lambda$RJDvDtFiENVlyi3PIKmyIcYP1Ro(C39066d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: a */
    public void mo142870a(String str) {
        C45855f.m181663b("DelegateLiveListener", "onAbrSwitch " + str);
        C45859k.m181685a(new Runnable(str) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$MhS_6rAHOvXaXfkNe8z23Cxr2tQ */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.lambda$MhS_6rAHOvXaXfkNe8z23Cxr2tQ(C39066d.this, this.f$1);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: b */
    public void mo142875b(String str) {
        if (C45850b.m181645a()) {
            try {
                new JSONObject(str).getLong("ts");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C45859k.m181685a(new Runnable(str) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$SGPgI6ju5Ie0YcrYtLUM4JzvnM */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.this.m154189g(this.f$1);
            }
        });
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: a */
    public void mo142872a(boolean z) {
        C45855f.m181663b("DelegateLiveListener", "onFirstFrame " + z + " " + (SystemClock.elapsedRealtime() - this.f100310c));
        C45859k.m181685a(new Runnable(z) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$H7du2f1bH59nxXlW_CIx3vLWs4Q */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C39066d.lambda$H7du2f1bH59nxXlW_CIx3vLWs4Q(C39066d.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m154182b(int i, int i2) {
        for (AbstractC39070h hVar : this.f100308a) {
            hVar.mo142842a(i, i2);
        }
    }

    @Override // com.ss.videoarch.liveplayer.AbstractC65605a
    /* renamed from: a */
    public void mo142867a(int i, int i2) {
        C45855f.m181663b("DelegateLiveListener", "onVideoSizeChanged " + i + " " + i2);
        C45859k.m181685a(new Runnable(i, i2) {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$d$XKekmDa5qqpGALFeE6mp4SHJy78 */
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C39066d.this.m154182b(this.f$1, this.f$2);
            }
        });
    }
}
