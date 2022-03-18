package com.larksuite.component.universe_design.colorpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/universe_design/colorpicker/UDColorItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "innerArea", "getInnerArea", "()Landroid/widget/FrameLayout;", "itemImage", "Landroid/widget/ImageView;", "getItemImage", "()Landroid/widget/ImageView;", "outerArea", "getOuterArea", "universe-ui-colorpicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDColorItemView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f63143a;

    /* renamed from: b */
    private final FrameLayout f63144b;

    /* renamed from: c */
    private final ImageView f63145c;

    public final FrameLayout getInnerArea() {
        return this.f63144b;
    }

    public final ImageView getItemImage() {
        return this.f63145c;
    }

    public final FrameLayout getOuterArea() {
        return this.f63143a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDColorItemView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UDColorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDColorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = FrameLayout.inflate(getContext(), R.layout.ud_color_picker_default_item, this);
        View findViewById = inflate.findViewById(R.id.color_picker_item_outer_area);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.…r_picker_item_outer_area)");
        this.f63143a = (FrameLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.color_picker_item_inner_area);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.…r_picker_item_inner_area)");
        this.f63144b = (FrameLayout) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.color_picker_item_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.color_picker_item_text)");
        this.f63145c = (ImageView) findViewById3;
    }
}
