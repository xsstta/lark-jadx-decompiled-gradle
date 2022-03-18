package com.bytedance.p725f.p726a.p733c;

import android.util.Log;
import com.bytedance.p725f.p726a.p728b.p731c.C13861b;
import com.bytedance.p725f.p726a.p734d.C13872a;
import com.bytedance.p725f.p726a.p734d.C13880b;
import com.bytedance.p725f.p726a.p734d.C13881c;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.f.a.c.f */
public class C13871f extends AbstractC13866a {

    /* renamed from: b */
    private int f36295b = C13872a.m56254a();

    /* renamed from: c */
    private List<File> f36296c = new ArrayList();

    public C13871f() {
        super("");
    }

    @Override // com.bytedance.p725f.p726a.p733c.AbstractC13866a
    /* renamed from: a */
    public AbstractC13867b mo51152a() {
        if (this.f36296c.isEmpty()) {
            for (int i = 0; i != this.f36295b; i++) {
                List<File> list = this.f36296c;
                list.add(new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/stats/time_in_state"));
            }
        }
        this.f36292a = m56251a(this.f36296c);
        return this.f36292a;
    }

    /* renamed from: a */
    private AbstractC13867b m56251a(List<File> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C13861b bVar = new C13861b();
        for (File file : list) {
            LinkedHashMap<Long, Long> b = m56252b(file);
            if (b != null) {
                bVar.mo51127a(b);
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private LinkedHashMap<Long, Long> m56252b(File file) {
        BufferedReader a = C13881c.m56271a(file);
        LinkedHashMap<Long, Long> linkedHashMap = null;
        if (a == null) {
            return null;
        }
        while (true) {
            try {
                String readLine = a.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.isEmpty()) {
                    break;
                } else {
                    String[] split = readLine.split("\\s+");
                    if (split.length <= 1) {
                        break;
                    }
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    linkedHashMap.put(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(Long.parseLong(split[1]) * 10));
                }
            } catch (Exception e) {
                C13880b.m56269c(Log.getStackTraceString(e));
                C13881c.m56272a(a);
                return linkedHashMap;
            } catch (Throwable unused) {
                C13881c.m56272a(a);
                return linkedHashMap;
            }
        }
        C13881c.m56272a(a);
        return linkedHashMap;
    }
}
