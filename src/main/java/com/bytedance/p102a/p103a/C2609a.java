package com.bytedance.p102a.p103a;

import android.util.Log;
import com.C1711a;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.a.a.a */
public class C2609a {

    /* renamed from: a */
    private static volatile boolean f8300a = false;

    /* renamed from: b */
    private static volatile boolean f8301b = false;

    /* renamed from: c */
    private static volatile AbstractC2610b f8302c = null;

    /* renamed from: d */
    private static volatile String f8303d = "ttboringssl";

    /* renamed from: e */
    private static volatile String f8304e = "ttcrypto";

    /* renamed from: f */
    private static Lock f8305f = new ReentrantLock();

    /* renamed from: a */
    public static boolean m10972a() {
        try {
            f8305f.lock();
            if (f8302c != null) {
                boolean a = f8302c.mo11280a();
                f8305f.unlock();
                return a;
            }
            if (!f8301b) {
                C1711a.m7628a(f8304e);
                f8301b = true;
            }
            if (!f8300a) {
                C1711a.m7628a(f8303d);
                f8300a = true;
            }
            f8305f.unlock();
            if (!f8300a || !f8301b) {
                return false;
            }
            return true;
        } catch (Error e) {
            Log.e("BoringsslLoaderWrapper", "load boringssl:" + f8300a + " load crypto:" + f8301b + "  err:" + e.toString());
        } catch (Throwable th) {
            f8305f.unlock();
            throw th;
        }
    }
}
