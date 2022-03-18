package com.bytedance.geckox.utils;

import android.text.TextUtils;
import com.bytedance.geckox.meta.MetaDataManager;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.statistic.C14343e;
import java.io.File;
import java.io.FileFilter;

/* renamed from: com.bytedance.geckox.utils.l */
public class C14367l {
    /* renamed from: a */
    private static String m57843a(String str) {
        if (str.indexOf("/") == 0) {
            str = str.substring(1);
        }
        if (str.lastIndexOf("/") == str.length() - 1) {
            return str.substring(0, str.lastIndexOf("/"));
        }
        return str;
    }

    /* renamed from: a */
    public static long[] m57845a(File file, String str) {
        File[] listFiles;
        if (file != null && !TextUtils.isEmpty(str)) {
            C14276b.m57604a("gecko-debug-tag", "gecko resource info dirs", file, str);
            File file2 = new File(file, str);
            String[] list = file2.list();
            if (!(list == null || list.length == 0)) {
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                for (String str2 : list) {
                    File file3 = new File(file2, str2);
                    if (!(!file3.isDirectory() || (listFiles = file3.listFiles(new FileFilter() {
                        /* class com.bytedance.geckox.utils.C14367l.C143681 */

                        public boolean accept(File file) {
                            return file.isDirectory();
                        }
                    })) == null || listFiles.length == 0)) {
                        for (File file4 : listFiles) {
                            try {
                                Long.valueOf(file4.getName());
                                File file5 = new File(file4, "res.zip");
                                if (file5.exists()) {
                                    j3 += C14357e.m57827e(file5);
                                }
                                File file6 = new File(file4, "res");
                                if (file6.exists()) {
                                    j += C14357e.m57827e(file6);
                                }
                            } catch (Exception unused) {
                                j2 += C14357e.m57827e(file4);
                            }
                        }
                    }
                }
                return new long[]{j, j2, j3};
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m57844a(File file, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || file == null || !file.exists() || !file.isDirectory() || m57848c(file, str, str2) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m57846b(File file, String str, String str2) {
        C14276b.m57604a("gecko-debug-tag", "getChannelPath(rootDir:" + file + ",accessKey:" + str + ",channel:" + str2 + ")");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && file.exists() && file.isDirectory()) {
            String a = m57843a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                File file3 = new File(absolutePath, a);
                if (!file3.exists()) {
                    return null;
                }
                Long a2 = C14369m.m57849a(file3);
                if (a2 == null) {
                    C14343e.m57792a(str, a, String.valueOf(a2), "3", "false", "false");
                    return null;
                }
                String str3 = absolutePath + File.separator + a + File.separator + a2 + File.separator + "res";
                MetaDataManager.f37560a.mo52265a(str, a, a2.longValue(), "3", "true", System.currentTimeMillis());
                C14276b.m57604a("gecko-debug-tag", "getChannelPath:" + str3);
                return str3;
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "getChannelPath:error:", th);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Long m57848c(File file, String str, String str2) {
        C14276b.m57604a("gecko-debug-tag", "getLatestChannelVersion(rootDir:" + file + ",accessKey:" + str + ",channel:" + str2 + ")");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && file.exists() && file.isDirectory()) {
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                File file3 = new File(file2.getAbsolutePath(), str2);
                if (!file3.exists()) {
                    return null;
                }
                Long a = C14369m.m57849a(file3);
                C14276b.m57604a("gecko-debug-tag", "getLatestChannelVersion:" + a);
                return a;
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "getLatestChannelVersion:error:", th);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m57842a(File file, String str, String str2, long j) {
        C14276b.m57604a("gecko-debug-tag", "getChannelPath(rootDir:" + file + ",accessKey:" + str + ",channel:" + str2 + ")");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && j != 0 && file.exists() && file.isDirectory()) {
            String a = m57843a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                if (!new File(absolutePath, a).exists()) {
                    return null;
                }
                String str3 = absolutePath + File.separator + a + File.separator + j + File.separator + "res";
                MetaDataManager.f37560a.mo52265a(str, a, j, "4", "true", System.currentTimeMillis());
                C14276b.m57604a("gecko-debug-tag", "getChannelPath:" + str3);
                return str3;
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "getChannelPath:error:", th);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m57847b(File file, String str, String str2, long j) {
        C14276b.m57604a("gecko-debug-tag", "getChannelPath(rootDir:" + file + ",accessKey:" + str + ",channel:" + str2 + ")");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && file != null && j != 0 && file.exists() && file.isDirectory()) {
            String a = m57843a(str2);
            try {
                File file2 = new File(file, File.separator + str);
                if (!file2.exists()) {
                    return null;
                }
                String absolutePath = file2.getAbsolutePath();
                if (!new File(absolutePath, a).exists()) {
                    return null;
                }
                String str3 = absolutePath + File.separator + a + File.separator + j + File.separator + "res";
                C14276b.m57604a("gecko-debug-tag", "getChannelPath:" + str3);
                return str3;
            } catch (Throwable th) {
                C14276b.m57603a("gecko-debug-tag", "getChannelPath:error:", th);
            }
        }
        return null;
    }
}
