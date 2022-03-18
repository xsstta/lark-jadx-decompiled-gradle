package com.ss.mediakit.net;

import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AVMDLDNSParserBridge implements AVMDLDNSParserListener {
    private static boolean v2Usable = true;
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    private static native void _notifyParserResult(long j, String str, String str2, long j2, String str3);

    private static native void _notifyParserResultV2(long j, String str, String str2, long j2, String str3, int i);

    /* access modifiers changed from: package-private */
    public boolean isFinish() {
        return this.isFinish;
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            AVMDLLog.m256407d("AVMDLDNSParserBridge", "****get result:" + str);
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        AVMDLLog.m256407d("AVMDLDNSParserBridge", String.format("----start release:%s", this));
        this.lock.lock();
        try {
            this.handle = 0;
            this.lock.unlock();
            AVMDLLog.m256407d("AVMDLDNSParserBridge", String.format("remove host:%s", this.host));
            AVMDLDNSParser.getInstance().removeHost(this.host, this);
            AVMDLLog.m256407d("AVMDLDNSParserBridge", String.format("****end call release:%s", this));
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public String getBackUp(String str) {
        String str2;
        AVMDLDNSInfo backUpIp;
        if (AVMDLDNSParser.getIntValue(5) != 1 || (backUpIp = IPCache.getInstance().getBackUpIp(str)) == null) {
            str2 = null;
        } else {
            str2 = backUpIp.mIpList;
        }
        AVMDLLog.m256407d("AVMDLDNSParserBridge", "****get backup ip result:" + str2);
        return str2;
    }

    public int start(long j, String str) {
        int i;
        if (v2Usable) {
            i = parserResult(j, str, 2);
        } else {
            i = 0;
        }
        if (i <= 0) {
            return parserResult(j, str, 1);
        }
        return i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fa A[Catch:{ all -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int parserResult(long r17, java.lang.String r19, int r20) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.net.AVMDLDNSParserBridge.parserResult(long, java.lang.String, int):int");
    }

    @Override // com.ss.mediakit.net.AVMDLDNSParserListener
    public void onCompletion(int i, String str, String str2, long j, String str3, int i2) {
        if (!this.isFinish && v2Usable) {
            parserResult(i, str, str2, j, str3, i2, 2);
        }
        if (!this.isFinish) {
            parserResult(i, str, str2, j, str3, i2, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087 A[Catch:{ UnsatisfiedLinkError -> 0x00bd, all -> 0x00bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void parserResult(int r18, java.lang.String r19, java.lang.String r20, long r21, java.lang.String r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.mediakit.net.AVMDLDNSParserBridge.parserResult(int, java.lang.String, java.lang.String, long, java.lang.String, int, int):void");
    }
}
