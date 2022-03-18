package com.ss.android.lark.integrator.ccm.dependency.p2015a;

import com.bytedance.ee.bear.list.AbstractC8454g;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.ccm.dependency.a.aa */
public class C39280aa implements AbstractC8454g {
    @Override // com.bytedance.ee.bear.list.AbstractC8454g
    /* renamed from: a */
    public void mo33055a(String str) {
        Log.m165389i("MileStoneAgentImpl_firstTab", "notifyBootMileStoneFirstDataLoaded, tabName = " + str);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstDataLoaded(str);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8454g
    /* renamed from: b */
    public void mo33056b(String str) {
        Log.m165389i("MileStoneAgentImpl_firstTab", "notifyBootMileStoneFirstFrameDraw, tabName = " + str);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstFrameDraw(str);
    }

    @Override // com.bytedance.ee.bear.list.AbstractC8454g
    /* renamed from: c */
    public void mo33057c(String str) {
        Log.m165389i("MileStoneAgentImpl_firstTab", "notifyBootMileStoneFirstContentDraw, tabName = " + str);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyBootMileStoneFirstContentDraw(str);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).notifyMainTabFragmentContentDraw(str);
    }
}
