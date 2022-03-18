package com.bytedance.ee.bear.sheet.filter;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.bytedance.ee.bear.sheet.filter.FilterPanelColorView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002J \u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0016J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020'H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/SubFilterColorFragment;", "Lcom/bytedance/ee/bear/sheet/filter/BaseSubFilterFragment;", "()V", "backgroundColorView", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView;", "foregroundColorView", "layoutResId", "", "getLayoutResId", "()I", "noneOption", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "noneOptionContainer", "Landroid/widget/LinearLayout;", "noneOptionText", "Landroid/widget/TextView;", "optionList", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "panelName", "", "getPanelName", "()Ljava/lang/String;", "tipsView", "Landroid/view/View;", "hideView", "", "initView", "view", "onKeyboardHeightChanged", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "orientation", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "updatePanelData", "filterSheetItem", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.f */
public final class SubFilterColorFragment extends BaseSubFilterFragment {

    /* renamed from: h */
    public static final Companion f30042h = new Companion(null);

    /* renamed from: e */
    public UDCheckBox f30043e;

    /* renamed from: f */
    public FilterPanelColorView f30044f;

    /* renamed from: g */
    public FilterPanelColorView f30045g;

    /* renamed from: i */
    private LinearLayout f30046i;

    /* renamed from: j */
    private TextView f30047j;

    /* renamed from: k */
    private View f30048k;

    /* renamed from: l */
    private List<FilterData.FilterOptionItem> f30049l = new ArrayList();

    /* renamed from: m */
    private final int f30050m = R.layout.sheet_filter_color_fragment;

    /* renamed from: n */
    private final String f30051n = "filterColor";

    /* renamed from: o */
    private HashMap f30052o;

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: k */
    public void mo42680k() {
        HashMap hashMap = this.f30052o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo42680k();
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fVar, "khp");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/SubFilterColorFragment$Companion;", "", "()V", "BACKGROUND_COLOR", "", "FOREGROUND_COLOR", "NO_COLOR", "NO_COLOR_CONTAINER", "NO_COLOR_TEXT", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: h */
    public int mo42677h() {
        return this.f30050m;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: i */
    public String mo42678i() {
        return this.f30051n;
    }

    /* renamed from: l */
    private final void m46455l() {
        LinearLayout linearLayout = this.f30046i;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noneOptionContainer");
        }
        linearLayout.setVisibility(8);
        FilterPanelColorView filterPanelColorView = this.f30044f;
        if (filterPanelColorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundColorView");
        }
        filterPanelColorView.setVisibility(8);
        FilterPanelColorView filterPanelColorView2 = this.f30045g;
        if (filterPanelColorView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("foregroundColorView");
        }
        filterPanelColorView2.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterColorFragment$initView$1", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$ColorUpdateListener;", "onColorUpdate", "", "color", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$b */
    public static final class C11168b implements FilterPanelColorView.ColorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterColorFragment f30053a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11168b(SubFilterColorFragment fVar) {
            this.f30053a = fVar;
        }

        @Override // com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.ColorUpdateListener
        /* renamed from: a */
        public void mo42646a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "color");
            this.f30053a.mo42670a("backgroundColor", new String[]{str});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterColorFragment$initView$2", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$ColorUpdateListener;", "onColorUpdate", "", "color", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$c */
    public static final class C11169c implements FilterPanelColorView.ColorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterColorFragment f30054a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11169c(SubFilterColorFragment fVar) {
            this.f30054a = fVar;
        }

