package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundLinearLayout;
import com.larksuite.suite.R;

/* renamed from: com.by.a.x */
public class C2596x implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LKUIRoundLinearLayout lKUIRoundLinearLayout = new LKUIRoundLinearLayout(context);
        lKUIRoundLinearLayout.setRadiusInPx((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        lKUIRoundLinearLayout.setId(R.id.root);
        lKUIRoundLinearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.header_container);
        ViewGroup.MarginLayoutParams a2 = C0178a.m579a(lKUIRoundLinearLayout, -1, -2);
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            lKUIRoundLinearLayout.addView(frameLayout, a2);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.card_content_layout);
        ViewGroup.MarginLayoutParams a3 = C0178a.m579a(lKUIRoundLinearLayout, -1, -2);
        C0178a.m580a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            lKUIRoundLinearLayout.addView(frameLayout2, a3);
        }
        C0178a.m580a(lKUIRoundLinearLayout);
        lKUIRoundLinearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(lKUIRoundLinearLayout);
        }
        return lKUIRoundLinearLayout;
    }
}
