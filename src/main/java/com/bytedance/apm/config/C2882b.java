package com.bytedance.apm.config;

import com.bytedance.apm.C2785b;
import com.bytedance.apm.alog.AbstractC2784e;
import com.bytedance.apm.alog.C2781c;
import com.bytedance.apm.launch.C3024a;
import com.bytedance.apm.launch.C3038c;
import com.bytedance.apm.trace.AbstractC3064a;

/* renamed from: com.bytedance.apm.config.b */
public class C2882b {

    /* renamed from: a */
    private int f9231a;

    /* renamed from: b */
    private boolean f9232b;

    /* renamed from: c */
    private long f9233c;

    /* renamed from: d */
    private long f9234d;

    /* renamed from: e */
    private AbstractC3064a f9235e;

    /* renamed from: f */
    private boolean f9236f;

    /* renamed from: g */
    private long f9237g;

    /* renamed from: h */
    private boolean f9238h;

    /* renamed from: i */
    private boolean f9239i;

    /* renamed from: j */
    private boolean f9240j;

    /* renamed from: k */
    private int f9241k;

    /* renamed from: l */
    private long f9242l;

    /* renamed from: m */
    private C2881a f9243m;

    /* renamed from: n */
    private String f9244n;

    /* renamed from: o */
    private String f9245o;

    /* renamed from: p */
    private boolean f9246p;

    /* renamed from: q */
    private C3038c f9247q;

    /* renamed from: r */
    private boolean f9248r;

    /* renamed from: s */
    private AbstractC2784e f9249s;

    /* renamed from: a */
    public int mo12387a() {
        return this.f9231a;
    }

    /* renamed from: c */
    public long mo12394c() {
        return this.f9233c;
    }

    /* renamed from: d */
    public AbstractC3064a mo12395d() {
        return this.f9235e;
    }

    /* renamed from: e */
    public boolean mo12396e() {
        return this.f9236f;
    }

    /* renamed from: f */
    public long mo12397f() {
        return this.f9237g;
    }

    /* renamed from: g */
    public boolean mo12398g() {
        return this.f9238h;
    }

    /* renamed from: h */
    public boolean mo12399h() {
        return this.f9239i;
    }

    /* renamed from: i */
    public boolean mo12400i() {
        return this.f9240j;
    }

    /* renamed from: j */
    public C2881a mo12401j() {
        return this.f9243m;
    }

    /* renamed from: k */
    public long mo12402k() {
        return this.f9234d;
    }

    /* renamed from: l */
    public int mo12403l() {
        return this.f9241k;
    }

    /* renamed from: n */
    public String mo12405n() {
        return this.f9245o;
    }

    /* renamed from: p */
    public AbstractC2784e mo12407p() {
        return this.f9249s;
    }

    /* renamed from: q */
    public boolean mo12408q() {
        return this.f9248r;
    }

    /* renamed from: r */
    public boolean mo12409r() {
        return this.f9246p;
    }

    /* renamed from: s */
    public static C2884a m12147s() {
        return new C2884a();
    }

    /* renamed from: b */
    public boolean mo12393b() {
        return this.f9232b;
    }

    /* renamed from: com.bytedance.apm.config.b$a */
    public static final class C2884a {

        /* renamed from: a */
        public int f9250a;

        /* renamed from: b */
        public boolean f9251b;

        /* renamed from: c */
        public long f9252c;

        /* renamed from: d */
        public long f9253d;

        /* renamed from: e */
        public AbstractC3064a f9254e;

        /* renamed from: f */
        public boolean f9255f;

        /* renamed from: g */
        public long f9256g;

        /* renamed from: h */
        public boolean f9257h;

        /* renamed from: i */
        public boolean f9258i;

        /* renamed from: j */
        public boolean f9259j;

        /* renamed from: k */
        public String f9260k;

        /* renamed from: l */
        public int f9261l;

        /* renamed from: m */
        public long f9262m;

        /* renamed from: n */
        public String f9263n;

