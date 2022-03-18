package com.bytedance.ee.bear.mindnote.setting;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.facade.common.widget.NiceImageView;

public class SettingRoundImageView extends NiceImageView {

    /* renamed from: a */
    private View$OnClickListenerC10185d f27473a;

    public View$OnClickListenerC10185d getWrapper() {
        return this.f27473a;
    }

    public SettingRoundImageView(Context context) {
        super(context);
    }

    public void setWrapper(View$OnClickListenerC10185d dVar) {
        this.f27473a = dVar;
        setOnClickListener(dVar);
    }

    public SettingRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
