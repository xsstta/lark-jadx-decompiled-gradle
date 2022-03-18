package com.zackratos.ultimatebarx.ultimatebarx.operator;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarXManager;
import com.zackratos.ultimatebarx.ultimatebarx.operator.ActivityOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/OperatorProvider;", "", "()V", "create", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/Operator;", "fragment", "Landroidx/fragment/app/Fragment;", "create$ultimatebarx_release", "activity", "Landroidx/fragment/app/FragmentActivity;", "get", "get$ultimatebarx_release", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.f */
public final class OperatorProvider {

    /* renamed from: a */
    public static final OperatorProvider f171342a = new OperatorProvider();

    private OperatorProvider() {
    }

    /* renamed from: a */
    public final Operator mo237008a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        return ActivityOperator.Companion.m264697a(ActivityOperator.f171331a, fragmentActivity, null, 2, null);
    }

    /* renamed from: a */
    public final Operator mo237007a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Fragment fragment2 = fragment;
        return DoubleOperator.f171335c.mo237005a().mo237003a(FragmentOperator.f171340a.mo237006a(fragment, UltimateBarXManager.f171319b.mo236993a().mo236991j(fragment2))).mo237004b(FragmentOperator.f171340a.mo237006a(fragment, UltimateBarXManager.f171319b.mo236993a().mo236992k(fragment2)));
    }
}
