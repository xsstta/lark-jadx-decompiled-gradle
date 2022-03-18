package com.ss.mediakit.fetcher;

import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AVMDLURLFetcherBridge implements AVMDLURLFetcherListener {
    private static AVMDLFetcherMakerInterface fetcherMaker = null;
    private static AVMDLNewFetcherMakerInterface newFetcherMaker = null;
    private static int sJniVersion = 2;
    public String engineId;
    private AVMDLURLFetcherInterface fetcherInstance;
    public String fileKey;
    private long handle = 0;
    boolean isFinish;
    private Lock lock = new ReentrantLock();
    String newURL;
    public String oldURL;
    public String rawKey;

    private static native void _notifyFetcherResult(long j, String str, String str2, String str3);

    private static native void _notifyFetcherResult(long j, String str, String str2, String str3, int i);

    /* access modifiers changed from: package-private */
    public boolean isFinish() {
        return this.isFinish;
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.newURL;
            this.lock.unlock();
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", "****get result:" + str);
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format("----start release fetcher:%s", this));
        this.lock.lock();
        try {
            this.handle = 0;
            this.lock.unlock();
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format("remove fetcher rawkey:%s, fileKey:%s", this.rawKey, this.fileKey));
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format("****end call release:%s", this));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public static void setFetcherMaker(AVMDLFetcherMakerInterface aVMDLFetcherMakerInterface) {
        if (aVMDLFetcherMakerInterface != null) {
            fetcherMaker = aVMDLFetcherMakerInterface;
        }
    }

    public static void setNewFetcherMaker(AVMDLNewFetcherMakerInterface aVMDLNewFetcherMakerInterface) {
        if (aVMDLNewFetcherMakerInterface != null) {
            newFetcherMaker = aVMDLNewFetcherMakerInterface;
        }
    }

    /* access modifiers changed from: package-private */
    public int getNewUrl(AVMDLURLFetcherInterface aVMDLURLFetcherInterface, String str, String str2, String str3) {
        this.rawKey = str;
        this.fileKey = str2;
        this.oldURL = str3;
        int start = aVMDLURLFetcherInterface.start(str, str2, str3, this);
        if (start <= 0) {
            return 0;
        }
        String[] uRLs = aVMDLURLFetcherInterface.getURLs();
        if (uRLs == null || uRLs.length == 0) {
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "****end fail start ret:%d, but getURLs null", Integer.valueOf(start)));
            return -2;
        } else if (this.handle == 0) {
            return 0;
        } else {
            this.newURL = uRLs[0];
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", "start notify result");
            if (sJniVersion == 2) {
                try {
                    _notifyFetcherResult(this.handle, str, str2, uRLs[0], 1);
                } catch (UnsatisfiedLinkError unused) {
                    sJniVersion = 1;
                }
            }
            if (sJniVersion == 1) {
                _notifyFetcherResult(this.handle, str, str2, uRLs[0]);
            }
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", "end notify result");
            return 1;
        }
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherListener
    public void onCompletion(int i, String str, String str2, String[] strArr) {
        this.lock.lock();
        try {
            if (!this.isFinish) {
                if (strArr != null && strArr.length > 0) {
                    this.newURL = strArr[0];
                }
                AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "receive completion code:%d result:%s", Integer.valueOf(i), this.newURL));
                this.isFinish = true;
                if (this.handle != 0) {
                    AVMDLLog.m256407d("AVMDLURLFetcherBridge", "start notify result");
                    if (sJniVersion == 2) {
                        try {
                            _notifyFetcherResult(this.handle, str, str2, this.newURL, i);
                        } catch (UnsatisfiedLinkError unused) {
                            sJniVersion = 1;
                        }
                    }
                    if (sJniVersion == 1) {
                        _notifyFetcherResult(this.handle, str, str2, this.newURL);
                    }
                    AVMDLLog.m256407d("AVMDLURLFetcherBridge", "end notify result");
                }
            } else {
                AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "has fetch finished not need cur completion code:%d result:%s", Integer.valueOf(i), this.newURL));
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int start(long j, String str, String str2, String str3) {
        int i;
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----old api fallback retry Jni");
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----start fetch rawkey:" + str);
        if (fetcherMaker == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl is null");
            return -1;
        }
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----old api fallback retry engine");
        this.lock.lock();
        this.handle = j;
        try {
            AVMDLURLFetcherInterface fetcher = fetcherMaker.getFetcher(str, str2, str3);
            this.fetcherInstance = fetcher;
            if (fetcher == null) {
                AVMDLLog.m256407d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                this.lock.unlock();
                return -1;
            }
            i = getNewUrl(fetcher, str, str2, str3);
            this.lock.unlock();
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "****call start end, result:%d", Integer.valueOf(i)));
            return i;
        } catch (Exception e) {
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "****call start failed, get exception: %s", e.toString()));
            i = -999;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j, String str, String str2, String str3, String str4) {
        int i;
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----new api fallback retry Jni");
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----start fetch rawkey:" + str);
        AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----start fetch engineID is:" + str4);
        if (newFetcherMaker != null) {
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----new api fallback retry engine");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                AVMDLLog.m256407d("AVMDLURLFetcherBridge", "****end fetch fail,fetcherMaker is null or rawky or filekey or originurl or engineId is null");
                return -1;
            }
            this.lock.lock();
            this.handle = j;
            try {
                this.engineId = str4;
                AVMDLURLFetcherInterface fetcher = newFetcherMaker.getFetcher(str, str2, str3, str4);
                this.fetcherInstance = fetcher;
                if (fetcher == null) {
                    AVMDLLog.m256407d("AVMDLURLFetcherBridge", "****fail, get fetcher is null");
                    this.lock.unlock();
                    return -1;
                }
                i = getNewUrl(fetcher, str, str2, str3);
                this.lock.unlock();
                AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "****call start end, result:%d", Integer.valueOf(i)));
                return i;
            } catch (Exception e) {
                AVMDLLog.m256407d("AVMDLURLFetcherBridge", String.format(Locale.ENGLISH, "****call start failed, get exception: %s", e.toString()));
                i = -999;
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        } else {
            AVMDLLog.m256407d("AVMDLURLFetcherBridge", "----old api fallback retry engine");
            return start(j, str, str2, str3);
        }
    }
}
