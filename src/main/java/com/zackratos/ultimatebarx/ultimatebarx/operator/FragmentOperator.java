package com.zackratos.ultimatebarx.ultimatebarx.operator;

import android.os.Build;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.zackratos.ultimatebarx.ultimatebarx.bean.BarConfig;
import com.zackratos.ultimatebarx.ultimatebarx.p3441b.C68088a;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68098a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/FragmentOperator;", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/BaseOperator;", "fragment", "Landroidx/fragment/app/Fragment;", "config", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "(Landroidx/fragment/app/Fragment;Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "applyNavigationBar", "", "applyStatusBar", "Companion", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.d */
public final class FragmentOperator extends BaseOperator {

    /* renamed from: a */
    public static final Companion f171340a = new Companion(null);

    /* renamed from: b */
    private final Fragment f171341b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/zackratos/ultimatebarx/ultimatebarx/operator/FragmentOperator$Companion;", "", "()V", "newInstance", "Lcom/zackratos/ultimatebarx/ultimatebarx/operator/FragmentOperator;", "fragment", "Landroidx/fragment/app/Fragment;", "config", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "newInstance$ultimatebarx_release", "ultimatebarx_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.d.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FragmentOperator mo237006a(Fragment fragment, BarConfig bVar) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            Intrinsics.checkParameterIsNotNull(bVar, "config");
            return new FragmentOperator(fragment, bVar, null);
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: a */
    public void mo236995a() {
        if (Build.VERSION.SDK_INT >= 19) {
            FragmentActivity requireActivity = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "fragment.requireActivity()");
            C68088a.m264642a(requireActivity);
            C68088a.m264640a(this.f171341b);
            boolean d = mo237000c().mo236992k(this.f171341b).mo236969d();
            FragmentActivity requireActivity2 = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "fragment.requireActivity()");
            C68098a.m264685a(requireActivity2, mo237002e().mo236969d(), d);
            C68088a.m264641a(this.f171341b, mo237002e());
            FragmentActivity requireActivity3 = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity3, "fragment.requireActivity()");
            C68088a.m264651c(requireActivity3);
            C68088a.m264644a((LifecycleOwner) this.f171341b);
            FragmentActivity requireActivity4 = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity4, "fragment.requireActivity()");
            C68088a.m264644a((LifecycleOwner) requireActivity4);
        }
    }

    @Override // com.zackratos.ultimatebarx.ultimatebarx.operator.Operator
    /* renamed from: b */
    public void mo236996b() {
        if (Build.VERSION.SDK_INT >= 19) {
            FragmentActivity requireActivity = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "fragment.requireActivity()");
            C68088a.m264642a(requireActivity);
            C68088a.m264640a(this.f171341b);
            boolean d = mo237000c().mo236991j(this.f171341b).mo236969d();
            FragmentActivity requireActivity2 = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "fragment.requireActivity()");
            C68098a.m264685a(requireActivity2, d, mo237002e().mo236969d());
            C68088a.m264647b(this.f171341b, mo237002e());
            FragmentActivity requireActivity3 = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity3, "fragment.requireActivity()");
            C68088a.m264648b(requireActivity3);
            C68088a.m264644a((LifecycleOwner) this.f171341b);
            FragmentActivity requireActivity4 = this.f171341b.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity4, "fragment.requireActivity()");
            C68088a.m264644a((LifecycleOwner) requireActivity4);
        }
    }

    private FragmentOperator(Fragment fragment, BarConfig bVar) {
        super(bVar);
        this.f171341b = fragment;
    }

    public /* synthetic */ FragmentOperator(Fragment fragment, BarConfig bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, bVar);
    }
}
