package com.ss.android.lark.passport.kar.refresh;

import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;

/* renamed from: com.ss.android.lark.passport.kar.refresh.a */
public class C49322a extends AbstractC38759a<V2ResponseModel<KaTokenRefreshResponse>> {
    /* renamed from: a */
    public V2ResponseModel<KaTokenRefreshResponse> mo107503b(String str) {
        V2ResponseModel<KaTokenRefreshResponse> v2ResponseModel = new V2ResponseModel<>();
        KaTokenRefreshResponse kaTokenRefreshResponse = (KaTokenRefreshResponse) C38760a.m153056a(str, KaTokenRefreshResponse.class);
        if (kaTokenRefreshResponse == null) {
            v2ResponseModel.code = 4401;
            v2ResponseModel.message = "token 更新失败";
        } else {
            v2ResponseModel.code = 0;
            v2ResponseModel.message = "OK";
            v2ResponseModel.data = kaTokenRefreshResponse;
        }
        return v2ResponseModel;
    }
}
