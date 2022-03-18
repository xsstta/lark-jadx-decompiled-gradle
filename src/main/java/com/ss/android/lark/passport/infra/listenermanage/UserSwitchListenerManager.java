package com.ss.android.lark.passport.infra.listenermanage;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.p2441c.C49166a;
import com.ss.android.lark.passport.infra.util.p2441c.C49168c;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.UserSwitchReason;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\"\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/passport/infra/listenermanage/UserSwitchListenerManager;", "", "()V", "TAG", "", "dispatchingTriple", "Lkotlin/Triple;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchReason;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "listeners", "", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "dispatchSwitchUserBegin", "", "reason", "", "activeUser", "targetUser", "dispatchSwitchUserFailed", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "dispatchSwitchUserSuccess", "previousUser", "registerListener", "listener", "unregisterListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.c.d */
public final class UserSwitchListenerManager {

    /* renamed from: a */
    public static final UserSwitchListenerManager f123322a = new UserSwitchListenerManager();

    /* renamed from: b */
    private static final Set<AbstractC49379a> f123323b = C49166a.m193877a(new LinkedHashSet());

    /* renamed from: c */
    private static volatile Triple<? extends UserSwitchReason, ? extends User, ? extends User> f123324c;

    private UserSwitchListenerManager() {
    }

    static {
        m193648a(new AbstractC49379a() {
            /* class com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager.C491081 */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public void mo102549a(C49380b bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "context");
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("UserSwitchListenerManager", "onUserSwitchBegin, context: " + bVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public void onUserSwitchSuccess(C49382d dVar) {
                Intrinsics.checkParameterIsNotNull(dVar, "context");
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("UserSwitchListenerManager", "onUserSwitchEnd, context: " + dVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public void mo102550a(C49381c cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "context");
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("UserSwitchListenerManager", "onUserSwitchFailed, context: " + cVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.d$a */
    public static final class C49109a extends Lambda implements Function0<Unit> {
        final /* synthetic */ User $activeUser;
        final /* synthetic */ UserSwitchReason $reasonEnum;
        final /* synthetic */ User $targetUser;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49109a(UserSwitchReason userSwitchReason, User user, User user2) {
            super(0);
            this.$reasonEnum = userSwitchReason;
            this.$activeUser = user;
            this.$targetUser = user2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UserSwitchListenerManager dVar = UserSwitchListenerManager.f123322a;
            UserSwitchListenerManager.f123324c = new Triple(this.$reasonEnum, this.$activeUser, this.$targetUser);
            C49380b bVar = new C49380b(this.$reasonEnum, this.$activeUser, this.$targetUser);
            UserSwitchListenerManager dVar2 = UserSwitchListenerManager.f123322a;
            for (AbstractC49379a aVar : CollectionsKt.toMutableList((Collection) UserSwitchListenerManager.f123323b)) {
                aVar.mo102549a(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.d$b */
    public static final class C49110b extends Lambda implements Function0<Unit> {
        final /* synthetic */ ErrorResult $error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49110b(ErrorResult errorResult) {
            super(0);
            this.$error = errorResult;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UserSwitchListenerManager dVar = UserSwitchListenerManager.f123322a;
            Triple triple = UserSwitchListenerManager.f123324c;
            if (triple != null) {
                C49381c cVar = new C49381c((User) triple.getSecond(), this.$error);
                UserSwitchListenerManager dVar2 = UserSwitchListenerManager.f123322a;
                for (AbstractC49379a aVar : CollectionsKt.toMutableList((Collection) UserSwitchListenerManager.f123323b)) {
                    PassportLog a = PassportLog.f123351c.mo171474a();
                    a.mo171465b("n_action_switch_notify_fail", "notify deal, listener name is:" + aVar.getClass().getName());
                    aVar.mo102550a(cVar);
                }
                PassportLog.f123351c.mo171474a().mo171465b("n_action_switch_notify_fail", "all listeners notify done");
                return;
            }
            UserSwitchListenerManager dVar3 = UserSwitchListenerManager.f123322a;
            PassportLog.f123351c.mo171474a().mo171471d("n_action_switch_notify_fail", "dispatchingTriple is null");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.d$c */
    public static final class C49111c extends Lambda implements Function0<Unit> {
        final /* synthetic */ User $activeUser;
        final /* synthetic */ User $previousUser;
        final /* synthetic */ UserSwitchReason $reason;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49111c(UserSwitchReason userSwitchReason, User user, User user2) {
            super(0);
            this.$reason = userSwitchReason;
            this.$previousUser = user;
            this.$activeUser = user2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C49382d dVar = new C49382d(this.$reason, this.$previousUser, this.$activeUser);
            UserSwitchListenerManager dVar2 = UserSwitchListenerManager.f123322a;
            for (AbstractC49379a aVar : CollectionsKt.toMutableList((Collection) UserSwitchListenerManager.f123323b)) {
                PassportLog a = PassportLog.f123351c.mo171474a();
                a.mo171465b("n_action_switch_notify_succ", "notify deal, listener name is:" + aVar.getClass().getName());
                aVar.onUserSwitchSuccess(dVar);
            }
            PassportLog.f123351c.mo171474a().mo171465b("n_action_switch_notify_succ", "all listeners notify done");
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m193650b(AbstractC49379a aVar) {
        if (aVar != null) {
            f123323b.remove(aVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193648a(AbstractC49379a aVar) {
        if (aVar != null) {
            f123323b.add(aVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193645a(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "error");
        PassportLog.f123351c.mo171474a().mo171460a("n_action_switch_notify_fail");
        C49168c.m193880a(null, false, new C49110b(errorResult), 1, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193644a(int i, User user, User user2) {
        Intrinsics.checkParameterIsNotNull(user2, "targetUser");
        UserSwitchReason fromValue = UserSwitchReason.fromValue(i);
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("n_action_switch_notify_start", "reason is " + fromValue);
        C49168c.m193880a(null, false, new C49109a(fromValue, user, user2), 1, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193647a(UserSwitchReason userSwitchReason, User user, User user2) {
        Intrinsics.checkParameterIsNotNull(userSwitchReason, "reason");
        Intrinsics.checkParameterIsNotNull(user2, "activeUser");
        PassportLog.f123351c.mo171474a().mo171460a("n_action_switch_notify_succ");
        C49168c.m193880a(null, false, new C49111c(userSwitchReason, user, user2), 1, null);
    }
}
