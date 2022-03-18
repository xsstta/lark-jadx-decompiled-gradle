package com.larksuite.component.openplatform.core.p1121d;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.component.openplatform.api.entity.C24377a;
import com.larksuite.component.openplatform.api.entity.OPContainerBundle;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.api.p1105d.AbstractC24372a;
import com.larksuite.component.openplatform.core.container.impl.C24488f;
import com.larksuite.component.openplatform.core.container.impl.C24490g;
import com.larksuite.component.openplatform.core.container.impl.C24491h;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.refer.common.base.AppType;

/* renamed from: com.larksuite.component.openplatform.core.d.a */
public class C24496a implements AbstractC24372a {

    /* renamed from: com.larksuite.component.openplatform.core.d.a$1 */
    static /* synthetic */ class C244971 {

        /* renamed from: a */
        static final /* synthetic */ int[] f60431a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.p1121d.C24496a.C244971.f60431a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.p1121d.C24496a.C244971.f60431a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.GadgetAPP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.openplatform.core.p1121d.C24496a.C244971.f60431a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.p1121d.C24496a.C244971.<clinit>():void");
        }
    }

    @Override // com.larksuite.component.openplatform.api.p1105d.AbstractC24372a
    /* renamed from: a */
    public AbstractC24361a mo87138a(OPContainerBundle oPContainerBundle, String str) {
        AbstractC24361a aVar;
        AbstractC24370c e;
        AppType appType = (AppType) C25529d.m91149b(oPContainerBundle.mo87152c(), C24377a.f60160e);
        int i = C244971.f60431a[appType.ordinal()];
        if (i == 1) {
            aVar = new C24490g(oPContainerBundle, str);
        } else if (i == 2) {
            aVar = new C24491h(oPContainerBundle, str);
        } else if (i != 3) {
            AppBrandLogger.m52829e("OP_SDK_OPAppContainerProviderImpl", "App Container didn't support type : " + appType);
            if (!(oPContainerBundle == null || (e = oPContainerBundle.mo87154e()) == null)) {
                e.mo49119a("20010", "CONTAINER_STATUS_MSG_NO_APP_NO_SUPPORT_TYPE");
            }
            return null;
        } else {
            aVar = new C24488f(oPContainerBundle, str);
        }
        return aVar;
    }
}
