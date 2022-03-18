package com.bytedance.ee.ref.gadget;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12915c;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.ee.larkbrand.permission.C13285c;
import com.bytedance.ee.ref.gadget.p694a.C13570a;
import com.bytedance.ee.ref.gadget.p695b.C13571a;
import com.bytedance.ee.ref.impl.host.C13577a;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.AbstractC24540d;
import com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.C24513a;
import com.larksuite.component.openplatform.core.loader.jsbundle.p1126a.p1127a.C24515a;
import com.larksuite.component.openplatform.core.plugin.device.nfc.C24854h;
import com.tt.miniapp.manager.C66413b;
import com.tt.miniapp.permission.C66581d;
import com.tt.miniapp.permission.C66583e;
import com.tt.miniapp.settings.configs.GadgetFGService;
import com.tt.miniapp.settings.configs.IGadgetFgService;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67437e;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67438f;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.blank.IBlankCheckService;
import com.tt.refer.common.config.ConfigStrategyManager;
import com.tt.refer.common.config.IConfigStrategy;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.impl.business.api.C67875a;
import com.tt.refer.impl.business.api.C67876b;
import com.tt.refer.impl.business.file.C67924c;
import com.tt.refer.impl.business.meta.C67945a;
import com.tt.refer.impl.business.meta.C67948b;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.impl.business.p3435f.C67916a;
import com.tt.refer.impl.business.pkg.GadgetPkgMgrService;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3404c.C67719a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;

/* renamed from: com.bytedance.ee.ref.gadget.a */
public class C13569a implements AbstractC67437e {

    /* renamed from: a */
    private AbstractC67438f f35690a = new C67719a();

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67437e
    /* renamed from: a */
    public AppType mo50158a() {
        return AppType.GadgetAPP;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67438f
    /* renamed from: a */
    public IBaseService mo50157a(IAppContext iAppContext, Class cls) {
        if (AbstractC67709b.class == cls) {
            return new C67876b(iAppContext, new C13570a(iAppContext));
        }
        if (AbstractC67724a.class == cls) {
            return new C13577a(iAppContext);
        }
        if (AbstractC12910a.class == cls) {
            return new C67916a(iAppContext, new C12915c(iAppContext));
        }
        if (AbstractC67722a.class == cls) {
            return new C67924c(iAppContext, new C13571a(iAppContext));
        }
        if (IPkgMgrService.class == cls) {
            GadgetPkgMgrService gadgetPkgMgrService = new GadgetPkgMgrService(iAppContext);
            gadgetPkgMgrService.setPkgMonitorCreator(new GadgetMonitorCreator(iAppContext));
            return gadgetPkgMgrService;
        } else if (IAppMetaService.class == cls) {
            return new C67948b(iAppContext);
        } else {
            if (AbstractC67796c.class == cls) {
                return new C67945a(iAppContext);
            }
            if (IConfigStrategy.class == cls) {
                return new ConfigStrategyManager(iAppContext);
            }
            if (IBlankCheckService.class == cls) {
                return new C66413b(iAppContext);
            }
            if (AbstractC67733a.class == cls) {
                return new C66581d(iAppContext);
            }
            if (AbstractC67735c.class == cls) {
                return new C13285c(iAppContext);
            }
            if (AbstractC67734b.class == cls) {
                return new C66583e(iAppContext);
            }
            if (AbstractC67730a.class == cls) {
                return new C24854h(iAppContext);
            }
            if (AbstractC24540d.class == cls) {
                C24513a aVar = new C24513a(iAppContext);
                aVar.mo87370a(new C24515a(iAppContext));
                return aVar;
            } else if (AbstractC13135b.class == cls) {
                return new C13141f(iAppContext);
            } else {
                if (IGadgetFgService.class == cls) {
                    return new GadgetFGService(iAppContext);
                }
                if (AbstractC67699a.class == cls) {
                    return new C67875a(iAppContext);
                }
                return this.f35690a.mo50157a(iAppContext, cls);
            }
        }
    }
}
