package com.ss.ttvideoengine;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.ttvideoengine.info.networkRTTLevelListener;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONObject;

public class TTNetWorkListener extends BroadcastReceiver {
    public static boolean mCatowerRttFull = false;
    public static int mCatowerRttIndex = 0;
    public static int[] mCatowerRttList = null;
    private static TTNetWorkListener mInst = null;
    public static volatile int mNetLevelMaxCount = 10;
    private static volatile int mNetTimerTaskIntervalMs;
    public static boolean mSignalStrengthFull;
    public static int mSignalStrengthIndex;
    public static String[] mSignalStrengthList;
    private int mCurrentAccessStrength = 10;
    public int mCurrentAccessType = 1000;
    private int mInited = 0;
    private ArrayList<WeakReference<TTNetworkStateCallback>> mListeners = new ArrayList<>();
    private Lock mLock = new ReentrantLock();
    private networkRTTLevelListener mNetworkRTTLevelListener = null;
    private TTPhoneStateListener mPhoneStateListener = null;
    private Thread mThread;
    private Timer mTimer = null;
    private TimerTask mTimerTask = null;

    private static int convertNetworkType(int i) {
        if (i == 20) {
            return 4;
        }
        switch (i) {
            case 1:
            case 2:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
                return 1;
            default:
                return 6;
        }
    }

    public int getCurrentAccessStrength() {
        return this.mCurrentAccessStrength;
    }

    public int getCurrentAccessType() {
        return this.mCurrentAccessType;
    }

    public static class MyNetworkQualityHelper {
        private static MyNetworkQualityHelper mInstance;
        private static final ReentrantLock mLock = new ReentrantLock();
        private boolean mFirstStartUp = true;
        private int mLastNetworkScore = -1;
        private Map<String, Integer> mLevelCodeMap;
        private Map<String, Double> mRttCodeMap;
        private Map<String, Double> mSigCodeMap;

        private MyNetworkQualityHelper() {
            init();
        }

        private void init() {
            setDefaultRttMap();
            setDefaultSigMap();
            setDefaultLevelMap();
        }

        public int getNetworkScore() {
            if (this.mFirstStartUp) {
                calculateNetworkScore();
                this.mFirstStartUp = false;
            }
            return this.mLastNetworkScore;
        }

        public static MyNetworkQualityHelper getInstance() {
            if (mInstance == null) {
                ReentrantLock reentrantLock = mLock;
                reentrantLock.lock();
                if (mInstance == null) {
                    mInstance = new MyNetworkQualityHelper();
                }
                reentrantLock.unlock();
            }
            return mInstance;
        }

        private void setDefaultRttMap() {
            HashMap hashMap = new HashMap();
            this.mRttCodeMap = hashMap;
            hashMap.put("-1", Double.valueOf(1.8d));
            this.mRttCodeMap.put("2", Double.valueOf(93.0d));
            this.mRttCodeMap.put("3", Double.valueOf(70.0d));
            this.mRttCodeMap.put("4", Double.valueOf(26.0d));
            this.mRttCodeMap.put("5", Double.valueOf(12.0d));
            this.mRttCodeMap.put("6", Double.valueOf(7.0d));
            this.mRttCodeMap.put("7", Double.valueOf(2.0d));
            this.mRttCodeMap.put("8", Double.valueOf(1.0d));
        }

        private void setDefaultSigMap() {
            HashMap hashMap = new HashMap();
            this.mSigCodeMap = hashMap;
            hashMap.put("excellent", Double.valueOf(1.0d));
            this.mSigCodeMap.put("good", Double.valueOf(2.4d));
            this.mSigCodeMap.put("unknown", Double.valueOf(5.4d));
            this.mSigCodeMap.put("medium", Double.valueOf(7.6d));
            this.mSigCodeMap.put("weak", Double.valueOf(20.6d));
            this.mSigCodeMap.put("unavailable", Double.valueOf(36.0d));
        }

