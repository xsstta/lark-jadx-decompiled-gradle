package com.ss.lark.android.passport.biz.account;

import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.lark.android.passport.biz.account.migration.LegacyDataManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/UserInfoGlobalSpHelper;", "", "()V", "getLastUserId", "", "getString", "key", "default", "putLastUserId", "", "userId", "putString", "value", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.d */
public final class UserInfoGlobalSpHelper {

    /* renamed from: a */
    public static final UserInfoGlobalSpHelper f162527a = new UserInfoGlobalSpHelper();

    private UserInfoGlobalSpHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m252847a() {
        String str;
        if (ServiceFinder.m193748c().isAccountRedesignMigrationCompleted()) {
            str = m252848a(UserGlobalKeys.f162499a.mo171118a());
            if (str == null) {
                return "";
            }
        } else {
            str = (String) LegacyDataManager.f162572a.mo222847a((Key) UserGlobalKeys.f162499a, (Object) "");
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m252848a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return C57744a.m224104a().getString(str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m252850b(String str) {
        m252849a(UserGlobalKeys.f162499a.mo171118a(), str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m252849a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        C57744a.m224104a().putString(str, str2);
    }
}
