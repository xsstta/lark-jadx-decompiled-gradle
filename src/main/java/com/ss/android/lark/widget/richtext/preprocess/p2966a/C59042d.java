package com.ss.android.lark.widget.richtext.preprocess.p2966a;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.RichTextElement;
import com.ss.android.lark.widget.span.PrefixSpan;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.preprocess.a.d */
public class C59042d {
    /* renamed from: a */
    private static boolean m229247a(RichTextElement.RichTextTag richTextTag) {
        if (richTextTag == RichTextElement.RichTextTag.QUOTE || richTextTag == RichTextElement.RichTextTag.LI) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m229244a(StringBuilder sb) {
        if (!TextUtils.isEmpty(sb) && !m229248a((CharSequence) sb)) {
            sb.append("\n");
        }
    }

    /* renamed from: a */
    public static void m229241a(SpannableStringBuilder spannableStringBuilder) {
        while (spannableStringBuilder.length() > 0 && m229249a(spannableStringBuilder, 0)) {
            spannableStringBuilder.delete(0, 1);
        }
        while (spannableStringBuilder.length() > 0 && m229249a(spannableStringBuilder, spannableStringBuilder.length() - 1)) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: a */
    public static boolean m229248a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(charSequence.length() - 1) != '\n') {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <T> void m229242a(SpannableStringBuilder spannableStringBuilder, Class<T> cls) {
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls);
        if (spans != null && spans.length > 0) {
            for (Object obj : spans) {
                spannableStringBuilder.delete(spannableStringBuilder.getSpanStart(obj), spannableStringBuilder.getSpanEnd(obj));
            }
        }
    }

    /* renamed from: a */
    public static void m229243a(RichTextElement richTextElement, Map<String, RichTextElement> map) {
        List<String> childIds = richTextElement.getChildIds();
        if (childIds != null) {
            for (String str : childIds) {
                RichTextElement richTextElement2 = map.get(str);
                if (richTextElement2 != null) {
                    richTextElement2.getElementExtra().setIgnore(true);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m229245a(StringBuilder sb, RichTextElement.RichTextTag richTextTag) {
        if (!TextUtils.isEmpty(sb)) {
            if (m229247a(richTextTag)) {
                Log.m165379d("ParserUtils", "skip enter, lastElement is:" + richTextTag);
                return;
            }
            sb.append("\n");
        }
    }

    /* renamed from: a */
    private static boolean m229249a(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence) || i >= charSequence.length()) {
            return false;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '\n' || charAt == ' ') {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m229246a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (!TextUtils.isEmpty(spannableStringBuilder) && i < i2) {
            PrefixSpan[] prefixSpanArr = (PrefixSpan[]) spannableStringBuilder.getSpans(i, i2, PrefixSpan.class);
            for (PrefixSpan prefixSpan : prefixSpanArr) {
                if (prefixSpan != null && prefixSpan.mo201008a() == PrefixSpan.Type.QUOTE) {
                    return true;
                }
            }
        }
        return false;
    }
}
