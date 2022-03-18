package com.bytedance.ee.bear.more.view2;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.p271a.C4860a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.LinearLayoutManagerWrapper;
import com.bytedance.ee.bear.more.MoreViewModel;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.IMoreHost;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import com.bytedance.ee.bear.more.view2.header.IHeaderView;
import com.bytedance.ee.bear.more.view2.header.MoreHeaderFragment;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u001a\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\tH\u0016J\u001a\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/more/view2/MoreFragmentV2;", "Lcom/bytedance/ee/bear/bizwidget/dialogfragment/BaseBottomSheetDialogFragment;", "Lcom/bytedance/ee/bear/more/view2/header/IHeaderView;", "()V", "moreInfo", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "viewModel", "Lcom/bytedance/ee/bear/more/MoreViewModel;", "dismissIgnoreError", "", "initGroups", "initHeaderFragment", "initPeekHeight", "initWatermark", "token", "", ShareHitPoint.f121869d, "", "onClickClose", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDetach", "onStart", "onViewCreated", "view", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.view2.c */
public final class MoreFragmentV2 extends C4860a implements IHeaderView {

    /* renamed from: d */
    public static final Companion f27729d = new Companion(null);

    /* renamed from: c */
    public IMoreInfo f27730c;

    /* renamed from: e */
    private MoreViewModel f27731e;

    /* renamed from: f */
    private HashMap f27732f;

    @JvmStatic
    /* renamed from: a */
    public static final DialogInterface$OnCancelListenerC1021b m42809a(FragmentActivity fragmentActivity, Bundle bundle) {
        return f27729d.mo39246a(fragmentActivity, bundle);
    }

