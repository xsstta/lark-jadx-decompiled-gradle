package com.ss.lark.android.passport.biz.utils;

import android.text.TextUtils;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.entity.UserItem;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/passport/biz/utils/UserCpParseUtil;", "", "()V", "TAG", "", "parseUserStepInfoIntoUniContext", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "stepInfo", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.utils.g */
public final class UserCpParseUtil {

    /* renamed from: a */
    public static final UserCpParseUtil f164315a = new UserCpParseUtil();

    private UserCpParseUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m256143a(UniContext uniContext, UserOperationCenterInfo userOperationCenterInfo, PassportLog passportLog) {
        List<UserOperationCenterInfo.IdentityBindUserList> list;
        List<UserItem> list2;
        User user;
        Intrinsics.checkParameterIsNotNull(passportLog, "log");
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        String str = null;
        String loginCredentialId = foregroundUser != null ? foregroundUser.getLoginCredentialId() : null;
        User foregroundUser2 = ServiceFinder.m193744a().getForegroundUser();
        String str2 = foregroundUser2 != null ? foregroundUser2.userId : null;
        ArrayList<UserOperationCenterInfo.ResponseCredential> arrayList = new ArrayList();
        if (!(userOperationCenterInfo == null || (list = userOperationCenterInfo.credentialBindingIdentities) == null)) {
            for (T t : list) {
                if (!(t == null || (list2 = t.userItemList) == null)) {
                    for (T t2 : list2) {
                        if (TextUtils.equals((t2 == null || (user = t2.user) == null) ? null : user.userId, str2)) {
                            UserOperationCenterInfo.ResponseCredential responseCredential = t.credential;
                            Intrinsics.checkExpressionValueIsNotNull(responseCredential, "cp.credential");
                            arrayList.add(responseCredential);
                        }
                    }
                }
            }
        }
        String str3 = "";
        for (UserOperationCenterInfo.ResponseCredential responseCredential2 : arrayList) {
            if (Intrinsics.areEqual(responseCredential2.credentialId, loginCredentialId)) {
                str3 = responseCredential2.credential;
                Intrinsics.checkExpressionValueIsNotNull(str3, "it.credential");
            }
            if (responseCredential2.credentialType == 2) {
                if (uniContext != null) {
                    uniContext.setCurLoginEmail(responseCredential2.credential);
                }
            } else if (responseCredential2.credentialType == 1) {
                try {
                    if (ServiceFinder.m193748c().isLarkPackage()) {
                        if (uniContext != null) {
                            String str4 = responseCredential2.credential;
                            Intrinsics.checkExpressionValueIsNotNull(str4, "it.credential");
                            uniContext.setCurLoginPhone(StringsKt.replace$default(str4, '+' + responseCredential2.countryCode, "", false, 4, (Object) null));
                        }
                    } else if (Intrinsics.areEqual("86", responseCredential2.countryCode) && uniContext != null) {
                        String str5 = responseCredential2.credential;
                        Intrinsics.checkExpressionValueIsNotNull(str5, "it.credential");
                        uniContext.setCurLoginPhone(StringsKt.replace$default(str5, "+86", "", false, 4, (Object) null));
                    }
                    if (uniContext != null) {
                        uniContext.setCurCountryCode(responseCredential2.countryCode);
                    }
                } catch (Throwable unused) {
                    passportLog.mo171471d("UserCpParseUtil", "credential phone parse error");
                }
            }
        }
        if (uniContext != null) {
            try {
                uniContext.setCp(C49160a.m193855a(str3, "EE"));
            } catch (Throwable unused2) {
                passportLog.mo171471d("UserCpParseUtil", "credential encrypt error");
            }
        }
        if (uniContext != null) {
            User foregroundUser3 = ServiceFinder.m193744a().getForegroundUser();
            if (foregroundUser3 != null) {
                str = foregroundUser3.getUserName();
            }
            uniContext.setCurUserName(str);
        }
    }
}
