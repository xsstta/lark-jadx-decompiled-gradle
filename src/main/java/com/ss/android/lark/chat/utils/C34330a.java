package com.ss.android.lark.chat.utils;

import android.content.Context;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import com.ss.android.lark.widget.richtext.RichTextView;

/* renamed from: com.ss.android.lark.chat.utils.a */
public class C34330a {

    /* renamed from: a */
    public static final int static_white = 2131101798;

    /* renamed from: b */
    public static final int primary_pri_500 = 2131100966;

    /* renamed from: c */
    public static final int f88659c = 2131100315;

    /* renamed from: d */
    public static final int primary_pri_200 = 2131100961;

    /* renamed from: e */
    public static final int f88660e = 2131100315;

    /* renamed from: a */
    public static void m133106a(LinkEmojiTextView linkEmojiTextView, boolean z) {
        Context context = linkEmojiTextView.getContext();
        int i = f88659c;
        int i2 = static_white;
        int i3 = primary_pri_500;
        int k = C33360a.m129167k(z);
        int h = C33360a.m129164h(z);
        int h2 = C33360a.m129164h(z);
        int c = C52990a.m205239c(context, primary_pri_200);
        int c2 = C52990a.m205239c(context, f88660e);
        linkEmojiTextView.setAtTextColor(i);
        linkEmojiTextView.setAtSelfTextColor(i2);
        linkEmojiTextView.setAtSelfBgColor(i3);
        linkEmojiTextView.setAtOtherChatUserTextColor(k);
        linkEmojiTextView.setUrlTextColor(h);
        linkEmojiTextView.setPhoneTextColor(h2);
        linkEmojiTextView.setHighlightColor(c);
        linkEmojiTextView.setDefaultAtUserColor(c2);
        linkEmojiTextView.setDotReadColor(C33360a.m129168l(z));
        linkEmojiTextView.setDotUnreadColor(C33360a.m129169m(z));
        linkEmojiTextView.setIsUrlShowUnderLine(false);
    }

    /* renamed from: a */
    public static void m133107a(RichTextView richTextView, boolean z) {
        Context context = richTextView.getContext();
        int i = f88659c;
        int i2 = static_white;
        int i3 = primary_pri_500;
        int k = C33360a.m129167k(z);
        int h = C33360a.m129164h(z);
        int h2 = C33360a.m129164h(z);
        int c = C52990a.m205239c(context, primary_pri_200);
        int c2 = C52990a.m205239c(context, f88660e);
        richTextView.setAtTextColor(i);
        richTextView.setAtSelfTextColor(i2);
        richTextView.setAtSelfBgColor(i3);
        richTextView.setAtOtherChatUserTextColor(k);
        richTextView.setUrlTextColor(h);
        richTextView.setPhoneTextColor(h2);
        richTextView.setHighlightColor(c);
        richTextView.setDefaultAtUserColor(c2);
        richTextView.setDotReadColor(C33360a.m129168l(z));
        richTextView.setDotUnreadColor(C33360a.m129169m(z));
        richTextView.setIsUrlShowUnderLine(false);
    }
}
