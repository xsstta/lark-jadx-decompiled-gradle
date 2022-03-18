package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.d */
public class C12182d extends C12183e {
    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e
    /* renamed from: a */
    public void mo46612a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e
    public float getItemHeightInDp() {
        return 56.5f;
    }

    public C12182d(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e
    /* renamed from: a */
    public void mo46604a(Context context) {
        super.mo46604a(context);
        this.f32788e.setVisibility(8);
        this.f32795l.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32792i.getLayoutParams();
        layoutParams.setMargins(C13749l.m55737a(21.0f), 0, 0, 0);
        this.f32792i.setLayoutParams(layoutParams);
        this.f32793j.setText(getResources().getText(R.string.Doc_Wiki_Tree_HomeTitle));
        if (this.f32793j.getPaint() != null) {
            this.f32793j.getPaint().setFakeBoldText(true);
        }
        this.f32793j.setPadding(C13749l.m55737a(8.0f), 0, 0, 0);
    }
}
