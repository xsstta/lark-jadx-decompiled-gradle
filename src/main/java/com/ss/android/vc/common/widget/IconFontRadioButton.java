package com.ss.android.vc.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ss.android.vc.meeting.utils.SpanUtil;

public class IconFontRadioButton extends RadioButton {
    public IconFontRadioButton(Context context) {
        super(context);
        m236306a(context, null);
    }

    public IconFontRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236306a(context, attributeSet);
    }

    /* renamed from: a */
    private void m236306a(Context context, AttributeSet attributeSet) {
        setTypeface(SpanUtil.f160471a.mo219671a());
        setIncludeFontPadding(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842927});
            if (obtainStyledAttributes.getInt(0, 0) == 0) {
                setGravity(17);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public IconFontRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236306a(context, attributeSet);
    }
}
