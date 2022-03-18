package com.bytedance.ee.bear.net;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.log.C13479a;
import java.io.Serializable;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.ee.bear.net.c */
public class C10276c<T extends Serializable> implements AbstractC10295p<T> {

    /* renamed from: a */
    private Type f27752a;

    public C10276c(Type type) {
        this.f27752a = type;
    }

    @Override // com.bytedance.ee.bear.net.AbstractC10295p
    /* renamed from: b */
    public T mo30718b(String str) {
        try {
            return (T) ((Serializable) JSON.parseObject(str, this.f27752a, new Feature[0]));
        } catch (Exception e) {
            C13479a.m54759a("DefaultParser", "parseData: found error", e);
            return null;
        }
    }
}
