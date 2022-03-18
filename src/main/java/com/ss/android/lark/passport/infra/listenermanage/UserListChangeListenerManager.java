package com.ss.android.lark.passport.infra.listenermanage;

import com.ss.android.lark.passport.infra.util.p2441c.C49166a;
import com.ss.android.lark.passport.infra.util.p2441c.C49168c;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.AbstractC49372a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0007J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/passport/infra/listenermanage/UserListChangeListenerManager;", "", "()V", "TAG", "", "listeners", "", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/OnUserListChangeListener;", "dispatchUserListChanged", "", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "users", "", "registerListener", "listener", "unregisterListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.c.c */
public final class UserListChangeListenerManager {

    /* renamed from: a */
    public static final UserListChangeListenerManager f123319a = new UserListChangeListenerManager();

    /* renamed from: b */
    private static final Set<AbstractC49372a> f123320b = C49166a.m193877a(new LinkedHashSet());

    private UserListChangeListenerManager() {
    }

    static {
        m193639a(C491061.f123321a);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.c.c$a */
    public static final class C49107a extends Lambda implements Function0<Unit> {
        final /* synthetic */ List $users;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49107a(List list) {
            super(0);
            this.$users = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UserListChangeListenerManager cVar = UserListChangeListenerManager.f123319a;
            for (AbstractC49372a aVar : CollectionsKt.toMutableList((Collection) UserListChangeListenerManager.f123320b)) {
                aVar.mo171426a(this.$users);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193639a(AbstractC49372a aVar) {
        if (aVar != null) {
            f123320b.add(aVar);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m193641b(AbstractC49372a aVar) {
        if (aVar != null) {
            f123320b.remove(aVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m193640a(List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(list, "users");
        C49168c.m193880a(null, false, new C49107a(list), 1, null);
    }
}
