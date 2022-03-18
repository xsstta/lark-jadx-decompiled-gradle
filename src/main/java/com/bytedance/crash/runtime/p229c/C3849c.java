package com.bytedance.crash.runtime.p229c;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.util.C3968x;

/* renamed from: com.bytedance.crash.runtime.c.c */
public class C3849c extends AbstractRunnableC3847a {
    public void run() {
        if (!C3774m.m15603d().mo15506b()) {
            String d = C3774m.m15591a().mo15459d();
            if (TextUtils.isEmpty(d) || "0".equals(d)) {
                mo15453a(mo15452a());
                C3968x.m16530a((Object) "[DeviceIdTask] did is null, continue check.");
                return;
            }
            C3774m.m15603d().mo15505a(d);
            C3968x.m16530a((Object) ("[DeviceIdTask] did is " + d));
        }
    }

    public C3849c(Handler handler, long j, long j2) {
        super(handler, j, j2);
    }
}
