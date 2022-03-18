package com.bytedance.ee.ref.p682a.p685c;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper;
import com.bytedance.ee.webapp.p720a.C13755b;
import com.bytedance.ee.webapp.p720a.C13756c;

/* renamed from: com.bytedance.ee.ref.a.c.c */
public class C13492c extends AbsPermissionSyncWrapper {

    /* renamed from: a */
    private AbsPermissionSyncWrapper.SyncAuthState f35545a;

    @Override // com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper
    /* renamed from: a */
    public String mo49505a() {
        return "h5Session";
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper
    /* renamed from: b */
    public String mo49512b() {
        return "/syncClientAuthBySession";
    }

    /* renamed from: c */
    public AbsPermissionSyncWrapper.SyncAuthState mo50200c() {
        return this.f35545a;
    }

    /* renamed from: com.bytedance.ee.ref.a.c.c$1 */
    static /* synthetic */ class C134931 {

        /* renamed from: a */
        static final /* synthetic */ int[] f35546a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState[] r0 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.f35546a = r0
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState r1 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.f35546a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState r1 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.f35546a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState r1 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.RESULT_BIZ_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.f35546a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState r1 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.AUTH_HAS_NO_SESSION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.f35546a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState r1 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.RESULT_DATA_INVALID     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.f35546a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper$SyncAuthState r1 = com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper.SyncAuthState.RESULT_DECRYPT_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.ref.p682a.p685c.C13492c.C134931.<clinit>():void");
        }
    }

    public C13492c(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper
    /* renamed from: a */
    public void mo49506a(AbsPermissionSyncWrapper.SyncAuthState syncAuthState, Object... objArr) {
        this.f35545a = syncAuthState;
        try {
            switch (C134931.f35546a[syncAuthState.ordinal()]) {
                case 1:
                    C13755b.m55771a("op_h5_api_auth", C13756c.f35976r, this.f170082d).flush();
                    return;
                case 2:
                    C13755b.m55771a("op_h5_api_auth", C13756c.f35977s, this.f170082d).addCategoryValue("errorMsg", objArr).flush();
                    return;
                case 3:
                    C13755b.m55771a("op_h5_api_auth", C13756c.f35978t, this.f170082d).addCategoryValue("code", objArr).flush();
                    return;
                case 4:
                    C13755b.m55771a("op_h5_api_auth", C13756c.f35982x, this.f170082d).flush();
                    return;
                case 5:
                    C13755b.m55771a("op_h5_api_auth", C13756c.f35979u, this.f170082d).flush();
                    return;
                case 6:
                    C13755b.m55771a("op_h5_api_auth", C13756c.f35980v, this.f170082d).addCategoryValue("scopeInfo", objArr).flush();
                    return;
                default:
                    return;
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("WebAppPermissionSyncSer", "syncAuthState Exception", e);
        }
    }
}
