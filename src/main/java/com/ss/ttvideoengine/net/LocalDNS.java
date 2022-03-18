package com.ss.ttvideoengine.net;

import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class LocalDNS extends BaseDNS {
    public InetAddress mAddress;
    private Future mFuture;
    public boolean mRet;

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            Future future = this.mFuture;
            if (future != null) {
                future.cancel(true);
                this.mFuture = null;
            }
        }
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public void close() {
        super.close();
        this.mCancelled = true;
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    private static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        public void run() {
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS != null) {
                synchronized (LocalDNS.class) {
                    if (!localDNS.mRet) {
                        localDNS.mRet = true;
                        localDNS.notifyError(new Error("kTTVideoErrorDomainLocalDNS", -10000));
                    }
                }
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    @Override // com.ss.ttvideoengine.net.BaseDNS
    public void start() {
        try {
            this.mFuture = EngineThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.ttvideoengine.net.LocalDNS.RunnableC654711 */

                /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
                    if (r1 != null) goto L_0x006b;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
                    r6.this$0.notifyError(new com.ss.ttvideoengine.utils.Error("kTTVideoErrorDomainLocalDNS", -9997));
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
                    r0 = new org.json.JSONObject();
                    r2 = new org.json.JSONArray();
                    r2.put(r1);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
                    r0.put("ips", r2);
                    r0.put("time", java.lang.System.currentTimeMillis());
                    r0.put("dns_type", "localDNS");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
                    com.ss.ttvideoengine.utils.TTVideoEngineLog.m256501d(r1);
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 197
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.net.LocalDNS.RunnableC654711.run():void");
                }
            });
        } catch (Exception e) {
            notifyError(new Error("kTTVideoErrorDomainLocalDNS", -9968, e.getMessage()));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNS(String str) {
        super(str);
        TTVideoEngineLog.m256505i("LocalDNS", "DNS use LocalDNS");
    }
}
