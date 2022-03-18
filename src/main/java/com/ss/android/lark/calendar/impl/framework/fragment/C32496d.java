package com.ss.android.lark.calendar.impl.framework.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getHostStack", "Lcom/ss/android/lark/calendar/impl/framework/fragment/FragmentStack;", "Landroidx/fragment/app/Fragment;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.fragment.d */
public final class C32496d {
    /* renamed from: a */
    public static final FragmentStack m124053a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$getHostStack");
        FragmentActivity activity = fragment.getActivity();
        if (!(activity instanceof FragmentStackHost)) {
            activity = null;
        }
        FragmentStackHost bVar = (FragmentStackHost) activity;
        if (bVar != null) {
            return bVar.mo118659e();
        }
        return null;
    }
}
