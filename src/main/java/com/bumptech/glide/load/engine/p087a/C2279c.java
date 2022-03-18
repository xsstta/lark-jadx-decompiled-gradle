package com.bumptech.glide.load.engine.p087a;

import android.graphics.Bitmap;
import com.bumptech.glide.util.C2568k;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.a.c */
public class C2279c implements AbstractC2295l {

    /* renamed from: a */
    private final C2281b f7621a = new C2281b();

    /* renamed from: b */
    private final C2286h<C2280a, Bitmap> f7622b = new C2286h<>();

    /* renamed from: com.bumptech.glide.load.engine.a.c$b */
    static class C2281b extends AbstractC2282d<C2280a> {
        C2281b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C2280a mo10687b() {
            return new C2280a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2280a mo10686a(int i, int i2, Bitmap.Config config) {
            C2280a aVar = (C2280a) mo10689c();
            aVar.mo10681a(i, i2, config);
            return aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.engine.a.c$a */
    public static class C2280a implements AbstractC2296m {

        /* renamed from: a */
        private final C2281b f7623a;

        /* renamed from: b */
        private int f7624b;

        /* renamed from: c */
        private int f7625c;

        /* renamed from: d */
        private Bitmap.Config f7626d;

        @Override // com.bumptech.glide.load.engine.p087a.AbstractC2296m
        /* renamed from: a */
        public void mo10680a() {
            this.f7623a.mo10688a(this);
        }

        public String toString() {
            return C2279c.m9737c(this.f7624b, this.f7625c, this.f7626d);
        }

        public int hashCode() {
            int i;
            int i2 = ((this.f7624b * 31) + this.f7625c) * 31;
            Bitmap.Config config = this.f7626d;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public C2280a(C2281b bVar) {
            this.f7623a = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2280a)) {
                return false;
            }
            C2280a aVar = (C2280a) obj;
            if (this.f7624b == aVar.f7624b && this.f7625c == aVar.f7625c && this.f7626d == aVar.f7626d) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo10681a(int i, int i2, Bitmap.Config config) {
            this.f7624b = i;
            this.f7625c = i2;
            this.f7626d = config;
        }
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: a */
    public Bitmap mo10673a() {
        return this.f7622b.mo10697a();
    }

    C2279c() {
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f7622b;
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: c */
    public int mo10678c(Bitmap bitmap) {
        return C2568k.m10903a(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: b */
    public String mo10677b(Bitmap bitmap) {
        return m9738d(bitmap);
    }

    /* renamed from: d */
    private static String m9738d(Bitmap bitmap) {
        return m9737c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: a */
    public void mo10675a(Bitmap bitmap) {
        this.f7622b.mo10699a(this.f7621a.mo10686a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: b */
    public String mo10676b(int i, int i2, Bitmap.Config config) {
        return m9737c(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.p087a.AbstractC2295l
    /* renamed from: a */
    public Bitmap mo10674a(int i, int i2, Bitmap.Config config) {
        return this.f7622b.mo10698a(this.f7621a.mo10686a(i, i2, config));
    }

    /* renamed from: c */
    static String m9737c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }
}
