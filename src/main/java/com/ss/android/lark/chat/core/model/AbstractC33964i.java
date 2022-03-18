package com.ss.android.lark.chat.core.model;

import java.util.List;

/* renamed from: com.ss.android.lark.chat.core.model.i */
public interface AbstractC33964i<T> extends List<T> {

    /* renamed from: com.ss.android.lark.chat.core.model.i$a */
    public interface AbstractC33965a<T extends AbstractC33964i> {
        /* renamed from: a */
        void mo124069a(T t);

        /* renamed from: a */
        void mo124070a(T t, int i, int i2);

        /* renamed from: b */
        void mo124072b(T t);

        /* renamed from: b */
        void mo124073b(T t, int i, int i2);

        /* renamed from: c */
        void mo124074c(T t, int i, int i2);
    }

    void acquireReadAccess();

    void addOnListUpdateCallback(AbstractC33965a<? extends AbstractC33964i<T>> aVar);

    void releaseReadAccess();

    void removeOnListUpdateCallback(AbstractC33965a<? extends AbstractC33964i<T>> aVar);
}
