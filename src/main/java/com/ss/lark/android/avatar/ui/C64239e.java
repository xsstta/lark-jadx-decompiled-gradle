package com.ss.lark.android.avatar.ui;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.lark.android.avatar.ui.AbstractC64247j;
import com.ss.lark.android.avatar.updateapi.IUpdateAvatarAPI;

/* renamed from: com.ss.lark.android.avatar.ui.e */
public class C64239e extends BaseModel implements AbstractC64247j.AbstractC64248a {

    /* renamed from: a */
    private IUpdateAvatarAPI f162413a;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    public C64239e(IUpdateAvatarAPI iUpdateAvatarAPI) {
        this.f162413a = iUpdateAvatarAPI;
    }

    @Override // com.ss.lark.android.avatar.ui.AbstractC64247j.AbstractC64248a
    /* renamed from: a */
    public void mo222692a(String str, IGetDataCallback<String> iGetDataCallback) {
        this.f162413a.doRequest(str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
