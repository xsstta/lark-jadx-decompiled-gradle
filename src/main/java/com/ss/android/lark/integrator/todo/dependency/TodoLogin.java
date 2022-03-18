package com.ss.android.lark.integrator.todo.dependency;

import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.todo.dependency.idependency.ILoginDependency;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoLogin;", "Lcom/ss/android/lark/todo/dependency/idependency/ILoginDependency;", "()V", "mAccountManager", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IAccountManager;", "ensureAccountManager", "", "getTenantId", "", "getUserId", "isOverseaTenant", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.m */
public final class TodoLogin implements ILoginDependency {

    /* renamed from: a */
    private AbstractC49389b f101800a;

    /* renamed from: d */
    private final void m158772d() {
        if (this.f101800a == null) {
            Object api = ApiUtils.getApi(IPassportApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
            this.f101800a = ((IPassportApi) api).getAccountManager();
        }
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.ILoginDependency
    /* renamed from: a */
    public String mo145411a() {
        String str;
        m158772d();
        AbstractC49389b bVar = this.f101800a;
        if (bVar != null) {
            str = bVar.mo172422c();
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.ILoginDependency
    /* renamed from: b */
    public String mo145412b() {
        LoginInfo a;
        m158772d();
        AbstractC49389b bVar = this.f101800a;
        if (bVar == null || (a = bVar.mo172419a()) == null) {
            return "";
        }
        Intrinsics.checkExpressionValueIsNotNull(a, "mAccountManager?.loginInfo ?: return \"\"");
        String tenantId = a.getTenantId();
        Intrinsics.checkExpressionValueIsNotNull(tenantId, "loginInfo.tenantId");
        return tenantId;
    }

    @Override // com.ss.android.lark.todo.dependency.idependency.ILoginDependency
    /* renamed from: c */
    public boolean mo145413c() {
        Object api = ApiUtils.getApi(IPassportApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
        return ((IPassportApi) api).isOverseaTenantBrand();
    }
}
