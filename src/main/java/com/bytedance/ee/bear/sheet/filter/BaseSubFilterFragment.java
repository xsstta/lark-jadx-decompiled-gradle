package com.bytedance.ee.bear.sheet.filter;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.sheet.common.SheetDragView;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 P2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001PB\u0005¢\u0006\u0002\u0010\u0004J#\u0010,\u001a\u00020-\"\u0004\b\u0000\u0010.2\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002H.H\u0004¢\u0006\u0002\u00101J-\u0010,\u001a\u00020-\"\u0004\b\u0000\u0010.2\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002H.2\b\u00102\u001a\u0004\u0018\u000103H\u0004¢\u0006\u0002\u00104J\b\u00105\u001a\u00020-H\u0002J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u0006H\u0014J\b\u00108\u001a\u000203H\u0016J\b\u00109\u001a\u00020-H\u0016J\b\u0010:\u001a\u00020-H\u0016J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J&\u0010>\u001a\u0004\u0018\u00010!2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010C\u001a\u00020-H\u0016J\u001a\u0010D\u001a\u00020-2\u0006\u0010E\u001a\u00020!2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010F\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010HH\u0002J\u0010\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020KH$J\u001a\u0010L\u001a\u00020-2\u0006\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0018H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u0006X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0012\u0010\u0017\u001a\u00020\u0018X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006Q"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/BaseSubFilterFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightObserver;", "Lcom/bytedance/ee/bear/sheet/common/SheetDragView$OnPositionChangeListener;", "()V", "currentCol", "", "getCurrentCol", "()I", "setCurrentCol", "(I)V", "dragView", "Lcom/bytedance/ee/bear/sheet/common/SheetDragView;", "getDragView", "()Lcom/bytedance/ee/bear/sheet/common/SheetDragView;", "setDragView", "(Lcom/bytedance/ee/bear/sheet/common/SheetDragView;)V", "filterCol", "Landroid/widget/TextView;", "filterColNext", "filterColPre", "layoutResId", "getLayoutResId", "panelName", "", "getPanelName", "()Ljava/lang/String;", "sheetId", "getSheetId", "setSheetId", "(Ljava/lang/String;)V", "title", "topView", "Landroid/view/View;", "getTopView", "()Landroid/view/View;", "setTopView", "(Landroid/view/View;)V", "viewModel", "Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel;", "getViewModel", "()Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel;", "setViewModel", "(Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel;)V", "callback", "", "T", "id", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "isSearch", "", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V", "exitFragment", "notifyColRangeChanged", "index", "onBackPressed", "onChangeToMaxPosition", "onChangeToMidPosition", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "updateData", "filterData", "Lcom/bytedance/ee/bear/sheet/filter/FilterData;", "updatePanelData", "filterSheetItem", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "updateTopViews", "filterItem", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterItem;", "curTitle", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.a */
public abstract class BaseSubFilterFragment extends C7667e implements AbstractC10549e, SheetDragView.AbstractC11087c {

    /* renamed from: d */
    public static final Companion f29972d = new Companion(null);

    /* renamed from: a */
    protected FilterViewModel f29973a;

    /* renamed from: b */
    protected SheetDragView f29974b;

    /* renamed from: c */
    protected View f29975c;

    /* renamed from: e */
    private TextView f29976e;

    /* renamed from: f */
    private TextView f29977f;

    /* renamed from: g */
    private TextView f29978g;

    /* renamed from: h */
    private TextView f29979h;

    /* renamed from: i */
    private int f29980i;

    /* renamed from: j */
    private String f29981j;

    /* renamed from: k */
    private HashMap f29982k;

    @Override // com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11087c
    /* renamed from: a */
    public void mo42253a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42668a(FilterData.FilterSheetItem filterSheetItem);

    @Override // com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11087c
    /* renamed from: b */
    public void mo42254b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo42677h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo42678i();

