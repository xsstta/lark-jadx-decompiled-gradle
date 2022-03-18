package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

/* renamed from: com.by.a.v */
public class C2594v implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FlowLayout flowLayout = new FlowLayout(context);
        ViewGroup.MarginLayoutParams a = C0178a.m579a(viewGroup, -1, -1);
        LinkEmojiTextView linkEmojiTextView = new LinkEmojiTextView(context);
        linkEmojiTextView.setId(R.id.recall_text);
        linkEmojiTextView.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        linkEmojiTextView.setTextSize(2, 17.0f);
        ViewGroup.MarginLayoutParams a2 = C0178a.m579a(flowLayout, -2, -2);
        C0178a.m580a(linkEmojiTextView);
        if (linkEmojiTextView.getParent() == null) {
            flowLayout.addView(linkEmojiTextView, a2);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.recall_re_edit);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.p2p_build_group_text_color));
        appCompatTextView.setTextSize(2, 17.0f);
        ViewGroup.MarginLayoutParams a3 = C0178a.m579a(flowLayout, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a3)) {
            a3.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (appCompatTextView instanceof TextView) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, context.getResources().getDrawable(R.drawable.ic_svg_blue_right_arrow), (Drawable) null);
        }
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            flowLayout.addView(appCompatTextView, a3);
        }
        C0178a.m580a(flowLayout);
        flowLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(flowLayout);
        }
        return flowLayout;
    }
}
