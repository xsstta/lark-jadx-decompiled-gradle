package com.ss.android.lark.utils;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.utils.ag */
public class C57782ag {
    /* renamed from: b */
    public static String m224244b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public static boolean m224241a(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() <= 0;
    }

    /* renamed from: a */
    public static boolean m224242a(String str, String str2) {
        if (str == null || str2 == null) {
            return str == str2;
        }
        return str.trim().toLowerCase().equals(str2.trim().toLowerCase());
    }

    /* renamed from: a */
    public static CharSequence m224237a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        if (charSequence.length() < 100) {
            return charSequence;
        }
        return charSequence.subSequence(0, 100);
    }

    /* renamed from: b */
    private static CharSequence m224243b(CharSequence charSequence, String str) {
        ReplacementSpan[] replacementSpanArr;
        if (TextUtils.isEmpty(charSequence)) {
            Log.m165382e("getHighColorMessageAfter failed: text is empty");
            return "";
        } else if (TextUtils.isEmpty(str)) {
            return charSequence;
        } else {
            CharSequence a = m224240a(charSequence, "\n", "");
            String lowerCase = a.toString().toLowerCase();
            String lowerCase2 = str.toLowerCase();
            if (!lowerCase.contains(lowerCase2)) {
                return "";
            }
            try {
                int indexOf = lowerCase.indexOf(lowerCase2);
                if (lowerCase2.length() + indexOf == lowerCase.length()) {
                    return "";
                }
                if (!(a instanceof Spannable) || (replacementSpanArr = (ReplacementSpan[]) ((Spannable) a).getSpans(indexOf, lowerCase2.length() + indexOf, ReplacementSpan.class)) == null || replacementSpanArr.length <= 0) {
                    return a.subSequence(indexOf + str.length(), a.length());
                }
                int length = indexOf + lowerCase2.length();
                for (ReplacementSpan replacementSpan : replacementSpanArr) {
                    length = Math.max(length, ((Spannable) a).getSpanEnd(replacementSpan));
                }
                return a.subSequence(length, a.length());
            } catch (Exception e) {
                Log.m165382e("getHighColorMessageAfter failed: " + e.getMessage());
                return "";
            }
        }
    }

    /* renamed from: a */
    private static CharSequence m224239a(CharSequence charSequence, String str) {
        ReplacementSpan[] replacementSpanArr;
        if (TextUtils.isEmpty(charSequence)) {
            Log.m165382e("getHighColorMessageBefore failed: text is empty");
            return "";
        } else if (TextUtils.isEmpty(str)) {
            return charSequence;
        } else {
            CharSequence a = m224240a(charSequence, "\n", "");
            String lowerCase = a.toString().toLowerCase();
            String lowerCase2 = str.toLowerCase();
            if (!lowerCase.contains(lowerCase2)) {
                return "";
            }
            try {
                int indexOf = lowerCase.indexOf(lowerCase2);
                if (!(a instanceof Spannable) || (replacementSpanArr = (ReplacementSpan[]) ((Spannable) a).getSpans(indexOf, lowerCase2.length() + indexOf, ReplacementSpan.class)) == null || replacementSpanArr.length <= 0) {
                    return a.subSequence(0, indexOf);
                }
                int length = indexOf + lowerCase2.length();
                for (ReplacementSpan replacementSpan : replacementSpanArr) {
                    length = Math.max(length, ((Spannable) a).getSpanEnd(replacementSpan));
                }
                return a.subSequence(0, length);
            } catch (Exception e) {
                Log.m165382e("getHighColorMessageBefore failed: " + e.getMessage());
                return "";
            }
        }
    }

    /* renamed from: a */
    public static SpannableString m224234a(CharSequence charSequence, CharSequence charSequence2, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(charSequence2.toString())) {
            str = "";
        } else {
            str = charSequence2.toString();
        }
        arrayList.add(str);
        return m224235a(charSequence.toString(), arrayList, i);
    }

    /* renamed from: a */
    public static SpannableString m224235a(CharSequence charSequence, List<String> list, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            Log.m165382e("high color failed: text is empty");
            return new SpannableString("");
        }
        SpannableString valueOf = SpannableString.valueOf(m224237a(charSequence));
        if (CollectionUtils.isEmpty(list)) {
            return valueOf;
        }
        String lowerCase = m224237a(charSequence).toString().toLowerCase();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                String lowerCase2 = str.toLowerCase();
                if (lowerCase.contains(lowerCase2)) {
                    try {
                        Matcher matcher = Pattern.compile(Pattern.quote(lowerCase2)).matcher(lowerCase);
                        while (matcher.find()) {
                            valueOf.setSpan(new ForegroundColorSpan(i), matcher.start(), matcher.end(), 33);
                        }
                    } catch (Exception e) {
                        Log.m165382e("high color failed: " + e.getMessage());
                    }
                }
            }
        }
        return valueOf;
    }

    /* renamed from: a */
    private static CharSequence m224240a(CharSequence charSequence, String str, String str2) {
        if (str == null || str2 == null || charSequence == null) {
            return charSequence;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).replaceAll(str, str2);
        }
        int length = str.length();
        int length2 = str2.length();
        Pattern compile = Pattern.compile(str);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        Matcher matcher = compile.matcher(charSequence);
        int i = 0;
        while (matcher.find()) {
            int start = (matcher.start() - (i * length)) + (i * length2);
            valueOf.replace(start, start + length, (CharSequence) str2);
            i++;
        }
        return valueOf;
    }

    /* renamed from: a */
    public static CharSequence m224238a(CharSequence charSequence, int i, int i2, String str, int i3) {
        int i4;
        if (charSequence == null || str == null || i > i2 || i == -1 || i2 == -1) {
            return charSequence;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= charSequence.length()) {
            i2 = charSequence.length();
        }
        int indexOf = i + charSequence.subSequence(i, i2).toString().toLowerCase().indexOf(str.toLowerCase());
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        if (indexOf != -1) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i3);
            if (str.length() + indexOf > charSequence.length()) {
                i4 = charSequence.length();
            } else {
                i4 = str.length() + indexOf;
            }
            valueOf.setSpan(foregroundColorSpan, indexOf, i4, 33);
        }
        return valueOf;
    }

    /* renamed from: a */
    public static SpannableString m224236a(CharSequence charSequence, List<String> list, TextPaint textPaint, int i, int i2) {
        CharSequence charSequence2;
        ReplacementSpan[] replacementSpanArr;
        if (TextUtils.isEmpty(charSequence)) {
            Log.m165382e("highColorLongText failed: text is empty");
            return new SpannableString("");
        } else if (CollectionUtils.isEmpty(list)) {
            return SpannableString.valueOf(m224237a(charSequence));
        } else {
            String str = list.get(0);
            if (TextUtils.isEmpty(str) || !charSequence.toString().toLowerCase().contains(str.toLowerCase())) {
                return SpannableString.valueOf(m224237a(charSequence));
            }
            CharSequence a = m224239a(charSequence, str);
            CharSequence b = m224243b(charSequence, str);
            int measureText = (int) ((((float) i) - textPaint.measureText(str)) / 2.0f);
            CharSequence ellipsize = TextUtils.ellipsize(a, textPaint, (float) measureText, TextUtils.TruncateAt.START);
            boolean z = charSequence instanceof String;
            if (z) {
                charSequence2 = m224237a(b);
            } else {
                charSequence2 = TextUtils.ellipsize(b, textPaint, (float) (measureText * 2), TextUtils.TruncateAt.END);
            }
            int indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase());
            if (z) {
                CharSequence subSequence = charSequence.subSequence(indexOf, str.length() + indexOf);
                return m224235a(ellipsize.toString() + ((Object) subSequence) + ((Object) charSequence2), list, i2);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(ellipsize);
            if ((charSequence instanceof Spannable) && ((replacementSpanArr = (ReplacementSpan[]) ((Spannable) charSequence).getSpans(indexOf, str.length() + indexOf, ReplacementSpan.class)) == null || replacementSpanArr.length == 0)) {
                spannableStringBuilder.append(charSequence.subSequence(indexOf, str.length() + indexOf));
            }
            spannableStringBuilder.append(charSequence2);
            return m224235a(spannableStringBuilder, list, i2);
        }
    }
}
