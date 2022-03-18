package com.ss.android.lark.passport.infra.base.network.interceptor;

import android.text.TextUtils;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.http.model.http.HttpHeaders;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.p1953b.C38760a;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.base.network.HttpUtils;
import com.ss.android.lark.passport.infra.base.network.TerminalType;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.storage.C49216a;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/CommonRequestInterceptor;", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IRequestInterceptor;", "()V", "getDeviceIds", "", "getDeviceInfo", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "processRequest", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/InterceptorResult;", "processRequestHeaders", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.c */
public final class CommonRequestInterceptor implements IRequestInterceptor {

    /* renamed from: a */
    public static final Companion f123264a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/CommonRequestInterceptor$Companion;", "", "()V", "CHANNEL_LITE", "", "COOKIE", "KEY_TOKEN", "LITE_PACKAGE_NAME_SUFFIX", "TAG", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.d.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final String m193449a() {
        String userUnit = ServiceFinder.m193749d().getUserUnit();
        String deviceId = ServiceFinder.m193762q().getDeviceId();
        String oppositeUnit = ServiceFinder.m193749d().getOppositeUnit(userUnit);
        String deviceIdFromLocalByUnit = ServiceFinder.m193762q().getDeviceIdFromLocalByUnit(oppositeUnit);
        if (TextUtils.isEmpty(oppositeUnit) || TextUtils.isEmpty(deviceIdFromLocalByUnit)) {
            return userUnit + ':' + deviceId;
        }
        return userUnit + ':' + deviceId + ',' + oppositeUnit + ':' + deviceIdFromLocalByUnit;
    }

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IRequestInterceptor
    /* renamed from: b */
    public InterceptorResult mo171337b(IRequest eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        return new InterceptorResult(eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r12 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0175  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m193450c(com.ss.android.lark.passport.signinsdk_api.base.network.IRequest r12) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.base.network.interceptor.CommonRequestInterceptor.m193450c(com.ss.android.lark.passport.signinsdk_api.base.network.e):java.lang.String");
    }

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IRequestInterceptor
    /* renamed from: a */
    public IRequest mo171335a(IRequest eVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        HttpHeaders f = eVar.mo171287f();
        String b = C49081e.m193469b();
        if (!TextUtils.isEmpty(b)) {
            HttpUtils.f123257a.mo171332a(f, "X-Locale", b);
        }
        HttpUtils.f123257a.mo171332a(f, "X-Request-ID", UUID.randomUUID().toString());
        HttpUtils.f123257a.mo171332a(f, "X-Terminal-Type", String.valueOf(TerminalType.ANDROID.getValue()));
        HttpUtils.f123257a.mo171332a(f, "X-Api-Version", "1.0.0");
        if (HttpMethod.GET != eVar.mo171286e()) {
            HttpUtils.f123257a.mo171332a(f, "Content-Type", "application/json");
        }
        HttpUtils.f123257a.mo171332a(f, "X-Device-Info", m193450c(eVar));
        String a = C49216a.m194036a().mo171739a("X-Flow-Key");
        if (!TextUtils.isEmpty(a)) {
            HttpUtils.f123257a.mo171332a(f, "X-Flow-Key", a);
        } else {
            PassportLog.f123351c.mo171474a().mo171465b("CommonRequestInterceptor", "X-Flow-Key is Empty");
        }
        String a2 = C49216a.m194036a().mo171739a("X-Proxy-Unit");
        if (!TextUtils.isEmpty(a2)) {
            HttpUtils.f123257a.mo171332a(f, "X-Proxy-Unit", a2);
        } else {
            PassportLog.f123351c.mo171474a().mo171465b("CommonRequestInterceptor", "X-PROXY-UNIT is Empty");
        }
        if (!TextUtils.isEmpty(ServiceFinder.m193762q().getDeviceId()) && !TextUtils.isEmpty(ServiceFinder.m193749d().getUserUnit())) {
            HttpUtils.f123257a.mo171332a(f, "X-Passport-Device-IDs", m193449a());
        }
        if (!ServiceFinder.m193752g().isPrivateKaPkg()) {
            HttpUtils.f123257a.mo171332a(f, "X-Passport-Unit", ServiceFinder.m193749d().getUserUnit());
        } else {
            PassportLog.f123351c.mo171474a().mo171465b("CommonRequestInterceptor", "PrivateKABuildPackage is true");
        }
        HttpUtils dVar = HttpUtils.f123257a;
        C49121a a3 = C49121a.m193727a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "PassportParams.getInstance()");
        dVar.mo171332a(f, "X-App-Id", String.valueOf(a3.mo171506b()));
        if (eVar.mo171296o()) {
            IUserService foregroundUserService = ServiceFinder.m193744a().getForegroundUserService();
            if (foregroundUserService != null) {
                str = foregroundUserService.mo171592b();
            } else {
                str = null;
            }
            if (str != null) {
                HttpUtils.f123257a.mo171332a(f, "Suite-Session-Key", str);
                if (f.get(ConvertOfficeToSpaceService.f88309g) == null) {
                    HttpUtils dVar2 = HttpUtils.f123257a;
                    dVar2.mo171332a(f, ConvertOfficeToSpaceService.f88309g, "session=" + str);
                }
            } else {
                PassportLog.f123351c.mo171474a().mo171471d("CommonRequestInterceptor", "foregroundUser session is null");
            }
            List<String> allSessions = ServiceFinder.m193744a().getAllSessions();
            Intrinsics.checkExpressionValueIsNotNull(allSessions, "ServiceFinder.userListService.allSessions");
            HttpUtils.f123257a.mo171332a(f, "X-Passport-Session-Keys", CollectionsKt.joinToString$default(allSessions, ",", null, null, 0, null, null, 62, null));
        }
        if (eVar.mo171299r()) {
            String pattern = ServiceFinder.m193752g().getPattern();
            if (TextUtils.isEmpty(pattern)) {
                PassportLog.f123351c.mo171474a().mo171465b("CommonRequestInterceptor", "pattern is Empty");
            } else if (eVar.mo171286e() == HttpMethod.POST) {
                Map<String, Object> i = eVar.mo171290i();
                Intrinsics.checkExpressionValueIsNotNull(pattern, "pattern");
                i.put("pattern", pattern);
            } else {
                eVar.mo171291j().put("pattern", pattern, new boolean[0]);
            }
            Map<String, String> passportExtraRegisterParams = ServiceFinder.m193752g().getPassportExtraRegisterParams();
            if (passportExtraRegisterParams != null) {
                Map<String, Object> i2 = eVar.mo171290i();
                String a4 = C38760a.m153057a(passportExtraRegisterParams);
                Intrinsics.checkExpressionValueIsNotNull(a4, "FastJsonUtil.toJSONString(regMap)");
                i2.put("reg_params", a4);
            } else {
                PassportLog.f123351c.mo171474a().mo171465b("CommonRequestInterceptor", "passportExtraRegisterParams is Null");
            }
        }
        String a5 = C49216a.m194036a().mo171739a("X-Verify-Token");
        if (!TextUtils.isEmpty(a5)) {
            HttpUtils.f123257a.mo171332a(f, "X-Verify-Token", a5);
        }
        return eVar;
    }
}
