package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.framework.ui.SpareLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.view.widget.WidthLimitRelativeLayout;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;

/* renamed from: com.by.a.g */
public class C2579g implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Resources resources = context.getResources();
        WidthLimitRelativeLayout widthLimitRelativeLayout = new WidthLimitRelativeLayout(context);
        widthLimitRelativeLayout.setId(R.id.reply_group);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        widthLimitRelativeLayout.setGravity(16);
        SpareLayout spareLayout = new SpareLayout(context);
        spareLayout.setId(R.id.reply_left_layout);
        ViewGroup.LayoutParams a2 = C0178a.m579a(widthLimitRelativeLayout, -2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a2)) {
            ((RelativeLayout.LayoutParams) a2).addRule(9, -1);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a3 = C0178a.m579a(spareLayout, -2, -2);
        linearLayout.setGravity(16);
        View view = new View(context);
        view.setId(R.id.reply_bubble);
        view.setBackgroundResource(R.drawable.chat_chat_bubble_reply_mark_bg);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics()));
        C0178a.m580a(view);
        if (view.getParent() == null) {
            linearLayout.addView(view, layoutParams);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.reply_name);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        appCompatTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        appCompatTextView.setGravity(16);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams2);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            spareLayout.addView(linearLayout, a3);
        }
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setId(R.id.reply_image_container);
        lKUIRoundableLayout.setBackgroundColor(resources.getColor(R.color.lkui_N00));
        lKUIRoundableLayout.setVisibility(8);
        ViewGroup.LayoutParams a4 = C0178a.m579a(spareLayout, -2, -2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.reply_content_image);
        appCompatImageView.setVisibility(8);
        ViewGroup.MarginLayoutParams a5 = C0178a.m579a(lKUIRoundableLayout, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            lKUIRoundableLayout.addView(appCompatImageView, a5);
        }
        C0178a.m580a(lKUIRoundableLayout);
        if (lKUIRoundableLayout.getParent() == null) {
            spareLayout.addView(lKUIRoundableLayout, a4);
        }
        C0178a.m580a(spareLayout);
        if (spareLayout.getParent() == null) {
            widthLimitRelativeLayout.addView(spareLayout, a2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.reply_content);
        ViewGroup.LayoutParams a6 = C0178a.m579a(widthLimitRelativeLayout, -2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(a6)) {
            i = 1;
            ((RelativeLayout.LayoutParams) a6).addRule(1, R.id.reply_left_layout);
        } else {
            i = 1;
        }
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = new EllipsizedEmojiconTextView(context);
        ellipsizedEmojiconTextView.setId(R.id.reply_content_text);
        ellipsizedEmojiconTextView.setEllipsize(TextUtils.TruncateAt.END);
        ellipsizedEmojiconTextView.setMaxLines(i);
        ellipsizedEmojiconTextView.setTextColor(resources.getColorStateList(R.color.text_placeholder));
        ellipsizedEmojiconTextView.setTextSize(2, 14.0f);
        ellipsizedEmojiconTextView.setVisibility(0);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        ellipsizedEmojiconTextView.setGravity(16);
        C0178a.m580a(ellipsizedEmojiconTextView);
        if (ellipsizedEmojiconTextView.getParent() == null) {
            frameLayout.addView(ellipsizedEmojiconTextView, layoutParams3);
        }
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = new EllipsizedEmojiconTextView(context);
        ellipsizedEmojiconTextView2.setId(R.id.reply_content_thread);
        ellipsizedEmojiconTextView2.setEllipsize(TextUtils.TruncateAt.END);
        ellipsizedEmojiconTextView2.setMaxLines(1);
        ellipsizedEmojiconTextView2.setTextColor(resources.getColorStateList(R.color.lkui_B500));
        ellipsizedEmojiconTextView2.setTextSize(2, 14.0f);
        ellipsizedEmojiconTextView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        ellipsizedEmojiconTextView2.setGravity(16);
        C0178a.m580a(ellipsizedEmojiconTextView2);
        if (ellipsizedEmojiconTextView2.getParent() == null) {
            frameLayout.addView(ellipsizedEmojiconTextView2, layoutParams4);
        }
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            widthLimitRelativeLayout.addView(frameLayout, a6);
        }
        C0178a.m580a(widthLimitRelativeLayout);
        widthLimitRelativeLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(widthLimitRelativeLayout);
        }
        return widthLimitRelativeLayout;
    }
}
