package com.bytedance.apm6.cpu.exception;

import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.p196c.C3353a;
import com.bytedance.common.utility.io.IOUtils;
import com.bytedance.monitor.util.C20172c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.apm6.cpu.exception.h */
public class C3266h {
    /* renamed from: a */
    public static void m13642a(int i, List<C3267i> list) {
        File[] listFiles = new File("/proc/" + i + "/task/").listFiles();
        long a = C3353a.m13948a();
        BufferedReader bufferedReader = null;
        for (File file : listFiles) {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath() + "/stat")), 1000);
                try {
                    String readLine = bufferedReader2.readLine();
                    int lastIndexOf = readLine.lastIndexOf(41);
                    String substring = readLine.substring(0, lastIndexOf);
                    String substring2 = readLine.substring(lastIndexOf + 4);
                    int indexOf = substring.indexOf(40);
                    int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                    String substring3 = substring.substring(indexOf + 1);
                    String[] split = substring2.split(" ");
                    long parseLong = Long.parseLong(split[10]) + Long.parseLong(split[11]);
                    if (intValue != 0 && !substring3.isEmpty()) {
                        if (parseLong != 0) {
                            if (!Thread.currentThread().getName().contains(substring3)) {
                                C3267i iVar = new C3267i();
                                iVar.mo13459c(substring3);
                                iVar.mo13455b(intValue);
                                iVar.mo13456b(parseLong);
                                iVar.mo13452a(a);
                                iVar.mo13451a(Integer.parseInt(split[14]));
                                list.add(iVar);
                            }
                        }
                    }
                    C20172c.m73614a(bufferedReader2);
                    bufferedReader = bufferedReader2;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    C20172c.m73614a(bufferedReader);
                }
            } catch (FileNotFoundException unused2) {
                C20172c.m73614a(bufferedReader);
            }
        }
    }

    /* renamed from: a */
    public static void m13645a(int i, Map<Integer, C3267i> map) {
        BufferedReader bufferedReader = null;
        for (File file : new File("/proc/" + i + "/task/").listFiles()) {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file.getPath() + "/stat")), 1000);
                try {
                    String readLine = bufferedReader2.readLine();
                    int lastIndexOf = readLine.lastIndexOf(41);
                    String substring = readLine.substring(0, lastIndexOf);
                    String substring2 = readLine.substring(lastIndexOf + 4);
                    int indexOf = substring.indexOf(40);
                    int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                    String substring3 = substring.substring(indexOf + 1);
                    String[] split = substring2.split(" ");
                    long parseLong = Long.parseLong(split[10]) + Long.parseLong(split[11]);
                    if (intValue != 0 && !substring3.isEmpty()) {
                        if (parseLong != 0) {
                            C3267i iVar = new C3267i();
                            iVar.mo13459c(substring3);
                            iVar.mo13455b(intValue);
                            iVar.mo13456b(parseLong);
                            map.put(Integer.valueOf(intValue), iVar);
                        }
                    }
                    C20172c.m73614a(bufferedReader2);
                    bufferedReader = bufferedReader2;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    C20172c.m73614a(bufferedReader);
                }
            } catch (FileNotFoundException unused2) {
                C20172c.m73614a(bufferedReader);
            }
        }
    }

    /* renamed from: a */
    public static void m13643a(int i, List<C3267i> list, double d) {
        m13644a(i, list, new LinkedList(), d);
    }

    /* renamed from: a */
    public static void m13644a(int i, List<C3267i> list, List<C3267i> list2, double d) {
        Iterator<C3267i> it;
        Throwable th;
        String[] split;
        long parseLong;
        float h;
        String str = "/proc/" + i + "/task/";
        C3350b.m13934b("APM-CPU", "size: " + list.size());
        long a = C3353a.m13948a();
        BufferedReader bufferedReader = null;
        for (Iterator<C3267i> it2 = list.iterator(); it2.hasNext(); it2 = it) {
            C3267i next = it2.next();
            if (next == null) {
                IOUtils.close(bufferedReader);
                it = it2;
            } else {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str + next.mo13463f() + "/stat")), 1000);
                    try {
                        String readLine = bufferedReader2.readLine();
                        split = readLine.substring(readLine.lastIndexOf(41) + 4).split(" ");
                        parseLong = Long.parseLong(split[10]) + Long.parseLong(split[11]);
                        it = it2;
                        h = ((float) (parseLong - next.mo13465h())) / ((float) (a - next.mo13458c()));
                    } catch (Throwable th2) {
                        th = th2;
                        it = it2;
                        bufferedReader = bufferedReader2;
                        try {
                            C3350b.m13934b("APM-CPU", "error: " + th.getLocalizedMessage());
                            IOUtils.close(bufferedReader);
                        } catch (Throwable th3) {
                            IOUtils.close(bufferedReader);
                            throw th3;
                        }
                    }
                    try {
                        C3350b.m13934b("APM-CPU", next.mo13464g() + " judge: " + parseLong + " " + next.mo13465h() + " " + h + " " + d);
                        double d2 = (double) h;
                        if (d2 >= d) {
                            next.mo13450a(d2);
                            next.mo13451a(Integer.parseInt(split[18]));
                        } else {
                            list2.add(next);
                        }
                        C3350b.m13934b("APM-CPU", "after item: " + next);
                        IOUtils.close(bufferedReader2);
                        bufferedReader = bufferedReader2;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = bufferedReader2;
                        C3350b.m13934b("APM-CPU", "error: " + th.getLocalizedMessage());
                        IOUtils.close(bufferedReader);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    C3350b.m13934b("APM-CPU", "error: " + th.getLocalizedMessage());
                }
            }
        }
        list.removeAll(list2);
        C3350b.m13934b("APM-CPU", "after size: " + list.size());
    }
}
