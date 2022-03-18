package com.ss.android.lark.integrator.im.dependency;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33992b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.im.dependency.d */
public class C39563d implements AbstractC36474h.AbstractC36479e {
    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36479e
    /* renamed from: a */
    public void mo134612a(AbstractC33992b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).registerPushSaveToNutStateListener(bVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36479e
    /* renamed from: b */
    public void mo134615b(AbstractC33992b bVar) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).unRegisterPushSaveToNutStateListener(bVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36479e
    /* renamed from: a */
    public void mo134613a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDrivePreviewUrl(str, str2, sourceType, iGetDataCallback);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36474h.AbstractC36479e
    /* renamed from: a */
    public void mo134614a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).saveToNutStore(str, str2, str3, sourceType, iGetDataCallback);
    }
}
