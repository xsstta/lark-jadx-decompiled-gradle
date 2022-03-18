package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import android.content.Context;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.ss.android.lark.biz.core.api.AbstractC29588w;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.x */
class C39341x implements AbstractC5115a {
    C39341x() {
    }

    @Override // com.bytedance.ee.bear.contract.p278b.AbstractC5115a
    /* renamed from: a */
    public void mo20220a(String str) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterScenario(str);
    }

    @Override // com.bytedance.ee.bear.contract.p278b.AbstractC5115a
    /* renamed from: a */
    public void mo20221a(String str, Map<String, String> map, Context context, final AbstractC5115a.AbstractC5116a aVar) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerScenario(str, map, new MagicViewContainer(context), new AbstractC29588w() {
            /* class com.ss.android.lark.integrator.ccm.dependency.p2015a.C39341x.C393421 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29588w
            /* renamed from: a */
            public boolean mo105896a(String str, String str2, String str3) {
                AbstractC5115a.AbstractC5116a aVar = aVar;
                if (aVar == null || aVar.canShow()) {
                    return true;
                }
                return false;
            }
        });
    }
}
