package com.ss.android.lark.chat.preview.entity.component.property;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.suite.R;
import com.ss.android.lark.tangram.base.props.Props;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\u0013J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/ButtonComponentProps;", "Lcom/ss/android/lark/tangram/base/props/Props;", "()V", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "strokeColor", "", "getStrokeColor", "()I", "setStrokeColor", "(I)V", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "text", "", "textColor", "getTextColor", "setTextColor", "textResId", "textSizeSP", "", "getTextSizeSP", "()F", "setTextSizeSP", "(F)V", "applyToView", "", "view", "Lcom/larksuite/component/universe_design/button/UDButton;", "getTestResId", "getText", "setText", "resId", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ButtonComponentProps extends Props {
    private Drawable drawable;
    private int strokeColor = -1;
    private int strokeWidth;
    private String text = "";
    private int textColor = R.color.lkui_N00;
    private int textResId = -1;
    private float textSizeSP = 18.0f;

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public final int getTestResId() {
        return this.textResId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSizeSP() {
        return this.textSizeSP;
    }

    public final void setDrawable(Drawable drawable2) {
        this.drawable = drawable2;
    }

    public final void setStrokeColor(int i) {
        this.strokeColor = i;
    }

    public final void setStrokeWidth(int i) {
        this.strokeWidth = i;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSizeSP(float f) {
        this.textSizeSP = f;
    }

    public final void setText(int i) {
        this.textResId = i;
        this.text = "";
    }

    public final void setText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.text = str;
        this.textResId = -1;
    }

    public final void applyToView(UDButton uDButton) {
        Intrinsics.checkParameterIsNotNull(uDButton, "view");
        super.applyToView((View) uDButton);
        int i = this.textResId;
        if (i > -1) {
            uDButton.setText(i);
        } else {
            uDButton.setText(this.text);
        }
        uDButton.setTextColor(this.textColor);
        uDButton.setTextSize(this.textSizeSP);
        uDButton.setStrokeColor(this.strokeColor);
        uDButton.setStrokeWidth(this.strokeWidth);
    }
}
