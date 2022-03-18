package com.larksuite.component.openplatform.core.plugin.container.p1129b;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapp.shortcut.C66827b;
import com.tt.miniapp.shortcut.ShortcutService;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.container.b.a */
public class C24657a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "addShortcut";
    }

    public C24657a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        C66827b.m260741a("api", getAppContext());
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams == null || !TextUtils.isEmpty(initParams.mo234509i())) {
            ShortcutService shortcutService = (ShortcutService) AppbrandApplicationImpl.getInst(getAppContext()).getService(ShortcutService.class);
            if (shortcutService == null) {
                AppBrandLogger.m52829e("ApiAddShortcutCtrl", "shortcut service null");
                callbackFail("shortcut manager is null");
                C66827b.m260742a("no", "shortcut manager is null", getAppContext());
                return;
            }
            AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(getAppContext()).getAppInfo();
            if (appInfo == null) {
                AppBrandLogger.m52829e("ApiAddShortcutCtrl", "appInfo null");
                callbackFail("appInfo is null");
                C66827b.m260742a("no", "appInfo is null", getAppContext());
                return;
            }
            shortcutService.tryToAddShortcut(getAppContext().getCurrentActivity(), new C66817a.C66818a().mo232743c(appInfo.appId).mo232739a(appInfo.type).mo232740a(appInfo.icon).mo232742b(appInfo.appName).mo232741a());
            callbackOk();
            return;
        }
        AppBrandLogger.m52829e("ApiAddShortcutCtrl", "shortcut launch activty not config");
        callbackFail("feature is not supported in app");
        C66827b.m260742a("no", "feature is not supported in app", getAppContext());
    }

    public C24657a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}
