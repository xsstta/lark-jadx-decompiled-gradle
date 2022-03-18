package com.ss.android.lark.passport.infra.config;

import android.text.TextUtils;
import com.ss.android.lark.passport.infra.model.ClientBizConfigData;
import com.ss.android.lark.passport.infra.model.ClientConfigData;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0007J\b\u0010\u0018\u001a\u00020\tH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007J\b\u0010\u001a\u001a\u00020\tH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/passport/infra/config/PassportConfigHelper;", "", "()V", "BIO_AUTH_SCENE", "", "BOE_BYTE_CERT_APP_ID", "BYTE_CERT_APP_ID", "RECOVER_SCENE", "enableRegionCodeChange", "", "getBioAuthAppId", "getBioAuthScene", "getDefaultRegionCode", "useAPPEnvConfigBean", "unit", "getDynamicUrlByNextStep", "nextStep", "getEmailRegex", "getFeishuRegionCode", "getLarkRegionCode", "getPackageRegionCode", "getRecoverAppId", "getRecoverScene", "isDisableRustGetDid", "isEnableCaptchaToken", "isEnableLanguagesBeforeLogin", "isEnableLoginJoinType", "setEnableCaptchaId", "", "enable", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.b.b */
public final class PassportConfigHelper {

    /* renamed from: a */
    public static final PassportConfigHelper f123041a = new PassportConfigHelper();

    private PassportConfigHelper() {
    }

    @JvmStatic
    /* renamed from: f */
    public static final boolean m193024f() {
        return PassportConfigCenter.f123034a.mo171113d().enableLoginJoinType;
    }

    @JvmStatic
    /* renamed from: g */
    public static final boolean m193025g() {
        ClientConfigData clientConfigData = PassportConfigCenter.f123034a.mo171113d().clientConfigList;
        if (clientConfigData != null) {
            return clientConfigData.disableRustGetDid;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: h */
    public static final boolean m193026h() {
        return PassportConfigCenter.f123034a.mo171113d().enableCaptchaToken;
    }

    @JvmStatic
    /* renamed from: i */
    public static final boolean m193027i() {
        return PassportConfigCenter.f123034a.mo171113d().enableRegionCodeChange;
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m193028j() {
        String str = PassportConfigCenter.f123034a.mo171114e().defaultRegionCode;
        if (str != null) {
            return str;
        }
        return "";
    }

    @JvmStatic
    /* renamed from: k */
    public static final String m193029k() {
        String str = PassportConfigCenter.f123034a.mo171116g().defaultRegionCode;
        if (str != null) {
            return str;
        }
        return "";
    }

    @JvmStatic
    /* renamed from: l */
    public static final String m193030l() {
        String str = PassportConfigCenter.f123034a.mo171115f().defaultRegionCode;
        if (str != null) {
            return str;
        }
        return "";
    }

    @JvmStatic
    /* renamed from: m */
    public static final String m193031m() {
        String str = PassportConfigCenter.f123034a.mo171113d().emailRegex;
        if (str != null) {
            return str;
        }
        return "";
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m193019a() {
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        if (clientBizConfigData != null) {
            return clientBizConfigData.enableLanguageBeforeLogin;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m193020b() {
        String str;
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        if (clientBizConfigData == null || (str = clientBizConfigData.recoverScene) == null) {
            return "passport_account_recovery";
        }
        return str;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m193021c() {
        String str;
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        if (clientBizConfigData != null && (str = clientBizConfigData.recoverAppId) != null) {
            return str;
        }
        if (ServiceFinder.m193749d().isBoeConfig()) {
            return "10000444";
        }
        return "161471";
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m193022d() {
        String str;
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        if (clientBizConfigData == null || (str = clientBizConfigData.bioAuthScene) == null) {
            return "passport_bio_auth";
        }
        return str;
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m193023e() {
        String str;
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        if (clientBizConfigData != null && (str = clientBizConfigData.bioAuthAppId) != null) {
            return str;
        }
        if (ServiceFinder.m193749d().isBoeConfig()) {
            return "10000444";
        }
        return "161471";
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193018a(boolean z) {
        PassportConfigCenter.f123034a.mo171113d().enableCaptchaId = z;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193016a(String str) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        if (clientBizConfigData != null) {
            map = clientBizConfigData.urlConfig;
        } else {
            map = null;
        }
        if (map == null) {
            return "";
        }
        String str2 = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList.urlConfig.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return Intrinsics.stringPlus(ServiceFinder.m193751f().getAccountsHost(IDomainService.UrlUnitType.CURRENT_UNIT), str2);
        }
        return "";
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193017a(boolean z, String str) {
        if (z) {
            return m193028j();
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            String str3 = PassportConfigCenter.f123034a.mo171113d().defaultRegionCode;
            if (str3 != null) {
                return str3;
            }
            return "";
        } else if (TextUtils.equals(str2, "eu_nc") || TextUtils.equals(str2, "boecn")) {
            return m193029k();
        } else {
            return m193030l();
        }
    }
}
