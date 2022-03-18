package com.ss.android.lark.widget.richtext;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.C58377d;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

/* renamed from: com.ss.android.lark.widget.richtext.a */
public class C59027a {
    /* renamed from: a */
    private static LinkEmojiTextView m229129a(Context context) {
        LinkEmojiTextView linkEmojiTextView = new LinkEmojiTextView(context);
        linkEmojiTextView.setUrlTextColor(context.getResources().getColor(R.color.text_link_normal));
        linkEmojiTextView.setUrlBackGroundColor(context.getResources().getColor(R.color.bg_base));
        linkEmojiTextView.setCurrentUserId(C58377d.m226286a().mo102878a());
        return linkEmojiTextView;
    }

    /* renamed from: a */
    public static LinkEmojiTextView m229130a(Context context, LinkEmojiTextView.AbstractC58525j jVar, LinkEmojiTextView.AbstractC58521f fVar) {
        LinkEmojiTextView a = m229129a(context);
        a.setUrlStringClickListner(jVar);
        a.setAtStringClickListner(fVar);
        return a;
    }
}
