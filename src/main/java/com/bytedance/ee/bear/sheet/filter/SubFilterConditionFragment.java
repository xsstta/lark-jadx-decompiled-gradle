package com.bytedance.ee.bear.sheet.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.sheet.filter.FilterConditionAdapter;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0005H\u0014J\b\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J%\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\u00122\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120'H\u0016¢\u0006\u0002\u0010(J \u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\u001a\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\u001eH\u0002J\u0010\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u000204H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/SubFilterConditionFragment;", "Lcom/bytedance/ee/bear/sheet/filter/BaseSubFilterFragment;", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$OnFilterActionListener;", "()V", "changedCol", "", "filterConditionAdapter", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;", "isColRangeChanged", "", "isKeyboardingShowing", "isMaxHeight", "keyboardHeight", "lastCurrentCol", "layoutResId", "getLayoutResId", "()I", "panelName", "", "getPanelName", "()Ljava/lang/String;", "placeHolder", "Landroid/view/View;", "recyclerView", "Lcom/bytedance/ee/bear/widgets/BaseRecyclerView;", "scrollView", "valueList", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "notifyAdapterKeyboardClosed", "", "notifyColRangeChanged", "index", "onChangeToMaxPosition", "onChangeToMidPosition", "onEditorActionListener", "onFilterConditionListener", "id", "value", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "onKeyboardHeightChanged", "khp", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "orientation", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "scrollPanel", "updatePanelData", "filterSheetItem", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterSheetItem;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.g */
public final class SubFilterConditionFragment extends BaseSubFilterFragment implements FilterConditionAdapter.OnFilterActionListener {

    /* renamed from: e */
    public View f30059e;

    /* renamed from: f */
    public int f30060f;

    /* renamed from: g */
    private View f30061g;

    /* renamed from: h */
    private BaseRecyclerView f30062h;

    /* renamed from: i */
    private FilterConditionAdapter f30063i;

    /* renamed from: j */
    private List<FilterData.FilterOptionItem> f30064j = new ArrayList();

    /* renamed from: k */
    private boolean f30065k;

    /* renamed from: l */
    private boolean f30066l;

    /* renamed from: m */
    private boolean f30067m;

    /* renamed from: n */
    private int f30068n;

    /* renamed from: o */
    private int f30069o = -1;

    /* renamed from: p */
    private final int f30070p = R.layout.sheet_filter_condition_fragment;

    /* renamed from: q */
    private final String f30071q = "filterCondition";

