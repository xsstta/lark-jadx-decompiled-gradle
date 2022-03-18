package com.bytedance.p725f.p726a.p733c;

import android.util.Log;
import com.bytedance.p725f.p726a.p728b.p731c.C13862c;
import com.bytedance.p725f.p726a.p734d.C13880b;
import com.bytedance.p725f.p726a.p734d.C13881c;
import java.io.BufferedReader;
import java.io.File;

/* renamed from: com.bytedance.f.a.c.c */
public class C13868c extends AbstractC13866a {
    public C13868c() {
        this("proc/self/stat");
    }

    public C13868c(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p725f.p726a.p733c.AbstractC13866a
    /* renamed from: a */
    public AbstractC13867b mo51153a(File file) {
        return mo51155a(file, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC13867b mo51155a(File file, C13862c cVar) {
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
                        return cVar;
                    }
                    if (cVar == null) {
                        cVar = new C13862c();
                    }
                    cVar.mo51132a(Integer.parseInt(split[0]));
                    cVar.mo51135a(split[1].substring(1, split[1].length() - 1));
                    cVar.mo51137b((long) ((Integer.parseInt(split[13]) + Integer.parseInt(split[14]) + Integer.parseInt(split[15]) + Integer.parseInt(split[16])) * 10));
                    C13881c.m56272a(a);
                    return cVar;
                }
            }
            C13881c.m56272a(a);
            return cVar;
        } catch (Exception e) {
            C13880b.m56269c(Log.getStackTraceString(e));
            C13881c.m56272a(a);
            return cVar;
        } catch (Throwable unused) {
            C13881c.m56272a(a);
            return cVar;
        }
    }
}
