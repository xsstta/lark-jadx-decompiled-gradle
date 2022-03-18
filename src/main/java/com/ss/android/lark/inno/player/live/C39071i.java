package com.ss.android.lark.inno.player.live;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.lark.inno.network.model.C38938a;
import com.ss.android.lark.inno.player.layer.AbstractC39015a;
import com.ss.android.lark.inno.player.layer.PlayerLayerMode;
import com.ss.android.lark.inno.player.live.layer.stall.LiveTipFullLayerView;
import com.ss.android.lark.inno.player.live.layer.stall.LiveTipLayer;
import com.ss.android.lark.inno.player.live.layer.stall.LiveTipNormalLayerView;
import com.ss.android.lark.inno.player.live.layer.unmute.LiveUnmuteLayer;
import com.ss.android.lark.inno.player.live.layer.unmute.LiveUnmuteView;
import com.ss.android.lark.inno.player.live.p1989a.p1990a.C39024c;
import com.ss.android.lark.inno.player.live.p1989a.p1990a.View$OnClickListenerC39023b;
import com.ss.android.lark.inno.player.live.p1989a.p1991b.C39027b;
import com.ss.android.lark.inno.player.live.p1989a.p1991b.C39029c;
import com.ss.android.lark.inno.player.live.p1989a.p1991b.C39031d;
import com.ss.android.lark.inno.player.live.p1989a.p1992c.C39033a;
import com.ss.android.lark.inno.player.live.p1989a.p1992c.C39034b;
import com.ss.android.lark.inno.player.live.p1989a.p1992c.C39035c;
import com.ss.android.lark.inno.player.live.p1989a.p1992c.C39036d;
import com.ss.android.lark.inno.player.live.p1989a.p1993d.C39039c;
import com.ss.android.lark.inno.player.live.p1989a.p1993d.View$OnClickListenerC39038b;
import com.ss.android.lark.inno.player.live.p1989a.p1995f.C39049c;
import com.ss.android.lark.inno.player.live.p1989a.p1995f.C39053d;
import com.ss.android.lark.inno.player.live.p1989a.p1995f.C39056e;
import com.ss.android.lark.inno.player.live.p1997b.C39063a;
import com.ss.android.lark.inno.player.live.p1997b.C39064b;
import com.ss.android.lark.inno.player.p1973a.C38942a;
import com.ss.android.lark.inno.player.p1973a.C38943b;
import com.ss.android.lark.inno.player.p1974b.p1976b.C38946a;
import com.ss.android.lark.inno.utils.C39094d;
import com.ss.videoarch.liveplayer.log.LiveError;

/* renamed from: com.ss.android.lark.inno.player.live.i */
public class C39071i extends AbstractC39015a implements AbstractC39067e {

    /* renamed from: j */
    private AbstractC39070h f100311j;

    /* renamed from: k */
    private C39075k f100312k;

    /* renamed from: l */
    private C39064b f100313l;

    /* renamed from: m */
    private C39063a f100314m = new C39063a();

    /* renamed from: n */
    private C39073a f100315n = new C39073a();