    /* renamed from: k */
    public void mo42680k() {
        HashMap hashMap = this.f29982k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo42680k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/BaseSubFilterFragment$Companion;", "", "()V", "COL_RANGE", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo42675f() {
        return this.f29980i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo42676g() {
        return this.f29981j;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo42679j();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final FilterViewModel mo42672c() {
        FilterViewModel eVar = this.f29973a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final SheetDragView mo42673d() {
        SheetDragView sheetDragView = this.f29974b;
        if (sheetDragView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        return sheetDragView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo42674e() {
        View view = this.f29975c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topView");
        }
        return view;
    }

    /* renamed from: j */
    public final void mo42679j() {
        C10548d.m43696a(getContext());
        FilterViewModel eVar = this.f29973a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.clearFilterPageData();
        mo30123c(R.anim.child_fragment_exit);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AbstractC10550f.AbstractC10551a.m43717b(activity).mo39928b(this);
            FilterViewModel eVar = this.f29973a;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            }
            eVar.clearFilterPageData();
            super.onDestroy();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.a$b */
    public static final class View$OnClickListenerC11153b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSubFilterFragment f29983a;

        View$OnClickListenerC11153b(BaseSubFilterFragment aVar) {
            this.f29983a = aVar;
        }

        public final void onClick(View view) {
            this.f29983a.mo42679j();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/sheet/filter/FilterData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.a$c */
    public static final class C11154c<T> implements AbstractC1178x<FilterData> {

        /* renamed from: a */
        final /* synthetic */ BaseSubFilterFragment f29984a;

        C11154c(BaseSubFilterFragment aVar) {
            this.f29984a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(FilterData filterData) {
            this.f29984a.mo42669a(filterData);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.a$d */
    public static final class View$OnClickListenerC11155d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSubFilterFragment f29985a;

        /* renamed from: b */
        final /* synthetic */ int f29986b;

        View$OnClickListenerC11155d(BaseSubFilterFragment aVar, int i) {
            this.f29985a = aVar;
            this.f29986b = i;
        }

        public final void onClick(View view) {
            this.f29985a.mo42667a(this.f29986b - 1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.a$e */
    public static final class View$OnClickListenerC11156e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseSubFilterFragment f29987a;

        /* renamed from: b */
        final /* synthetic */ int f29988b;

        View$OnClickListenerC11156e(BaseSubFilterFragment aVar, int i) {
            this.f29987a = aVar;
            this.f29988b = i;
        }

        public final void onClick(View view) {
            this.f29987a.mo42667a(this.f29988b + 1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42667a(int i) {
        mo42670a("colRange", Integer.valueOf(i));
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, FilterViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…terViewModel::class.java)");
        this.f29973a = (FilterViewModel) a;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AbstractC10550f.AbstractC10551a.m43717b(activity).mo39924a(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* renamed from: a */
    public final void mo42669a(FilterData filterData) {
        FilterData.FilterItem data;
        int i;
        if (!(filterData == null || (data = filterData.getData()) == null)) {
            FilterData.ColRange colRange = data.getColRange();
            if (colRange != null) {
                i = colRange.getIndex();
            } else {
                i = 0;
            }
            this.f29980i = i;
            this.f29981j = data.getSheetId();
            FilterData.FilterSheetItem[] items = data.getItems();
            if (items == null) {
                items = new FilterData.FilterSheetItem[0];
            }
            for (FilterData.FilterSheetItem filterSheetItem : items) {
                if (Intrinsics.areEqual(filterSheetItem.getId(), mo42678i())) {
                    m46401a(data, filterSheetItem.getTitle());
                    mo42668a(filterSheetItem);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo42670a(String str, T t) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        mo42671a(str, t, null);
    }

    /* renamed from: a */
    private final void m46401a(FilterData.FilterItem filterItem, String str) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        TextView textView = this.f29976e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        textView.setText(str);
        TextView textView2 = this.f29977f;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterCol");
        }
        textView2.setText(filterItem.getTitle());
        FilterData.ColRange colRange = filterItem.getColRange();
        boolean z4 = false;
        if (colRange != null) {
            i = colRange.getIndex();
        } else {
            i = 0;
        }
        FilterData.ColRange colRange2 = filterItem.getColRange();
        if (colRange2 != null) {
            i2 = colRange2.getTotal();
        } else {
            i2 = 0;
        }
        TextView textView3 = this.f29978g;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterColPre");
        }
        if (i != 1) {
            z = true;
        } else {
            z = false;
        }
        textView3.setEnabled(z);
        TextView textView4 = this.f29978g;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterColPre");
        }
        if (i != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        textView4.setClickable(z2);
        TextView textView5 = this.f29979h;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterColNext");
        }
        if (i != i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        textView5.setEnabled(z3);
        TextView textView6 = this.f29979h;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterColNext");
        }
        if (i != i2) {
            z4 = true;
        }
        textView6.setClickable(z4);
        TextView textView7 = this.f29978g;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterColPre");
        }
        textView7.setOnClickListener(new View$OnClickListenerC11155d(this, i));
        TextView textView8 = this.f29979h;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterColNext");
        }
        textView8.setOnClickListener(new View$OnClickListenerC11156e(this, i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.title_bar_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title_bar_layout)");
        View findViewById2 = findViewById.findViewById(R.id.back_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "titleBarLayout.findViewById(R.id.back_icon)");
        findViewById2.setOnClickListener(new View$OnClickListenerC11153b(this));
        View findViewById3 = view.getRootView().findViewById(R.id.fab_dragview);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.rootView.findViewById(R.id.fab_dragview)");
        SheetDragView sheetDragView = (SheetDragView) findViewById3;
        this.f29974b = sheetDragView;
        if (sheetDragView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        sheetDragView.setOnPositionChangeListener(this);
        SheetDragView sheetDragView2 = this.f29974b;
        if (sheetDragView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dragView");
        }
        sheetDragView2.setSlideView(findViewById);
        View findViewById4 = view.findViewById(R.id.sheet_filter_subfragment_top_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.s…r_subfragment_top_layout)");
        this.f29975c = findViewById4;
        View findViewById5 = findViewById.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "titleBarLayout.findViewById(R.id.title)");
        TextView textView = (TextView) findViewById5;
        this.f29976e = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "title.paint");
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        TextView textView2 = this.f29976e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        TextPaint paint2 = textView2.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint2, "title.paint");
        paint2.setStrokeWidth(1.0f);
        View findViewById6 = view.findViewById(R.id.sheet_filter_col);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.sheet_filter_col)");
        this.f29977f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.sheet_filter_col_pre);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.sheet_filter_col_pre)");
        this.f29978g = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.sheet_filter_col_next);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "view.findViewById(R.id.sheet_filter_col_next)");
        this.f29979h = (TextView) findViewById8;
        FilterViewModel eVar = this.f29973a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.getFilterData().mo5923a(this, new C11154c(this));
        SheetPanelRouter.f29786a.mo42307a(this, getFragmentManager(), Integer.valueOf((int) R.id.filter_panel_container));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(mo42677h(), viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final <T> void mo42671a(String str, T t, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        FilterViewModel eVar = this.f29973a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        eVar.callback(str, this.f29981j, this.f29980i, t, bool);
    }
}