        /* renamed from: o */
        public boolean f9264o;

        /* renamed from: p */
        public boolean f9265p;

        /* renamed from: q */
        public boolean f9266q;

        /* renamed from: r */
        public C2881a f9267r;

        /* renamed from: s */
        public C3038c f9268s;

        /* renamed from: t */
        public boolean f9269t;

        /* renamed from: u */
        public AbstractC2784e f9270u;

        private C2884a() {
            this.f9250a = 1000;
            this.f9252c = 20000;
            this.f9253d = 15000;
            this.f9256g = 1000;
            this.f9262m = 30000;
            this.f9270u = new C2781c();
        }

        /* renamed from: a */
        public C2882b mo12415a() {
            return new C2882b(this);
        }

        /* renamed from: a */
        public C2884a mo12410a(long j) {
            this.f9252c = j;
            return this;
        }

        /* renamed from: b */
        public C2884a mo12416b(long j) {
            this.f9256g = j;
            return this;
        }

        /* renamed from: c */
        public C2884a mo12418c(boolean z) {
            this.f9258i = z;
            return this;
        }

        /* renamed from: d */
        public C2884a mo12419d(boolean z) {
            this.f9264o = z;
            return this;
        }

        /* renamed from: e */
        public C2884a mo12420e(boolean z) {
            this.f9266q = z;
            return this;
        }

        /* renamed from: a */
        public C2884a mo12411a(C3038c cVar) {
            this.f9268s = cVar;
            return this;
        }

        /* renamed from: b */
        public C2884a mo12417b(boolean z) {
            this.f9255f = z;
            return this;
        }

        /* renamed from: a */
        public C2884a mo12412a(AbstractC3064a aVar) {
            this.f9254e = aVar;
            return this;
        }

        /* renamed from: a */
        public C2884a mo12413a(String str) {
            this.f9260k = str;
            return this;
        }

        /* renamed from: a */
        public C2884a mo12414a(boolean z) {
            this.f9251b = z;
            return this;
        }
    }

    /* renamed from: m */
    public long mo12404m() {
        long d = C3024a.m12698a().mo12840b().mo12852d();
        if (d != -1) {
            return d;
        }
        return this.f9242l;
    }

    /* renamed from: o */
    public C3038c mo12406o() {
        if (this.f9247q == null) {
            this.f9247q = new C3038c.C3039a().mo12856c();
        }
        return this.f9247q;
    }

    /* renamed from: b */
    public void mo12391b(long j) {
        this.f9237g = j;
    }

    /* renamed from: a */
    public void mo12388a(long j) {
        this.f9233c = j;
    }

    /* renamed from: b */
    public void mo12392b(boolean z) {
        this.f9236f = z;
    }

    /* renamed from: a */
    public void mo12389a(AbstractC3064a aVar) {
        this.f9235e = aVar;
    }

    /* renamed from: a */
    public void mo12390a(boolean z) {
        this.f9232b = z;
    }

    public C2882b(C2884a aVar) {
        this.f9231a = aVar.f9250a;
        this.f9232b = aVar.f9251b;
        this.f9233c = aVar.f9252c;
        this.f9234d = aVar.f9253d;
        this.f9235e = aVar.f9254e;
        this.f9236f = aVar.f9255f;
        this.f9237g = aVar.f9256g;
        this.f9238h = aVar.f9257h;
        this.f9239i = aVar.f9258i;
        this.f9240j = aVar.f9259j;
        this.f9242l = aVar.f9262m;
        this.f9241k = aVar.f9261l;
        this.f9244n = aVar.f9263n;
        this.f9245o = aVar.f9260k;
        this.f9243m = aVar.f9267r;
        this.f9247q = aVar.f9268s;
        this.f9248r = aVar.f9269t;
        C2785b.m11755c(aVar.f9264o);
        C2785b.m11758d(aVar.f9265p);
        this.f9246p = aVar.f9266q;
        this.f9249s = aVar.f9270u;
    }
}
