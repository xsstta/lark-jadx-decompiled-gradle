package com.ss.android.lark.invite_new_tenant.rule;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.invite_new_tenant.p2065c.C40536a;
import com.ss.android.lark.invite_new_tenant.rule.C40620a;
import com.ss.android.lark.invite_new_tenant.rule.p2068a.C40624a;

/* renamed from: com.ss.android.lark.invite_new_tenant.rule.b */
public class C40625b extends BaseModel implements C40620a.AbstractC40621a {
    @Override // com.ss.android.lark.invite_new_tenant.rule.C40620a.AbstractC40621a
    /* renamed from: a */
    public void mo146755a(IGetDataCallback<C40624a> iGetDataCallback) {
        C40536a.m160445a().mo146647b((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}
