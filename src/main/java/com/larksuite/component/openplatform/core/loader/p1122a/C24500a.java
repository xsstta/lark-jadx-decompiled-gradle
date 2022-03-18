package com.larksuite.component.openplatform.core.loader.p1122a;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24509c;
import com.larksuite.component.openplatform.core.loader.abs.AbstractC24510d;
import java.io.File;

/* renamed from: com.larksuite.component.openplatform.core.loader.a.a */
public class C24500a implements AbstractC24510d {

    /* renamed from: com.larksuite.component.openplatform.core.loader.a.a$1 */
    static /* synthetic */ class C245011 {

        /* renamed from: a */
        static final /* synthetic */ int[] f60434a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tt.refer.common.base.AppType[] r0 = com.tt.refer.common.base.AppType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.loader.p1122a.C24500a.C245011.f60434a = r0
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.CardAPP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.openplatform.core.loader.p1122a.C24500a.C245011.f60434a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.refer.common.base.AppType r1 = com.tt.refer.common.base.AppType.BlockitApp     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.loader.p1122a.C24500a.C245011.<clinit>():void");
        }
    }

    @Override // com.larksuite.component.openplatform.core.loader.abs.AbstractC24510d
    /* renamed from: a */
    public AbstractC24509c mo87358a(IAppContext iAppContext, String str) {
        int i = C245011.f60434a[iAppContext.getAppType().ordinal()];
        if (i == 1 || i == 2) {
            return new C24505c(new File(str));
        }
        return null;
    }
}
