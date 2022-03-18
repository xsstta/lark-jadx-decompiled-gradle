package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class CustomHTTPDNS extends BaseDNS {
    private InetAddress[] mAddress;
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
        private final WeakReference<CustomHTTPDNS> mCustomHTTPDNSRef;

        public void run() {
            AVMDLLog.m256407d("CustomHTTPDNS", String.format("----implement delayed check for custom httpdns", new Object[0]));
            CustomHTTPDNS customHTTPDNS = this.mCustomHTTPDNSRef.get();
            if (customHTTPDNS == null) {
                AVMDLLog.m256407d("CustomHTTPDNS", String.format("****end implement delayed check for custom httpdns, dns object null", new Object[0]));
            } else if (!customHTTPDNS.mRet) {
                customHTTPDNS.cancel();
                AVMDLLog.m256407d("CustomHTTPDNS", String.format("****end implement delayed check cancel custom httpdns,", new Object[0]));
                customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0, customHTTPDNS.mId));
            }
        }

        public MyRunnable(CustomHTTPDNS customHTTPDNS) {
            this.mCustomHTTPDNSRef = new WeakReference<>(customHTTPDNS);
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.mediakit.net.CustomHTTPDNS.RunnableC653781 */

                public void run() {
                    int i;
                    long j;
                    Object[] objArr = new Object[2];
                    objArr[0] = CustomHTTPDNS.this.mHostname;
                    if (AVMDLDNSParser.mCustomHttpDNSParser == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    objArr[1] = Integer.valueOf(i);
                    AVMDLLog.m256407d("CustomHTTPDNS", String.format("----call custom httpdns, host:%s custom parser:%d", objArr));
                    AVMDLCustomHTTPDNSParserResult aVMDLCustomHTTPDNSParserResult = null;
                    if (AVMDLDNSParser.mCustomHttpDNSParser != null) {
                        aVMDLCustomHTTPDNSParserResult = AVMDLDNSParser.mCustomHttpDNSParser.parseHost(CustomHTTPDNS.this.mHostname);
                    }
                    CustomHTTPDNS.this.mRet = true;
                    if (aVMDLCustomHTTPDNSParserResult == null || TextUtils.isEmpty(aVMDLCustomHTTPDNSParserResult.mIPList)) {
                        AVMDLLog.m256407d("CustomHTTPDNS", String.format("****end call custom httpdns, result null or iplist null host:%s", CustomHTTPDNS.this.mHostname));
                        CustomHTTPDNS customHTTPDNS = CustomHTTPDNS.this;
                        customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0, CustomHTTPDNS.this.mId));
                        return;
                    }
                    AVMDLLog.m256407d("CustomHTTPDNS", String.format("****default expiredtime:%d force expiredtime:%d ", Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)));
                    if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                        j = (long) AVMDLDNSParser.mGlobalForceExpiredTime;
                    } else {
                        j = aVMDLCustomHTTPDNSParserResult.mTTL;
                    }
                    AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(4, CustomHTTPDNS.this.mHostname, aVMDLCustomHTTPDNSParserResult.mIPList, System.currentTimeMillis() + (j * 1000), CustomHTTPDNS.this.mId);
                    IPCache.getInstance().put(CustomHTTPDNS.this.mHostname, aVMDLDNSInfo);
                    CustomHTTPDNS.this.notifySuccess(aVMDLDNSInfo);
                    AVMDLLog.m256407d("CustomHTTPDNS", String.format("****end call custom httpdns, suc iplist:%s host:%s", aVMDLCustomHTTPDNSParserResult.mIPList, CustomHTTPDNS.this.mHostname));
                }
            });
        } catch (Exception e) {
            AVMDLLog.m256407d("CustomHTTPDNS", String.format("****end call custom httpdns, exception:%s host:%s", e, this.mHostname));
            notifyError(new AVMDLDNSInfo(4, this.mHostname, (String) null, 0, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public CustomHTTPDNS(String str, Handler handler) {
        super(str, handler);
    }
}
