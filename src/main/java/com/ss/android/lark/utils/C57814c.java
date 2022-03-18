package com.ss.android.lark.utils;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.utils.c */
public class C57814c {

    /* renamed from: a */
    public static final Pattern f142386a = Pattern.compile("<at.*?[^>]user_id=\\\"([\\s\\S]*?)\">([\\s\\S]*?)</at>");

    /* renamed from: b */
    public static final Pattern f142387b = Pattern.compile("<at.*?[^>]user_id=\\\"(\\d+)\">([\\s\\S]*?)</at>");

    /* renamed from: a */
    public static String m224347a() {
        return "all";
    }

    /* renamed from: a */
    public static boolean m224348a(String str) {
        if (TextUtils.isEmpty(str) || !f142387b.matcher(str).find()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static CharSequence m224346a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (Matcher matcher = f142386a.matcher(spannableStringBuilder); matcher.find(); matcher = f142386a.matcher(spannableStringBuilder)) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) Matcher.quoteReplacement(matcher.group(2)));
        }
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static boolean m224351b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Matcher matcher = f142386a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            if (!TextUtils.isEmpty(group) && group.equals(m224347a())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m224352c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f142386a.matcher(str);
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(matcher.group(2)));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m224350b(String str, String str2) {
        return "<at user_id=\"" + str + "\">@" + str2 + "</at>";
    }

    /* renamed from: a */
    public static boolean m224349a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Matcher matcher = f142386a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            if (!TextUtils.isEmpty(group) && !group.equals("all") && !group.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
