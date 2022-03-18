package com.bytedance.ee.bear.sheet.filter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1142af;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.bytedance.ee.bear.sheet.panel.AbstractC11257a;
import com.bytedance.ee.bear.sheet.panel.AbstractC11261b;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11271b;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0014J\u001a\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0014\u0010\u001f\u001a\u00020\u00052\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H\u0002¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterFragment;", "Lcom/bytedance/ee/bear/sheet/panel/BaseCellPanelFragment;", "Lcom/bytedance/ee/bear/sheet/panel/SheetItem;", "()V", "bindView", "", "sheetItem", "getPanelName", "", "getViewModel", "Lcom/bytedance/ee/bear/sheet/panel/BaseCellPanelViewModel;", "onBackPressed", "", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onReceiveEmptyData", "onViewCreated", "view", "openChildFragment", "fragment", "Ljava/lang/Class;", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.c */
public final class FilterFragment extends AbstractC11257a<SheetItem> {

    /* renamed from: a */
    public static final Companion f30027a = new Companion(null);

    /* renamed from: b */
    private HashMap f30028b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo42707a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: c */
    public String mo42711c() {
        return "filter";
    }

    /* renamed from: d */
    public void mo42712d() {
        HashMap hashMap = this.f30028b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterFragment$Companion;", "", "()V", "CANCEL_FILTER_BY_CELL", "", "FILTER", "FILTER_BY_CELL", "FILTER_CLEAR", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo30123c(R.anim.child_fragment_exit);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: b */
    public AbstractC11261b<SheetItem> mo42710b() {
        AbstractC1142af a = C4950k.m20474a(this, C11271b.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…nelViewModel::class.java)");
        return (AbstractC11261b) a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((FilterViewModel) C4950k.m20474a(this, FilterViewModel.class)).clearFilterData();
        super.onDestroyView();
        mo42712d();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo42708a(SheetItem sheetItem) {
        Intrinsics.checkParameterIsNotNull(sheetItem, "sheetItem");
        super.mo42708a(sheetItem);
        View d = mo43171d(sheetItem.getId());
        if (d != null) {
            d.setOnClickListener(new View$OnClickListenerC11165b(this, d, sheetItem));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.c$b */
    static final class View$OnClickListenerC11165b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterFragment f30029a;

        /* renamed from: b */
        final /* synthetic */ View f30030b;

        /* renamed from: c */
        final /* synthetic */ SheetItem f30031c;

        View$OnClickListenerC11165b(FilterFragment cVar, View view, SheetItem sheetItem) {
            this.f30029a = cVar;
            this.f30030b = view;
            this.f30031c = sheetItem;
        }

        public final void onClick(View view) {
            this.f30030b.setSelected(true);
            this.f30029a.mo43166a(this.f30031c.getId(), this.f30031c.getValue());
            if (Intrinsics.areEqual("filterClear", this.f30031c.getId())) {
                this.f30029a.mo30123c(R.anim.child_fragment_exit);
            } else if ((!Intrinsics.areEqual("filterByCell", this.f30031c.getId())) && (!Intrinsics.areEqual("cancelFilterByCell", this.f30031c.getId()))) {
                FilterFragment cVar = this.f30029a;
                String id = this.f30031c.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "sheetItem.id");
                cVar.mo42709a(FilterItemEnum.valueOf(id).getFragment());
            }
        }
    }

    /* renamed from: a */
    public final void mo42709a(Class<?> cls) {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Intrinsics.checkExpressionValueIsNotNull(fragmentManager, "fragmentManager ?: return");
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(cls.getName());
            if (findFragmentByTag == null) {
                Bundle bundle = new Bundle();
                C4943e.m20406a(this, bundle);
                Context context = getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                findFragmentByTag = Fragment.instantiate(context, cls.getName(), bundle);
            }
            Intrinsics.checkExpressionValueIsNotNull(findFragmentByTag, "fm.findFragmentByTag(fra…name, argument)\n        }");
            fragmentManager.beginTransaction().setCustomAnimations(R.anim.child_fragment_enter, R.anim.child_fragment_exit).replace(R.id.filter_panel_container, findFragmentByTag, cls.getName()).commitAllowingStateLoss();
        }
    }

    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo43165a((CharSequence) mo42710b().getPanelTitle("filter"));
        SheetPanelRouter.f29786a.mo42307a(this, getFragmentManager(), Integer.valueOf((int) R.id.filter_panel_container));
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return AnimationUtils.loadAnimation(getContext(), R.anim.child_fragment_enter);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.sheet_filter_fragment, viewGroup, false);
    }
}
