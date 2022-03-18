package com.ss.android.lark.passport.infra.base.network.interceptor;

import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.RequestResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/IResponseInterceptor;", "", "processResponse", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/RequestResult;", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "requestResult", "processResponseHeaders", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.g */
public interface IResponseInterceptor {
    /* renamed from: a */
    RequestResult mo171333a(IRequest eVar, RequestResult fVar);

    /* renamed from: a */
    RequestResult mo171334a(RequestResult fVar, UniContext uniContext);
}
