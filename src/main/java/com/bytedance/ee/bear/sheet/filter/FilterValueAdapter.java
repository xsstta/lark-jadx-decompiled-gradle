package com.bytedance.ee.bear.sheet.filter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$ViewHolder;", "valueList", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "(Ljava/util/List;)V", "selectedChangeListener", "Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$OnSelectedChangeListener;", "getSelectedChangeListener", "()Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$OnSelectedChangeListener;", "setSelectedChangeListener", "(Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$OnSelectedChangeListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newList", "OnSelectedChangeListener", "ViewHolder", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.d */
public final class FilterValueAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public List<FilterData.FilterOptionItem> f30032a;

    /* renamed from: b */
    private OnSelectedChangeListener f30033b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$OnSelectedChangeListener;", "", "onSelectItem", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.d$a */
    public interface OnSelectedChangeListener {
        void L_();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterValueAdapter;Landroid/view/View;)V", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "countTV", "Landroid/widget/TextView;", "getCountTV", "()Landroid/widget/TextView;", "valueTV", "getValueTV", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.d$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FilterValueAdapter f30034a;

        /* renamed from: b */
        private final TextView f30035b;

        /* renamed from: c */
        private final TextView f30036c;

        /* renamed from: d */
        private final UDCheckBox f30037d;

        /* renamed from: a */
        public final TextView mo42720a() {
            return this.f30035b;
        }

        /* renamed from: b */
        public final TextView mo42721b() {
            return this.f30036c;
        }

        /* renamed from: c */
        public final UDCheckBox mo42722c() {
            return this.f30037d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(FilterValueAdapter dVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f30034a = dVar;
            View findViewById = view.findViewById(R.id.filter_value_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.filter_value_text)");
            this.f30035b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.filter_value_count);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.filter_value_count)");
            this.f30036c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.filter_value_check_box);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.filter_value_check_box)");
            this.f30037d = (UDCheckBox) findViewById3;
        }
    }

    /* renamed from: a */
    public final OnSelectedChangeListener mo42714a() {
        return this.f30033b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30032a.size();
    }

    /* renamed from: a */
    public final void mo42716a(OnSelectedChangeListener aVar) {
        this.f30033b = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.d$d */
    public static final class View$OnClickListenerC11167d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f30041a;

        View$OnClickListenerC11167d(ViewHolder bVar) {
            this.f30041a = bVar;
        }

        public final void onClick(View view) {
            this.f30041a.mo42722c().performClick();
        }
    }

    public FilterValueAdapter(List<FilterData.FilterOptionItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "valueList");
        this.f30032a = list;
    }

    /* renamed from: a */
    public final void mo42718a(List<FilterData.FilterOptionItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "newList");
        this.f30032a = list;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/sheet/filter/FilterValueAdapter$onBindViewHolder$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.d$c */
    public static final class View$OnClickListenerC11166c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ViewHolder f30038a;

        /* renamed from: b */
        final /* synthetic */ FilterValueAdapter f30039b;

        /* renamed from: c */
        final /* synthetic */ int f30040c;

        View$OnClickListenerC11166c(ViewHolder bVar, FilterValueAdapter dVar, int i) {
            this.f30038a = bVar;
            this.f30039b = dVar;
            this.f30040c = i;
        }

        public final void onClick(View view) {
            if (this.f30040c < this.f30039b.f30032a.size()) {
                this.f30039b.f30032a.get(this.f30040c).setSelect(this.f30038a.mo42722c().isChecked());
                OnSelectedChangeListener a = this.f30039b.mo42714a();
                if (a != null) {
                    a.L_();
                }
            }
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_filter_value_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        bVar.itemView.setOnClickListener(new View$OnClickListenerC11167d(bVar));
        bVar.mo42722c().setOnClickListener(new View$OnClickListenerC11166c(bVar, this, i));
        FilterData.FilterOptionItem filterOptionItem = this.f30032a.get(i);
        bVar.mo42720a().setText(filterOptionItem.getValue());
        bVar.mo42721b().setText(String.valueOf(filterOptionItem.getCount()));
        bVar.mo42722c().setChecked(filterOptionItem.isSelect());
    }
}
