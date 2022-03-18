package com.ss.ttvideoengine.log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONObject;

public class HeadsetStateMonitor {
    private HeadsetStateChangedListener mChangeListener;
    private final ArrayList<String> mConnectionHistoryList;
    public final Context mContext;
    private HeadsetReceiver mHeadsetReceiver;
    public volatile int mHeadsetState = 65280;
    private volatile long mLastSwitchTime;

    public interface HeadsetStateChangedListener {
        void onHeadsetStateChanged(boolean z, boolean z2);
    }

    public ArrayList<String> getConnectionHistory() {
        return this.mConnectionHistoryList;
    }

    public long getLastSwitchTime() {
        return this.mLastSwitchTime;
    }

    public void stop() {
        unregisterBroadcastReceiver(this.mContext);
    }

    public boolean isWiredConnected() {
        if (this.mHeadsetState == 65280) {
            this.mHeadsetState = getHeadsetState(this.mContext);
        }
        if ((this.mHeadsetState & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isWirelessConnected() {
        if (this.mHeadsetState == 65280) {
            this.mHeadsetState = getHeadsetState(this.mContext);
        }
        if ((this.mHeadsetState & 2) != 0) {
            return true;
        }
        return false;
    }

    public void start() {
        EngineThreadPool.addExecuteTask(new Runnable() {
            /* class com.ss.ttvideoengine.log.HeadsetStateMonitor.RunnableC654501 */

            public void run() {
                HeadsetStateMonitor headsetStateMonitor = HeadsetStateMonitor.this;
                headsetStateMonitor.mHeadsetState = headsetStateMonitor.getHeadsetState(headsetStateMonitor.mContext);
                HeadsetStateMonitor.this.updateConnectionHistory();
            }
        });
        if (this.mHeadsetReceiver == null) {
            registerBroadcastReceiver(this.mContext);
        }
    }

    public void updateConnectionHistory() {
        if (isWiredConnected()) {
            addDeviceToHistory("wired", true, false);
        }
        if (isWirelessConnected()) {
            addDeviceToHistory("wireless", true, true);
        }
        if (!isWirelessConnected() && !isWiredConnected()) {
            addDeviceToHistory("", false, false);
        }
    }

    public void setStateChangedListener(HeadsetStateChangedListener headsetStateChangedListener) {
        this.mChangeListener = headsetStateChangedListener;
    }

    /* access modifiers changed from: private */
    public class HeadsetReceiver extends BroadcastReceiver {
        private HeadsetReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
                String action = intent.getAction();
                TTVideoEngineLog.m256500d("HeadsetStateMonitor", "onReceiver: " + action);
                String action2 = intent.getAction();
                action2.hashCode();
                if (action2.equals("android.intent.action.HEADSET_PLUG")) {
                    int intExtra = intent.getIntExtra("state", -1);
                    if (intExtra == 1) {
                        HeadsetStateMonitor.this.onConnected(1);
                    } else if (intExtra == 0) {
                        HeadsetStateMonitor.this.onDisconnected(1);
                    }
                } else if (action2.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    if (intExtra2 == 2) {
                        HeadsetStateMonitor.this.onConnected(2);
                    } else if (intExtra2 == 0) {
                        HeadsetStateMonitor.this.onDisconnected(2);
                    }
                }
            }
        }
    }

    public HeadsetStateMonitor(Context context) {
        this.mContext = context;
        this.mConnectionHistoryList = new ArrayList<>();
        start();
    }

    private void registerBroadcastReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        HeadsetReceiver headsetReceiver = new HeadsetReceiver();
        this.mHeadsetReceiver = headsetReceiver;
        INVOKEVIRTUAL_com_ss_ttvideoengine_log_HeadsetStateMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, headsetReceiver, intentFilter);
    }

    private void unregisterBroadcastReceiver(Context context) {
        HeadsetReceiver headsetReceiver = this.mHeadsetReceiver;
        if (headsetReceiver != null) {
            try {
                context.unregisterReceiver(headsetReceiver);
            } catch (Exception e) {
                TTVideoEngineLog.m256508w("HeadsetStateMonitor", e.getMessage());
            }
            this.mHeadsetReceiver = null;
        }
    }

    public void onConnected(int i) {
        boolean z;
        TTVideoEngineLog.m256500d("HeadsetStateMonitor", "onConnected, " + i);
        if (this.mHeadsetState == 65280) {
            this.mHeadsetState = getHeadsetState(this.mContext);
        }
        int i2 = this.mHeadsetState | i;
        if (i2 != this.mHeadsetState) {
            this.mHeadsetState = i2;
            updateConnectionHistory();
            this.mLastSwitchTime = System.currentTimeMillis();
            HeadsetStateChangedListener headsetStateChangedListener = this.mChangeListener;
            if (headsetStateChangedListener != null) {
                boolean z2 = false;
                if (isWiredConnected() || isWirelessConnected()) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == 2) {
                    z2 = true;
                }
                headsetStateChangedListener.onHeadsetStateChanged(z, z2);
            }
        }
    }

    public void onDisconnected(int i) {
        boolean z;
        TTVideoEngineLog.m256500d("HeadsetStateMonitor", "onDisconnected");
        if (this.mHeadsetState == 65280) {
            this.mHeadsetState = getHeadsetState(this.mContext);
        }
        int i2 = (~i) & this.mHeadsetState;
        if (i2 != this.mHeadsetState) {
            this.mHeadsetState = i2;
            updateConnectionHistory();
            this.mLastSwitchTime = System.currentTimeMillis();
            HeadsetStateChangedListener headsetStateChangedListener = this.mChangeListener;
            if (headsetStateChangedListener != null) {
                if (isWiredConnected() || isWirelessConnected()) {
                    z = true;
                } else {
                    z = false;
                }
                headsetStateChangedListener.onHeadsetStateChanged(z, isWirelessConnected());
            }
        }
    }

    public int getHeadsetState(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                TTVideoEngineLog.m256503e("HeadsetStateMonitor", "AudioManager is null");
                return 65280;
            }
            int i = 0;
            if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT == 25) {
                if (audioManager.isWiredHeadsetOn()) {
                    i = 1;
                }
                if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
                    return i | 2;
                }
                return i;
            }
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            int length = devices.length;
            int i2 = 0;
            while (i < length) {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                    i2 |= 1;
                    TTVideoEngineLog.m256500d("HeadsetStateMonitor", "wired device: " + ((Object) audioDeviceInfo.getProductName()));
                }
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                    i2 |= 2;
                    TTVideoEngineLog.m256500d("HeadsetStateMonitor", "bluetooth device: " + ((Object) audioDeviceInfo.getProductName()));
                }
                i++;
            }
            return i2;
        } catch (Throwable th) {
            th.printStackTrace();
            return 65280;
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_ttvideoengine_log_HeadsetStateMonitor_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    private void addDeviceToHistory(CharSequence charSequence, boolean z, boolean z2) {
        if (charSequence != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("bt", Integer.valueOf(z2 ? 1 : 0));
            hashMap.put("con", Integer.valueOf(z ? 1 : 0));
            this.mConnectionHistoryList.add(new JSONObject(hashMap).toString());
        }
    }
}
