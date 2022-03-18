package com.bytedance.ee.webapp.config;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.openapi.permission.bean.PermissionModel;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\n\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappContainerAuthStrategy;", "Lcom/bytedance/ee/webapp/config/AbsWebappAuthStrategy;", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "(Lcom/ss/android/lark/opmonitor/trace/OPTrace;)V", "permissionModel", "Lcom/ss/android/lark/openapi/permission/bean/PermissionModel;", "checkPermission", "Lcom/ss/android/lark/openapi/jsapi/AbstractJSApiResponse;", "destroy", "", "doAppIdChangeIfNeed", "currentAppId", "", "targetAppId", "getJSSdkSession", "syncAuthResultAfterConfig", "verifyParam", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyParams;", "verifyResponse", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyResponse;", "syncAuthResultAfterPageChange", "url", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.config.i */
public final class WebappContainerAuthStrategy extends AbstractC13769a {

    /* renamed from: c */
    private PermissionModel f36022c;

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f, com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: b */
    public void mo50787b() {
        super.mo50787b();
        this.f36022c = null;
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: c */
    public String mo50804c() {
        PermissionModel permissionModel = this.f36022c;
        if (permissionModel != null) {
            return permissionModel.getApiSession();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: a */
    public AbstractC48760b mo50784a() {
        PermissionModel permissionModel = this.f36022c;
        if (permissionModel != null) {
            if (permissionModel == null) {
                Intrinsics.throwNpe();
            }
            if (!TextUtils.isEmpty(permissionModel.getApiSession())) {
                StringBuilder sb = new StringBuilder();
                sb.append("checkPermission approved, url:");
                C67462h hVar = this.f36000a;
                Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
                sb.append(AbstractC13769a.m55795a(hVar.mo234201a()));
                AppBrandLogger.m52830i("AbsWebappAuthStrategy", sb.toString());
                C67462h hVar2 = this.f36000a;
                Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
                String appId = hVar2.getAppId();
                C67462h hVar3 = this.f36000a;
                Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
                AbstractC13769a.m55800a(appId, hVar3.mo234201a(), true, "check permission approved", this.f36001b);
                AbstractC48760b a = C48768a.m192107a();
                Intrinsics.checkExpressionValueIsNotNull(a, "PermissionCheckResponse.permissionApproved()");
                return a;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkPermission deny, url:");
        C67462h hVar4 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar4, "mAppContext");
        sb2.append(AbstractC13769a.m55795a(hVar4.mo234201a()));
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", sb2.toString());
        C67462h hVar5 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar5, "mAppContext");
        String appId2 = hVar5.getAppId();
        C67462h hVar6 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar6, "mAppContext");
        AbstractC13769a.m55800a(appId2, hVar6.mo234201a(), false, "check permission deny", this.f36001b);
        AbstractC48760b a2 = C48768a.m192108a(100001, "invalid authentication");
        Intrinsics.checkExpressionValueIsNotNull(a2, "PermissionCheckResponse.…SG_NOT_AUTH\n            )");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebappContainerAuthStrategy(OPTrace oPTrace) {
        super(oPTrace);
        Intrinsics.checkParameterIsNotNull(oPTrace, "opTrace");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: b */
    public void mo50788b(String str, String str2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str2, "targetAppId");
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = str2;
        }
        hVar.setAppId(str);
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public void mo50802a(C48772b bVar, VerifyResponse verifyResponse) {
        Intrinsics.checkParameterIsNotNull(bVar, "verifyParam");
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "syncAuthResultAfterConfig in WebappContainerAuthStrategy");
        this.f36022c = C13772c.m55811a(bVar, verifyResponse);
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String appId = hVar.getAppId();
        String a = bVar.mo170349a();
        Intrinsics.checkExpressionValueIsNotNull(a, "verifyParam.appId");
        mo50788b(appId, a);
        C67462h hVar2 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
        String appId2 = hVar2.getAppId();
        C67462h hVar3 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
        AbstractC13769a.m55797a(appId2, hVar3.mo234201a(), 1, this.f36001b);
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public void mo50803a(String str, String str2, String str3) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str3, "targetAppId");
        mo50788b(str2, str3);
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String appId = hVar.getAppId();
        C67462h hVar2 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
        String a = hVar2.mo234201a();
        if (this.f36022c != null) {
            z = true;
        } else {
            z = false;
        }
        AbstractC13769a.m55799a(appId, a, z, 1, "", this.f36001b);
    }
}
