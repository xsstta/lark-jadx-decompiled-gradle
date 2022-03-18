package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

/* renamed from: com.by.a.c */
public class C2575c implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.root_view);
        linearLayout.setOrientation(0);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -1, -2);
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setId(R.id.audio_view_container);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setId(R.id.audio_view);
        linearLayout2.setOrientation(1);
        ViewGroup.LayoutParams a2 = C0178a.m579a(lKUIRoundableLayout, -2, -2);
        linearLayout2.setGravity(16);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.edited_text_tv);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        appCompatTextView.setLineSpacing(resources.getDimension(R.dimen.text_default_line_spacing), 1.0f);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout2.addView(appCompatTextView, layoutParams2);
        }
        PlayControlBar playControlBar = new PlayControlBar(context);
        playControlBar.setId(R.id.play_cb);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        C0178a.m580a(playControlBar);
        if (playControlBar.getParent() == null) {
            linearLayout2.addView(playControlBar, layoutParams3);
        }
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R.id.recognized_text_tv);
        appCompatTextView2.setTextColor(resources.getColorStateList(R.color.text_title));
        appCompatTextView2.setTextSize(2, 17.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        appCompatTextView2.setLineSpacing(resources.getDimension(R.dimen.text_default_line_spacing), 1.0f);
        C0178a.m580a(appCompatTextView2);
        if (appCompatTextView2.getParent() == null) {
            linearLayout2.addView(appCompatTextView2, layoutParams4);
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
        appCompatTextView3.setId(R.id.recognized_text_flag);
        boolean z2 = appCompatTextView3 instanceof TextView;
        if (z2) {
            appCompatTextView3.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        appCompatTextView3.setText(R.string.Lark_Chat_AudioConvertToTextSuccess);
        appCompatTextView3.setTextColor(resources.getColorStateList(R.color.text_caption));
        appCompatTextView3.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (z2) {
            appCompatTextView3.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(R.drawable.ic_svg_chat_audio_message_text_flag_gray_n500), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        C0178a.m580a(appCompatTextView3);
        if (appCompatTextView3.getParent() == null) {
            linearLayout2.addView(appCompatTextView3, layoutParams5);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.text_translate_content);
        viewStub.setLayoutResource(R.layout.audio_content_text_translation);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        viewStub.setInflatedId(-1);
        C0178a.m580a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout2.addView(viewStub, layoutParams6);
        }
        C0178a.m580a(linearLayout2);
        if (linearLayout2.getParent() == null) {
            lKUIRoundableLayout.addView(linearLayout2, a2);
        }
        C0178a.m580a(lKUIRoundableLayout);
        if (lKUIRoundableLayout.getParent() == null) {
            linearLayout.addView(lKUIRoundableLayout, layoutParams);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.unread_tip_iv);
        appCompatImageView.setBackgroundResource(R.drawable.common_radius6dp_color_c15);
        ViewGroup.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((FrameLayout.LayoutParams) layoutParams7).gravity = 48;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((DrawerLayout.LayoutParams) layoutParams7).f3665a = 48;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7) && Build.VERSION.SDK_INT >= 17) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        }
        C0178a.m580a(appCompatImageView);
        if (appCompatImageView.getParent() == null) {
            linearLayout.addView(appCompatImageView, layoutParams7);
        }
        C0178a.m580a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
