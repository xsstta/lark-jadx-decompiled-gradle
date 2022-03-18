package com.larksuite.component.openplatform.core.plugin.op.appscope;

import com.tt.miniapp.errorcode.ApiCode;

/* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.c */
public class C25375c {

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.appscope.c$1 */
    public static /* synthetic */ class C253761 {

        /* renamed from: a */
        static final /* synthetic */ int[] f61906a;

        /* renamed from: b */
        static final /* synthetic */ int[] f61907b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.f61907b = r0
                r1 = 1
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r2 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.APPLYING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.f61907b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r3 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.NO_APPLY_LIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.f61907b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus r4 = com.larksuite.component.openplatform.core.plugin.op.appscope.ApplyStatus.APPLY_EXCEED_LIMIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode[] r3 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.f61906a = r3
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r4 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.SERVER_INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.f61906a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r3 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.NO_VISIBILITY     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.f61906a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode r1 = com.larksuite.component.openplatform.core.plugin.op.appscope.ScopeErrCode.APPLICATION_NOT_INSTALLED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.op.appscope.C25375c.C253761.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static ApplyStatusResult m90880a(ApplyStatus applyStatus) {
        ApplyStatusResult applyStatusResult = ApplyStatusResult.UNKNOWN;
        int i = C253761.f61907b[applyStatus.ordinal()];
        if (i == 1) {
            return ApplyStatusResult.USER_APPLYING;
        }
        if (i == 2) {
            return ApplyStatusResult.NO_APPLY_LIST;
        }
        if (i != 3) {
            return applyStatusResult;
        }
        return ApplyStatusResult.APPLY_EXCEED_LIMIT;
    }

    /* renamed from: a */
    public static ApiCode m90881a(int i) {
        int i2 = C253761.f61906a[ScopeErrCode.forNumber(i).ordinal()];
        if (i2 == 1) {
            return ApiCode.GENERAL_UNKONW_ERROR;
        }
        if (i2 == 2) {
            return ApiCode.GETTENANTAPPSCOPES_NOT_VISIBLE;
        }
        if (i2 != 3) {
            return ApiCode.GENERAL_UNKONW_ERROR;
        }
        return ApiCode.GETTENANTAPPSCOPES_NOT_INSTALLED;
    }
}
