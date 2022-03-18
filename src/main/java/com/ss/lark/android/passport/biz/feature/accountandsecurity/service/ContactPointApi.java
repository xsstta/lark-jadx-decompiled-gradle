package com.ss.lark.android.passport.biz.feature.accountandsecurity.service;

import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.util.C49187f;
import com.ss.android.lark.passport.infra.util.C49199m;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.service.response.QueryContactPointsResponse;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/accountandsecurity/service/ContactPointApi;", "", "()V", "fetchCredentialList", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/lark/android/passport/biz/feature/accountandsecurity/service/response/QueryContactPointsResponse;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.accountandsecurity.service.a */
public final class ContactPointApi {

    /* renamed from: a */
    public static final ContactPointApi f163070a = new ContactPointApi();

    private ContactPointApi() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m253862a(UniContext uniContext, AbstractC49352d<QueryContactPointsResponse> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        return C49199m.m193957a(new CommonRequest.Builder(uniContext, false).mo171303a(HttpMethod.GET).mo171305a("/accounts/security/credential/list").mo171310a(), C49187f.m193935a(dVar, QueryContactPointsResponse.class));
    }
}
