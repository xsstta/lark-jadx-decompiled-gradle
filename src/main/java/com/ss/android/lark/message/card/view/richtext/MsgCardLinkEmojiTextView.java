package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.larksuite.framework.utils.Reflect;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;

public class MsgCardLinkEmojiTextView extends LinkEmojiTextView {

    /* renamed from: E */
    private static final char[] f114787E;

    /* renamed from: F */
    private static final String f114788F;

    /* renamed from: G */
    private int f114789G = Integer.MAX_VALUE;

    static {
        char[] cArr = {8230};
        f114787E = cArr;
        f114788F = new String(cArr);
    }

    /* renamed from: b */
    private void m180037b() {
        Layout layout = getLayout();
        if (Build.VERSION.SDK_INT == 26 && layout != null && (layout instanceof DynamicLayout)) {
            m180036a((DynamicLayout) layout);
        }
    }

    /* renamed from: c */
    private void m180038c() {
        int i;
        SpannableString spannableString;
        int i2 = this.f114789G;
        CharSequence text = getText();
        if (i2 > 1 && i2 < Integer.MAX_VALUE && !TextUtils.isEmpty(text) && (text instanceof Spanned) && getLineCount() > i2) {
            Spanned spanned = (Spanned) text;
            CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), (float) (((getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) * i2), TextUtils.TruncateAt.END);
            int length = (ellipsize.length() - 1) - 1;
            if (m180035a(ellipsize).getLineCount() > i2) {
                long currentTimeMillis = System.currentTimeMillis();
                int i3 = 0;
                while (true) {
                    i = i3 + 1;
                    int i4 = length - 1;
                    spannableString = new SpannableString(((Object) ellipsize.subSequence(0, i4)) + f114788F);
                    TextUtils.copySpansFrom(spanned, 0, spannableString.length(), Object.class, spannableString, 0);
                    if (m180035a((CharSequence) spannableString).getLineCount() <= i2) {
                        break;
                    }
                    i3 = i;
                    length = i4;
                }
                Log.m165379d("MsgCardLinkEmojiTextView", "count: " + i + ", duration: " + (System.currentTimeMillis() - currentTimeMillis));
                ellipsize = spannableString;
            }
            setText(ellipsize);
        }
    }

    public void setMaxLines(int i) {
        this.f114789G = i;
        super.setMaxLines(i);
    }

    public MsgCardLinkEmojiTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private void m180036a(DynamicLayout dynamicLayout) {
        try {
            Reflect.m94918a(dynamicLayout).mo93334a("sStaticLayout", (Object) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private StaticLayout m180035a(CharSequence charSequence) {
        return new StaticLayout(charSequence, getPaint(), (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), false);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView
    public void onMeasure(int i, int i2) {
        m180037b();
        super.onMeasure(i, i2);
    }

    public MsgCardLinkEmojiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsgCardLinkEmojiTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        try {
            m180038c();
        } catch (Throwable th) {
            Log.m165386e("emoji-text", th);
        }
    }
}
