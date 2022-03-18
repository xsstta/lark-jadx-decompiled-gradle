package com.bytedance.apm.alog;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.bytedance.apm.alog.c */
public class C2781c implements AbstractC2784e {

    /* renamed from: com.bytedance.apm.alog.c$a */
    static class C2782a implements Comparable<C2782a> {

        /* renamed from: a */
        public String f8863a;

        /* renamed from: b */
        public long f8864b;

        /* renamed from: c */
        public String f8865c;

        /* renamed from: a */
        public int compareTo(C2782a aVar) {
            return (int) (aVar.f8864b - this.f8864b);
        }

        /* renamed from: b */
        public static boolean m11731b(C2782a aVar) {
            if (!aVar.f8863a.endsWith(".hot") || aVar.f8863a.equals("INVALID_FORMAT")) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static C2782a m11730a(File file) {
            long j;
            String[] split = file.getName().split("_");
            String str = "";
            try {
                if (split.length >= 4) {
                    j = Long.parseLong(split[3]);
                    str = split[5];
                } else if (split.length > 1) {
                    long parseLong = Long.parseLong(split[0]);
                    str = split[1];
                    j = parseLong;
                } else {
                    j = -1;
                }
                if (j >= 0) {
                    return new C2782a(file.getAbsolutePath(), j / 1000, str);
                }
                throw new NumberFormatException();
            } catch (NumberFormatException unused) {
                return new C2782a("INVALID_FORMAT", -1, str);
            }
        }

        C2782a(String str, long j, String str2) {
            this.f8863a = str;
            this.f8864b = j;
            this.f8865c = str2;
        }
    }

    @Override // com.bytedance.apm.alog.AbstractC2784e
    /* renamed from: a */
    public List<String> mo12086a(Context context, String str, long j, long j2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && j <= j2) {
            File file = new File(str);
            if (file.exists() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    C2782a a = C2782a.m11730a(file2);
                    if (C2782a.m11731b(a) && a.f8864b <= j2) {
                        if (!hashMap.containsKey(a.f8865c)) {
                            hashMap.put(a.f8865c, new PriorityQueue());
                        }
                        ((PriorityQueue) hashMap.get(a.f8865c)).offer(a);
                    }
                }
                for (PriorityQueue priorityQueue : hashMap.values()) {
                    while (!priorityQueue.isEmpty()) {
                        C2782a aVar = (C2782a) priorityQueue.poll();
                        arrayList.add(aVar.f8863a);
                        if (aVar.f8864b < j) {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
