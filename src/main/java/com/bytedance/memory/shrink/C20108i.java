package com.bytedance.memory.shrink;

import com.bytedance.memory.heap.C20092a;
import com.bytedance.memory.model.MemoryWidgetConfig;
import com.bytedance.memory.p845a.C20055a;
import com.bytedance.memory.p846b.C20063c;
import com.bytedance.memory.p846b.C20070h;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p848d.C20076a;
import com.bytedance.services.apm.api.EnsureManager;
import java.io.File;

/* renamed from: com.bytedance.memory.shrink.i */
public class C20108i {
    /* renamed from: a */
    public static File m73414a(File file, File file2) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C20076a.m73263a("shrink_begin");
            MemoryWidgetConfig.AbstractC20096b shrinkConfig = C20055a.m73200c().mo68028g().getShrinkConfig();
            File file3 = new File(C20073b.m73242i().mo68042a(), ".mini.hprof");
            if (shrinkConfig == null || C20076a.m73269e("close_native_shrink")) {
                new C20098a().mo68179a(file, file2);
                C20070h.m73236a(file2, file3, true);
                C20092a.m73301a().mo68085a(5);
            } else if (shrinkConfig.mo68136a(file, file3)) {
                C20092a.m73301a().mo68085a(3);
            } else {
                new C20098a().mo68179a(file, file2);
                C20070h.m73236a(file2, file3, true);
                C20092a.m73301a().mo68085a(5);
            }
            C20076a.m73263a("shrink_end");
            C20076a.m73264a("shrink_time", System.currentTimeMillis() - currentTimeMillis);
            C20076a.m73264a("origin_size", file.length() / 1024);
            C20076a.m73264a("shrink_size", file3.length() / 1024);
            C20063c.m73220a("shrink hprof file %s, size: %dk to %s, size: %dk, use time:%d", file.getPath(), Long.valueOf(file.length() / 1024), file3.getPath(), Long.valueOf(file3.length() / 1024), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (!file3.exists() || file3.length() <= 0) {
                return null;
            }
            return file3;
        } catch (Exception e) {
            EnsureManager.ensureNotReachHere(e, "shrink failed");
            e.printStackTrace();
            return null;
        }
    }
}
