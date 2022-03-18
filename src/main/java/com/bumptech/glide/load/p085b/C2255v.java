package com.bumptech.glide.load.p085b;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.p082c.C2120d;

/* renamed from: com.bumptech.glide.load.b.v */
public class C2255v<Model> implements AbstractC2233n<Model, Model> {

    /* renamed from: a */
    private static final C2255v<?> f7589a = new C2255v<>();

    @Override // com.bumptech.glide.load.p085b.AbstractC2233n
    /* renamed from: a */
    public boolean mo10536a(Model model) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.b.v$a */
    public static class C2256a<Model> implements AbstractC2235o<Model, Model> {

        /* renamed from: a */
        private static final C2256a<?> f7590a = new C2256a<>();

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public void mo10539a() {
        }

        /* renamed from: b */
        public static <T> C2256a<T> m9680b() {
            return (C2256a<T>) f7590a;
        }

        @Override // com.bumptech.glide.load.p085b.AbstractC2235o
        /* renamed from: a */
        public AbstractC2233n<Model, Model> mo10538a(C2241r rVar) {
            return C2255v.m9677a();
        }
    }

    /* renamed from: com.bumptech.glide.load.b.v$b */
    private static class C2257b<Model> implements AbstractC2147d<Model> {

        /* renamed from: a */
        private final Model f7591a;

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: c */
        public void mo10490c() {
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: d */
        public DataSource mo10491d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public Class<Model> mo10481a() {
            return (Class<Model>) this.f7591a.getClass();
        }

        C2257b(Model model) {
            this.f7591a = model;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super Model> aVar) {
            aVar.mo10503a((Object) this.f7591a);
        }
    }

    /* renamed from: a */
    public static <T> C2255v<T> m9677a() {
        return (C2255v<T>) f7589a;
    }

    @Override // com.bumptech.glide.load.p085b.AbstractC2233n
    /* renamed from: a */
    public AbstractC2233n.C2234a<Model> mo10534a(Model model, int i, int i2, C2390f fVar) {
        return new AbstractC2233n.C2234a<>(new C2120d(model), new C2257b(model));
    }
}
