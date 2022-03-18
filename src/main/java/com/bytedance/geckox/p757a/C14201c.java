package com.bytedance.geckox.p757a;

import com.bytedance.geckox.p770f.C14271a;
import com.bytedance.geckox.p770f.C14272b;
import com.bytedance.geckox.p770f.C14273c;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.utils.C14356d;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.geckox.utils.ExecutorC14360g;
import com.bytedance.geckox.utils.ExecutorC14365k;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.geckox.a.c */
public class C14201c {
    /* renamed from: a */
    public static void m57329a(final File file) {
        ExecutorC14360g.m57832a().execute(new Runnable() {
            /* class com.bytedance.geckox.p757a.C14201c.RunnableC142043 */

            public void run() {
                C14357e.m57823a(file);
            }
        });
    }

    /* renamed from: a */
    public static boolean m57332a(String str) {
        try {
            m57333b(str);
            return true;
        } catch (Throwable th) {
            C14356d.m57820a(new RuntimeException("delete old channel version failed，path：" + str, th));
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static void m57333b(String str) throws Throwable {
        C14271a a = C14271a.m57593a(str + File.separator + "update.lock");
        if (a != null) {
            try {
                C14272b a2 = C14272b.m57595a(str + File.separator + "select.lock");
                try {
                    C14357e.m57823a(new File(str));
                    a2.mo52246a();
                } catch (Throwable th) {
                    a2.mo52246a();
                    throw th;
                }
            } finally {
                a.mo52245a();
            }
        }
    }

    /* renamed from: a */
    private static List<File> m57327a(String str, long j) {
        File[] listFiles = new File(str).listFiles(new FileFilter() {
            /* class com.bytedance.geckox.p757a.C14201c.C142032 */

            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null || listFiles.length == 0 || listFiles.length == 1) {
            return null;
        }
        return m57328a(listFiles, j);
    }

    /* renamed from: a */
    private static List<File> m57328a(File[] fileArr, long j) {
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = j;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                m57329a(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (j2 != 0) {
                        if (parseLong != j) {
                            arrayList2.add(file2);
                        }
                    } else if (parseLong > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = parseLong;
                            }
                        }
                        file = file2;
                        j2 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                    m57329a(file2);
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                m57329a(file3);
            } else {
                String substring = name2.substring(0, indexOf);
                long j3 = -1;
                try {
                    j3 = Long.parseLong(substring);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (j3 <= j2) {
                    m57329a(file3);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static void m57331a(final String str, final Long l, final boolean z) {
        ExecutorC14365k.m57840a().execute(new Runnable() {
            /* class com.bytedance.geckox.p757a.C14201c.RunnableC142021 */

            public void run() {
                long j = 0;
                try {
                    Long l = l;
                    if (l != null) {
                        j = l.longValue();
                    }
                    C14201c.m57330a(str, j, z);
                } catch (Throwable th) {
                    C14356d.m57820a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m57330a(String str, long j, boolean z) throws Throwable {
        if (z) {
            C14271a a = C14271a.m57593a(str + File.separator + "update.lock");
            if (a != null) {
                try {
                    C14272b a2 = C14272b.m57595a(str + File.separator + "select.lock");
                    try {
                        List<File> a3 = m57327a(str, j);
                        if (a3 != null) {
                            if (!a3.isEmpty()) {
                                C14276b.m57604a("gecko-debug-tag", "delete after update", str, Long.valueOf(j), a3);
                                Iterator<File> it = a3.iterator();
                                while (it.hasNext()) {
                                    C14273c.m57597a(it.next().getAbsolutePath() + File.separator + "using.lock");
                                }
                                a2.mo52246a();
                                a.mo52245a();
                                return;
                            }
                        }
                        a2.mo52246a();
                    } catch (Throwable th) {
                        a2.mo52246a();
                        throw th;
                    }
                } finally {
                    a.mo52245a();
                }
            }
        } else {
            List<File> a4 = m57327a(str, j);
            if (a4 != null && !a4.isEmpty()) {
                C14276b.m57604a("gecko-debug-tag", "delete after update", str, Long.valueOf(j), a4);
                Iterator<File> it2 = a4.iterator();
                while (it2.hasNext()) {
                    C14273c.m57597a(it2.next().getAbsolutePath() + File.separator + "using.lock");
                }
            }
        }
    }
}
