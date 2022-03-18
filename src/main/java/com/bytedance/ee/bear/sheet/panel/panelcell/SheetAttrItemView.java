package com.bytedance.ee.bear.sheet.panel.panelcell;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.bytedance.ee.bear.widgets.shape.C11852a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/panel/panelcell/SheetAttrItemView;", "Landroid/widget/FrameLayout;", "Lcom/bytedance/ee/bear/sheet/panel/panelcell/IPanelCell;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mClickListener", "Lcom/bytedance/ee/bear/sheet/panel/panelcell/IPanelCell$OnClickListener;", "mIcon", "Landroid/widget/ImageView;", "mPosition", "Lcom/bytedance/ee/bear/sheet/panel/panelcell/SheetAttrItemView$Position;", "mText", "Landroid/widget/TextView;", "setBackground", "", "enable", "", "setClickListener", "listener", "showBadge", "show", "update", "item", "Lcom/bytedance/ee/bear/sheet/panel/SheetItem;", "Position", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SheetAttrItemView extends FrameLayout implements AbstractC11286a {

    /* renamed from: a */
    public AbstractC11286a.AbstractC11287a f30331a;

    /* renamed from: b */
    private final ImageView f30332b;

    /* renamed from: c */
    private final TextView f30333c;

    /* renamed from: d */
    private Position f30334d;

    public SheetAttrItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SheetAttrItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    /* renamed from: a */
    public void mo43223a(boolean z) {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/sheet/panel/panelcell/SheetAttrItemView$Position;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "LEFT", "CENTER", "RIGHT", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.panel.panelcell.SheetAttrItemView$a */
    public enum Position {
        LEFT(0),
        CENTER(1),
        RIGHT(2);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private Position(int i) {
            this.value = i;
        }
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    public void setClickListener(AbstractC11286a.AbstractC11287a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f30331a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.panel.panelcell.SheetAttrItemView$b */
    static final class View$OnClickListenerC11282b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SheetAttrItemView f30336a;

        /* renamed from: b */
        final /* synthetic */ SheetItem f30337b;

        View$OnClickListenerC11282b(SheetAttrItemView sheetAttrItemView, SheetItem sheetItem) {
            this.f30336a = sheetAttrItemView;
            this.f30337b = sheetItem;
        }

        public final void onClick(View view) {
            this.f30336a.setSelected(true);
            AbstractC11286a.AbstractC11287a aVar = this.f30336a.f30331a;
            if (aVar != null) {
                aVar.clickItem(this.f30337b.getId(), null);
            }
        }
    }

    private final void setBackground(boolean z) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable;
        int color = getResources().getColor(R.color.bg_body_overlay);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ud_radius_l);
        if (z) {
            colorStateList = getResources().getColorStateList(R.color.sheet_attr_item_bg_tint_selector);
        } else {
            colorStateList = null;
        }
        int i = C11288b.f30357a[this.f30334d.ordinal()];
        if (i == 1) {
            gradientDrawable = C11852a.m49216c(color, (float) dimensionPixelSize, colorStateList);
        } else if (i == 2) {
            gradientDrawable = C11852a.m49213a(color, colorStateList);
        } else if (i == 3) {
            gradientDrawable = C11852a.m49217d(color, (float) dimensionPixelSize, colorStateList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setBackground(gradientDrawable);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a
    /* renamed from: a */
    public void mo43222a(SheetItem sheetItem) {
        int i;
        int i2;
        float f;
        Intrinsics.checkParameterIsNotNull(sheetItem, "item");
        ImageView imageView = this.f30332b;
        Resources resources = getResources();
        if (sheetItem.isEnable()) {
            i = R.color.sheet_attr_item_icon_tint_selector;
        } else {
            i = R.color.icon_disable;
        }
        imageView.setImageTintList(resources.getColorStateList(i));
        TextView textView = this.f30333c;
        Resources resources2 = getResources();
        if (sheetItem.isEnable()) {
            i2 = R.color.sheet_attr_item_text_tint_selector;
        } else {
            i2 = R.color.text_disable;
        }
        textView.setTextColor(resources2.getColorStateList(i2));
        TextPaint paint = this.f30333c.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "mText.paint");
        if (sheetItem.isSelected()) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        paint.setStrokeWidth(f);
        if (this.f30333c.getVisibility() == 0) {
            this.f30333c.setText(sheetItem.getTitle());
        }
        setBackground(sheetItem.isEnable());
        setOnClickListener(new View$OnClickListenerC11282b(this, sheetItem));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SheetAttrItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f30334d = Position.CENTER;
        LayoutInflater.from(getContext()).inflate(R.layout.sheet_panel_attr_item, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.icon, R.attr.position, R.attr.text});
        View findViewById = findViewById(R.id.icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.icon)");
        ImageView imageView = (ImageView) findViewById;
        this.f30332b = imageView;
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
        }
        View findViewById2 = findViewById(R.id.text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.text)");
        TextView textView = (TextView) findViewById2;
        this.f30333c = textView;
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "mText.paint");
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        String string = obtainStyledAttributes.getString(2);
        if (string != null) {
            textView.setVisibility(0);
            textView.setText(string);
        }
        this.f30334d = Position.values()[obtainStyledAttributes.getInt(1, Position.CENTER.getValue())];
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SheetAttrItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
