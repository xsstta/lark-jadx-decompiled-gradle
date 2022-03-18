package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ee.bear.more.p500a.AbstractC10195a;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.param.Params;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.j */
class C39314j implements AbstractC10195a {
    C39314j() {
    }

    @Override // com.bytedance.ee.bear.more.p500a.AbstractC10195a
    /* renamed from: a */
    public void mo38981a() {
        if (NetworkUtils.isNetworkAvailable(LarkContext.getApplication())) {
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).launchCustomerService(LarkContext.getApplication(), new Params(Params.ReferType.Docs), null);
        } else {
            LKUIToast.show(LarkContext.getApplication(), UIUtils.getString(LarkContext.getApplication(), R.string.Lark_Legacy_NetworkErrorRetry));
        }
    }
}
