package com.bytedance.p725f.p726a.p734d;

import com.bytedance.p725f.p726a.p734d.C13881c;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.f.a.d.a */
public class C13872a {

    /* renamed from: a */
    public static String f36297a = null;

    /* renamed from: b */
    private static int f36298b = -1;

    /* renamed from: c */
    private static List<C13879a> f36299c;

    /* renamed from: d */
    private static List<Integer> f36300d;

    /* renamed from: com.bytedance.f.a.d.a$a */
    public static class C13879a {

        /* renamed from: a */
        private String f36303a;

        /* renamed from: b */
        private List<Integer> f36304b = new ArrayList();

        /* renamed from: c */
        private List<Long> f36305c = new ArrayList();

        /* renamed from: a */
        public List<Integer> mo51162a() {
            return this.f36304b;
        }

        public String toString() {
            return "CpuClusterInfo{name='" + this.f36303a + '\'' + ", affectedCpuList=" + this.f36304b + ", freqList=" + this.f36305c + '}';
        }

        /* renamed from: b */
        public void mo51164b(List<Long> list) {
            this.f36305c = list;
        }

        /* renamed from: a */
        public void mo51163a(List<Integer> list) {
            this.f36304b = list;
        }

        public C13879a(String str) {
            this.f36303a = str;
        }
    }

    /* renamed from: a */
    public static int m56254a() {
        if (f36298b == -1) {
            f36298b = new File("/sys/devices/system/cpu").listFiles(new FilenameFilter() {
                /* class com.bytedance.p725f.p726a.p734d.C13872a.C138731 */

                public boolean accept(File file, String str) {
                    return Pattern.matches("cpu[0-9]", str);
                }
            }).length;
        }
        return f36298b;
    }

    /* renamed from: b */
    public static String m56255b() {
        String str = f36297a;
        if (str != null) {
            return str;
        }
        C13881c.m56274a("/proc/cpuinfo", new C13881c.AbstractC13882a() {
            /* class com.bytedance.p725f.p726a.p734d.C13872a.C138742 */

            @Override // com.bytedance.p725f.p726a.p734d.C13881c.AbstractC13882a
            /* renamed from: a */
            public boolean mo51158a(String str) {
                if (str == null || !str.contains("Hardware")) {
                    return true;
                }
                String[] split = str.split(":");
                if (split.length <= 1) {
                    return false;
                }
                C13872a.f36297a = split[1].trim();
                return false;
            }
        });
        return f36297a;
    }

    /* renamed from: d */
    public static List<Integer> m56257d() {
        List<Integer> list = f36300d;
        if (list != null) {
            return list;
        }
        List<C13879a> c = m56256c();
        f36300d = new ArrayList();
        for (C13879a aVar : c) {
            f36300d.add(Integer.valueOf(aVar.mo51162a().size()));
        }
        return f36300d;
    }

    /* renamed from: c */
    public static List<C13879a> m56256c() {
        List<C13879a> list = f36299c;
        if (list != null) {
            return list;
        }
        f36299c = new ArrayList();
        File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles(new FilenameFilter() {
            /* class com.bytedance.p725f.p726a.p734d.C13872a.C138753 */

            public boolean accept(File file, String str) {
                return Pattern.matches("policy[0-9]", str);
            }
        });
        Arrays.sort(listFiles, new Comparator<File>() {
            /* class com.bytedance.p725f.p726a.p734d.C13872a.C138764 */

            /* renamed from: a */
            public int compare(File file, File file2) {
                return file.getName().compareTo(file2.getName());
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                C13879a aVar = new C13879a(file.getName());
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                C13881c.m56274a(file.getAbsolutePath() + "/scaling_available_frequencies", new C13881c.AbstractC13882a() {
                    /* class com.bytedance.p725f.p726a.p734d.C13872a.C138775 */

                    @Override // com.bytedance.p725f.p726a.p734d.C13881c.AbstractC13882a
                    /* renamed from: a */
                    public boolean mo51158a(String str) {
                        if (str != null && !str.isEmpty()) {
                            for (String str2 : str.split(" ")) {
                                arrayList.add(Long.valueOf(Long.parseLong(str2)));
                            }
                        }
                        return true;
                    }
                });
                C13881c.m56274a(file.getAbsolutePath() + "/affected_cpus", new C13881c.AbstractC13882a() {
                    /* class com.bytedance.p725f.p726a.p734d.C13872a.C138786 */

                    @Override // com.bytedance.p725f.p726a.p734d.C13881c.AbstractC13882a
                    /* renamed from: a */
                    public boolean mo51158a(String str) {
                        if (str != null && !str.isEmpty()) {
                            for (String str2 : str.split(" ")) {
                                arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                            }
                        }
                        return true;
                    }
                });
                aVar.mo51164b(arrayList);
                aVar.mo51163a(arrayList2);
                f36299c.add(aVar);
            }
        }
        return f36299c;
    }
}
