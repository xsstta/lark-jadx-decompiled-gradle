package com.ss.android.lark.invitation.v2.feat.external.main.feishu;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.main.feishu.AbstractC40284a;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.feishu.c */
public class C40288c extends BaseModel implements AbstractC40284a.AbstractC40285a {
    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.main.p2058a.AbstractC40273a
    /* renamed from: a */
    public void mo146080a(IGetDataCallback<Boolean> iGetDataCallback) {
        C40147z.m159162b().shouldGuideExternal(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}
