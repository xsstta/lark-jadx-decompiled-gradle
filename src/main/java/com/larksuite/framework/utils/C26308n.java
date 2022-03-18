package com.larksuite.framework.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.larksuite.framework.utils.file.direct.DirectFileAccess;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.larksuite.framework.utils.n */
public class C26308n {
    /* renamed from: a */
    public static String m95250a() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory == null) {
            return "";
        }
        if (!externalStoragePublicDirectory.exists()) {
            externalStoragePublicDirectory.mkdir();
        }
        return externalStoragePublicDirectory.getAbsolutePath();
    }

    /* renamed from: d */
    public static String m95258d(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getPath();
        }
        return "";
    }

    /* renamed from: a */
    public static String m95251a(Context context) {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = Environment.getExternalStorageDirectory();
        } else {
            file = null;
        }
        if (file == null) {
            file = context.getFilesDir();
        }
        if (file != null) {
            return file.getPath();
        }
        return "";
    }

    /* renamed from: b */
    public static String m95256b(Context context) {
        File a = DirectFileAccess.m95102a(DirectFileAccess.StorageParams.m95112i().mo93404a(context).mo93406a(DirectFileAccess.StorageLocation.EXTERNAL).mo93405a(DirectFileAccess.PathType.CACHE));
        if (a == null) {
            a = context.getCacheDir();
        }
        if (a != null) {
            return a.getPath();
        }
        return "";
    }

    /* renamed from: c */
    public static String m95257c(Context context) {
        File a = DirectFileAccess.m95102a(DirectFileAccess.StorageParams.m95112i().mo93404a(context).mo93406a(DirectFileAccess.StorageLocation.EXTERNAL).mo93405a(DirectFileAccess.PathType.FILES));
        if (a == null) {
            a = context.getFilesDir();
        }
        if (a != null) {
            return a.getPath();
        }
        return "";
    }

    /* renamed from: a */
    public static List<String> m95254a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str2)) {
            return arrayList;
        }
        final String f = C26311p.m95286f(str2);
        final String g = C26311p.m95287g(str2);
        String[] list = new File(str).list(new FilenameFilter() {
            /* class com.larksuite.framework.utils.C26308n.C263091 */

            public boolean accept(File file, String str) {
                if (str != null && !new File(str).isDirectory()) {
                    return C26308n.m95255a(str, f, g);
                }
                return false;
            }
        });
        if (list != null) {
            arrayList.addAll(Arrays.asList(list));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m95252a(Context context, String str, String str2) {
        List<String> a = m95254a(str, str2);
        if (a == null || a.size() == 0) {
            return str + str2;
        }
        Collections.sort(a);
        String f = C26311p.m95286f(str2);
        String g = C26311p.m95287g(str2);
        String substring = C26311p.m95286f(a.get(a.size() - 1)).substring(f.length());
        int i = 0;
        try {
            if (!TextUtils.isEmpty(substring)) {
                i = Integer.parseInt(substring.substring(1, substring.length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return m95253a(str, f, g, i + 1);
    }

    /* renamed from: a */
    public static boolean m95255a(String str, String str2, String str3) {
        String g = C26311p.m95287g(str);
        String f = C26311p.m95286f(str);
        if (!TextUtils.equals(g, str3) || !f.startsWith(str2)) {
            return false;
        }
        String substring = f.substring(str2.length());
        if (!TextUtils.isEmpty(substring)) {
            return Pattern.compile("^_\\d+?$").matcher(substring).find();
        }
        return true;
    }

    /* renamed from: a */
    private static String m95253a(String str, String str2, String str3, int i) {
        String str4;
        if (i == 0) {
            str4 = "";
        } else {
            str4 = "_" + i;
        }
        return str + str2 + str4 + str3;
    }
}
