package com.ss.android.lark.passport.infra.base.p2426c.p2430d;

import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.config.Config;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"global", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "Lcom/ss/android/lark/passport/infra/base/storage/IsolateStorage;", "getGlobal", "(Lcom/ss/android/lark/passport/infra/base/storage/IsolateStorage;)Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "global$delegate", "Lkotlin/Lazy;", "user", "userId", "", "config", "Lcom/ss/android/lark/passport/infra/base/storage/config/Config;", "passport-infra_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.c.d.a */
public final class C49067a {

    /* renamed from: a */
    private static final Lazy f123192a = LazyKt.lazy(C49068a.INSTANCE);

    /* renamed from: a */
    public static final DataStorageDelegate m193335a(IsolateStorage aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$global");
        return (DataStorageDelegate) f123192a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/base/storage/store/DataStorageDelegate;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.c.d.a$a */
    static final class C49068a extends Lambda implements Function0<DataStorageDelegate> {
        public static final C49068a INSTANCE = new C49068a();

        C49068a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final DataStorageDelegate invoke() {
            return IsolateOptimizer.f123194a.mo171278a(IsolateGlobalExtension.f123193a.mo171277b(), IsolateGlobalExtension.f123193a.mo171276a());
        }
    }

    /* renamed from: a */
    public static final DataStorageDelegate m193336a(IsolateStorage aVar, String str, Config aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$user");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(aVar2, "config");
        return IsolateOptimizer.f123194a.mo171278a(IsolateUserExtension.f123198a.mo171280b(str, aVar2), IsolateUserExtension.f123198a.mo171279a(str, aVar2));
    }

    /* renamed from: a */
    public static /* synthetic */ DataStorageDelegate m193337a(IsolateStorage aVar, String str, Config aVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar2 = aVar.mo171220a();
        }
        return m193336a(aVar, str, aVar2);
    }
}
