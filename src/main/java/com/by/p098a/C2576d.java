package com.by.p098a;

import android.content.Context;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.suite.R;

/* renamed from: com.by.a.d */
public class C2576d implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -1, -1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.chat_message_unkown_content);
        appCompatTextView.setTextSize(2, 17.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams);
        }
        C0178a.m580a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
