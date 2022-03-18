package com.ss.android.lark.inno.player.p1978c;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.lark.inno.player.core.C39009j;
import com.ss.android.lark.inno.player.core.VcVideoPlayerStatus;
import com.ss.android.lark.inno.player.layer.AbstractC39015a;
import com.ss.android.lark.inno.player.layer.C39019e;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1974b.p1976b.C38946a;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1982a.C38955a;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1982a.C38956b;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1982a.C38957c;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.C38959b;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1983b.C38961c;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.C38966c;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1984c.View$OnClickListenerC38965b;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.C38971d;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1985d.View$OnClickListenerC38970c;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38975c;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38980d;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38982e;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.C38985f;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f.C38988b;
import com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1987f.C38990c;
import com.ss.android.lark.inno.player.p1978c.p1988c.C38992a;
import com.ss.android.lark.inno.utils.C39094d;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;
import java.util.Map;

/* renamed from: com.ss.android.lark.inno.player.c.f */
public class C38997f extends AbstractC39015a implements AbstractC38996e {

    /* renamed from: j */
    public C39009j f100178j;

    /* renamed from: k */
    public C38999a f100179k = new C38999a();

    /* renamed from: l */
    private AbstractC38995d f100180l;

    /* renamed from: m */
    private C38992a f100181m;

