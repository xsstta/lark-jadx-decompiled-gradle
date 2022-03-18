package com.ss.android.lark.integrator.moments.dependency;

import com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsAccountModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IAccountModuleDependency;", "()V", "getDeviceId", "", "getLoginUserAvatar", "getLoginUserId", "getLoginUserName", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.a */
public final class MomentsAccountModule implements IAccountModuleDependency {
    @Override // com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency
    /* renamed from: a */
    public String mo144688a() {
        String userId;
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi == null || (userId = iPassportApi.getUserId()) == null) {
            return "";
        }
        return userId;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency
    /* renamed from: b */
    public String mo144689b() {
        User user;
        String str;
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi == null || (user = iPassportApi.getUser()) == null || (str = user.name) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency
    /* renamed from: c */
    public String mo144690c() {
        User user;
        String str;
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi == null || (user = iPassportApi.getUser()) == null || (str = user.avatarKey) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IAccountModuleDependency
    /* renamed from: d */
    public String mo144691d() {
        String deviceId;
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        if (iPassportApi == null || (deviceId = iPassportApi.getDeviceId()) == null) {
            return "";
        }
        return deviceId;
    }
}
