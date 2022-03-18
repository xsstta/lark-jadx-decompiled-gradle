package com.bytedance.ee.webapp.config;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.openapi.jsapi.AbstractC48760b;
import com.ss.android.lark.openapi.permission.bean.C48768a;
import com.ss.android.lark.openapi.permission.bean.PermissionModel;
import com.ss.android.lark.openapi.permission.http.verify.C48772b;
import com.ss.android.lark.openapi.permission.http.verify.VerifyResponse;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappUrlAuthStrategy;", "Lcom/bytedance/ee/webapp/config/AbsWebappAuthStrategy;", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "(Lcom/ss/android/lark/opmonitor/trace/OPTrace;)V", "authSessionCache", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/openapi/permission/bean/PermissionModel;", "checkPermission", "Lcom/ss/android/lark/openapi/jsapi/AbstractJSApiResponse;", "destroy", "", "doAppIdChangeIfNeed", "currentAppId", "targetAppId", "getJSSdkSession", "isPermissionAuthed", "", "url", "syncAuthResultAfterConfig", "verifyParam", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyParams;", "verifyResponse", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyResponse;", "syncAuthResultAfterPageChange", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.config.k */
public final class WebappUrlAuthStrategy extends AbstractC13769a {

    /* renamed from: c */
    private final HashMap<String, PermissionModel> f36026c = new HashMap<>();

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f, com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: b */
    public void mo50787b() {
        super.mo50787b();
        this.f36026c.clear();
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: c */
    public String mo50804c() {
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        PermissionModel permissionModel = this.f36026c.get(C13772c.m55812a(hVar.mo234201a()));
        if (permissionModel != null) {
            return permissionModel.getApiSession();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: a */
    public AbstractC48760b mo50784a() {
        if (this.f36000a == null) {
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "checkPermission mAppContext is null");
            return C48768a.m192108a(100003, "webappcontext is null");
        }
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String a = C13772c.m55812a(hVar.mo234201a());
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "checkPermission url hash code:" + AbstractC13769a.m55795a(a));
        if (TextUtils.isEmpty(a)) {
            C67462h hVar2 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
            String appId = hVar2.getAppId();
            C67462h hVar3 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
            AbstractC13769a.m55800a(appId, hVar3.mo234201a(), true, "url is empty", this.f36001b);
            return C48768a.m192108a(100001, "invalid authentication");
        }
        Uri parse = Uri.parse(a);
        StringBuilder sb = new StringBuilder();
        sb.append("checkPermission url host:");
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        sb.append(parse.getHost());
        sb.append(",path:");
        sb.append(parse.getEncodedPath());
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", sb.toString());
        if (!m55858b(a)) {
            C67462h hVar4 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar4, "mAppContext");
            String appId2 = hVar4.getAppId();
            C67462h hVar5 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar5, "mAppContext");
            AbstractC13769a.m55800a(appId2, hVar5.mo234201a(), false, "check permission deny", this.f36001b);
            return C48768a.m192108a(100001, "invalid authentication");
        }
        C67462h hVar6 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar6, "mAppContext");
        String appId3 = hVar6.getAppId();
        C67462h hVar7 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar7, "mAppContext");
        AbstractC13769a.m55800a(appId3, hVar7.mo234201a(), true, "check permission approved", this.f36001b);
        return C48768a.m192107a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebappUrlAuthStrategy(OPTrace oPTrace) {
        super(oPTrace);
        Intrinsics.checkParameterIsNotNull(oPTrace, "opTrace");
    }

    /* renamed from: b */
    private final boolean m55858b(String str) {
        HashMap<String, PermissionModel> hashMap = this.f36026c;
        if (hashMap == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        } else if (!hashMap.containsKey(str) || this.f36026c.get(str) == null) {
            return false;
        } else {
            PermissionModel permissionModel = this.f36026c.get(str);
            if (permissionModel == null) {
                Intrinsics.throwNpe();
            }
            if (TextUtils.isEmpty(permissionModel.getApiSession())) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: b */
    public void mo50788b(String str, String str2) {
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        hVar.setAppId(str2);
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public void mo50802a(C48772b bVar, VerifyResponse verifyResponse) {
        Intrinsics.checkParameterIsNotNull(bVar, "verifyParam");
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "syncAuthResultAfterConfig in WebappUrlAuthStrategy");
        String a = C13772c.m55812a(bVar.mo170354f());
        if (!TextUtils.isEmpty(a)) {
            Uri parse = Uri.parse(a);
            StringBuilder sb = new StringBuilder();
            sb.append("config success url host:");
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            sb.append(parse.getHost());
            sb.append(",path:");
            sb.append(parse.getEncodedPath());
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", sb.toString());
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "config success save url hash code:" + AbstractC13769a.m55795a(a));
            PermissionModel a2 = C13772c.m55811a(bVar, verifyResponse);
            Intrinsics.checkExpressionValueIsNotNull(a, "authUrl");
            Intrinsics.checkExpressionValueIsNotNull(a2, "permissionModel");
            this.f36026c.put(a, a2);
            C67462h hVar = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
            mo50788b(hVar.getAppId(), bVar.mo170349a());
            C67462h hVar2 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
            String appId = hVar2.getAppId();
            C67462h hVar3 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
            AbstractC13769a.m55797a(appId, hVar3.mo234201a(), this.f36026c.size(), this.f36001b);
        }
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public void mo50803a(String str, String str2, String str3) {
        mo50788b(str2, str3);
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String appId = hVar.getAppId();
        C67462h hVar2 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
        String a = hVar2.mo234201a();
        C67462h hVar3 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
        AbstractC13769a.m55799a(appId, a, m55858b(C13772c.m55812a(hVar3.mo234201a())), this.f36026c.size(), "", this.f36001b);
    }
}
