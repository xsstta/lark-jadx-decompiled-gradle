package com.bytedance.ee.bear.bitable.panel;

import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.panel.BitablePanelModel;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.button.ButtonDrawableParams;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\b\u00100\u001a\u00020\u0019H\u0016J\u001a\u00101\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u00102\u001a\u00020\u0019H\u0016J\u0012\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010!H\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelFragment;", "Lcom/bytedance/ee/bear/document/independentpanel/IndependentDialogFragment;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "adapter", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelItemAdapter;", "backPressDispatcher", "Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "bottomFixedButton", "Lcom/larksuite/component/universe_design/button/UDButton;", "bottomViewContainer", "Landroid/view/View;", "dragPanel", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout;", "exitAnimDuration", "", "getExitAnimDuration", "()J", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModel", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelViewModel;", "getMeasuredHeight", "", "initBottomView", "", "rootView", "initDragPanel", "initRecyclerView", "view", "makeFirstActiveItemVisible", "items", "", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "onBackPressed", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "setViewModelInactive", "updateBottomView", "bottomFixedData", "updateData", "model", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel;", "updateDragViewHeight", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.panel.a */
public final class BitablePanelFragment extends IndependentDialogFragment implements AbstractC7666d {

    /* renamed from: e */
    public static final String f14114e = f14114e;

    /* renamed from: f */
    public static final Companion f14115f = new Companion(null);

    /* renamed from: c */
    public BitablePanelViewModel f14116c;

    /* renamed from: d */
    public RecyclerView f14117d;

    /* renamed from: i */
    private CommonActionPanelLayout f14118i;

    /* renamed from: j */
    private BitablePanelItemAdapter f14119j;

    /* renamed from: k */
    private View f14120k;

    /* renamed from: l */
    private UDButton f14121l;

    /* renamed from: m */
    private AbstractC7665c f14122m;

    /* renamed from: n */
    private final long f14123n = 250;

