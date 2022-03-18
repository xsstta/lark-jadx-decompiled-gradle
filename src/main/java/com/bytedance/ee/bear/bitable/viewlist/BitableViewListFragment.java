package com.bytedance.ee.bear.bitable.viewlist;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1142af;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u001a\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\"\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "adapter", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListAdapter;", "dragView", "Landroid/view/View;", "dragViewUtil", "Lcom/bytedance/ee/bear/facade/common/widget/helper/DragView;", "mid", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "root", "Landroid/widget/FrameLayout;", "viewModel", "Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListViewModel;", "initDragView", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onViewCreated", "view", "updateDragViewHeight", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.viewlist.b */
public final class BitableViewListFragment extends DialogInterface$OnCancelListenerC1021b {

    /* renamed from: f */
    public static final String f14258f;

    /* renamed from: g */
    public static final Companion f14259g = new Companion(null);

    /* renamed from: c */
    public BitableViewListViewModel f14260c;

    /* renamed from: d */
    public BitableViewListAdapter f14261d;

    /* renamed from: e */
    public FrameLayout f14262e;

    /* renamed from: h */
    private C7728a f14263h;

    /* renamed from: i */
    private RecyclerView f14264i;

    /* renamed from: j */
    private View f14265j;

    /* renamed from: k */
    private float f14266k;

    /* renamed from: l */
    private HashMap f14267l;

