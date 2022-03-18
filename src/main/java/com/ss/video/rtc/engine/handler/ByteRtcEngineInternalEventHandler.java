package com.ss.video.rtc.engine.handler;

import android.text.TextUtils;
import com.ss.video.rtc.engine.RtcEngineImpl.C65562RtcEngineImpl;
import com.ss.video.rtc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

public class ByteRtcEngineInternalEventHandler {
    private String mCurrConfigAddr;
    private String mCurrSignalingAddr;
    private WeakReference<C65562RtcEngineImpl> mRtcEngineImpl;
    private WeakReference<IRtcEngineInternalEventHandler> mRtcEngineInternalEventHandler;

    public IRtcEngineInternalEventHandler getRtcEngineInternalEventHandler() {
        WeakReference<IRtcEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public ByteRtcEngineInternalEventHandler(C65562RtcEngineImpl rtcEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rtcEngineImpl);
    }

    public void onChannelTypeChanged(boolean z) {
        IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler;
        try {
            WeakReference<IRtcEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference == null) {
                iRtcEngineInternalEventHandler = null;
            } else {
                iRtcEngineInternalEventHandler = weakReference.get();
            }
            if (iRtcEngineInternalEventHandler != null) {
                iRtcEngineInternalEventHandler.onChannelTypeChanged(z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineInternalEventHandler", "onChannelTypeChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onConfigAddrChanged(String str) {
        IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler;
        try {
            this.mCurrConfigAddr = str;
            WeakReference<IRtcEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference == null) {
                iRtcEngineInternalEventHandler = null;
            } else {
                iRtcEngineInternalEventHandler = weakReference.get();
            }
            if (iRtcEngineInternalEventHandler != null) {
                iRtcEngineInternalEventHandler.onConfigAddrChanged(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineInternalEventHandler", "onConfigAddrChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void onPeerConnectionICEMux(boolean z) {
        IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler;
        try {
            WeakReference<IRtcEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference == null) {
                iRtcEngineInternalEventHandler = null;
            } else {
                iRtcEngineInternalEventHandler = weakReference.get();
            }
            if (iRtcEngineInternalEventHandler != null) {
                iRtcEngineInternalEventHandler.onPeerConnectionICEMux(z);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineInternalEventHandler", "onPeerConnectionICEMux callback catch exception.\n" + e.getMessage());
        }
    }

    public void onSignalingAddrChanged(String str) {
        IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler;
        try {
            this.mCurrSignalingAddr = str;
            WeakReference<IRtcEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference == null) {
                iRtcEngineInternalEventHandler = null;
            } else {
                iRtcEngineInternalEventHandler = weakReference.get();
            }
            if (iRtcEngineInternalEventHandler != null) {
                iRtcEngineInternalEventHandler.onSignalingAddrChanged(str);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineInternalEventHandler", "onSignalingAddrChanged callback catch exception.\n" + e.getMessage());
        }
    }

    public void setRtcEngineInternalEventHandler(IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler) {
        WeakReference<IRtcEngineInternalEventHandler> weakReference = new WeakReference<>(iRtcEngineInternalEventHandler);
        this.mRtcEngineInternalEventHandler = weakReference;
        IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler2 = weakReference.get();
        if (iRtcEngineInternalEventHandler2 != null) {
            if (!TextUtils.isEmpty(this.mCurrConfigAddr)) {
                iRtcEngineInternalEventHandler2.onConfigAddrChanged(this.mCurrConfigAddr);
            }
            if (!TextUtils.isEmpty(this.mCurrSignalingAddr)) {
                iRtcEngineInternalEventHandler2.onSignalingAddrChanged(this.mCurrSignalingAddr);
            }
        }
    }

    public void onSystemInfoLog(double d, double d2, double d3) {
        IRtcEngineInternalEventHandler iRtcEngineInternalEventHandler;
        try {
            WeakReference<IRtcEngineInternalEventHandler> weakReference = this.mRtcEngineInternalEventHandler;
            if (weakReference == null) {
                iRtcEngineInternalEventHandler = null;
            } else {
                iRtcEngineInternalEventHandler = weakReference.get();
            }
            if (iRtcEngineInternalEventHandler != null) {
                iRtcEngineInternalEventHandler.onSystemInfoLog(d, d2, d3);
            }
        } catch (Exception e) {
            LogUtil.m257129d("ByteRtcEngineInternalEventHandler", "onSystemInfoLog callback catch exception.\n" + e.getMessage());
        }
    }
}
