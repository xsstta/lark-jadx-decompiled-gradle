package com.bytedance.memory.p849e;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.memory.p847c.C20073b;
import com.bytedance.memory.p847c.C20074c;

/* renamed from: com.bytedance.memory.e.a */
public class C20077a implements IOOMCallback {
    @Override // com.bytedance.crash.IOOMCallback
    public void onCrash(CrashType crashType, Throwable th, Thread thread, long j) {
        try {
            if (!C20073b.m73242i().mo68046e()) {
                C20074c.m73254a().mo68051a(j);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
