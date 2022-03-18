package com.ss.android.lark.threaddetail.view;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.threaddetail.view.b */
public class C55869b extends CharacterStyle {
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFakeBoldText(true);
    }

    /* renamed from: a */
    public static CharSequence m217003a(int i) {
        SpannableString spannableString = new SpannableString(UIHelper.getString(i));
        spannableString.setSpan(new C55869b(), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* renamed from: a */
    public static CharSequence m217004a(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C55869b(), 0, spannableString.length(), 33);
        return spannableString;
    }
}
