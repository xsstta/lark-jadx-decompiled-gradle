package com.ss.android.lark.calendar.impl.utils;

import android.os.Build;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.span.C59176n;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.lark.calendar.impl.utils.r */
public class C32666r {

    /* renamed from: com.ss.android.lark.calendar.impl.utils.r$a */
    public static class C32667a extends ClickableSpan {

        /* renamed from: a */
        private String f83809a;

        /* renamed from: b */
        private int f83810b = C32634ae.m125178a(R.color.lkui_B300);

        /* renamed from: c */
        private AbstractC32668a f83811c;

        /* renamed from: com.ss.android.lark.calendar.impl.utils.r$a$a */
        public interface AbstractC32668a {
            void onClick(String str);
        }

        public void onClick(View view) {
            this.f83811c.onClick(this.f83809a);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f83810b);
            textPaint.setUnderlineText(true);
        }

        public C32667a(String str, AbstractC32668a aVar) {
            this.f83809a = str;
            this.f83811c = aVar;
        }
    }

    /* renamed from: a */
    public static CharSequence m125358a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: a */
    public static SpannableStringBuilder m125357a(String str, C32667a.AbstractC32668a aVar) {
        Spanned fromHtml = Html.fromHtml(str);
        int length = fromHtml.length();
        Spannable spannable = (Spannable) fromHtml;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        spannableStringBuilder.clearSpans();
        StyleSpan[] styleSpanArr = (StyleSpan[]) spannable.getSpans(0, length, StyleSpan.class);
        for (StyleSpan styleSpan : styleSpanArr) {
            spannableStringBuilder.setSpan(styleSpan, spannable.getSpanStart(styleSpan), spannable.getSpanEnd(styleSpan), 33);
        }
        UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) spannable.getSpans(0, length, UnderlineSpan.class);
        for (UnderlineSpan underlineSpan : underlineSpanArr) {
            spannableStringBuilder.setSpan(underlineSpan, spannable.getSpanStart(underlineSpan), spannable.getSpanEnd(underlineSpan), 33);
        }
        BulletSpan[] bulletSpanArr = (BulletSpan[]) spannable.getSpans(0, length, BulletSpan.class);
        for (BulletSpan bulletSpan : bulletSpanArr) {
            spannableStringBuilder.setSpan(bulletSpan, spannable.getSpanStart(bulletSpan), spannable.getSpanEnd(bulletSpan), 33);
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, length, URLSpan.class);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableStringBuilder.setSpan(new C32667a(uRLSpan.getURL(), aVar), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 33);
        }
        Matcher matcher = C59176n.m229858b().matcher(fromHtml);
        while (matcher.find()) {
            spannableStringBuilder.setSpan(new C32667a(matcher.group(), aVar), matcher.start(), matcher.end(), 33);
        }
        return spannableStringBuilder;
    }
}
