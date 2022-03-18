package com.ss.android.lark.tangram.base.props;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\u0000H\u0016J\u0013\u00107\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u000109H\u0002J\b\u0010:\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001a\u0010&\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010)\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001a\u0010,\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010/\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001c¨\u0006;"}, d2 = {"Lcom/ss/android/lark/tangram/base/props/Props;", "Ljava/io/Serializable;", "()V", "backGroundResId", "", "getBackGroundResId", "()Ljava/lang/Integer;", "setBackGroundResId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "isDataChange", "", "()Z", "setDataChange", "(Z)V", "marginBottom", "getMarginBottom", "()I", "setMarginBottom", "(I)V", "marginLeft", "getMarginLeft", "setMarginLeft", "marginRight", "getMarginRight", "setMarginRight", "marginTop", "getMarginTop", "setMarginTop", "paddingBottom", "getPaddingBottom", "setPaddingBottom", "paddingLeft", "getPaddingLeft", "setPaddingLeft", "paddingRight", "getPaddingRight", "setPaddingRight", "paddingTop", "getPaddingTop", "setPaddingTop", "applyToView", "", "view", "Landroid/view/View;", "clone", "equals", "other", "", "hashCode", "tangram-component_release"}, mo238835k = 1, mv = {1, 1, 15})
public class Props implements Serializable {
    private Integer backGroundResId;
    private Integer backgroundColor;
    private Drawable backgroundDrawable;
    private boolean isDataChange;
    private int marginBottom;
    private int marginLeft;
    private int marginRight;
    private int marginTop;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;

    public final Integer getBackGroundResId() {
        return this.backGroundResId;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginLeft() {
        return this.marginLeft;
    }

    public final int getMarginRight() {
        return this.marginRight;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final boolean isDataChange() {
        return this.isDataChange;
    }

    @Override // java.lang.Object
    public Props clone() {
        Props props = new Props();
        props.marginLeft = this.marginLeft;
        props.marginRight = this.marginRight;
        props.marginTop = this.marginTop;
        props.marginBottom = this.marginBottom;
        props.paddingBottom = this.paddingBottom;
        props.paddingLeft = this.paddingLeft;
        props.paddingRight = this.paddingRight;
        props.paddingTop = this.paddingTop;
        return props;
    }

    public int hashCode() {
        int i;
        int i2 = ((((((((((((((this.paddingLeft * 31) + this.paddingRight) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.marginLeft) * 31) + this.marginRight) * 31) + this.marginTop) * 31) + this.marginBottom) * 31;
        Integer num = this.backgroundColor;
        int i3 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            i3 = drawable.hashCode();
        }
        return ((i4 + i3) * 31) + C$r8$backportedMethods$utility$Boolean$1$hashCode.hashCode(this.isDataChange);
    }

    public final void setBackGroundResId(Integer num) {
        this.backGroundResId = num;
    }

    public final void setBackgroundColor(Integer num) {
        this.backgroundColor = num;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.backgroundDrawable = drawable;
    }

    public final void setDataChange(boolean z) {
        this.isDataChange = z;
    }

    public final void setMarginBottom(int i) {
        this.marginBottom = i;
    }

    public final void setMarginLeft(int i) {
        this.marginLeft = i;
    }

    public final void setMarginRight(int i) {
        this.marginRight = i;
    }

    public final void setMarginTop(int i) {
        this.marginTop = i;
    }

    public final void setPaddingBottom(int i) {
        this.paddingBottom = i;
    }

    public final void setPaddingLeft(int i) {
        this.paddingLeft = i;
    }

    public final void setPaddingRight(int i) {
        this.paddingRight = i;
    }

    public final void setPaddingTop(int i) {
        this.paddingTop = i;
    }

    public final void applyToView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Integer num = this.backgroundColor;
        if (num != null) {
            num.intValue();
            Integer num2 = this.backgroundColor;
            if (num2 == null) {
                Intrinsics.throwNpe();
            }
            view.setBackgroundColor(num2.intValue());
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            view.setBackgroundDrawable(drawable);
        }
        Integer num3 = this.backGroundResId;
        if (num3 != null) {
            num3.intValue();
            Integer num4 = this.backGroundResId;
            if (num4 == null) {
                Intrinsics.throwNpe();
            }
            view.setBackgroundResource(num4.intValue());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Props)) {
            return false;
        }
        Props props = (Props) obj;
        if (this.paddingLeft == props.paddingLeft && this.paddingRight == props.paddingRight && this.paddingTop == props.paddingTop && this.paddingBottom == props.paddingBottom && this.marginLeft == props.marginLeft && this.marginRight == props.marginRight && this.marginTop == props.marginTop && this.marginBottom == props.marginBottom && !(!Intrinsics.areEqual(this.backgroundColor, props.backgroundColor)) && !(!Intrinsics.areEqual(this.backgroundDrawable, props.backgroundDrawable)) && this.isDataChange == props.isDataChange) {
            return true;
        }
        return false;
    }
}
