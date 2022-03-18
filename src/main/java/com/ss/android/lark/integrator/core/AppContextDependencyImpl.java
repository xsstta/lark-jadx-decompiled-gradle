package com.ss.android.lark.integrator.core;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.AbstractC29414b;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;

@ClaymoreImpl(AbstractC29414b.class)
public class AppContextDependencyImpl implements AbstractC29414b {
    @Override // com.ss.android.lark.p1382b.AbstractC29414b
    public boolean isUsPackage() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isUsPackage();
    }

    @Override // com.ss.android.lark.p1382b.AbstractC29414b
    public int getAppIdByPackage() {
        try {
            return Integer.parseInt("");
        } catch (Exception e) {
            Log.m165383e("AppContextDependencyImpl", "getAppIdByPackage error:" + e.getMessage());
            return C29410a.m108287a().mo104278b();
        }
    }
}