    /* renamed from: m */
    private void m154254m() {
        mo142704c();
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    public AbstractC39068f aH_() {
        return this.f100312k;
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: h */
    public C39064b mo142890h() {
        return this.f100313l;
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: i */
    public C39063a mo142891i() {
        return this.f100314m;
    }

    /* renamed from: k */
    public C39075k mo142897k() {
        return this.f100312k;
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: j */
    public int mo142892j() {
        return this.f100313l.f100306c;
    }

    /* renamed from: l */
    public void mo142898l() {
        this.f100312k.mo142912e();
    }

    /* renamed from: n */
    private void m154255n() {
        C390721 r0 = new C39062b() {
            /* class com.ss.android.lark.inno.player.live.C39071i.C390721 */

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39069g
            /* renamed from: h */
            public void mo142857h() {
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: a */
            public void mo142840a() {
                C39071i.this.mo142749b(C38942a.f100065k);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: b */
            public void mo142846b() {
                C39071i.this.mo142749b(C38942a.f100066l);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: c */
            public void mo142849c() {
                C39071i.this.mo142749b(C38942a.f100060f);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: d */
            public void mo142851d() {
                C39071i.this.mo142749b(C38942a.f100058d);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39069g
            /* renamed from: f */
            public void mo142855f() {
                C39071i.this.mo142749b(C38942a.f100057c);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39069g
            /* renamed from: g */
            public void mo142856g() {
                C39071i.this.mo142749b(C38942a.f100064j);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: a */
            public void mo142843a(LiveError liveError) {
                C39071i.this.mo142749b(C38942a.f100059e);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39069g
            /* renamed from: d */
            public void mo142852d(String str) {
                C39071i.this.mo142749b(C38942a.f100071q);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: a */
            public void mo142844a(String str) {
                Bundle bundle = new Bundle();
                bundle.putString(CommonCode.MapKey.HAS_RESOLUTION, str);
                C39071i.this.mo142750b(C38942a.f100068n, bundle);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: c */
            public void mo142850c(String str) {
                Bundle bundle = new Bundle();
                bundle.putString(CommonCode.MapKey.HAS_RESOLUTION, str);
                C39071i.this.mo142750b(C38942a.f100069o, bundle);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39069g
            /* renamed from: e */
            public void mo142854e(String str) {
                Bundle bundle = new Bundle();
                bundle.putString(CommonCode.MapKey.HAS_RESOLUTION, str);
                C39071i.this.mo142750b(C38942a.f100067m, bundle);
            }

            @Override // com.ss.android.lark.inno.player.live.C39062b, com.ss.android.lark.inno.player.live.AbstractC39070h
            /* renamed from: a */
            public void mo142845a(boolean z) {
                C39071i.this.mo142749b(C38942a.f100061g);
            }
        };
        this.f100311j = r0;
        this.f100312k.mo142906a(r0);
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: e */
    public boolean mo142693e() {
        return mo142897k().mo142914g();
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: f */
    public boolean mo142694f() {
        return mo142897k().mo142913f();
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: g */
    public LivePlayerStatus mo142695g() {
        return mo142897k().mo142863a();
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39015a
    /* renamed from: d */
    public FrameLayout mo142705d() {
        if (this.f100213g == null) {
            this.f100213g = new FrameLayout(mo142745a());
            C39094d.m154349a(this.f100208b, this.f100213g);
            mo142747a(new C39034b(this, new C39036d(mo142745a())), this.f100213g);
            mo142747a(new LiveUnmuteLayer(this, new LiveUnmuteView(mo142745a())), this.f100213g);
        }
        return this.f100213g;
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39015a
    /* renamed from: c */
    public FrameLayout mo142704c() {
        if (this.f100212f == null) {
            this.f100212f = new FrameLayout(mo142745a());
            C39094d.m154349a(this.f100208b, this.f100212f);
            mo142747a(new C39034b(this, new C39035c(mo142745a())), this.f100212f);
            mo142747a(new LiveUnmuteLayer(this, new LiveUnmuteView(mo142745a())), this.f100212f);
            this.f100315n.f100317a = new C39053d(this, new C39056e(mo142745a()));
            mo142747a(this.f100315n.f100317a, this.f100212f);
            mo142747a(new LiveTipLayer(this, new LiveTipNormalLayerView(mo142745a())), this.f100212f);
            mo142747a(new C39029c(this, new C39031d(mo142745a())), this.f100212f);
        }
        return this.f100212f;
    }

    @Override // com.ss.android.lark.inno.player.layer.AbstractC39015a
    /* renamed from: b */
    public FrameLayout mo142703b() {
        if (this.f100211e == null) {
            this.f100211e = new FrameLayout(mo142745a());
            C39094d.m154349a(this.f100208b, this.f100211e);
            this.f100315n.f100318b = new C39053d(this, new C39049c(mo142745a()));
            mo142747a(this.f100315n.f100318b, this.f100211e);
            mo142747a(new C39034b(this, new C39033a(mo142745a())), this.f100211e);
            mo142747a(new LiveUnmuteLayer(this, new LiveUnmuteView(mo142745a())), this.f100211e);
            mo142747a(new LiveTipLayer(this, new LiveTipFullLayerView(mo142745a())), this.f100212f);
            mo142747a(new C39029c(this, new C39027b(mo142745a())), this.f100211e);
            mo142747a(new C39039c(this, new View$OnClickListenerC39038b(mo142745a())), this.f100211e);
            mo142747a(new C39024c(this, new View$OnClickListenerC39023b(mo142745a())), this.f100211e);
        }
        return this.f100211e;
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39005f
    /* renamed from: a */
    public void mo142700a(int i) {
        mo142751c(i);
    }

    /* renamed from: com.ss.android.lark.inno.player.live.i$a */
    public class C39073a {

        /* renamed from: a */
        public C39053d f100317a;

        /* renamed from: b */
        public C39053d f100318b;

        public C39073a() {
        }

        /* renamed from: a */
        public void mo142899a(C39064b bVar) {
            C39053d dVar;
            if (C39071i.this.f100214h == PlayerLayerMode.NORMAL) {
                C39053d dVar2 = this.f100317a;
                if (dVar2 != null) {
                    dVar2.mo142831a(bVar);
                }
            } else if (C39071i.this.f100214h == PlayerLayerMode.FULL && (dVar = this.f100318b) != null) {
                dVar.mo142831a(bVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m154253a(View view) {
        mo142751c(C38943b.f100081f);
    }

    /* renamed from: a */
    public void mo142896a(C39064b bVar) {
        this.f100313l = bVar;
        this.f100315n.mo142899a(bVar);
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    public boolean c_(int i) {
        if (this.f100313l.mo142860b() == i) {
            return true;
        }
        boolean a = mo142897k().mo142908a(TTLiveStreamData.mapResolution(i));
        if (a) {
            this.f100313l.f100306c = i;
        }
        return a;
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: a */
    public void mo142881a(C38938a aVar) {
        if (this.f100313l.mo142862d() != aVar) {
            TTLiveStreamData liveStreamData = TTLiveStreamData.toLiveStreamData(aVar);
            this.f100312k.aI_();
            this.f100312k.mo142910c(JSON.toJSONString(liveStreamData));
            this.f100312k.mo142894b();
            this.f100313l.mo142859a(aVar);
            mo142751c(C38943b.f100089n);
        }
    }

    @Override // com.ss.android.lark.inno.player.live.AbstractC39067e
    /* renamed from: a */
    public void mo142883a(boolean z) {
        mo142897k().mo142907a(z);
    }

    @Override // com.ss.android.lark.inno.player.core.AbstractC39005f
    /* renamed from: a */
    public void mo142701a(int i, Bundle bundle) {
        mo142752c(i, bundle);
    }

    public C39071i(FrameLayout frameLayout, C39075k kVar) {
        this.f100208b = frameLayout;
        this.f100312k = kVar;
        this.f100215i = new C38946a(this.f100208b);
        m154254m();
        m154255n();
        this.f100208b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.inno.player.live.$$Lambda$i$TvSqUJFmKaecVm4FgYzI2brj2LA */

            public final void onClick(View view) {
                C39071i.this.m154253a((C39071i) view);
            }
        });
    }
}
