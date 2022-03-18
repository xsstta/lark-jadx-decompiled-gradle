package com.ss.android.lark.chatwindow.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.ui.SpareLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.utils.ChatResourceCache;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.status.UserStatusLinearLayout;

/* renamed from: com.ss.android.lark.chatwindow.view.c */
public class C35266c {
    /* renamed from: a */
    public static View m137762a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(context);
        lKUIRoundedImageView2.setId(R.id.chat_avatar_iv);
        lKUIRoundedImageView2.setOval(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(UIHelper.dp2px(32.0f), UIHelper.dp2px(32.0f));
        layoutParams.gravity = 16;
        linearLayout.addView(lKUIRoundedImageView2, layoutParams);
        TextView textView = new TextView(context);
        textView.setId(R.id.chat_name_tv);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextSize(16.0f);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(UIHelper.getColor(R.color.lkui_N900));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = UIHelper.dp2px(10.0f);
        layoutParams2.gravity = 16;
        linearLayout.addView(textView, layoutParams2);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.tag_wrapper);
        textView2.setGravity(8388611);
        textView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        linearLayout.addView(textView2, layoutParams3);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.setting_iv);
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_expand_right_filled, UIUtils.getColor(context, R.color.icon_n1)));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f));
        layoutParams4.leftMargin = UIHelper.dp2px(4.0f);
        layoutParams4.gravity = 16;
        linearLayout.addView(imageView, layoutParams4);
        return linearLayout;
    }

    /* renamed from: b */
    public static View m137765b(Context context, boolean z) {
        int i;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, 0, UIHelper.dp2px(2.0f), 0);
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setId(R.id.back);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setGravity(17);
        textView.setId(R.id.new_message_text);
        textView.setBackground(ChatResourceCache.f88672a.mo126918a(context, R.drawable.common_round11dp_gray_c6_bg));
        textView.setMinHeight(UIHelper.dp2px(22.0f));
        textView.setMinWidth(UIHelper.dp2px(22.0f));
        int dp2px = UIHelper.dp2px(6.0f);
        textView.setPadding(dp2px, 0, dp2px, 0);
        textView.setTextColor(linearLayout.getResources().getColor(R.color.text_title));
        textView.setTextSize(13.0f);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        ImageView imageView2 = new ImageView(linearLayout.getContext());
        imageView2.setId(R.id.close);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        linearLayout.addView(imageView2, layoutParams2);
        imageView2.setVisibility(8);
        if (z) {
            i = R.color.static_white;
        } else {
            i = R.color.icon_n1;
        }
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_left_outlined, UDColorUtils.getColor(context, i)));
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_close_outlined, UDColorUtils.getColor(context, i)));
        return linearLayout;
    }

    /* renamed from: a */
    public static View m137763a(Context context, boolean z) {
        int i;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        SpareLayout spareLayout = new SpareLayout(context);
        m137764a(context, spareLayout, z);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.addView(spareLayout, layoutParams);
        UserStatusLinearLayout userStatusLinearLayout = new UserStatusLinearLayout(context);
        userStatusLinearLayout.setId(R.id.user_status_layout);
        userStatusLinearLayout.setTextSize(11);
        userStatusLinearLayout.setTextColor(UIHelper.getColor(R.color.text_placeholder));
        userStatusLinearLayout.setTextMaxWidth(UIHelper.dp2px(175.0f));
        userStatusLinearLayout.mo201159c(0, UIHelper.dp2px(2.0f), 0, 0);
        userStatusLinearLayout.setIconVisibility(8);
        userStatusLinearLayout.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        linearLayout.addView(userStatusLinearLayout, layoutParams2);
        SpareLayout spareLayout2 = new SpareLayout(context);
        spareLayout2.setId(R.id.title_second_line);
        TextView textView = new TextView(spareLayout2.getContext());
        textView.setId(R.id.group_num);
        textView.setSingleLine();
        textView.setIncludeFontPadding(false);
        textView.setTextSize(12.0f);
        textView.setGravity(16);
        if (z) {
            i = R.color.static_white;
        } else {
            i = R.color.text_caption;
        }
        textView.setTextColor(spareLayout2.getResources().getColor(i));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams3.gravity = 16;
        spareLayout2.addView(textView, layoutParams3);
        linearLayout.addView(spareLayout2, layoutParams);
        return linearLayout;
    }

    /* renamed from: a */
    private static void m137764a(Context context, SpareLayout spareLayout, boolean z) {
        int i;
        TextView textView = new TextView(spareLayout.getContext());
        textView.setId(R.id.group_name);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(8388611);
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setTextSize(17.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        spareLayout.addView(textView, layoutParams);
        AppCompatImageView appCompatImageView = new AppCompatImageView(spareLayout.getContext());
        appCompatImageView.setId(R.id.custom_status_iv);
        appCompatImageView.setVisibility(8);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(UIHelper.dp2px(20.0f), UIHelper.dp2px(20.0f));
        layoutParams2.leftMargin = UIHelper.dp2px(4.0f);
        spareLayout.addView(appCompatImageView, layoutParams2);
        TextView textView2 = new TextView(spareLayout.getContext());
        textView2.setId(R.id.tag_wrapper);
        textView2.setGravity(8388611);
        textView2.setVisibility(8);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        spareLayout.addView(textView2, layoutParams3);
        ImageView imageView = new ImageView(spareLayout.getContext());
        imageView.setId(R.id.setting_iv);
        imageView.setVisibility(0);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(UIHelper.dp2px(12.0f), UIHelper.dp2px(12.0f));
        layoutParams4.leftMargin = UIHelper.dp2px(4.0f);
        layoutParams4.gravity = 16;
        spareLayout.addView(imageView, layoutParams4);
        int i2 = R.color.static_white;
        if (z) {
            i = R.color.static_white;
        } else {
            i = R.color.text_title;
        }
        if (!z) {
            i2 = R.color.icon_n1;
        }
        textView.setTextColor(spareLayout.getResources().getColor(i));
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(spareLayout.getContext(), (int) R.drawable.ud_icon_expand_right_filled, UDColorUtils.getColor(spareLayout.getContext(), i2)));
    }
}
