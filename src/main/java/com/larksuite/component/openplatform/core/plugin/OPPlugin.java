package com.larksuite.component.openplatform.core.plugin;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.core.container.C24474c;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;

public abstract class OPPlugin extends AbstractC25889a {
    private IAppContext mAppContext;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        this.mAppContext = null;
    }

    public IAppContext getAppContext() {
        return this.mAppContext;
    }

    public AbstractC67709b.AbstractC67710a getApiDependency() {
        if (getApiService() != null) {
            return (AbstractC67709b.AbstractC67710a) getApiService().mo235130i();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AbstractC67709b getApiService() {
        if (getAppContext() != null) {
            return (AbstractC67709b) getAppContext().findServiceByInterface(AbstractC67709b.class);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String getAppId() {
        if (getAppContext() != null) {
            return getAppContext().getAppId();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String getScene() {
        AppbrandApplicationImpl inst;
        if (getAppContext() == null || (inst = AppbrandApplicationImpl.getInst(getAppContext())) == null || inst.getAppInfo() == null) {
            return null;
        }
        return inst.getAppInfo().scene;
    }

    public void callbackOK(LKEvent lKEvent) {
        lKEvent.mo92153t();
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        this.mAppContext = getEventContext(lKEvent);
        return super.handleEvent(lKEvent);
    }

    /* access modifiers changed from: protected */
    public IAppContext getEventContext(LKEvent lKEvent) {
        Object e = lKEvent.mo92138e();
        if (e != null) {
            return (IAppContext) e;
        }
        if (lKEvent.mo92151r() instanceof AbstractC24361a) {
            return ((AbstractC24361a) lKEvent.mo92151r()).mo87113d();
        }
        if (lKEvent.mo92151r() instanceof C24474c) {
            return ((C24474c) lKEvent.mo92151r()).mo87312c();
        }
        return null;
    }

    public void callbackFail(String str, LKEvent lKEvent) {
        callbackFail(ApiCode.GENERAL_UNKONW_ERROR, str, lKEvent);
    }

    public void callbackFail(ApiCode apiCode, LKEvent lKEvent) {
        C25921b bVar = new C25921b();
        bVar.mErrorCode = apiCode.code;
        bVar.mErrorMessage = apiCode.msg;
        lKEvent.mo92132b(bVar);
    }

    public void callbackFail(ApiCode apiCode, String str, LKEvent lKEvent) {
        C25921b bVar = new C25921b();
        bVar.mErrorCode = apiCode.code;
        bVar.mErrorMessage = str;
        lKEvent.mo92132b(bVar);
    }
}
