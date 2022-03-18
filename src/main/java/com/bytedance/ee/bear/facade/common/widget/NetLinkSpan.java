package com.bytedance.ee.bear.facade.common.widget;

import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.ee.bear.facade.common.widget.ErrorTipsView;
import com.bytedance.ee.log.C13479a;

public class NetLinkSpan extends URLSpan {

    /* renamed from: a */
    private String f20856a;

    /* renamed from: b */
    private ErrorTipsView.AbstractC7725a f20857b;

    public void onClick(View view) {
        C13479a.m54772d("NetLinkSpan", "onClicked... ready to jump to url : " + this.f20856a);
        ErrorTipsView.AbstractC7725a aVar = this.f20857b;
        if (aVar != null) {
            aVar.mo24919a("linkUrl", this.f20856a);
        }
    }
}
