package com.ss.android.openbusiness.activity;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;

/* renamed from: com.ss.android.openbusiness.activity.b */
public class C59478b {
    /* renamed from: a */
    public static void m230864a(final Context context, TextView textView, String str, int i, String str2, final int i2, final View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = str.length();
        int length2 = str2.length();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i)), 0, length, 34);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            /* class com.ss.android.openbusiness.activity.C59478b.C594791 */

            public void onClick(View view) {
                View.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }

            public void updateDrawState(TextPaint textPaint) {
                textPaint.setColor(ContextCompat.getColor(context, i2));
            }
        }, length, length2 + length, 34);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
