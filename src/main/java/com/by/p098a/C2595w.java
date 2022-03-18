package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.framework.ui.flowlayout.FlowLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

/* renamed from: com.by.a.w */
public class C2595w implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FlowLayout flowLayout = new FlowLayout(context);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -1);
        LinkEmojiTextView linkEmojiTextView = new LinkEmojiTextView(context);
        linkEmojiTextView.setId(R.id.telephone_system_message);
        if (linkEmojiTextView instanceof TextView) {
            linkEmojiTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        linkEmojiTextView.setText("拨打电话的系统消息");
        linkEmojiTextView.setTextColor(resources.getColorStateList(R.color.text_title));
        linkEmojiTextView.setTextSize(2, 17.0f);
        linkEmojiTextView.setVisibility(0);
        ViewGroup.LayoutParams a2 = C0178a.m579a(flowLayout, -2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            ((ViewGroup.MarginLayoutParams) a2).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(linkEmojiTextView);
        if (linkEmojiTextView.getParent() == null) {
            flowLayout.addView(linkEmojiTextView, a2);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.call_back_layout);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a3 = C0178a.m579a(flowLayout, -2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(a3)) {
            ((LinearLayout.LayoutParams) a3).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a3)) {
            ((FrameLayout.LayoutParams) a3).gravity = 16;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(a3)) {
            ((DrawerLayout.LayoutParams) a3).f3665a = 16;
        }
        linearLayout.setGravity(16);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.call_tv);
        appCompatTextView.setText(R.string.Lark_Legacy_CallNow);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_link_normal));
        appCompatTextView.setTextSize(2, 17.0f);
        appCompatTextView.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.arrow_iv);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams2);
        }
        C0178a.m580a(linearLayout);
        if (linearLayout.getParent() == null) {
            flowLayout.addView(linearLayout, a3);
        }
        C0178a.m580a(flowLayout);
        flowLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(flowLayout);
        }
        return flowLayout;
    }
}
