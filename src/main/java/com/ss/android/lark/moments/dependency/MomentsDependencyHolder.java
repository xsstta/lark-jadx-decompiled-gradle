package com.ss.android.lark.moments.dependency;

import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.moments.impl.featuregating.MomentsFeatureGating;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/dependency/MomentsDependencyHolder;", "", "()V", "dependency", "Lcom/ss/android/lark/moments/dependency/IMomentsDependency;", "getDependency", "()Lcom/ss/android/lark/moments/dependency/IMomentsDependency;", "dependency$delegate", "Lkotlin/Lazy;", "featureGating", "Lcom/ss/android/lark/moments/impl/featuregating/MomentsFeatureGating;", "getFeatureGating", "()Lcom/ss/android/lark/moments/impl/featuregating/MomentsFeatureGating;", "setFeatureGating", "(Lcom/ss/android/lark/moments/impl/featuregating/MomentsFeatureGating;)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.b.b */
public final class MomentsDependencyHolder {

    /* renamed from: a */
    public static MomentsFeatureGating f118997a;

    /* renamed from: b */
    public static final MomentsDependencyHolder f118998b = new MomentsDependencyHolder();

    /* renamed from: c */
    private static final Lazy f118999c = LazyKt.lazy(C47180a.INSTANCE);

    /* renamed from: a */
    public final IMomentsDependency mo165899a() {
        return (IMomentsDependency) f118999c.getValue();
    }

    private MomentsDependencyHolder() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/moments/dependency/IMomentsDependency;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.b.b$a */
    static final class C47180a extends Lambda implements Function0<IMomentsDependency> {
        public static final C47180a INSTANCE = new C47180a();

        C47180a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IMomentsDependency invoke() {
            return (IMomentsDependency) ClaymoreServiceLoader.loadFirst(IMomentsDependency.class);
        }
    }

    /* renamed from: b */
    public final MomentsFeatureGating mo165901b() {
        MomentsFeatureGating aVar = f118997a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("featureGating");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo165900a(MomentsFeatureGating aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        f118997a = aVar;
    }
}