    /* renamed from: o */
    private HashMap f14124o;

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: h */
    public void mo18784h() {
        HashMap hashMap = this.f14124o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/panel/BitablePanelFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo18837a() {
            return BitablePanelFragment.f14114e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: f */
    public long mo18782f() {
        return this.f14123n;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/bitable/panel/BitablePanelFragment$initDragPanel$1", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickLeftIcon", "", "onDragPanelToClose", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$b */
    public static final class C4805b extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ BitablePanelFragment f14125a;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: c */
        public void mo18786c() {
            BitablePanelViewModel dVar = this.f14125a.f14116c;
            if (dVar != null) {
                dVar.onCancel();
            }
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: d */
        public void mo18838d() {
            BitablePanelViewModel dVar = this.f14125a.f14116c;
            if (dVar != null) {
                dVar.onCancel();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4805b(BitablePanelFragment aVar) {
            this.f14125a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$d */
    public static final class RunnableC4807d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BitablePanelFragment f14126a;

        /* renamed from: b */
        final /* synthetic */ int f14127b;

        RunnableC4807d(BitablePanelFragment aVar, int i) {
            this.f14126a = aVar;
            this.f14127b = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f14126a.f14117d;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(this.f14127b);
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    /* renamed from: g */
    public void mo18783g() {
        BitablePanelViewModel dVar = this.f14116c;
        if (dVar != null) {
            dVar.setActive(false);
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        BitablePanelViewModel dVar = this.f14116c;
        if (dVar == null) {
            return true;
        }
        dVar.onCancel();
        return true;
    }

    /* renamed from: j */
    private final int m19871j() {
        CommonActionPanelLayout commonActionPanelLayout = this.f14118i;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.measure(0, 0);
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f14118i;
        if (commonActionPanelLayout2 != null) {
            return commonActionPanelLayout2.getMeasuredHeight();
        }
        return 0;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.document.independentpanel.IndependentDialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC7665c cVar = this.f14122m;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
        mo18784h();
    }

    /* renamed from: i */
    public final void mo18836i() {
        float f;
        float b = (float) C13749l.m55748b();
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        if (configuration == null || 2 != configuration.orientation) {
            f = 0.6f;
        } else {
            f = 0.8f;
        }
        float min = Math.min((float) m19871j(), b * f);
        CommonActionPanelLayout commonActionPanelLayout = this.f14118i;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.mo45436a(BitmapDescriptorFactory.HUE_RED, min, min);
        }
        CommonActionPanelLayout commonActionPanelLayout2 = this.f14118i;
        if (commonActionPanelLayout2 != null) {
            commonActionPanelLayout2.mo45435a(min);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null) {
            window = v_.getWindow();
        } else {
            window = null;
        }
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.gravity = 80;
            attributes.y = C13746i.m55722a(getContext());
            attributes.windowAnimations = R.style.ActionSheetDialogAnimation;
            window.setAttributes(attributes);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            attributes.flags |= 8;
            window.setAttributes(attributes);
            mo5512a(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;", "Lkotlin/ParameterName;", "name", "item", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$c */
    public static final /* synthetic */ class C4806c extends FunctionReference implements Function1<BitablePanelModel.BitablePanelItem, Unit> {
        C4806c(BitablePanelViewModel dVar) {
            super(1, dVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "onClickItem";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(BitablePanelViewModel.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "onClickItem(Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel$BitablePanelItem;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BitablePanelModel.BitablePanelItem bitablePanelItem) {
            invoke(bitablePanelItem);
            return Unit.INSTANCE;
        }

        public final void invoke(BitablePanelModel.BitablePanelItem bitablePanelItem) {
            Intrinsics.checkParameterIsNotNull(bitablePanelItem, "p1");
            ((BitablePanelViewModel) this.receiver).onClickItem(bitablePanelItem);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/panel/BitablePanelFragment$onCreate$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/bitable/panel/BitablePanelModel;", "onChange", "", "model", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$e */
    public static final class C4808e extends AbstractC13687a<BitablePanelModel> {

        /* renamed from: a */
        final /* synthetic */ BitablePanelFragment f14128a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4808e(BitablePanelFragment aVar) {
            this.f14128a = aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(BitablePanelModel bitablePanelModel) {
            if (bitablePanelModel != null) {
                this.f14128a.mo18835a(bitablePanelModel);
                this.f14128a.mo18836i();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/panel/BitablePanelFragment$onViewCreated$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$g */
    public static final class C4810g extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitablePanelFragment f14130a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4810g(BitablePanelFragment aVar) {
            this.f14130a = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            BitablePanelViewModel dVar = this.f14130a.f14116c;
            if (dVar != null) {
                dVar.onCancel();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ButtonDrawableParams;", "invoke", "com/bytedance/ee/bear/bitable/panel/BitablePanelFragment$updateBottomView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$h */
    public static final class C4811h extends Lambda implements Function1<ButtonDrawableParams, Unit> {
        final /* synthetic */ BitablePanelModel.BitablePanelItem $bottomFixedData$inlined;
        final /* synthetic */ BitablePanelFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4811h(BitablePanelFragment aVar, BitablePanelModel.BitablePanelItem bitablePanelItem) {
            super(1);
            this.this$0 = aVar;
            this.$bottomFixedData$inlined = bitablePanelItem;
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
            String text = this.$bottomFixedData$inlined.getText();
            if (text == null) {
                text = "";
            }
            aVar.mo90320a(text);
            aVar.mo90319a(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$i */
    public static final class View$OnClickListenerC4812i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BitablePanelFragment f14131a;

        /* renamed from: b */
        final /* synthetic */ BitablePanelModel.BitablePanelItem f14132b;

        View$OnClickListenerC4812i(BitablePanelFragment aVar, BitablePanelModel.BitablePanelItem bitablePanelItem) {
            this.f14131a = aVar;
            this.f14132b = bitablePanelItem;
        }

        public final void onClick(View view) {
            BitablePanelViewModel dVar = this.f14131a.f14116c;
            if (dVar != null) {
                dVar.onClickItem(this.f14132b);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo18836i();
    }

    /* renamed from: a */
    private final void m19866a(View view) {
        this.f14120k = view.findViewById(R.id.bottom_fix_view_container);
        this.f14121l = (UDButton) view.findViewById(R.id.bottom_fixed_btn);
    }

    /* renamed from: c */
    private final void m19870c(View view) {
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) view.findViewById(R.id.bitable_drag_panel);
        this.f14118i = commonActionPanelLayout;
        if (commonActionPanelLayout != null) {
            commonActionPanelLayout.setOnActionListener(new C4805b(this));
        }
    }

    /* renamed from: a */
    private final void m19868a(List<? extends BitablePanelModel.BitablePanelItem> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((BitablePanelModel.BitablePanelItem) list.get(i)).isActive()) {
                    RecyclerView recyclerView = this.f14117d;
                    if (recyclerView != null) {
                        recyclerView.post(new RunnableC4807d(this, i));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m19869b(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bitable_recycler_view);
        this.f14117d = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        BitablePanelItemAdapter bVar = new BitablePanelItemAdapter();
        this.f14119j = bVar;
        BitablePanelViewModel dVar = this.f14116c;
        if (!(dVar == null || bVar == null)) {
            bVar.mo18849a(new C4806c(dVar));
        }
        RecyclerView recyclerView2 = this.f14117d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f14119j);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        C1177w<BitablePanelModel> panelModel;
        super.onCreate(bundle);
        BitablePanelViewModel dVar = (BitablePanelViewModel) C4950k.m20474a(this, BitablePanelViewModel.class);
        this.f14116c = dVar;
        if (dVar != null && (panelModel = dVar.getPanelModel()) != null) {
            panelModel.mo5923a(this, new C4808e(this));
        }
    }

    /* renamed from: a */
    public final void mo18835a(BitablePanelModel bitablePanelModel) {
        String title = bitablePanelModel.getTitle();
        if (TextUtils.isEmpty(title)) {
            CommonActionPanelLayout commonActionPanelLayout = this.f14118i;
            if (commonActionPanelLayout != null) {
                commonActionPanelLayout.setTitleBarVisible(false);
            }
        } else {
            CommonActionPanelLayout commonActionPanelLayout2 = this.f14118i;
            if (commonActionPanelLayout2 != null) {
                commonActionPanelLayout2.setTitleBarVisible(true);
            }
            CommonActionPanelLayout commonActionPanelLayout3 = this.f14118i;
            if (commonActionPanelLayout3 != null) {
                commonActionPanelLayout3.setTitle(title);
            }
        }
        BitablePanelModel.BitablePanelItem[] data = bitablePanelModel.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "model.data");
        List<? extends BitablePanelModel.BitablePanelItem> a = C69043h.m265716a(data);
        BitablePanelItemAdapter bVar = this.f14119j;
        if (bVar != null) {
            bVar.mo18848a(a);
        }
        m19868a(a);
        m19867a(bitablePanelModel.getBottomFixedData());
    }

    /* renamed from: a */
    private final void m19867a(BitablePanelModel.BitablePanelItem bitablePanelItem) {
        int i;
        int i2;
        if (bitablePanelItem == null) {
            View view = this.f14120k;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f14120k;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        UDButton uDButton = this.f14121l;
        if (uDButton != null) {
            String text = bitablePanelItem.getText();
            if (text == null) {
                text = "";
            }
            uDButton.setText(text);
        }
        EPanelItemIcon ePanelLeftIcon = bitablePanelItem.getEPanelLeftIcon();
        if (ePanelLeftIcon != null) {
            Resources resources = getResources();
            if (bitablePanelItem.isActive()) {
                i = ePanelLeftIcon.activeImageRes;
            } else {
                i = ePanelLeftIcon.inactiveImageRes;
            }
            Drawable drawable = resources.getDrawable(i);
            int a = C13749l.m55740a(getContext(), 20.0f);
            drawable.setBounds(0, 0, a, a);
            Resources resources2 = getResources();
            if (bitablePanelItem.isActive()) {
                i2 = ePanelLeftIcon.activeImageTintRes;
            } else {
                i2 = ePanelLeftIcon.inactiveImageTintRes;
            }
            drawable.setTint(resources2.getColor(i2));
            UDButton uDButton2 = this.f14121l;
            if (uDButton2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
                C25717e.m92488a(uDButton2, drawable, new C4811h(this, bitablePanelItem));
            }
        }
        UDButton uDButton3 = this.f14121l;
        if (uDButton3 != null) {
            uDButton3.setOnClickListener(new View$OnClickListenerC4812i(this, bitablePanelItem));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.bitable_panel_root);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.bitable_panel_root)");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40646a(frameLayout);
        view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC4809f(frameLayout));
        view.setOnClickListener(new C4810g(this));
        m19870c(view);
        m19869b(view);
        m19866a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
        this.f14122m = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
        return layoutInflater.inflate(R.layout.bitable_panel_fragment, viewGroup, false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\n¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.panel.a$f */
    static final class View$OnLayoutChangeListenerC4809f implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f14129a;

        View$OnLayoutChangeListenerC4809f(FrameLayout frameLayout) {
            this.f14129a = frameLayout;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            FrameLayout frameLayout;
            if (i3 != i7 && (frameLayout = this.f14129a) != null) {
                frameLayout.requestLayout();
            }
        }
    }
}
