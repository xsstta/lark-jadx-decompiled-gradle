package com.bytedance.common.wschannel.heartbeat.normal;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.heartbeat.BaseHeartBeatPolicy;
import com.bytedance.common.wschannel.heartbeat.HeartBeatReactListener;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import com.bytedance.common.wschannel.heartbeat.monitor.HeartBeatMonitor;
import com.bytedance.common.wschannel.utils.Utils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Response;

public class NormalHeartBeatPolicy extends BaseHeartBeatPolicy<NormalHeartBeatMeta> {
    private Handler mHandler;
    public HeartBeatReactListener mReactListener;
    private Runnable mSendHeartBeatRunnable = new Runnable() {
        /* class com.bytedance.common.wschannel.heartbeat.normal.NormalHeartBeatPolicy.RunnableC36652 */

        public void run() {
            if (NormalHeartBeatPolicy.this.mReactListener != null) {
                NormalHeartBeatPolicy.this.schedule();
                NormalHeartBeatPolicy.this.mReactListener.onSendPing();
            }
        }
    };
    private Runnable mTimeoutCheckRunnable = new Runnable() {
        /* class com.bytedance.common.wschannel.heartbeat.normal.NormalHeartBeatPolicy.RunnableC36641 */

        public void run() {
            if (NormalHeartBeatPolicy.this.mWaitingForPong.getAndSet(false)) {
                NormalHeartBeatPolicy.this.disConnect();
                if (NormalHeartBeatPolicy.this.mReactListener != null) {
                    Logger.m15167d("WsChannelSdk_ok", "心跳超时，准备断开重连");
                    NormalHeartBeatPolicy.this.mReactListener.onHeartBeatTimeout();
                    HeartBeatMonitor.getInstance().onPingTimeout();
                }
            }
        }
    };
    public AtomicBoolean mWaitingForPong = new AtomicBoolean(false);

    @Override // com.bytedance.common.wschannel.heartbeat.IHeartBeatPolicy
    public void onAppStateUpdate(AppState appState) {
    }

    @Override // com.bytedance.common.wschannel.heartbeat.IHeartBeatPolicy
    public void onDisconnected() {
        Logger.m15167d("WsChannelSdk_ok", "断开连接，停止计时发送ping");
        disConnect();
    }

    @Override // com.bytedance.common.wschannel.heartbeat.IHeartBeatPolicy
    public void onPingSendSuccess() {
        Logger.m15167d("WsChannelSdk_ok", "ping已发送，开始等待pong");
        waitingForPong();
    }

    private void waitingForPong() {
        this.mWaitingForPong.set(true);
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
        this.mHandler.postDelayed(this.mTimeoutCheckRunnable, ((NormalHeartBeatMeta) this.mMeta).getTimeout());
    }

    public void disConnect() {
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
        this.mHandler.removeCallbacks(this.mSendHeartBeatRunnable);
        this.mWaitingForPong.set(false);
    }

    @Override // com.bytedance.common.wschannel.heartbeat.IHeartBeatPolicy
    public void onReceivePong() {
        Logger.m15167d("WsChannelSdk_ok", "收到pong");
        this.mWaitingForPong.set(false);
        this.mHandler.removeCallbacks(this.mTimeoutCheckRunnable);
        HeartBeatMonitor.getInstance().onPingSuccess();
    }

    public void schedule() {
        long pingInterval = ((NormalHeartBeatMeta) this.mMeta).getPingInterval();
        Logger.m15167d("WsChannelSdk_ok", "interval :" + pingInterval + " ms,下次心跳时间为: " + Utils.getTimeFormat(System.currentTimeMillis() + pingInterval));
        this.mHandler.removeCallbacks(this.mSendHeartBeatRunnable);
        this.mHandler.postDelayed(this.mSendHeartBeatRunnable, pingInterval);
    }

    @Override // com.bytedance.common.wschannel.heartbeat.IHeartBeatPolicy
    public void onConnected(Response response) {
        Logger.m15167d("WsChannelSdk_ok", "连接成功，开始计时发送ping");
        updatePingInterval(response);
        schedule();
    }

    public NormalHeartBeatPolicy(NormalHeartBeatMeta normalHeartBeatMeta) {
        super(normalHeartBeatMeta);
    }

    private void updatePingInterval(Response response) {
        long j;
        if (((NormalHeartBeatMeta) this.mMeta).getPingInterval() == -1) {
            if (response == null) {
                ((NormalHeartBeatMeta) this.mMeta).setPingInterval(270000);
                return;
            }
            String header = response.header("Handshake-Options");
            if (header != null) {
                String[] split = header.split(";");
                int length = split.length;
                j = -1;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str = split[i];
                    if (!TextUtils.isEmpty(str)) {
                        String[] split2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                        if ("ping-interval".equals(split2[0])) {
                            try {
                                j = Long.parseLong(split2[1]) * 1000;
                                break;
                            } catch (NumberFormatException unused) {
                                j = 270000;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
            } else {
                j = -1;
            }
            if (j == -1) {
                ((NormalHeartBeatMeta) this.mMeta).setPingInterval(270000);
            } else {
                ((NormalHeartBeatMeta) this.mMeta).setPingInterval(j);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.heartbeat.BaseHeartBeatPolicy
    public void init(HeartBeatReactListener heartBeatReactListener, Handler handler) {
        this.mReactListener = heartBeatReactListener;
        this.mHandler = handler;
    }
}
