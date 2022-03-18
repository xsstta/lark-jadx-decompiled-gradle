package com.ss.android.lark.setting.page.content.general;

import ai.v1.MobileComposerSetting;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.dto.C54123c;
import com.ss.android.lark.setting.page.content.general.IGeneralSettingContract;
import com.ss.android.lark.setting.service.impl.C54617d;
import com.ss.android.lark.setting.service.impl.UserSettingFacade;
import com.ss.android.lark.setting.service.usersetting.base.SmartReplySetting;

/* renamed from: com.ss.android.lark.setting.page.content.general.e */
public class C54444e extends BaseModel implements IGeneralSettingContract.AbstractC54430a {

    /* renamed from: a */
    private IGeneralSettingContract.AbstractC54430a.AbstractC54431a f134645a;

    /* renamed from: b */
    private final ISettingDependency.IDingDependency f134646b = C54115c.m210080a().mo178304p();

    /* renamed from: c */
    private final ISettingDependency.IAppConfigDependency f134647c = C54115c.m210080a().mo178305q();

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: b */
    public boolean mo186122b() {
        return C54115c.m210080a().mo178302n().mo178356a();
    }

    /* renamed from: a */
    public boolean mo186119a() {
        return C54617d.m211936l().mo186599m();
    }

    /* renamed from: a */
    public void mo186116a(IGeneralSettingContract.AbstractC54430a.AbstractC54431a aVar) {
        this.f134645a = aVar;
    }

    /* renamed from: a */
    public void mo186114a(MobileComposerSetting mobileComposerSetting) {
        C54617d.m211936l().mo186592a(mobileComposerSetting);
    }

    /* renamed from: a */
    public void mo186115a(IGetDataCallback<SmartReplySetting> iGetDataCallback) {
        C54617d.m211936l().mo186595c(iGetDataCallback);
    }

    /* renamed from: b */
    public void mo186120b(IGetDataCallback<MobileComposerSetting> iGetDataCallback) {
        C54617d.m211936l().mo186597d(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    /* renamed from: c */
    public void mo186123c(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        UserSettingFacade.m211870j().mo186564b(z);
    }

    /* renamed from: a */
    public void mo186117a(boolean z, final IGetDataCallback<C54434a> iGetDataCallback) {
        UserSettingFacade.m211870j().mo186568c(z, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<C54123c>() {
            /* class com.ss.android.lark.setting.page.content.general.C54444e.C544451 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(C54123c cVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(new C54434a(cVar.mo185286a(), cVar.mo185287b()));
                }
            }
        }));
    }

    /* renamed from: b */
    public void mo186121b(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        UserSettingFacade.m211870j().mo186570d(z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    /* renamed from: d */
    public void mo186124d(boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        if (z == C54617d.m211936l().mo186599m()) {
            return;
        }
        if (z) {
            this.f134646b.mo178329a(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        } else {
            this.f134646b.mo178328a();
        }
    }

    /* renamed from: a */
    public void mo186118a(boolean z, boolean z2) {
        C54617d.m211936l().mo186593a(z, z2);
    }
}