        private void setDefaultLevelMap() {
            HashMap hashMap = new HashMap();
            this.mLevelCodeMap = hashMap;
            hashMap.put("1_1", 0);
            this.mLevelCodeMap.put("1_2", 1);
            this.mLevelCodeMap.put("1_3", 2);
            this.mLevelCodeMap.put("2_1", 3);
            this.mLevelCodeMap.put("2_2", 4);
            this.mLevelCodeMap.put("1_4", 5);
            this.mLevelCodeMap.put("2_3", 6);
            this.mLevelCodeMap.put("3_1", 7);
            this.mLevelCodeMap.put("3_2", 8);
            this.mLevelCodeMap.put("3_3", 9);
            this.mLevelCodeMap.put("2_4", 10);
            this.mLevelCodeMap.put("3_4", 11);
            this.mLevelCodeMap.put("4_1", 12);
            this.mLevelCodeMap.put("4_2", 13);
            this.mLevelCodeMap.put("4_3", 14);
            this.mLevelCodeMap.put("4_4", 15);
        }

        public void calculateNetworkScore() {
            if (!(this.mRttCodeMap == null || this.mSigCodeMap == null || this.mLevelCodeMap == null)) {
                if (!TTNetWorkListener.mCatowerRttFull && TTNetWorkListener.mCatowerRttIndex == 0) {
                    return;
                }
                if (TTNetWorkListener.mSignalStrengthFull || TTNetWorkListener.mSignalStrengthIndex != 0) {
                    int i = TTNetWorkListener.mCatowerRttIndex;
                    if (TTNetWorkListener.mCatowerRttFull) {
                        i = TTNetWorkListener.mNetLevelMaxCount;
                    }
                    double d = 0.0d;
                    for (int i2 = 0; i2 < i; i2++) {
                        try {
                            String valueOf = String.valueOf(TTNetWorkListener.mCatowerRttList[i2]);
                            d += this.mRttCodeMap.containsKey(valueOf) ? this.mRttCodeMap.get(valueOf).doubleValue() : 0.0d;
                        } catch (Exception e) {
                            TTVideoEngineLog.m256503e("TTNetWorkListener", e.toString());
                        }
                    }
                    d /= (double) i;
                    if (d >= 1.0d) {
                        int i3 = TTNetWorkListener.mSignalStrengthIndex;
                        if (TTNetWorkListener.mSignalStrengthFull) {
                            i3 = TTNetWorkListener.mNetLevelMaxCount;
                        }
                        double d2 = 0.0d;
                        for (int i4 = 0; i4 < i3; i4++) {
                            try {
                                String str = TTNetWorkListener.mSignalStrengthList[i4];
                                if (str != null) {
                                    d2 += this.mSigCodeMap.containsKey(str) ? this.mSigCodeMap.get(str).doubleValue() : 0.0d;
                                }
                            } catch (Exception e2) {
                                TTVideoEngineLog.m256503e("TTNetWorkListener", e2.toString());
                            }
                        }
                        d2 /= (double) i3;
                        if (d2 >= 1.0d) {
                            StringBuilder sb = new StringBuilder();
                            if (d <= 2.0d) {
                                sb.append('1');
                            } else if (d <= 11.0d) {
                                sb.append('2');
                            } else if (d <= 26.0d) {
                                sb.append('3');
                            } else {
                                sb.append('4');
                            }
                            sb.append('_');
                            if (d2 == 1.0d) {
                                sb.append('1');
                            } else if (d2 <= 3.0d) {
                                sb.append('2');
                            } else if (d2 <= 7.0d) {
                                sb.append('3');
                            } else {
                                sb.append('4');
                            }
                            String sb2 = sb.toString();
                            int i5 = -1;
                            if (this.mLevelCodeMap.containsKey(sb2)) {
                                i5 = this.mLevelCodeMap.get(sb2).intValue();
                            }
                            this.mLastNetworkScore = i5;
                            TTVideoEngineLog.m256500d("TTNetWorkListener", "rtt score:" + d + " sig score:" + d2 + " level:" + sb2);
                        }
                    }
                }
            }
        }

