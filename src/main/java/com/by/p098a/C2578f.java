package com.by.p098a;

import android.content.Context;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.suite.R;

/* renamed from: com.by.a.f */
public class C2578f implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.chat_window_keyboard_container);
        C0178a.m580a(frameLayout);
        frameLayout.setLayoutParams(C0178a.m579a(viewGroup, -1, -2));
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }
}
