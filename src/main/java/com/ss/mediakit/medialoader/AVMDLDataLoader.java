package com.ss.mediakit.medialoader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.C1711a;
import com.bytedance.p102a.p103a.C2609a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.mediakit.net.AVMDLDNSInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.mediakit.net.IPCache;
import com.ss.mediakit.vcnlib.VcnlibloadWrapper;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AVMDLDataLoader implements Handler.Callback {
    private static boolean isSupportQueryEncode = true;
    private static AVMDLDataLoader mInstance;
    private static volatile boolean mIsLibraryLoaded;
    private static volatile boolean mIsMdlTtnetPluginLoaded;
    private boolean isSupportGetAuth;
    private AVMDLDataLoaderConfigure mConfigure;
    private long mEndTime;
    private LoaderListener mEventListener;
    private long mHandle;
    private Handler mHandler;
    private AVMDLDataLoaderListener mLiveListener;
    public Handler mLogHandler;
    private Thread mMsgThread;
    private final ReentrantReadWriteLock.ReadLock mReadLock;
    private final ReentrantReadWriteLock mReadWritedLock;
    private long mSartTime;
    private AVMDLStartCompleteListener mStartCompleteListener;
    private volatile int mState = -1;
    private AVMDLDataLoaderListener mVodListener;
    private Map<String, AVMDLCopyOperation> mWaitingCopyItem;
    private final ReentrantReadWriteLock.WriteLock mWriteLock;

    private static native void _addDataSource(long j, int i, String str);

    private static native void _cancel(long j, String str);

    private static native void _cancelAll(long j);

    private static native void _cancelAllPreloadWaitReqs(long j);

    private static native void _clearAllCaches(long j);

    private static native void _clearCachesByUsedTime(long j, long j2);

    private static native void _clearNetinfoCache(long j);

    private static native void _close(long j);

    private static native int _copyFile(long j, String str, String str2);

    private final native long _create();

    private static native void _downloadResource(long j, String str);

    private static native String _encodeUrl(String str, int i);

    private static native void _forceRemoveCacheFile(long j, String str);

    private static native String _getAuth(long j, String str);

    private static native String _getCDNLog(long j, String str);

    private static native int _getIsFileCacheComplete(long j, String str);

    private static native long _getLongValue(long j, int i);

    private static native long _getLongValueByStr(long j, String str, int i);

    private static native long _getLongValueByStrStr(long j, String str, String str2, int i);

    private static native String _getStringValue(long j, int i);

    private static native String _getStringValueByStr(long j, String str, int i);

    private static native String _getStringValueByStrStr(long j, String str, String str2, int i);

    private static native void _makeFileAutoDeleteFlag(long j, String str, int i);

    private static native String _makeTsFileKey(String str, String str2);

    private static native void _p2pPredown(long j, String str);

    private static native void _preConnectByHost(long j, String str, int i);

    private static native void _preloadGroupResource(long j, String str, String str2, int i, int i2);

    private static native void _preloadResource(long j, String str, int i);

    private static native void _preloadResourceWithOffset(long j, String str, int i, int i2);

    private static native void _removeCacheFile(long j, String str);

    private static native void _resumeFileWriteIO(long j);

    private static native void _setInt64Value(long j, int i, long j2);

    private static native void _setInt64ValueByStrKey(long j, int i, String str, long j2);

    private static native void _setIntValue(long j, int i, int i2);

    private static native void _setStringValue(long j, int i, String str);

    private static native int _start(long j);

    private static native void _stop(long j);

    private static native void _suspendedDownload(long j, String str);

    private static native int _tryDownloadPlayReqByKey(long j, String str);

    private static native void _updateDNSInfo(long j, String str, String str2, long j2, String str3, int i);

    private boolean isNotifyInfo(int i) {
        return i == 4 || i == 20 || i == 50 || i == 8 || i == 3 || i == 21 || i == 51 || i == 7 || i == 22 || i == 52;
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public boolean isRunning() {
        if (this.mState == 1) {
            return true;
        }
        return false;
    }

    public static synchronized boolean tryLoadTTNetLoaderPlugin() {
        boolean z;
        synchronized (AVMDLDataLoader.class) {
            z = mIsMdlTtnetPluginLoaded;
        }
        return z;
    }

    private void hijack() {
        AVMDLLog.m256407d("ttmn", "----hijack start");
        AVMDLDNSParser.processHijack();
        AVMDLLog.m256407d("ttmn", "hijack clear net cache: ");
        clearNetinfoCache();
        AVMDLLog.m256407d("ttmn", "****hijack end");
    }

    public static boolean tryLoadVcnverifylib() {
        if (!VcnlibloadWrapper.tryLoadVcnlib()) {
            Log.e("ttmn", "Can't load vcn ");
            AVMDLLog.m256407d("vcn", "load vcnverify fail");
            return false;
        }
        AVMDLLog.m256407d("vcn", "load vcnverify suc");
        return true;
    }

    public int start() {
        if (this.mState == 1) {
            return 0;
        }
        initNativeHandle();
        new_insert_after_java_lang_Thread_by_knot(new Thread(new Runnable() {
            /* class com.ss.mediakit.medialoader.AVMDLDataLoader.RunnableC653742 */

            public void run() {
                AVMDLDataLoader.this.startInternal();
            }
        })).start();
        return 0;
    }

    public static AVMDLDataLoader getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDataLoader.class) {
                if (mInstance == null) {
                    try {
                        mInstance = new AVMDLDataLoader(null);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e("ttmdl", "create native exception" + e);
                        mInstance = null;
                    }
                }
            }
        }
        return mInstance;
    }

    private void initNativeHandle() {
        if (this.mHandle == 0) {
            try {
                this.mHandle = _create();
            } catch (Throwable th) {
                this.mHandle = 0;
                th.printStackTrace();
            }
            if (this.mHandle != 0 && this.mHandler == null) {
                if (Looper.myLooper() != null) {
                    this.mHandler = new Handler(this);
                } else {
                    this.mHandler = new Handler(Looper.getMainLooper(), this);
                }
            }
        }
    }

    public static synchronized void loadAVMDLBaseLibrary() {
        synchronized (AVMDLDataLoader.class) {
            try {
                C1711a.m7628a("avmdlbase");
            } catch (UnsatisfiedLinkError e) {
                Log.e("ttmn", "Can't load avmdlbase library: " + e);
            } catch (Throwable th) {
                Log.e("ttmn", "other exception when loading avmdlbase library: " + th);
            }
        }
    }

    public void cancelAll() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancelAll(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void cancelAllPreloadWaitReqs() {
        if (this.mState == 1) {
            this.mReadLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancelAllPreloadWaitReqs(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mReadLock.unlock();
                throw th;
            }
            this.mReadLock.unlock();
        }
    }

    public void clearAllCaches() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _clearAllCaches(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void clearNetinfoCache() {
        if (this.mState == 1) {
            IPCache.getInstance().clear();
            this.mWriteLock.lock();
            try {
                _clearNetinfoCache(this.mHandle);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public long getAllCacheSize() {
        long j = -1;
        if (this.mState != 1) {
            return -1;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValue(j2, 100);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return j;
    }

    public String getLocalAddr() {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str = _getStringValue(j, 4);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str;
    }

    public void resumeFileWriteIO() {
        if (this.mState == 1) {
            AVMDLLog.m256407d("AVMDLDataLoader", "resume file write io: ");
            this.mWriteLock.lock();
            try {
                if (this.mConfigure.mMaxFileMemCacheSize > 0) {
                    _resumeFileWriteIO(this.mHandle);
                    this.mConfigure.mMaxFileMemCacheSize = 0;
                }
            } catch (Exception | UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void stop() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _stop(j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void close() {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _close(j);
                    this.mHandle = 0;
                    this.mState = 5;
                    Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                        this.mHandler = null;
                    }
                    Handler handler2 = this.mLogHandler;
                    if (handler2 != null) {
                        handler2.removeCallbacksAndMessages(null);
                        this.mLogHandler.getLooper().quit();
                        this.mLogHandler = null;
                        this.mMsgThread = null;
                    }
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void startInternal() {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                initLogThread(this);
                if (this.mHandle != 0) {
                    setConfigureInternal(this.mConfigure);
                    if (_start(this.mHandle) >= 0) {
                        this.mState = 1;
                    }
                }
            }
            this.mWriteLock.unlock();
            if (this.mConfigure.mEnableBenchMarkIOSpeed > 0) {
                int testFileIOSpeed = testFileIOSpeed();
                AVMDLLog.m256407d("BENCHMARKIO", String.format("test io average speed:%d", Integer.valueOf(testFileIOSpeed)));
                if (testFileIOSpeed > 0) {
                    setIntValue(1508, testFileIOSpeed);
                }
            }
            AVMDLStartCompleteListener aVMDLStartCompleteListener = this.mStartCompleteListener;
            if (aVMDLStartCompleteListener != null) {
                aVMDLStartCompleteListener.onStartComplete();
            }
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r15 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        com.ss.mediakit.medialoader.AVMDLLog.m256407d("BENCHMARKIO", "test fileio exception:" + r0);
        r0.printStackTrace();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int testFileIOSpeed() {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.testFileIOSpeed():int");
    }

    public void setStartCompleteListener(AVMDLStartCompleteListener aVMDLStartCompleteListener) {
        this.mStartCompleteListener = aVMDLStartCompleteListener;
    }

    public void doParseHosts(String[] strArr) {
        AVMDLDNSParser.getInstance().doParseHosts(strArr);
    }

    private String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private void initLogThread(final Handler.Callback callback) {
        if (this.mMsgThread == null) {
            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread() {
                /* class com.ss.mediakit.medialoader.AVMDLDataLoader.C653731 */

                public void run() {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    AVMDLDataLoader.this.mLogHandler = new Handler(callback);
                    Looper.loop();
                }
            });
            this.mMsgThread = new_insert_after_java_lang_Thread_by_knot;
            new_insert_after_java_lang_Thread_by_knot.setName("mdl_log_handler");
            this.mMsgThread.start();
        }
    }

    public int asyncCopyOperation(AVMDLCopyOperation aVMDLCopyOperation) {
        Handler handler;
        if (this.mState != 1 || (handler = this.mLogHandler) == null) {
            return -1;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 23;
        obtainMessage.obj = aVMDLCopyOperation;
        obtainMessage.sendToTarget();
        return 0;
    }

    public void setConfigure(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        this.mWriteLock.lock();
        try {
            if (this.mState != 1) {
                this.mConfigure = aVMDLDataLoaderConfigure;
                aVMDLDataLoaderConfigure.ParseJsonConfig();
            }
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void setEventListener(LoaderListener loaderListener) {
        this.mWriteLock.lock();
        try {
            this.mEventListener = loaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void cancel(String str) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _cancel(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void downloadResource(String str) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _downloadResource(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void forceRemoveFileCache(String str) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _forceRemoveCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public String getAuth(String str) {
        String str2 = null;
        if (this.mState != 1 || !this.isSupportGetAuth) {
            return null;
        }
        this.mReadLock.lock();
        try {
            str2 = _getAuth(this.mHandle, str);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            this.isSupportGetAuth = false;
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str2;
    }

    public String getCDNLog(String str) {
        String str2 = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            str2 = _getCDNLog(this.mHandle, str);
        } catch (UnsatisfiedLinkError e) {
            AVMDLLog.m256407d("AVMDLDataLoader", "not support get cdnlog," + e.toString());
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str2;
    }

    public long getCacheSize(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValueByStr(j2, str, 103);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return j;
    }

    public String getStringCacheInfo(String str) {
        String str2 = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str2 = _getStringValueByStr(j, str, 101);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str2;
    }

    public String getStringValue(int i) {
        String str = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str = _getStringValue(j, i);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str;
    }

    public void removeFileCache(String str) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _removeCacheFile(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setListener(AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        try {
            this.mVodListener = aVMDLDataLoaderListener;
        } finally {
            this.mWriteLock.unlock();
        }
    }

    public void suspendDownload(String str) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _suspendedDownload(j, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public long tryQuickGetCacheSize(String str) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValueByStr(j2, str, 106);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return j;
    }

    public void tryToClearCachesByUsedTime(long j) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _clearCachesByUsedTime(j2, j);
                }
            } catch (UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    private AVMDLDataLoader(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) throws Exception {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWritedLock = reentrantReadWriteLock;
        this.mMsgThread = null;
        this.isSupportGetAuth = true;
        this.mStartCompleteListener = null;
        this.mWaitingCopyItem = new HashMap();
        initNativeHandle();
        this.mReadLock = reentrantReadWriteLock.readLock();
        this.mWriteLock = reentrantReadWriteLock.writeLock();
        if (this.mHandle != 0) {
            initLogThread(this);
            this.mConfigure = aVMDLDataLoaderConfigure;
            this.mState = 0;
            this.isSupportGetAuth = true;
            return;
        }
        throw new Exception("create native mdl fail");
    }

    public AVMDLFileInfo getCacheInfo(String str) {
        UnsatisfiedLinkError e;
        AVMDLFileInfo aVMDLFileInfo = null;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                String[] split = _getStringValueByStr(j, str, 101).split(",");
                if (split.length >= 3) {
                    AVMDLFileInfo aVMDLFileInfo2 = new AVMDLFileInfo();
                    try {
                        aVMDLFileInfo2.mFilePath = split[2];
                        if (!TextUtils.isEmpty(split[0])) {
                            aVMDLFileInfo2.mCacheSize = Long.valueOf(split[0]).longValue();
                        }
                        if (!TextUtils.isEmpty(split[1])) {
                            aVMDLFileInfo2.mContentLenght = Long.valueOf(split[1]).longValue();
                        }
                        aVMDLFileInfo = aVMDLFileInfo2;
                    } catch (UnsatisfiedLinkError e2) {
                        e = e2;
                        aVMDLFileInfo = aVMDLFileInfo2;
                        try {
                            e.printStackTrace();
                            this.mReadLock.unlock();
                            return aVMDLFileInfo;
                        } catch (Throwable th) {
                            this.mReadLock.unlock();
                            throw th;
                        }
                    }
                }
            }
        } catch (UnsatisfiedLinkError e3) {
            e = e3;
            e.printStackTrace();
            this.mReadLock.unlock();
            return aVMDLFileInfo;
        }
        this.mReadLock.unlock();
        return aVMDLFileInfo;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 23) {
            AVMDLCopyOperation aVMDLCopyOperation = (AVMDLCopyOperation) message.obj;
            if (aVMDLCopyOperation == null) {
                return true;
            }
            copyInternal(aVMDLCopyOperation);
            return true;
        }
        if (i == 3 || i == 51) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj;
            if (this.mWaitingCopyItem.size() > 0 && aVMDLDataLoaderNotifyInfo != null) {
                handleCopyMsg(aVMDLDataLoaderNotifyInfo);
            }
        }
        if (i == 12 || i == 9) {
            return postMessage(this.mLiveListener, message);
        }
        if (i == 71 || i == 72 || i == 73 || i == 74) {
            return postMessage(this.mEventListener, message);
        }
        return postMessage(this.mVodListener, message);
    }

    public void p2pPredown(String str) {
        if (this.mState == 1) {
            if (this.mConfigure.mLoaderType <= 0) {
                AVMDLLog.m256407d("AVMDLDataLoader", "not enable p2p,not need p2ppredown, configure loader type" + this.mConfigure.mLoaderType);
                return;
            }
            String encodeUrl = encodeUrl(str);
            if (TextUtils.isEmpty(encodeUrl)) {
                AVMDLLog.m256407d("AVMDLDataLoader", "encode url null, not need p2p predown");
                return;
            }
            AVMDLLog.m256407d("AVMDLDataLoader", "p2p predown start");
            this.mReadLock.lock();
            try {
                _p2pPredown(this.mHandle, encodeUrl);
            } catch (UnsatisfiedLinkError e) {
                AVMDLLog.m256407d("AVMDLDataLoader", "p2p predown exception" + e.toString());
            } catch (Throwable th) {
                this.mReadLock.unlock();
                throw th;
            }
            this.mReadLock.unlock();
            AVMDLLog.m256407d("AVMDLDataLoader", "p2p predown end");
        }
    }

    private void copyInternal(AVMDLCopyOperation aVMDLCopyOperation) {
        if (aVMDLCopyOperation == null || TextUtils.isEmpty(aVMDLCopyOperation.mFileKey) || TextUtils.isEmpty(aVMDLCopyOperation.mDestPath)) {
            AVMDLLog.m256407d("AVMDLDataLoader", "copy file invalid filekey or destpath is null");
            if (aVMDLCopyOperation != null && aVMDLCopyOperation.mListener != null) {
                aVMDLCopyOperation.mListener.onCopyComplete(false, -1, "invalid parameter");
                return;
            }
            return;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                int _getIsFileCacheComplete = _getIsFileCacheComplete(j, aVMDLCopyOperation.mFileKey);
                if (_getIsFileCacheComplete == 1) {
                    int copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath);
                    AVMDLLog.m256407d("AVMDLDataLoader", "copy file result: " + copyFile);
                    if (aVMDLCopyOperation.mListener != null) {
                        if (copyFile == 0) {
                            aVMDLCopyOperation.mListener.onCopyComplete(true, 0, "copy success.");
                        } else {
                            AVMDLCopyOperationListener aVMDLCopyOperationListener = aVMDLCopyOperation.mListener;
                            aVMDLCopyOperationListener.onCopyComplete(false, -5, "copy failed.copy error code " + copyFile);
                        }
                    }
                } else if (_getIsFileCacheComplete == -1) {
                    if (aVMDLCopyOperation.mListener != null) {
                        aVMDLCopyOperation.mListener.onCopyComplete(false, -6, "cache file have empty hole.");
                    }
                } else if (aVMDLCopyOperation.mWaitIfCaching) {
                    int _tryDownloadPlayReqByKey = _tryDownloadPlayReqByKey(this.mHandle, aVMDLCopyOperation.mFileKey);
                    AVMDLLog.m256407d("AVMDLDataLoader", "try download play " + aVMDLCopyOperation.mFileKey + " result: " + _tryDownloadPlayReqByKey);
                    if (_tryDownloadPlayReqByKey == 0) {
                        this.mWaitingCopyItem.put(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation);
                    } else if (aVMDLCopyOperation.mListener != null) {
                        aVMDLCopyOperation.mListener.onCopyComplete(false, -4, "file key not playing.");
                    }
                } else if (aVMDLCopyOperation.mListener != null) {
                    aVMDLCopyOperation.mListener.onCopyComplete(false, -3, "cache not finish.");
                }
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            if (aVMDLCopyOperation.mListener != null) {
                aVMDLCopyOperation.mListener.onCopyComplete(false, -2, "medialoader not running");
            }
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
    }

    private void handleCopyMsg(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        if (aVMDLDataLoaderNotifyInfo != null) {
            if (aVMDLDataLoaderNotifyInfo.what == 3 || aVMDLDataLoaderNotifyInfo.what == 51) {
                String[] split = aVMDLDataLoaderNotifyInfo.logInfo.split(",");
                if (split.length >= 4) {
                    long longValue = Long.valueOf(split[0]).longValue();
                    long longValue2 = Long.valueOf(split[1]).longValue();
                    if (longValue2 > 0 || aVMDLDataLoaderNotifyInfo.what == 4) {
                        String str = split[2];
                        if (this.mWaitingCopyItem.containsKey(str)) {
                            AVMDLCopyOperation aVMDLCopyOperation = this.mWaitingCopyItem.get(str);
                            if (longValue == longValue2) {
                                if (aVMDLCopyOperation != null) {
                                    int copyFile = copyFile(aVMDLCopyOperation.mFileKey, aVMDLCopyOperation.mDestPath);
                                    if (aVMDLCopyOperation.mListener == null) {
                                        return;
                                    }
                                    if (copyFile == 0) {
                                        aVMDLCopyOperation.mListener.onCopyComplete(true, 0, "copy success.");
                                    } else {
                                        aVMDLCopyOperation.mListener.onCopyComplete(false, -5, "copy failed.");
                                    }
                                }
                            } else if (aVMDLDataLoaderNotifyInfo.what == 51 && aVMDLCopyOperation.mListener != null) {
                                aVMDLCopyOperation.mListener.onCopyComplete(false, -3, "copy failed.");
                            }
                        }
                    }
                }
            }
        }
    }

    public static synchronized int init(boolean z) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsLibraryLoaded) {
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!mIsLibraryLoaded) {
                if (!C2609a.m10972a()) {
                    Log.e("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    Log.e("ttmn", "Can't load vcn ");
                }
                loadAVMDLBaseLibrary();
                try {
                    C1711a.m7628a("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("ttmn", "Can't load avmdl library: " + e);
                } catch (Throwable th) {
                    Log.e("ttmn", "other exception when loading avmdl library: " + th);
                }
                if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                    Log.e("ttmn", "Can't load vcnverify lib ");
                }
                tryLoadTTNetLoaderPlugin();
            }
            if (!mIsLibraryLoaded) {
                return -1;
            }
            return 0;
        }
    }

    public static String queryComponentEncode(String str) {
        if (isSupportQueryEncode && !TextUtils.isEmpty(str)) {
            AVMDLLog.m256407d("AVMDLDataLoader", "before encode, src: " + str);
            try {
                return _encodeUrl(str, 4);
            } catch (UnsatisfiedLinkError e) {
                isSupportQueryEncode = false;
                AVMDLLog.m256407d("AVMDLDataLoader", "query ComponentEncode:err " + e.getMessage());
                AVMDLLog.m256407d("AVMDLDataLoader", "query ComponentEncode:stacktrace " + e.getStackTrace());
            } catch (Exception e2) {
                AVMDLLog.m256407d("AVMDLDataLoader", "query ComponentEncode:err " + e2.getMessage());
                AVMDLLog.m256407d("AVMDLDataLoader", "query ComponentEncode:stacktrace " + e2.getStackTrace());
            }
        }
        return null;
    }

    public long getLongValue(int i) {
        long j;
        int i2;
        long j2 = -1;
        if (i == 7218 || i == 7390 || i == 9407 || i == 7402) {
            long j3 = this.mHandle;
            if (j3 != 0) {
                return _getLongValue(j3, i);
            }
            return -1;
        } else if (this.mState != 1) {
            AVMDLLog.m256407d("ttmn", "getLongValue key: " + i + " result: " + -1L);
            return -1;
        } else if (this.mConfigure == null) {
            AVMDLLog.m256407d("ttmn", "getLongValue key: " + i + " result: " + -998L);
            return -998;
        } else {
            this.mReadLock.lock();
            switch (i) {
                case JosStatusCodes.RTN_CODE_PARAMS_ERROR:
                    i2 = this.mConfigure.mLiveLoaderEnable;
                    j = (long) i2;
                    j2 = j;
                    break;
                case 8101:
                    i2 = this.mConfigure.mLiveP2pAllow;
                    j = (long) i2;
                    j2 = j;
                    break;
                case 8102:
                    i2 = this.mConfigure.mLiveEnableMdlProto;
                    j = (long) i2;
                    j2 = j;
                    break;
                case 8103:
                    i2 = this.mConfigure.mLiveLoaderType;
                    j = (long) i2;
                    j2 = j;
                    break;
                default:
                    try {
                        long j4 = this.mHandle;
                        if (j4 != 0) {
                            j = _getLongValue(j4, i);
                            j2 = j;
                            break;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        e.printStackTrace();
                        break;
                    } catch (Throwable th) {
                        this.mReadLock.unlock();
                        throw th;
                    }
                    break;
            }
            this.mReadLock.unlock();
            AVMDLLog.m256407d("ttmn", "getLongValue key: " + i + " result: " + j2);
            return j2;
        }
    }

    public void onEventInfo(Object obj) {
        String str;
        if (this.mState == 1 && this.mLogHandler != null) {
            LoaderEventInfo loaderEventInfo = new LoaderEventInfo();
            loaderEventInfo.what = 74;
            try {
                HashMap hashMap = (HashMap) obj;
                if (hashMap.containsKey("what")) {
                    loaderEventInfo.what = ((Integer) hashMap.get("what")).intValue();
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains What" + loaderEventInfo.what);
                }
                if (hashMap.containsKey("taskType")) {
                    loaderEventInfo.taskType = ((Integer) hashMap.get("taskType")).intValue();
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains taskType" + loaderEventInfo.taskType);
                }
                if (hashMap.containsKey("off")) {
                    loaderEventInfo.off = ((Long) hashMap.get("off")).longValue();
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains off" + loaderEventInfo.off);
                }
                if (hashMap.containsKey("endOff")) {
                    loaderEventInfo.endOff = ((Long) hashMap.get("endOff")).longValue();
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains endOff" + loaderEventInfo.endOff);
                }
                if (hashMap.containsKey("fileHash")) {
                    loaderEventInfo.fileHash = String.valueOf(hashMap.get("fileHash"));
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains fileHash" + loaderEventInfo.fileHash);
                }
                if (hashMap.containsKey("bytesLoaded")) {
                    loaderEventInfo.bytesLoaded = ((Long) hashMap.get("bytesLoaded")).longValue();
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains bytesLoaded" + loaderEventInfo.bytesLoaded);
                }
                if (hashMap.containsKey("headers")) {
                    str = String.valueOf(hashMap.get("headers"));
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] eventMap contains headers" + str);
                } else {
                    str = "";
                }
                if (str != "") {
                    for (String str2 : str.split("\r\n")) {
                        String[] split = str2.split(":");
                        loaderEventInfo.mHeaders.put(split[0], split[1]);
                    }
                } else {
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI] what" + loaderEventInfo.what);
                    AVMDLLog.m256407d("AVMDLDataLoader", "[debugUI]no headers");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Message obtainMessage = this.mLogHandler.obtainMessage();
            obtainMessage.what = loaderEventInfo.what;
            obtainMessage.obj = loaderEventInfo;
            obtainMessage.sendToTarget();
        }
    }

    private void setConfigureInternal(AVMDLDataLoaderConfigure aVMDLDataLoaderConfigure) {
        if (this.mHandle != 0 && aVMDLDataLoaderConfigure != null) {
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mCacheDir)) {
                String createFilePathBaseDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "loaderFactory");
                if (!TextUtils.isEmpty(createFilePathBaseDir)) {
                    _setStringValue(this.mHandle, 9, createFilePathBaseDir);
                }
                if (TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                    aVMDLDataLoaderConfigure.mNetCacheDir = createFilePathBaseDir(aVMDLDataLoaderConfigure.mCacheDir, "netCache");
                }
                _setStringValue(this.mHandle, 0, aVMDLDataLoaderConfigure.mCacheDir);
            }
            if (!TextUtils.isEmpty(this.mConfigure.mNetCacheDir)) {
                _setStringValue(this.mHandle, 5510, aVMDLDataLoaderConfigure.mNetCacheDir);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mAppInfo)) {
                _setStringValue(this.mHandle, 10, aVMDLDataLoaderConfigure.mAppInfo);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDownloadDir)) {
                _setStringValue(this.mHandle, 7300, aVMDLDataLoaderConfigure.mDownloadDir);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mMdlExtensionOptsStr)) {
                _setStringValue(this.mHandle, 7500, aVMDLDataLoaderConfigure.mMdlExtensionOptsStr);
            }
            _setIntValue(this.mHandle, JosStatusCodes.RTN_CODE_NO_SUPPORT_JOS, aVMDLDataLoaderConfigure.mLiveP2pAllow);
            _setIntValue(this.mHandle, JosStatusCodes.RTN_CODE_COMMON_ERROR, aVMDLDataLoaderConfigure.mLiveLoaderType);
            _setIntValue(this.mHandle, 8005, aVMDLDataLoaderConfigure.mLiveWatchDurationThreshold);
            _setIntValue(this.mHandle, 8006, aVMDLDataLoaderConfigure.mLiveCacheThresholdHttpToP2p);
            _setIntValue(this.mHandle, 8007, aVMDLDataLoaderConfigure.mLiveCacheThresholdP2pToHttp);
            _setIntValue(this.mHandle, 8008, aVMDLDataLoaderConfigure.mLiveMaxTrySwitchP2pTimes);
            _setIntValue(this.mHandle, 8009, aVMDLDataLoaderConfigure.mLiveWaitP2pReadyThreshold);
            _setIntValue(this.mHandle, 8010, aVMDLDataLoaderConfigure.mLiveMobileUploadAllow);
            _setIntValue(this.mHandle, 8011, aVMDLDataLoaderConfigure.mLiveMobileDownloadAllow);
            _setIntValue(this.mHandle, 8012, aVMDLDataLoaderConfigure.mLiveRecvDataTimeout);
            _setStringValue(this.mHandle, 8021, aVMDLDataLoaderConfigure.mLiveContainerString);
            _setIntValue(this.mHandle, 1, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 2, aVMDLDataLoaderConfigure.mRWTimeOut);
            _setIntValue(this.mHandle, 3, aVMDLDataLoaderConfigure.mOpenTimeOut);
            _setIntValue(this.mHandle, 5, aVMDLDataLoaderConfigure.mTryCount);
            _setIntValue(this.mHandle, 7, aVMDLDataLoaderConfigure.mMaxCacheSize);
            _setIntValue(this.mHandle, 8, aVMDLDataLoaderConfigure.mLoaderFactoryMaxMemorySize);
            _setIntValue(this.mHandle, 6, aVMDLDataLoaderConfigure.mLoaderType);
            _setIntValue(this.mHandle, 102, aVMDLDataLoaderConfigure.mPreloadParallelNum);
            _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
            if (aVMDLDataLoaderConfigure.mMaxCacheAge > 0) {
                _setIntValue(this.mHandle, 104, aVMDLDataLoaderConfigure.mMaxCacheAge);
            }
            _setIntValue(this.mHandle, SmEvents.EVENT_NT, aVMDLDataLoaderConfigure.mEnableMaxCacheAgeForAllDir);
            _setIntValue(this.mHandle, 1030, aVMDLDataLoaderConfigure.mPreloadStrategy);
            _setIntValue(this.mHandle, 1040, aVMDLDataLoaderConfigure.mPreloadWaitListType);
            _setIntValue(this.mHandle, LocationRequest.PRIORITY_NO_POWER, aVMDLDataLoaderConfigure.mEnablePreloadReUse);
            _setIntValue(this.mHandle, 700, aVMDLDataLoaderConfigure.mEnableExternDNS);
            _setIntValue(this.mHandle, 701, aVMDLDataLoaderConfigure.mEnableSocketReuse);
            _setIntValue(this.mHandle, 703, aVMDLDataLoaderConfigure.mControlCDNRangeType);
            _setIntValue(this.mHandle, 702, aVMDLDataLoaderConfigure.mSocketIdleTimeOut);
            _setIntValue(this.mHandle, 800, aVMDLDataLoaderConfigure.mIsCloseFileCache);
            _setIntValue(this.mHandle, 8216, aVMDLDataLoaderConfigure.mLoaderFactoryP2PLevel);
            _setIntValue(this.mHandle, 1502, aVMDLDataLoaderConfigure.mTestSpeedTypeVersion);
            _setIntValue(this.mHandle, 1504, aVMDLDataLoaderConfigure.mCheckSumLevel);
            _setIntValue(this.mHandle, 1505, aVMDLDataLoaderConfigure.mEncryptVersion);
            _setIntValue(this.mHandle, 1507, aVMDLDataLoaderConfigure.mSpeedCoefficientValue);
            _setIntValue(this.mHandle, 900, aVMDLDataLoaderConfigure.mMaxIpCountEachDomain);
            _setIntValue(this.mHandle, 901, aVMDLDataLoaderConfigure.mEnableIpBucket);
            _setIntValue(this.mHandle, 902, aVMDLDataLoaderConfigure.mErrorStateTrustTime);
            _setIntValue(this.mHandle, 2508, aVMDLDataLoaderConfigure.mEnablePreconnect);
            _setIntValue(this.mHandle, 2509, aVMDLDataLoaderConfigure.mPreconnectNum);
            _setIntValue(this.mHandle, 2510, aVMDLDataLoaderConfigure.mEnableLoaderPreempt);
            _setIntValue(this.mHandle, 2511, aVMDLDataLoaderConfigure.mNextDownloadThreshold);
            _setIntValue(this.mHandle, 7216, aVMDLDataLoaderConfigure.mOnlyUseCdn);
            _setIntValue(this.mHandle, 3511, aVMDLDataLoaderConfigure.mAccessCheckLevel);
            _setIntValue(this.mHandle, 5511, aVMDLDataLoaderConfigure.mEnableSessionReuse);
            _setIntValue(this.mHandle, 5512, aVMDLDataLoaderConfigure.mMaxTlsVersion);
            _setIntValue(this.mHandle, 6512, aVMDLDataLoaderConfigure.mCheckPreloadLevel);
            _setIntValue(this.mHandle, 8217, aVMDLDataLoaderConfigure.mXYLibValue);
            _setIntValue(this.mHandle, 7340, aVMDLDataLoaderConfigure.mEnableP2PPreDown);
            _setIntValue(this.mHandle, 7341, aVMDLDataLoaderConfigure.mEnablePlayLog);
            _setIntValue(this.mHandle, 7342, aVMDLDataLoaderConfigure.mEnableNetScheduler);
            _setIntValue(this.mHandle, 7358, aVMDLDataLoaderConfigure.mEnableCacheReqRange);
            _setIntValue(this.mHandle, 7343, aVMDLDataLoaderConfigure.mNetSchedulerBlockAllNetErr);
            _setIntValue(this.mHandle, 7344, aVMDLDataLoaderConfigure.mNetSchedulerBlockErrCount);
            _setIntValue(this.mHandle, 7345, aVMDLDataLoaderConfigure.mNetSChedulerBlockDurationMs);
            _setIntValue(this.mHandle, 7346, aVMDLDataLoaderConfigure.mFirstRangeLeftThreshold);
            _setIntValue(this.mHandle, 7394, aVMDLDataLoaderConfigure.mNetSchedulerBlockHostIpErrCount);
            _setIntValue(this.mHandle, 5513, aVMDLDataLoaderConfigure.mMaxFileMemCacheSize);
            _setIntValue(this.mHandle, 5515, aVMDLDataLoaderConfigure.mMaxFileMemCacheNum);
            _setIntValue(this.mHandle, SmEvents.EVENT_NO, aVMDLDataLoaderConfigure.mWriteFileNotifyIntervalMS);
            _setIntValue(this.mHandle, 7359, aVMDLDataLoaderConfigure.mP2PPreDownPeerCount);
            _setIntValue(this.mHandle, 7372, aVMDLDataLoaderConfigure.mP2PFirstRangeLoaderType);
            if (aVMDLDataLoaderConfigure.mSocketSendBufferKB > 0) {
                _setIntValue(this.mHandle, 7220, aVMDLDataLoaderConfigure.mSocketSendBufferKB);
            }
            if (aVMDLDataLoaderConfigure.mRingBufferSizeKB > 0) {
                _setIntValue(this.mHandle, 7221, aVMDLDataLoaderConfigure.mRingBufferSizeKB);
            }
            _setIntValue(this.mHandle, 7222, aVMDLDataLoaderConfigure.mEnableFileCacheV2);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpABTestId)) {
                _setStringValue(this.mHandle, 7223, aVMDLDataLoaderConfigure.mVdpABTestId);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpGroupId)) {
                _setStringValue(this.mHandle, 7224, aVMDLDataLoaderConfigure.mVdpGroupId);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mNetSchedulerConfigStr)) {
                _setStringValue(this.mHandle, 7403, aVMDLDataLoaderConfigure.mNetSchedulerConfigStr);
            }
            _setIntValue(this.mHandle, 7225, aVMDLDataLoaderConfigure.mAlogEnable);
            _setIntValue(this.mHandle, 7226, aVMDLDataLoaderConfigure.mEnableSyncDnsForPcdn);
            _setIntValue(this.mHandle, 7228, aVMDLDataLoaderConfigure.mEnableFileRingBuffer);
            _setIntValue(this.mHandle, 7332, aVMDLDataLoaderConfigure.mEnableLazyBufferpool);
            _setIntValue(this.mHandle, 7334, aVMDLDataLoaderConfigure.mEnableNewBufferpool);
            _setIntValue(this.mHandle, 7335, aVMDLDataLoaderConfigure.mNewBufferPoolBlockSize);
            _setIntValue(this.mHandle, 7336, aVMDLDataLoaderConfigure.mNewBufferPoolResidentSize);
            _setIntValue(this.mHandle, 7337, aVMDLDataLoaderConfigure.mNewBufferPoolGrowBlockCount);
            _setIntValue(this.mHandle, 7229, aVMDLDataLoaderConfigure.mEnableUseFileExtendLoaderBuffer);
            _setIntValue(this.mHandle, 7330, aVMDLDataLoaderConfigure.mMaxIPV6Num);
            _setIntValue(this.mHandle, 7331, aVMDLDataLoaderConfigure.mMaxIPV4Num);
            _setIntValue(this.mHandle, 1510, aVMDLDataLoaderConfigure.mForbidByPassCookie);
            _setIntValue(this.mHandle, 7333, aVMDLDataLoaderConfigure.mSessionTimeout);
            _setIntValue(this.mHandle, 7339, aVMDLDataLoaderConfigure.mEnablePlayInfoCache);
            _setIntValue(this.mHandle, 7347, aVMDLDataLoaderConfigure.mEnableDownloaderLog);
            _setIntValue(this.mHandle, 7348, aVMDLDataLoaderConfigure.mEnableTTNetLoader);
            _setIntValue(this.mHandle, 7349, aVMDLDataLoaderConfigure.mTTNetLoaderCronetBufSizeKB);
            _setIntValue(this.mHandle, 7357, aVMDLDataLoaderConfigure.mIsAllowTryTheLastUrl);
            _setIntValue(this.mHandle, 7368, aVMDLDataLoaderConfigure.mSpeedSampleInterval);
            _setIntValue(this.mHandle, 7400, aVMDLDataLoaderConfigure.mUseNewSpeedTestForSingle);
            _setIntValue(this.mHandle, 7391, aVMDLDataLoaderConfigure.mEnableIOManager);
            _setIntValue(this.mHandle, 7369, aVMDLDataLoaderConfigure.mEnableLoaderSeek);
            _setIntValue(this.mHandle, 7370, aVMDLDataLoaderConfigure.mGlobalSpeedSampleInterval);
            _setIntValue(this.mHandle, 7362, aVMDLDataLoaderConfigure.mEnableDynamicTimeout);
            _setIntValue(this.mHandle, 7360, aVMDLDataLoaderConfigure.mSocketInitialTimeout);
            _setIntValue(this.mHandle, 7361, aVMDLDataLoaderConfigure.mMaxSocketReuseCount);
            _setIntValue(this.mHandle, 7371, aVMDLDataLoaderConfigure.mEnableReportTaskLog);
            _setInt64Value(this.mHandle, 8218, aVMDLDataLoaderConfigure.mP2PStragetyLevel);
            _setInt64Value(this.mHandle, 7363, aVMDLDataLoaderConfigure.mConnectPoolStragetyValue);
            _setIntValue(this.mHandle, 7364, aVMDLDataLoaderConfigure.mMaxAliveHostNum);
            _setIntValue(this.mHandle, 7392, aVMDLDataLoaderConfigure.mFileExtendSizeKB);
            _setIntValue(this.mHandle, 7393, aVMDLDataLoaderConfigure.mMinAllowSpeed);
            _setIntValue(this.mHandle, 7395, aVMDLDataLoaderConfigure.mEnableOwnVDPPreloadNotify);
            _setIntValue(this.mHandle, 8219, aVMDLDataLoaderConfigure.mEnableEarlyData);
            _setIntValue(this.mHandle, 8220, aVMDLDataLoaderConfigure.mEnableSpeedPredict);
            _setIntValue(this.mHandle, 7404, aVMDLDataLoaderConfigure.mEnableUseOriginalUrl);
            _setInt64Value(this.mHandle, 7397, aVMDLDataLoaderConfigure.mMonitorMinAllowLoadSize);
            _setInt64Value(this.mHandle, 7396, aVMDLDataLoaderConfigure.mMonitorTimeInternal);
            _setStringValue(this.mHandle, 7398, aVMDLDataLoaderConfigure.mSocketTraingCenterConfigStr);
            _setStringValue(this.mHandle, 7399, aVMDLDataLoaderConfigure.mCacheDirListsStr);
            _setStringValue(this.mHandle, 8221, aVMDLDataLoaderConfigure.mP2PConfigStr);
            _setIntValue(this.mHandle, 7401, aVMDLDataLoaderConfigure.mSocketRecvBufferSize);
            if (aVMDLDataLoaderConfigure.mEnableEventInfo > 0) {
                _setIntValue(this.mHandle, 9999, aVMDLDataLoaderConfigure.mEnableEventInfo);
            }
            if (aVMDLDataLoaderConfigure.mEnableStorageModule > 0) {
                _setIntValue(this.mHandle, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, aVMDLDataLoaderConfigure.mEnableStorageModule);
                if (aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM > 0) {
                    _setIntValue(this.mHandle, UpdateDialogStatusCode.DISMISS, aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBNM);
                }
                if (aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS > 0) {
                    _setIntValue(this.mHandle, UpdateDialogStatusCode.SHOW, aVMDLDataLoaderConfigure.mStoPlayDldWinSizeKBLS);
                }
                if (aVMDLDataLoaderConfigure.mStoRingBufferSizeKB > 0) {
                    _setIntValue(this.mHandle, 10003, aVMDLDataLoaderConfigure.mStoRingBufferSizeKB);
                }
                if (aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1 > 0) {
                    _setIntValue(this.mHandle, 10004, aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh1);
                }
                if (aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec > 0) {
                    _setIntValue(this.mHandle, 10006, aVMDLDataLoaderConfigure.mStoMaxIdleTimeSec);
                }
            }
            if (aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2 > 0) {
                _setIntValue(this.mHandle, 10005, aVMDLDataLoaderConfigure.mStoIoWriteLimitKBTh2);
            }
            _setIntValue(this.mHandle, 9400, aVMDLDataLoaderConfigure.mIgnorePlayInfo);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mSettingsDomain)) {
                _setStringValue(this.mHandle, 9401, aVMDLDataLoaderConfigure.mSettingsDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDmDomain)) {
                _setStringValue(this.mHandle, 9402, aVMDLDataLoaderConfigure.mDmDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mForesightDomain)) {
                _setStringValue(this.mHandle, 9403, aVMDLDataLoaderConfigure.mForesightDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDomains)) {
                _setStringValue(this.mHandle, 9404, aVMDLDataLoaderConfigure.mDomains);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyDomain)) {
                _setStringValue(this.mHandle, 9405, aVMDLDataLoaderConfigure.mKeyDomain);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mKeyToken)) {
                _setStringValue(this.mHandle, 9406, aVMDLDataLoaderConfigure.mKeyToken);
            }
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr)) {
                _setStringValue(this.mHandle, 7501, aVMDLDataLoaderConfigure.mDynamicPreconnectConfigStr);
            }
            _setIntValue(this.mHandle, 11000, aVMDLDataLoaderConfigure.mEnableP2pUpload);
            _setIntValue(this.mHandle, 11002, aVMDLDataLoaderConfigure.mDevDiskSizeMB);
            _setIntValue(this.mHandle, 11004, aVMDLDataLoaderConfigure.mDevMemorySizeMB);
            if (!TextUtils.isEmpty(aVMDLDataLoaderConfigure.mVdpExtGlobalInfo)) {
                _setStringValue(this.mHandle, 11001, aVMDLDataLoaderConfigure.mVdpExtGlobalInfo);
            }
            AVMDLDNSParser.setIntValue(0, this.mConfigure.mDNSMainType);
            AVMDLDNSParser.setIntValue(1, this.mConfigure.mDNSBackType);
            AVMDLDNSParser.setIntValue(2, this.mConfigure.mDefaultExpiredTime);
            AVMDLDNSParser.setIntValue(3, this.mConfigure.mMainToBackUpDelayedTime);
        }
    }

    public void setListener(int i, AVMDLDataLoaderListener aVMDLDataLoaderListener) {
        this.mWriteLock.lock();
        if (i == 107) {
            try {
                this.mLiveListener = aVMDLDataLoaderListener;
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
        }
        this.mWriteLock.unlock();
    }

    public static String makeTsFileKey(String str, String str2) {
        try {
            return _makeTsFileKey(str, str2);
        } catch (UnsatisfiedLinkError e) {
            AVMDLLog.m256408e("AVMDLDataLoader", "makeTsFileKey failed, native not support: " + e.getMessage());
            return null;
        } catch (Exception e2) {
            AVMDLLog.m256408e("AVMDLDataLoader", "makeTsFileKey failed, other reason:  " + e2.getMessage());
            return null;
        }
    }

    private boolean postMessage(AVMDLDataLoaderListener aVMDLDataLoaderListener, Message message) {
        AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo;
        if (message.what == 701) {
            AVMDLLog.m256407d("ttmn", "receive hijack err: ");
            hijack();
            return true;
        }
        if (!(aVMDLDataLoaderListener == null || message.obj == null || (aVMDLDataLoaderNotifyInfo = (AVMDLDataLoaderNotifyInfo) message.obj) == null)) {
            aVMDLDataLoaderListener.onNotify(aVMDLDataLoaderNotifyInfo);
        }
        return true;
    }

    public void addDataSource(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            AVMDLLog.m256407d("AVMDLDataLoader", "addDataSource: id: " + i + ", queyr: " + str);
            this.mWriteLock.lock();
            try {
                _addDataSource(this.mHandle, i, str);
            } catch (Exception | UnsatisfiedLinkError unused) {
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public int copyFile(String str, String str2) {
        int i = -1;
        if (this.mState != 1) {
            return -1;
        }
        this.mWriteLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                i = _copyFile(j, str, str2);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return i;
    }

    public long getLongValueByStr(String str, int i) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str)) {
            return -1;
        }
        this.mWriteLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValueByStr(j2, str, i);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mWriteLock.unlock();
            throw th;
        }
        this.mWriteLock.unlock();
        return j;
    }

    public String getStringValueByStr(String str, int i) {
        String str2 = null;
        if (this.mState != 1) {
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str2 = _getStringValueByStr(j, str, i);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str2;
    }

    public void makeFileAutoDeleteFlag(String str, int i) {
        if (this.mState == 1 && !TextUtils.isEmpty(str)) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _makeFileAutoDeleteFlag(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void preConnectByHost(String str, int i) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                _preConnectByHost(this.mHandle, str, i);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void preloadResource(String str, int i) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && i != 0) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadResource(j, str, i);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setBackUpIp(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0, (String) null));
        }
    }

    public void setIntValue(int i, int i2) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setIntValue(j, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setLongValue(int i, long j) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _setInt64Value(j2, i, j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void setStringValue(int i, String str) {
        if (!TextUtils.isEmpty(str) && this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _setStringValue(j, i, str);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    private String createFilePathBaseDir(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == '/') {
            str3 = str + str2;
        } else {
            str3 = str + "/" + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str3;
    }

    private boolean postMessage(LoaderListener loaderListener, Message message) {
        LoaderEventInfo loaderEventInfo;
        if (!(loaderListener == null || message.obj == null || (loaderEventInfo = (LoaderEventInfo) message.obj) == null)) {
            if (message.what == 71) {
                loaderListener.onLoaderTaskStart(loaderEventInfo);
                AVMDLLog.m256407d("ttmn", "receive eventLog KeyIsLoaderEventStart");
            } else if (message.what == 72) {
                loaderListener.onLoaderTaskCancel(loaderEventInfo);
                AVMDLLog.m256407d("ttmn", "receive eventLog KeyIsLoaderEventCancel");
            } else if (message.what == 73) {
                loaderListener.onLoaderTaskCompleted(loaderEventInfo);
                AVMDLLog.m256407d("ttmn", "receive eventLog KeyIsLoaderEventCompleted");
            } else {
                AVMDLLog.m256407d("ttmn", "receive eventLog fail");
            }
        }
        return true;
    }

    public long getCacheSize(String str, String str2) {
        long j = -1;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        this.mReadLock.lock();
        try {
            long j2 = this.mHandle;
            if (j2 != 0) {
                j = _getLongValueByStrStr(j2, str, str2, 103);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return j;
    }

    public long getInt64Value(int i, long j) {
        if (i == 8003 || i == 8004) {
            AVMDLDataLoaderListener aVMDLDataLoaderListener = this.mLiveListener;
            if (aVMDLDataLoaderListener != null) {
                return aVMDLDataLoaderListener.getInt64Value(i, j);
            }
            AVMDLLog.m256408e("ttmn", "getInt64Value mLiveListener is nullptr, code: " + i);
        }
        AVMDLLog.m256407d("ttmn", "getInt64Value code: " + i + " defaultValue: " + j);
        return j;
    }

    public String getStringCacheInfo(String str, String str2) {
        String str3 = null;
        if (this.mState != 1 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        this.mReadLock.lock();
        try {
            long j = this.mHandle;
            if (j != 0) {
                str3 = _getStringValueByStrStr(j, str, str2, 101);
            }
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.mReadLock.unlock();
            throw th;
        }
        this.mReadLock.unlock();
        return str3;
    }

    public static synchronized int init(boolean z, boolean z2) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsLibraryLoaded) {
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!mIsLibraryLoaded) {
                if (!C2609a.m10972a()) {
                    Log.e("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    Log.e("ttmn", "Can't load vcn ");
                }
                loadAVMDLBaseLibrary();
                try {
                    C1711a.m7628a("avmdl");
                    mIsLibraryLoaded = true;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("ttmn", "Can't load avmdl library: " + e);
                } catch (Throwable th) {
                    Log.e("ttmn", "other exception when loading avmdl library: " + th);
                }
                if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                    Log.e("ttmn", "Can't load vcnverify lib ");
                }
                if (z2) {
                    Log.e("ttmn", "try to load pcdn lib");
                    try {
                        C1711a.m7628a("avmdlp2p");
                    } catch (UnsatisfiedLinkError e2) {
                        Log.e("ttmn", "Can't load avmdlp2p library: " + e2);
                    } catch (Throwable th2) {
                        Log.e("ttmn", "other exception when loading avmdl library: " + th2);
                    }
                }
                tryLoadTTNetLoaderPlugin();
            }
            if (!mIsLibraryLoaded) {
                return -1;
            }
            return 0;
        }
    }

    public String getStringValueByStrkey(int i, long j, String str) {
        if (this.mState != 1) {
            return null;
        }
        if (i != 1503) {
            if ((i == 1506 || i == 1509) && this.mVodListener != null && !TextUtils.isEmpty(str)) {
                return this.mVodListener.getStringValue(i, j, str);
            }
            return null;
        } else if (this.mVodListener == null || TextUtils.isEmpty(str)) {
            return null;
        } else {
            return this.mVodListener.getCheckSumInfo(str);
        }
    }

    public void onNotify(int i, long j, int i2) {
        if (this.mState == 1 && this.mHandler != null) {
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.parameter = j;
            aVMDLDataLoaderNotifyInfo.code = (long) i2;
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.what = i;
            obtainMessage.sendToTarget();
        }
    }

    public void setInt64ValueByStrKey(int i, String str, long j) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                long j2 = this.mHandle;
                if (j2 != 0) {
                    _setInt64ValueByStrKey(j2, i, str, j);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    private double testFileIO(String str, int i, RandomAccessFile randomAccessFile) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        long currentTimeMillis = System.currentTimeMillis();
        randomAccessFile.seek((long) i);
        byte[] bArr = new byte[4096];
        for (int i2 = 0; i2 < 200; i2++) {
            Thread.sleep((long) 5);
            randomAccessFile.write(bArr, 0, 1024);
        }
        long currentTimeMillis2 = ((System.currentTimeMillis() - currentTimeMillis) - ((long) 1000)) + 0;
        if (currentTimeMillis2 <= 0) {
            return -1.0d;
        }
        AVMDLLog.m256407d("BENCHMARKIO", String.format("size:%d costtime:%d", 819200, Long.valueOf(currentTimeMillis2)));
        return (double) (819200 / currentTimeMillis2);
    }

    public void preloadResource(String str, int i, int i2) {
        if (this.mState == 1 && !TextUtils.isEmpty(str) && i2 != 0) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadResourceWithOffset(j, str, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:45|(1:47)(2:48|(1:50))|51|(2:52|53)|54|56|57|58|59|60|(1:62)(1:63)|64|(1:66)|67|(1:69)|70) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x00fe */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLogInfo(int r9, int r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 390
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.medialoader.AVMDLDataLoader.onLogInfo(int, int, java.lang.String):void");
    }

    public static synchronized int init(boolean z, boolean z2, boolean z3) {
        synchronized (AVMDLDataLoader.class) {
            if (mIsLibraryLoaded) {
                return 0;
            }
            mIsLibraryLoaded = z;
            if (!mIsLibraryLoaded) {
                if (!C2609a.m10972a()) {
                    Log.e("ttmn", "load boringssl fail!");
                }
                if (!VcnlibloadWrapper.tryLoadVcnlib()) {
                    Log.e("ttmn", "Can't load vcn ");
                }
                if (z3) {
                    try {
                        C1711a.m7628a("avmdlv2");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e) {
                        Log.e("ttmn", "load avmdlv2 failed: " + e);
                    }
                }
                if (!mIsLibraryLoaded) {
                    try {
                        C1711a.m7628a("avmdl");
                        mIsLibraryLoaded = true;
                    } catch (UnsatisfiedLinkError e2) {
                        Log.e("ttmn", "Can't load avmdl library: " + e2);
                    } catch (Throwable th) {
                        Log.e("ttmn", "other exception when loading avmdl library: " + th);
                    }
                    if (!VcnlibloadWrapper.tryLoadVcnverifylib()) {
                        Log.e("ttmn", "Can't load vcnverify lib ");
                    }
                    if (z2) {
                        Log.e("ttmn", "try to load pcdn lib");
                        try {
                            C1711a.m7628a("avmdlp2p");
                        } catch (UnsatisfiedLinkError e3) {
                            Log.e("ttmn", "Can't load avmdlp2p library: " + e3);
                        } catch (Throwable th2) {
                            Log.e("ttmn", "other exception when loading avmdl library: " + th2);
                        }
                    }
                    tryLoadTTNetLoaderPlugin();
                }
            }
            if (!mIsLibraryLoaded) {
                return -1;
            }
            return 0;
        }
    }

    public void preloadGroupResource(String str, String str2, int i, int i2) {
        if (this.mState == 1 && !TextUtils.isEmpty(str2) && i2 != 0) {
            this.mWriteLock.lock();
            try {
                long j = this.mHandle;
                if (j != 0) {
                    _preloadGroupResource(j, str, str2, i, i2);
                }
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }

    public void onLogInfo(int i, int i2, int i3, String str) {
        if (this.mState == 1 && this.mLogHandler != null) {
            if (!isNotifyInfo(i)) {
                AVMDLLog.m256407d("ttmn", i + " is not a notify ");
                return;
            }
            AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo = new AVMDLDataLoaderNotifyInfo();
            aVMDLDataLoaderNotifyInfo.what = i;
            aVMDLDataLoaderNotifyInfo.code = (long) i2;
            aVMDLDataLoaderNotifyInfo.parameter = (long) i3;
            aVMDLDataLoaderNotifyInfo.logInfo = str;
            Message obtainMessage = this.mLogHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = aVMDLDataLoaderNotifyInfo;
            obtainMessage.sendToTarget();
        }
    }

    public void updateDNSInfo(String str, String str2, long j, String str3, int i) {
        if (this.mState == 1) {
            this.mWriteLock.lock();
            try {
                _updateDNSInfo(this.mHandle, str, str2, j, str3, i);
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
            } catch (Throwable th) {
                this.mWriteLock.unlock();
                throw th;
            }
            this.mWriteLock.unlock();
        }
    }
}
