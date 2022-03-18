package com.bytedance.android.alog;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.alog.a */
class C2613a {

    /* renamed from: a */
    private static final int f8344a = 9;

    /* renamed from: b */
    private static long f8345b;

    /* renamed from: c */
    private static long f8346c;

    /* renamed from: d */
    private static ArrayList<String> f8347d;

    /* renamed from: e */
    private static String f8348e;

    /* renamed from: a */
    static HashMap<String, String> m11014a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("start", Long.toString(f8345b));
        hashMap.put("end", Long.toString(f8346c));
        hashMap.put("reason", f8348e);
        if (f8347d != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = f8347d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.endsWith(".alog.hot")) {
                    next = next.substring(0, next.length() - f8344a);
                }
                sb.append(next);
                sb.append(";");
            }
            hashMap.put("file", sb.toString());
        }
        f8348e = null;
        f8347d = null;
        return hashMap;
    }

    /* renamed from: a */
    static File[] m11015a(String str, String str2, String str3, final long j, final long j2) {
        String str4;
        f8345b = j;
        f8346c = j2;
        f8348e = null;
        f8347d = null;
        if (j > j2) {
            f8348e = "time interval is invalid";
            return new File[0];
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            f8348e = "log dir not exists";
            return new File[0];
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace(':', '-');
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
        String str5 = "\\S+";
        if (TextUtils.isEmpty(str2)) {
            str4 = str5;
        } else {
            str4 = Pattern.quote(str2);
        }
        sb.append(str4);
        sb.append("__");
        if (!TextUtils.isEmpty(str3)) {
            str5 = Pattern.quote(str3);
        }
        sb.append(str5);
        sb.append("\\.alog\\.hot$");
        final Pattern compile = Pattern.compile(sb.toString());
        final ArrayList<String> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles(new FilenameFilter() {
            /* class com.bytedance.android.alog.C2613a.C26141 */

            public boolean accept(File file, String str) {
                String group;
                arrayList.add(str);
                Matcher matcher = compile.matcher(str);
                if (!matcher.find() || matcher.groupCount() != 1 || (group = matcher.group(1)) == null) {
                    return false;
                }
                long parseLong = Long.parseLong(group);
                if (parseLong > 0 && parseLong <= j2) {
                    long lastModified = new File(file, str).lastModified();
                    if (lastModified <= 0 || lastModified < j) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            f8348e = "log file not found";
            f8347d = arrayList;
        }
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }
}
