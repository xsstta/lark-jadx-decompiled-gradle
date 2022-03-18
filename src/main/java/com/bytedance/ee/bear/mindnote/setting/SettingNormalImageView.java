package com.bytedance.ee.bear.mindnote.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SettingNormalImageView extends FrameLayout {

    /* renamed from: a */
    private View$OnClickListenerC10185d f27472a;

    public View$OnClickListenerC10185d getWrapper() {
        return this.f27472a;
    }

    public SettingNormalImageView(Context context) {
        super(context);
    }

    public void setWrapper(View$OnClickListenerC10185d dVar) {
        this.f27472a = dVar;
        setOnClickListener(dVar);
    }

    public SettingNormalImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingNormalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
