package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    private Future mFuture;
    public boolean mRet;

    @Override // com.ss.mediakit.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
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

    private static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        public void run() {
            AVMDLLog.m256407d("LocalDNS", String.format("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                AVMDLLog.m256407d("LocalDNS", String.format("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNS.mRet) {
                localDNS.cancel();
                AVMDLLog.m256407d("LocalDNS", String.format("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new AVMDLDNSInfo(0, localDNS.mHostname, (String) null, 0, localDNS.mId));
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.mediakit.net.LocalDNS.RunnableC653841 */

                public void run() {
                    int i;
                    AVMDLLog.m256407d("LocalDNS", String.format("----call local dns, host:%s", LocalDNS.this.mHostname));
                    try {
                        LocalDNS localDNS = LocalDNS.this;
                        localDNS.mAddress = InetAddress.getAllByName(localDNS.mHostname);
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            AVMDLLog.m256407d("LocalDNS", String.format("****end call local dns, not get address host:%s", LocalDNS.this.mHostname));
                            LocalDNS localDNS2 = LocalDNS.this;
                            localDNS2.notifyError(new AVMDLDNSInfo(0, localDNS2.mHostname, (String) null, 0, LocalDNS.this.mId));
                            return;
                        }
                        String str = "";
                        for (int i2 = 0; i2 < LocalDNS.this.mAddress.length; i2++) {
                            String hostAddress = LocalDNS.this.mAddress[i2].getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            AVMDLLog.m256407d("LocalDNS", String.format("****end call local dns, iplist null host:%s", LocalDNS.this.mHostname));
                            LocalDNS localDNS3 = LocalDNS.this;
                            localDNS3.notifyError(new AVMDLDNSInfo(0, localDNS3.mHostname, (String) null, 0, LocalDNS.this.mId));
                            return;
                        }
                        AVMDLLog.m256407d("LocalDNS", String.format("****default expiredtime:%d force expiredtime:%d ", Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)));
                        if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                            i = AVMDLDNSParser.mGlobalForceExpiredTime;
                        } else {
                            i = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                        }
                        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + ((long) (i * 1000)), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, aVMDLDNSInfo);
                        LocalDNS.this.notifySuccess(aVMDLDNSInfo);
                        AVMDLLog.m256407d("LocalDNS", String.format("****end call local dns, suc iplist:%s host:%s", str, LocalDNS.this.mHostname));
                    } catch (Throwable th) {
                        th.printStackTrace();
                        LocalDNS.this.mRet = true;
                        AVMDLLog.m256407d("LocalDNS", String.format("****end call local dns, end exception:%s host:%s", th, LocalDNS.this.mHostname));
                        LocalDNS localDNS4 = LocalDNS.this;
                        localDNS4.notifyError(new AVMDLDNSInfo(0, localDNS4.mHostname, (String) null, 0, LocalDNS.this.mId));
                    }
                }
            });
        } catch (Exception e) {
            AVMDLLog.m256407d("LocalDNS", String.format("****end call local dns, exception:%s host:%s", e, this.mHostname));
            notifyError(new AVMDLDNSInfo(0, this.mHostname, (String) null, 0, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
