package com.ss.mediakit.net;

import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IPCache {
    private static IPCache mInstance = null;
    private static String mNetExtraInfo = null;
    private static int mNetType = -1;
    private Lock backUplock = new ReentrantLock();
    private Lock lock = new ReentrantLock();
    private ConcurrentHashMap<String, AVMDLDNSInfo> mBackUps = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, AVMDLDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    private IPCache() {
    }

    public static IPCache getInstance() {
        if (mInstance == null) {
            synchronized (IPCache.class) {
                if (mInstance == null) {
                    mInstance = new IPCache();
                }
            }
        }
        return mInstance;
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int getRecordSize() {
        int i;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                i = concurrentHashMap.size();
            } else {
                i = -1;
            }
            return i;
        } finally {
            this.lock.unlock();
        }
    }

    public static void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public AVMDLDNSInfo getBackUpIp(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.backUplock.lock();
        try {
            return this.mBackUps.get(str);
        } finally {
            this.backUplock.unlock();
        }
    }

    public AVMDLDNSInfo get(String str) {
        AVMDLDNSInfo aVMDLDNSInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.lock.lock();
        try {
            ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                aVMDLDNSInfo = concurrentHashMap.get(str);
            }
            if (aVMDLDNSInfo != null && !TextUtils.isEmpty(aVMDLDNSInfo.mIpList) && AVMDLDNSParser.mGlobalEnableBackUpIp > 0) {
                AVMDLLog.m256407d("AVMDLIPCache", String.format("enable backup try get backup ip for:%s", str));
                AVMDLDNSInfo backUpIp = getBackUpIp(str);
                if (backUpIp != null && !TextUtils.isEmpty(backUpIp.mIpList)) {
                    AVMDLLog.m256407d("AVMDLIPCache", String.format("succ get backup ip:%s", backUpIp.mIpList));
                    aVMDLDNSInfo.mIpList += "," + backUpIp.mIpList;
                }
            }
            return aVMDLDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void putBackUpIp(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(str)) {
            this.backUplock.lock();
            try {
                AVMDLLog.m256407d("AVMDLIPCache", String.format("put backupip for host:%s type:%d ip:%s", aVMDLDNSInfo.mHost, Integer.valueOf(aVMDLDNSInfo.mType), aVMDLDNSInfo.mIpList));
                this.mBackUps.put(str, aVMDLDNSInfo);
            } finally {
                this.backUplock.unlock();
            }
        }
    }

    public void put(String str, AVMDLDNSInfo aVMDLDNSInfo) {
        if (aVMDLDNSInfo != null && !TextUtils.isEmpty(str)) {
            this.lock.lock();
            try {
                ConcurrentHashMap<String, AVMDLDNSInfo> concurrentHashMap = this.mDNSRecord;
                if (concurrentHashMap != null) {
                    AVMDLDNSInfo aVMDLDNSInfo2 = concurrentHashMap.get(str);
                    if (AVMDLDNSParser.mGlobalEnableParallel <= 0 || aVMDLDNSInfo2 == null || aVMDLDNSInfo.mType != 0 || aVMDLDNSInfo2.mType <= aVMDLDNSInfo.mType || aVMDLDNSInfo2.mExpiredTime <= System.currentTimeMillis()) {
                        AVMDLLog.m256407d("AVMDLIPCache", String.format("put for host:%s type:%d ip:%s", aVMDLDNSInfo.mHost, Integer.valueOf(aVMDLDNSInfo.mType), aVMDLDNSInfo.mIpList));
                        this.mDNSRecord.put(str, aVMDLDNSInfo);
                    } else {
                        AVMDLLog.m256407d("AVMDLIPCache", String.format("put for host:%s enable parallel info.type:%d info.expiredT:%d cache.type:%d cache.expiredT:%d curT:%d info can not replace cache", str, Integer.valueOf(aVMDLDNSInfo.mType), Long.valueOf(aVMDLDNSInfo.mExpiredTime), Integer.valueOf(aVMDLDNSInfo2.mType), Long.valueOf(aVMDLDNSInfo2.mExpiredTime), Long.valueOf(System.currentTimeMillis())));
                        return;
                    }
                }
                this.lock.unlock();
                AVMDLLog.m256407d("AVMDLIPCache", "update dns info to native");
                AVMDLDataLoader.getInstance().updateDNSInfo(str, aVMDLDNSInfo.mIpList, aVMDLDNSInfo.mExpiredTime, null, aVMDLDNSInfo.mType);
            } finally {
                this.lock.unlock();
            }
        }
    }
}
