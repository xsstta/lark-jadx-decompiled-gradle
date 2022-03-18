package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class WikItemHomeView extends WikItemLeafView {
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: a */
    public void mo47665a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    public float getItemHeightInDp() {
        return 56.5f;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikItemLeafView
    /* renamed from: c */
    public void mo47655c() {
        super.mo47655c();
        this.f33543e.setVisibility(8);
        this.f33550l.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f33547i.getLayoutParams();
        layoutParams.setMargins(C13749l.m55737a(21.0f), 0, 0, 0);
        this.f33547i.setLayoutParams(layoutParams);
        this.f33548j.setText(getResources().getText(R.string.Doc_Wiki_Tree_HomeTitle));
        if (this.f33548j.getPaint() != null) {
            this.f33548j.getPaint().setFakeBoldText(true);
        }
        this.f33548j.setPadding(C13749l.m55737a(8.0f), 0, 0, 0);
    }

    public WikItemHomeView(Context context) {
        super(context);
    }

    public WikItemHomeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
