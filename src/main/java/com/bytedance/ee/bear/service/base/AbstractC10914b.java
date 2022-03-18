package com.bytedance.ee.bear.service.base;

import android.app.Application;
import com.bytedance.ee.bear.service.AbstractC10928d;
import com.bytedance.ee.bear.service.base.AbstractC10913a;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.service.base.b */
public interface AbstractC10914b<I, S extends AbstractC10913a> {

    /* renamed from: com.bytedance.ee.bear.service.base.b$a */
    public interface AbstractC10915a {
        /* renamed from: a */
        void mo41503a();

        /* renamed from: b */
        boolean mo41504b();
    }

    /* renamed from: a */
    void mo41484a();

    /* renamed from: a */
    void mo41485a(Application application);

    /* renamed from: a */
    void mo41487a(S s, AbstractC10928d dVar);

    /* renamed from: a */
    void mo41488a(AbstractC10915a aVar);

    /* renamed from: a */
    boolean mo41489a(AbstractC10913a aVar);

    /* renamed from: a */
    boolean mo41490a(Class<?> cls);

    /* renamed from: b */
    I mo41491b(Class<I> cls);

    /* renamed from: b */
    void mo41492b(AbstractC10913a aVar);

    /* renamed from: c */
    AbstractC68307f<I> mo41493c(Class<I> cls);
}
