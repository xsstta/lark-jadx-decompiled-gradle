package com.bytedance.ee.ref.p682a;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.p641a.C12917d;
import com.bytedance.ee.larkbrand.menu.AbstractC13135b;
import com.bytedance.ee.larkbrand.menu.C13141f;
import com.bytedance.ee.larkbrand.permission.p662a.C13282a;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.ref.impl.host.C13577a;
import com.bytedance.ee.ref.p682a.p683a.C13484a;
import com.bytedance.ee.ref.p682a.p684b.C13488a;
import com.bytedance.ee.ref.p682a.p685c.C13489a;
import com.bytedance.ee.ref.p682a.p685c.C13490b;
import com.bytedance.ee.ref.p682a.p685c.C13492c;
import com.larksuite.component.openplatform.core.plugin.device.nfc.C24854h;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.tt.miniapp.business.api.base.CommonApiInvokeDispatcher;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67437e;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67438f;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.impl.business.api.C67876b;
import com.tt.refer.impl.business.file.C67924c;
import com.tt.refer.impl.business.meta.C67945a;
import com.tt.refer.impl.business.p3435f.C67916a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3403b.AbstractC67717a;
import com.tt.refer.p3400a.p3404c.C67719a;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import com.tt.refer.p3400a.p3412i.AbstractC67735c;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.bytedance.ee.ref.a.a */
public class C13482a implements AbstractC67437e {

    /* renamed from: a */
    private AbstractC67438f f35528a = new C67719a();

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67437e
    /* renamed from: a */
    public AppType mo50158a() {
        return AppType.WebAPP;
    }

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67438f
    /* renamed from: a */
    public IBaseService mo50157a(final IAppContext iAppContext, Class cls) {
        if (AbstractC67709b.class == cls) {
            return new C67876b(iAppContext, new CommonApiInvokeDispatcher(iAppContext, mo50158a()));
        }
        if (AbstractC67717a.class == cls) {
            return new C13484a(iAppContext);
        }
        if (AbstractC67724a.class == cls) {
            return new C13577a(iAppContext);
        }
        if (AbstractC67722a.class == cls) {
            return new C67924c(iAppContext, new C13488a(iAppContext));
        }
        if (AbstractC12910a.class == cls) {
            return new C67916a(iAppContext, new C12917d(iAppContext));
        }
        if (AbstractC67733a.class == cls) {
            return new C13489a(iAppContext);
        }
        if (AbstractC67735c.class == cls) {
            return new C13492c(iAppContext);
        }
        if (AbstractC67734b.class == cls) {
            C13490b bVar = new C13490b(iAppContext);
            bVar.mo50191a(new Observer() {
                /* class com.bytedance.ee.ref.p682a.C13482a.C134831 */

                public void update(Observable observable, Object obj) {
                    if (obj != null) {
                        C13490b.C13491a aVar = (C13490b.C13491a) obj;
                        String str = "";
                        for (C66578b.C66579a aVar2 : C13282a.m54094a(iAppContext.getAppId(), iAppContext)) {
                            if (String.valueOf(aVar2.mo232177a()).equals(aVar.f35542a)) {
                                str = aVar2.mo232178b();
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            AppBrandLogger.m52830i("WebAppModuleProvider", "permission list not contains permission " + aVar.f35542a);
                            return;
                        }
                        C13374s.m54392a(iAppContext.getAppId(), JSON.toJSONString(new LittleAppPermissionData(Integer.valueOf(aVar.f35542a).intValue(), str, aVar.f35543b)), iAppContext.getAppType());
                    }
                }
            });
            return bVar;
        } else if (AbstractC67730a.class == cls) {
            return new C24854h(iAppContext);
        } else {
            if (AbstractC13135b.class == cls) {
                return new C13141f(iAppContext);
            }
            if (AbstractC67796c.class == cls) {
                return new C67945a(iAppContext);
            }
            return this.f35528a.mo50157a(iAppContext, cls);
        }
    }
}
