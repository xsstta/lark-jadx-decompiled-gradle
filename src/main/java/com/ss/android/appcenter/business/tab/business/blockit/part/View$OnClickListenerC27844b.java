package com.ss.android.appcenter.business.tab.business.blockit.part;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.appcenter.business.tab.business.blockit.part.b */
final class View$OnClickListenerC27844b implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Function1 f69598a;

    View$OnClickListenerC27844b(Function1 function1) {
        this.f69598a = function1;
    }

    public final /* synthetic */ void onClick(View view) {
        Intrinsics.checkExpressionValueIsNotNull(this.f69598a.invoke(view), "invoke(...)");
    }
}
