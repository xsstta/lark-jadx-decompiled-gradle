package com.ss.android.appcenter.common.util;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.appcenter.common.util.m */
public class C28193m {

    /* renamed from: com.ss.android.appcenter.common.util.m$a */
    public interface AbstractC28195a {
        void onClick(View view);
    }

    /* renamed from: a */
    public static boolean m103268a(String str) {
        if (TextUtils.isEmpty(str) || str.trim().length() <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static SpannableString m103264a(CharSequence charSequence, CharSequence charSequence2, int i) {
        String str = "";
        if (TextUtils.isEmpty(charSequence)) {
            return new SpannableString(str);
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence2.toString())) {
            str = charSequence2.toString();
        }
        arrayList.add(str);
        return m103265a(charSequence.toString(), arrayList, i);
    }

    /* renamed from: a */
    public static SpannableString m103265a(String str, List<String> list, int i) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str);
        if (CollectionUtils.isEmpty(list)) {
            return spannableString;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String lowerCase2 = str2.toLowerCase();
                if (lowerCase.contains(lowerCase2)) {
                    try {
                        Matcher matcher = Pattern.compile(lowerCase2).matcher(lowerCase);
                        while (matcher.find()) {
                            spannableString.setSpan(new ForegroundColorSpan(i), matcher.start(), matcher.end(), 33);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    public static SpannableString m103266a(String str, List<String> list, final int i, List<AbstractC28195a> list2) {
        if (TextUtils.isEmpty(str)) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str);
        if (CollectionUtils.isEmpty(list)) {
            return spannableString;
        }
        String lowerCase = str.toLowerCase();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str2 = list.get(i2);
            final AbstractC28195a aVar = null;
            if (!TextUtils.isEmpty(str2)) {
                String lowerCase2 = str2.toLowerCase();
                if (lowerCase.contains(lowerCase2)) {
                    if (list2 != null && list2.size() > i2) {
                        aVar = list2.get(i2);
                    }
                    try {
                        Matcher matcher = Pattern.compile(lowerCase2).matcher(lowerCase);
                        while (matcher.find()) {
                            int start = matcher.start();
                            int end = matcher.end();
                            spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                            if (aVar != null) {
                                spannableString.setSpan(new ClickableSpan() {
                                    /* class com.ss.android.appcenter.common.util.C28193m.C281941 */

                                    public void onClick(View view) {
                                        aVar.onClick(view);
                                    }

                                    public void updateDrawState(TextPaint textPaint) {
                                        textPaint.setColor(i);
                                        textPaint.setUnderlineText(false);
                                        textPaint.clearShadowLayer();
                                    }
                                }, start, end, 33);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return spannableString;
    }

    /* renamed from: a */
    public static CharSequence m103267a(String str, int i, int i2, String str2, int i3) {
        if (str == null || str2 == null || i > i2 || i == -1 || i2 == -1) {
            return str;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= str.length()) {
            i2 = str.length();
        }
        int indexOf = i + str.substring(i, i2).toLowerCase().indexOf(str2.toLowerCase());
        SpannableString spannableString = new SpannableString(str);
        if (indexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(i3), indexOf, str2.length() + indexOf, 33);
        }
        return spannableString;
    }
}
