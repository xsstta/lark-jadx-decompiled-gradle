package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.model.content.AbstractC1837b;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.p073a.C1820b;
import com.airbnb.lottie.model.p073a.C1828j;
import com.airbnb.lottie.model.p073a.C1829k;
import com.airbnb.lottie.model.p073a.C1830l;
import com.airbnb.lottie.p072d.C1793a;
import java.util.List;
import java.util.Locale;

public class Layer {

    /* renamed from: a */
    private final List<AbstractC1837b> f6381a;

    /* renamed from: b */
    private final C1792d f6382b;

    /* renamed from: c */
    private final String f6383c;

    /* renamed from: d */
    private final long f6384d;

    /* renamed from: e */
    private final LayerType f6385e;

    /* renamed from: f */
    private final long f6386f;

    /* renamed from: g */
    private final String f6387g;

    /* renamed from: h */
    private final List<Mask> f6388h;

    /* renamed from: i */
    private final C1830l f6389i;

    /* renamed from: j */
    private final int f6390j;

    /* renamed from: k */
    private final int f6391k;

    /* renamed from: l */
    private final int f6392l;

    /* renamed from: m */
    private final float f6393m;

    /* renamed from: n */
    private final float f6394n;

    /* renamed from: o */
    private final int f6395o;

    /* renamed from: p */
    private final int f6396p;

    /* renamed from: q */
    private final C1828j f6397q;

    /* renamed from: r */
    private final C1829k f6398r;

    /* renamed from: s */
    private final C1820b f6399s;

    /* renamed from: t */
    private final List<C1793a<Float>> f6400t;

    /* renamed from: u */
    private final MatteType f6401u;

    /* renamed from: v */
    private final boolean f6402v;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1792d mo9269a() {
        return this.f6382b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo9271b() {
        return this.f6393m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<C1793a<Float>> mo9273d() {
        return this.f6400t;
    }

    /* renamed from: e */
    public long mo9274e() {
        return this.f6384d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo9275f() {
        return this.f6383c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo9276g() {
        return this.f6387g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo9277h() {
        return this.f6395o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo9278i() {
        return this.f6396p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<Mask> mo9279j() {
        return this.f6388h;
    }

    /* renamed from: k */
    public LayerType mo9280k() {
        return this.f6385e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public MatteType mo9281l() {
        return this.f6401u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo9282m() {
        return this.f6386f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public List<AbstractC1837b> mo9283n() {
        return this.f6381a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C1830l mo9284o() {
        return this.f6389i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo9285p() {
        return this.f6392l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo9286q() {
        return this.f6391k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo9287r() {
        return this.f6390j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C1828j mo9288s() {
        return this.f6397q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C1829k mo9289t() {
        return this.f6398r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C1820b mo9291u() {
        return this.f6399s;
    }

    /* renamed from: v */
    public boolean mo9292v() {
        return this.f6402v;
    }

    public String toString() {
        return mo9270a("");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo9272c() {
        return this.f6394n / this.f6382b.mo9071m();
    }

    /* renamed from: a */
    public String mo9270a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo9275f());
        sb.append("\n");
        Layer a = this.f6382b.mo9051a(mo9282m());
        if (a != null) {
            sb.append("\t\tParents: ");
            sb.append(a.mo9275f());
            Layer a2 = this.f6382b.mo9051a(a.mo9282m());
            while (a2 != null) {
                sb.append("->");
                sb.append(a2.mo9275f());
                a2 = this.f6382b.mo9051a(a2.mo9282m());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!mo9279j().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(mo9279j().size());
            sb.append("\n");
        }
        if (!(mo9287r() == 0 || mo9286q() == 0)) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(mo9287r()), Integer.valueOf(mo9286q()), Integer.valueOf(mo9285p())));
        }
        if (!this.f6381a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (AbstractC1837b bVar : this.f6381a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(bVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public Layer(List<AbstractC1837b> list, C1792d dVar, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C1830l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, C1828j jVar, C1829k kVar, List<C1793a<Float>> list3, MatteType matteType, C1820b bVar, boolean z) {
        this.f6381a = list;
        this.f6382b = dVar;
        this.f6383c = str;
        this.f6384d = j;
        this.f6385e = layerType;
        this.f6386f = j2;
        this.f6387g = str2;
        this.f6388h = list2;
        this.f6389i = lVar;
        this.f6390j = i;
        this.f6391k = i2;
        this.f6392l = i3;
        this.f6393m = f;
        this.f6394n = f2;
        this.f6395o = i4;
        this.f6396p = i5;
        this.f6397q = jVar;
        this.f6398r = kVar;
        this.f6400t = list3;
        this.f6401u = matteType;
        this.f6399s = bVar;
        this.f6402v = z;
    }
}
