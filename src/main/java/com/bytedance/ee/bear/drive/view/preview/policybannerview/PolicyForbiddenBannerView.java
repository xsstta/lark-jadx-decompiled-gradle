package com.bytedance.ee.bear.drive.view.preview.policybannerview;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;

public class PolicyForbiddenBannerView extends UDNotice {
    public void setTitle(String str) {
    }

    /* renamed from: a */
    private void m29701a() {
        setType(UDNotice.Type.ERROR);
        setIconColorful(true);
        setIcon(R.drawable.ud_icon_error_colorful);
    }

    public void setTip(String str) {
        setText(str);
    }

    public PolicyForbiddenBannerView(Context context) {
        this(context, null);
    }

    public PolicyForbiddenBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PolicyForbiddenBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29701a();
    }
}
