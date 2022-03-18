package com.ss.android.lark.passport.infra.listenermanage;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2441c.C49166a;
import com.ss.android.lark.passport.infra.util.p2441c.C49168c;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49375a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.LogoutReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007J\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J\u001e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0012\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/passport/infra/listenermanage/LogoutListenerManager;", "", "()V", "TAG", "", "listeners", "", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/OnLogoutListener;", "dispatchLogoutBegin", "", "reason", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutReason;", "logoutUsers", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "isQuitAll", "", "dispatchLogoutFailed", "user", "allUsers", "dispatchLogoutSuccess", "logoutUser", "registerLogoutListener", "listener", "unregisterLogoutListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.c.b */
public final class LogoutListenerManager {

    /* renamed from: a */
    public static final LogoutListenerManager f123317a = new LogoutListenerManager();

    /* renamed from: b */
    private static final Set<AbstractC49377c> f123318b = C49166a.m193877a(new LinkedHashSet());

    private LogoutListenerManager() {
    }

    static {
        m193633a(new AbstractC49377c() {
            /* class com.ss.android.lark.passport.infra.listenermanage.LogoutListenerManager.C491021 */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
            /* renamed from: a */
            public void mo171424a(C49375a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "context");
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("LogoutListenerManager", "logout begin, context: " + aVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.AbstractC49377c
            /* renamed from: a */
            public void mo171425a(C49376b bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "context");
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("LogoutListenerManager", "logout end, context: " + bVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.b$a */
    public static final class C49103a extends Lambda implements Function0<Unit> {
        final /* synthetic */ boolean $isQuitAll;
        final /* synthetic */ List $logoutUsers;
        final /* synthetic */ LogoutReason $reason;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49103a(LogoutReason logoutReason, List list, boolean z) {
            super(0);
            this.$reason = logoutReason;
            this.$logoutUsers = list;
            this.$isQuitAll = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C49375a aVar = new C49375a(this.$reason, this.$logoutUsers, this.$isQuitAll);
            LogoutListenerManager bVar = LogoutListenerManager.f123317a;
            for (AbstractC49377c cVar : CollectionsKt.toMutableList((Collection) LogoutListenerManager.f123318b)) {
                cVar.mo171424a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.b$b */
    public static final class C49104b extends Lambda implements Function0<Unit> {
        final /* synthetic */ List $allUsers;
        final /* synthetic */ LogoutReason $reason;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49104b(LogoutReason logoutReason, List list) {
            super(0);
            this.$reason = logoutReason;
            this.$allUsers = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C49376b bVar = new C49376b(false, this.$reason, CollectionsKt.emptyList(), this.$allUsers);
            LogoutListenerManager bVar2 = LogoutListenerManager.f123317a;
            for (AbstractC49377c cVar : CollectionsKt.toMutableList((Collection) LogoutListenerManager.f123318b)) {
                cVar.mo171425a(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.b$c */
    public static final class C49105c extends Lambda implements Function0<Unit> {
        final /* synthetic */ List $allUsers;
        final /* synthetic */ List $logoutUsers;
        final /* synthetic */ LogoutReason $reason;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49105c(LogoutReason logoutReason, List list, List list2) {
            super(0);
            this.$reason = logoutReason;
            this.$logoutUsers = list;
            this.$allUsers = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C49376b bVar = new C49376b(true, this.$reason, this.$logoutUsers, this.$allUsers);
            LogoutListenerManager bVar2 = LogoutListenerManager.f123317a;
            for (AbstractC49377c cVar : CollectionsKt.toMutableList((Collection) LogoutListenerManager.f123318b)) {
                cVar.mo171425a(bVar);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193633a(AbstractC49377c cVar) {
        if (cVar != null) {
            f123318b.add(cVar);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m193635b(AbstractC49377c cVar) {
        if (cVar != null) {
            f123318b.remove(cVar);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m193634b(LogoutReason logoutReason, List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(logoutReason, "reason");
        Intrinsics.checkParameterIsNotNull(list, "allUsers");
        C49168c.m193880a(null, false, new C49104b(logoutReason, list), 3, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193631a(LogoutReason logoutReason, List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(logoutReason, "reason");
        Intrinsics.checkParameterIsNotNull(list, "logoutUsers");
        ServiceFinder rVar = ServiceFinder.f123386a;
        IUserListService iUserListService = (IUserListService) ServiceFinder.m193746a(IUserListService.class);
        if (iUserListService != null) {
            List<? extends User> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().userId);
            }
            C49168c.m193880a(null, false, new C49105c(logoutReason, list, iUserListService.removeUsersById(arrayList)), 3, null);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193632a(LogoutReason logoutReason, List<? extends User> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(logoutReason, "reason");
        Intrinsics.checkParameterIsNotNull(list, "logoutUsers");
        C49168c.m193880a(null, false, new C49103a(logoutReason, list, z), 3, null);
    }
}
