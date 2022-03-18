package com.ss.android.vc.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.vc.meeting.utils.SpanUtil;

public class IconFontView extends TextView {

    /* renamed from: a */
    private boolean f152019a = true;

    public void setOn(boolean z) {
        this.f152019a = z;
    }

    public IconFontView(Context context) {
        super(context);
        m236307a(context, null);
    }

    public IconFontView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236307a(context, attributeSet);
    }

    /* renamed from: a */
    private void m236307a(Context context, AttributeSet attributeSet) {
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

    public IconFontView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236307a(context, attributeSet);
    }
}
