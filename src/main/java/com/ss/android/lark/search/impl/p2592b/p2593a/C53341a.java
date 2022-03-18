package com.ss.android.lark.search.impl.p2592b.p2593a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"inflate", "Landroid/view/View;", "Landroid/view/ViewGroup;", "layoutRes", "", "attachToRoot", "", "core_search_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.b.a.a */
public final class C53341a {
    /* renamed from: a */
    public static final View m206455a(ViewGroup viewGroup, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "$this$inflate");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, z);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…tRes, this, attachToRoot)");
        return inflate;
    }
}
