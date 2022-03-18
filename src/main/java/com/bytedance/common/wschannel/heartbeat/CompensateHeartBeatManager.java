package com.bytedance.common.wschannel.heartbeat;

import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.channel.impl.ok.ws.CustomHeartBeatWebSocket;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;

public class CompensateHeartBeatManager {
    private AppState currentAppState;
    private Handler mHandler;
    public AtomicBoolean mIsWaitingPong = new AtomicBoolean(false);
    private Runnable mTimeoutCheckRunnable = new Runnable() {
        /* class com.bytedance.common.wschannel.heartbeat.CompensateHeartBeatManager.RunnableC36611 */

        public void run() {
            if (CompensateHeartBeatManager.this.mIsWaitingPong.getAndSet(false)) {
                Logger.m15167d("WsChannelSdk_ok", "补偿ping发生了超时，准备重连");
                if (CompensateHeartBeatManager.this.timeoutListener != null) {
                    CompensateHeartBeatManager.this.timeoutListener.onTimeout();
                }
            }
        }
    };
    private CustomHeartBeatWebSocket mWebSocket;
    public OnHeartBeatTimeoutListener timeoutListener;

    public interface OnHeartBeatTimeoutListener {
        void onTimeout();
    }

    public boolean isWaitingPong() {
        return this.mIsWaitingPong.get();
    }

    private void waitingForPong() {
        this.mIsWaitingPong.set(true);
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
        this.mHandler.postDelayed(this.mTimeoutCheckRunnable, 5000);
    }

    public void onReceivePong() {
        Logger.m15167d("WsChannelSdk_ok", "补偿ping之后接受到了pong");
        this.mIsWaitingPong.set(false);
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
    }

    public void setWebSocket(CustomHeartBeatWebSocket customHeartBeatWebSocket) {
        this.mWebSocket = customHeartBeatWebSocket;
    }

    private boolean isBackToFore(AppState appState) {
        if (this.currentAppState == AppState.STATE_BACKGROUND && appState == AppState.STATE_FOREGROUND) {
            return true;
        }
        return false;
    }

    public void updateCurrentAppState(AppState appState) {
        if (!this.mIsWaitingPong.get()) {
            boolean z = false;
            if (isBackToFore(appState)) {
                Logger.m15167d("WsChannelSdk_ok", "后台切换前台，发送补偿ping");
                z = true;
            }
            if (z) {
                try {
                    CustomHeartBeatWebSocket customHeartBeatWebSocket = this.mWebSocket;
                    if (customHeartBeatWebSocket != null) {
                        customHeartBeatWebSocket.sendPing(ByteString.EMPTY);
                        waitingForPong();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.currentAppState = appState;
    }

    public CompensateHeartBeatManager(OnHeartBeatTimeoutListener onHeartBeatTimeoutListener, Handler handler) {
        this.timeoutListener = onHeartBeatTimeoutListener;
        this.mHandler = handler;
    }
}
