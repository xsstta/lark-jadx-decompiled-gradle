package com.ss.lark.android.passport.biz.account;

import android.app.Application;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorage;
import com.ss.android.lark.passport.signinsdk_api.account.Tenant;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J#\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ+\u0010\u0013\u001a\u00020\f\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000eH\u0002¢\u0006\u0002\u0010\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/UserStorageService;", "Lcom/ss/android/lark/passport/infra/service/IUserStorageService;", "userId", "", "storage", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;", "(Ljava/lang/String;Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorage;)V", "buildLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "clear", "", "get", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "getLoginInfo", "put", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)V", "readUserFromDisk", "setLoginInfo", "loginInfo", "setUser", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.account.g */
public final class UserStorageService {

    /* renamed from: a */
    public static final Companion f162539a = new Companion(null);

    /* renamed from: b */
    private final String f162540b;

    /* renamed from: c */
    private final DataStorage f162541c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/account/UserStorageService$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.account.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public void mo222774c() {
        this.f162541c.mo171248a();
    }

    /* renamed from: b */
    public final LoginInfo mo222773b() {
        LoginInfo loginInfo;
        synchronized (this) {
            loginInfo = (LoginInfo) m252857a(UserInfoKeys.f162530c);
        }
        return loginInfo;
    }

    /* renamed from: a */
    public User mo222771a() {
        User user;
        synchronized (this) {
            user = (User) m252857a(UserInfoKeys.f162529b);
        }
        return user;
    }

    /* renamed from: a */
    private final <T> T m252857a(Key<T> aVar) {
        return (T) this.f162541c.mo171255c(aVar);
    }

    /* renamed from: a */
    private final void m252859a(LoginInfo loginInfo) {
        m252858a(UserInfoKeys.f162530c, loginInfo);
    }

    /* renamed from: b */
    private final LoginInfo m252860b(User user) {
        String str;
        String str2 = null;
        if (user == null) {
            return null;
        }
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setSession(user.getSession());
        loginInfo.setSessionInfoMap(user.getSessionWithDomainMap());
        loginInfo.setUserId(user.userId);
        loginInfo.setUserName(user.getUserName());
        loginInfo.setUserNameEn(user.getUserNameEn());
        loginInfo.setAvatarUrl(user.avatarUrl);
        loginInfo.setAvatarKey(user.avatarKey);
        Tenant tenant = user.tenant;
        if (tenant != null) {
            str = tenant.tenantId;
        } else {
            str = null;
        }
        loginInfo.setTenantId(str);
        Tenant tenant2 = user.tenant;
        if (tenant2 != null) {
            str2 = tenant2.name;
        }
        loginInfo.setTenantName(str2);
        loginInfo.setTenantIconUrl(user.getTenantIconUrl());
        loginInfo.setTenantCode(user.getTenantCode());
        Application application = LarkContext.getApplication();
        boolean isKABuildPackage = PackageChannelManager.isKABuildPackage(application);
        int deployMode = PackageChannelManager.getDeployMode(application);
        if (isKABuildPackage && deployMode != 1) {
            loginInfo.setIdpType(PackageChannelManager.getBuildPackageChannel(application));
        }
        return loginInfo;
    }

    /* renamed from: a */
    public final void mo222772a(User user) {
        synchronized (this) {
            m252858a(UserInfoKeys.f162529b, user);
            m252859a(m252860b(user));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    private final <T> void m252858a(Key<T> aVar, T t) {
        this.f162541c.mo171253b(aVar, t);
    }

    public UserStorageService(String str, DataStorage aVar) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(aVar, "storage");
        this.f162540b = str;
        this.f162541c = aVar;
    }
}
