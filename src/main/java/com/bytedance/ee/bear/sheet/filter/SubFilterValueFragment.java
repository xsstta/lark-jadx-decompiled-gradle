package com.bytedance.ee.bear.sheet.filter;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.bytedance.ee.bear.sheet.filter.FilterValueAdapter;
import com.bytedance.ee.bear.sheet.filter.FilterViewModel;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.util.p712o.C13710a;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fH\u0002J\b\u0010.\u001a\u00020,H\u0002J\b\u0010/\u001a\u00020,H\u0002J\b\u00100\u001a\u00020,H\u0002J#\u00101\u001a\u00020,\"\u0004\b\u0000\u001022\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u0002H2H\u0002¢\u0006\u0002\u00105J\u0010\u00106\u001a\u00020,2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u00107\u001a\u00020,H\u0002J\b\u00108\u001a\u00020\fH\u0016J\b\u00109\u001a\u00020,H\u0016J\b\u0010:\u001a\u00020,H\u0016J\u0012\u0010;\u001a\u00020,2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u00020,H\u0016J \u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0016J\b\u0010D\u001a\u00020,H\u0016J\u001a\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0018\u0010G\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010H\u001a\u00020\fH\u0002J\u0010\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u00020\fH\u0002J\u0010\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020,2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010O\u001a\u00020,2\u0006\u0010L\u001a\u00020MH\u0014J\b\u0010P\u001a\u00020,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u000e¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/SubFilterValueFragment;", "Lcom/bytedance/ee/bear/sheet/filter/BaseSubFilterFragment;", "Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$OnSelectedChangeListener;", "()V", "current", "", "debounceUtil", "Lcom/bytedance/ee/util/rx/DebounceFlowableWrapper;", "", "filterValueAdapter", "Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter;", "isConductSearch", "", "isEnterSearchLayout", "isSelectAllBeforeSearch", "keyWord", "lastCurrentCol", "layoutResId", "getLayoutResId", "()I", "panelName", "getPanelName", "()Ljava/lang/String;", "recyclerView", "Lcom/bytedance/ee/bear/widgets/BaseRecyclerView;", "searchBox", "Landroid/view/View;", "searchClearIcon", "searchEditText", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEditText;", "searchIcon", "selectAllCheckBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "selectAllLayout", "sheetAnalytic", "Lcom/bytedance/ee/bear/sheet/common/SheetAnalytic;", "textWatcher", "Landroid/text/TextWatcher;", "valueCount", "Landroid/widget/TextView;", "valueList", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "changeSearchLayout", "", "isSearch", "filterAllItems", "filterNothing", "filterSelectedItems", "filterValue", "T", "id", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "loadMoreData", "notifyAllDataUpdated", "onBackPressed", "onChangeToMaxPosition", "onChangeToMidPosition", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onKeyboardHeightChanged", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "keyboardHeight", "orientation", "onSelectItem", "onViewCreated", "view", "searchKeyWord", "isScrollToTop", "selectAllOrNot", "checked", "updateCurList", "filterSheetItem", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "updateCurView", "updatePanelData", "updateSelectAllCheckBox", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.h */
public final class SubFilterValueFragment extends BaseSubFilterFragment implements FilterValueAdapter.OnSelectedChangeListener {

    /* renamed from: o */
    public static final Companion f30076o = new Companion(null);

    /* renamed from: A */
    private HashMap f30077A;

    /* renamed from: e */
    public UDCheckBox f30078e;

    /* renamed from: f */
    public SpaceEditText f30079f;

    /* renamed from: g */
    public View f30080g;

    /* renamed from: h */
    public FilterValueAdapter f30081h;

    /* renamed from: i */
    public List<FilterData.FilterOptionItem> f30082i = new ArrayList();

    /* renamed from: j */
    public boolean f30083j;

    /* renamed from: k */
    public boolean f30084k;

    /* renamed from: l */
    public int f30085l = -1;

    /* renamed from: m */
    public int f30086m = -1;

    /* renamed from: n */
    public C11088a f30087n;

    /* renamed from: p */
    private View f30088p;

