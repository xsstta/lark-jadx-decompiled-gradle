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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappPrefixAuthStrategy;", "Lcom/bytedance/ee/webapp/config/AbsWebappAuthStrategy;", "opTrace", "Lcom/ss/android/lark/opmonitor/trace/OPTrace;", "(Lcom/ss/android/lark/opmonitor/trace/OPTrace;)V", "authSessionCache", "", "Lcom/bytedance/ee/webapp/config/WebappPrefixAuthStrategy$AuthMappingPair;", "checkPermission", "Lcom/ss/android/lark/openapi/jsapi/AbstractJSApiResponse;", "destroy", "", "doAppIdChangeIfNeed", "currentAppId", "", "targetAppId", "getJSSdkSession", "isPermissionAuthed", "", "url", "syncAuthResultAfterConfig", "verifyParam", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyParams;", "verifyResponse", "Lcom/ss/android/lark/openapi/permission/http/verify/VerifyResponse;", "syncAuthResultAfterPageChange", "AuthMappingPair", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.config.j */
public final class WebappPrefixAuthStrategy extends AbstractC13769a {

    /* renamed from: c */
    private final List<AuthMappingPair> f36023c = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/webapp/config/WebappPrefixAuthStrategy$AuthMappingPair;", "", "key", "", "value", "Lcom/ss/android/lark/openapi/permission/bean/PermissionModel;", "(Ljava/lang/String;Lcom/ss/android/lark/openapi/permission/bean/PermissionModel;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getValue", "()Lcom/ss/android/lark/openapi/permission/bean/PermissionModel;", "setValue", "(Lcom/ss/android/lark/openapi/permission/bean/PermissionModel;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.config.j$a */
    public static final class AuthMappingPair {

        /* renamed from: a */
        private String f36024a;

        /* renamed from: b */
        private PermissionModel f36025b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuthMappingPair)) {
                return false;
            }
            AuthMappingPair aVar = (AuthMappingPair) obj;
            return Intrinsics.areEqual(this.f36024a, aVar.f36024a) && Intrinsics.areEqual(this.f36025b, aVar.f36025b);
        }

