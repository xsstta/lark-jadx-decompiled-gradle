package com.bytedance.ee.bear.bitable.managerpanel;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u001a\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\u0012\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0012\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010/H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelFragment;", "Lcom/bytedance/ee/bear/document/independentpanel/IndependentDialogFragment;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "exitAnimDuration", "", "getExitAnimDuration", "()J", "mAdapter", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelAdapter;", "mBottomFixedButton", "Lcom/larksuite/component/universe_design/button/UDButton;", "mBottomFixedView", "Landroid/view/View;", "mDragPanel", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout;", "mManagerPanelViewModel", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelViewModel;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "initDialogAttr", "", "initViews", "rootView", "initWaterMark", "onBackPressed", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", "view", "setViewModelInactive", "updateBottomFixedBtn", "bottomFixedData", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BottomFixedData;", "updateData", "panelData", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData;", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b */
public final class BitableManagerPanelFragment extends IndependentDialogFragment implements AbstractC7666d {

    /* renamed from: e */
    public static final Companion f14093e = new Companion(null);

    /* renamed from: c */
    public BitableManagerPanelViewModel f14094c;

    /* renamed from: d */
    public RecyclerView f14095d;

    /* renamed from: f */
    private CommonActionPanelLayout f14096f;

    /* renamed from: i */
    private View f14097i;

    /* renamed from: j */
    private UDButton f14098j;

    /* renamed from: k */
    private BitableManagerPanelAdapter f14099k;

    /* renamed from: l */
    private final long f14100l = 300;

    /* renamed from: m */
    private HashMap f14101m;

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: h */
    public void mo18784h() {
        HashMap hashMap = this.f14101m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo18784h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelFragment$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: f */
    public long mo18782f() {
        return this.f14100l;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        m19843i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelFragment$initViews$1", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onDragPanelToClose", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$c */
    public static final class C4796c extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelFragment f14103a;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: c */
        public void mo18786c() {
            OperationCallBack operationCallBack = BitableManagerPanelFragment.m19838a(this.f14103a).getOperationCallBack();
            if (operationCallBack != null) {
                operationCallBack.mo18760a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4796c(BitableManagerPanelFragment bVar) {
            this.f14103a = bVar;
        }
    }

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: g */
    public void mo18783g() {
        BitableManagerPanelViewModel cVar = this.f14094c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        cVar.getActive().mo5929b((Boolean) false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        BitableManagerPanelViewModel cVar = this.f14094c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        OperationCallBack operationCallBack = cVar.getOperationCallBack();
        if (operationCallBack == null) {
            return true;
        }
        operationCallBack.mo18760a();
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelFragment$updateData$1$1$2", "com/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelFragment$$special$$inlined$run$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$h */
    public static final class RunnableC4801h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f14107a;

        /* renamed from: b */
        final /* synthetic */ BitableManagerPanelData f14108b;

        /* renamed from: c */
        final /* synthetic */ BitableManagerPanelFragment f14109c;

        RunnableC4801h(List list, BitableManagerPanelData bitableManagerPanelData, BitableManagerPanelFragment bVar) {
            this.f14107a = list;
            this.f14108b = bitableManagerPanelData;
            this.f14109c = bVar;
        }

        public final void run() {
            List list = this.f14107a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                AbstractC20930c cVar = (AbstractC20930c) obj;
                if ((cVar instanceof BitableManagerPanelData.ViewBean) && ((BitableManagerPanelData.ViewBean) cVar).getActive()) {
                    Context context = BitableManagerPanelFragment.m19841b(this.f14109c).getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "mRecyclerView.context");
                    int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.bitable_manager_panel_item_height);
                    RecyclerView.LayoutManager layoutManager = BitableManagerPanelFragment.m19841b(this.f14109c).getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.scrollToPositionWithOffset(i, dimensionPixelOffset);
                    }
                }
                arrayList.add(Unit.INSTANCE);
                i = i2;
            }
        }
    }

