package com.ss.android.lark.integrator.passport.serviceimpl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.env.p2419a.C49001c;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.PackageChannelManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@ClaymoreImpl(IDomainService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u0016H\u0016¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/DomainServiceImpl;", "Lcom/ss/android/lark/passport/infra/service/IDomainService;", "()V", "combineServiceUrl", "", "host", "path", "getAccountsHost", "unitType", "Lcom/ss/android/lark/passport/infra/service/IDomainService$UrlUnitType;", "getApiHost", "getAppLogHost", "getOldHost", "getPackageHost", "prefix", "alias", "getPacketHost", "getPolicyHost", "getPolicyUrl", "policy", "Lcom/ss/android/lark/passport/infra/service/IDomainService$Policy;", "getTuringHosts", "", "Lcom/ss/android/lark/passport/infra/service/IDomainService$TuringRegion;", "Companion", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class DomainServiceImpl implements IDomainService {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/DomainServiceImpl$Companion;", "", "()V", "ACCOUNTS_FEISHU", "", "ACCOUNTS_LARK", "HTTP", "HTTPS_PREFIX", "TAG", "TURING_FEISHU", "TURING_LARK", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.DomainServiceImpl$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public String getApiHost() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.API);
    }

    public String getAppLogHost() {
        return DynamicConfigModule.m145551a(DomainSettings.Alias.TT_GRAYLOG);
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public String getOldHost() {
        return C36882a.m145556a();
    }

    private final String getAccountsHost() {
        int envType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType();
        String c = C36882a.m145559c();
        Intrinsics.checkExpressionValueIsNotNull(c, "DynamicHostProvider.passportAccountsHost()");
        Log.m165389i("DomainServiceImpl", "getAccountsHost:envType=" + envType + ",host=" + c);
        try {
            if (!PackageChannelManager.isKABuildPackage(ServiceFinder.m193748c().getApplicationContext())) {
                if (Intrinsics.areEqual(c, "https://" + ((Object) null)) || Intrinsics.areEqual(c, "https://")) {
                    String str = C49001c.m192988c().userUnit;
                    if (Intrinsics.areEqual("eu_nc", str)) {
                        return "https://accounts.feishu.cn";
                    }
                    if (Intrinsics.areEqual("eu_ea", str)) {
                        return "https://accounts.larksuite.com";
                    }
                }
            }
        } catch (Throwable th) {
            Log.m165386e("DomainServiceImpl", th);
        }
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0063, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "https://") == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String getPacketHost() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.passport.serviceimpl.DomainServiceImpl.getPacketHost():java.lang.String");
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public Map<IDomainService.TuringRegion, String> getTuringHosts() {
        Pair pair;
        String str;
        String str2;
        int envType = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType();
        HostEnvBean hostEnv = ServiceFinder.m193749d().getHostEnv();
        ArrayList a = DynamicConfigModule.m145552b().mo136166a("passport_turing", envType, hostEnv.userUnit);
        if (a == null) {
            a = new ArrayList();
        }
        try {
            if (!PackageChannelManager.isKABuildPackage(ServiceFinder.m193748c().getApplicationContext()) && a.isEmpty()) {
                String str3 = C49001c.m192988c().userUnit;
                if (Intrinsics.areEqual("eu_nc", str3)) {
                    a.add("verify.snssdk.com");
                } else if (Intrinsics.areEqual("eu_ea", str3)) {
                    a.add("verification-va.byteoversea.com");
                }
            }
        } catch (Throwable th) {
            Log.m165386e("DomainServiceImpl", th);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> a2 = DynamicConfigModule.m145552b().mo136166a("passport_turing", envType, ServiceFinder.m193749d().getOppositeUnit(hostEnv.userUnit));
        if (ServiceFinder.m193748c().isVaUnit()) {
            pair = TuplesKt.to(IDomainService.TuringRegion.VA, IDomainService.TuringRegion.CN);
        } else {
            pair = TuplesKt.to(IDomainService.TuringRegion.CN, IDomainService.TuringRegion.VA);
        }
        IDomainService.TuringRegion turingRegion = (IDomainService.TuringRegion) pair.component1();
        IDomainService.TuringRegion turingRegion2 = (IDomainService.TuringRegion) pair.component2();
        String str4 = "";
        if (a == null || (str = (String) CollectionsKt.getOrNull(a, 0)) == null) {
            str = str4;
        }
        linkedHashMap.put(turingRegion, str);
        if (!(a2 == null || (str2 = (String) CollectionsKt.getOrNull(a2, 0)) == null)) {
            str4 = str2;
        }
        linkedHashMap.put(turingRegion2, str4);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (true ^ StringsKt.isBlank((String) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            Object key = entry2.getKey();
            StringBuilder sb = new StringBuilder();
            if (!StringsKt.startsWith((String) entry2.getValue(), "http", true)) {
                sb.append("https://");
            }
            sb.append((String) entry2.getValue());
            if (!StringsKt.endsWith$default((String) entry2.getValue(), "/", false, 2, (Object) null)) {
                sb.append("/");
            }
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
            linkedHashMap4.put(key, sb2);
        }
        return linkedHashMap4;
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public String getAccountsHost(IDomainService.UrlUnitType urlUnitType) {
        Intrinsics.checkParameterIsNotNull(urlUnitType, "unitType");
        int i = C40011a.f101754a[urlUnitType.ordinal()];
        if (i == 1) {
            return getAccountsHost();
        }
        if (i == 2) {
            return getPacketHost();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public String getPolicyHost(IDomainService.UrlUnitType urlUnitType) {
        Intrinsics.checkParameterIsNotNull(urlUnitType, "unitType");
        int i = C40011a.f101755b[urlUnitType.ordinal()];
        if (i == 1) {
            String a = DynamicConfigModule.m145551a(DomainSettings.Alias.PRIVACY);
            Intrinsics.checkExpressionValueIsNotNull(a, "DynamicConfigModule.getD…inSettings.Alias.PRIVACY)");
            return a;
        } else if (i == 2) {
            return getPackageHost("", "privacy");
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final String getPackageHost(String str, String str2) {
        String str3;
        HostEnvBean d = C49001c.m192989d();
        Intrinsics.checkExpressionValueIsNotNull(d, "EnvUtils.getAppHostEnv()");
        List<String> a = DynamicConfigModule.m145552b().mo136166a(str2, ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType(), d.userUnit);
        if (a == null || (str3 = (String) CollectionsKt.getOrNull(a, 0)) == null) {
            return "";
        }
        return str + str3;
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public String getPolicyUrl(IDomainService.UrlUnitType urlUnitType, IDomainService.Policy policy) {
        Intrinsics.checkParameterIsNotNull(urlUnitType, "unitType");
        Intrinsics.checkParameterIsNotNull(policy, "policy");
        Log.m165389i("DomainServiceImpl", "get " + policy + " url by unit type: " + urlUnitType);
        return getPolicyUrl(getPolicyHost(urlUnitType), policy);
    }

    private final String combineServiceUrl(String str, String str2) {
        String str3;
        if (StringsKt.startsWith(str, "http", true)) {
            str3 = "";
        } else {
            str3 = "https://";
        }
        String b = C49081e.m193469b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ParamsUtil.getLocale()");
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        if (b != null) {
            String lowerCase = b.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (StringsKt.isBlank(lowerCase)) {
                return str3 + str + '/' + str2;
            }
            return str3 + str + '/' + lowerCase + '/' + str2;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.ss.android.lark.passport.infra.service.IDomainService
    public String getPolicyUrl(String str, IDomainService.Policy policy) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(policy, "policy");
        boolean z2 = false;
        if (policy == IDomainService.Policy.SERVICE_TERM) {
            String serviceTermUrl = ServiceFinder.m193752g().getServiceTermUrl();
            String str2 = serviceTermUrl;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Log.m165389i("DomainServiceImpl", "get " + policy + " url, use external url: " + serviceTermUrl);
                return serviceTermUrl;
            }
        }
        if (policy == IDomainService.Policy.PRIVACY) {
            String privacyPolicyUrl = ServiceFinder.m193752g().getPrivacyPolicyUrl();
            String str3 = privacyPolicyUrl;
            if (str3 == null || StringsKt.isBlank(str3)) {
                z2 = true;
            }
            if (!z2) {
                Log.m165389i("DomainServiceImpl", "get " + policy + " url, use external url: " + privacyPolicyUrl);
                return privacyPolicyUrl;
            }
        }
        Log.m165389i("DomainServiceImpl", "get " + policy + " url, host: " + str);
        return combineServiceUrl(str, policy.getPath());
    }
}