    /* renamed from: q */
    private View f30089q;

    /* renamed from: r */
    private View f30090r;

    /* renamed from: s */
    private TextView f30091s;

    /* renamed from: t */
    private BaseRecyclerView f30092t;

    /* renamed from: u */
    private String f30093u;

    /* renamed from: v */
    private TextWatcher f30094v;

    /* renamed from: w */
    private boolean f30095w;

    /* renamed from: x */
    private final int f30096x = R.layout.sheet_filter_value_fragment;

    /* renamed from: y */
    private final String f30097y = "filterValue";

    /* renamed from: z */
    private C13710a<String> f30098z;

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: k */
    public void mo42680k() {
        HashMap hashMap = this.f30077A;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/SubFilterValueFragment$Companion;", "", "()V", "PAGE_DATA_SIZE", "", "TAG", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$a */
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
        return this.f30096x;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: i */
    public String mo42678i() {
        return this.f30097y;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$l */
    public static final class RunnableC11185l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30109a;

        RunnableC11185l(SubFilterValueFragment hVar) {
            this.f30109a = hVar;
        }

        public final void run() {
            SubFilterValueFragment hVar = this.f30109a;
            hVar.mo42741b(hVar.f30085l);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterValueFragment$changeSearchLayout$1", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "onClickLeftIcon", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$b */
    public static final class C11175b extends CommonActionPanelLayout.SimpleActionListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30099a;

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
        /* renamed from: d */
        public void mo18838d() {
            this.f30099a.mo42740a(false);
            C10548d.m43696a(this.f30099a.getContext());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11175b(SubFilterValueFragment hVar) {
            this.f30099a = hVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$c */
    public static final class RunnableC11176c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30100a;

        RunnableC11176c(SubFilterValueFragment hVar) {
            this.f30100a = hVar;
        }

        public final void run() {
            FilterValueAdapter dVar = this.f30100a.f30081h;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: q */
    private final void m46482q() {
        m46478b("filterValue", new int[]{-1});
    }

    /* renamed from: r */
    private final void m46483r() {
        m46478b("filterValue", new int[0]);
    }

    @Override // com.bytedance.ee.bear.sheet.filter.FilterValueAdapter.OnSelectedChangeListener
    public void L_() {
        C13710a<String> aVar = this.f30098z;
        if (aVar != null) {
            aVar.mo50679a("");
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public void onDestroyView() {
        C13710a<String> aVar = this.f30098z;
        if (aVar != null) {
            aVar.mo50678a();
        }
        super.onDestroyView();
        mo42680k();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public boolean onBackPressed() {
        boolean z = this.f30095w;
        if (z) {
            mo42740a(false);
            return true;
        } else if (!z) {
            return super.onBackPressed();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment, com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11087c
    /* renamed from: a */
    public void mo42253a() {
        super.mo42253a();
        View view = this.f30088p;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBox");
        }
        if (view.getVisibility() == 0) {
            mo42740a(false);
            View view2 = this.f30088p;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBox");
            }
            view2.setVisibility(8);
            View view3 = this.f30089q;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchIcon");
            }
            view3.setVisibility(0);
            C10548d.m43696a(getContext());
        }
    }

    /* renamed from: l */
    public final void mo42743l() {
        boolean z;
        String str = this.f30093u;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            SpaceEditText spaceEditText = this.f30079f;
            if (spaceEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
            }
            mo42739a(String.valueOf(spaceEditText.getText()), false);
        }
        BaseRecyclerView baseRecyclerView = this.f30092t;
        if (baseRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView.post(new RunnableC11176c(this));
    }

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment, com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11087c
    /* renamed from: b */
    public void mo42254b() {
        super.mo42254b();
        View view = this.f30088p;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBox");
        }
        if (view.getVisibility() == 8) {
            View view2 = this.f30088p;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBox");
            }
            view2.setVisibility(0);
            View view3 = this.f30089q;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchIcon");
            }
            view3.setVisibility(8);
        }
    }

    /* renamed from: p */
    public final void mo42745p() {
        boolean z;
        boolean z2;
        int size = this.f30082i.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            if (this.f30082i.get(i).isVisible()) {
                i2++;
                if (!this.f30082i.get(i).isSelect()) {
                    z = false;
                    break;
                }
            }
            i++;
        }
        if (i2 == 0 || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        UDCheckBox uDCheckBox = this.f30078e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
        }
        if (!uDCheckBox.isChecked() || z2) {
            UDCheckBox uDCheckBox2 = this.f30078e;
            if (uDCheckBox2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
            }
            if (!uDCheckBox2.isChecked() && z2) {
                UDCheckBox uDCheckBox3 = this.f30078e;
                if (uDCheckBox3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
                }
                uDCheckBox3.setChecked(true);
            }
        } else {
            UDCheckBox uDCheckBox4 = this.f30078e;
            if (uDCheckBox4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
            }
            uDCheckBox4.setChecked(false);
        }
        if (!this.f30083j) {
            UDCheckBox uDCheckBox5 = this.f30078e;
            if (uDCheckBox5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
            }
            this.f30084k = uDCheckBox5.isChecked();
        }
    }

    /* renamed from: o */
    public final void mo42744o() {
        ArrayList arrayList = new ArrayList();
        if (!this.f30083j || !this.f30084k) {
            int size = this.f30082i.size();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                if (this.f30082i.get(i).isSelect()) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    z = false;
                }
            }
            if (z) {
                m46482q();
                return;
            }
        } else {
            int size2 = this.f30082i.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (this.f30082i.get(i2).isVisible() && this.f30082i.get(i2).isSelect()) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        if (array != null) {
            m46478b("filterValue", array);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterValueFragment$onCreate$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$d */
    public static final class C11177d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30101a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11177d(SubFilterValueFragment hVar) {
            this.f30101a = hVar;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            Intrinsics.checkParameterIsNotNull(editable, "s");
            if (this.f30101a.f30086m == this.f30101a.mo42675f()) {
                this.f30101a.mo42739a(editable.toString(), true);
                boolean isEmpty = TextUtils.isEmpty(editable.toString());
                this.f30101a.f30083j = !isEmpty;
                View a = SubFilterValueFragment.m46475a(this.f30101a);
                if (isEmpty) {
                    i = 8;
                } else {
                    i = 0;
                }
                a.setVisibility(i);
                return;
            }
            SubFilterValueFragment hVar = this.f30101a;
            hVar.f30086m = hVar.mo42675f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterValueFragment$onViewCreated$9", "Lcom/bytedance/ee/util/rx/DebounceFlowableWrapper$OnSubscribeDelegate;", "", "onSubscribe", "", "value", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$k */
    public static final class C11184k implements C13710a.AbstractC13714a<String> {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30108a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11184k(SubFilterValueFragment hVar) {
            this.f30108a = hVar;
        }

        /* renamed from: a */
        public void onSubscribe(String str) {
            this.f30108a.mo42744o();
            this.f30108a.mo42745p();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$f */
    static final class View$OnClickListenerC11179f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30103a;

        View$OnClickListenerC11179f(SubFilterValueFragment hVar) {
            this.f30103a = hVar;
        }

        public final void onClick(View view) {
            SubFilterValueFragment.m46481d(this.f30103a).performClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$h */
    static final class View$OnClickListenerC11181h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30105a;

        View$OnClickListenerC11181h(SubFilterValueFragment hVar) {
            this.f30105a = hVar;
        }

        public final void onClick(View view) {
            SubFilterValueFragment.m46476b(this.f30105a).setText("");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m46475a(SubFilterValueFragment hVar) {
        View view = hVar.f30080g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchClearIcon");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ SpaceEditText m46476b(SubFilterValueFragment hVar) {
        SpaceEditText spaceEditText = hVar.f30079f;
        if (spaceEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
        }
        return spaceEditText;
    }

    /* renamed from: c */
    public static final /* synthetic */ C11088a m46479c(SubFilterValueFragment hVar) {
        C11088a aVar = hVar.f30087n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetAnalytic");
        }
        return aVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ UDCheckBox m46481d(SubFilterValueFragment hVar) {
        UDCheckBox uDCheckBox = hVar.f30078e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
        }
        return uDCheckBox;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$g */
    static final class View$OnClickListenerC11180g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30104a;

        View$OnClickListenerC11180g(SubFilterValueFragment hVar) {
            this.f30104a = hVar;
        }

        public final void onClick(View view) {
            boolean isChecked = SubFilterValueFragment.m46481d(this.f30104a).isChecked();
            this.f30104a.mo42742b(isChecked);
            if (!this.f30104a.f30083j) {
                this.f30104a.f30084k = isChecked;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$e */
    static final class View$OnClickListenerC11178e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30102a;

        View$OnClickListenerC11178e(SubFilterValueFragment hVar) {
            this.f30102a = hVar;
        }

        public final void onClick(View view) {
            this.f30102a.mo42740a(true);
            this.f30102a.mo42673d().mo17963a();
            SubFilterValueFragment.m46476b(this.f30102a).requestFocus();
            C10548d.m43702b(this.f30102a.getContext());
            SubFilterValueFragment.m46479c(this.f30102a).mo42304y();
        }
    }

    /* renamed from: b */
    private final void m46477b(FilterData.FilterSheetItem filterSheetItem) {
        View view = this.f30090r;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectAllLayout");
        }
        view.setVisibility(0);
        UDCheckBox uDCheckBox = this.f30078e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
        }
        uDCheckBox.setChecked(filterSheetItem.isSelectAll());
        this.f30084k = filterSheetItem.isSelectAll();
        if (!this.f30083j) {
            TextView textView = this.f30091s;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueCount");
            }
            textView.setText(String.valueOf(filterSheetItem.getTotal()));
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30094v = new C11177d(this);
        this.f30087n = new C11088a();
        AbstractC1142af a = C4950k.m20474a(this, DocViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…DocViewModel::class.java)");
        DocViewModel docViewModel = (DocViewModel) a;
        C11088a aVar = this.f30087n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sheetAnalytic");
        }
        aVar.mo42260a(docViewModel.getBearUrl());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "filterPageData", "Lcom/bytedance/ee/bear/sheet/filter/FilterPageData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$j */
    static final class C11183j<T> implements AbstractC1178x<FilterPageData> {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30107a;

        C11183j(SubFilterValueFragment hVar) {
            this.f30107a = hVar;
        }

        /* renamed from: a */
        public final void onChanged(FilterPageData filterPageData) {
            int i;
            List list;
            if (filterPageData != null) {
                this.f30107a.f30085l = filterPageData.getCurrent();
                FilterData.FilterOptionItem[] list2 = filterPageData.getList();
                if (list2 != null) {
                    i = list2.length;
                } else {
                    i = 0;
                }
                if (Intrinsics.areEqual(filterPageData.getSheetId(), this.f30107a.mo42676g()) && filterPageData.getCurrentCol() == this.f30107a.mo42675f() && (this.f30107a.f30082i.size() + i) - 1 == this.f30107a.f30085l) {
                    List<FilterData.FilterOptionItem> list3 = this.f30107a.f30082i;
                    FilterData.FilterOptionItem[] list4 = filterPageData.getList();
                    if (list4 != null) {
                        list = C69043h.m265787l(list4);
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        list3.addAll((ArrayList) list);
                        if (filterPageData.getHasNext()) {
                            SubFilterValueFragment hVar = this.f30107a;
                            hVar.mo42741b(hVar.f30085l);
                            return;
                        }
                        this.f30107a.mo42743l();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.bytedance.ee.bear.sheet.filter.FilterData.FilterOptionItem>");
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 != false) goto L_0x0015;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m46480c(com.bytedance.ee.bear.sheet.filter.FilterData.FilterSheetItem r4) {
        /*
            r3 = this;
            java.util.List<com.bytedance.ee.bear.sheet.filter.FilterData$FilterOptionItem> r0 = r3.f30082i
            r0.clear()
            com.bytedance.ee.bear.sheet.filter.FilterData$FilterOptionItem[] r0 = r4.getList()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            int r0 = r0.length
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            if (r1 != 0) goto L_0x0038
            java.util.List<com.bytedance.ee.bear.sheet.filter.FilterData$FilterOptionItem> r0 = r3.f30082i
            com.bytedance.ee.bear.sheet.filter.FilterData$FilterOptionItem[] r1 = r4.getList()
            if (r1 == 0) goto L_0x0025
            java.util.List r1 = kotlin.collections.C69043h.m265787l(r1)
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            if (r1 == 0) goto L_0x0030
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            goto L_0x0038
        L_0x0030:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.bytedance.ee.bear.sheet.filter.FilterData.FilterOptionItem>"
            r4.<init>(r0)
            throw r4
        L_0x0038:
            int r0 = r4.getCurrent()
            r3.f30085l = r0
            boolean r4 = r4.getHasNext()
            if (r4 == 0) goto L_0x0054
            android.view.View r4 = r3.getView()
            if (r4 == 0) goto L_0x0054
            com.bytedance.ee.bear.sheet.filter.h$l r0 = new com.bytedance.ee.bear.sheet.filter.h$l
            r0.<init>(r3)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r4.post(r0)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.filter.SubFilterValueFragment.m46480c(com.bytedance.ee.bear.sheet.filter.FilterData$FilterSheetItem):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: a */
    public void mo42668a(FilterData.FilterSheetItem filterSheetItem) {
        Intrinsics.checkParameterIsNotNull(filterSheetItem, "filterSheetItem");
        m46477b(filterSheetItem);
        m46480c(filterSheetItem);
        if (this.f30086m != mo42675f()) {
            this.f30093u = null;
            SpaceEditText spaceEditText = this.f30079f;
            if (spaceEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
            }
            spaceEditText.setText("");
            FilterValueAdapter dVar = this.f30081h;
            if (dVar != null) {
                dVar.mo42718a(this.f30082i);
            }
            FilterValueAdapter dVar2 = this.f30081h;
            if (dVar2 != null) {
                dVar2.notifyDataSetChanged();
            }
            BaseRecyclerView baseRecyclerView = this.f30092t;
            if (baseRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            baseRecyclerView.smoothScrollToPosition(0);
        } else if (!filterSheetItem.getHasNext()) {
            mo42743l();
        }
    }

    /* renamed from: b */
    public final void mo42741b(int i) {
        FilterViewModel.FilterValueDelegate filterValueDelegate = mo42672c().getFilterValueDelegate();
        if (filterValueDelegate != null) {
            filterValueDelegate.mo42664a(i, 2000, mo42676g(), mo42675f());
        }
    }

    /* renamed from: a */
    public final void mo42740a(boolean z) {
        int i;
        this.f30095w = z;
        View e = mo42674e();
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        e.setVisibility(i);
        View dragHandler = mo42673d().getDragHandler();
        if (!z) {
            i2 = 0;
        }
        dragHandler.setVisibility(i2);
        mo42673d().setTitleBarVisible(z);
        if (z) {
            mo42673d().setTitle(getString(R.string.Doc_Facade_Search));
            mo42673d().setDividerVisible(false);
            mo42673d().setOnActionListener(new C11175b(this));
        }
    }

    /* renamed from: b */
    public final void mo42742b(boolean z) {
        for (FilterData.FilterOptionItem filterOptionItem : this.f30082i) {
            if (filterOptionItem.isVisible()) {
                filterOptionItem.setSelect(z);
            }
        }
        FilterValueAdapter dVar = this.f30081h;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        if (this.f30083j) {
            mo42744o();
        } else if (z) {
            m46482q();
        } else {
            m46483r();
        }
    }

    /* renamed from: b */
    private final <T> void m46478b(String str, T t) {
        mo42671a(str, t, Boolean.valueOf(this.f30083j));
    }

    /* renamed from: a */
    public final void mo42739a(String str, boolean z) {
        this.f30093u = str;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (FilterData.FilterOptionItem filterOptionItem : this.f30082i) {
            String value = filterOptionItem.getValue();
            if (value != null) {
                if (StringsKt.contains((CharSequence) value, (CharSequence) str, true)) {
                    filterOptionItem.setVisible(true);
                    i += filterOptionItem.getCount();
                    arrayList.add(filterOptionItem);
                } else {
                    filterOptionItem.setVisible(false);
                }
            }
        }
        FilterValueAdapter dVar = this.f30081h;
        if (dVar != null) {
            dVar.mo42718a(arrayList);
        }
        FilterValueAdapter dVar2 = this.f30081h;
        if (dVar2 != null) {
            dVar2.notifyDataSetChanged();
        }
        if (z) {
            BaseRecyclerView baseRecyclerView = this.f30092t;
            if (baseRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            baseRecyclerView.smoothScrollToPosition(0);
        }
        TextView textView = this.f30091s;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueCount");
        }
        textView.setText(String.valueOf(i));
        mo42745p();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.value_list_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.value_list_recycler_view)");
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) findViewById;
        this.f30092t = baseRecyclerView;
        if (baseRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView.setLayoutManager(new SubFilterValueFragment$onViewCreated$1(this, getActivity()));
        FilterValueAdapter dVar = new FilterValueAdapter(this.f30082i);
        dVar.mo42716a(this);
        BaseRecyclerView baseRecyclerView2 = this.f30092t;
        if (baseRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView2.setAdapter(dVar);
        this.f30081h = dVar;
        View findViewById2 = view.findViewById(R.id.filter_value_total_count);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.filter_value_total_count)");
        this.f30091s = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.sheet_filter_search_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.sheet_filter_search_layout)");
        this.f30088p = findViewById3;
        View findViewById4 = view.findViewById(R.id.search);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.search)");
        this.f30089q = findViewById4;
        if (findViewById4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchIcon");
        }
        findViewById4.setOnClickListener(new View$OnClickListenerC11178e(this));
        View findViewById5 = view.findViewById(R.id.select_all_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.select_all_layout)");
        this.f30090r = findViewById5;
        View findViewById6 = view.findViewById(R.id.select_all_check_box);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.select_all_check_box)");
        this.f30078e = (UDCheckBox) findViewById6;
        View view2 = this.f30090r;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectAllLayout");
        }
        view2.setOnClickListener(new View$OnClickListenerC11179f(this));
        UDCheckBox uDCheckBox = this.f30078e;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectAllCheckBox");
        }
        uDCheckBox.setOnClickListener(new View$OnClickListenerC11180g(this));
        View findViewById7 = view.findViewById(R.id.search_clear_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.search_clear_icon)");
        this.f30080g = findViewById7;
        if (findViewById7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchClearIcon");
        }
        findViewById7.setOnClickListener(new View$OnClickListenerC11181h(this));
        View findViewById8 = view.findViewById(R.id.search_et);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "view.findViewById(R.id.search_et)");
        SpaceEditText spaceEditText = (SpaceEditText) findViewById8;
        this.f30079f = spaceEditText;
        if (spaceEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
        }
        spaceEditText.addTextChangedListener(this.f30094v);
        SpaceEditText spaceEditText2 = this.f30079f;
        if (spaceEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEditText");
        }
        spaceEditText2.setOnEditorActionListener(new C11182i(this));
        mo42672c().getFilterPageData().mo5923a(this, new C11183j(this));
        if (mo42673d().mo42245c()) {
            View view3 = this.f30088p;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBox");
            }
            view3.setVisibility(0);
            View view4 = this.f30089q;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchIcon");
            }
            view4.setVisibility(8);
        }
        this.f30098z = new C13710a<>(200, new C11184k(this));
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fVar, "khp");
        if (i > 0) {
            mo42740a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.h$i */
    static final class C11182i implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ SubFilterValueFragment f30106a;

        C11182i(SubFilterValueFragment hVar) {
            this.f30106a = hVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return true;
            }
            this.f30106a.mo42673d().mo42244b();
            SubFilterValueFragment.m46479c(this.f30106a).mo42305z();
            return true;
        }
    }
}