        public int hashCode() {
            String str = this.f36024a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            PermissionModel permissionModel = this.f36025b;
            if (permissionModel != null) {
                i = permissionModel.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "AuthMappingPair(key=" + this.f36024a + ", value=" + this.f36025b + ")";
        }

        /* renamed from: a */
        public final String mo50810a() {
            return this.f36024a;
        }

        /* renamed from: b */
        public final PermissionModel mo50811b() {
            return this.f36025b;
        }

        public AuthMappingPair(String str, PermissionModel permissionModel) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            this.f36024a = str;
            this.f36025b = permissionModel;
        }
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f, com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: b */
    public void mo50787b() {
        super.mo50787b();
        this.f36023c.clear();
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: c */
    public String mo50804c() {
        String apiSession;
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String c = C13772c.m55815c(hVar.mo234201a());
        for (AuthMappingPair aVar : CollectionsKt.reversed(this.f36023c)) {
            Intrinsics.checkExpressionValueIsNotNull(c, "authUrl");
            if (StringsKt.startsWith$default(c, aVar.mo50810a(), false, 2, (Object) null)) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("getJSSdkSession success: ");
                PermissionModel b = aVar.mo50811b();
                sb.append((b == null || (apiSession = b.getApiSession()) == null) ? null : Integer.valueOf(apiSession.length()));
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("AbsWebappAuthStrategy", objArr);
                PermissionModel b2 = aVar.mo50811b();
                if (b2 != null) {
                    return b2.getApiSession();
                }
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.webapp.config.AbstractC13769a
    /* renamed from: a */
    public AbstractC48760b mo50784a() {
        if (this.f36000a == null) {
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "checkPermission mAppContext is null");
            AbstractC48760b a = C48768a.m192108a(100003, "webappcontext is null");
            Intrinsics.checkExpressionValueIsNotNull(a, "PermissionCheckResponse.…ONTEXT_NULL\n            )");
            return a;
        }
        C67462h hVar = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
        String c = C13772c.m55815c(hVar.mo234201a());
        if (TextUtils.isEmpty(c)) {
            C67462h hVar2 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
            String appId = hVar2.getAppId();
            C67462h hVar3 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
            AbstractC13769a.m55800a(appId, hVar3.mo234201a(), false, "url is empty", this.f36001b);
            AbstractC48760b a2 = C48768a.m192108a(100001, "invalid authentication");
            Intrinsics.checkExpressionValueIsNotNull(a2, "PermissionCheckResponse.…SG_NOT_AUTH\n            )");
            return a2;
        }
        Uri parse = Uri.parse(c);
        StringBuilder sb = new StringBuilder();
        sb.append("checkPermission url host:");
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        sb.append(parse.getHost());
        sb.append(",path:");
        sb.append(parse.getEncodedPath());
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", sb.toString());
        if (m55849b(c)) {
            C67462h hVar4 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar4, "mAppContext");
            String appId2 = hVar4.getAppId();
            C67462h hVar5 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar5, "mAppContext");
            AbstractC13769a.m55800a(appId2, hVar5.mo234201a(), true, "check permission approved", this.f36001b);
            AbstractC48760b a3 = C48768a.m192107a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "PermissionCheckResponse.permissionApproved()");
            return a3;
        }
        C67462h hVar6 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar6, "mAppContext");
        String appId3 = hVar6.getAppId();
        C67462h hVar7 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar7, "mAppContext");
        AbstractC13769a.m55800a(appId3, hVar7.mo234201a(), false, "check permission deny", this.f36001b);
        AbstractC48760b a4 = C48768a.m192108a(100001, "invalid authentication");
        Intrinsics.checkExpressionValueIsNotNull(a4, "PermissionCheckResponse.…SG_NOT_AUTH\n            )");
        return a4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebappPrefixAuthStrategy(OPTrace oPTrace) {
        super(oPTrace);
        Intrinsics.checkParameterIsNotNull(oPTrace, "opTrace");
    }

    /* renamed from: b */
    private final boolean m55849b(String str) {
        Iterator it = CollectionsKt.reversed(this.f36023c).iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            AuthMappingPair aVar = (AuthMappingPair) it.next();
            if (!(str == null || !StringsKt.startsWith$default(str, aVar.mo50810a(), false, 2, (Object) null) || aVar.mo50811b() == null)) {
                PermissionModel b = aVar.mo50811b();
                if (b == null) {
                    Intrinsics.throwNpe();
                }
                String apiSession = b.getApiSession();
                if (apiSession == null || apiSession.length() == 0) {
                    z = true;
                }
                if (!z) {
                    return true;
                }
            }
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
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "syncAuthResultAfterConfig in WebappPrefixAuthStrategy");
        String c = C13772c.m55815c(bVar.mo170354f());
        if (TextUtils.isEmpty(c)) {
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "url is empty");
            C67462h hVar = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
            AbstractC13769a.m55797a(hVar.getAppId(), "", this.f36023c.size(), this.f36001b);
            return;
        }
        Uri parse = Uri.parse(c);
        StringBuilder sb = new StringBuilder();
        sb.append("config success url host:");
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        sb.append(parse.getHost());
        sb.append(",path:");
        sb.append(parse.getEncodedPath());
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", sb.toString());
        PermissionModel a = C13772c.m55811a(bVar, verifyResponse);
        List<AuthMappingPair> list = this.f36023c;
        Intrinsics.checkExpressionValueIsNotNull(c, "authUrl");
        list.add(new AuthMappingPair(c, a));
        C67462h hVar2 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
        mo50788b(hVar2.getAppId(), bVar.mo170349a());
        C67462h hVar3 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
        String appId = hVar3.getAppId();
        C67462h hVar4 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar4, "mAppContext");
        AbstractC13769a.m55797a(appId, hVar4.mo234201a(), this.f36023c.size(), this.f36001b);
    }

    @Override // com.bytedance.ee.webapp.config.AbstractC13780f
    /* renamed from: a */
    public void mo50803a(String str, String str2, String str3) {
        boolean z;
        String str4 = str;
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AppBrandLogger.m52830i("AbsWebappAuthStrategy", "don't need to dye, url is empty");
            C67462h hVar = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar, "mAppContext");
            String appId = hVar.getAppId();
            C67462h hVar2 = this.f36000a;
            Intrinsics.checkExpressionValueIsNotNull(hVar2, "mAppContext");
            AbstractC13769a.m55799a(appId, hVar2.mo234201a(), false, this.f36023c.size(), "don't need to dye, url is empty", this.f36001b);
            return;
        }
        AppBrandLogger.m52830i("AbsWebappAuthStrategy", "need to dye, url: " + AbstractC13769a.m55795a(str));
        String c = C13772c.m55815c(str);
        for (AuthMappingPair aVar : CollectionsKt.reversed(this.f36023c)) {
            Intrinsics.checkExpressionValueIsNotNull(c, "urlWithoutQueryAndHash");
            String str5 = null;
            if (StringsKt.startsWith$default(c, aVar.mo50810a(), false, 2, (Object) null)) {
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append("dye success，target is ");
                PermissionModel b = aVar.mo50811b();
                sb.append(b != null ? b.getAppId() : null);
                objArr[0] = sb.toString();
                AppBrandLogger.m52830i("AbsWebappAuthStrategy", objArr);
                C67462h hVar3 = this.f36000a;
                Intrinsics.checkExpressionValueIsNotNull(hVar3, "mAppContext");
                String appId2 = hVar3.getAppId();
                PermissionModel b2 = aVar.mo50811b();
                if (b2 != null) {
                    str5 = b2.getAppId();
                }
                mo50788b(appId2, str5);
                C67462h hVar4 = this.f36000a;
                Intrinsics.checkExpressionValueIsNotNull(hVar4, "mAppContext");
                String appId3 = hVar4.getAppId();
                C67462h hVar5 = this.f36000a;
                Intrinsics.checkExpressionValueIsNotNull(hVar5, "mAppContext");
                AbstractC13769a.m55799a(appId3, hVar5.mo234201a(), m55849b(c), this.f36023c.size(), "dye success", this.f36001b);
                return;
            }
        }
        C67462h hVar6 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar6, "mAppContext");
        String appId4 = hVar6.getAppId();
        C67462h hVar7 = this.f36000a;
        Intrinsics.checkExpressionValueIsNotNull(hVar7, "mAppContext");
        AbstractC13769a.m55799a(appId4, hVar7.mo234201a(), false, this.f36023c.size(), "dye fail,has no target", this.f36001b);
    }
}
