package com.bytedance.p725f.p726a.p733c;

import android.util.Log;
import com.bytedance.p725f.p726a.p728b.p731c.C13864e;
import com.bytedance.p725f.p726a.p734d.C13880b;
import com.bytedance.p725f.p726a.p734d.C13881c;
import java.io.BufferedReader;
import java.io.File;

/* renamed from: com.bytedance.f.a.c.d */
public class C13869d extends C13868c {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.p725f.p726a.p733c.C13868c, com.bytedance.p725f.p726a.p733c.AbstractC13866a
    /* renamed from: a */
    public AbstractC13867b mo51153a(File file) {
        return mo51156a(file, new C13864e());
    }

    public C13869d(long j) {
        super("proc/self/task/" + j + "/stat");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC13867b mo51156a(File file, C13864e eVar) {
        BufferedReader a = C13881c.m56271a(file);
        if (a == null) {
            return null;
        }
        try {
            String readLine = a.readLine();
            if (readLine != null) {
                if (!readLine.isEmpty()) {
                    String[] split = readLine.split("\\s+");
                    if (split.length <= 16) {
                        C13881c.m56272a(a);
                        return eVar;
                    }
                    if (eVar == null) {
                        eVar = new C13864e();
                    }
                    eVar.mo51132a(Integer.parseInt(split[0]));
                    eVar.mo51135a(split[1].substring(1, split[1].length() - 1));
                    eVar.mo51137b((long) ((Integer.parseInt(split[13]) + Integer.parseInt(split[14])) * 10));
                    C13881c.m56272a(a);
                    return eVar;
                }
            }
            C13881c.m56272a(a);
            return eVar;
        } catch (Exception e) {
            C13880b.m56269c(Log.getStackTraceString(e));
            C13881c.m56272a(a);
            return eVar;
        } catch (Throwable unused) {
            C13881c.m56272a(a);
            return eVar;
        }
    }
}
