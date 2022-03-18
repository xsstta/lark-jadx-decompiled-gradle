package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.core.view.PostChatView;

/* renamed from: com.by.a.s */
public class C2591s implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.root_view);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        PostChatView postChatView = new PostChatView(context);
        postChatView.setId(R.id.chat_post);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2825q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2816h = 0;
        }
        C0178a.m580a(postChatView);
        if (postChatView.getParent() == null) {
            linearLayout.addView(postChatView, layoutParams);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R.id.tv_group_announcement_detail);
        appCompatTextView.setBackgroundResource(R.drawable.bg_announce_detail);
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        appCompatTextView.setText(R.string.Lark_Legacy_ViewDetailsButton);
        appCompatTextView.setTextColor(resources.getColorStateList(R.color.lkui_N900));
        appCompatTextView.setTextSize(2, 14.0f);
        appCompatTextView.setTypeface(Typeface.defaultFromStyle(1));
        appCompatTextView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 1;
        }
        if (DrawerLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((DrawerLayout.LayoutParams) layoutParams2).f3665a = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            ((ViewGroup.MarginLayoutParams) ((ViewGroup.MarginLayoutParams) layoutParams2)).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        appCompatTextView.setGravity(17);
        C0178a.m580a(appCompatTextView);
        if (appCompatTextView.getParent() == null) {
            linearLayout.addView(appCompatTextView, layoutParams2);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.post_translate_content);
        viewStub.setLayoutResource(R.layout.post_translate_content2);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        viewStub.setInflatedId(-1);
        C0178a.m580a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams3);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.stub_container);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.url_preview_stub);
        viewStub2.setLayoutResource(R.layout.chat_message_preview_layout);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setInflatedId(-1);
        C0178a.m580a(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams5);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.doc_card_container);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        C0178a.m580a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams6);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.url_net_preview_margin_container);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setId(R.id.url_net_preview_container);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
        C0178a.m580a(lKUIRoundableLayout);
        if (lKUIRoundableLayout.getParent() == null) {
            frameLayout3.addView(lKUIRoundableLayout, layoutParams8);
        }
        C0178a.m580a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams7);
        }
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams4);
        }
        C0178a.m580a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