        @Override // com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.ColorUpdateListener
        /* renamed from: a */
        public void mo42646a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "color");
            this.f30054a.mo42670a("foregroundColor", new String[]{str});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterColorFragment$initView$5", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$OnCheckedChangeListener;", "onCheckedChanged", "", "checked", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$f */
    public static final class C11172f implements FilterPanelColorView.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterColorFragment f30057a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11172f(SubFilterColorFragment fVar) {
            this.f30057a = fVar;
        }

        @Override // com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.OnCheckedChangeListener
        /* renamed from: a */
        public void mo42647a(boolean z) {
            if (z) {
                SubFilterColorFragment.m46451a(this.f30057a).setChecked(false);
                SubFilterColorFragment.m46454c(this.f30057a).setChecked(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterColorFragment$initView$6", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$OnCheckedChangeListener;", "onCheckedChanged", "", "checked", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$g */
    public static final class C11173g implements FilterPanelColorView.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterColorFragment f30058a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11173g(SubFilterColorFragment fVar) {
            this.f30058a = fVar;
        }

        @Override // com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.OnCheckedChangeListener
        /* renamed from: a */
        public void mo42647a(boolean z) {
            if (z) {
                SubFilterColorFragment.m46451a(this.f30058a).setChecked(false);
                SubFilterColorFragment.m46453b(this.f30058a).setChecked(false);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ UDCheckBox m46451a(SubFilterColorFragment fVar) {
        UDCheckBox uDCheckBox = fVar.f30043e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noneOption");
        }
        return uDCheckBox;
    }

    /* renamed from: b */
    public static final /* synthetic */ FilterPanelColorView m46453b(SubFilterColorFragment fVar) {
        FilterPanelColorView filterPanelColorView = fVar.f30044f;
        if (filterPanelColorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundColorView");
        }
        return filterPanelColorView;
    }

    /* renamed from: c */
    public static final /* synthetic */ FilterPanelColorView m46454c(SubFilterColorFragment fVar) {
        FilterPanelColorView filterPanelColorView = fVar.f30045g;
        if (filterPanelColorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("foregroundColorView");
        }
        return filterPanelColorView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$e */
    public static final class View$OnClickListenerC11171e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterColorFragment f30056a;

        View$OnClickListenerC11171e(SubFilterColorFragment fVar) {
            this.f30056a = fVar;
        }

        public final void onClick(View view) {
            if (!SubFilterColorFragment.m46451a(this.f30056a).isChecked()) {
                SubFilterColorFragment.m46451a(this.f30056a).setChecked(true);
                return;
            }
            this.f30056a.mo42670a("noColor", new String[0]);
            SubFilterColorFragment.m46453b(this.f30056a).setChecked(false);
            SubFilterColorFragment.m46454c(this.f30056a).setChecked(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.f$d */
    public static final class View$OnClickListenerC11170d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterColorFragment f30055a;

        View$OnClickListenerC11170d(SubFilterColorFragment fVar) {
            this.f30055a = fVar;
        }

        public final void onClick(View view) {
            SubFilterColorFragment.m46451a(this.f30055a).setChecked(!SubFilterColorFragment.m46451a(this.f30055a).isChecked());
            if (!SubFilterColorFragment.m46451a(this.f30055a).isChecked()) {
                SubFilterColorFragment.m46451a(this.f30055a).setChecked(true);
                return;
            }
            this.f30055a.mo42670a("noColor", new String[0]);
            SubFilterColorFragment.m46453b(this.f30055a).setChecked(false);
            SubFilterColorFragment.m46454c(this.f30055a).setChecked(false);
        }
    }

    /* renamed from: a */
    private final void m46452a(View view) {
        View findViewWithTag = view.findViewWithTag("noColorContainer");
        Intrinsics.checkExpressionValueIsNotNull(findViewWithTag, "view.findViewWithTag(NO_COLOR_CONTAINER)");
        this.f30046i = (LinearLayout) findViewWithTag;
        View findViewWithTag2 = view.findViewWithTag("noColor");
        Intrinsics.checkExpressionValueIsNotNull(findViewWithTag2, "view.findViewWithTag(NO_COLOR)");
        this.f30043e = (UDCheckBox) findViewWithTag2;
        View findViewWithTag3 = view.findViewWithTag("noColorText");
        Intrinsics.checkExpressionValueIsNotNull(findViewWithTag3, "view.findViewWithTag(NO_COLOR_TEXT)");
        this.f30047j = (TextView) findViewWithTag3;
        View findViewWithTag4 = view.findViewWithTag("backgroundColor");
        Intrinsics.checkExpressionValueIsNotNull(findViewWithTag4, "view.findViewWithTag(BACKGROUND_COLOR)");
        this.f30044f = (FilterPanelColorView) findViewWithTag4;
        View findViewWithTag5 = view.findViewWithTag("foregroundColor");
        Intrinsics.checkExpressionValueIsNotNull(findViewWithTag5, "view.findViewWithTag(FOREGROUND_COLOR)");
        this.f30045g = (FilterPanelColorView) findViewWithTag5;
        View findViewById = view.findViewById(R.id.tips);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.tips)");
        this.f30048k = findViewById;
        FilterPanelColorView filterPanelColorView = this.f30044f;
        if (filterPanelColorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundColorView");
        }
        filterPanelColorView.setColorUpdateListener(new C11168b(this));
        FilterPanelColorView filterPanelColorView2 = this.f30045g;
        if (filterPanelColorView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("foregroundColorView");
        }
        filterPanelColorView2.setColorUpdateListener(new C11169c(this));
        LinearLayout linearLayout = this.f30046i;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noneOptionContainer");
        }
        linearLayout.setOnClickListener(new View$OnClickListenerC11170d(this));
        UDCheckBox uDCheckBox = this.f30043e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noneOption");
        }
        uDCheckBox.setOnClickListener(new View$OnClickListenerC11171e(this));
        FilterPanelColorView filterPanelColorView3 = this.f30044f;
        if (filterPanelColorView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundColorView");
        }
        filterPanelColorView3.setOnCheckedChangeListener(new C11172f(this));
        FilterPanelColorView filterPanelColorView4 = this.f30045g;
        if (filterPanelColorView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("foregroundColorView");
        }
        filterPanelColorView4.setOnCheckedChangeListener(new C11173g(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: a */
    public void mo42668a(FilterData.FilterSheetItem filterSheetItem) {
        int i;
        boolean z;
        Intrinsics.checkParameterIsNotNull(filterSheetItem, "filterSheetItem");
        this.f30049l.clear();
        FilterData.FilterOptionItem[] list = filterSheetItem.getList();
        boolean z2 = true;
        if (list != null) {
            if (list.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            FilterData.FilterOptionItem[] list2 = filterSheetItem.getList();
            List l = list2 != null ? C69043h.m265787l(list2) : null;
            if (l != null) {
                this.f30049l = (ArrayList) l;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.bytedance.ee.bear.sheet.filter.FilterData.FilterOptionItem>");
            }
        }
        m46455l();
        View view = this.f30048k;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tipsView");
        }
        if (this.f30049l.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        for (FilterData.FilterOptionItem filterOptionItem : this.f30049l) {
            View view2 = getView();
            View findViewWithTag = view2 != null ? view2.findViewWithTag(filterOptionItem.getId()) : null;
            if (findViewWithTag != null) {
                findViewWithTag.setVisibility(0);
                if (Intrinsics.areEqual(filterOptionItem.getId(), "noColor")) {
                    LinearLayout linearLayout = this.f30046i;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("noneOptionContainer");
                    }
                    linearLayout.setVisibility(0);
                    TextView textView = this.f30047j;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("noneOptionText");
                    }
                    textView.setText(filterOptionItem.getTitle());
                    UDCheckBox uDCheckBox = this.f30043e;
                    if (uDCheckBox == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("noneOption");
                    }
                    uDCheckBox.setChecked(filterOptionItem.isSelect());
                }
                if (findViewWithTag instanceof FilterPanelColorView) {
                    ((FilterPanelColorView) findViewWithTag).mo42638a(filterOptionItem);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m46452a(view);
    }
}