    /* renamed from: r */
    private HashMap f30072r;

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: k */
    public void mo42680k() {
        HashMap hashMap = this.f30072r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo42680k();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: h */
    public int mo42677h() {
        return this.f30070p;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: i */
    public String mo42678i() {
        return this.f30071q;
    }

    @Override // com.bytedance.ee.bear.sheet.filter.FilterConditionAdapter.OnFilterActionListener
    public void K_() {
        mo42673d().mo42244b();
    }

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment, com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11087c
    /* renamed from: b */
    public void mo42254b() {
        super.mo42254b();
        if (this.f30066l) {
            m46465l();
        }
        this.f30065k = true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/bear/sheet/filter/SubFilterConditionFragment$scrollPanel$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.g$a */
    public static final class RunnableC11174a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f30073a;

        /* renamed from: b */
        final /* synthetic */ SubFilterConditionFragment f30074b;

        /* renamed from: c */
        final /* synthetic */ int[] f30075c;

        RunnableC11174a(int i, SubFilterConditionFragment gVar, int[] iArr) {
            this.f30073a = i;
            this.f30074b = gVar;
            this.f30075c = iArr;
        }

        public final void run() {
            SubFilterConditionFragment.m46464a(this.f30074b).scrollBy(0, this.f30074b.f30060f - this.f30073a);
        }
    }

    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment, com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11087c
    /* renamed from: a */
    public void mo42253a() {
        super.mo42253a();
        if (this.f30066l && this.f30065k) {
            C10548d.m43696a(getContext());
        }
        this.f30065k = false;
    }

    /* renamed from: o */
    private final void m46466o() {
        int i;
        FilterConditionAdapter bVar = this.f30063i;
        if (bVar != null) {
            i = bVar.mo42685a();
        } else {
            i = 0;
        }
        BaseRecyclerView baseRecyclerView = this.f30062h;
        if (baseRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        View childAt = baseRecyclerView.getChildAt(i);
        BaseRecyclerView baseRecyclerView2 = this.f30062h;
        if (baseRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        RecyclerView.ViewHolder childViewHolder = baseRecyclerView2.getChildViewHolder(childAt);
        FilterConditionAdapter bVar2 = this.f30063i;
        if (bVar2 != null) {
            Intrinsics.checkExpressionValueIsNotNull(childViewHolder, "viewHolder");
            bVar2.mo42688a(i, childViewHolder);
        }
    }

    /* renamed from: l */
    private final void m46465l() {
        View view;
        int[] iArr = new int[2];
        View view2 = getView();
        if (view2 != null) {
            view = view2.findFocus();
        } else {
            view = null;
        }
        if (view != null) {
            view.getLocationOnScreen(iArr);
            int b = ((C13749l.m55748b() - iArr[1]) - view.getHeight()) - C13749l.m55738a(20);
            if (b < this.f30060f) {
                View view3 = this.f30061g;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("placeHolder");
                }
                view3.setVisibility(0);
                View view4 = this.f30061g;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("placeHolder");
                }
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                layoutParams.height = this.f30060f;
                View view5 = this.f30061g;
                if (view5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("placeHolder");
                }
                view5.setLayoutParams(layoutParams);
                View view6 = this.f30061g;
                if (view6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("placeHolder");
                }
                view6.post(new RunnableC11174a(b, this, iArr));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m46464a(SubFilterConditionFragment gVar) {
        View view = gVar.f30059e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: a */
    public void mo42667a(int i) {
        if (this.f30066l) {
            this.f30067m = true;
            this.f30068n = i;
            C10548d.m43696a(getContext());
            return;
        }
        super.mo42667a(i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    /* renamed from: a */
    public void mo42668a(FilterData.FilterSheetItem filterSheetItem) {
        List list;
        boolean z;
        Intrinsics.checkParameterIsNotNull(filterSheetItem, "filterSheetItem");
        this.f30064j.clear();
        FilterData.FilterOptionItem[] list2 = filterSheetItem.getList();
        boolean z2 = true;
        if (list2 != null) {
            if (list2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            List<FilterData.FilterOptionItem> list3 = this.f30064j;
            FilterData.FilterOptionItem[] list4 = filterSheetItem.getList();
            if (list4 != null) {
                list = C69043h.m265787l(list4);
            } else {
                list = null;
            }
            if (list != null) {
                list3.addAll((ArrayList) list);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.bytedance.ee.bear.sheet.filter.FilterData.FilterOptionItem>");
            }
        }
        Context context = getContext();
        if (context != null) {
            FilterConditionAdapter bVar = new FilterConditionAdapter(context, this.f30064j);
            this.f30063i = bVar;
            if (bVar != null) {
                bVar.mo42690a(this);
            }
            BaseRecyclerView baseRecyclerView = this.f30062h;
            if (baseRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            baseRecyclerView.setAdapter(this.f30063i);
            if (this.f30067m) {
                mo42667a(this.f30068n);
                this.f30067m = false;
            }
            if (this.f30069o != mo42675f()) {
                this.f30069o = mo42675f();
                View view = this.f30059e;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                }
                view.setScrollY(0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }

    @Override // com.bytedance.ee.bear.sheet.filter.FilterConditionAdapter.OnFilterActionListener
    /* renamed from: a */
    public void mo42696a(String str, String[] strArr) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(strArr, "value");
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i];
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        if (str != null && !z) {
            mo42670a(str, (Object) strArr);
        } else if (this.f30067m) {
            mo42667a(this.f30068n);
            this.f30067m = false;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.ee.bear.sheet.filter.BaseSubFilterFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.scroll_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.scroll_view)");
        this.f30059e = findViewById;
        this.f30065k = mo42673d().mo42245c();
        View findViewById2 = view.findViewById(R.id.placeholder);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.placeholder)");
        this.f30061g = findViewById2;
        View findViewById3 = view.findViewById(R.id.value_list_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.value_list_recycler_view)");
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) findViewById3;
        this.f30062h = baseRecyclerView;
        if (baseRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView.setSceneTag("subFilterConditionFragment_rv");
        BaseRecyclerView baseRecyclerView2 = this.f30062h;
        if (baseRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        BaseRecyclerView baseRecyclerView3 = this.f30062h;
        if (baseRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView3.setHasFixedSize(true);
        BaseRecyclerView baseRecyclerView4 = this.f30062h;
        if (baseRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        baseRecyclerView4.setNestedScrollingEnabled(false);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fVar, "khp");
        if (i > 0) {
            this.f30060f = i;
            this.f30066l = true;
            if (this.f30065k) {
                m46465l();
            } else {
                mo42673d().mo17963a();
            }
        } else {
            this.f30066l = false;
            View view = this.f30061g;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("placeHolder");
            }
            view.setVisibility(8);
            m46466o();
        }
    }
}
