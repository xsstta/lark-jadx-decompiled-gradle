package com.bytedance.ttnet;

import android.util.Log;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.ss.android.agilelogger.ALog;

public class TTALog {
    private static volatile long sALogFuncAddr;

    public static long getALogFuncAddr() {
        return sALogFuncAddr;
    }

    public static void init() {
        ensureALogInitialized();
    }

    private static C13998f getCronetHttpClient() throws Exception {
        if (HttpClient.isCronetClientEnable()) {
            return C13998f.m56620a(TTNetInit.getTTNetDepend().mo69984a());
        }
        return null;
    }

    private static void ensureALogInitialized() {
        sALogFuncAddr = ALog.getALogWriteFuncAddr();
        Log.i("TTNET_ALog", "ALog function address is " + sALogFuncAddr);
        if (sALogFuncAddr == 0) {
            ALog.addNativeFuncAddrCallback($$Lambda$TTALog$ZTUgOadsqIwkIo5NApvBTJKQh8.INSTANCE);
        }
    }

    static /* synthetic */ void lambda$ensureALogInitialized$0(long j) {
        if (sALogFuncAddr != 0) {
            Log.i("TTNET_ALog", "ALog function address has initialized.");
        } else if (j == 0) {
            Log.w("TTNET_ALog", "Cannot get ALog function address in init callback.");
        } else {
            sALogFuncAddr = j;
            Log.i("TTNET_ALog", "ALog function address is " + sALogFuncAddr + " from callback.");
            try {
                C13998f cronetHttpClient = getCronetHttpClient();
                if (cronetHttpClient != null) {
                    cronetHttpClient.mo51542a(sALogFuncAddr);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
