package com.ss.mediakit.net;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class AVMDLDNSParser {
    public static AVMDLCustomHTTPDNSParser mCustomHttpDNSParser = null;
    public static int mGlobalBackType = 2;
    public static int mGlobalBackUpDelayedTime = 0;
    public static int mGlobalDefaultExpiredTime = 60;
    public static int mGlobalEnableBackUpIp = 0;
    public static int mGlobalEnableDNSLog = 0;
    public static int mGlobalEnableParallel = 0;
    public static int mGlobalEnableRefresh = 0;
    public static int mGlobalForceExpiredTime = 0;
    public static String mGlobalGoogleDNSParseHost = "";
    public static int mGlobalMainType = 0;
    public static String mGlobalOwnDNSParseHost = "";
    private static AVMDLDNSParser mInstance;
    public static AVMDLNetClientMaker mNetClientMaker;
    private Handler mHandler;
    private Lock mLock = new ReentrantLock();
    private Map<String, AVMDLHostProcessor> mProcessors = new HashMap();
    private int mRefCount;
    private int mState;
    private HandlerThread mThread;
    private int mTimeOut = 5;
    private int mType;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public void release() {
    }

    public static AVMDLDNSParser getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDNSParser.class) {
                if (mInstance == null) {
                    mInstance = new AVMDLDNSParser();
                }
            }
        }
        return mInstance;
    }

    public static AVMDLNetClient getNetClient() {
        AVMDLNetClient aVMDLNetClient;
        synchronized (AVMDLDNSParser.class) {
            AVMDLNetClientMaker aVMDLNetClientMaker = mNetClientMaker;
            if (aVMDLNetClientMaker != null) {
                aVMDLNetClient = aVMDLNetClientMaker.getNetClient();
            } else {
                aVMDLNetClient = null;
            }
        }
        if (aVMDLNetClient == null) {
            return new AVMDLHTTPNetwork();
        }
        return aVMDLNetClient;
    }

    public AVMDLDNSParser() {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("AVMDLDNSParser");
        this.mThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
        this.mHandler = new Handler(this.mThread.getLooper()) {
            /* class com.ss.mediakit.net.AVMDLDNSParser.HandlerC653751 */

            public void handleMessage(Message message) {
                AVMDLDNSInfo aVMDLDNSInfo;
                if (message.obj != null) {
                    aVMDLDNSInfo = (AVMDLDNSInfo) message.obj;
                } else {
                    aVMDLDNSInfo = null;
                }
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("----receive msg what:%d info:%s", Integer.valueOf(message.what), aVMDLDNSInfo));
                int i = message.what;
                if (i == 2) {
                    AVMDLDNSParser.this.proccessFailMsg(message.what, aVMDLDNSInfo);
                } else if (i == 3) {
                    AVMDLDNSParser.this.proccessSucMsg(message.what, aVMDLDNSInfo);
                } else if (i == 4) {
                    AVMDLDNSParser.this.proccessPreParseMsg(message.what, aVMDLDNSInfo);
                } else if (i == 6) {
                    AVMDLDNSParser.this.processParseMsg(message.what, aVMDLDNSInfo);
                } else if (i == 7) {
                    AVMDLDNSParser.this.processBatchParseMsg(message.what, aVMDLDNSInfo);
                }
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end proc msg what:%d info:%s", Integer.valueOf(message.what), aVMDLDNSInfo));
            }
        };
    }

    public static void processHijack() {
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("----process hijack old dnsmain:%d back:%d", Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)));
        int i = mGlobalMainType;
        if (i == 0) {
            mGlobalMainType = mGlobalBackType;
            mGlobalBackType = i;
        }
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("****process hijack new dnsmain:%d back:%d", Integer.valueOf(mGlobalMainType), Integer.valueOf(mGlobalBackType)));
    }

    public static void setClientMaker(AVMDLNetClientMaker aVMDLNetClientMaker) {
        synchronized (AVMDLDNSParser.class) {
            if (aVMDLNetClientMaker != null) {
                mNetClientMaker = aVMDLNetClientMaker;
            }
        }
    }

    private void reportLog(AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && mGlobalEnableDNSLog > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_type", "mdl_dns_log");
                jSONObject.put("dns_type", aVMDLDNSInfo.mType);
                jSONObject.put("ip_list", aVMDLDNSInfo.mIpList);
                AVMDLDataLoader.getInstance().onLogInfo(15, 0, jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    private void sendBatchParseMsg(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.m256407d("AVMDLDNSParser", "hosts null not need do batch parse");
            return;
        }
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, strArr, (String) null, 0, (String) null);
        Message message = new Message();
        message.what = 7;
        message.obj = aVMDLDNSInfo;
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("send msg for batch parse", new Object[0]));
        this.mHandler.sendMessage(message);
    }

    public static void setCustomHttpDNSParser(AVMDLCustomHTTPDNSParser aVMDLCustomHTTPDNSParser) {
        synchronized (AVMDLDNSParser.class) {
            int i = 1;
            Object[] objArr = new Object[1];
            if (aVMDLCustomHTTPDNSParser == null) {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("set custom http dns parser:%d", objArr));
            if (aVMDLCustomHTTPDNSParser != null) {
                mCustomHttpDNSParser = aVMDLCustomHTTPDNSParser;
            }
        }
    }

    public static int getIntValue(int i) {
        int i2;
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("----get value for key:%d", Integer.valueOf(i)));
        synchronized (AVMDLDNSParser.class) {
            if (i != 10) {
                switch (i) {
                    case 0:
                        i2 = mGlobalMainType;
                        break;
                    case 1:
                        i2 = mGlobalBackType;
                        break;
                    case 2:
                        i2 = mGlobalDefaultExpiredTime;
                        break;
                    case 3:
                        i2 = mGlobalBackUpDelayedTime;
                        break;
                    case 4:
                        i2 = mGlobalEnableParallel;
                        break;
                    case 5:
                        i2 = mGlobalEnableBackUpIp;
                        break;
                    case 6:
                        i2 = mGlobalEnableRefresh;
                        break;
                    case 7:
                        i2 = mGlobalEnableDNSLog;
                        break;
                    default:
                        i2 = Integer.MIN_VALUE;
                        break;
                }
            } else {
                i2 = mGlobalForceExpiredTime;
            }
        }
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("****get value:%d for key:%d", Integer.valueOf(i2), Integer.valueOf(i)));
        return i2;
    }

    public void doParseHosts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            AVMDLLog.m256407d("AVMDLDNSParser", "hosts is null, not need do batch host parse");
            return;
        }
        int length = strArr.length;
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.isEmpty(strArr[i])) {
                if (IPCache.getInstance().get(strArr[i]) != null) {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("for host:%s has dns info not need do batch parse", strArr[i]));
                    strArr[i] = null;
                    length--;
                } else {
                    this.mLock.lock();
                    try {
                        if (this.mProcessors.get(strArr[i]) != null) {
                            AVMDLLog.m256407d("AVMDLDNSParser", String.format("for host:%s has processor not need do batch parse", strArr[i]));
                            strArr[i] = null;
                            length--;
                        }
                    } finally {
                        this.mLock.unlock();
                    }
                }
            }
        }
        if (length == 0) {
            AVMDLLog.m256407d("AVMDLDNSParser", "has no hosts need do batch parse");
        } else {
            sendBatchParseMsg(strArr);
        }
    }

    public void addHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        addListenerInternal(str, aVMDLDNSParserListener);
    }

    public void removeHost(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        removeListenerInternal(str, aVMDLDNSParserListener);
    }

    public void postParseHostMsg(String str, int i) {
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(i, str, (String) null, 0, (String) null);
        Message message = new Message();
        message.what = 5;
        message.obj = aVMDLDNSInfo;
        this.mHandler.sendMessage(message);
    }

    public static void setStringValue(int i, String str) {
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("****set value:%s for key:%d", str, Integer.valueOf(i)));
        synchronized (AVMDLDNSParser.class) {
            if (i != 8) {
                if (i == 9) {
                    if (!TextUtils.isEmpty(str)) {
                        mGlobalGoogleDNSParseHost = str;
                    }
                }
            } else if (!TextUtils.isEmpty(str)) {
                mGlobalOwnDNSParseHost = str;
            }
        }
    }

    public void setBackUpIP(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            IPCache.getInstance().putBackUpIp(str, new AVMDLDNSInfo(11, str, str2, 0, (String) null));
        }
    }

    /* JADX INFO: finally extract failed */
    private void removeListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        if (!TextUtils.isEmpty(str) && aVMDLDNSParserListener != null) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("---remove listener:%s for host:%s", aVMDLDNSParserListener, str));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("get processor:%s", aVMDLHostProcessor));
                if (aVMDLHostProcessor != null) {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("remove listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.remove(aVMDLDNSParserListener);
                }
                if (aVMDLHostProcessor != null && aVMDLHostProcessor.mListeners.size() == 0) {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("listeners empty for processors", new Object[0]));
                }
                this.mLock.unlock();
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end remove listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    private void sendPreParseMsg(String str, long j) {
        if (TextUtils.isEmpty(str) || j <= 0) {
            AVMDLLog.m256407d("AVMDLDNSParser", "host is null or delayTimeMs invalid,not support preparse");
        } else if (mGlobalEnableRefresh > 0) {
            AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0, (String) null);
            Message message = new Message();
            message.obj = aVMDLDNSInfo;
            message.what = 4;
            message.obj = aVMDLDNSInfo;
            long j2 = j + 3000;
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("send preparse for host:%s delayTime:%d", aVMDLDNSInfo.mHost, Long.valueOf(j2)));
            this.mHandler.sendMessageDelayed(message, j2);
        }
    }

    public static void setIntValue(int i, int i2) {
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("****set value:%d for key:%d", Integer.valueOf(i2), Integer.valueOf(i)));
        synchronized (AVMDLDNSParser.class) {
            if (i != 10) {
                switch (i) {
                    case 0:
                        mGlobalMainType = i2;
                        break;
                    case 1:
                        mGlobalBackType = i2;
                        break;
                    case 2:
                        mGlobalDefaultExpiredTime = i2;
                        break;
                    case 3:
                        mGlobalBackUpDelayedTime = i2;
                        break;
                    case 4:
                        mGlobalEnableParallel = i2;
                        break;
                    case 5:
                        mGlobalEnableBackUpIp = i2;
                        break;
                    case 6:
                        mGlobalEnableRefresh = i2;
                        break;
                    case 7:
                        mGlobalEnableDNSLog = i2;
                        break;
                }
            } else {
                mGlobalForceExpiredTime = i2;
            }
        }
    }

    public void proccessPreParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        long j;
        if (mGlobalEnableRefresh <= 0) {
            AVMDLLog.m256407d("AVMDLDNSParser", "not support preparse");
        } else if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("proc pre msg  fail, info or host is null", new Object[0]));
        } else {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("----proc pre parse msg what:%d host:%s", Integer.valueOf(i), aVMDLDNSInfo.mHost));
            AVMDLDNSInfo aVMDLDNSInfo2 = IPCache.getInstance().get(aVMDLDNSInfo.mHost);
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[2];
            objArr[0] = aVMDLDNSInfo2;
            if (aVMDLDNSInfo2 == null) {
                j = -1;
            } else {
                j = aVMDLDNSInfo2.mExpiredTime;
            }
            objArr[1] = Long.valueOf(j);
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("cache:%s expiredT:%d", objArr));
            if (aVMDLDNSInfo2 == null || aVMDLDNSInfo2.mExpiredTime < currentTimeMillis) {
                AVMDLLog.m256407d("AVMDLDNSParser", "add host for preparse");
                addListenerInternal(aVMDLDNSInfo.mHost, null);
            }
            AVMDLLog.m256407d("AVMDLDNSParser", "****proc pre parse msg what:%d host:%s");
        }
    }

    public void processBatchParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHosts == null || aVMDLDNSInfo.mHosts.length == 0) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("----proc batch parse msg what:%d", Integer.valueOf(i)));
        if (mGlobalEnableParallel > 0 || mGlobalMainType == 2) {
            try {
                new HTTPDNSHosts(aVMDLDNSInfo.mHosts, null, 2, this.mHandler).start();
            } catch (Exception e) {
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("parse end create httpdnshosts fail" + e, new Object[0]));
            }
        } else {
            new LocalDNSHosts(aVMDLDNSInfo.mHosts, this.mHandler).start();
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end proc batch parser msg", new Object[0]));
        }
    }

    /* JADX INFO: finally extract failed */
    public void processParseMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("proc parser msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("----proc parser msg what:%d host:%s", Integer.valueOf(i), aVMDLDNSInfo.mHost));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            if (aVMDLHostProcessor != null) {
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("----get processor:%s host:%s", aVMDLHostProcessor, aVMDLDNSInfo.mHost));
                aVMDLHostProcessor.processMsg(i, aVMDLDNSInfo);
            } else {
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("****get processor null for host:%s", aVMDLDNSInfo.mHost));
            }
            this.mLock.unlock();
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end proc parser msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private void addListenerInternal(String str, AVMDLDNSParserListener aVMDLDNSParserListener) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("---add listener:%s for host:%s", aVMDLDNSParserListener, str));
            this.mLock.lock();
            try {
                AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(str);
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("get processor:%s", aVMDLHostProcessor));
                if (aVMDLHostProcessor == null) {
                    aVMDLHostProcessor = new AVMDLHostProcessor(str, this.mHandler, mGlobalMainType, mGlobalBackType, mGlobalBackUpDelayedTime, mGlobalEnableParallel);
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("create processor:%s", aVMDLHostProcessor));
                    z = true;
                } else {
                    z = false;
                }
                if (aVMDLDNSParserListener != null && !aVMDLHostProcessor.mListeners.containsKey(aVMDLDNSParserListener)) {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("add listener", new Object[0]));
                    aVMDLHostProcessor.mListeners.put(aVMDLDNSParserListener, 1);
                }
                this.mProcessors.put(str, aVMDLHostProcessor);
                if (z) {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("new processor implement parse", new Object[0]));
                    aVMDLHostProcessor.processMsg(5, new AVMDLDNSInfo(mGlobalMainType, str, (String) null, 0, (String) null));
                }
                this.mLock.unlock();
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end add listener", new Object[0]));
            } catch (Throwable th) {
                this.mLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessFailMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("proc fail msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("----proc fail msg what:%d host:%s", Integer.valueOf(i), aVMDLDNSInfo.mHost));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("get processor:%s host:%s", aVMDLHostProcessor, aVMDLDNSInfo.mHost));
            if (aVMDLHostProcessor != null && aVMDLHostProcessor.isValidSourceId(aVMDLDNSInfo.mId)) {
                aVMDLHostProcessor.processResult(i, aVMDLDNSInfo);
                if (aVMDLHostProcessor.isEnd()) {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("processor end, notify result", new Object[0]));
                    for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                        if (aVMDLDNSParserListener != null) {
                            AVMDLLog.m256407d("AVMDLDNSParser", String.format("listener:%s oncompletion fail", aVMDLDNSParserListener));
                            aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, null, 0, null, aVMDLDNSInfo.mType);
                        }
                    }
                    aVMDLHostProcessor.mListeners.clear();
                    this.mProcessors.remove(aVMDLDNSInfo.mHost);
                } else {
                    AVMDLLog.m256407d("AVMDLDNSParser", String.format("processor is not end", new Object[0]));
                }
            }
            this.mLock.unlock();
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end proc fail msg what", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void proccessSucMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo == null || aVMDLDNSInfo.mHost == null) {
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("proc suc msg  fail, info or host is null", new Object[0]));
            return;
        }
        AVMDLLog.m256407d("AVMDLDNSParser", String.format("----proc suc msg what:%d host:%s", Integer.valueOf(i), aVMDLDNSInfo.mHost));
        this.mLock.lock();
        try {
            AVMDLHostProcessor aVMDLHostProcessor = this.mProcessors.get(aVMDLDNSInfo.mHost);
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("get processor:%s host:%s", aVMDLHostProcessor, aVMDLDNSInfo.mHost));
            if (!(aVMDLHostProcessor == null || aVMDLHostProcessor.mListeners == null)) {
                for (AVMDLDNSParserListener aVMDLDNSParserListener : aVMDLHostProcessor.mListeners.keySet()) {
                    if (aVMDLDNSParserListener != null) {
                        AVMDLLog.m256407d("AVMDLDNSParser", String.format("listener:%s oncompletion suc", aVMDLDNSParserListener));
                        aVMDLDNSParserListener.onCompletion(0, aVMDLDNSInfo.mHost, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
                    }
                }
                aVMDLHostProcessor.mListeners.clear();
                this.mProcessors.remove(aVMDLDNSInfo.mHost);
                AVMDLLog.m256407d("AVMDLDNSParser", String.format("remove all listeners and remove host", new Object[0]));
            }
            sendPreParseMsg(aVMDLDNSInfo.mHost, aVMDLDNSInfo.mExpiredTime - System.currentTimeMillis());
            reportLog(aVMDLDNSInfo);
            this.mLock.unlock();
            AVMDLLog.m256407d("AVMDLDNSParser", String.format("****end proc suc msg", new Object[0]));
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public static void updateDNSInfo(String str, String str2, long j) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AVMDLLog.m256407d("AVMDLDNSParser", "ip direct info invalid");
            return;
        }
        AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(10, str, str2, (j + ((long) mGlobalDefaultExpiredTime)) * 1000, (String) null);
        AVMDLLog.m256407d("AVMDLDNSParser", "server iplist, host = " + str + " type = " + 10 + " iplist = " + str2);
        IPCache.getInstance().put(str, aVMDLDNSInfo);
    }
}
