package com.bytedance.ee.bear.net;

import io.reactivex.functions.Function;
import java.io.Serializable;

/* renamed from: com.bytedance.ee.bear.net.o */
public class C10294o<T extends Serializable> implements Function<String, T> {

    /* renamed from: a */
    private AbstractC10295p<T> f27783a;

    public C10294o(AbstractC10295p<T> pVar) {
        this.f27783a = pVar;
    }

    /* renamed from: a */
    public T apply(String str) throws Exception {
        return this.f27783a.mo30718b(str);
    }
}
