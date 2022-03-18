package com.ss.android.lark.mm.utils.ktextensions;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.mm.utils.C47098d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toFragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "Landroid/content/Context;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.utils.ktextensions.a */
public final class C47107a {
    /* renamed from: a */
    public static final FragmentActivity m186565a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "$this$toFragmentActivity");
        Activity a = C47098d.m186533a(context);
        if (!(a instanceof FragmentActivity)) {
            a = null;
        }
        return (FragmentActivity) a;
    }
}
