package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.C1818a;
import com.airbnb.lottie.p071c.C1787d;
import com.airbnb.lottie.p071c.C1790g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.h */
public class C1843h {

    /* renamed from: a */
    private final List<C1818a> f6354a;

    /* renamed from: b */
    private PointF f6355b;

    /* renamed from: c */
    private boolean f6356c;

    /* renamed from: a */
    public PointF mo9235a() {
        return this.f6355b;
    }

    /* renamed from: b */
    public boolean mo9237b() {
        return this.f6356c;
    }

    /* renamed from: c */
    public List<C1818a> mo9238c() {
        return this.f6354a;
    }

    public C1843h() {
        this.f6354a = new ArrayList();
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f6354a.size() + "closed=" + this.f6356c + '}';
    }

    /* renamed from: a */
    private void m8259a(float f, float f2) {
        if (this.f6355b == null) {
            this.f6355b = new PointF();
        }
        this.f6355b.set(f, f2);
    }

    public C1843h(PointF pointF, boolean z, List<C1818a> list) {
        this.f6355b = pointF;
        this.f6356c = z;
        this.f6354a = new ArrayList(list);
    }

    /* renamed from: a */
    public void mo9236a(C1843h hVar, C1843h hVar2, float f) {
        boolean z;
        if (this.f6355b == null) {
            this.f6355b = new PointF();
        }
        if (hVar.mo9237b() || hVar2.mo9237b()) {
            z = true;
        } else {
            z = false;
        }
        this.f6356c = z;
        if (hVar.mo9238c().size() != hVar2.mo9238c().size()) {
            C1787d.m7973b("Curves must have the same number of control points. Shape 1: " + hVar.mo9238c().size() + "\tShape 2: " + hVar2.mo9238c().size());
        }
        int min = Math.min(hVar.mo9238c().size(), hVar2.mo9238c().size());
        if (this.f6354a.size() < min) {
            for (int size = this.f6354a.size(); size < min; size++) {
                this.f6354a.add(new C1818a());
            }
        } else if (this.f6354a.size() > min) {
            for (int size2 = this.f6354a.size() - 1; size2 >= min; size2--) {
                List<C1818a> list = this.f6354a;
                list.remove(list.size() - 1);
            }
        }
        PointF a = hVar.mo9235a();
        PointF a2 = hVar2.mo9235a();
        m8259a(C1790g.m8000a(a.x, a2.x, f), C1790g.m8000a(a.y, a2.y, f));
        for (int size3 = this.f6354a.size() - 1; size3 >= 0; size3--) {
            C1818a aVar = hVar.mo9238c().get(size3);
            C1818a aVar2 = hVar2.mo9238c().get(size3);
            PointF a3 = aVar.mo9129a();
            PointF b = aVar.mo9131b();
            PointF c = aVar.mo9133c();
            PointF a4 = aVar2.mo9129a();
            PointF b2 = aVar2.mo9131b();
            PointF c2 = aVar2.mo9133c();
            this.f6354a.get(size3).mo9130a(C1790g.m8000a(a3.x, a4.x, f), C1790g.m8000a(a3.y, a4.y, f));
            this.f6354a.get(size3).mo9132b(C1790g.m8000a(b.x, b2.x, f), C1790g.m8000a(b.y, b2.y, f));
            this.f6354a.get(size3).mo9134c(C1790g.m8000a(c.x, c2.x, f), C1790g.m8000a(c.y, c2.y, f));
        }
    }
}
