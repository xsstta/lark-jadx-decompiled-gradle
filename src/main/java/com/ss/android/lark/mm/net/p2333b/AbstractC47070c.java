package com.ss.android.lark.mm.net.p2333b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.lark.mm.net.b.c */
public abstract class AbstractC47070c<Data> implements AbstractC47069b<Data> {

    /* renamed from: a */
    private ParameterizedType f118481a;

    /* renamed from: h */
    public boolean f118482h;

    /* renamed from: a */
    public ParameterizedType mo165311a() {
        return this.f118481a;
    }

    public AbstractC47070c() {
        ParameterizedType parameterizedType;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) genericSuperclass;
        } else {
            parameterizedType = null;
        }
        this.f118481a = parameterizedType;
    }

    public AbstractC47070c(AbstractC47070c cVar) {
        this.f118481a = cVar.f118481a;
        this.f118482h = cVar.f118482h;
    }
}
