package com.ss.lark.android.passport.biz.compat.tenant;

import com.ss.android.lark.passport.infra.service.ServiceFinder;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\b\u0010\n\u001a\u00020\u0006H\u0007J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R*\u0010\u0003\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/tenant/TenantPush;", "", "()V", "listeners", "Ljava/util/LinkedHashSet;", "Lkotlin/Function0;", "", "Lkotlin/collections/LinkedHashSet;", "registerOnPushUserListUpdateListener", "listener", "registerPushOnUserListUpdateListener", "unregisterOnPushUserListUpdateListener", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.tenant.b */
public final class TenantPush {

    /* renamed from: a */
    public static final TenantPush f162794a = new TenantPush();

    /* renamed from: b */
    private static final LinkedHashSet<Function0<Unit>> f162795b = new LinkedHashSet<>();

    private TenantPush() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m253344a() {
        ServiceFinder.m193748c().registerPushUserListChangedEvent(C64472a.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.tenant.b$a */
    static final class C64472a extends Lambda implements Function0<Unit> {
        public static final C64472a INSTANCE = new C64472a();

        C64472a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            TenantPush bVar = TenantPush.f162794a;
            for (Function0 function0 : CollectionsKt.toMutableList((Collection) TenantPush.f162795b)) {
                function0.invoke();
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m253346b(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "listener");
        f162795b.remove(function0);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m253345a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "listener");
        f162795b.add(function0);
    }
}
