package com.ss.android.lark.mm.utils.ktextensions;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.mm.utils.C47098d;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"bindLifecycle", "", "Lio/reactivex/disposables/Disposable;", "context", "Landroid/content/Context;", "fragment", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.ktextensions.b */
public final class C47108b {
    /* renamed from: a */
    public static final void m186567a(Disposable disposable, Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(disposable, "$this$bindLifecycle");
        if (fragment != null) {
            fragment.getLifecycle().addObserver(new RxExtensionsKt$bindLifecycle$2(disposable));
        }
    }

    /* renamed from: a */
    public static final void m186566a(Disposable disposable, Context context) {
        Intrinsics.checkParameterIsNotNull(disposable, "$this$bindLifecycle");
        Activity a = C47098d.m186533a(context);
        if (context != null && a != null && (a instanceof FragmentActivity)) {
            ((FragmentActivity) a).getLifecycle().addObserver(new RxExtensionsKt$bindLifecycle$3(disposable));
        }
    }

    /* renamed from: a */
    public static final void m186568a(Disposable disposable, FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(disposable, "$this$bindLifecycle");
        if (fragmentActivity != null) {
            fragmentActivity.getLifecycle().addObserver(new RxExtensionsKt$bindLifecycle$1(disposable));
        }
    }
}
