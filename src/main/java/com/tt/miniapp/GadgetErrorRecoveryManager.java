package com.tt.miniapp;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.errorcode.ErrorType;

public class GadgetErrorRecoveryManager extends AppbrandServiceManager.ServiceBase {
    private IAppContext appContext;

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.GadgetErrorRecoveryManager$1 */
    public static /* synthetic */ class C657111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f165577a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tt.miniapp.errorcode.ErrorType[] r0 = com.tt.miniapp.errorcode.ErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tt.miniapp.GadgetErrorRecoveryManager.C657111.f165577a = r0
                com.tt.miniapp.errorcode.ErrorType r1 = com.tt.miniapp.errorcode.ErrorType.RUN_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.tt.miniapp.GadgetErrorRecoveryManager.C657111.f165577a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tt.miniapp.errorcode.ErrorType r1 = com.tt.miniapp.errorcode.ErrorType.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.GadgetErrorRecoveryManager.C657111.<clinit>():void");
        }
    }

    protected GadgetErrorRecoveryManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
        this.appContext = appbrandApplicationImpl.getiAppContext();
    }

    private String getErrorContent(ErrorType errorType) {
        int i = C657111.f165577a[errorType.ordinal()];
        if (i == 1) {
            return this.appContext.getApplicationContext().getString(R.string.OpenPlatform_GadgetErr_AppErrToast);
        }
        if (i != 2) {
            return this.appContext.getApplicationContext().getString(R.string.OpenPlatform_GadgetErr_AppErrToast);
        }
        return this.appContext.getApplicationContext().getString(R.string.microapp_m_network_bad_check);
    }

    public String getErrorDesc(ErrorType errorType, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getErrorContent(errorType));
        String string = this.appContext.getApplicationContext().getString(R.string.OpenPlatform_GadgetErr_ErrorCodeDesc);
        sb.append("(");
        sb.append(string);
        sb.append(":");
        sb.append(errorType.getValue());
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
