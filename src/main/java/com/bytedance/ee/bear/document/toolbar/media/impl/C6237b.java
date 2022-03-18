package com.bytedance.ee.bear.document.toolbar.media.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.media.impl.b */
public class C6237b extends C6236a {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, com.bytedance.ee.bear.document.toolbar.media.impl.C6236a
    /* renamed from: i */
    public View mo22135i() {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(1);
        View view = new View(getActivity());
        view.setBackgroundColor(getActivity().getResources().getColor(R.color.ud_N300));
        linearLayout.addView(view, new FrameLayout.LayoutParams(-1, C13749l.m55737a(1.0f)));
        View i = super.mo22135i();
        ViewGroup viewGroup = (ViewGroup) i.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        linearLayout.addView(i);
        return linearLayout;
    }
}
