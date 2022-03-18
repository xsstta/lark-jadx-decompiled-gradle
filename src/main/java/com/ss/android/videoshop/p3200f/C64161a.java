package com.ss.android.videoshop.p3200f;

import com.ss.android.videoshop.api.AbstractC64093b;
import com.ss.android.videoshop.api.AbstractC64095d;
import com.ss.android.videoshop.api.AbstractC64099h;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.android.videoshop.controller.AbstractView$OnLayoutChangeListenerC64144d;
import com.ss.android.videoshop.controller.C64151f;
import com.ss.android.videoshop.p3194a.AbstractC64090d;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3199e.C64159a;
import com.ss.android.videoshop.p3202h.C64169a;
import com.ss.ttm.player.PlaybackParams;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.utils.Error;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.videoshop.f.a */
public class C64161a extends AbstractC64099h.C64100a {

    /* renamed from: a */
    private C64116b f162063a;

    /* renamed from: b */
    private AbstractView$OnLayoutChangeListenerC64144d f162064b;

    /* renamed from: c */
    private C64151f f162065c = new C64151f();

    /* renamed from: d */
    private boolean f162066d;

    /* renamed from: e */
    private boolean f162067e;

    /* renamed from: f */
    private AbstractC64095d f162068f;

    /* renamed from: g */
    private List<AbstractC64099h> f162069g = new ArrayList();

    /* renamed from: h */
    private AbstractC64093b f162070h;

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public boolean mo221888a(AbstractC64108o oVar, C64116b bVar, AbstractC64090d dVar) {
        return false;
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221893b(AbstractC64108o oVar, C64116b bVar, boolean z) {
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163965a(AbstractC64108o oVar, C64116b bVar, Error error) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163965a(oVar, bVar, error);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221883a(AbstractC64108o oVar, C64116b bVar, Resolution resolution, boolean z) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221883a(oVar, bVar, resolution, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221881a(AbstractC64108o oVar, C64116b bVar, VideoContext videoContext, boolean z, int i, boolean z2, boolean z3) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221881a(oVar, bVar, videoContext, z, i, z2, z3);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163964a(AbstractC64108o oVar, C64116b bVar, long j) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163964a(oVar, bVar, j);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163966a(AbstractC64108o oVar, C64116b bVar, boolean z) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163966a(oVar, bVar, z);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163967a(AbstractC64108o oVar, C64116b bVar, boolean z, int i, boolean z2, boolean z3) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163967a(oVar, bVar, z, i, z2, z3);
        }
    }

    /* renamed from: b */
    public boolean mo222266b() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162064b;
        if (dVar == null || !dVar.mo222172h()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo222267c() {
        C64159a.m252079a("pause");
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162064b;
        if (dVar != null) {
            dVar.mo222160b();
        }
    }

    /* renamed from: d */
    public void mo222268d() {
        C64159a.m252079a("release");
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162064b;
        if (dVar != null) {
            dVar.mo222163c();
        }
    }

    /* renamed from: e */
    public AbstractC64108o mo222269e() {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162064b;
        if (dVar != null) {
            return dVar.mo222184t();
        }
        return null;
    }

    /* renamed from: a */
    public void mo222259a() {
        boolean z;
        if (this.f162063a == null) {
            C64159a.m252084c("MusicPlayer", "playEntity can't be null when play");
            return;
        }
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162064b;
        if (dVar == null) {
            this.f162064b = this.f162065c.mo222197a();
        } else {
            C64116b d = dVar.mo222165d();
            if (!(d == null || d == this.f162063a)) {
                this.f162064b.mo222163c();
            }
        }
        AbstractC64095d dVar2 = this.f162068f;
        if (dVar2 != null) {
            this.f162064b.mo222150a(dVar2);
        }
        this.f162064b.mo222159a(this.f162066d);
        this.f162064b.mo222162b(this.f162067e);
        this.f162064b.mo222152a(this);
        this.f162064b.mo222153a(this.f162063a);
        C64169a t = this.f162063a.mo221960t();
        AbstractView$OnLayoutChangeListenerC64144d dVar3 = this.f162064b;
        if (t == null || !t.mo222316k()) {
            z = false;
        } else {
            z = true;
        }
        dVar3.mo222167e(z);
        this.f162064b.mo222149a(this.f162070h);
        this.f162064b.mo222143a();
    }

    /* renamed from: a */
    public void mo222264a(C64116b bVar) {
        this.f162063a = bVar;
    }

    /* renamed from: a */
    public void mo222265a(PlaybackParams playbackParams) {
        AbstractView$OnLayoutChangeListenerC64144d dVar = this.f162064b;
        if (dVar != null) {
            dVar.mo222154a(playbackParams);
        }
    }

    /* renamed from: a */
    public void mo222260a(int i) {
        AbstractView$OnLayoutChangeListenerC64144d dVar;
        if (i >= 0 && (dVar = this.f162064b) != null) {
            dVar.mo222145a(i);
        }
    }

    /* renamed from: a */
    public void mo222261a(long j) {
        AbstractView$OnLayoutChangeListenerC64144d dVar;
        if (j >= 0 && (dVar = this.f162064b) != null) {
            dVar.mo222147a(j);
        }
    }

    /* renamed from: a */
    public void mo222262a(AbstractC64095d dVar) {
        this.f162068f = dVar;
        AbstractView$OnLayoutChangeListenerC64144d dVar2 = this.f162064b;
        if (dVar2 != null && dVar != null) {
            dVar2.mo222150a(dVar);
        }
    }

    /* renamed from: a */
    public void mo222263a(AbstractC64099h hVar) {
        if (hVar != null && !this.f162069g.contains(hVar)) {
            this.f162069g.add(hVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo163970b(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163970b(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo163971c(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163971c(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: d */
    public void mo163972d(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163972d(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo163973e(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163973e(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo163974f(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163974f(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo163975g(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163975g(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: h */
    public void mo163976h(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163976h(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: i */
    public void mo163977i(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163977i(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: j */
    public void mo163978j(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163978j(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: k */
    public void mo163979k(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163979k(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: l */
    public void mo221900l(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221900l(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: m */
    public void mo221901m(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221901m(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: n */
    public void mo221902n(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221902n(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163962a(AbstractC64108o oVar, C64116b bVar) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163962a(oVar, bVar);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221890b(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221890b(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: c */
    public void mo221894c(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221894c(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: e */
    public void mo221897e(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221897e(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: f */
    public void mo221898f(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221898f(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: g */
    public void mo221899g(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221899g(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo221880a(AbstractC64108o oVar, C64116b bVar, int i) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221880a(oVar, bVar, i);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: b */
    public void mo221891b(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo221891b(oVar, bVar, i, i2);
        }
    }

    @Override // com.ss.android.videoshop.api.AbstractC64099h.C64100a, com.ss.android.videoshop.api.AbstractC64099h
    /* renamed from: a */
    public void mo163963a(AbstractC64108o oVar, C64116b bVar, int i, int i2) {
        for (AbstractC64099h hVar : this.f162069g) {
            hVar.mo163963a(oVar, bVar, i, i2);
        }
    }
}
