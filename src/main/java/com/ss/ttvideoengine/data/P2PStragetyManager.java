package com.ss.ttvideoengine.data;

import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

public class P2PStragetyManager {
    final int INDEX_BUFFER_T;
    final int INDEX_ERROR_T;
    final int INDEX_LEAVE_T;
    final int INDEX_MIN_PLAY_PRELOAD_IMTERNAL;
    final int INDEX_NETWORK_LEVEL;
    final int INDEX_PLAY_NUM;
    final int INDEX_SPEED;
    final int INDEX_SWITCH_NETWORK;
    final int MAX_NUM;
    private int[] controlFlag;
    public int enableP2PStragetyConntrol;
    public int expiredT;
    private long lastBufferT;
    private long lastErrorT;
    private long lastLeaveT;
    private P2PStragetyListener listener;
    private int mForbidP2P;
    private int mProbeSpeed;
    public int maxBufferingTime;
    public int maxLeaveWaitTme;
    public int minNetSpeed;
    public int minNetworkLevel;
    public int minPlayNum;
    public int minPlayPreloadInternal;
    private long playNum;

    /* access modifiers changed from: private */
    public static class Holder {
        public static P2PStragetyManager instance = new P2PStragetyManager();

        private Holder() {
        }
    }

    public static P2PStragetyManager getInstance() {
        return Holder.instance;
    }

    public synchronized int[] getP2PStragetyInfo() {
        if (this.enableP2PStragetyConntrol == 0) {
            return null;
        }
        return new int[]{this.minPlayNum, (int) this.playNum, this.minNetSpeed, this.mProbeSpeed};
    }

    private P2PStragetyManager() {
        this.MAX_NUM = 10;
        this.INDEX_SPEED = 1;
        this.INDEX_LEAVE_T = 2;
        this.INDEX_BUFFER_T = 3;
        this.INDEX_SWITCH_NETWORK = 4;
        this.INDEX_ERROR_T = 5;
        this.INDEX_NETWORK_LEVEL = 6;
        this.INDEX_MIN_PLAY_PRELOAD_IMTERNAL = 7;
        this.minPlayNum = 5;
        this.maxLeaveWaitTme = 600;
        this.maxBufferingTime = ParticipantRepo.f117150c;
        this.minNetSpeed = Integer.MAX_VALUE;
        this.expiredT = SmEvents.EVENT_NW;
        this.minPlayPreloadInternal = Integer.MIN_VALUE;
        this.minNetworkLevel = Integer.MIN_VALUE;
        this.mProbeSpeed = Integer.MIN_VALUE;
        this.controlFlag = new int[10];
        for (int i = 0; i < 10; i++) {
            this.controlFlag[i] = 0;
        }
    }

