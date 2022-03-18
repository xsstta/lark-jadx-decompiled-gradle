package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class LocalDNSHosts {
    public InetAddress[] mAddress;
    protected boolean mCancelled;
    private Future mFuture;
    protected Handler mHandler;
    public String[] mHosts;
    public String mId;
    protected AVMDLNetClient mNetClient;
    public boolean mRet;

    public boolean isRunning() {
        return this.mRet;
    }

    public void close() {
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

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

    /* access modifiers changed from: private */
    public static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNSHosts> mLocalDNSRef;

        public void run() {
            AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("----implement delayed check for local dns", new Object[0]));
            LocalDNSHosts localDNSHosts = this.mLocalDNSRef.get();
            if (localDNSHosts == null) {
                AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNSHosts.mRet) {
                localDNSHosts.cancel();
                AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("****end implement delayed check cancel local dns,", new Object[0]));
            }
        }

        public MyRunnable(LocalDNSHosts localDNSHosts) {
            this.mLocalDNSRef = new WeakReference<>(localDNSHosts);
        }
    }

    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.mediakit.net.LocalDNSHosts.RunnableC653851 */

                public void run() {
                    int i;
                    AVMDLLog.m256407d("BatchParseLocalDNSHosts", "----call local dns batch parse");
                    for (int i2 = 0; i2 < LocalDNSHosts.this.mHosts.length; i2++) {
                        if (!TextUtils.isEmpty(LocalDNSHosts.this.mHosts[i2])) {
                            try {
                                LocalDNSHosts localDNSHosts = LocalDNSHosts.this;
                                localDNSHosts.mAddress = InetAddress.getAllByName(localDNSHosts.mHosts[i2]);
                                String str = "";
                                for (int i3 = 0; i3 < LocalDNSHosts.this.mAddress.length; i3++) {
                                    String hostAddress = LocalDNSHosts.this.mAddress[i3].getHostAddress();
                                    if (!TextUtils.isEmpty(hostAddress)) {
                                        str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                                    }
                                }
                                AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("host:%s pasrse suc result:%s", LocalDNSHosts.this.mHosts[i2], str));
                                if (!TextUtils.isEmpty(str)) {
                                    AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("****default expiredtime:%d force expiredtime:%d ", Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)));
                                    if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                                        i = AVMDLDNSParser.mGlobalForceExpiredTime;
                                    } else {
                                        i = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                                    }
                                    IPCache.getInstance().put(LocalDNSHosts.this.mHosts[i2], new AVMDLDNSInfo(0, LocalDNSHosts.this.mHosts[i2], str, ((long) (i * 1000)) + System.currentTimeMillis(), LocalDNSHosts.this.mId));
                                }
                            } catch (Throwable th) {
                                AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("host:%s pasrse err:%s", LocalDNSHosts.this.mHosts[i2], th.getMessage()));
                            }
                        }
                    }
                    LocalDNSHosts.this.mRet = true;
                    AVMDLLog.m256407d("BatchParseLocalDNSHosts", "****end call local dns batch parse");
                }
            });
        } catch (Exception e) {
            AVMDLLog.m256407d("BatchParseLocalDNSHosts", String.format("****end call local dns, exception:%s", e));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNSHosts(String[] strArr, Handler handler) {
        this.mHosts = strArr;
        this.mHandler = handler;
    }
}
