package com.ss.lark.android.passport.biz.account;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/CompatAccountManager;", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IAccountManager;", "()V", "TAG", "", "TENANT_CODE_BYTE_DANCE", "TENANT_CODE_CONSUME", "TENANT_ID_BYTE_DANCE", "TENANT_ID_CONSUMER", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "getSession", "getSessions", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/SessionInfo;", "getTenantCode", "getTenantId", "getUser", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getUserId", "isCustomer", "", "isGuestUser", "isLogin", "isLoginUser", "userId", "isPrimaryHost", "loge", "", "msg", "throwable", "", "logi", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.b */
public final class CompatAccountManager implements AbstractC49389b {

    /* renamed from: a */
    public static final CompatAccountManager f162498a = new CompatAccountManager();

    private CompatAccountManager() {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: c */
    public String mo172422c() {
        return UserInfoGlobalSpHelper.m252847a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: d */
    public boolean mo172423d() {
        return mo172421b().isGuest;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: f */
    public String mo172425f() {
        String tenantId;
        LoginInfo a = mo172419a();
        if (a == null || (tenantId = a.getTenantId()) == null) {
            return "";
        }
        return tenantId;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: i */
    public boolean mo172428i() {
        return ServiceFinder.m193748c().isLogin();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: b */
    public User mo172421b() {
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser != null) {
            return foregroundUser;
        }
        return new User();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: g */
    public Map<String, SessionInfo> mo172426g() {
        Map<String, SessionInfo> sessionInfoMap;
        LoginInfo a = mo172419a();
        if (a == null || (sessionInfoMap = a.getSessionInfoMap()) == null) {
            return new LinkedHashMap();
        }
        return sessionInfoMap;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: j */
    public boolean mo172429j() {
        String str;
        LoginInfo a = mo172419a();
        if (a != null) {
            str = a.getTenantId();
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str, "0");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: k */
    public boolean mo172430k() {
        String str;
        LoginInfo a = mo172419a();
        if (a != null) {
            str = a.getTenantId();
        } else {
            str = null;
        }
        return Intrinsics.areEqual(str, "1");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: a */
    public LoginInfo mo172419a() {
        IUserListService a = ServiceFinder.m193744a();
        User foregroundUser = a.getForegroundUser();
        if (foregroundUser != null) {
            Intrinsics.checkExpressionValueIsNotNull(foregroundUser, "service.foregroundUser ?…    return null\n        }");
            IUserService userService = a.getUserService(foregroundUser.userId);
            if (userService != null) {
                return userService.mo171594d();
            }
            return null;
        }
        m252815a(f162498a, "get login info, foreground user is null", null, 2, null);
        return null;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: e */
    public String mo172424e() {
        String str;
        LoginInfo a = mo172419a();
        if (a == null || (str = a.getSession()) == null) {
            str = "";
        }
        Log.m165389i("AccountManagerInternal", "n_action_get_forground_user_session" + C49160a.m193857b(str));
        return str;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: h */
    public String mo172427h() {
        LoginInfo a = mo172419a();
        if (a == null) {
            return "";
        }
        String tenantCode = a.getTenantCode();
        if (!TextUtils.isEmpty(tenantCode)) {
            Intrinsics.checkExpressionValueIsNotNull(tenantCode, "tenantCode");
            return tenantCode;
        }
        String tenantId = a.getTenantId();
        if (tenantId == null) {
            return "";
        }
        int hashCode = tenantId.hashCode();
        if (hashCode != 48) {
            if (hashCode == 49 && tenantId.equals("1")) {
                return "bytedance";
            }
            return "";
        } else if (tenantId.equals("0")) {
            return "www";
        } else {
            return "";
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b
    /* renamed from: a */
    public boolean mo172420a(String str) {
        String str2;
        User e;
        if (str == null) {
            return false;
        }
        IUserService e2 = ServiceFinder.m193750e();
        if (e2 == null || (e = e2.mo171597e()) == null) {
            str2 = null;
        } else {
            str2 = e.userId;
        }
        return Intrinsics.areEqual(str2, str);
    }

    /* renamed from: a */
    private final void m252816a(String str, Throwable th) {
        Log.m165384e("AccountManagerInternal", str, th);
    }

    /* renamed from: a */
    static /* synthetic */ void m252815a(CompatAccountManager bVar, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        bVar.m252816a(str, th);
    }
}
