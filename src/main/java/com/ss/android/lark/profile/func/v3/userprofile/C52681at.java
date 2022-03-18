package com.ss.android.lark.profile.func.v3.userprofile;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.at */
public final class C52681at implements AppBarLayout.AbstractC22134b {

    /* renamed from: a */
    private final /* synthetic */ Function2 f130379a;

    C52681at(Function2 kVar) {
        this.f130379a = kVar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
    public final /* synthetic */ void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        Intrinsics.checkExpressionValueIsNotNull(this.f130379a.invoke(appBarLayout, Integer.valueOf(i)), "invoke(...)");
    }
}
