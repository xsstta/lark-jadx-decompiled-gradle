package com.larksuite.component.universe_design.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import com.larksuite.component.universe_design.drawable.UDRoundDrawable;
import com.larksuite.component.universe_design.radius.UDRadius;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0007J\"\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\r\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J&\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0012J\u000e\u0010\"\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010#\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007J\u0018\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u000e\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/larksuite/component/universe_design/button/UDButton;", "Landroidx/appcompat/widget/AppCompatButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mRoundBg", "Lcom/larksuite/component/universe_design/drawable/UDRoundDrawable;", "applyStyle", "", "styleRes", "createRoundDrawableFromAttributeSet", "getCornerRadii", "", "getCornerRadius", "", "getStrokeWidth", "()Ljava/lang/Integer;", "isRadiusAdjustBounds", "", "setBackgroundColor", "colors", "Landroid/content/res/ColorStateList;", "color", "setCornerRadii", "radiusTopLeft", "radiusTopRight", "radiusBottomLeft", "radiusBottomRight", "setCornerRadius", "radius", "setRadiusAdjustBounds", "setStrokeColor", "setStrokeData", "width", "setStrokeWidth", "universe-ui-button_release"}, mo238835k = 1, mv = {1, 1, 16})
public class UDButton extends AppCompatButton {
    private HashMap _$_findViewCache;
    private UDRoundDrawable mRoundBg;

    public UDButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public UDButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final float[] getCornerRadii() {
        return this.mRoundBg.getCornerRadii();
    }

    public final float getCornerRadius() {
        return this.mRoundBg.getCornerRadius();
    }

    public final boolean isRadiusAdjustBounds() {
        return this.mRoundBg.mo90358b();
    }

    public final Integer getStrokeWidth() {
        return Integer.valueOf(this.mRoundBg.mo90352a());
    }

    public final void setBackgroundColor(ColorStateList colorStateList) {
        this.mRoundBg.mo90355a(colorStateList);
    }

    public final void setCornerRadius(float f) {
        this.mRoundBg.setCornerRadius(f);
    }

    public final void setRadiusAdjustBounds(boolean z) {
        this.mRoundBg.mo90356a(z);
    }

    public final void setStrokeWidth(int i) {
        this.mRoundBg.mo90353a(i);
    }

    public void setBackgroundColor(int i) {
        this.mRoundBg.mo90355a(ColorStateList.valueOf(i));
    }

    public final void setStrokeColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        Intrinsics.checkExpressionValueIsNotNull(valueOf, "ColorStateList.valueOf(color)");
        setStrokeColor(valueOf);
    }

    public final void setStrokeColor(ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(colorStateList, "colors");
        this.mRoundBg.mo90357b(colorStateList);
    }

    public final void applyStyle(int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{16842804, 16842923, 16842927, 16842966, 16842968, 16842996, 16842997, 16842999, 16843001, 16843071, 16843091, R.attr.ud_backgroundColor, R.attr.ud_isRadiusAdjustBounds, R.attr.ud_radius, R.attr.ud_radiusBottomLeft, R.attr.ud_radiusBottomRight, R.attr.ud_radiusTopLeft, R.attr.ud_radiusTopRight, R.attr.ud_strokeColor, R.attr.ud_strokeWidth}, 0, i);
        ViewGroup.MarginLayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.MarginLayoutParams(0, 0);
        }
        layoutParams.width = obtainStyledAttributes.getLayoutDimension(5, layoutParams.width);
        layoutParams.height = obtainStyledAttributes.getLayoutDimension(6, layoutParams.height);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = obtainStyledAttributes.getDimensionPixelSize(7, marginLayoutParams.leftMargin);
            marginLayoutParams.rightMargin = obtainStyledAttributes.getDimensionPixelSize(8, marginLayoutParams.rightMargin);
        }
        setLayoutParams(layoutParams);
        setPadding(obtainStyledAttributes.getDimensionPixelSize(3, getPaddingLeft()), getPaddingTop(), obtainStyledAttributes.getDimensionPixelSize(4, getPaddingRight()), getPaddingBottom());
        setMinWidth(obtainStyledAttributes.getDimensionPixelSize(9, getMinWidth()));
        setMaxLines(obtainStyledAttributes.getInt(10, getMaxLines()));
        int i2 = 2;
        setGravity(obtainStyledAttributes.getInt(2, getGravity()));
        TextUtils.TruncateAt[] values = TextUtils.TruncateAt.values();
        TextUtils.TruncateAt ellipsize = getEllipsize();
        if (ellipsize != null) {
            i2 = ellipsize.ordinal();
        }
        setEllipsize(values[obtainStyledAttributes.getInt(1, i2)]);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId > 0) {
            setTextAppearance(getContext(), resourceId);
        }
        int i3 = obtainStyledAttributes.getInt(13, 0);
        if (i3 >= 0) {
            UDRadius a = UDRadius.Companion.mo91123a(i3);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            setCornerRadius((float) a.getRadiusSize(context));
        }
        setRadiusAdjustBounds(obtainStyledAttributes.getBoolean(12, false));
        obtainStyledAttributes.recycle();
    }

    public final void setStrokeData(int i, ColorStateList colorStateList) {
        this.mRoundBg.mo90354a(i, colorStateList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        UDRoundDrawable createRoundDrawableFromAttributeSet = createRoundDrawableFromAttributeSet(context, attributeSet, i);
        this.mRoundBg = createRoundDrawableFromAttributeSet;
        setBackground(createRoundDrawableFromAttributeSet);
    }

    private final UDRoundDrawable createRoundDrawableFromAttributeSet(Context context, AttributeSet attributeSet, int i) {
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, 16842923, 16842927, 16842966, 16842968, 16842996, 16842997, 16842999, 16843001, 16843071, 16843091, R.attr.ud_backgroundColor, R.attr.ud_isRadiusAdjustBounds, R.attr.ud_radius, R.attr.ud_radiusBottomLeft, R.attr.ud_radiusBottomRight, R.attr.ud_radiusTopLeft, R.attr.ud_radiusTopRight, R.attr.ud_strokeColor, R.attr.ud_strokeWidth}, i, 0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(11);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(18);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(19, 0);
        boolean z = obtainStyledAttributes.getBoolean(12, false);
        int i3 = obtainStyledAttributes.getInt(13, 0);
        if (i3 >= 0) {
            i2 = UDRadius.Companion.mo91123a(i3).getRadiusSize(context);
        } else {
            i2 = i3;
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(17, 0);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        obtainStyledAttributes.recycle();
        return UDRoundDrawable.f63117b.mo90363a(colorStateList, dimensionPixelSize, colorStateList2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, z, i2);
    }

    public final void setCornerRadii(float f, float f2, float f3, float f4) {
        this.mRoundBg.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UDButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
