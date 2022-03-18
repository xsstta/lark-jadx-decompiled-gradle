package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.calendar.impl.utils.m */
public class C32660m {
    /* renamed from: c */
    private static String m125339c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("<(.*?)>").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: a */
    private static List<String> m125336a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null) {
            return arrayList;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                String c = m125339c(str);
                if (!TextUtils.isEmpty(c)) {
                    arrayList.add(c);
                } else {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m125337a(String str) {
        List<String> b;
        if (str == null || TextUtils.isEmpty(str.trim()) || (b = m125338b(str.trim())) == null || b.size() == 0) {
            return false;
        }
        Pattern compile = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
        for (String str2 : b) {
            if (!TextUtils.isEmpty(str2) && !compile.matcher(str2).matches()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static List<String> m125338b(String str) {
        List<String> list;
        if (str == null || TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        String trim = str.trim();
        if (Pattern.compile(".*<.*>.*").matcher(trim).matches()) {
            list = m125336a(trim.split("[,;；，\n]"));
        } else {
            list = m125336a(trim.split("[,;；， 　\n]"));
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
