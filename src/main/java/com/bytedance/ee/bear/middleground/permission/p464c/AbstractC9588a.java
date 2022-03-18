package com.bytedance.ee.bear.middleground.permission.p464c;

import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.p3511d.AbstractC70020b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.middleground.permission.c.a */
public abstract class AbstractC9588a<PARAMS extends NonProguard, RESULT extends NonProguard> {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<RESULT>> f25741a;

    /* renamed from: b */
    private final String f25742b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36703a(NetService.C5077f fVar, PARAMS params);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Type mo36702a() throws IllegalStateException {
        try {
            return new TypeReference<NetService.Result<RESULT>>(((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1]) {
                /* class com.bytedance.ee.bear.middleground.permission.p464c.AbstractC9588a.C95891 */
            }.getType();
        } catch (Exception e) {
            throw new IllegalStateException("BasePuller parseType() fail !!!", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m39721a(Throwable th) throws Exception {
        C13479a.m54761a("BasePuller", th);
        return AbstractC68307f.m265084a(th);
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: io.reactivex.f<R>, io.reactivex.f<RESULT extends com.bytedance.ee.util.io.NonProguard> */
    /* renamed from: a */
    public AbstractC68307f<RESULT> mo36701a(PARAMS params) {
        NetService.C5077f fVar = new NetService.C5077f(this.f25742b);
        mo36703a(fVar, params);
        return (AbstractC68307f<R>) this.f25741a.mo20141a(fVar).mo238020d(new Function<NetService.Result<RESULT>, RESULT>() {
            /* class com.bytedance.ee.bear.middleground.permission.p464c.AbstractC9588a.C95902 */

            /* renamed from: a */
            public RESULT apply(NetService.Result<RESULT> result) throws Exception {
                if (result != null && result.code == 0 && result.getData() != null) {
                    return result.getData();
                }
                throw new Exception(getClass().getSimpleName() + " access error: " + result);
            }
        }).mo238026e($$Lambda$a$Bf3w2iVkj85UBCEyTVnmjz7uI.INSTANCE);
    }

    public AbstractC9588a(NetService netService, String str) {
        this.f25742b = str;
        this.f25741a = netService.mo20118a(mo36702a());
    }
}
