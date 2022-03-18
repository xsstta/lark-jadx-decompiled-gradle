package com.bytedance.ee.bear.sheet.filter;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0005()*+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ#\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u001c\u0010\"\u001a\u00020\u00162\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$BaseViewHolder;", "context", "Landroid/content/Context;", "valueList", "", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "(Landroid/content/Context;Ljava/util/List;)V", "filterActionListener", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$OnFilterActionListener;", "getFilterActionListener", "()Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$OnFilterActionListener;", "setFilterActionListener", "(Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$OnFilterActionListener;)V", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "clickEditorAction", "", "position", "value", "", "", "(I[Ljava/lang/String;)V", "getItemCount", "getItemViewType", "notifyKeyboardClosed", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "observeSelectedPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BaseViewHolder", "Companion", "OnFilterActionListener", "RangeViewHolder", "SingleViewHolder", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.filter.b */
public final class FilterConditionAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    /* renamed from: b */
    public static final Companion f29989b = new Companion(null);

    /* renamed from: a */
    public final Context f29990a;

    /* renamed from: c */
    private int f29991c = -1;

    /* renamed from: d */
    private OnFilterActionListener f29992d;

    /* renamed from: e */
    private final List<FilterData.FilterOptionItem> f29993e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J%\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$OnFilterActionListener;", "", "onEditorActionListener", "", "onFilterConditionListener", "id", "", "value", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$c */
    public interface OnFilterActionListener {
        void K_();

        /* renamed from: a */
        void mo42696a(String str, String[] strArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;Landroid/view/View;)V", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "setCheckBox", "(Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;)V", "checkBoxContainer", "Landroid/widget/LinearLayout;", "getCheckBoxContainer", "()Landroid/widget/LinearLayout;", "setCheckBoxContainer", "(Landroid/widget/LinearLayout;)V", "checkBoxText", "Landroid/widget/TextView;", "getCheckBoxText", "()Landroid/widget/TextView;", "setCheckBoxText", "(Landroid/widget/TextView;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$a */
    public class BaseViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FilterConditionAdapter f29994a;

        /* renamed from: b */
        private LinearLayout f29995b;

        /* renamed from: c */
        private UDCheckBox f29996c;

        /* renamed from: d */
        private TextView f29997d;

        /* renamed from: a */
        public final LinearLayout mo42692a() {
            return this.f29995b;
        }

        /* renamed from: b */
        public final UDCheckBox mo42693b() {
            return this.f29996c;
        }

        /* renamed from: c */
        public final TextView mo42694c() {
            return this.f29997d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(FilterConditionAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f29994a = bVar;
            View findViewById = view.findViewById(R.id.filter_value_check_box_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.…alue_check_box_container)");
            this.f29995b = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.filter_value_check_box);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.filter_value_check_box)");
            this.f29996c = (UDCheckBox) findViewById2;
            View findViewById3 = view.findViewById(R.id.filter_value_check_box_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.…ter_value_check_box_text)");
            this.f29997d = (TextView) findViewById3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$Companion;", "", "()V", "NONE_VIEW_TYPE", "", "NO_CONDITION", "", "RANGE_VIEW_TYPE", "SINGLE_VIEW_TYPE", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$RangeViewHolder;", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$BaseViewHolder;", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;Landroid/view/View;)V", "rangeInputView", "getRangeInputView", "()Landroid/view/View;", "setRangeInputView", "(Landroid/view/View;)V", "rangeTextLeft", "Landroid/widget/TextView;", "getRangeTextLeft", "()Landroid/widget/TextView;", "setRangeTextLeft", "(Landroid/widget/TextView;)V", "rangeTextRight", "getRangeTextRight", "setRangeTextRight", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$d */
    public final class RangeViewHolder extends BaseViewHolder {

        /* renamed from: b */
        final /* synthetic */ FilterConditionAdapter f29998b;

        /* renamed from: c */
        private View f29999c;

        /* renamed from: d */
        private TextView f30000d;

        /* renamed from: e */
        private TextView f30001e;

        /* renamed from: d */
        public final View mo42697d() {
            return this.f29999c;
        }

        /* renamed from: e */
        public final TextView mo42698e() {
            return this.f30000d;
        }

        /* renamed from: f */
        public final TextView mo42699f() {
            return this.f30001e;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RangeViewHolder(FilterConditionAdapter bVar, View view) {
            super(bVar, view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f29998b = bVar;
            View findViewById = view.findViewById(R.id.range_input);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.range_input)");
            this.f29999c = findViewById;
            View findViewById2 = view.findViewById(R.id.range_input_text_left);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.range_input_text_left)");
            this.f30000d = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.range_input_text_right);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.range_input_text_right)");
            this.f30001e = (TextView) findViewById3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$SingleViewHolder;", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$BaseViewHolder;", "Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterConditionAdapter;Landroid/view/View;)V", "singleText", "Landroid/widget/TextView;", "getSingleText", "()Landroid/widget/TextView;", "setSingleText", "(Landroid/widget/TextView;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$e */
    public final class SingleViewHolder extends BaseViewHolder {

        /* renamed from: b */
        final /* synthetic */ FilterConditionAdapter f30002b;

        /* renamed from: c */
        private TextView f30003c;

        /* renamed from: d */
        public final TextView mo42700d() {
            return this.f30003c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SingleViewHolder(FilterConditionAdapter bVar, View view) {
            super(bVar, view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f30002b = bVar;
            View findViewById = view.findViewById(R.id.single_input_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.single_input_text)");
            this.f30003c = (TextView) findViewById;
        }
    }

    /* renamed from: a */
    public final int mo42685a() {
        return this.f29991c;
    }

    /* renamed from: b */
    public final OnFilterActionListener mo42691b() {
        return this.f29992d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f29993e.size();
    }

    /* renamed from: a */
    public final void mo42690a(OnFilterActionListener cVar) {
        this.f29992d = cVar;
    }

    /* renamed from: a */
    public final void mo42687a(int i) {
        int i2 = this.f29991c;
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        this.f29991c = i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$l */
    public static final class View$OnClickListenerC11163l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RangeViewHolder f30025a;

        View$OnClickListenerC11163l(RangeViewHolder dVar) {
            this.f30025a = dVar;
        }

        public final void onClick(View view) {
            if (!this.f30025a.mo42693b().isChecked()) {
                this.f30025a.mo42693b().setChecked(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$m */
    public static final class View$OnClickListenerC11164m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SingleViewHolder f30026a;

        View$OnClickListenerC11164m(SingleViewHolder eVar) {
            this.f30026a = eVar;
        }

        public final void onClick(View view) {
            if (!this.f30026a.mo42693b().isChecked()) {
                this.f30026a.mo42693b().setChecked(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$onBindViewHolder$3$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$k */
    public static final class View$OnClickListenerC11162k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseViewHolder f30021a;

        /* renamed from: b */
        final /* synthetic */ FilterConditionAdapter f30022b;

        /* renamed from: c */
        final /* synthetic */ int f30023c;

        /* renamed from: d */
        final /* synthetic */ FilterData.FilterOptionItem f30024d;

        View$OnClickListenerC11162k(BaseViewHolder aVar, FilterConditionAdapter bVar, int i, FilterData.FilterOptionItem filterOptionItem) {
            this.f30021a = aVar;
            this.f30022b = bVar;
            this.f30023c = i;
            this.f30024d = filterOptionItem;
        }

        public final void onClick(View view) {
            if (!this.f30021a.mo42693b().isChecked()) {
                this.f30021a.mo42693b().setChecked(true);
                this.f30022b.mo42687a(this.f30023c);
                OnFilterActionListener b = this.f30022b.mo42691b();
                if (b != null) {
                    b.mo42696a(this.f30024d.getId(), new String[0]);
                }
                C10548d.m43696a(this.f30022b.f29990a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (Intrinsics.areEqual(this.f29993e.get(i).getId(), "noCondition")) {
            return 0;
        }
        if (Intrinsics.areEqual(this.f29993e.get(i).getType(), "range")) {
            return 1;
        }
        return 2;
    }

    public FilterConditionAdapter(Context context, List<FilterData.FilterOptionItem> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "valueList");
        this.f29990a = context;
        this.f29993e = list;
    }

    /* renamed from: a */
    private final void m46419a(int i, String[] strArr) {
        OnFilterActionListener cVar = this.f29992d;
        if (cVar != null) {
            cVar.mo42696a(this.f29993e.get(i).getId(), strArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$onBindViewHolder$1$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$f */
    public static final class C11157f implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ RangeViewHolder f30004a;

        /* renamed from: b */
        final /* synthetic */ FilterConditionAdapter f30005b;

        /* renamed from: c */
        final /* synthetic */ int f30006c;

        /* renamed from: d */
        final /* synthetic */ FilterData.FilterOptionItem f30007d;

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            int i;
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            View d = this.f30004a.mo42697d();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            d.setVisibility(i);
            if (z) {
                this.f30005b.mo42687a(this.f30006c);
                this.f30004a.mo42698e().requestFocus();
                C10548d.m43703b(this.f30004a.mo42698e());
            }
        }

        C11157f(RangeViewHolder dVar, FilterConditionAdapter bVar, int i, FilterData.FilterOptionItem filterOptionItem) {
            this.f30004a = dVar;
            this.f30005b = bVar;
            this.f30006c = i;
            this.f30007d = filterOptionItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$onBindViewHolder$2$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$i */
    public static final class C11160i implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SingleViewHolder f30014a;

        /* renamed from: b */
        final /* synthetic */ FilterConditionAdapter f30015b;

        /* renamed from: c */
        final /* synthetic */ int f30016c;

        /* renamed from: d */
        final /* synthetic */ FilterData.FilterOptionItem f30017d;

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            int i;
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            TextView d = this.f30014a.mo42700d();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            d.setVisibility(i);
            if (z) {
                this.f30015b.mo42687a(this.f30016c);
                this.f30014a.mo42700d().requestFocus();
                C10548d.m43703b(this.f30014a.mo42700d());
            }
        }

        C11160i(SingleViewHolder eVar, FilterConditionAdapter bVar, int i, FilterData.FilterOptionItem filterOptionItem) {
            this.f30014a = eVar;
            this.f30015b = bVar;
            this.f30016c = i;
            this.f30017d = filterOptionItem;
        }
    }

    /* renamed from: a */
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_filter_condition_range_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ange_item, parent, false)");
            return new RangeViewHolder(this, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_filter_condition_single_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(pare…ngle_item, parent, false)");
            return new BaseViewHolder(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_filter_condition_single_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "LayoutInflater.from(pare…ngle_item, parent, false)");
            return new SingleViewHolder(this, inflate3);
        }
    }

    /* renamed from: a */
    public final void mo42688a(int i, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        if (viewHolder instanceof SingleViewHolder) {
            m46419a(i, new String[]{((SingleViewHolder) viewHolder).mo42700d().getText().toString()});
        } else if (viewHolder instanceof RangeViewHolder) {
            RangeViewHolder dVar = (RangeViewHolder) viewHolder;
            m46419a(i, new String[]{dVar.mo42698e().getText().toString(), dVar.mo42699f().getText().toString()});
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(BaseViewHolder aVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        FilterData.FilterOptionItem filterOptionItem = this.f29993e.get(i);
        if (aVar instanceof RangeViewHolder) {
            RangeViewHolder dVar = (RangeViewHolder) aVar;
            dVar.mo42693b().setOnCheckedChangeListener(new C11157f(dVar, this, i, filterOptionItem));
            dVar.mo42692a().setOnClickListener(new View$OnClickListenerC11163l(dVar));
            String[] conditionValue = filterOptionItem.getConditionValue();
            if (conditionValue != null && conditionValue.length >= 2) {
                dVar.mo42698e().setText(conditionValue[0]);
                dVar.mo42699f().setText(conditionValue[1]);
            }
            dVar.mo42698e().setOnEditorActionListener(new C11158g(this, i, filterOptionItem));
            dVar.mo42699f().setOnEditorActionListener(new C11159h(this, i, filterOptionItem));
        } else if (aVar instanceof SingleViewHolder) {
            SingleViewHolder eVar = (SingleViewHolder) aVar;
            eVar.mo42693b().setOnCheckedChangeListener(new C11160i(eVar, this, i, filterOptionItem));
            eVar.mo42692a().setOnClickListener(new View$OnClickListenerC11164m(eVar));
            String[] conditionValue2 = filterOptionItem.getConditionValue();
            if (conditionValue2 != null) {
                if (conditionValue2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    eVar.mo42700d().setText(conditionValue2[0]);
                }
            }
            eVar.mo42700d().setOnEditorActionListener(new C11161j(this, i, filterOptionItem));
        } else {
            aVar.mo42692a().setOnClickListener(new View$OnClickListenerC11162k(aVar, this, i, filterOptionItem));
        }
        aVar.mo42694c().setText(filterOptionItem.getTitle());
        if (filterOptionItem.isSelect() && this.f29991c == -1) {
            aVar.mo42693b().setChecked(true);
            this.f29991c = i;
        } else if (this.f29991c == i) {
            aVar.mo42693b().setChecked(true);
        } else {
            aVar.mo42693b().setChecked(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction", "com/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$onBindViewHolder$1$4"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$g */
    public static final class C11158g implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ FilterConditionAdapter f30008a;

        /* renamed from: b */
        final /* synthetic */ int f30009b;

        /* renamed from: c */
        final /* synthetic */ FilterData.FilterOptionItem f30010c;

        C11158g(FilterConditionAdapter bVar, int i, FilterData.FilterOptionItem filterOptionItem) {
            this.f30008a = bVar;
            this.f30009b = i;
            this.f30010c = filterOptionItem;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return true;
            }
            C10548d.m43696a(this.f30008a.f29990a);
            OnFilterActionListener b = this.f30008a.mo42691b();
            if (b == null) {
                return true;
            }
            b.K_();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction", "com/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$onBindViewHolder$1$5"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$h */
    public static final class C11159h implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ FilterConditionAdapter f30011a;

        /* renamed from: b */
        final /* synthetic */ int f30012b;

        /* renamed from: c */
        final /* synthetic */ FilterData.FilterOptionItem f30013c;

        C11159h(FilterConditionAdapter bVar, int i, FilterData.FilterOptionItem filterOptionItem) {
            this.f30011a = bVar;
            this.f30012b = i;
            this.f30013c = filterOptionItem;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return true;
            }
            C10548d.m43696a(this.f30011a.f29990a);
            OnFilterActionListener b = this.f30011a.mo42691b();
            if (b == null) {
                return true;
            }
            b.K_();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction", "com/bytedance/ee/bear/sheet/filter/FilterConditionAdapter$onBindViewHolder$2$4"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.b$j */
    public static final class C11161j implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ FilterConditionAdapter f30018a;

        /* renamed from: b */
        final /* synthetic */ int f30019b;

        /* renamed from: c */
        final /* synthetic */ FilterData.FilterOptionItem f30020c;

        C11161j(FilterConditionAdapter bVar, int i, FilterData.FilterOptionItem filterOptionItem) {
            this.f30018a = bVar;
            this.f30019b = i;
            this.f30020c = filterOptionItem;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return true;
            }
            C10548d.m43696a(this.f30018a.f29990a);
            OnFilterActionListener b = this.f30018a.mo42691b();
            if (b == null) {
                return true;
            }
            b.K_();
            return true;
        }
    }
}