    /* renamed from: g */
    public void mo19017g() {
        HashMap hashMap = this.f14267l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo19018a() {
            return BitableViewListFragment.f14258f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment$onViewCreated$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$g */
    public static final class C4858g extends AbstractView$OnClickListenerC11839e {
        C4858g() {
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            C13479a.m54772d(BitableViewListFragment.f14259g.mo19018a(), "Empty space is clicked.");
        }
    }

    static {
        String simpleName = BitableViewListFragment.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "BitableViewListFragment::class.java.simpleName");
        f14258f = simpleName;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BitableViewListViewModel cVar = this.f14260c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar.exitView();
        BitableViewListViewModel cVar2 = this.f14260c;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar2.setActive(false);
        mo19017g();
    }

    /* renamed from: f */
    public final void mo19016f() {
        View view = this.f14265j;
        int i = 0;
        if (view != null) {
            view.measure(0, 0);
        }
        View view2 = this.f14265j;
        if (view2 != null) {
            i = view2.getMeasuredHeight();
        }
        float min = Math.min((float) i, this.f14266k);
        C7728a aVar = this.f14263h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewUtil");
        }
        aVar.mo30249a(min);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        WindowManager.LayoutParams layoutParams = null;
        if (v_ != null) {
            window = v_.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.gravity = 80;
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.ActionSheetWindowStyle;
        }
        if (layoutParams != null) {
            layoutParams.y = C13746i.m55722a(getContext());
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: h */
    private final void m20013h() {
        View view;
        View view2;
        View view3 = getView();
        View view4 = null;
        if (view3 != null) {
            view = view3.findViewById(R.id.bitable_handler_view);
        } else {
            view = null;
        }
        if (view != null) {
            view.setOnClickListener(new C4853b(this));
        }
        View view5 = getView();
        if (view5 != null) {
            view2 = view5.findViewById(R.id.bitable_drag_view);
        } else {
            view2 = null;
        }
        this.f14265j = view2;
        this.f14266k = getResources().getDimension(R.dimen.bitable_view_list_height);
        C7728a aVar = new C7728a(getContext(), this.f14265j, BitmapDescriptorFactory.HUE_RED, this.f14266k, ((float) C13749l.m55748b()) * 0.85f);
        this.f14263h = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewUtil");
        }
        aVar.mo30252a(view);
        C7728a aVar2 = this.f14263h;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewUtil");
        }
        View view6 = getView();
        if (view6 != null) {
            view4 = view6.findViewById(R.id.title_bar);
        }
        aVar2.mo30252a(view4);
        C7728a aVar3 = this.f14263h;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewUtil");
        }
        aVar3.mo30253a(new C4854c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment$initDragView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$b */
    public static final class C4853b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableViewListFragment f14268a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4853b(BitableViewListFragment bVar) {
            this.f14268a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            BitableViewListFragment.m20011b(this.f14268a).setActive(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment$onCreate$1", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewList;", "onChange", "", "value", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$d */
    public static final class C4855d extends AbstractC13687a<BiTableViewList> {

        /* renamed from: a */
        final /* synthetic */ BitableViewListFragment f14270a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4855d(BitableViewListFragment bVar) {
            this.f14270a = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(BiTableViewList biTableViewList) {
            if (biTableViewList != null) {
                BitableViewListAdapter a = BitableViewListFragment.m20010a(this.f14270a);
                List<BiTableViewItem> views = biTableViewList.getViews();
                if (views == null) {
                    views = CollectionsKt.emptyList();
                }
                a.mo19013a(views);
                this.f14270a.mo19016f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment$onCreate$2", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/bitable/viewlist/BiTableViewItem;", "", "invoke", "viewItem", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$e */
    public static final class C4856e implements Function1<BiTableViewItem, Unit> {

        /* renamed from: a */
        final /* synthetic */ BitableViewListFragment f14271a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4856e(BitableViewListFragment bVar) {
            this.f14271a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(BiTableViewItem biTableViewItem) {
            mo19020a(biTableViewItem);
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public void mo19020a(BiTableViewItem biTableViewItem) {
            String str;
            BitableViewListViewModel b = BitableViewListFragment.m20011b(this.f14271a);
            if (biTableViewItem == null || (str = biTableViewItem.getId()) == null) {
                str = "";
            }
            b.switchView(str);
            BitableViewListFragment.m20011b(this.f14271a).setActive(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/bitable/viewlist/BitableViewListFragment$onViewCreated$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$f */
    public static final class C4857f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ BitableViewListFragment f14272a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C4857f(BitableViewListFragment bVar) {
            this.f14272a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            BitableViewListFragment.m20011b(this.f14272a).setActive(false);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ BitableViewListAdapter m20010a(BitableViewListFragment bVar) {
        BitableViewListAdapter aVar = bVar.f14261d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ BitableViewListViewModel m20011b(BitableViewListFragment bVar) {
        BitableViewListViewModel cVar = bVar.f14260c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return cVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ FrameLayout m20012c(BitableViewListFragment bVar) {
        FrameLayout frameLayout = bVar.f14262e;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onHeightChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.viewlist.b$c */
    public static final class C4854c implements C7728a.AbstractC7730a {

        /* renamed from: a */
        final /* synthetic */ BitableViewListFragment f14269a;

        C4854c(BitableViewListFragment bVar) {
            this.f14269a = bVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
        public final void onHeightChange(int i) {
            BitableViewListFragment.m20012c(this.f14269a).getLayoutParams().height = i;
            if (i == 0) {
                BitableViewListFragment.m20011b(this.f14269a).setActive(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        float b = ((float) C13749l.m55748b()) * 0.85f;
        C7728a aVar = this.f14263h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragViewUtil");
        }
        aVar.mo30250a(BitmapDescriptorFactory.HUE_RED, this.f14266k, b);
        mo19016f();
        IWatermarkManager aVar2 = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        FrameLayout frameLayout = this.f14262e;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        aVar2.mo40653b(frameLayout);
        IWatermarkManager aVar3 = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        FrameLayout frameLayout2 = this.f14262e;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        aVar3.mo40646a(frameLayout2);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, BitableViewListViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…istViewModel::class.java)");
        BitableViewListViewModel cVar = (BitableViewListViewModel) a;
        this.f14260c = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        cVar.getViewList().mo5923a(this, new C4855d(this));
        BitableViewListAdapter aVar = new BitableViewListAdapter();
        this.f14261d = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        aVar.mo19014a(new C4856e(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.bitable_view_list_root);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.bitable_view_list_root)");
        this.f14262e = (FrameLayout) findViewById;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bitable_view_list);
        this.f14264i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.f14264i;
        if (recyclerView2 != null) {
            BitableViewListAdapter aVar = this.f14261d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            recyclerView2.setAdapter(aVar);
        }
        view.setOnClickListener(new C4857f(this));
        FrameLayout frameLayout = this.f14262e;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        frameLayout.setOnClickListener(new C4858g());
        m20013h();
        IWatermarkManager aVar2 = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
        FrameLayout frameLayout2 = this.f14262e;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        }
        aVar2.mo40646a(frameLayout2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bitable_view_list_fragment, viewGroup, false);
    }
}