    /* renamed from: l */
    private void m153918l() {
        mo142704c();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: k */
    public C38992a mo142699k() {
        return this.f100181m;
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    public void aJ_() {
        this.f100178j.mo142729e();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: f */
    public boolean mo142694f() {
        return this.f100178j.mo142730f();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: g */
    public float mo142695g() {
        return this.f100178j.mo142734j();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: h */
    public int mo142696h() {
        return mo142699k().f100175b;
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: i */
    public boolean mo142697i() {
        return this.f100178j.mo142731g();
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: j */
    public VcVideoPlayerStatus mo142698j() {
        return this.f100178j.mo142715a();
    }

    /* renamed from: m */
    private void m153919m() {
        C389981 r0 = new C38950a() {
            /* class com.ss.android.lark.inno.player.p1978c.C38997f.C389981 */

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: a */
            public void mo142571a(TTVideoEngine tTVideoEngine) {
            }

            @Override // com.ss.android.lark.inno.player.core.AbstractC39006g, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: b */
            public void mo142575b() {
            }

            @Override // com.ss.android.lark.inno.player.core.AbstractC39006g, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: a */
            public void mo142569a() {
                C38997f.this.mo142749b(C38942a.f100057c);
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: d */
            public void mo142581d(TTVideoEngine tTVideoEngine) {
                C38997f.this.mo142749b(C38942a.f100060f);
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: a */
            public void mo142574a(Error error) {
                C38997f.this.mo142749b(C38942a.f100059e);
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: b */
            public void mo142576b(int i) {
                C38997f.this.mo142752c(C38943b.f100082g, new C39019e().mo142756a("position", i).mo142756a("duration", C38997f.this.f100178j.mo142735k()).mo142757a("is_fromseek", false).mo142755a());
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: b */
            public void mo142577b(TTVideoEngine tTVideoEngine) {
                C38997f.this.mo142749b(C38942a.f100058d);
                C38997f.this.mo142752c(C38943b.f100082g, new C39019e().mo142756a("position", tTVideoEngine.getCurrentPlaybackTime()).mo142756a("duration", tTVideoEngine.getDuration()).mo142757a("is_fromseek", false).mo142755a());
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: a */
            public void mo142572a(TTVideoEngine tTVideoEngine, int i) {
                if (i == 1) {
                    C38997f.this.mo142749b(C38942a.f100062h);
                } else if (i == 2) {
                    C38997f.this.mo142749b(C38942a.f100063i);
                }
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: b */
            public void mo142578b(TTVideoEngine tTVideoEngine, int i) {
                if (i == 2) {
                    C38997f.this.mo142749b(C38942a.f100073s);
                } else if (i == 1) {
                    C38997f.this.mo142749b(C38942a.f100074t);
                }
            }

            @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38995d, com.ss.android.lark.inno.player.p1978c.C38950a
            /* renamed from: c */
            public void mo142580c(TTVideoEngine tTVideoEngine, int i) {
                C38997f.this.mo142750b(C38942a.f100075u, new C39019e().mo142756a("buffer_position", (tTVideoEngine.getDuration() * i) / 100).mo142755a());
                C45855f.m181663b("VideoLayerControl", (((tTVideoEngine.getDuration() * i) / 100) - tTVideoEngine.getCurrentPlaybackTime()) + "");
            }
        };
        this.f100180l = r0;
        this.f100178j.mo142719a(r0);
    }

    /* renamed from: n */
    private void m153920n() {
        for (Map.Entry<String, String> entry : C47057a.m186234a().headersMap.entrySet()) {
            this.f100178j.mo142722a(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39015a
    /* renamed from: d */
    public FrameLayout mo142705d() {
        if (this.f100213g == null) {
            this.f100213g = new FrameLayout(mo142745a());
            C39094d.m154349a(this.f100208b, this.f100213g);
            mo142747a(new C38980d(this, new C38985f(mo142745a())), this.f100213g);
        }
        return this.f100213g;
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: e */
    public void mo142693e() {
        if (this.f100178j.mo142733i() || this.f100178j.mo142732h()) {
            this.f100178j.mo142721a(mo142699k().mo142684b());
            this.f100178j.mo142724b();
            return;
        }
        this.f100178j.mo142728d();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39015a
    /* renamed from: c */
    public FrameLayout mo142704c() {
        if (this.f100212f == null) {
            this.f100212f = new FrameLayout(mo142745a());
            C39094d.m154349a(this.f100208b, this.f100212f);
            this.f100179k.f100183a = new C38980d(this, new C38982e(mo142745a()));
            mo142747a(this.f100179k.f100183a, this.f100212f);
            mo142747a(new C38956b(this, new C38957c(mo142745a())), this.f100212f);
            mo142747a(new C38988b(this, new C38990c(mo142745a())), this.f100212f);
            mo142747a(new C38959b(this, new C38961c(mo142745a(), false)), this.f100212f);
        }
        return this.f100212f;
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39015a
    /* renamed from: b */
    public FrameLayout mo142703b() {
        if (this.f100211e == null) {
            this.f100211e = new FrameLayout(mo142745a());
            C39094d.m154349a(this.f100208b, this.f100211e);
            this.f100179k.f100184b = new C38980d(this, new C38975c(mo142745a()));
            mo142747a(this.f100179k.f100184b, this.f100211e);
            mo142747a(new C38956b(this, new C38955a(mo142745a())), this.f100211e);
            mo142747a(new C38971d(this, new View$OnClickListenerC38970c(mo142745a())), this.f100211e);
            mo142747a(new C38966c(this, new View$OnClickListenerC38965b(mo142745a())), this.f100211e);
            mo142747a(new C38988b(this, new C38990c(mo142745a())), this.f100211e);
            mo142747a(new C38959b(this, new C38961c(mo142745a(), true)), this.f100211e);
        }
        return this.f100211e;
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39005f
    /* renamed from: a */
    public void mo142700a(int i) {
        mo142751c(i);
    }

    /* renamed from: com.ss.android.lark.inno.player.c.f$a */
    public class C38999a {

        /* renamed from: a */
        public C38980d f100183a;

        /* renamed from: b */
        public C38980d f100184b;

        public C38999a() {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m153917a(View view) {
        mo142751c(C38943b.f100081f);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    public void d_(int i) {
        this.f100178j.mo142725b(i);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: a */
    public void mo142687a(float f) {
        this.f100178j.mo142716a(f);
        mo142751c(C38943b.f100084i);
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: a */
    public void mo142688a(C38992a.C38994a aVar) {
        this.f100181m.mo142682a(aVar.f100177b);
        int l = this.f100178j.mo142736l();
        this.f100178j.mo142727c();
        this.f100178j.mo142721a(aVar.f100176a);
        m153920n();
        this.f100178j.mo142717a(l);
        this.f100178j.mo142724b();
    }

    /* renamed from: a */
    public void mo142702a(C38992a aVar) {
        this.f100181m = aVar;
    }

    @Override // com.ss.android.lark.inno.player.p1978c.AbstractC38996e
    /* renamed from: a */
    public void mo142690a(boolean z) {
        this.f100178j.mo142723a(z);
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39005f
    /* renamed from: a */
    public void mo142701a(int i, Bundle bundle) {
        mo142752c(i, bundle);
    }

    public C38997f(FrameLayout frameLayout, C39009j jVar) {
        this.f100208b = frameLayout;
        this.f100178j = jVar;
        this.f100215i = new C38946a(this.f100208b);
        m153918l();
        m153919m();
        this.f100208b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.p1978c.$$Lambda$f$R_OTDd0s9lYEh2YwdjXGv0kao */

            public final void onClick(View view) {
                C38997f.this.m153917a((C38997f) view);
            }
        });
    }
}
