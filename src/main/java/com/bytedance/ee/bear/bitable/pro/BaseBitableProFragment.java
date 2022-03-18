package com.bytedance.ee.bear.bitable.pro;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.bytedance.ee.util.ui.ColorUtils;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/pro/BaseBitableProFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "statusBar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "getStatusBar", "()Lcom/bytedance/ee/util/statusbar/IStatusBar;", "statusBar$delegate", "Lkotlin/Lazy;", "getStatusBarColorRes", "", "onDestroyView", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.pro.a */
public abstract class BaseBitableProFragment extends C7667e {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f14151a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseBitableProFragment.class), "statusBar", "getStatusBar()Lcom/bytedance/ee/util/statusbar/IStatusBar;"))};

    /* renamed from: b */
    private final Lazy f14152b = LazyKt.lazy(new C4815a(this));

    /* renamed from: c */
    private HashMap f14153c;

    /* renamed from: c */
    private final IStatusBar mo18921c() {
        Lazy lazy = this.f14152b;
        KProperty kProperty = f14151a[0];
        return (IStatusBar) lazy.getValue();
    }

    /* renamed from: a */
    public abstract int mo18913a();

    /* renamed from: a */
    public View mo18914a(int i) {
        if (this.f14153c == null) {
            this.f14153c = new HashMap();
        }
        View view = (View) this.f14153c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f14153c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public void mo18915b() {
        HashMap hashMap = this.f14153c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        mo18921c().mo50689b();
        mo18915b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.pro.a$a */
    static final class C4815a extends Lambda implements Function0<IStatusBar> {
        final /* synthetic */ BaseBitableProFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4815a(BaseBitableProFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final IStatusBar invoke() {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            return StatusBarManager.m55628a(requireActivity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo18921c().mo50687a();
        IStatusBar c = mo18921c();
        int color = getResources().getColor(mo18913a());
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        c.mo50688a(color, !ColorUtils.m55701a(requireContext));
    }
}
