package com.larksuite.component.openplatform.infra.session;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3403b.AbstractC67717a;
import com.tt.refer.p3413b.p3414a.AbstractC67737a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/larksuite/component/openplatform/infra/session/PlatformSessionMgr;", "", "()V", "H5_SESSION", "", "MINA_SESSION", "SESSION_TYPE", "SESSION_VALUE", "getPlatformSessionByAppContext", "", "context", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.infra.b.a */
public final class PlatformSessionMgr {

    /* renamed from: a */
    public static final PlatformSessionMgr f62170a = new PlatformSessionMgr();

    private PlatformSessionMgr() {
    }

    /* renamed from: a */
    public final Map<String, String> mo88675a(IAppContext iAppContext) {
        AppType appType;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(iAppContext == null || (appType = iAppContext.getAppType()) == null)) {
            int i = C25533b.f62171a[appType.ordinal()];
            String str = "";
            if (i == 1) {
                linkedHashMap.put("Session-Type", "h5_session");
                IBaseService findServiceByInterface = iAppContext.findServiceByInterface(AbstractC67717a.class);
                if (findServiceByInterface != null) {
                    String c = ((AbstractC67737a) findServiceByInterface).mo50165c();
                    if (c != null) {
                        str = c;
                    }
                    linkedHashMap.put("Session-Value", str);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.tt.refer.app.webapp.BaseWebAppJsBridgeServiceImpl");
                }
            } else if (i == 2 || i == 3 || i == 4) {
                linkedHashMap.put("Session-Type", "mina_session");
                String appId = iAppContext.getAppId();
                if (appId == null) {
                    appId = str;
                }
                String a = C66612a.m260219a(appId);
                if (a != null) {
                    str = a;
                }
                linkedHashMap.put("Session-Value", str);
            }
        }
        return linkedHashMap;
    }
}
