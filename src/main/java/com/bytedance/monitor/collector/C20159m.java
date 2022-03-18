package com.bytedance.monitor.collector;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.monitor.collector.m */
public class C20159m {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.m$a */
    public static class C20161a implements Comparable<C20161a> {

        /* renamed from: a */
        boolean f49261a;

        /* renamed from: b */
        int f49262b;

        /* renamed from: c */
        long f49263c;

        /* renamed from: d */
        long f49264d;

        /* renamed from: e */
        long f49265e;

        /* renamed from: f */
        long f49266f;

        /* renamed from: g */
        long f49267g;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f49262b);
            sb.append(",");
            if (this.f49261a) {
                str = "sys";
            } else {
                str = "app";
            }
            sb.append(str);
            sb.append(",");
            sb.append(this.f49263c);
            sb.append(",");
            sb.append(this.f49264d);
            sb.append(",");
            sb.append(this.f49265e);
            sb.append(",");
            sb.append(this.f49266f);
            return sb.toString();
        }

        /* renamed from: a */
        public int compareTo(C20161a aVar) {
            long j = this.f49264d;
            long j2 = aVar.f49264d;
            if (j > j2) {
                return 1;
            }
            if (j == j2) {
                return 0;
            }
            return -1;
        }

        public C20161a(boolean z, int i, long j, long j2, long j3, long j4) {
            this.f49261a = z;
            this.f49262b = i;
            this.f49263c = j;
            this.f49264d = j2;
            this.f49265e = j3;
            this.f49266f = j4;
            this.f49267g = (j3 - j2) / 1000000;
        }
    }

    /* renamed from: a */
    public static String m73571a(String str) {
        if (str == null) {
            return null;
        }
        Iterator<C20161a> it = m73574b(str).iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            sb.append('\n');
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static LinkedList<C20161a> m73574b(String str) {
        LinkedList<C20161a> linkedList = new LinkedList<>();
        for (String str2 : str.split("\n")) {
            String[] split = str2.split(",");
            if (split != null && split.length >= 6) {
                linkedList.add(new C20161a(split[1].startsWith("sys"), Integer.parseInt(split[0]), Long.parseLong(split[2]), Long.parseLong(split[3]), Long.parseLong(split[4]), Long.parseLong(split[5])));
            }
        }
        Collections.sort(linkedList);
        return linkedList;
    }

    /* renamed from: a */
    public static String m73573a(List<C20161a> list, long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = (long) (((float) j) * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (C20161a aVar : list) {
            if (aVar.f49265e - aVar.f49264d >= j2) {
                linkedList.add(aVar);
            }
        }
        Collections.sort(linkedList, new Comparator<C20161a>() {
            /* class com.bytedance.monitor.collector.C20159m.C201601 */

            /* renamed from: a */
            public int compare(C20161a aVar, C20161a aVar2) {
                return Long.compare(((long) (aVar2.f49262b + 1)) * (aVar2.f49265e - aVar2.f49264d), ((long) (aVar.f49262b + 1)) * (aVar.f49265e - aVar.f49264d));
            }
        });
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            sb.append(((C20161a) it.next()).f49263c + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m73572a(String str, StringBuilder sb, int i, long j) {
        LinkedList<C20161a> b = m73574b(str);
        while (b.size() > i) {
            long j2 = (long) 21;
            Iterator<C20161a> it = b.iterator();
            while (it.hasNext()) {
                if (it.next().f49267g < j2) {
                    it.remove();
                }
            }
        }
        Iterator<C20161a> it2 = b.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().toString());
            sb.append('\n');
        }
        if (b.size() == 0) {
            return null;
        }
        return m73573a(b, j);
    }
}
