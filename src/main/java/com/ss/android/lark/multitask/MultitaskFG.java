package com.ss.android.lark.multitask;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/multitask/MultitaskFG;", "", "()V", "dependency", "Lcom/ss/android/lark/multitask/MultitaskFGDependency;", "getDependency", "()Lcom/ss/android/lark/multitask/MultitaskFGDependency;", "setDependency", "(Lcom/ss/android/lark/multitask/MultitaskFGDependency;)V", "isEnabled", "", "()Z", "isFloatingWindowEnable", "features_multitask_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.multitask.e */
public final class MultitaskFG {

    /* renamed from: a */
    public static MultitaskFGDependency f121594a;

    /* renamed from: b */
    public static final MultitaskFG f121595b = new MultitaskFG();

    private MultitaskFG() {
    }

    /* renamed from: a */
    public final boolean mo168904a() {
        MultitaskFGDependency fVar = f121594a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dependency");
        }
        return fVar.mo168906a();
    }

    /* renamed from: b */
    public final boolean mo168905b() {
        MultitaskFGDependency fVar = f121594a;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dependency");
        }
        return fVar.mo168907b();
    }
}
