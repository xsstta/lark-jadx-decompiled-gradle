package com.by.p098a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.C0178a;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.by.inflate_lib.AbstractC2604b;
import com.larksuite.component.ui.layout.LKUIRoundableLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.core.view.TextChatView;

/* renamed from: com.by.a.y */
public class C2597y implements AbstractC2604b {
    @Override // com.by.inflate_lib.AbstractC2604b
    /* renamed from: a */
    public View mo11274a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.root_view);
        linearLayout.setOrientation(1);
        ViewGroup.LayoutParams a = C0178a.m579a(viewGroup, -2, -2);
        TextChatView textChatView = new TextChatView(context);
        textChatView.setId(R.id.text_content);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2825q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((ConstraintLayout.LayoutParams) layoutParams).f2816h = 0;
        }
        C0178a.m580a(textChatView);
        if (textChatView.getParent() == null) {
            linearLayout.addView(textChatView, layoutParams);
        }
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.text_translate_content);
        viewStub.setLayoutResource(R.layout.text_translate_content2);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        viewStub.setInflatedId(-1);
        C0178a.m580a(viewStub);
        if (viewStub.getParent() == null) {
            linearLayout.addView(viewStub, layoutParams2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.stub_container);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2825q = 0;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2817i = R.id.translate_content;
        }
        if (ConstraintLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((ConstraintLayout.LayoutParams) layoutParams3).f2819k = 0;
        }
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(R.id.url_preview_stub);
        viewStub2.setLayoutResource(R.layout.chat_message_preview_layout);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setInflatedId(-1);
        C0178a.m580a(viewStub2);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2, layoutParams4);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.doc_card_container);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        C0178a.m580a(frameLayout2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2, layoutParams5);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setId(R.id.url_net_preview_margin_container);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        LKUIRoundableLayout lKUIRoundableLayout = new LKUIRoundableLayout(context);
        lKUIRoundableLayout.setId(R.id.url_net_preview_container);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
        C0178a.m580a(lKUIRoundableLayout);
        if (lKUIRoundableLayout.getParent() == null) {
            frameLayout3.addView(lKUIRoundableLayout, layoutParams7);
        }
        C0178a.m580a(frameLayout3);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3, layoutParams6);
        }
        C0178a.m580a(frameLayout);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout, layoutParams3);
        }
        C0178a.m580a(linearLayout);
        linearLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }
}
