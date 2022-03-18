package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.a */
public abstract class AbstractC12451a<PARAMS extends Serializable, RESULT extends Serializable> implements AbstractC12454b<PARAMS, RESULT> {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<RESULT>> f33387a;

    /* renamed from: b */
    private final String f33388b;

    /* renamed from: c */
    private final int f33389c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Type mo47405a() throws IllegalStateException {
        try {
            return new TypeReference<NetService.Result<RESULT>>(((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1]) {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12451a.C124521 */
            }.getType();
        } catch (Exception e) {
            throw new IllegalStateException("BasePuller parseType() fail !!!", e);
        }
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: io.reactivex.f<R>, io.reactivex.f<RESULT extends java.io.Serializable> */
    /* renamed from: a */
    public AbstractC68307f<RESULT> pull(PARAMS params) {
        return (AbstractC68307f<R>) this.f33387a.mo20141a(m51764b(params)).mo238020d(new Function<NetService.Result<RESULT>, RESULT>() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.AbstractC12451a.C124532 */

            /* renamed from: a */
            public RESULT apply(NetService.Result<RESULT> result) throws Exception {
                if (result != null && result.code == 0 && result.getData() != null) {
                    return result.getData();
                }
                throw new Exception(getClass().getSimpleName() + " access error: " + result);
            }
        }).mo238026e(new Function(params) {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.$$Lambda$a$ZWDukRfJdllaDfmHmukYBBltUes */
            public final /* synthetic */ Serializable f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC12451a.this.m51763a(this.f$1, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    private static Map<String, String> m51762a(Object obj) throws Exception {
        HashMap hashMap = new HashMap();
        if (obj == null) {
            return hashMap;
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            if (obj2 != null) {
                hashMap.put(field.getName(), String.valueOf(obj2));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private NetService.C5076e m51764b(PARAMS params) {
        NetService.C5077f fVar = new NetService.C5077f(this.f33388b);
        fVar.mo20143a(this.f33389c);
        if (params != null) {
            if (fVar.mo20152c() == 2) {
                Map hashMap = new HashMap();
                try {
                    hashMap = m51762a((Object) params);
                } catch (Exception e) {
                    C13479a.m54759a("Wiki_BasePuller", "get request build urlParams fail. ", e);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    fVar.mo20145a((String) entry.getKey(), (String) entry.getValue());
                }
            } else {
                fVar.mo20153c(JSON.toJSONString(params));
            }
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m51763a(Serializable serializable, Throwable th) throws Exception {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = getClass().getSimpleName();
        if (serializable != null) {
            str = serializable.toString();
        } else {
            str = "null";
        }
        objArr[1] = str;
        C13479a.m54759a("Wiki_BasePuller", String.format("%s pull error, params: %s. ", objArr), th);
        return AbstractC68307f.m265084a(th);
    }

    public AbstractC12451a(NetService netService, String str, int i) {
        this.f33388b = str;
        this.f33387a = netService.mo20118a(mo47405a());
        this.f33389c = i;
    }
}
