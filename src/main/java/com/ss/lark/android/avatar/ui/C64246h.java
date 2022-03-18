package com.ss.lark.android.avatar.ui;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"launchWhenStarted", "", "T", "Landroidx/fragment/app/Fragment;", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "core_avatar_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.ui.h */
public final class C64246h {
    /* renamed from: a */
    public static final <T extends Fragment> void m252677a(T t, Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(t, "$this$launchWhenStarted");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        t.getLifecycle().addObserver(new FragmentKtx$launchWhenStarted$1(t, function1));
    }
}
