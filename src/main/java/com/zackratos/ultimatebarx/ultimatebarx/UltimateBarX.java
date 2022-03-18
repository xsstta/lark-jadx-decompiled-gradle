package com.zackratos.ultimatebarx.ultimatebarx;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.zackratos.ultimatebarx.ultimatebarx.operator.Operator;
import com.zackratos.ultimatebarx.ultimatebarx.operator.OperatorProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarX;", "", "()V", "Companion", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.a */
public final class UltimateBarX {

    /* renamed from: a */
    public static final Companion f171308a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0013\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0015"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarX$Companion;", "", "()V", "addNavigationBarBottomPadding", "", "target", "Landroid/view/View;", "addStatusBarTopPadding", "get", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/Operator;", "fragment", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getNavigationBarConfig", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "getNavigationBarHeight", "", "getStatusBarConfig", "getStatusBarHeight", "with", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Operator mo236949a(Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            return OperatorProvider.f171342a.mo237007a(fragment);
        }

        @JvmStatic
        /* renamed from: a */
        public final Operator mo236950a(FragmentActivity fragmentActivity) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            return OperatorProvider.f171342a.mo237008a(fragmentActivity);
        }
    }
}
