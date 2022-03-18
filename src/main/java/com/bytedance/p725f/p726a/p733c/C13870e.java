package com.bytedance.p725f.p726a.p733c;

import android.util.Log;
import com.bytedance.p725f.p726a.p728b.p731c.C13863d;
import com.bytedance.p725f.p726a.p734d.C13880b;
import com.bytedance.p725f.p726a.p734d.C13881c;
import java.io.BufferedReader;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.f.a.c.e */
public class C13870e extends AbstractC13866a {
    public C13870e() {
        this("/proc/self/time_in_state");
    }

    public C13870e(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p725f.p726a.p733c.AbstractC13866a
    /* renamed from: a */
    public AbstractC13867b mo51153a(File file) {
        return m56249b(file);
    }

    public C13870e(int i) {
        super("/proc/self/task/" + i + "/time_in_state");
    }

    /* renamed from: b */
    private AbstractC13867b m56249b(File file) {
        BufferedReader a = C13881c.m56271a(file);
        if (a == null) {
            return null;
        }
        C13863d dVar = new C13863d();
        LinkedHashMap<Long, Long> linkedHashMap = null;
        long j = 0;
        while (true) {
            try {
                String readLine = a.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.isEmpty()) {
                    if (!readLine.contains("cpu")) {
                        String[] split = readLine.split("\\s+");
                        if (split.length <= 1) {
                            break;
                        }
                        long parseLong = Long.parseLong(split[0]);
                        long parseLong2 = Long.parseLong(split[1]) * 10;
                        if (j != 0 && parseLong < j) {
                            dVar.mo51142a(linkedHashMap);
                            linkedHashMap = null;
                        }
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap<>();
                        }
                        linkedHashMap.put(Long.valueOf(parseLong), Long.valueOf(parseLong2));
                        j = parseLong;
                    }
                }
            } catch (Exception e) {
                C13880b.m56269c(Log.getStackTraceString(e));
                C13881c.m56272a(a);
                return dVar;
            } catch (Throwable unused) {
                C13881c.m56272a(a);
                return dVar;
            }
        }
        dVar.mo51142a(linkedHashMap);
        C13881c.m56272a(a);
        return dVar;
    }
}
