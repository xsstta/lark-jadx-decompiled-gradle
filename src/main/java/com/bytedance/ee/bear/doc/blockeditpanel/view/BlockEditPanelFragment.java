package com.bytedance.ee.bear.doc.blockeditpanel.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelViewModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.BlockEditPanelMenusModel;
import com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuPanelId;
import com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5343c;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.C5365a;
import com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.HighlightPanel;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020#H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u00103\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u00106\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0005H\u0002J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u0005H\u0002J\u0012\u0010:\u001a\u00020\u001f2\b\b\u0002\u0010;\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006="}, d2 = {"Lcom/bytedance/ee/bear/doc/blockeditpanel/view/BlockEditPanelFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/doc/blockeditpanel/listener/OnClosePanelListener;", "()V", "dp12", "", "dp14", "dp16", "dp8", "lastHeight", "panelHeights", "Ljava/util/Stack;", "rootView", "Landroid/widget/FrameLayout;", "viewModel", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createEditPanel", "Lcom/bytedance/ee/bear/doc/blockeditpanel/view/panel/BaseBlockEditPanel;", "eMenuPanelId", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/EMenuPanelId;", "createHeightAnimator", "Landroid/animation/ValueAnimator;", "panel", "otherHeight", "getChildPanels", "", "initHighlightObserver", "", "initPanelMenusObserver", "initRootViewHeightListener", "isHighlightPanel", "", "panelId", "", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPanelClosed", "editView", "onPanelStartClose", "editPanel", "onTriangleButtonClick", "onViewCreated", "view", "removePanel", "currentPanelLevel", "resetPanelAnimator", "index", "shrinkBehindPanels", "ignoreTopPanel", "Companion", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a */
public final class BlockEditPanelFragment extends C7667e implements AbstractC5343c {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f15252a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BlockEditPanelFragment.class), "viewModel", "getViewModel()Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;"))};

    /* renamed from: h */
    public static final Companion f15253h = new Companion(null);

    /* renamed from: b */
    public final Stack<Integer> f15254b = new Stack<>();

    /* renamed from: c */
    public FrameLayout f15255c;

    /* renamed from: d */
    public final int f15256d = C13749l.m55738a(16);

    /* renamed from: e */
    public final int f15257e = C13749l.m55738a(14);

    /* renamed from: f */
    public final int f15258f = C13749l.m55738a(8);

    /* renamed from: g */
    public int f15259g;

    /* renamed from: i */
    private final Lazy f15260i = LazyKt.lazy(new C5353h(this));

    /* renamed from: j */
    private final int f15261j = C13749l.m55738a(12);

    /* renamed from: k */
    private HashMap f15262k;

    /* renamed from: a */
    public final BlockEditPanelViewModel mo21433a() {
        Lazy lazy = this.f15260i;
        KProperty kProperty = f15252a[0];
        return (BlockEditPanelViewModel) lazy.getValue();
    }

    /* renamed from: c */
    public void mo21437c() {
        HashMap hashMap = this.f15262k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo21437c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/doc/blockeditpanel/view/BlockEditPanelFragment$Companion;", "", "()V", "ANIM_DURATION", "", "TAG", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/doc/blockeditpanel/BlockEditPanelViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$h */
    static final class C5353h extends Lambda implements Function0<BlockEditPanelViewModel> {
        final /* synthetic */ BlockEditPanelFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5353h(BlockEditPanelFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BlockEditPanelViewModel invoke() {
            return (BlockEditPanelViewModel) C4950k.m20474a(this.this$0, BlockEditPanelViewModel.class);
        }
    }

    /* renamed from: d */
    private final void m21819d() {
        FrameLayout frameLayout = this.f15255c;
        if (frameLayout != null) {
            frameLayout.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC5350e(this));
        }
    }

    /* renamed from: e */
    private final void m21820e() {
        mo21433a().getMenuItems().mo5923a(this, new C5349d(this));
    }

    /* renamed from: f */
    private final void m21821f() {
        mo21433a().getHighlight().mo5923a(this, new C5347c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/blockeditpanel/view/BlockEditPanelFragment$initHighlightObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/document/model/toolbar/selectcolor/impl/Highlight;", "onChanged", "", "highlight", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$c */
    public static final class C5347c implements AbstractC1178x<Highlight> {

        /* renamed from: a */
        final /* synthetic */ BlockEditPanelFragment f15264a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$c$a */
        public static final class RunnableC5348a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C5347c f15265a;

            /* renamed from: b */
            final /* synthetic */ Highlight f15266b;

            RunnableC5348a(C5347c cVar, Highlight highlight) {
                this.f15265a = cVar;
                this.f15266b = highlight;
            }

            public final void run() {
                T t;
                Iterator<T> it = this.f15265a.f15264a.mo21436b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    BlockEditPanelFragment aVar = this.f15265a.f15264a;
                    String panelId = t.getPanelId();
                    Intrinsics.checkExpressionValueIsNotNull(panelId, "it.panelId");
                    if (aVar.mo21435a(panelId)) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.mo21471a(this.f15266b);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5347c(BlockEditPanelFragment aVar) {
            this.f15264a = aVar;
        }

        /* renamed from: a */
        public void onChanged(Highlight highlight) {
            FrameLayout frameLayout;
            List<BlockEditPanelMenusModel.BlockEditPanel> panels;
            BlockEditPanelMenusModel b = this.f15264a.mo21433a().getMenuItems().mo5927b();
            BlockEditPanelMenusModel.BlockEditPanel blockEditPanel = null;
            if (!(b == null || (panels = b.getPanels()) == null)) {
                Iterator<T> it = panels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    T t = next;
                    BlockEditPanelFragment aVar = this.f15264a;
                    Intrinsics.checkExpressionValueIsNotNull(t, "panel");
                    String panelId = t.getPanelId();
                    Intrinsics.checkExpressionValueIsNotNull(panelId, "panel.panelId");
                    if (aVar.mo21435a(panelId)) {
                        blockEditPanel = next;
                        break;
                    }
                }
                blockEditPanel = blockEditPanel;
            }
            if (blockEditPanel != null && (frameLayout = this.f15264a.f15255c) != null) {
                frameLayout.post(new RunnableC5348a(this, highlight));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$f */
    public static final class RunnableC5351f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BlockEditPanelFragment f15269a;

        /* renamed from: b */
        final /* synthetic */ BaseBlockEditPanel f15270b;

        /* renamed from: c */
        final /* synthetic */ int f15271c;

        RunnableC5351f(BlockEditPanelFragment aVar, BaseBlockEditPanel baseBlockEditPanel, int i) {
            this.f15269a = aVar;
            this.f15270b = baseBlockEditPanel;
            this.f15271c = i;
        }

        public final void run() {
            FrameLayout frameLayout = this.f15269a.f15255c;
            if (frameLayout != null) {
                frameLayout.removeView(this.f15270b);
            }
            this.f15269a.mo21433a().onCloseEditPanel(this.f15271c);
            FrameLayout frameLayout2 = this.f15269a.f15255c;
            if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
                this.f15269a.mo21433a().onDestroyEditPanel();
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        FrameLayout frameLayout = this.f15255c;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount() - 1;
            if (childCount > 0) {
                mo21433a().onClickBack(childCount);
                View childAt = frameLayout.getChildAt(childCount);
                if (childAt != null) {
                    m21818b((BaseBlockEditPanel) childAt, childCount);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel");
                }
            } else {
                mo21433a().onCloseEditPanel(0);
                mo21433a().onDestroyEditPanel();
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List<BaseBlockEditPanel> mo21436b() {
        int childCount;
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f15255c;
        if (!(frameLayout == null || frameLayout == null || (childCount = frameLayout.getChildCount()) == 0)) {
            for (int i = 0; i < childCount; i++) {
                View childAt = frameLayout.getChildAt(i);
                if (childAt != null) {
                    arrayList.add((BaseBlockEditPanel) childAt);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel");
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/bear/doc/blockeditpanel/view/BlockEditPanelFragment$shrinkBehindPanels$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$g */
    public static final class RunnableC5352g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BaseBlockEditPanel f15272a;

        /* renamed from: b */
        final /* synthetic */ int f15273b;

        /* renamed from: c */
        final /* synthetic */ BlockEditPanelFragment f15274c;

        /* renamed from: d */
        final /* synthetic */ Ref.IntRef f15275d;

        /* renamed from: e */
        final /* synthetic */ List f15276e;

        RunnableC5352g(BaseBlockEditPanel baseBlockEditPanel, int i, BlockEditPanelFragment aVar, Ref.IntRef intRef, List list) {
            this.f15272a = baseBlockEditPanel;
            this.f15273b = i;
            this.f15274c = aVar;
            this.f15275d = intRef;
            this.f15276e = list;
        }

        public final void run() {
            int measuredWidth = this.f15272a.getMeasuredWidth();
            this.f15272a.animate().setDuration(100).scaleX(((float) (measuredWidth - (((this.f15275d.element - this.f15273b) - 1) * this.f15274c.f15256d))) / ((float) measuredWidth)).setInterpolator(new AccelerateInterpolator()).start();
            if (this.f15273b < this.f15275d.element - 1 && ((BaseBlockEditPanel) this.f15276e.get(this.f15273b + 1)).getHeight() < this.f15272a.getHeight()) {
                this.f15274c.f15254b.push(Integer.valueOf(this.f15272a.getHeight()));
                this.f15274c.mo21432a(this.f15272a, ((BaseBlockEditPanel) this.f15276e.get(this.f15273b + 1)).getHeight()).start();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/blockeditpanel/view/BlockEditPanelFragment$initPanelMenusObserver$1", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/doc/blockeditpanel/model/BlockEditPanelMenusModel;", "onChanged", "", "model", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$d */
    public static final class C5349d implements AbstractC1178x<BlockEditPanelMenusModel> {

        /* renamed from: a */
        final /* synthetic */ BlockEditPanelFragment f15267a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5349d(BlockEditPanelFragment aVar) {
            this.f15267a = aVar;
        }

        /* renamed from: a */
        public void onChanged(BlockEditPanelMenusModel blockEditPanelMenusModel) {
            if (blockEditPanelMenusModel == null || blockEditPanelMenusModel.getPanels() == null || blockEditPanelMenusModel.getPanels().size() == 0) {
                this.f15267a.mo21433a().onDestroyEditPanel();
                return;
            }
            List<BaseBlockEditPanel> b = this.f15267a.mo21436b();
            int size = blockEditPanelMenusModel.getPanels().size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                BlockEditPanelMenusModel.BlockEditPanel blockEditPanel = blockEditPanelMenusModel.getPanels().get(i2);
                if (b.size() <= i2) {
                    break;
                }
                Intrinsics.checkExpressionValueIsNotNull(blockEditPanel, "panelItem");
                if (!TextUtils.equals(blockEditPanel.getPanelId(), b.get(i2).getPanelId())) {
                    break;
                }
                BlockEditPanelFragment aVar = this.f15267a;
                String panelId = blockEditPanel.getPanelId();
                Intrinsics.checkExpressionValueIsNotNull(panelId, "panelItem.panelId");
                if (!aVar.mo21435a(panelId)) {
                    b.get(i2).mo21453a(blockEditPanel);
                }
                i++;
            }
            if (i < b.size()) {
                int size2 = b.size();
                for (int i3 = i; i3 < size2; i3++) {
                    FrameLayout frameLayout = this.f15267a.f15255c;
                    if (frameLayout != null) {
                        frameLayout.removeView(b.get(i3));
                    }
                }
            }
            if (i < size) {
                while (i < size) {
                    BlockEditPanelMenusModel.BlockEditPanel blockEditPanel2 = blockEditPanelMenusModel.getPanels().get(i);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    layoutParams.bottomMargin = this.f15267a.f15257e + (this.f15267a.f15258f * i);
                    BlockEditPanelFragment aVar2 = this.f15267a;
                    Intrinsics.checkExpressionValueIsNotNull(blockEditPanel2, "panelItem");
                    BaseBlockEditPanel a = aVar2.mo21434a(blockEditPanel2.getEMenuPanelId());
                    if (a != null) {
                        a.setPanelId(blockEditPanel2.getPanelId());
                        BlockEditPanelFragment aVar3 = this.f15267a;
                        String panelId2 = blockEditPanel2.getPanelId();
                        Intrinsics.checkExpressionValueIsNotNull(panelId2, "panelItem.panelId");
                        if (!aVar3.mo21435a(panelId2)) {
                            a.mo21453a(blockEditPanel2);
                        } else if (a != null) {
                            ((HighlightPanel) a).mo21471a(this.f15267a.mo21433a().getHighlight().mo5927b());
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.doc.blockeditpanel.view.panel.highlight.HighlightPanel");
                        }
                        FrameLayout frameLayout2 = this.f15267a.f15255c;
                        if (frameLayout2 != null) {
                            frameLayout2.addView(a, layoutParams);
                        }
                    }
                    i++;
                }
            }
            BlockEditPanelFragment.m21816a(this.f15267a, false, 1, null);
        }
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5343c
    /* renamed from: b */
    public void mo21381b(BaseBlockEditPanel baseBlockEditPanel) {
        m21817a(true);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$b */
    public static final class C5346b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BaseBlockEditPanel f15263a;

        C5346b(BaseBlockEditPanel baseBlockEditPanel) {
            this.f15263a = baseBlockEditPanel;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f15263a.getLayoutParams();
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = ((Integer) animatedValue).intValue();
                this.f15263a.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: a */
    private final void m21815a(int i) {
        List<BaseBlockEditPanel> b = mo21436b();
        if (!this.f15254b.isEmpty() && i >= 0) {
            Integer pop = this.f15254b.pop();
            Intrinsics.checkExpressionValueIsNotNull(pop, C14002h.f36692e);
            mo21432a(b.get(i), pop.intValue()).start();
        }
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5343c
    /* renamed from: c */
    public void mo21382c(BaseBlockEditPanel baseBlockEditPanel) {
        FrameLayout frameLayout = this.f15255c;
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount() - 1;
            if (childCount > 0) {
                mo21433a().onClickTriangleButton(childCount);
                View childAt = frameLayout.getChildAt(childCount);
                if (childAt != null) {
                    m21818b((BaseBlockEditPanel) childAt, childCount);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.doc.blockeditpanel.view.panel.BaseBlockEditPanel");
            }
            mo21433a().onCloseEditPanel(0);
            mo21433a().onDestroyEditPanel();
        }
    }

    /* renamed from: a */
    private final void m21817a(boolean z) {
        C13479a.m54758a("BlockEditPanelFragment", "shrinkBehindPanels");
        List<BaseBlockEditPanel> b = mo21436b();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = b.size();
        if (z) {
            intRef.element--;
        }
        if (intRef.element >= 1) {
            int i = 0;
            for (T t : b) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                if (i != intRef.element) {
                    t2.post(new RunnableC5352g(t2, i, this, intRef, b));
                }
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public final BaseBlockEditPanel mo21434a(EMenuPanelId eMenuPanelId) {
        if (eMenuPanelId == null) {
            return null;
        }
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        BaseBlockEditPanel a = C5365a.m21858a(eMenuPanelId, context);
        if (a == null) {
            return null;
        }
        a.setOnCloseListener(this);
        a.setViewModel(mo21433a());
        return a;
    }

    @Override // com.bytedance.ee.bear.doc.blockeditpanel.p293a.AbstractC5343c
    /* renamed from: a */
    public void mo21380a(BaseBlockEditPanel baseBlockEditPanel) {
        C13479a.m54764b("BlockEditPanelFragment", "onClose BlockEditPanelView.");
        int indexOf = CollectionsKt.indexOf((List) mo21436b(), (Object) baseBlockEditPanel);
        if (indexOf != -1) {
            if (indexOf > 0) {
                mo21433a().onPullingDown(indexOf);
            }
            FrameLayout frameLayout = this.f15255c;
            if (frameLayout != null) {
                frameLayout.removeView(baseBlockEditPanel);
            }
            mo21433a().onCloseEditPanel(indexOf);
        }
        FrameLayout frameLayout2 = this.f15255c;
        if (frameLayout2 == null || frameLayout2.getChildCount() != 0) {
            m21816a(this, false, 1, null);
            m21815a(indexOf - 1);
            return;
        }
        mo21433a().onDestroyEditPanel();
    }

    /* renamed from: a */
    public final boolean mo21435a(String str) {
        return TextUtils.equals(str, EMenuPanelId.highlightPanel.name());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f15255c = (FrameLayout) view;
        m21821f();
        m21820e();
        m21819d();
    }

    /* renamed from: b */
    private final void m21818b(BaseBlockEditPanel baseBlockEditPanel, int i) {
        m21817a(true);
        baseBlockEditPanel.animate().translationY(((float) baseBlockEditPanel.getHeight()) / ((float) 4)).alpha(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateInterpolator()).setDuration(200).withEndAction(new RunnableC5351f(this, baseBlockEditPanel, i)).start();
        m21815a(i - 1);
    }

    /* renamed from: a */
    public final ValueAnimator mo21432a(BaseBlockEditPanel baseBlockEditPanel, int i) {
        C13479a.m54772d("BlockEditPanelFragment", "startHeightAnimator " + baseBlockEditPanel.getHeight() + " to " + i);
        ValueAnimator ofInt = ValueAnimator.ofInt(baseBlockEditPanel.getHeight(), i);
        ofInt.addUpdateListener(new C5346b(baseBlockEditPanel));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "va");
        ofInt.setDuration(100L);
        return ofInt;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.doc_block_edit_panel_fragment, viewGroup, false);
    }

    /* renamed from: a */
    static /* synthetic */ void m21816a(BlockEditPanelFragment aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        aVar.m21817a(z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "top", "<anonymous parameter 3>", "bottom", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.view.a$e */
    public static final class View$OnLayoutChangeListenerC5350e implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ BlockEditPanelFragment f15268a;

        View$OnLayoutChangeListenerC5350e(BlockEditPanelFragment aVar) {
            this.f15268a = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4 - i2;
            if (i9 > 0 && i9 != this.f15268a.f15259g) {
                this.f15268a.f15259g = i9;
                this.f15268a.mo21433a().onPanelHeightChanged(i9);
            }
        }
    }
}