    /* renamed from: a */
    public View mo39242a(int i) {
        if (this.f27732f == null) {
            this.f27732f = new HashMap();
        }
        View view = (View) this.f27732f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f27732f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h */
    public void mo39245h() {
        HashMap hashMap = this.f27732f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo39245h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/more/view2/MoreFragmentV2$Companion;", "", "()V", "TAG", "", "show", "Landroidx/fragment/app/DialogFragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "bundle", "Landroid/os/Bundle;", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final DialogInterface$OnCancelListenerC1021b mo39246a(FragmentActivity fragmentActivity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "bundle");
            Fragment instantiate = Fragment.instantiate(fragmentActivity, MoreFragmentV2.class.getName(), bundle);
            if (instantiate != null) {
                DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) instantiate;
                bVar.mo5511a(fragmentActivity.getSupportFragmentManager(), MoreFragmentV2.class.getName());
                return bVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // com.bytedance.ee.bear.more.view2.header.IHeaderView
    /* renamed from: f */
    public void mo39199f() {
        mo39244g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/more/view2/MoreFragmentV2$initGroups$adapterOuter$1", "Lcom/bytedance/ee/bear/more/moreprotocol/IMoreHost;", "closeMorePanel", "", "getHostFragment", "Landroidx/fragment/app/Fragment;", "getMoreInfo", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "isShowing", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.c$d */
    public static final class C10262d implements IMoreHost {

        /* renamed from: a */
        final /* synthetic */ MoreFragmentV2 f27736a;

        @Override // com.bytedance.ee.bear.more.moreprotocol.IMoreHost
        /* renamed from: a */
        public IMoreInfo mo39164a() {
            return this.f27736a.f27730c;
        }

        @Override // com.bytedance.ee.bear.more.moreprotocol.IMoreHost
        /* renamed from: b */
        public Fragment mo39165b() {
            return this.f27736a;
        }

        @Override // com.bytedance.ee.bear.more.moreprotocol.IMoreHost
        /* renamed from: c */
        public void mo39166c() {
            this.f27736a.mo39244g();
        }

        @Override // com.bytedance.ee.bear.more.moreprotocol.IMoreHost
        /* renamed from: d */
        public boolean mo39167d() {
            Dialog v_ = this.f27736a.v_();
            if (v_ != null) {
                return v_.isShowing();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10262d(MoreFragmentV2 cVar) {
            this.f27736a = cVar;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m42810i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MoreViewModel fVar = this.f27731e;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        fVar.closeMore();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        C13479a.m54764b("MoreFragmentV2", "moreFragment detach!!!!");
    }

    /* renamed from: g */
    public final void mo39244g() {
        try {
            if (isAdded()) {
                super.mo5513b();
            } else {
                C13479a.m54758a("MoreFragmentV2", "fragment is not add");
            }
        } catch (Throwable th) {
            C13479a.m54761a("MoreFragmentV2", th);
            C13606d.m55245a("MoreFragmentV2_dismissIgnoreErr()", th);
        }
    }

    /* renamed from: j */
    private final void m42811j() {
        MoreHeaderFragment.Companion aVar = MoreHeaderFragment.f27678e;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
        MoreHeaderFragment a = aVar.mo39206a(activity, getArguments());
        a.mo39203a(this);
        getChildFragmentManager().beginTransaction().add(R.id.headerContainer, a).commitAllowingStateLoss();
    }

    /* renamed from: i */
    private final void m42810i() {
        ViewGroup.LayoutParams layoutParams;
        Window window;
        View decorView;
        FrameLayout frameLayout;
        try {
            Dialog v_ = v_();
            if (v_ == null || (window = v_.getWindow()) == null || (decorView = window.getDecorView()) == null || (frameLayout = (FrameLayout) decorView.findViewById(R.id.design_bottom_sheet)) == null) {
                layoutParams = null;
            } else {
                layoutParams = frameLayout.getLayoutParams();
            }
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    ((BottomSheetBehavior) behavior).mo76702a((int) (((float) UIUtils.getScreenHeight(getContext())) * 0.75f));
                }
            }
        } catch (Throwable th) {
            C13479a.m54759a("MoreFragmentV2", "init peek height", th);
        }
    }

    /* renamed from: k */
    private final void m42812k() {
        MoreAdapterOuter bVar = new MoreAdapterOuter(new C10262d(this));
        MoreViewModel fVar = this.f27731e;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        MoreFragmentV2 cVar = this;
        fVar.getMoreInfoLiveData().mo5923a(cVar, new C10260b(this, bVar));
        MoreViewModel fVar2 = this.f27731e;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        fVar2.getGroupListLiveData().mo5923a(cVar, new C10261c(bVar));
        RecyclerView recyclerView = (RecyclerView) mo39242a(R.id.moreContainer);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "moreContainer");
        recyclerView.setAdapter(bVar);
        RecyclerView recyclerView2 = (RecyclerView) mo39242a(R.id.moreContainer);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "moreContainer");
        recyclerView2.setLayoutManager(new LinearLayoutManagerWrapper(getContext()));
        getLifecycle().addObserver(new MoreFragmentV2$initGroups$3(bVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000120\u0010\u0002\u001a,\u0012\u0004\u0012\u00020\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.c$c */
    public static final class C10261c<T> implements AbstractC1178x<ArrayList<MoreItemGroup>> {

        /* renamed from: a */
        final /* synthetic */ MoreAdapterOuter f27735a;

        C10261c(MoreAdapterOuter bVar) {
            this.f27735a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<MoreItemGroup> arrayList) {
            if (arrayList != null) {
                this.f27735a.mo39213a(arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(MoreViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…oreViewModel::class.java)");
        this.f27731e = (MoreViewModel) a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.view2.c$b */
    public static final class C10260b<T> implements AbstractC1178x<IMoreInfo> {

        /* renamed from: a */
        final /* synthetic */ MoreFragmentV2 f27733a;

        /* renamed from: b */
        final /* synthetic */ MoreAdapterOuter f27734b;

        C10260b(MoreFragmentV2 cVar, MoreAdapterOuter bVar) {
            this.f27733a = cVar;
            this.f27734b = bVar;
        }

        /* renamed from: a */
        public final void onChanged(IMoreInfo dVar) {
            String str;
            int i;
            this.f27733a.f27730c = dVar;
            this.f27734b.mo39211a();
            this.f27734b.notifyDataSetChanged();
            MoreFragmentV2 cVar = this.f27733a;
            if (dVar != null) {
                str = dVar.mo39041h();
            } else {
                str = null;
            }
            if (dVar != null) {
                i = dVar.mo39036e();
            } else {
                i = 0;
            }
            cVar.mo39243a(str, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m42811j();
        m42812k();
    }

    /* renamed from: a */
    public final void mo39243a(String str, int i) {
        if (str != null) {
            Window window = null;
            IWatermarkManager aVar = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
            if (v_() != null) {
                Dialog v_ = v_();
                if (v_ == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v_, "dialog!!");
                window = v_.getWindow();
            }
            if (window != null && (window.getDecorView() instanceof FrameLayout)) {
                Dialog v_2 = v_();
                if (v_2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v_2, "dialog!!");
                Window window2 = v_2.getWindow();
                if (window2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(window2, "dialog!!.window!!");
                View decorView = window2.getDecorView();
                if (decorView != null) {
                    aVar.mo40653b((FrameLayout) decorView);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
            }
            aVar.mo40649a(str, String.valueOf(i));
            aVar.mo40651a(str, String.valueOf(i), v_());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.more_layout_v2, viewGroup, false);
    }
}
