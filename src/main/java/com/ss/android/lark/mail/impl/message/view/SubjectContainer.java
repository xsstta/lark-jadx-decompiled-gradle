package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.DeviceUtils;

public class SubjectContainer extends LinearLayout {
    public SubjectContainer(Context context) {
        super(context);
    }

    public SubjectContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(DeviceUtils.getScreenWidth(getContext()), 900000000);
    }
}
