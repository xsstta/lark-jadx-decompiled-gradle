package com.bytedance.pipeline;

import com.bytedance.pipeline.p859a.AbstractC20231a;

/* renamed from: com.bytedance.pipeline.h */
public final class C20240h {

    /* renamed from: a */
    Class<? extends AbstractC20235d> f49516a;

    /* renamed from: b */
    private AbstractC20231a f49517b;

    /* renamed from: c */
    private Object[] f49518c;

    /* renamed from: com.bytedance.pipeline.h$a */
    public static final class C20242a {

        /* renamed from: a */
        public Class<? extends AbstractC20235d> f49519a;

        /* renamed from: b */
        public AbstractC20231a f49520b;

        /* renamed from: c */
        public Object[] f49521c;

        private C20242a() {
        }

        /* renamed from: a */
        public static C20242a m73913a() {
            return new C20242a();
        }

        /* renamed from: b */
        public C20240h mo68507b() {
            return new C20240h(this);
        }

        /* renamed from: a */
        public C20242a mo68504a(AbstractC20231a aVar) {
            this.f49520b = aVar;
            return this;
        }

        /* renamed from: a */
        public C20242a mo68505a(Class<? extends AbstractC20235d> cls) {
            if (cls != null) {
                this.f49519a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        /* renamed from: a */
        public C20242a mo68506a(Object... objArr) {
            if (objArr != null) {
                this.f49521c = objArr;
                return this;
            }
            throw new IllegalArgumentException("args == null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Class<? extends AbstractC20235d> mo68501a() {
        return this.f49516a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC20231a mo68502b() {
        return this.f49517b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Object[] mo68503c() {
        return this.f49518c;
    }

    private C20240h(C20242a aVar) {
        this.f49516a = aVar.f49519a;
        this.f49517b = aVar.f49520b;
        this.f49518c = aVar.f49521c;
        if (this.f49516a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
