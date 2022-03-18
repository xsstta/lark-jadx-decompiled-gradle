package com.bumptech.glide.util.p097a;

/* renamed from: com.bumptech.glide.util.a.c */
public abstract class AbstractC2554c {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo11227a(boolean z);

    /* renamed from: b */
    public abstract void mo11228b();

    private AbstractC2554c() {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.util.a.c$a */
    public static class C2556a extends AbstractC2554c {

        /* renamed from: a */
        private volatile boolean f8269a;

        C2556a() {
            super();
        }

        @Override // com.bumptech.glide.util.p097a.AbstractC2554c
        /* renamed from: b */
        public void mo11228b() {
            if (this.f8269a) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // com.bumptech.glide.util.p097a.AbstractC2554c
        /* renamed from: a */
        public void mo11227a(boolean z) {
            this.f8269a = z;
        }
    }

    /* renamed from: a */
    public static AbstractC2554c m10866a() {
        return new C2556a();
    }
}
