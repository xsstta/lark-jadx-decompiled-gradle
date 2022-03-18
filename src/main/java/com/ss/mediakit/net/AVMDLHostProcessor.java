package com.ss.mediakit.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.HashMap;

public class AVMDLHostProcessor {
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private int mEnableParallel;
    private Handler mHandler;
    public String mHost;
    public HashMap<AVMDLDNSParserListener, Integer> mListeners;
    private int mMainType;
    private BaseDNS[] mParsers = new BaseDNS[2];
    private int[] mStates = new int[2];

    public boolean isEnd() {
        for (int i = 0; i < 2; i++) {
            if (this.mParsers[i] != null) {
                int[] iArr = this.mStates;
                if (!(iArr[i] == 3 || iArr[i] == 2)) {
                    return false;
                }
            }
        }
        AVMDLLog.m256407d("AVMDLHostProcessor", "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.m256407d("AVMDLHostProcessor", String.format("id: %s is empty", str));
            return false;
        }
        for (int i = 0; i < 2; i++) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i] != null && str.equals(baseDNSArr[i].mId)) {
                AVMDLLog.m256407d("AVMDLHostProcessor", String.format("id: %s is valid index: %d", str, Integer.valueOf(i)));
                return true;
            }
        }
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("id: %s is valid", str));
        return false;
    }

    public void processMsg(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("----processor pro msg what:%d host:%s info:%s", Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo));
        if (i != 5) {
            if (i == 6) {
                int[] iArr = this.mStates;
                if ((iArr[0] == 1 || iArr[0] == 2 || iArr[0] == 3 || this.mEnableParallel > 0) && iArr[1] == 0) {
                    AVMDLLog.m256407d("AVMDLHostProcessor", String.format("main dns is not end or enable parrallel and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i, aVMDLDNSInfo);
                }
            }
        } else if (this.mStates[0] == 0) {
            AVMDLLog.m256407d("AVMDLHostProcessor", String.format("main dns is idle call main dns", new Object[0]));
            doParseInternal(i, aVMDLDNSInfo);
        }
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("****end processor pro msg what:%d host:%s info:%s", Integer.valueOf(i), aVMDLDNSInfo.mHost, aVMDLDNSInfo));
    }

    private void doParseInternal(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("----do parse internal what:%d info:%s", Integer.valueOf(i), aVMDLDNSInfo));
        if (aVMDLDNSInfo != null) {
            if (i == 5 && this.mParsers[0] == null) {
                AVMDLLog.m256407d("AVMDLHostProcessor", String.format("create main dns type:%d host:%s", Integer.valueOf(this.mMainType), aVMDLDNSInfo.mHost));
                this.mStates[0] = 1;
                this.mParsers[0] = createDNSParser(aVMDLDNSInfo.mHost, this.mMainType, 0);
                this.mParsers[0].start();
                Message message = new Message();
                message.what = 6;
                message.obj = aVMDLDNSInfo;
                if (this.mBackUpDelayedTime > 0 || this.mEnableParallel > 0) {
                    AVMDLLog.m256407d("AVMDLHostProcessor", String.format("BackUpDelayedTime:%d enableparallel:%d send backup delay first", Integer.valueOf(this.mMainType), Integer.valueOf(this.mEnableParallel)));
                    this.mHandler.sendMessageDelayed(message, (long) (this.mBackUpDelayedTime * 1000));
                }
            } else if (i == 6 && this.mParsers[1] == null) {
                AVMDLLog.m256407d("AVMDLHostProcessor", String.format("create backup dns type:%d host:%s", Integer.valueOf(this.mBackUpType), aVMDLDNSInfo.mHost));
                this.mStates[1] = 1;
                this.mParsers[1] = createDNSParser(aVMDLDNSInfo.mHost, this.mBackUpType, 1);
                this.mParsers[1].start();
            }
            AVMDLLog.m256407d("AVMDLHostProcessor", String.format("****do parse internal end", new Object[0]));
        }
    }

    public void processResult(int i, AVMDLDNSInfo aVMDLDNSInfo) {
        String str;
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("----process result what:%d id:%s host:%s", Integer.valueOf(i), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost));
        if ((i == 2 || i == 3) && aVMDLDNSInfo != null) {
            str = aVMDLDNSInfo.mId;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            AVMDLLog.m256407d("AVMDLHostProcessor", String.format("****process result err id is empty", new Object[0]));
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i2] == null || !str.equals(baseDNSArr[i2].mId)) {
                i2++;
            } else {
                this.mParsers[i2].close();
                this.mParsers[i2] = null;
                if (i == 3) {
                    this.mStates[i2] = 3;
                } else if (i == 2) {
                    this.mStates[i2] = 2;
                }
                AVMDLLog.m256407d("AVMDLHostProcessor", String.format("****process result parser index:%d is end, be close", Integer.valueOf(i2)));
            }
        }
        if (i2 == 0 && i == 2) {
            AVMDLLog.m256407d("AVMDLHostProcessor", String.format("mian dns parse error, try back up dns", new Object[0]));
            processMsg(6, new AVMDLDNSInfo(this.mBackUpType, aVMDLDNSInfo.mHost, (String) null, 0, (String) null));
        }
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("****end process result what:%d id:%s host:%s", Integer.valueOf(i), aVMDLDNSInfo.mId, aVMDLDNSInfo.mHost));
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        CreateConstructor createConstructor;
        try {
            createConstructor = AVMDLDNSManager.getInstance().getCreateConstructor(i);
        } catch (Exception e) {
            e.printStackTrace();
            createConstructor = null;
        }
        if (createConstructor != null) {
            return createConstructor.createDns(str, null, i, this.mHandler);
        }
        if (i != 4 || AVMDLDNSParser.mCustomHttpDNSParser == null) {
            AVMDLLog.m256407d("AVMDLHostProcessor", String.format("create local dns parser for host:%s type:%d", str, Integer.valueOf(i)));
            return new LocalDNS(str, this.mHandler);
        }
        AVMDLLog.m256407d("AVMDLHostProcessor", String.format("create custom httpdns parser for host:%s type:%d", str, Integer.valueOf(i)));
        return new CustomHTTPDNS(str, this.mHandler);
    }

    public AVMDLHostProcessor(String str, Handler handler, int i, int i2, int i3, int i4) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        this.mEnableParallel = i4;
        for (int i5 = 0; i5 < 2; i5++) {
            this.mParsers[i5] = null;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            this.mStates[i6] = 0;
        }
        this.mListeners = new HashMap<>();
    }
}
