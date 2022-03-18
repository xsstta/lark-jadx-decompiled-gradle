package com.ss.lark.android.passport.biz.account;

import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.lark.android.passport.biz.entity.LoginUserInputV2;

/* renamed from: com.ss.lark.android.passport.biz.account.a */
public class C64291a {
    /* renamed from: a */
    public static String m252803a() {
        IUserService e = ServiceFinder.m193750e();
        if (e == null) {
            return "";
        }
        return e.mo171592b();
    }

    /* renamed from: b */
    public static String m252807b() {
        return (String) IsolateStorageUtil.f123196a.mo171260d(UserGlobalKeys.f162507i, "");
    }

    /* renamed from: c */
    public static User m252811c() {
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser == null) {
            return new User();
        }
        return foregroundUser;
    }

    /* renamed from: e */
    public static int m252814e() {
        if (ServiceFinder.m193749d().isLarkConfig()) {
            return m252810c(2);
        }
        return m252810c(1);
    }

    /* renamed from: d */
    public static String m252813d() {
        IUserService e = ServiceFinder.m193750e();
        if (e == null) {
            return "";
        }
        String c = e.mo171593c();
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("SigninSDK", "getLoginDeviceId: " + c);
        return c;
    }

    /* renamed from: c */
    public static void m252812c(String str) {
        IsolateStorageUtil.f123196a.mo171253b(UserGlobalKeys.f162507i, str);
    }

    /* renamed from: a */
    public static void m252804a(int i) {
        if (i != m252814e()) {
            m252808b(i);
            m252806a("");
        }
    }

    /* renamed from: b */
    private static void m252808b(int i) {
        IsolateStorageUtil.f123196a.mo171253b(UserGlobalKeys.f162502d, Integer.valueOf(i));
    }

    /* renamed from: c */
    private static int m252810c(int i) {
        return ((Integer) IsolateStorageUtil.f123196a.mo171260d(UserGlobalKeys.f162502d, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static void m252805a(LoginUserInputV2 loginUserInputV2) {
        m252808b(loginUserInputV2.getMode());
        m252812c(loginUserInputV2.getCountryCode());
        m252806a(loginUserInputV2.getCp());
    }

    /* renamed from: b */
    public static void m252809b(String str) {
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser != null) {
            foregroundUser.setSession(str);
            ServiceFinder.m193744a().updateUser(foregroundUser);
        }
    }

    /* renamed from: a */
    public static void m252806a(String str) {
        IUserService e = ServiceFinder.m193750e();
        if (e != null) {
            e.mo171595a(UserInfoKeys.f162528a, str);
        }
    }
}
