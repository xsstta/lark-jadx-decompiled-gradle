package com.bytedance.p725f.p726a.p734d;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* renamed from: com.bytedance.f.a.d.d */
public class C13883d {
    /* renamed from: a */
    public static ArrayList<Long> m56276a() {
        return m56277a("/proc/self/task/");
    }

    /* renamed from: a */
    private static ArrayList<Long> m56277a(String str) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (File file : new File(str).listFiles(new FilenameFilter() {
            /* class com.bytedance.p725f.p726a.p734d.C13883d.C138841 */

            public boolean accept(File file, String str) {
                try {
                    Long.parseLong(str);
                    return true;
                } catch (NumberFormatException unused) {
                    return false;
                }
            }
        })) {
            arrayList.add(Long.valueOf(Long.parseLong(file.getName())));
        }
        return arrayList;
    }
}
