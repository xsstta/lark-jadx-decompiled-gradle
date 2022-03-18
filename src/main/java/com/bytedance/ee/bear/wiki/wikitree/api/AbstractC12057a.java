package com.bytedance.ee.bear.wiki.wikitree.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.wiki.common.p579a.C11931b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.api.a */
public abstract class AbstractC12057a<PARAMS extends Serializable, RESULT extends Serializable> implements AbstractC12060b<PARAMS, RESULT> {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<RESULT>> f32551a;

    /* renamed from: b */
    private final String f32552b;

    /* renamed from: c */
    private final int f32553c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Type mo46183a() throws IllegalStateException {
        try {
            return new TypeReference<NetService.Result<RESULT>>(((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1]) {
                /* class com.bytedance.ee.bear.wiki.wikitree.api.AbstractC12057a.C120581 */
            }.getType();
        } catch (Exception e) {
            throw new IllegalStateException("BasePuller parseType() fail !!!", e);
        }
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: io.reactivex.f<R>, io.reactivex.f<RESULT extends java.io.Serializable> */
    /* renamed from: a */
    public AbstractC68307f<RESULT> mo46192a(PARAMS params) {
        return (AbstractC68307f<R>) this.f32551a.mo20141a(m49931b(params)).mo238020d(new Function<NetService.Result<RESULT>, RESULT>() {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.AbstractC12057a.C120592 */

            /* renamed from: a */
            public RESULT apply(NetService.Result<RESULT> result) throws Exception {
                if (result != null && result.code == 0 && result.getData() != null) {
                    return result.getData();
                }
                throw new Exception(getClass().getSimpleName() + " access error: " + result);
            }
        }).mo238026e(new Function(params) {
            /* class com.bytedance.ee.bear.wiki.wikitree.api.$$Lambda$a$SpcISh3h2uvGtbDfsYMxVusJnzU */
            public final /* synthetic */ Serializable f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AbstractC12057a.this.m49930a(this.f$1, (Throwable) obj);
            }
        });
    }

    /* renamed from: b */
    private NetService.C5076e m49931b(PARAMS params) {
        NetService.C5077f fVar = new NetService.C5077f(this.f32552b);
        if (this.f32553c == 2) {
            fVar.mo20143a(2);
            Map hashMap = new HashMap();
            try {
                hashMap = C11931b.m49469a(params);
            } catch (Exception e) {
                C13479a.m54759a("Wiki_BasePuller", "get request build urlParams fail. ", e);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                fVar.mo20145a((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            fVar.mo20143a(1);
            fVar.mo20153c(JSON.toJSONString(params));
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m49930a(Serializable serializable, Throwable th) throws Exception {
        C13479a.m54759a("Wiki_BasePuller", String.format("%s pull error, params: %s. ", getClass().getSimpleName(), serializable.toString()), th);
        return AbstractC68307f.m265084a(th);
    }

    public AbstractC12057a(NetService netService, String str, int i) {
        this.f32552b = str;
        this.f32551a = netService.mo20118a(mo46183a());
        this.f32553c = i;
    }
}
