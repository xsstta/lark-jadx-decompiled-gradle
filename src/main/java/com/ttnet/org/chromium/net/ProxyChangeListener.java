package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ttnet.org.chromium.base.BuildConfig;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.ProxyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import me.ele.lancet.base.annotations.Skip;

@JNINamespace("net")
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sEnabled = true;
    private Delegate mDelegate;
    private final Handler mHandler;
    private final Looper mLooper;
    private long mNativePtr;
    private ProxyReceiver mProxyReceiver;
    private BroadcastReceiver mRealProxyReceiver;

    public interface Delegate {
        void proxySettingsChanged();
    }

    @NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
    private native void nativeProxySettingsChanged(long j);

    @NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$0$ProxyChangeListener() {
        proxySettingsChanged(getProxyConfig());
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public void stop() {
        assertOnThread();
        this.mNativePtr = 0;
        unregisterReceiver();
    }

    /* access modifiers changed from: package-private */
    public void updateProxyConfigFromConnectivityManager() {
        runOnThread(new Runnable() {
            /* class com.ttnet.org.chromium.net.$$Lambda$ProxyChangeListener$5gortkySKjkU3POxlXzTJ6HRI */

            public final void run() {
                ProxyChangeListener.this.lambda$updateProxyConfigFromConnectivityManager$0$ProxyChangeListener();
            }
        });
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
    }

    private void assertOnThread() {
        if (BuildConfig.DCHECK_IS_ON && !onThread()) {
            throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    private ProxyConfig getProxyConfig() {
        ProxyInfo defaultProxy = ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).getDefaultProxy();
        if (defaultProxy == null) {
            return ProxyConfig.DIRECT;
        }
        return ProxyConfig.fromProxyInfo(defaultProxy);
    }

    private void unregisterReceiver() {
        assertOnThread();
        ContextUtils.getApplicationContext().unregisterReceiver(this.mProxyReceiver);
        if (this.mRealProxyReceiver != null) {
            ContextUtils.getApplicationContext().unregisterReceiver(this.mRealProxyReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    private void registerReceiver() {
        assertOnThread();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new ProxyReceiver();
        if (Build.VERSION.SDK_INT < 23) {
            INVOKEVIRTUAL_com_ttnet_org_chromium_net_ProxyChangeListener_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextUtils.getApplicationContext(), this.mProxyReceiver, intentFilter);
            return;
        }
        INVOKEVIRTUAL_com_ttnet_org_chromium_net_ProxyChangeListener_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextUtils.getApplicationContext(), this.mProxyReceiver, new IntentFilter());
        this.mRealProxyReceiver = new ProxyBroadcastReceiver(this);
        INVOKEVIRTUAL_com_ttnet_org_chromium_net_ProxyChangeListener_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(ContextUtils.getApplicationContext(), this.mRealProxyReceiver, intentFilter);
    }

    public static void setEnabled(boolean z) {
        sEnabled = z;
    }

    public void setDelegateForTesting(Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* access modifiers changed from: private */
    public class ProxyReceiver extends BroadcastReceiver {
        private ProxyReceiver() {
        }

        public /* synthetic */ void lambda$onReceive$0$ProxyChangeListener$ProxyReceiver(Intent intent) {
            ProxyChangeListener.this.proxySettingsChanged(extractNewProxy(intent));
        }

        private ProxyConfig extractNewProxy(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return ProxyConfig.fromProxyInfo((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
            }
            try {
                Object obj = extras.get("proxy");
                if (obj == null) {
                    return null;
                }
                Class<?> cls = Class.forName("android.net.ProxyProperties");
                Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                String str = (String) declaredMethod.invoke(obj, new Object[0]);
                int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
                String[] split = ((String) declaredMethod3.invoke(obj, new Object[0])).split(",");
                if (Build.VERSION.SDK_INT >= 19) {
                    String str2 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                    if (!TextUtils.isEmpty(str2)) {
                        return new ProxyConfig(str, intValue, str2, split);
                    }
                }
                return new ProxyConfig(str, intValue, null, split);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e);
                return null;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.runOnThread(new Runnable(intent) {
                    /* class com.ttnet.org.chromium.net.$$Lambda$ProxyChangeListener$ProxyReceiver$quT_pBmPAvNf9nzUcuYA4oV71tE */
                    public final /* synthetic */ Intent f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ProxyChangeListener.ProxyReceiver.this.lambda$onReceive$0$ProxyChangeListener$ProxyReceiver(this.f$1);
                    }
                });
            }
        }
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public void runOnThread(Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public void start(long j) {
        assertOnThread();
        this.mNativePtr = j;
        registerReceiver();
    }

    /* access modifiers changed from: private */
    public static class ProxyConfig {
        public static final ProxyConfig DIRECT = new ProxyConfig("", 0, "", new String[0]);
        public final String[] mExclusionList;
        public final String mHost;
        public final String mPacUrl;
        public final int mPort;

        public static ProxyConfig fromProxyInfo(ProxyInfo proxyInfo) {
            String str = null;
            if (proxyInfo == null) {
                return null;
            }
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            String host = proxyInfo.getHost();
            int port = proxyInfo.getPort();
            if (!Uri.EMPTY.equals(pacFileUrl)) {
                str = pacFileUrl.toString();
            }
            return new ProxyConfig(host, port, str, proxyInfo.getExclusionList());
        }

        public ProxyConfig(String str, int i, String str2, String[] strArr) {
            this.mHost = str;
            this.mPort = i;
            this.mPacUrl = str2;
            this.mExclusionList = strArr;
        }
    }

    public void proxySettingsChanged(ProxyConfig proxyConfig) {
        assertOnThread();
        if (sEnabled) {
            Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            long j = this.mNativePtr;
            if (j != 0) {
                if (proxyConfig != null) {
                    nativeProxySettingsChangedTo(j, proxyConfig.mHost, proxyConfig.mPort, proxyConfig.mPacUrl, proxyConfig.mExclusionList);
                } else {
                    nativeProxySettingsChanged(j);
                }
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_ttnet_org_chromium_net_ProxyChangeListener_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
