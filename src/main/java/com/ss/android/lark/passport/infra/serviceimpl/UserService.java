package com.ss.android.lark.passport.infra.serviceimpl;

import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserInfo;
import com.ss.android.lark.passport.infra.service.IUserListStorageService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J#\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0004H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J)\u0010\u001f\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\u0006\u0010 \u001a\u0002H\u0017H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016J+\u0010&\u001a\u00020$\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00192\b\u0010'\u001a\u0004\u0018\u0001H\u0017H\u0016¢\u0006\u0002\u0010(R\u0014\u0010\b\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/passport/infra/serviceimpl/UserService;", "Lcom/ss/android/lark/passport/infra/service/IUserService;", "Lcom/ss/android/lark/passport/infra/service/IUserInfo$Getter;", "userId", "", "listStorageService", "Lcom/ss/android/lark/passport/infra/service/IUserListStorageService;", "(Ljava/lang/String;Lcom/ss/android/lark/passport/infra/service/IUserListStorageService;)V", "env", "getEnv", "()Ljava/lang/String;", "isAnonymousSession", "", "()Z", "lastUseTimestamp", "", "getLastUseTimestamp", "()J", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "getUser", "()Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "get", "T", "key", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;)Ljava/lang/Object;", "getLoginDeviceId", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "getLogoutToken", "getOrDefault", "default", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)Ljava/lang/Object;", "getSession", "mergeLocalUserInfo", "", "remoteUser", "put", "value", "(Lcom/ss/android/lark/passport/infra/base/storage/key/Key;Ljava/lang/Object;)V", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.serviceimpl.b */
public final class UserService implements IUserInfo.Getter, IUserService {

    /* renamed from: a */
    public static final Companion f123390a = new Companion(null);

    /* renamed from: b */
    private final String f123391b;

    /* renamed from: c */
    private final IUserListStorageService f123392c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/passport/infra/serviceimpl/UserService$Companion;", "", "()V", "TAG", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.serviceimpl.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserInfo.Getter
    /* renamed from: d */
    public LoginInfo mo171594d() {
        return this.f123392c.getLoginInfo(this.f123391b);
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserInfo.Getter
    /* renamed from: a */
    public String mo171591a() {
        String str;
        synchronized (this) {
            User e = mo171597e();
            if (e == null || (str = e.getLogoutToken()) == null) {
                str = "";
            }
        }
        return str;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserInfo.Getter
    /* renamed from: b */
    public String mo171592b() {
        String str;
        synchronized (this) {
            User e = mo171597e();
            if (e == null || (str = e.getSession()) == null) {
                str = "";
            }
        }
        return str;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserInfo.Getter
    /* renamed from: c */
    public String mo171593c() {
        String str;
        synchronized (this) {
            User e = mo171597e();
            if (e == null || (str = e.getDeviceLoginId()) == null) {
                str = "";
            }
        }
        return str;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserService
    /* renamed from: e */
    public User mo171597e() {
        User user;
        synchronized (this) {
            user = this.f123392c.getUser(this.f123391b);
            if (user == null) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171471d("UserService", "userId: " + this.f123391b + " user not exist!!!");
                user = null;
            }
        }
        return user;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    @Override // com.ss.android.lark.passport.infra.service.IUserService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo171596a(com.ss.android.lark.passport.signinsdk_api.account.User r5) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.serviceimpl.UserService.mo171596a(com.ss.android.lark.passport.signinsdk_api.account.User):void");
    }

    public UserService(String str, IUserListStorageService iUserListStorageService) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(iUserListStorageService, "listStorageService");
        this.f123391b = str;
        this.f123392c = iUserListStorageService;
    }

    @Override // com.ss.android.lark.passport.infra.service.IUserService
    /* renamed from: a */
    public <T> void mo171595a(Key<T> aVar, T t) {
        Intrinsics.checkParameterIsNotNull(aVar, "key");
        C49067a.m193337a(IsolateStorage.f123105c, this.f123391b, null, 2, null).mo171253b(aVar, t);
    }
}
