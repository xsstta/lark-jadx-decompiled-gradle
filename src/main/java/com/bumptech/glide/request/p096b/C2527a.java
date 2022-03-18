package com.bumptech.glide.request.p096b;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.p096b.AbstractC2529b;

/* renamed from: com.bumptech.glide.request.b.a */
public class C2527a<R> implements AbstractC2529b<R> {

    /* renamed from: a */
    static final C2527a<?> f8206a = new C2527a<>();

    /* renamed from: b */
    private static final AbstractC2531c<?> f8207b = new C2528a();

    @Override // com.bumptech.glide.request.p096b.AbstractC2529b
    /* renamed from: a */
    public boolean mo11202a(Object obj, AbstractC2529b.AbstractC2530a aVar) {
        return false;
    }

    /* renamed from: a */
    public static <R> AbstractC2531c<R> m10756a() {
        return (AbstractC2531c<R>) f8207b;
    }

    /* renamed from: com.bumptech.glide.request.b.a$a */
    public static class C2528a<R> implements AbstractC2531c<R> {
        @Override // com.bumptech.glide.request.p096b.AbstractC2531c
        /* renamed from: a */
        public AbstractC2529b<R> mo11203a(DataSource dataSource, boolean z) {
            return C2527a.f8206a;
        }
    }
}
