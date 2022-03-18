package com.ss.android.lark.passport.infra.listenermanage;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2441c.C49166a;
import com.ss.android.lark.passport.infra.util.p2441c.C49168c;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a.AbstractC49374b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a.C49373a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J>\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/passport/infra/listenermanage/LoginListenerManager;", "", "()V", "TAG", "", "listeners", "", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/login/OnLoginListener;", "dispatchFastLogin", "", "dispatchLoginBegin", "isFastLogin", "", "dispatchLoginFailed", "activeUser", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "dispatchLoginSuccess", "loginUsers", "", "innerDispatchLogin", "isSuccess", "allUsers", "registerLoginListener", "listener", "unregisterLoginListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.c.a */
public final class LoginListenerManager {

    /* renamed from: a */
    public static final LoginListenerManager f123315a = new LoginListenerManager();

    /* renamed from: b */
    private static final Set<AbstractC49374b> f123316b = C49166a.m193877a(new LinkedHashSet());

    private LoginListenerManager() {
    }

    static {
        m193626a(new AbstractC49374b() {
            /* class com.ss.android.lark.passport.infra.listenermanage.LoginListenerManager.C491001 */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.p2458a.AbstractC49374b
            /* renamed from: a */
            public void mo171423a(C49373a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "context");
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("LoginListenerManager", "login end, context: " + aVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.a$a */
    public static final class C49101a extends Lambda implements Function0<Unit> {
        final /* synthetic */ User $activeUser;
        final /* synthetic */ List $allUsers;
        final /* synthetic */ boolean $isFastLogin;
        final /* synthetic */ boolean $isSuccess;
        final /* synthetic */ List $loginUsers;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49101a(boolean z, boolean z2, List list, List list2, User user) {
            super(0);
            this.$isSuccess = z;
            this.$isFastLogin = z2;
            this.$loginUsers = list;
            this.$allUsers = list2;
            this.$activeUser = user;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C49373a aVar = new C49373a(this.$isSuccess, this.$isFastLogin, this.$loginUsers, this.$allUsers, this.$activeUser);
            LoginListenerManager aVar2 = LoginListenerManager.f123315a;
            for (AbstractC49374b bVar : CollectionsKt.toMutableList((Collection) LoginListenerManager.f123316b)) {
                bVar.mo171423a(aVar);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193625a() {
        List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
        Intrinsics.checkExpressionValueIsNotNull(allUserList, "ServiceFinder.userListService.allUserList");
        List<User> allValidUserList = ServiceFinder.m193744a().getAllValidUserList();
        Intrinsics.checkExpressionValueIsNotNull(allValidUserList, "ServiceFinder.userListService.allValidUserList");
        f123315a.m193628a(true, true, allValidUserList, allUserList, ServiceFinder.m193744a().getForegroundUser());
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193626a(AbstractC49374b bVar) {
        if (bVar != null) {
            f123316b.add(bVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193627a(boolean z, List<? extends User> list, User user) {
        String str;
        Intrinsics.checkParameterIsNotNull(list, "loginUsers");
        Intrinsics.checkParameterIsNotNull(user, "activeUser");
        ServiceFinder rVar = ServiceFinder.f123386a;
        IUserListService iUserListService = (IUserListService) ServiceFinder.m193746a(IUserListService.class);
        if (iUserListService != null) {
            String str2 = user.userId;
            User foregroundUser = iUserListService.getForegroundUser();
            if (foregroundUser != null) {
                str = foregroundUser.userId;
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str2, str)) {
                user.setLastUseTimestamp(System.currentTimeMillis());
            }
            List<User> addOrUpdateUsers = iUserListService.addOrUpdateUsers(list, user.userId, IUserListService.UserLoginSource.ByLogin);
            LoginListenerManager aVar = f123315a;
            Intrinsics.checkExpressionValueIsNotNull(addOrUpdateUsers, "allUsers");
            aVar.m193628a(true, z, list, addOrUpdateUsers, user);
        }
    }

    /* renamed from: a */
    private final void m193628a(boolean z, boolean z2, List<? extends User> list, List<? extends User> list2, User user) {
        C49168c.m193880a(null, false, new C49101a(z, z2, list, list2, user), 3, null);
    }
}
