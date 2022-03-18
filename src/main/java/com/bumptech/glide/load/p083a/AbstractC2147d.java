package com.bumptech.glide.load.p083a;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.load.a.d */
public interface AbstractC2147d<T> {

    /* renamed from: com.bumptech.glide.load.a.d$a */
    public interface AbstractC2148a<T> {
        /* renamed from: a */
        void mo10502a(Exception exc);

        /* renamed from: a */
        void mo10503a(T t);
    }

    /* renamed from: a */
    Class<T> mo10481a();

    /* renamed from: a */
    void mo10488a(Priority priority, AbstractC2148a<? super T> aVar);

    /* renamed from: b */
    void mo10489b();

    /* renamed from: c */
    void mo10490c();

    /* renamed from: d */
    DataSource mo10491d();
}
