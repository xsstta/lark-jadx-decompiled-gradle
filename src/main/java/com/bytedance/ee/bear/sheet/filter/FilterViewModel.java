package com.bytedance.ee.bear.sheet.filter;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u0005¢\u0006\u0002\u0010\u0002J=\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u0002H\u00192\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010*\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel;", "Lcom/bytedance/ee/bear/edit/component/document/BaseEditPanelViewModel;", "()V", "delegate", "Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$Delegate;)V", "filterData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/sheet/filter/FilterData;", "getFilterData", "()Landroidx/lifecycle/MutableLiveData;", "filterPageData", "Lcom/bytedance/ee/bear/sheet/filter/FilterPageData;", "getFilterPageData", "filterValueDelegate", "Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$FilterValueDelegate;", "getFilterValueDelegate", "()Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$FilterValueDelegate;", "setFilterValueDelegate", "(Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$FilterValueDelegate;)V", "callback", "", "T", "id", "", "sheetId", "currentCol", "", "value", "isSearch", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Boolean;)V", "clearFilterData", "clearFilterPageData", "getPanelHeight", "context", "Landroid/content/Context;", "getPanelName", "updateFilterData", "updateFilterPageData", "Companion", "Delegate", "FilterValueDelegate", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.e */
public final class FilterViewModel extends AbstractC7593a {
    public static final Companion Companion = new Companion(null);
    private Delegate delegate;
    private final C1177w<FilterData> filterData = new C1177w<>();
    private final C1177w<FilterPageData> filterPageData = new C1177w<>();
    private FilterValueDelegate filterValueDelegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$Delegate;", "", "onFilterCallBack", "", "T", "id", "", "sheetId", "currentCol", "", "value", "isSearch", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Boolean;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.e$b */
    public interface Delegate {
        /* renamed from: a */
        <T> void mo42663a(String str, String str2, int i, T t, Boolean bool);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$FilterValueDelegate;", "", "getFilterValues", "", "current", "", "size", "sheetId", "", "currentCol", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.e$c */
    public interface FilterValueDelegate {
        /* renamed from: a */
        void mo42664a(int i, int i2, String str, int i3);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "filter";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterViewModel$Companion;", "", "()V", "PANEL_NAME", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<FilterData> getFilterData() {
        return this.filterData;
    }

    public final C1177w<FilterPageData> getFilterPageData() {
        return this.filterPageData;
    }

    public final FilterValueDelegate getFilterValueDelegate() {
        return this.filterValueDelegate;
    }

    public final void clearFilterData() {
        this.filterData.mo5929b((FilterData) null);
    }

    public final void clearFilterPageData() {
        this.filterPageData.mo5929b((FilterPageData) null);
    }

    public final void setDelegate(Delegate bVar) {
        this.delegate = bVar;
    }

    public final void setFilterValueDelegate(FilterValueDelegate cVar) {
        this.filterValueDelegate = cVar;
    }

    public final void updateFilterData(FilterData filterData2) {
        Intrinsics.checkParameterIsNotNull(filterData2, "filterData");
        this.filterData.mo5929b(filterData2);
    }

    public final void updateFilterPageData(FilterPageData filterPageData2) {
        Intrinsics.checkParameterIsNotNull(filterPageData2, "filterPageData");
        this.filterPageData.mo5929b(filterPageData2);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getResources().getDimensionPixelSize(R.dimen.sheet_panel_height);
    }

    public final <T> void callback(String str, String str2, int i, T t, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Delegate bVar = this.delegate;
        if (bVar != null) {
            bVar.mo42663a(str, str2, i, t, bool);
        }
    }
}
