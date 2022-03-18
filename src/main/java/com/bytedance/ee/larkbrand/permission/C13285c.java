package com.bytedance.ee.larkbrand.permission;

import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper;

/* renamed from: com.bytedance.ee.larkbrand.permission.c */
public class C13285c extends AbsPermissionSyncWrapper {

    /* renamed from: a */
    private AbsPermissionSyncWrapper.SyncAuthState f35185a;

    @Override // com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper
    /* renamed from: a */
    public String mo49505a() {
        return "minaSession";
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper
    /* renamed from: b */
    public String mo49512b() {
        return "/SyncClientAuth";
    }

    public C13285c(IAppContext iAppContext) {
        super(iAppContext);
    }

    @Override // com.bytedance.ee.larkbrand.permission.AbsPermissionSyncWrapper
    /* renamed from: a */
    public void mo49506a(AbsPermissionSyncWrapper.SyncAuthState syncAuthState, Object... objArr) {
        this.f35185a = syncAuthState;
    }
}
