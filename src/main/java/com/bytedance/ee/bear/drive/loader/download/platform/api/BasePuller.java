package com.bytedance.ee.bear.drive.loader.download.platform.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller.Params;
import com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller.Result;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.p3511d.AbstractC70020b;

public abstract class BasePuller<PARAMS extends Params, RESULT extends Result> implements AbstractC7064c<PARAMS, RESULT> {

    /* renamed from: a */
    private NetService.AbstractC5075d<NetService.Result<RESULT>> f18995a;

    /* renamed from: b */
    private final String f18996b;

    public static abstract class Params implements Serializable {
    }

    public static abstract class Result implements Serializable {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27623a(NetService.C5077f fVar, PARAMS params) {
    }

    /* renamed from: a */
    private Type m28062a() {
        try {
            return new TypeReference<NetService.Result<RESULT>>(((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1]) {
                /* class com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller.C70471 */
            }.getType();
        } catch (Exception e) {
            throw new IllegalStateException("BasePuller parseType() fail !!!", e);
        }
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: io.reactivex.f<R>, io.reactivex.f<RESULT extends com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller$Result> */
    /* renamed from: a */
    public AbstractC68307f<RESULT> mo26542a(PARAMS params) {
        NetService.C5077f fVar = new NetService.C5077f(this.f18996b);
        fVar.mo20153c(JSON.toJSONString(params));
        fVar.mo20143a(1);
        mo27623a(fVar, params);
        return (AbstractC68307f<R>) this.f18995a.mo20141a(fVar).mo238020d(new Function<NetService.Result<RESULT>, RESULT>() {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.BasePuller.C70482 */

            /* renamed from: a */
            public RESULT apply(NetService.Result<RESULT> result) throws Exception {
                if (result != null && result.code == 0 && result.getData() != null) {
                    return result.getData();
                }
                throw new Exception(getClass().getSimpleName() + " access error: " + result);
            }
        }).mo238026e(new Function(params) {
            /* class com.bytedance.ee.bear.drive.loader.download.platform.api.$$Lambda$BasePuller$sjiG9sUw0HPEAU2PMugh3P1tf4 */
            public final /* synthetic */ BasePuller.Params f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BasePuller.m269434lambda$sjiG9sUw0HPEAU2PMugh3P1tf4(BasePuller.this, this.f$1, (Throwable) obj);
            }
        });
    }

    public BasePuller(NetService netService, String str) {
        this.f18996b = str;
        this.f18995a = netService.mo20118a(m28062a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m28063a(Params params, Throwable th) throws Exception {
        C13479a.m54759a("DrivePlatform_BasePuller", String.format("%s pull error, params: %s. ", getClass().getSimpleName(), params.toString()), th);
        return AbstractC68307f.m265084a(th);
    }
}
