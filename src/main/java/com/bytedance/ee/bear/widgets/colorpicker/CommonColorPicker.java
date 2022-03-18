package com.bytedance.ee.bear.widgets.colorpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 $2\u00020\u0001:\u0005$%&'(B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014J%\u0010\u0018\u001a\u00020\u00112\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\fJ\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\nH\u0002J\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mColorsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mOnSelectColorListener", "Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$OnSelectColorListener;", "mSelectColorAdapter", "Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorAdapter;", "mViewType", "onLayout", "", "changed", "", "left", "top", "right", "bottom", "setColorData", "colorList", "", "", "selectedColor", "([Ljava/lang/String;Ljava/lang/String;)V", "setOnSelectColorListener", "listener", "setRVLayoutManager", "recyclerView", "setViewType", ShareHitPoint.f121869d, "Companion", "OnSelectColorListener", "SelectColorAdapter", "SelectColorDecoration", "ViewType", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommonColorPicker extends FrameLayout {

    /* renamed from: c */
    public static final Companion f31868c = new Companion(null);

    /* renamed from: a */
    public OnSelectColorListener f31869a;

    /* renamed from: b */
    public int f31870b;

    /* renamed from: d */
    private RecyclerView f31871d;

    /* renamed from: e */
    private SelectColorAdapter f31872e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$ViewType;", "", "Companion", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ViewType {
        public static final Companion Companion = Companion.f31873a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$ViewType$Companion;", "", "()V", "GRID", "", "LIST", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$ViewType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f31873a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$OnSelectColorListener;", "", "onColorSelected", "", "color", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$c */
    public interface OnSelectColorListener {
        void onColorSelected(String str);
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J%\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0002R\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorAdapter$ColorViewHolder;", "()V", "mColorList", "", "", "[Ljava/lang/String;", "mListener", "Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$OnSelectColorListener;", "mSelectedColor", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setColorData", "ColorList", "selectedColor", "([Ljava/lang/String;Ljava/lang/String;)V", "setOnSelectColorListener", "listener", "shouldShowLineBorder", "", "context", "Landroid/content/Context;", "itemColor", "ColorViewHolder", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$d */
    public static final class SelectColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {

        /* renamed from: a */
        public String[] f31875a;

        /* renamed from: b */
        public OnSelectColorListener f31876b;

        /* renamed from: c */
        private String f31877c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorAdapter$ColorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorAdapter;Landroid/view/View;)V", "centerLayer", "getCenterLayer", "()Landroid/view/View;", "setCenterLayer", "(Landroid/view/View;)V", "innerLayer", "getInnerLayer", "setInnerLayer", "isSelected", "", "()Z", "setSelected", "(Z)V", "outerLayer", "getOuterLayer", "setOuterLayer", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$d$a */
        public final class ColorViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            final /* synthetic */ SelectColorAdapter f31878a;

            /* renamed from: b */
            private View f31879b;

            /* renamed from: c */
            private View f31880c;

            /* renamed from: d */
            private View f31881d;

            /* renamed from: e */
            private boolean f31882e;

            /* renamed from: a */
            public final View mo45314a() {
                return this.f31879b;
            }

            /* renamed from: b */
            public final View mo45316b() {
                return this.f31880c;
            }

            /* renamed from: c */
            public final View mo45317c() {
                return this.f31881d;
            }

            /* renamed from: d */
            public final boolean mo45318d() {
                return this.f31882e;
            }

            /* renamed from: a */
            public final void mo45315a(boolean z) {
                this.f31882e = z;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ColorViewHolder(SelectColorAdapter dVar, View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "itemView");
                this.f31878a = dVar;
                View findViewById = view.findViewById(R.id.outer_layer);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.outer_layer)");
                this.f31879b = findViewById;
                View findViewById2 = view.findViewById(R.id.center_layer);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.center_layer)");
                this.f31880c = findViewById2;
                View findViewById3 = view.findViewById(R.id.inner_layer);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.inner_layer)");
                this.f31881d = findViewById3;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            String[] strArr = this.f31875a;
            if (strArr != null) {
                return strArr.length;
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo45311a(OnSelectColorListener cVar) {
            this.f31876b = cVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorAdapter$onBindViewHolder$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$d$b */
        public static final class C11826b extends AbstractView$OnClickListenerC11839e {

            /* renamed from: a */
            final /* synthetic */ SelectColorAdapter f31883a;

            /* renamed from: b */
            final /* synthetic */ String f31884b;

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "v");
                SelectColorAdapter dVar = this.f31883a;
                dVar.mo45313a(dVar.f31875a, this.f31884b);
                OnSelectColorListener cVar = this.f31883a.f31876b;
                if (cVar != null) {
                    cVar.onColorSelected(this.f31884b);
                }
            }

            C11826b(SelectColorAdapter dVar, String str) {
                this.f31883a = dVar;
                this.f31884b = str;
            }
        }

        /* renamed from: a */
        public final void mo45313a(String[] strArr, String str) {
            this.f31875a = strArr;
            this.f31877c = str;
            notifyDataSetChanged();
        }

        /* renamed from: a */
        private final boolean m49053a(Context context, String str) {
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
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.common_color_picker_item, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
            return new ColorViewHolder(this, inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(ColorViewHolder aVar, int i) {
            String str;
            int i2;
            int i3;
            int i4;
            Intrinsics.checkParameterIsNotNull(aVar, "holder");
            if (this.f31875a != null && i >= 0 && i < getItemCount()) {
                String[] strArr = this.f31875a;
                if (strArr != null) {
                    str = strArr[i];
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    View view = aVar.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                    Context context = view.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "holder.itemView.context");
                    Resources resources = context.getResources();
                    aVar.mo45315a(StringsKt.equals(str, this.f31877c, true));
                    Drawable mutate = aVar.mo45314a().getBackground().mutate();
                    if (mutate != null) {
                        GradientDrawable gradientDrawable = (GradientDrawable) mutate;
                        Drawable mutate2 = aVar.mo45316b().getBackground().mutate();
                        if (mutate2 != null) {
                            GradientDrawable gradientDrawable2 = (GradientDrawable) mutate2;
                            Drawable mutate3 = aVar.mo45317c().getBackground().mutate();
                            if (mutate3 != null) {
                                GradientDrawable gradientDrawable3 = (GradientDrawable) mutate3;
                                if (aVar.mo45318d()) {
                                    i2 = R.color.primary_pri_500;
                                } else {
                                    i2 = R.color.bg_body;
                                }
                                gradientDrawable.setColor(resources.getColor(i2));
                                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.space_kit_len_2);
                                if (aVar.mo45318d()) {
                                    i3 = resources.getColor(R.color.bg_body);
                                } else {
                                    if (str == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    i3 = ColorUtils.m55697a(str);
                                }
                                gradientDrawable3.setStroke(dimensionPixelSize, i3);
                                if (str == null) {
                                    Intrinsics.throwNpe();
                                }
                                gradientDrawable3.setColor(ColorUtils.m55697a(str));
                                if (aVar.mo45318d()) {
                                    i4 = resources.getColor(R.color.primary_pri_500);
                                } else {
                                    i4 = ColorUtils.m55697a(str);
                                }
                                gradientDrawable2.setColor(i4);
                                if (!aVar.mo45318d()) {
                                    View view2 = aVar.itemView;
                                    Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                                    Context context2 = view2.getContext();
                                    Intrinsics.checkExpressionValueIsNotNull(context2, "holder.itemView.context");
                                    if (m49053a(context2, str)) {
                                        gradientDrawable2.setStroke(resources.getDimensionPixelSize(R.dimen.space_kit_len_half), resources.getColor(R.color.line_border_component));
                                        aVar.mo45317c().setOnClickListener(new C11826b(this, str));
                                        return;
                                    }
                                }
                                gradientDrawable2.setStroke(0, (ColorStateList) null);
                                aVar.mo45317c().setOnClickListener(new C11826b(this, str));
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
            }
        }
    }

    public CommonColorPicker(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommonColorPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$Companion;", "", "()V", "GRID_HORIZONTAL_MAX_SPAN_COUNT", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void setOnSelectColorListener(OnSelectColorListener cVar) {
        this.f31869a = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$2$1$1", "Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$OnSelectColorListener;", "onColorSelected", "", "color", "", "ccm-widget_release", "com/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$a */
    public static final class C11825a implements OnSelectColorListener {

        /* renamed from: a */
        final /* synthetic */ CommonColorPicker f31874a;

        C11825a(CommonColorPicker commonColorPicker) {
            this.f31874a = commonColorPicker;
        }

        @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker.OnSelectColorListener
        public void onColorSelected(String str) {
            OnSelectColorListener cVar = this.f31874a.f31869a;
            if (cVar != null) {
                cVar.onColorSelected(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker$SelectColorDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "(Lcom/bytedance/ee/bear/widgets/colorpicker/CommonColorPicker;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker$e */
    private final class SelectColorDecoration extends RecyclerView.AbstractC1335d {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public SelectColorDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            Intrinsics.checkParameterIsNotNull(rect, "outRect");
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
            Intrinsics.checkParameterIsNotNull(state, "state");
            if (recyclerView.getAdapter() != null) {
                int dimensionPixelSize = CommonColorPicker.this.getResources().getDimensionPixelSize(R.dimen.space_kit_len_44);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (CommonColorPicker.this.f31870b == 0) {
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        i2 = adapter.getItemCount();
                    } else {
                        i2 = 0;
                    }
                    int width = (recyclerView.getWidth() - (dimensionPixelSize * i2)) / (i2 - 1);
                    if (childAdapterPosition == 0) {
                        width = 0;
                    }
                    rect.left = width;
                    rect.right = 0;
                } else if (CommonColorPicker.this.f31870b == 1) {
                    int width2 = ((recyclerView.getWidth() - (dimensionPixelSize * 6)) / 6) / 2;
                    rect.left = width2;
                    rect.right = width2;
                    if (childAdapterPosition < 6) {
                        i = 0;
                    } else {
                        i = CommonColorPicker.this.getResources().getDimensionPixelSize(R.dimen.space_kit_len_8);
                    }
                    rect.top = i;
                    rect.bottom = 0;
                }
            }
        }
    }

    public final void setViewType(int i) {
        this.f31870b = i;
        RecyclerView recyclerView = this.f31871d;
        if (recyclerView != null) {
            setRVLayoutManager(recyclerView);
        }
    }

    private final void setRVLayoutManager(RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        if (this.f31870b == 0) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            gridLayoutManager = linearLayoutManager;
        } else {
            gridLayoutManager = new GridLayoutManager(getContext(), 6, 1, false);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    /* renamed from: a */
    public final void mo45306a(String[] strArr, String str) {
        SelectColorAdapter dVar = this.f31872e;
        if (dVar != null) {
            dVar.mo45313a(strArr, str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonColorPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.common_color_picker_view, (ViewGroup) this, true);
        if (attributeSet != null) {
            this.f31870b = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.view_type}).getInteger(0, 0);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.colors_recycler_view);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "this");
        setRVLayoutManager(recyclerView);
        SelectColorAdapter dVar = new SelectColorAdapter();
        dVar.mo45311a(new C11825a(this));
        this.f31872e = dVar;
        recyclerView.setAdapter(dVar);
        this.f31871d = recyclerView;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RecyclerView recyclerView;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView2 = this.f31871d;
        if (recyclerView2 != null && recyclerView2.getItemDecorationCount() == 0 && (recyclerView = this.f31871d) != null) {
            recyclerView.addItemDecoration(new SelectColorDecoration());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonColorPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
