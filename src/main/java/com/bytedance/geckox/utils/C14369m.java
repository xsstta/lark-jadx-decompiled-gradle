package com.bytedance.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.utils.m */
public class C14369m {
    /* renamed from: a */
    public static Long m57849a(File file) {
        Long l = null;
        if (file == null) {
            return null;
        }
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.C14369m.C143701 */

            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l == null) {
                        l = Long.valueOf(longValue);
                    } else if (longValue > l.longValue()) {
                        l = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }

    /* renamed from: b */
    public static List<Long> m57850b(File file) {
        ArrayList arrayList = null;
        if (file == null) {
            return null;
        }
        File[] listFiles = file.listFiles(new FileFilter() {
            /* class com.bytedance.geckox.utils.C14369m.C143712 */

            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (!(listFiles == null || listFiles.length == 0)) {
            arrayList = new ArrayList();
            for (File file2 : listFiles) {
                try {
                    arrayList.add(Long.valueOf(Long.valueOf(file2.getName()).longValue()));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}
