package com.larksuite.component.ui.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.Button;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUIButton extends Button {
    public LKUIButton(Context context) {
        this(context, null);
    }

    private void setLargeButtonStyle(Context context) {
        setHeight((int) C25653b.m91892a(context, 48.0f));
    }

    private void setCommonButtonStyle(Context context) {
        setHeight((int) C25653b.m91892a(context, 28.0f));
        setMinWidth((int) C25653b.m91892a(context, 60.0f));
        setPadding((int) C25653b.m91892a(context, 12.0f), 0, (int) C25653b.m91892a(context, 12.0f), 0);
    }

    private void setCustomStyle(TypedArray typedArray) {
        setBackground(C25632b.m91706a(typedArray.getColor(2, getResources().getColor(R.color.ud_B500)), typedArray.getColor(3, getResources().getColor(R.color.ud_B500)), typedArray.getColor(1, getResources().getColor(R.color.ud_B200)), typedArray.getDimensionPixelSize(0, 0), typedArray.getColor(4, getResources().getColor(R.color.ud_B500)), typedArray.getDimensionPixelSize(5, 0)));
    }

    public LKUIButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUIButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m91678a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m91678a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.button_corner_radius, R.attr.button_disable_color, R.attr.button_normal_color, R.attr.button_pressed_color, R.attr.button_stroke_color, R.attr.button_stroke_width, R.attr.button_style}, i, 0);
        switch (obtainStyledAttributes.getInt(6, 0)) {
            case 1:
                setTextAppearance(context, R.style.LargeBlueButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_blue_bg));
                setLargeButtonStyle(context);
                break;
            case 2:
                setTextAppearance(context, R.style.LargeLightButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_large_light_bg));
                setLargeButtonStyle(context);
                break;
            case 3:
                setTextAppearance(context, R.style.LargeGreyButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_large_grey_bg));
                setLargeButtonStyle(context);
                break;
            case 4:
                setTextAppearance(context, R.style.BlueButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_blue_bg));
                setCommonButtonStyle(context);
                break;
            case 5:
                setTextAppearance(context, R.style.LightButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_light_blue_border_bg));
                setCommonButtonStyle(context);
                break;
            case 6:
                setTextAppearance(context, R.style.LightButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_light_grey_border_bg));
                setCommonButtonStyle(context);
                break;
            case 7:
                setTextAppearance(context, R.style.GreyButton);
                setBackground(getResources().getDrawable(R.drawable.lkui_button_light_grey_border_bg));
                setCommonButtonStyle(context);
                break;
            default:
                setCustomStyle(obtainStyledAttributes);
                break;
        }
        obtainStyledAttributes.recycle();
        setGravity(17);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }
}