        public void setStringOption(int i, String str) {
            if (i == 3) {
                try {
                    this.mRttCodeMap = _jsonStringToMap(str, false);
                } catch (Exception unused) {
                    setDefaultRttMap();
                }
            } else if (i == 4) {
                try {
                    this.mSigCodeMap = _jsonStringToMap(str, false);
                } catch (Exception unused2) {
                    setDefaultSigMap();
                }
            } else if (i == 5) {
                try {
                    this.mLevelCodeMap = _jsonStringToMap(str, true);
                } catch (Exception unused3) {
                    setDefaultLevelMap();
                }
            }
        }

        private Map _jsonStringToMap(String str, boolean z) throws Exception {
            HashMap hashMap;
            if (z) {
                try {
                    hashMap = new HashMap();
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Integer.valueOf(jSONObject.getInt(next)));
                    }
                } catch (Exception e) {
                    TTVideoEngineLog.m256503e("TTNetWorkListener", e.toString());
                    throw e;
                }
            } else {
                hashMap = new HashMap();
                JSONObject jSONObject2 = new JSONObject(str);
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    hashMap.put(next2, Double.valueOf(jSONObject2.getDouble(next2)));
                }
            }
            return hashMap;
        }
    }

    /* access modifiers changed from: private */
    public static class TTPhoneStateListener extends PhoneStateListener {
        private WeakReference<TTNetWorkListener> mHandler;
        private TelephonyManager mTelephonyManager;

        public void unregister() {
            TelephonyManager telephonyManager = this.mTelephonyManager;
            if (telephonyManager != null) {
                telephonyManager.listen(this, 0);
            }
        }

        public void register() {
            if (this.mTelephonyManager != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        TTVideoEngineLog.m256500d("TTNetWorkListener", "start listen signal strength");
                        this.mTelephonyManager.listen(this, DynamicModule.f58006b);
                    } catch (Exception unused) {
                        TTVideoEngineLog.m256503e("TTNetWorkListener", "listen signal strength failed");
                    }
                }
                this.mTelephonyManager.listen(this, 64);
            }
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            if (signalStrength != null && Build.VERSION.SDK_INT >= 23) {
                TTNetWorkListener tTNetWorkListener = null;
                WeakReference<TTNetWorkListener> weakReference = this.mHandler;
                if (weakReference != null) {
                    tTNetWorkListener = weakReference.get();
                }
                if (tTNetWorkListener == null || tTNetWorkListener.mCurrentAccessType != 0) {
                    int i = -1;
                    try {
                        int level = signalStrength.getLevel();
                        if (level == 0) {
                            i = 1;
                        } else {
                            i = level;
                        }
                    } catch (Exception unused) {
                        TTVideoEngineLog.m256503e("TTNetWorkListener", "failed to get signalStrength");
                    }
                    if (tTNetWorkListener != null) {
                        tTNetWorkListener._handleSigStrengthChange(i);
                    }
                }
            }
        }

        public TTPhoneStateListener(Context context, TTNetWorkListener tTNetWorkListener) {
            if (tTNetWorkListener != null) {
                this.mHandler = new WeakReference<>(tTNetWorkListener);
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    this.mTelephonyManager = telephonyManager;
                }
            } catch (Exception unused) {
                TTVideoEngineLog.m256503e("TTNetWorkListener", "create telephonyManager failed");
                this.mTelephonyManager = null;
            }
        }

        public void onDataConnectionStateChanged(int i, int i2) {
            WeakReference<TTNetWorkListener> weakReference;
            TTNetWorkListener tTNetWorkListener;
            super.onDataConnectionStateChanged(i, i2);
            TTVideoEngineLog.m256500d("TTNetWorkListener", "data connection state changed, state: " + i + ", networkType: " + i2);
            if (i == 2 && (weakReference = this.mHandler) != null && (tTNetWorkListener = weakReference.get()) != null && tTNetWorkListener.mCurrentAccessType != 0) {
                tTNetWorkListener._handleNetworkChange(i2);
            }
        }
    }

    public int getNetworkRTTLevel() {
        networkRTTLevelListener networkrttlevellistener = this.mNetworkRTTLevelListener;
        if (networkrttlevellistener != null) {
            return networkrttlevellistener.onNetworkLog();
        }
        return -1;
    }

    public int getNetworkRTTMS() {
        networkRTTLevelListener networkrttlevellistener = this.mNetworkRTTLevelListener;
        if (networkrttlevellistener != null) {
            return networkrttlevellistener.getNetworkRTTMs();
        }
        return -1;
    }

    public static synchronized TTNetWorkListener getInstance() {
        TTNetWorkListener tTNetWorkListener;
        synchronized (TTNetWorkListener.class) {
            if (mInst == null) {
                mInst = new TTNetWorkListener();
            }
            tTNetWorkListener = mInst;
        }
        return tTNetWorkListener;
    }

    /* access modifiers changed from: private */
    public static class MyThread extends Thread {
        private WeakReference<Context> mContextRef;
        private WeakReference<TTNetWorkListener> mTTNetworkListener;

        public void run() {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            TTNetWorkListener.getInstance().registerListener(this.mContextRef.get());
            Looper.loop();
            TTNetWorkListener tTNetWorkListener = this.mTTNetworkListener.get();
            if (tTNetWorkListener != null) {
                tTNetWorkListener.unregisterListener(this.mContextRef.get());
            }
        }

        public MyThread(Context context, TTNetWorkListener tTNetWorkListener) {
            this.mContextRef = new WeakReference<>(context);
            this.mTTNetworkListener = new WeakReference<>(tTNetWorkListener);
        }
    }

    private TTNetWorkListener() {
        mCatowerRttList = new int[mNetLevelMaxCount];
        mSignalStrengthList = new String[mNetLevelMaxCount];
    }

    public String getSignalStrength() {
        if (this.mCurrentAccessType == 1000) {
            return "unknown";
        }
        int i = this.mCurrentAccessStrength;
        if (i == 1) {
            return "weak";
        }
        if (i == 2) {
            return "medium";
        }
        if (i == 3) {
            return "good";
        }
        if (i != 4) {
            return "unknown";
        }
        return "excellent";
    }

    private class MyTimerTask extends TimerTask {
        public void run() {
            int networkRTTLevel = TTNetWorkListener.this.getNetworkRTTLevel();
            String signalStrength = TTNetWorkListener.this.getSignalStrength();
            synchronized (TTNetWorkListener.this) {
                if (TTNetWorkListener.mCatowerRttIndex < TTNetWorkListener.mCatowerRttList.length) {
                    TTNetWorkListener.mCatowerRttList[TTNetWorkListener.mCatowerRttIndex] = networkRTTLevel;
                }
                TTNetWorkListener.mCatowerRttIndex++;
                if (TTNetWorkListener.mCatowerRttIndex >= TTNetWorkListener.mNetLevelMaxCount) {
                    TTNetWorkListener.mCatowerRttIndex = 0;
                    TTNetWorkListener.mCatowerRttFull = true;
                }
                if (TTNetWorkListener.mSignalStrengthIndex < TTNetWorkListener.mSignalStrengthList.length) {
                    TTNetWorkListener.mSignalStrengthList[TTNetWorkListener.mSignalStrengthIndex] = signalStrength;
                }
                TTNetWorkListener.mSignalStrengthIndex++;
                if (TTNetWorkListener.mSignalStrengthIndex >= TTNetWorkListener.mNetLevelMaxCount) {
                    TTNetWorkListener.mSignalStrengthIndex = 0;
                    TTNetWorkListener.mSignalStrengthFull = true;
                }
            }
        }

        private MyTimerTask() {
        }
    }

    public void setNetworkRTTLevelListener(networkRTTLevelListener networkrttlevellistener) {
        this.mNetworkRTTLevelListener = networkrttlevellistener;
    }

    private void _handelNetworkChange(Context context) {
        updateAccessType(getNetworkType(context));
    }

    public void _handleNetworkChange(int i) {
        int convertNetworkType = convertNetworkType(i);
        TTVideoEngineLog.m256500d("TTNetWorkListener", "network change to: " + convertNetworkType);
        updateAccessType(convertNetworkType);
    }

    public synchronized void init(Context context) {
        if (this.mInited == 0) {
            this.mInited = 1;
            MyThread myThread = new MyThread(context, this);
            this.mThread = myThread;
            myThread.start();
        }
    }

    public void startListen(WeakReference<TTNetworkStateCallback> weakReference) {
        if (weakReference != null) {
            this.mLock.lock();
            this.mListeners.add(weakReference);
            this.mLock.unlock();
        }
    }

    public void stopListen(WeakReference<TTNetworkStateCallback> weakReference) {
        if (weakReference != null) {
            this.mLock.lock();
            this.mListeners.remove(weakReference);
            this.mLock.unlock();
        }
    }

    public void unregisterListener(Context context) {
        if (context != null && this.mPhoneStateListener != null) {
            try {
                context.unregisterReceiver(this);
                this.mPhoneStateListener.unregister();
            } catch (Exception unused) {
                TTVideoEngineLog.m256503e("TTNetWorkListener", "Receiver has been unregistered!");
            }
        }
    }

    public void registerListener(Context context) {
        try {
            TTVideoEngineLog.m256500d("TTNetWorkListener", "enter start listen");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
            INVOKEVIRTUAL_com_ss_ttvideoengine_TTNetWorkListener_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, this, intentFilter);
            int networkType = getNetworkType(context);
            this.mCurrentAccessType = networkType;
            if (networkType == 0) {
                this.mCurrentAccessStrength = getWIFISignalStrength(context, null);
            }
            TTPhoneStateListener tTPhoneStateListener = new TTPhoneStateListener(context, this);
            this.mPhoneStateListener = tTPhoneStateListener;
            tTPhoneStateListener.register();
            this.mInited = 1;
        } catch (Exception e) {
            TTVideoEngineLog.m256501d(e);
            TTVideoEngineLog.m256500d("TTNetWorkListener", "start listen network state failed");
        }
    }

    private void updateAccessType(int i) {
        if (i != this.mCurrentAccessType) {
            this.mLock.lock();
            int i2 = this.mCurrentAccessType;
            this.mCurrentAccessType = i;
            TTVideoEngineLog.m256500d("TTNetWorkListener", "access changed, from: " + i2 + " to: " + this.mCurrentAccessType + " callback list size: " + this.mListeners.size());
            Iterator<WeakReference<TTNetworkStateCallback>> it = this.mListeners.iterator();
            while (it.hasNext()) {
                TTNetworkStateCallback tTNetworkStateCallback = it.next().get();
                if (tTNetworkStateCallback == null) {
                    it.remove();
                } else {
                    tTNetworkStateCallback.onAccessChanged(0, i2, this.mCurrentAccessType);
                }
            }
            this.mLock.unlock();
        }
    }

    public void _handleSigStrengthChange(int i) {
        if (i != this.mCurrentAccessStrength) {
            this.mLock.lock();
            int i2 = this.mCurrentAccessStrength;
            this.mCurrentAccessStrength = i;
            TTVideoEngineLog.m256505i("TTNetWorkListener", "strength changed, from: " + i2 + " to: " + this.mCurrentAccessStrength + " callback list size: " + this.mListeners.size());
            Iterator<WeakReference<TTNetworkStateCallback>> it = this.mListeners.iterator();
            while (it.hasNext()) {
                TTNetworkStateCallback tTNetworkStateCallback = it.next().get();
                if (tTNetworkStateCallback == null) {
                    it.remove();
                } else {
                    tTNetworkStateCallback.onAccessChanged(1, i2, this.mCurrentAccessStrength);
                }
            }
            this.mLock.unlock();
        }
    }

    private int getNetworkType(Context context) {
        NetworkInfo.State state;
        if (context == null) {
            return 1000;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            TTVideoEngineLog.m256500d("TTNetWorkListener", "disconnect");
            return -1;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            TTVideoEngineLog.m256500d("TTNetWorkListener", "disconnect 1");
            return -1;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || (state = networkInfo.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            try {
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null) {
                    NetworkInfo.State state2 = networkInfo2.getState();
                    int subtype = activeNetworkInfo.getSubtype();
                    TTVideoEngineLog.m256500d("TTNetWorkListener", "state: " + state2 + ", subtype: " + subtype);
                    if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                        return convertNetworkType(subtype);
                    }
                }
                return 1000;
            } catch (Exception e) {
                TTVideoEngineLog.m256503e("TTNetWorkListener", e.toString());
                return 1000;
            }
        } else {
            TTVideoEngineLog.m256500d("TTNetWorkListener", "wifi");
            return 0;
        }
    }

    public void setStringValue(int i, String str) {
        if (i == 3) {
            MyNetworkQualityHelper.getInstance().setStringOption(3, str);
        } else if (i == 4) {
            MyNetworkQualityHelper.getInstance().setStringOption(4, str);
        } else if (i == 5) {
            MyNetworkQualityHelper.getInstance().setStringOption(5, str);
        }
    }

    private int getWIFISignalStrength(Context context, Intent intent) {
        NetworkInfo networkInfo;
        if (context == null) {
            return 10;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected() || context.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) != 0) {
                return 10;
            }
            int i = -1;
            if (intent == null) {
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    i = connectionInfo.getRssi();
                }
            } else {
                i = intent.getIntExtra("newRssi", -70);
            }
            int calculateSignalLevel = WifiManager.calculateSignalLevel(i, 4);
            TTVideoEngineLog.m256500d("TTNetWorkListener", "wifi dbm:" + i + ", level:" + calculateSignalLevel);
            return calculateSignalLevel + 1;
        } catch (Exception e) {
            TTVideoEngineLog.m256503e("TTNetWorkListener", e.toString());
            return 10;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast() && intent != null) {
            if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()) && this.mCurrentAccessType == 0) {
                _handleSigStrengthChange(getWIFISignalStrength(context, intent));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                TTVideoEngineLog.m256500d("TTNetWorkListener", "network broadcast:" + intent.getAction());
                _handelNetworkChange(context);
            }
        }
    }

    public void setIntValue(int i, int i2) {
        if (i != 1) {
            if (i == 2) {
                if (i2 <= 0 || mNetTimerTaskIntervalMs == i2) {
                    TTVideoEngineLog.m256503e("TTNetWorkListener", "invalid parameter");
                    return;
                }
                mNetTimerTaskIntervalMs = i2;
                TimerTask timerTask = this.mTimerTask;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                if (this.mTimer == null) {
                    this.mTimer = new Timer();
                }
                MyTimerTask myTimerTask = new MyTimerTask();
                this.mTimerTask = myTimerTask;
                this.mTimer.schedule(myTimerTask, 1000, (long) mNetTimerTaskIntervalMs);
                TTVideoEngineLog.m256500d("TTNetWorkListener", "network timer task scheduled");
            }
        } else if (i2 > 0 && mNetLevelMaxCount != i2) {
            synchronized (this) {
                mNetLevelMaxCount = i2;
                mCatowerRttList = new int[mNetLevelMaxCount];
                mSignalStrengthList = new String[mNetLevelMaxCount];
                mCatowerRttIndex = 0;
                mSignalStrengthIndex = 0;
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ss_ttvideoengine_TTNetWorkListener_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
