package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.suite.R;

class WikItemNoneView extends WikItemLeafView {
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: e */
    public void mo47657e() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: c */
    public void mo47655c() {
        super.mo47655c();
        this.f33543e.setVisibility(4);
        this.f33545g.setVisibility(8);
        this.f33547i.setVisibility(4);
        this.f33548j.setText(getResources().getString(R.string.CreationMobile_Wiki_NoSubpages_Placeholder));
        this.f33548j.setTextColor(getResources().getColor(R.color.text_caption));
        setEnabled(false);
    }

    public WikItemNoneView(Context context) {
        super(context);
    }

    public WikItemNoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