    public synchronized void init() {
        int i;
        for (int i2 = 0; i2 < 10; i2++) {
            int[] iArr = this.controlFlag;
            if (((double) (this.enableP2PStragetyConntrol & (1 << i2))) == Math.pow(2.0d, (double) i2)) {
                i = 1;
            } else {
                i = 0;
            }
            iArr[i2] = i;
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("control flag init, index:%d value:%d", Integer.valueOf(i2), Integer.valueOf(this.controlFlag[i2])));
        }
    }

    public synchronized void onePlay() {
        int i;
        P2PStragetyListener p2PStragetyListener;
        long j = this.playNum + 1;
        this.playNum = j;
        Object[] objArr = new Object[4];
        objArr[0] = Long.valueOf(j);
        objArr[1] = Integer.valueOf(this.controlFlag[1]);
        if (this.listener != null) {
            i = 1;
        } else {
            i = 0;
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(this.mProbeSpeed);
        TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("playnum:%d speedflag:%d listener:%d mProbeSpeed:%d", objArr));
        if (this.playNum > ((long) this.minPlayNum) && this.controlFlag[1] == 1 && (p2PStragetyListener = this.listener) != null && this.mProbeSpeed == Integer.MIN_VALUE) {
            int intValue = p2PStragetyListener.getIntValue(0);
            this.mProbeSpeed = intValue;
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("get probe speed:%d", Integer.valueOf(intValue)));
        }
    }

    public synchronized void setListener(P2PStragetyListener p2PStragetyListener) {
        if (this.listener == null) {
            this.listener = p2PStragetyListener;
        }
        int i = 1;
        Object[] objArr = new Object[1];
        if (this.listener == null) {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("set listener:%d", objArr));
    }

    public synchronized void setPlayErrororInterrupt(int i) {
        if (this.enableP2PStragetyConntrol != 0) {
            if (this.controlFlag[5] != 0) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("occur error code:%d, play after this not allow p2p!", Integer.valueOf(i)));
                this.lastErrorT = System.currentTimeMillis();
                this.mForbidP2P = 1;
            }
        }
    }

    public synchronized void setBufferingTime(long j) {
        if (this.enableP2PStragetyConntrol != 0) {
            if (this.controlFlag[3] != 0) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("set buffering time:%d ", Long.valueOf(j)));
                int i = this.maxBufferingTime;
                if (j > ((long) i)) {
                    TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("reach max buffering time:%d not allow p2p", Integer.valueOf(i)));
                    this.lastBufferT = System.currentTimeMillis();
                    this.mForbidP2P = 1;
                }
            }
        }
    }

    public synchronized void setLeaveWaitTime(long j) {
        if (this.enableP2PStragetyConntrol != 0) {
            if (this.controlFlag[2] != 0) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("leave wait time:%d ", Long.valueOf(j)));
                int i = this.maxLeaveWaitTme;
                if (i > 0 && j > ((long) i)) {
                    TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("leave wait time:%d allow max:%d, play after this not allow p2p!", Long.valueOf(j), Integer.valueOf(this.maxLeaveWaitTme)));
                    this.lastLeaveT = System.currentTimeMillis();
                    this.mForbidP2P = 1;
                }
            }
        }
    }

    public synchronized int isAllowP2p(String str) {
        int i;
        if (this.enableP2PStragetyConntrol == 0) {
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("control not open, enable p2p", new Object[0]));
            return 1;
        }
        if (this.controlFlag[0] == 1 && (i = this.minPlayNum) > 0) {
            long j = this.playNum;
            if (j < ((long) i)) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("curplaynum:%d minnum:%d, not allow p2p", Long.valueOf(j), Integer.valueOf(this.minPlayNum)));
                return 0;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = this.controlFlag;
        if (iArr[2] == 1) {
            long j2 = this.lastLeaveT;
            if (j2 > 0 && currentTimeMillis - j2 < ((long) this.expiredT)) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("curT:%d lastLeaveT:%d,internal:%d not reach expiredT:%d, not allow p2p", Long.valueOf(currentTimeMillis), Long.valueOf(this.lastLeaveT), Long.valueOf(currentTimeMillis - this.lastLeaveT), Integer.valueOf(this.expiredT)));
                return 0;
            }
        }
        if (iArr[3] == 1) {
            long j3 = this.lastBufferT;
            if (j3 > 0 && currentTimeMillis - j3 < ((long) this.expiredT)) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("curT:%d lastbufferT:%d,internal:%d not reach expiredT:%d, not allow p2p", Long.valueOf(currentTimeMillis), Long.valueOf(this.lastBufferT), Long.valueOf(currentTimeMillis - this.lastBufferT), Integer.valueOf(this.expiredT)));
                return 0;
            }
        }
        if (iArr[5] == 1) {
            long j4 = this.lastErrorT;
            if (j4 > 0 && currentTimeMillis - j4 < ((long) this.expiredT)) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("curT:%d lastErrorT:%d,internal:%d not reach expiredT:%d, not allow p2p", Long.valueOf(currentTimeMillis), Long.valueOf(this.lastErrorT), Long.valueOf(currentTimeMillis - this.lastErrorT), Integer.valueOf(this.expiredT)));
                return 0;
            }
        }
        if (iArr[6] == 1) {
            int i2 = Integer.MIN_VALUE;
            P2PStragetyListener p2PStragetyListener = this.listener;
            if (p2PStragetyListener != null) {
                i2 = p2PStragetyListener.getIntValue(1);
            }
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("minnetworklevel:%d probelevel:%d", Integer.valueOf(this.minNetworkLevel), Integer.valueOf(i2)));
            if (i2 <= this.minNetworkLevel) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("network level not allow p2p", new Object[0]));
                return 0;
            }
        }
        this.lastLeaveT = 0;
        this.lastErrorT = 0;
        this.lastBufferT = 0;
        this.mForbidP2P = 0;
        if (this.controlFlag[1] == 1) {
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("minspeed:%d probespeed:%d", Integer.valueOf(this.minNetSpeed), Integer.valueOf(this.mProbeSpeed)));
            int i3 = this.minNetSpeed;
            if (i3 > 0 && this.mProbeSpeed < i3) {
                TTVideoEngineLog.m256500d("P2PStragetyManager", "not allow p2p");
                return 0;
            }
        }
        if (this.controlFlag[7] == 1) {
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("enable min preload play internal,min value:%d", Integer.valueOf(this.minPlayPreloadInternal)));
            P2PStragetyListener p2PStragetyListener2 = this.listener;
            if (p2PStragetyListener2 != null) {
                int intValue = p2PStragetyListener2.getIntValue(2);
                TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("enable min preload play internal,min value:%d curinternal:%d", Integer.valueOf(this.minPlayPreloadInternal), Integer.valueOf(intValue)));
                if (intValue >= 0 && intValue < this.minPlayPreloadInternal) {
                    TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("cur internal not allow p2p", new Object[0]));
                    return 0;
                }
            }
        }
        TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("allow p2p", new Object[0]));
        return 1;
    }

    public synchronized void switchNetwork(int i, int i2) {
        TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("received network change, from:%d to:%d", Integer.valueOf(i), Integer.valueOf(i2)));
        if (this.controlFlag[4] == 1) {
            TTVideoEngineLog.m256500d("P2PStragetyManager", String.format("reset playnum:%d and speed:%d", Long.valueOf(this.playNum), Integer.valueOf(this.mProbeSpeed)));
            this.playNum = 0;
            this.mProbeSpeed = Integer.MIN_VALUE;
        }
    }
}
