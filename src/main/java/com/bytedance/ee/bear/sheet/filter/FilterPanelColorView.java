package com.bytedance.ee.bear.sheet.filter;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.sheet.filter.FilterData;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0005./012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'H\u0002J\u000e\u0010(\u001a\u00020$2\u0006\u0010&\u001a\u00020'J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u001aH\u0002J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "checkBoxContainer", "checkBoxText", "Landroid/widget/TextView;", "colorAdapter", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter;", "colorRecyclerView", "Lcom/bytedance/ee/bear/widgets/BaseRecyclerView;", "colorUpdateListener", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$ColorUpdateListener;", "getColorUpdateListener", "()Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$ColorUpdateListener;", "setColorUpdateListener", "(Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$ColorUpdateListener;)V", "colorsRange", "", "", "[Ljava/lang/String;", "onCheckedChangeListener", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$OnCheckedChangeListener;", "getOnCheckedChangeListener", "()Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$OnCheckedChangeListener;)V", "selectedColor", "initView", "", "openColorSelection", "checked", "", "setChecked", "updateSelectedColor", "color", "updateView", "item", "Lcom/bytedance/ee/bear/sheet/filter/FilterData$FilterOptionItem;", "ColorUpdateListener", "Companion", "OnCheckedChangeListener", "SelectColorAdapter", "SelectColorDecoration", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FilterPanelColorView extends LinearLayout {

    /* renamed from: c */
    public static final Companion f29942c = new Companion(null);

    /* renamed from: a */
    public UDCheckBox f29943a;

    /* renamed from: b */
    public String f29944b;

    /* renamed from: d */
    private LinearLayout f29945d;

    /* renamed from: e */
    private TextView f29946e;

    /* renamed from: f */
    private String[] f29947f;

    /* renamed from: g */
    private BaseRecyclerView f29948g;

    /* renamed from: h */
    private SelectColorAdapter f29949h;

    /* renamed from: i */
    private ColorUpdateListener f29950i;

    /* renamed from: j */
    private OnCheckedChangeListener f29951j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$ColorUpdateListener;", "", "onColorUpdate", "", "color", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$a */
    public interface ColorUpdateListener {
        /* renamed from: a */
        void mo42646a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$OnCheckedChangeListener;", "", "onCheckedChanged", "", "checked", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$c */
    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void mo42647a(boolean z);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J%\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter$ColorViewHolder;", "()V", "mColorList", "", "", "[Ljava/lang/String;", "mListener", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter$OnSelectColorListener;", "mSelectedColor", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setColorData", "ColorList", "selectedColor", "([Ljava/lang/String;Ljava/lang/String;)V", "setOnSelectColorListener", "listener", "shouldShowLineBorder", "", "context", "Landroid/content/Context;", "itemColor", "ColorViewHolder", "OnSelectColorListener", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$d */
    public static final class SelectColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {

        /* renamed from: a */
        public String[] f29952a;

        /* renamed from: b */
        public OnSelectColorListener f29953b;

        /* renamed from: c */
        private String f29954c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter$OnSelectColorListener;", "", "onColorSelected", "", "color", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$d$b */
        public interface OnSelectColorListener {
            /* renamed from: a */
            void mo42656a(String str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter$ColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter;Landroid/view/View;)V", "innerLayer", "Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "getInnerLayer", "()Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;", "setInnerLayer", "(Lcom/larksuite/component/ui/layout/LKUIRoundableLayout;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "outerLayer", "getOuterLayer", "setOuterLayer", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$d$a */
        public final class ColorViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ SelectColorAdapter f29955a;

            /* renamed from: b */
            private LKUIRoundableLayout f29956b;

            /* renamed from: c */
            private LKUIRoundableLayout f29957c;

            /* renamed from: d */
            private boolean f29958d;

            /* renamed from: a */
            public final LKUIRoundableLayout mo42652a() {
                return this.f29956b;
            }

            /* renamed from: b */
            public final LKUIRoundableLayout mo42654b() {
                return this.f29957c;
            }

            /* renamed from: c */
            public final boolean mo42655c() {
                return this.f29958d;
            }

            /* renamed from: a */
            public final void mo42653a(boolean z) {
                this.f29958d = z;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ColorViewHolder(SelectColorAdapter dVar, View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                this.f29955a = dVar;
                View findViewById = view.findViewById(R.id.outer_layer);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.outer_layer)");
                this.f29956b = (LKUIRoundableLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.inner_layer);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.inner_layer)");
                this.f29957c = (LKUIRoundableLayout) findViewById2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            String[] strArr = this.f29952a;
            if (strArr != null) {
                return strArr.length;
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo42650a(OnSelectColorListener bVar) {
            this.f29953b = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter$onBindViewHolder$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$d$c */
        public static final class C11145c extends AbstractView$OnClickListenerC11839e {

            /* renamed from: a */
            final /* synthetic */ SelectColorAdapter f29959a;

            /* renamed from: b */
            final /* synthetic */ ColorViewHolder f29960b;

            /* renamed from: c */
            final /* synthetic */ String f29961c;

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                String str;
                Intrinsics.checkParameterIsNotNull(view, "v");
                if (!this.f29960b.mo42655c() && (str = this.f29961c) != null) {
                    SelectColorAdapter dVar = this.f29959a;
                    dVar.mo42651a(dVar.f29952a, str);
                    OnSelectColorListener bVar = this.f29959a.f29953b;
                    if (bVar != null) {
                        bVar.mo42656a(str);
                    }
                }
            }

            C11145c(SelectColorAdapter dVar, ColorViewHolder aVar, String str) {
                this.f29959a = dVar;
                this.f29960b = aVar;
                this.f29961c = str;
            }
        }

        /* renamed from: a */
        public final void mo42651a(String[] strArr, String str) {
            this.f29952a = strArr;
            this.f29954c = str;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        private final boolean m46385a(Context context, String str) {
            if (str == null) {
                return false;
            }
            int a = ColorUtils.m55697a(str);
            boolean a2 = ColorUtils.m55701a(context);
            if ((!ColorUtils.m55699a(a) || !a2) && (!ColorUtils.m55702b(a) || a2)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public ColorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sheet_filter_select_color_item, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new ColorViewHolder(this, inflate);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.SelectColorAdapter.ColorViewHolder r7, int r8) {
            /*
            // Method dump skipped, instructions count: 193
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.SelectColorAdapter.onBindViewHolder(com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$d$a, int):void");
        }
    }

    public FilterPanelColorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public FilterPanelColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$Companion;", "", "()V", "SPAN_COUNT", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ColorUpdateListener getColorUpdateListener() {
        return this.f29950i;
    }

    public final OnCheckedChangeListener getOnCheckedChangeListener() {
        return this.f29951j;
    }

    /* renamed from: a */
    private final void m46379a() {
        View findViewById = findViewById(R.id.checkbox_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.checkbox_container)");
        this.f29945d = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.checkbox);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.checkbox)");
        this.f29943a = (UDCheckBox) findViewById2;
        View findViewById3 = findViewById(R.id.checkbox_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.checkbox_text)");
        this.f29946e = (TextView) findViewById3;
        UDCheckBox uDCheckBox = this.f29943a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        uDCheckBox.setOnCheckedChangeListener(new C11146f(this));
        LinearLayout linearLayout = this.f29945d;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxContainer");
        }
        linearLayout.setOnClickListener(new View$OnClickListenerC11147g(this));
        UDCheckBox uDCheckBox2 = this.f29943a;
        if (uDCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        uDCheckBox2.setOnClickListener(new View$OnClickListenerC11148h(this));
        View findViewById4 = findViewById(R.id.color_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.color_recycler_view)");
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) findViewById4;
        this.f29948g = baseRecyclerView;
        if (baseRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorRecyclerView");
        }
        baseRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 7, 1, false));
        BaseRecyclerView baseRecyclerView2 = this.f29948g;
        if (baseRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorRecyclerView");
        }
        baseRecyclerView2.addItemDecoration(new SelectColorDecoration());
        this.f29949h = new SelectColorAdapter();
        BaseRecyclerView baseRecyclerView3 = this.f29948g;
        if (baseRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorRecyclerView");
        }
        SelectColorAdapter dVar = this.f29949h;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorAdapter");
        }
        baseRecyclerView3.setAdapter(dVar);
        SelectColorAdapter dVar2 = this.f29949h;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorAdapter");
        }
        dVar2.mo42650a(new C11149i(this));
    }

    public final void setColorUpdateListener(ColorUpdateListener aVar) {
        this.f29950i = aVar;
    }

    public final void setOnCheckedChangeListener(OnCheckedChangeListener cVar) {
        this.f29951j = cVar;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "(Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$e */
    public final class SelectColorDecoration extends RecyclerView.AbstractC1335d {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SelectColorDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            if (recyclerView.getAdapter() != null) {
                Context context = FilterPanelColorView.this.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_34);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int e = ((C13749l.m55760e(FilterPanelColorView.this.getContext()) - (dimensionPixelSize * 7)) / 7) / 2;
                rect.left = e;
                rect.right = e;
                if (childAdapterPosition < 7) {
                    Context context2 = FilterPanelColorView.this.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                    i = context2.getResources().getDimensionPixelSize(R.dimen.space_kit_len_4);
                } else {
                    i = 0;
                }
                rect.top = i;
                Context context3 = FilterPanelColorView.this.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                rect.bottom = context3.getResources().getDimensionPixelSize(R.dimen.space_kit_len_12);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterPanelColorView$initView$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$f */
    public static final class C11146f implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ FilterPanelColorView f29963a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11146f(FilterPanelColorView filterPanelColorView) {
            this.f29963a = filterPanelColorView;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            this.f29963a.mo42640a(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/sheet/filter/FilterPanelColorView$initView$4", "Lcom/bytedance/ee/bear/sheet/filter/FilterPanelColorView$SelectColorAdapter$OnSelectColorListener;", "onColorSelected", "", "color", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$i */
    public static final class C11149i implements SelectColorAdapter.OnSelectColorListener {

        /* renamed from: a */
        final /* synthetic */ FilterPanelColorView f29966a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11149i(FilterPanelColorView filterPanelColorView) {
            this.f29966a = filterPanelColorView;
        }

        @Override // com.bytedance.ee.bear.sheet.filter.FilterPanelColorView.SelectColorAdapter.OnSelectColorListener
        /* renamed from: a */
        public void mo42656a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "color");
            if (!Intrinsics.areEqual(this.f29966a.f29944b, str)) {
                this.f29966a.mo42639a(str);
                ColorUpdateListener colorUpdateListener = this.f29966a.getColorUpdateListener();
                if (colorUpdateListener != null) {
                    colorUpdateListener.mo42646a(str);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ UDCheckBox m46378a(FilterPanelColorView filterPanelColorView) {
        UDCheckBox uDCheckBox = filterPanelColorView.f29943a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        return uDCheckBox;
    }

    public final void setChecked(boolean z) {
        UDCheckBox uDCheckBox = this.f29943a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        uDCheckBox.setChecked(z);
    }

    /* renamed from: a */
    public final void mo42639a(String str) {
        this.f29944b = str;
        SelectColorAdapter dVar = this.f29949h;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorAdapter");
        }
        dVar.mo42651a(this.f29947f, this.f29944b);
        SelectColorAdapter dVar2 = this.f29949h;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorAdapter");
        }
        dVar2.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$g */
    public static final class View$OnClickListenerC11147g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterPanelColorView f29964a;

        View$OnClickListenerC11147g(FilterPanelColorView filterPanelColorView) {
            this.f29964a = filterPanelColorView;
        }

        public final void onClick(View view) {
            FilterPanelColorView.m46378a(this.f29964a).setChecked(!FilterPanelColorView.m46378a(this.f29964a).isChecked());
            if (!FilterPanelColorView.m46378a(this.f29964a).isChecked()) {
                FilterPanelColorView.m46378a(this.f29964a).setChecked(true);
                return;
            }
            OnCheckedChangeListener onCheckedChangeListener = this.f29964a.getOnCheckedChangeListener();
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.mo42647a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.filter.FilterPanelColorView$h */
    public static final class View$OnClickListenerC11148h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterPanelColorView f29965a;

        View$OnClickListenerC11148h(FilterPanelColorView filterPanelColorView) {
            this.f29965a = filterPanelColorView;
        }

        public final void onClick(View view) {
            if (!FilterPanelColorView.m46378a(this.f29965a).isChecked()) {
                FilterPanelColorView.m46378a(this.f29965a).setChecked(true);
                return;
            }
            OnCheckedChangeListener onCheckedChangeListener = this.f29965a.getOnCheckedChangeListener();
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.mo42647a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo42640a(boolean z) {
        int i;
        BaseRecyclerView baseRecyclerView = this.f29948g;
        if (baseRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorRecyclerView");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        baseRecyclerView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo42638a(FilterData.FilterOptionItem filterOptionItem) {
        Intrinsics.checkParameterIsNotNull(filterOptionItem, "item");
        TextView textView = this.f29946e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBoxText");
        }
        textView.setText(filterOptionItem.getTitle());
        UDCheckBox uDCheckBox = this.f29943a;
        if (uDCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkBox");
        }
        uDCheckBox.setChecked(filterOptionItem.isSelect());
        this.f29947f = filterOptionItem.getColors();
        this.f29944b = filterOptionItem.getColorValue();
        SelectColorAdapter dVar = this.f29949h;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorAdapter");
        }
        dVar.mo42651a(this.f29947f, this.f29944b);
        SelectColorAdapter dVar2 = this.f29949h;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("colorAdapter");
        }
        dVar2.notifyDataSetChanged();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterPanelColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.sheet_filter_panel_color_view, (ViewGroup) this, true);
        m46379a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterPanelColorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
