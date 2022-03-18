package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chatbase.view.ChatImageGroup;

/* renamed from: com.by.a.j */
public class C2582j implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setBorderColor(resources.getColor(R.color.line_border_card));
        lKUIRoundableLayout.setBorderWidthInPx(TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        lKUIRoundableLayout.setRadiusInPx((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        lKUIRoundableLayout.setId(R.id.round_container);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        ChatImageGroup chatImageGroup = new ChatImageGroup(context);
        chatImageGroup.setId(R.id.image);
        ViewGroup.MarginLayoutParams a2 = C0178a.m579a(lKUIRoundableLayout, -2, -2);
        C0178a.m580a(chatImageGroup);
        if (chatImageGroup.getParent() == null) {
            lKUIRoundableLayout.addView(chatImageGroup, a2);
        }
        C0178a.m580a(lKUIRoundableLayout);
        lKUIRoundableLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(lKUIRoundableLayout);
        }
        return lKUIRoundableLayout;
    }
}