    /* renamed from: i */
    private final void m19843i() {
        Window window;
        Dialog v_ = v_();
        if (!(v_ == null || (window = v_.getWindow()) == null)) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.y = C13746i.m55722a(window.getContext());
            attributes.windowAnimations = R.style.ActionSheetDialogAnimation;
            window.setAttributes(attributes);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog v_2 = v_();
        if (v_2 != null) {
            v_2.setOnDismissListener(new DialogInterface$OnDismissListenerC4795b(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$f */
    static final class C4799f<T> implements AbstractC1178x<BitableManagerPanelData> {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelFragment f14106a;

        C4799f(BitableManagerPanelFragment bVar) {
            this.f14106a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(BitableManagerPanelData bitableManagerPanelData) {
            this.f14106a.mo18781a(bitableManagerPanelData);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$g */
    public static final class C4800g extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        final /* synthetic */ BitableManagerPanelData.BottomFixedData $bottomFixedData;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4800g(BitableManagerPanelData.BottomFixedData bottomFixedData) {
            super(1);
            this.$bottomFixedData = bottomFixedData;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ButtonDrawableParams aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ButtonDrawableParams aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo90320a(this.$bottomFixedData.getText());
            aVar.mo90319a(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$b */
    public static final class DialogInterface$OnDismissListenerC4795b implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelFragment f14102a;

        DialogInterface$OnDismissListenerC4795b(BitableManagerPanelFragment bVar) {
            this.f14102a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            OperationCallBack operationCallBack = BitableManagerPanelFragment.m19838a(this.f14102a).getOperationCallBack();
            if (operationCallBack != null) {
                operationCallBack.mo18760a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$d */
    public static final class View$OnClickListenerC4797d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelFragment f14104a;

        View$OnClickListenerC4797d(BitableManagerPanelFragment bVar) {
            this.f14104a = bVar;
        }

        public final void onClick(View view) {
            OperationCallBack operationCallBack = BitableManagerPanelFragment.m19838a(this.f14104a).getOperationCallBack();
            if (operationCallBack != null) {
                operationCallBack.mo18763b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.b$e */
    public static final class View$OnClickListenerC4798e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitableManagerPanelFragment f14105a;

        View$OnClickListenerC4798e(BitableManagerPanelFragment bVar) {
            this.f14105a = bVar;
        }

        public final void onClick(View view) {
            OperationCallBack operationCallBack = BitableManagerPanelFragment.m19838a(this.f14105a).getOperationCallBack();
            if (operationCallBack != null) {
                operationCallBack.mo18760a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BitableManagerPanelViewModel m19838a(BitableManagerPanelFragment bVar) {
        BitableManagerPanelViewModel cVar = bVar.f14094c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m19841b(BitableManagerPanelFragment bVar) {
        RecyclerView recyclerView = bVar.f14095d;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: b */
    private final void m19842b(View view) {
        View findViewById = view.findViewById(R.id.panel_root);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.panel_root)");
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a((FrameLayout) findViewById);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        CommonActionPanelLayout commonActionPanelLayout = this.f14096f;
        if (commonActionPanelLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragPanel");
        }
        C7728a dragUtil = commonActionPanelLayout.getDragUtil();
        if (dragUtil != null) {
            dragUtil.mo30258d();
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f14096f;
        if (commonActionPanelLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragPanel");
        }
        C7728a dragUtil2 = commonActionPanelLayout2.getDragUtil();
        if (dragUtil2 != null) {
            dragUtil2.mo30259e();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, BitableManagerPanelViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…nelViewModel::class.java)");
        BitableManagerPanelViewModel cVar = (BitableManagerPanelViewModel) a;
        this.f14094c = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        cVar.getPanelData().mo5923a(this, new C4799f(this));
    }

    /* renamed from: a */
    private final void m19840a(BitableManagerPanelData.BottomFixedData bottomFixedData) {
        if (bottomFixedData == null) {
            View view = this.f14097i;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBottomFixedView");
            }
            view.setVisibility(8);
            return;
        }
        View view2 = this.f14097i;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomFixedView");
        }
        view2.setVisibility(0);
        Drawable drawable = getResources().getDrawable(R.drawable.ud_icon_add_outlined);
        int a = C13749l.m55740a(getContext(), 20.0f);
        drawable.setBounds(0, 0, a, a);
        drawable.setTint(getResources().getColor(R.color.icon_n1));
        UDButton uDButton = this.f14098j;
        if (uDButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomFixedButton");
        }
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        C25717e.m92488a(uDButton, drawable, new C4800g(bottomFixedData));
    }

    /* renamed from: a */
    private final void m19839a(View view) {
        View findViewById = view.findViewById(R.id.panel_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.panel_container)");
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) findViewById;
        this.f14096f = commonActionPanelLayout;
        if (commonActionPanelLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragPanel");
        }
        C7728a dragUtil = commonActionPanelLayout.getDragUtil();
        if (dragUtil != null) {
            dragUtil.mo30259e();
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f14096f;
        if (commonActionPanelLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragPanel");
        }
        commonActionPanelLayout2.mo45442c(true);
        CommonActionPanelLayout commonActionPanelLayout3 = this.f14096f;
        if (commonActionPanelLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDragPanel");
        }
        commonActionPanelLayout3.setOnActionListener(new C4796c(this));
        View findViewById2 = view.findViewById(R.id.bottom_fixed_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.bottom_fixed_container)");
        this.f14097i = findViewById2;
        View findViewById3 = view.findViewById(R.id.bottom_fixed_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.bottom_fixed_btn)");
        UDButton uDButton = (UDButton) findViewById3;
        this.f14098j = uDButton;
        if (uDButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomFixedButton");
        }
        uDButton.setOnClickListener(new View$OnClickListenerC4797d(this));
        View findViewById4 = view.findViewById(R.id.recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        this.f14095d = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.f14095d;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        recyclerView2.setItemAnimator(new C1363f());
        BitableManagerPanelViewModel cVar = this.f14094c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        BitableManagerPanelAdapter aVar = new BitableManagerPanelAdapter(null, cVar.getMExpandedTableList());
        this.f14099k = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        RecyclerView recyclerView3 = this.f14095d;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        aVar.mo70667a(recyclerView3);
        BitableManagerPanelAdapter aVar2 = this.f14099k;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        BitableManagerPanelViewModel cVar2 = this.f14094c;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
        }
        aVar2.mo18771a(cVar2.getOperationCallBack());
        view.setOnClickListener(new View$OnClickListenerC4798e(this));
        m19842b(view);
    }

    /* renamed from: a */
    public final void mo18781a(BitableManagerPanelData bitableManagerPanelData) {
        if (bitableManagerPanelData != null) {
            CommonActionPanelLayout commonActionPanelLayout = this.f14096f;
            if (commonActionPanelLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDragPanel");
            }
            commonActionPanelLayout.setTitle(bitableManagerPanelData.getTitle());
            m19840a(bitableManagerPanelData.getBottomFixedData());
            List<AbstractC20930c> convert2MultiItemEntities = bitableManagerPanelData.convert2MultiItemEntities();
            if (convert2MultiItemEntities != null) {
                BitableManagerPanelAdapter aVar = this.f14099k;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                boolean isEmpty = aVar.mo70673b().isEmpty();
                BitableManagerPanelAdapter aVar2 = this.f14099k;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                }
                aVar2.mo18773a((List<? extends AbstractC20930c>) convert2MultiItemEntities);
                if (isEmpty) {
                    Integer activeTableIndex = bitableManagerPanelData.getActiveTableIndex();
                    if (activeTableIndex != null) {
                        int intValue = activeTableIndex.intValue();
                        BitableManagerPanelAdapter aVar3 = this.f14099k;
                        if (aVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        }
                        aVar3.mo70660a(intValue, false);
                    }
                    RecyclerView recyclerView = this.f14095d;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                    }
                    recyclerView.post(new RunnableC4801h(convert2MultiItemEntities, bitableManagerPanelData, this));
                }
                BitableManagerPanelViewModel cVar = this.f14094c;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mManagerPanelViewModel");
                }
                ArrayList<String> mExpandedTableList = cVar.getMExpandedTableList();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mExpandedTableList, 10));
                for (T t : mExpandedTableList) {
                    BitableManagerPanelAdapter aVar4 = this.f14099k;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    }
                    int a = aVar4.mo18769a((String) t);
                    if (a >= 0) {
                        BitableManagerPanelAdapter aVar5 = this.f14099k;
                        if (aVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        }
                        aVar5.mo70660a(a, false);
                    }
                    arrayList.add(Unit.INSTANCE);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m19839a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bitable_manager_panel_fragment, viewGroup, false);
    }
}
