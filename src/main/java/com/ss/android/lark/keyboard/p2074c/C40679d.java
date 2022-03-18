package com.ss.android.lark.keyboard.p2074c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.utils.ChatResourceCache;

/* renamed from: com.ss.android.lark.keyboard.c.d */
public class C40679d {
    /* renamed from: a */
    public static View m160785a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.btn_send);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        int dimens = UIUtils.getDimens(context, R.dimen.keyboard_icon_vertical_padding);
        int dimens2 = UIUtils.getDimens(context, R.dimen.keyboard_icon_horizontal_padding);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(ChatResourceCache.f88672a.mo126918a(context, R.drawable.ud_icon_send_colorful));
        imageView.setImageTintList(UIUtils.getColorStateList(context, R.color.kb_send_icon_color_selector));
        imageView.setEnabled(false);
        imageView.setClickable(true);
        imageView.setPadding(dimens2, dimens, 0, dimens);
        return imageView;
    }

    /* renamed from: a */
    public static AppCompatImageView m160786a(Context context, int i, int i2) {
        return m160787a(context, i, i2, true);
    }

    /* renamed from: b */
    public static AppCompatImageView m160788b(Context context, int i, int i2) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(i);
        Drawable a = ChatResourceCache.f88672a.mo126918a(context, i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        int dimens = UIUtils.getDimens(context, R.dimen.keyboard_icon_padding_ig_aa);
        appCompatImageView.setPadding(dimens, dimens, dimens, dimens);
        if (a != null) {
            a.setTintList(UIUtils.getColorStateList(context, R.color.kb_icon_color_selector));
        }
        Drawable a2 = ChatResourceCache.f88672a.mo126918a(context, R.drawable.kb_icon_bg_selector);
        appCompatImageView.setImageDrawable(a);
        appCompatImageView.setBackgroundDrawable(a2);
        appCompatImageView.setLayoutParams(layoutParams);
        return appCompatImageView;
    }

    /* renamed from: a */
    public static AppCompatImageView m160787a(Context context, int i, int i2, boolean z) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(i);
        appCompatImageView.setImageDrawable(ChatResourceCache.f88672a.mo126918a(context, i2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        appCompatImageView.setClickable(true);
        appCompatImageView.setFocusable(true);
        if (z) {
            appCompatImageView.setImageTintList(UIUtils.getColorStateList(context, R.color.kb_icon_color_selector));
            appCompatImageView.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        appCompatImageView.setLayoutParams(layoutParams);
        return appCompatImageView;
    }
}
