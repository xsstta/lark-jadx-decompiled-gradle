package com.ss.android.lark.passport.infra.base.network.interceptor;

import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/IRequestInterceptor;", "", "processRequest", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "processRequestHeaders", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.f */
public interface IRequestInterceptor {
    /* renamed from: a */
    IRequest mo171335a(IRequest eVar);

    /* renamed from: b */
    InterceptorResult mo171337b(IRequest eVar);
}
