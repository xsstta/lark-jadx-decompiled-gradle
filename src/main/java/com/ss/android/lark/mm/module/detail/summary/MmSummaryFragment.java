package com.ss.android.lark.mm.module.detail.summary;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/summary/MmSummaryFragment;", "Lcom/ss/android/lark/mm/module/detail/main/MmBaseDetailFragment;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "()V", "mContext", "Landroid/content/Context;", "viewControls", "", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "getMContext", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRootView", "Landroid/view/View;", "onAttach", "", "context", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.summary.e */
public final class MmSummaryFragment extends MmBaseDetailFragment implements IMmViewControlContext {

    /* renamed from: a */
    private final List<MmBaseViewControl<?, ?>> f116580a = new ArrayList();

    /* renamed from: b */
    private Context f116581b;

    /* renamed from: c */
    private HashMap f116582c;

    @Override // com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116582c == null) {
            this.f116582c = new HashMap();
        }
        View view = (View) this.f116582c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116582c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116582c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: e */
    public C47084f mo161231e() {
        return IMmViewControlContext.C45904a.m181880a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: p */
    public C47096b mo161234p() {
        return mo161169b();
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: n */
    public Context mo161232n() {
        Context context = this.f116581b;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: o */
    public View mo161233o() {
        TwinklingRefreshLayout twinklingRefreshLayout = (TwinklingRefreshLayout) mo161166a(R.id.swipeRefreshLayout);
        Intrinsics.checkExpressionValueIsNotNull(twinklingRefreshLayout, "swipeRefreshLayout");
        return twinklingRefreshLayout;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroy() {
        Iterator<T> it = this.f116580a.iterator();
        while (it.hasNext()) {
            it.next().mo161245h();
        }
        this.f116580a.clear();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onAttach(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        this.f116581b = context;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        MmSummaryControl dVar;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        MmViewControlRegister f = mo161909f();
        MmControlRegister d = mo161908d();
        if (f != null && d != null && (dVar = (MmSummaryControl) d.mo161912a(MmSummaryControl.class)) != null) {
            this.f116580a.add(new MmSummaryViewControl(this, new MmSummaryViewControlAdapter(f, d, dVar)));
            Iterator<T> it = this.f116580a.iterator();
            while (it.hasNext()) {
                it.next().be_();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_fragment_detail_summary, viewGroup, false);
    }
}
