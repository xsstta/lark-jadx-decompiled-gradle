package com.larksuite.component.universe_design.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002./B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\"\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\tJ\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0014\u0010&\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u000eJ\u0010\u0010+\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010-R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "colorPickerType", "Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$ColorPickerType;", "mAdapterBase", "Lcom/larksuite/component/universe_design/colorpicker/UDBaseColorPickerAdapter;", "pickerPaddingBottom", "pickerTitle", "Landroid/widget/TextView;", "pickerTypeText", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "titlePaddingBottom", "clear", "", "getCurrentSelectItem", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItem;", "initAtt", "defStyle", "initView", "selectItem", "item", "selectItemPosition", "position", "setAdapter", "colorBaseAdapter", "setColorItems", "colorItems", "", "setColorPickerType", ShareHitPoint.f121869d, "setOnItemClickListener", "itemClickListener", "Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$OnColorItemClickListener;", "ColorPickerType", "OnColorItemClickListener", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDColorPicker extends LinearLayout {

    /* renamed from: a */
    private final TextView f63146a;

    /* renamed from: b */
    private String f63147b;

    /* renamed from: c */
    private final RecyclerView f63148c;

    /* renamed from: d */
    private ColorPickerType f63149d;

    /* renamed from: e */
    private UDBaseColorPickerAdapter f63150e;

    /* renamed from: f */
    private int f63151f;

    /* renamed from: g */
    private int f63152g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$ColorPickerType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "BASE", "TEXT", "BACKGROUND", "Companion", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ColorPickerType {
        BASE(0),
        TEXT(1),
        BACKGROUND(2);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$ColorPickerType$Companion;", "", "()V", "of", "Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$ColorPickerType;", "value", "", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.universe_design.colorpicker.UDColorPicker$ColorPickerType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ColorPickerType mo90398a(int i) {
                if (i == 0) {
                    return ColorPickerType.BASE;
                }
                if (i == 1) {
                    return ColorPickerType.TEXT;
                }
                if (i != 2) {
                    return ColorPickerType.BASE;
                }
                return ColorPickerType.BACKGROUND;
            }
        }

        public final int getValue() {
            return this.value;
        }

        private ColorPickerType(int i) {
            this.value = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorPicker$OnColorItemClickListener;", "", "onItemClick", "", "index", "", "colorItem", "Lcom/larksuite/component/universe_design/colorpicker/UDColorItem;", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.colorpicker.UDColorPicker$a */
    public interface OnColorItemClickListener {
        /* renamed from: a */
        void mo90399a(int i, UDColorItem dVar);
    }

    public final UDColorItem getCurrentSelectItem() {
        UDBaseColorPickerAdapter bVar = this.f63150e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapterBase");
        }
        return bVar.mo90412b();
    }

    /* renamed from: a */
    private final void m92548a() {
        int i;
        int i2;
        UDColorAdapter cVar;
        this.f63146a.setText(this.f63147b);
        TextView textView = this.f63146a;
        if (TextUtils.isEmpty(this.f63147b)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        int i3 = C25732e.f63171a[this.f63149d.ordinal()];
        if (i3 == 1) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            i2 = UDDimenUtils.m93313d(context, R.dimen.ud_color_picker_item_default_min_width_space);
        } else if (i3 == 2) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            i2 = UDDimenUtils.m93313d(context2, R.dimen.ud_color_picker_item_min_width_space);
        } else if (i3 == 3) {
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            i2 = UDDimenUtils.m93313d(context3, R.dimen.ud_color_picker_item_min_width_space);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = C25732e.f63172b[this.f63149d.ordinal()];
        if (i4 == 1) {
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            cVar = new UDColorAdapter(context4);
        } else if (i4 == 2) {
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            cVar = new UDTextAdapter(context5);
        } else if (i4 == 3) {
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            cVar = new UDBackgroundAdapter(context6);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setAdapter(cVar);
        RecyclerView recyclerView = this.f63148c;
        Context context7 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context7, "context");
        Context context8 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context8, "context");
        UDGridAutofitLayoutManager uDGridAutofitLayoutManager = new UDGridAutofitLayoutManager(context7, UDDimenUtils.m93313d(context8, R.dimen.ud_color_picker_item_outer_width_height), i2);
        recyclerView.setLayoutManager(uDGridAutofitLayoutManager);
        Context context9 = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context9, "context");
        recyclerView.addItemDecoration(new UDColorPickerItemDecoration(uDGridAutofitLayoutManager, UDDimenUtils.m93313d(context9, R.dimen.ud_color_picker_item_height_space)));
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        recyclerView.setItemAnimator(null);
        UDBaseColorPickerAdapter bVar = this.f63150e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapterBase");
        }
        recyclerView.setAdapter(bVar);
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = this.f63151f;
            marginLayoutParams2.bottomMargin = this.f63152g;
        }
    }

    private final void setAdapter(UDBaseColorPickerAdapter bVar) {
        this.f63150e = bVar;
    }

    public UDColorPicker(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo90392a(int i) {
        UDBaseColorPickerAdapter bVar = this.f63150e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapterBase");
        }
        bVar.mo90408a(i);
    }

    public final void setColorPickerType(ColorPickerType colorPickerType) {
        Intrinsics.checkParameterIsNotNull(colorPickerType, ShareHitPoint.f121869d);
        this.f63149d = colorPickerType;
        m92548a();
    }

    public final void setOnItemClickListener(OnColorItemClickListener aVar) {
        UDBaseColorPickerAdapter bVar = this.f63150e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapterBase");
        }
        bVar.mo90409a(aVar);
    }

    public final void setColorItems(List<? extends UDColorItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "colorItems");
        UDBaseColorPickerAdapter bVar = this.f63150e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapterBase");
        }
        bVar.mo90411a(list);
    }

    public UDColorPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UDColorPicker(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.UDColorPicker);
    }

    /* renamed from: a */
    private final void m92549a(AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ud_color_picker_paddingBottom, R.attr.ud_color_picker_titlePadding, R.attr.ud_color_picker_title_text, R.attr.ud_color_picker_type}, i, i2);
        this.f63149d = ColorPickerType.Companion.mo90398a(obtainStyledAttributes.getInt(3, this.f63149d.getValue()));
        this.f63147b = obtainStyledAttributes.getString(2);
        this.f63151f = obtainStyledAttributes.getDimensionPixelSize(1, this.f63151f);
        this.f63152g = obtainStyledAttributes.getDimensionPixelSize(0, this.f63152g);
        m92548a();
        obtainStyledAttributes.recycle();
    }

    public UDColorPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f63149d = ColorPickerType.BASE;
        View inflate = LinearLayout.inflate(getContext(), R.layout.ud_layout_color_picker, this);
        View findViewById = inflate.findViewById(R.id.color_picker_type);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.color_picker_type)");
        this.f63146a = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.color_picker_items);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.color_picker_items)");
        this.f63148c = (RecyclerView) findViewById2;
        m92549a(attributeSet, i, i2);
    }
}
