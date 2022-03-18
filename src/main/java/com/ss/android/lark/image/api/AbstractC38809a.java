package com.ss.android.lark.image.api;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.ss.android.lark.image.api.a */
public interface AbstractC38809a<T> {

    /* renamed from: com.ss.android.lark.image.api.a$a */
    public interface AbstractC38810a<T> {
        /* renamed from: a */
        void mo142221a(Exception exc);

        /* renamed from: a */
        void mo142222a(T t);
    }

    /* renamed from: a */
    void mo142216a();

    /* renamed from: a */
    void mo142217a(Priority priority, AbstractC38810a<? super T> aVar);

    /* renamed from: b */
    void mo142218b();

    /* renamed from: c */
    Class<T> mo142219c();

    /* renamed from: d */
    DataSource mo142220d();
}
