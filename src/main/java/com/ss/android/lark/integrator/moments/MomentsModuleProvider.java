package com.ss.android.lark.integrator.moments;

import com.ss.android.lark.moments.api.IMomentsModuleForLark;
import com.ss.android.lark.moments.api.MomentsModuleWrapper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/integrator/moments/MomentsModuleProvider;", "", "()V", "Companion", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a */
public final class MomentsModuleProvider {

    /* renamed from: a */
    public static final Lazy f101576a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C39895b.INSTANCE);

    /* renamed from: b */
    public static final Companion f101577b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final IMomentsModuleForLark m158362a() {
        return f101577b.mo144687b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\u0004H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/integrator/moments/MomentsModuleProvider$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/moments/api/IMomentsModuleForLark;", "getInstance", "()Lcom/ss/android/lark/moments/api/IMomentsModuleForLark;", "instance$delegate", "Lkotlin/Lazy;", "getModule", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a$a */
    public static final class Companion {
        /* renamed from: a */
        public final IMomentsModuleForLark mo144686a() {
            Lazy lazy = MomentsModuleProvider.f101576a;
            Companion aVar = MomentsModuleProvider.f101577b;
            return (IMomentsModuleForLark) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final IMomentsModuleForLark mo144687b() {
            return mo144686a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/api/MomentsModuleWrapper;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a$b */
    static final class C39895b extends Lambda implements Function0<MomentsModuleWrapper> {
        public static final C39895b INSTANCE = new C39895b();

        C39895b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentsModuleWrapper invoke() {
            return new MomentsModuleWrapper();
        }
    }
}
