package com.ttnet.org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Process;
import android.util.Pair;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.ObserverList;
import com.ttnet.org.chromium.base.PowerMonitor;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net.NetworkQualityRttListener;
import com.ttnet.org.chromium.net.NetworkQualityThroughputListener;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTEventListener;
import com.ttnet.org.chromium.net.TTMonitorProvider;
import com.ttnet.org.chromium.net.TTMpaService;
import com.ttnet.org.chromium.net.TTNetDiagnosisRequest;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import com.ttnet.org.chromium.net.urlconnection.CronetURLStreamHandlerFactory;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@JNINamespace("cronet")
public class CronetUrlRequestContext extends CronetEngineBase {
    static final String LOG_TAG = "CronetUrlRequestContext";
    private static final HashSet<String> sInUseStoragePaths = new HashSet<>();
    private final AtomicInteger mActiveRequestCount = new AtomicInteger(0);
    private TTAppInfoProvider mAppInfoProvider;
    private TTMonitorProvider mAppMonitorProvider;
    private double[] mDownstreamPacketLossRate = {-1.0d, -1.0d};
    private double[] mDownstreamPacketLossRateVariance = {-1.0d, -1.0d};
    private int mDownstreamThroughputKbps = -1;
    private int mEffectiveConnectionType = 0;
    private TTEventListener mEventListener;
    private final Object mFinishedListenerLock = new Object();
    private final Map<RequestFinishedInfo.Listener, VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap = new HashMap();
    private int[] mGroupHttpRttMs;
    private int[] mGroupTransportRttMs;
    private int mHttpRttMs = -1;
    private final String mInUseStoragePath;
    private final ConditionVariable mInitCompleted = new ConditionVariable(false);
    private boolean mIsLogging;
    public boolean mListenAppStateIndependently;
    public final Object mLock;
    private final boolean mNetworkQualityEstimatorEnabled;
    private final Object mNetworkQualityLock = new Object();
    private Thread mNetworkThread;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> mRttListenerList = new ObserverList<>();
    private volatile ConditionVariable mStopNetLogCompleted;
    private final ObserverList<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> mThroughputListenerList = new ObserverList<>();
    private int mTransportRttMs = -1;
    private double[] mUpstreamPacketLossRate = {-1.0d, -1.0d};
    private double[] mUpstreamPacketLossRateVariance = {-1.0d, -1.0d};
    public long mUrlRequestContextAdapter;
    private String[] mWatchingGroups;

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeAddClientOpaqueData(long j, String[] strArr, byte[] bArr, byte[] bArr2);

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeClearClientOpaqueData(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeControlHttpDNSConfig(long j, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i, long j, String str4, long j2, boolean z5, boolean z6, boolean z7, boolean z8, String str5, int i2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeDestroy(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeDnsLookup(long j, DnsQuery dnsQuery);

    private static native void nativeEnableBoeProxy(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeEnableTTBizHttpDns(long j, boolean z, String str, String str2, String str3, boolean z2, String str4);

    private static native byte[] nativeGetHistogramDeltas();

    private static native long[] nativeGetOpaqueFuncAddress();

    private static native void nativeInitALogFuncAddr(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeNotifySwitchToMultiNetwork(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeNotifyTNCConfigUpdated(long j, String str, String str2, String str3, String str4, String str5, String str6);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    public static native void nativePreconnectUrl(long j, String str, int i);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeProvideRTTObservations(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeProvideThroughputObservations(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeRemoveClientOpaqueData(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeReportNetDiagnosisUserLog(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetAlogFuncAddr(long j, long j2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetAppStartUpState(long j, int i);

    private static native void nativeSetBypassBOEJSON(long j, String str);

    private static native void nativeSetClientOpaqueData(long j, String[] strArr, byte[] bArr, byte[] bArr2);

    private static native void nativeSetGetDomainDefaultJSON(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetHostResolverRules(long j, String str);

    private static native int nativeSetMinLogLevel(int i);

    private static native void nativeSetOpaqueData(long j, byte[][] bArr);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeSetProxy(long j, String str);

    private static native void nativeSetProxyConfig(long j, String str);

    private static native void nativeSetStoreIdcRuleJSON(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native boolean nativeStartNetLogToFile(long j, String str, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeStopNetLog(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeTTDnsResolve(long j, String str, int i, String str2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    public static native void nativeTTUrlDispatch(long j, URLDispatch uRLDispatch, String str);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeTiggerWiFiToCellularByThirdParty(long j);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeTriggerGetDomain(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeTryStartNetDetect(long j, String[] strArr, int i, int i2);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    private native void nativeUpdateStoreRegionFromServer(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    @NativeClassQualifiedName("CronetURLRequestContextAdapter")
    public native void nativeInitRequestContextOnInitThread(long j);

    private void onColdStartFinish() {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onColdStartFinish();
        }
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public TTMpaService createTTMpaService() {
        return new TTCronetMpaService(this);
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new CronetURLStreamHandlerFactory(this);
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return nativeGetHistogramDeltas();
    }

    /* access modifiers changed from: package-private */
    public void onRequestDestroyed() {
        this.mActiveRequestCount.decrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public void onRequestStarted() {
        this.mActiveRequestCount.incrementAndGet();
    }

    public void stopNetLogCompleted() {
        this.mStopNetLogCompleted.open();
    }

    private void checkHaveAdapter() throws IllegalStateException {
        if (!haveRequestContextAdapter()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private boolean haveRequestContextAdapter() {
        if (this.mUrlRequestContextAdapter != 0) {
            return true;
        }
        return false;
    }

    private TTAppInfoProvider.AppInfo onGetAppInfo() {
        TTAppInfoProvider tTAppInfoProvider = this.mAppInfoProvider;
        if (tTAppInfoProvider != null) {
            return tTAppInfoProvider.getAppInfo();
        }
        return null;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void clearClientOpaqueData() {
        synchronized (this.mLock) {
            nativeClearClientOpaqueData(this.mUrlRequestContextAdapter);
        }
    }

    public long getUrlRequestContextAdapter() {
        long j;
        synchronized (this.mLock) {
            checkHaveAdapter();
            j = this.mUrlRequestContextAdapter;
        }
        return j;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void tiggerWiFiToCellularByThirdParty() {
        synchronized (this.mLock) {
            nativeTiggerWiFiToCellularByThirdParty(this.mUrlRequestContextAdapter);
        }
    }

    private int getLoggingLevel() {
        String str = LOG_TAG;
        if (Log.isLoggable(str, 2)) {
            return -2;
        }
        if (Log.isLoggable(str, 3)) {
            return -1;
        }
        return 3;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getDownstreamThroughputKbps() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = this.mDownstreamThroughputKbps;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getEffectiveConnectionType() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = this.mEffectiveConnectionType;
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getHttpRttMs() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = this.mHttpRttMs;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getTransportRttMs() {
        int i;
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                i = this.mTransportRttMs;
                if (i == -1) {
                    i = -1;
                }
            }
            return i;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public String getVersionString() {
        return "Cronet/" + ImplVersion.getCronetVersionWithLastChange();
    }

    /* access modifiers changed from: package-private */
    public boolean hasRequestFinishedListener() {
        boolean z;
        synchronized (this.mFinishedListenerLock) {
            if (!this.mFinishedListenerMap.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void initNetworkThread() {
        this.mNetworkThread = Thread.currentThread();
        Thread currentThread = Thread.currentThread();
        currentThread.setName("ChromiumNet" + Process.getThreadPriority(0));
        this.mEventListener.onCronetBootSucceed();
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public Map<String, int[]> getGroupRttEstimates() {
        if (this.mNetworkQualityEstimatorEnabled) {
            HashMap hashMap = new HashMap();
            synchronized (this.mNetworkQualityLock) {
                if (this.mWatchingGroups == null) {
                    return hashMap;
                }
                int i = 0;
                while (true) {
                    String[] strArr = this.mWatchingGroups;
                    if (i >= strArr.length) {
                        return hashMap;
                    }
                    hashMap.put(strArr[i], new int[]{this.mGroupTransportRttMs[i], this.mGroupHttpRttMs[i]});
                    i++;
                }
            }
        } else {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine, com.ttnet.org.chromium.net.CronetEngine
    public List<Long> getOpaqueFuncAddress() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mLock) {
            for (long j : nativeGetOpaqueFuncAddress()) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void stopNetLog() {
        synchronized (this.mLock) {
            if (this.mIsLogging) {
                checkHaveAdapter();
                this.mStopNetLogCompleted = new ConditionVariable();
                nativeStopNetLog(this.mUrlRequestContextAdapter);
                this.mIsLogging = false;
                this.mStopNetLogCompleted.block();
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void shutdown() {
        if (this.mInUseStoragePath != null) {
            HashSet<String> hashSet = sInUseStoragePaths;
            synchronized (hashSet) {
                hashSet.remove(this.mInUseStoragePath);
            }
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mActiveRequestCount.get() != 0) {
                throw new IllegalStateException("Cannot shutdown with active requests.");
            } else if (Thread.currentThread() == this.mNetworkThread) {
                throw new IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.mInitCompleted.block();
        stopNetLog();
        synchronized (this.mLock) {
            if (haveRequestContextAdapter()) {
                nativeDestroy(this.mUrlRequestContextAdapter);
                this.mUrlRequestContextAdapter = 0;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void registerAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
        this.mAppInfoProvider = tTAppInfoProvider;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void registerAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
        this.mAppMonitorProvider = tTMonitorProvider;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void registerEventListener(TTEventListener tTEventListener) {
        this.mEventListener = tTEventListener;
    }

    private void onClientIPChanged(String str) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onClientIPChanged(str);
        }
    }

    private void onTTNetDetectInfoChanged(String str) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onTTNetDetectInfoChanged(str);
        }
    }

    public boolean isNetworkThread(Thread thread) {
        if (thread == this.mNetworkThread) {
            return true;
        }
        return false;
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public double getDownstreamPacketLossRate(int i) {
        double d;
        handleProtocolException(i);
        synchronized (this.mNetworkQualityLock) {
            d = this.mUpstreamPacketLossRate[i];
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public double getDownstreamPacketLossRateVariance(int i) {
        double d;
        handleProtocolException(i);
        synchronized (this.mNetworkQualityLock) {
            d = this.mDownstreamPacketLossRateVariance[i];
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public double getUpstreamPacketLossRate(int i) {
        double d;
        handleProtocolException(i);
        synchronized (this.mNetworkQualityLock) {
            d = this.mUpstreamPacketLossRate[i];
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public double getUpstreamPacketLossRateVariance(int i) {
        double d;
        handleProtocolException(i);
        synchronized (this.mNetworkQualityLock) {
            d = this.mUpstreamPacketLossRateVariance[i];
        }
        return d;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void notifySwitchToMultiNetwork(boolean z) {
        synchronized (this.mLock) {
            nativeNotifySwitchToMultiNetwork(this.mUrlRequestContextAdapter, z);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeClientOpaqueData(String str) {
        synchronized (this.mLock) {
            nativeRemoveClientOpaqueData(this.mUrlRequestContextAdapter, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.remove(listener);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void reportNetDiagnosisUserLog(String str) {
        synchronized (this.mLock) {
            nativeReportNetDiagnosisUserLog(this.mUrlRequestContextAdapter, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine, com.ttnet.org.chromium.net.CronetEngine
    public void setAppStartUpState(int i) {
        synchronized (this.mLock) {
            nativeSetAppStartUpState(this.mUrlRequestContextAdapter, i);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine, com.ttnet.org.chromium.net.CronetEngine
    public void setHostResolverRules(String str) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeSetHostResolverRules(this.mUrlRequestContextAdapter, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void setProxy(String str) {
        synchronized (this.mLock) {
            nativeSetProxy(this.mUrlRequestContextAdapter, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void triggerGetDomain(boolean z) {
        synchronized (this.mLock) {
            nativeTriggerGetDomain(this.mUrlRequestContextAdapter, z);
        }
    }

    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.mNetworkQualityLock) {
            this.mEffectiveConnectionType = i;
            TTEventListener tTEventListener = this.mEventListener;
            if (tTEventListener != null) {
                tTEventListener.onEffectiveConnectionTypeChanged(i);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.put(listener, new VersionSafeCallbacks.RequestFinishedInfoListener(listener));
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine, com.ttnet.org.chromium.net.CronetEngine
    public List<InetAddress> dnsLookup(String str) throws IOException {
        DnsQuery dnsQuery = new DnsQuery(str);
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeDnsLookup(this.mUrlRequestContextAdapter, dnsQuery);
        }
        dnsQuery.waitResult();
        return dnsQuery.getResult();
    }

    private static int convertConnectionTypeToApiValue(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i);
                    }
                }
            }
        }
        return i2;
    }

    private void handleProtocolException(int i) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        } else if (i != 0 && i != 1) {
            throw new IllegalStateException("Error protocol: " + i);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mRttListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideRTTObservations(this.mUrlRequestContextAdapter, true);
                    }
                }
                this.mRttListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mThroughputListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideThroughputObservations(this.mUrlRequestContextAdapter, true);
                    }
                }
                this.mThroughputListenerList.addObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener));
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mRttListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener)) && this.mRttListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideRTTObservations(this.mUrlRequestContextAdapter, false);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mNetworkQualityLock) {
                if (this.mThroughputListenerList.removeObserver(new VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener)) && this.mThroughputListenerList.isEmpty()) {
                    synchronized (this.mLock) {
                        checkHaveAdapter();
                        nativeProvideThroughputObservations(this.mUrlRequestContextAdapter, false);
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r1 = (com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener) r0.next();
        postObservationTaskToExecutor(r1.getExecutor(), new com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC680406(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r0 = r1.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportRequestFinished(final com.ttnet.org.chromium.net.RequestFinishedInfo r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mFinishedListenerLock
            monitor-enter(r0)
            java.util.Map<com.ttnet.org.chromium.net.RequestFinishedInfo$Listener, com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$RequestFinishedInfoListener> r1 = r3.mFinishedListenerMap     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x000d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0037 }
            java.util.Map<com.ttnet.org.chromium.net.RequestFinishedInfo$Listener, com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$RequestFinishedInfoListener> r2 = r3.mFinishedListenerMap     // Catch:{ all -> 0x0037 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0037 }
            r1.<init>(r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r0 = r1.iterator()
        L_0x001d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$RequestFinishedInfoListener r1 = (com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener) r1
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext$6 r2 = new com.ttnet.org.chromium.net.impl.CronetUrlRequestContext$6
            r2.<init>(r1, r4)
            java.util.concurrent.Executor r1 = r1.getExecutor()
            postObservationTaskToExecutor(r1, r2)
            goto L_0x001d
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.reportRequestFinished(com.ttnet.org.chromium.net.RequestFinishedInfo):void");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine, com.ttnet.org.chromium.net.CronetEngine
    public void setAlogFuncAddr(long j) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            String str = LOG_TAG;
            Log.m264556e(str, "Set alog func addr: " + j, new Object[0]);
            nativeSetAlogFuncAddr(this.mUrlRequestContextAdapter, j);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public Map<String, String> ttUrlDispatch(String str) throws IOException {
        URLDispatch uRLDispatch = new URLDispatch(str);
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeTTUrlDispatch(this.mUrlRequestContextAdapter, uRLDispatch, str);
        }
        uRLDispatch.waitResult();
        HashMap hashMap = new HashMap();
        hashMap.put("final_url", uRLDispatch.getFinalUrl());
        hashMap.put("epoch", uRLDispatch.getEpoch());
        hashMap.put("etag", uRLDispatch.getEtag());
        return hashMap;
    }

    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        Object obj = new Object();
        this.mLock = obj;
        this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
        CronetLibraryLoader.ensureInitialized(cronetEngineBuilderImpl.getContext(), cronetEngineBuilderImpl);
        nativeSetMinLogLevel(getLoggingLevel());
        if (cronetEngineBuilderImpl.httpCacheMode() == 1) {
            String storagePath = cronetEngineBuilderImpl.storagePath();
            this.mInUseStoragePath = storagePath;
            HashSet<String> hashSet = sInUseStoragePaths;
            synchronized (hashSet) {
                if (!hashSet.add(storagePath)) {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.mInUseStoragePath = null;
        }
        this.mAppInfoProvider = cronetEngineBuilderImpl.getAppInfoProvider();
        this.mAppMonitorProvider = cronetEngineBuilderImpl.getAppMonitorProvider();
        this.mEventListener = cronetEngineBuilderImpl.getEventListener();
        this.mListenAppStateIndependently = cronetEngineBuilderImpl.getListenAppStateIndependently();
        synchronized (obj) {
            long nativeCreateRequestContextAdapter = nativeCreateRequestContextAdapter(createNativeUrlRequestContextConfig(cronetEngineBuilderImpl));
            this.mUrlRequestContextAdapter = nativeCreateRequestContextAdapter;
            if (nativeCreateRequestContextAdapter == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        CronetLibraryLoader.postToInitThread(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC680351 */

            public void run() {
                CronetLibraryLoader.ensureInitializedOnInitThread();
                PowerMonitor.setListenAppStateIndependently(CronetUrlRequestContext.this.mListenAppStateIndependently);
                PowerMonitor.create();
                synchronized (CronetUrlRequestContext.this.mLock) {
                    CronetUrlRequestContext cronetUrlRequestContext = CronetUrlRequestContext.this;
                    cronetUrlRequestContext.nativeInitRequestContextOnInitThread(cronetUrlRequestContext.mUrlRequestContextAdapter);
                }
            }
        });
    }

    public static long createNativeUrlRequestContextConfig(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str = "";
        try {
            File filesDir = cronetEngineBuilderImpl.getContext().getFilesDir();
            if (filesDir != null) {
                str = filesDir.getAbsolutePath();
            }
        } catch (Throwable unused) {
        }
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(cronetEngineBuilderImpl.getUserAgent(), cronetEngineBuilderImpl.storagePath(), cronetEngineBuilderImpl.quicEnabled(), cronetEngineBuilderImpl.getDefaultQuicUserAgentId(), cronetEngineBuilderImpl.http2Enabled(), cronetEngineBuilderImpl.brotliEnabled(), cronetEngineBuilderImpl.cacheDisabled(), cronetEngineBuilderImpl.httpCacheMode(), cronetEngineBuilderImpl.httpCacheMaxSize(), cronetEngineBuilderImpl.experimentalOptions(), cronetEngineBuilderImpl.mockCertVerifier(), cronetEngineBuilderImpl.networkQualityEstimatorEnabled(), cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled(), cronetEngineBuilderImpl.httpDnsEnabled(), cronetEngineBuilderImpl.verboseLogEnabled(), str, cronetEngineBuilderImpl.threadPriority(0));
        for (CronetEngineBuilderImpl.QuicHint quicHint : cronetEngineBuilderImpl.quicHints()) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, quicHint.mHost, quicHint.mPort, quicHint.mAlternatePort);
        }
        for (CronetEngineBuilderImpl.Pkp pkp : cronetEngineBuilderImpl.publicKeyPins()) {
            nativeAddPkp(nativeCreateRequestContextConfig, pkp.mHost, pkp.mHashes, pkp.mIncludeSubdomains, pkp.mExpirationDate.getTime());
        }
        String getDomainDefaultJSON = cronetEngineBuilderImpl.getGetDomainDefaultJSON();
        if (getDomainDefaultJSON != null) {
            nativeSetGetDomainDefaultJSON(nativeCreateRequestContextConfig, getDomainDefaultJSON);
        }
        ArrayList<byte[]> opaqueData = cronetEngineBuilderImpl.getOpaqueData();
        if (opaqueData != null && !opaqueData.isEmpty()) {
            nativeSetOpaqueData(nativeCreateRequestContextConfig, (byte[][]) opaqueData.toArray(new byte[opaqueData.size()][]));
        }
        Map<String[], Pair<byte[], byte[]>> clientOpaqueData = cronetEngineBuilderImpl.getClientOpaqueData();
        if (clientOpaqueData != null && !clientOpaqueData.isEmpty()) {
            for (Map.Entry<String[], Pair<byte[], byte[]>> entry : clientOpaqueData.entrySet()) {
                nativeSetClientOpaqueData(nativeCreateRequestContextConfig, entry.getKey(), (byte[]) entry.getValue().first, (byte[]) entry.getValue().second);
            }
        }
        String bypassBOEJSON = cronetEngineBuilderImpl.getBypassBOEJSON();
        if (bypassBOEJSON != null) {
            nativeSetBypassBOEJSON(nativeCreateRequestContextConfig, bypassBOEJSON);
        }
        String storeIdcRuleJSON = cronetEngineBuilderImpl.getStoreIdcRuleJSON();
        if (storeIdcRuleJSON != null) {
            nativeSetStoreIdcRuleJSON(nativeCreateRequestContextConfig, storeIdcRuleJSON);
        }
        String proxyConfig = cronetEngineBuilderImpl.getProxyConfig();
        if (proxyConfig != null) {
            nativeSetProxyConfig(nativeCreateRequestContextConfig, proxyConfig);
        }
        nativeEnableBoeProxy(nativeCreateRequestContextConfig, cronetEngineBuilderImpl.boeProxyEnabled());
        nativeInitALogFuncAddr(cronetEngineBuilderImpl.aLogFuncAddr());
        return nativeCreateRequestContextConfig;
    }

    private void onMultiNetworkStateChanged(int i, int i2) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onMultiNetworkStateChanged(i, i2);
        }
    }

    private void onSendAppMonitorEvent(String str, String str2) {
        TTMonitorProvider tTMonitorProvider = this.mAppMonitorProvider;
        if (tTMonitorProvider != null) {
            tTMonitorProvider.sendAppMonitorEvent(str, str2);
        }
    }

    private void onServerConfigUpdated(String str, String str2) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onServerConfigUpdated(str, str2);
        }
    }

    private void onTNCUpdateFailed(String[] strArr, String str) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onTNCUpdateFailed(strArr, str);
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener == null) {
            return null;
        }
        return tTEventListener.onCallToAddSecurityFactor(str, map);
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void preconnectUrl(String str, int i) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativePreconnectUrl(this.mUrlRequestContextAdapter, str, i);
        }
    }

    private static void postObservationTaskToExecutor(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m264556e(LOG_TAG, "Exception posting task to executor", e);
        }
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void startNetLogToFile(String str, boolean z) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (nativeStartNetLogToFile(this.mUrlRequestContextAdapter, str, z)) {
                this.mIsLogging = true;
            } else {
                throw new RuntimeException("Unable to start NetLog");
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() == Proxy.Type.DIRECT) {
            String protocol = url.getProtocol();
            if ("http".equals(protocol) || "https".equals(protocol)) {
                return new CronetHttpURLConnection(url, this);
            }
            throw new UnsupportedOperationException("Unexpected protocol:" + protocol);
        }
        throw new UnsupportedOperationException();
    }

    private void onStoreIdcChanged(String str, String str2, String str3) {
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onStoreIdcChanged(str, str2, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(str, callback, executor, this);
    }

    private void onDnsLookupComplete(final DnsQuery dnsQuery, int i, String[] strArr) {
        dnsQuery.setResult(i, strArr);
        dnsQuery.resume(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC680362 */

            public void run() {
                dnsQuery.done();
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addClientOpaqueData(String[] strArr, byte[] bArr, byte[] bArr2) {
        synchronized (this.mLock) {
            nativeAddClientOpaqueData(this.mUrlRequestContextAdapter, strArr, bArr, bArr2);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (this.mNetworkQualityEstimatorEnabled) {
            synchronized (this.mLock) {
                checkHaveAdapter();
                nativeConfigureNetworkQualityEstimatorForTesting(this.mUrlRequestContextAdapter, z, z2, z3);
            }
            return;
        }
        throw new IllegalStateException("Network quality estimator must be enabled");
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
        synchronized (this.mLock) {
            nativeControlHttpDNSConfig(this.mUrlRequestContextAdapter, z, z2, z3);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void startNetLogToDisk(String str, boolean z, int i) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            nativeStartNetLogToDisk(this.mUrlRequestContextAdapter, str, z, i);
            this.mIsLogging = true;
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void tryStartNetDetect(String[] strArr, int i, int i2) {
        synchronized (this.mLock) {
            nativeTryStartNetDetect(this.mUrlRequestContextAdapter, strArr, i, i2);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void ttDnsResolve(String str, int i, String str2) {
        synchronized (this.mLock) {
            nativeTTDnsResolve(this.mUrlRequestContextAdapter, str, i, str2);
        }
    }

    private void onRttObservation(final int i, final long j, final int i2) {
        synchronized (this.mNetworkQualityLock) {
            Iterator<VersionSafeCallbacks.NetworkQualityRttListenerWrapper> it = this.mRttListenerList.iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.NetworkQualityRttListenerWrapper next = it.next();
                postObservationTaskToExecutor(next.getExecutor(), new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC680384 */

                    public void run() {
                        next.onRttObservation(i, j, i2);
                    }
                });
            }
        }
    }

    private void onThroughputObservation(final int i, final long j, final int i2) {
        synchronized (this.mNetworkQualityLock) {
            Iterator<VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> it = this.mThroughputListenerList.iterator();
            while (it.hasNext()) {
                final VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper next = it.next();
                postObservationTaskToExecutor(next.getExecutor(), new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC680395 */

                    public void run() {
                        next.onThroughputObservation(i, j, i2);
                    }
                });
            }
        }
    }

    private void onUrlDispatchComplete(final URLDispatch uRLDispatch, String str, String str2, String str3) {
        uRLDispatch.setResult(str, str2, str3);
        uRLDispatch.resume(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.RunnableC680373 */

            public void run() {
                uRLDispatch.done();
            }
        });
    }

    private void onPacketLossComputed(int i, double d, double d2, double d3, double d4) {
        synchronized (this.mNetworkQualityLock) {
            if (i == 0 || i == 1) {
                this.mUpstreamPacketLossRate[i] = d;
                this.mUpstreamPacketLossRateVariance[i] = d2;
                this.mDownstreamPacketLossRate[i] = d3;
                this.mDownstreamPacketLossRateVariance[i] = d4;
                TTEventListener tTEventListener = this.mEventListener;
                if (tTEventListener != null) {
                    tTEventListener.onPacketLossComputed(i, d, d2, d3, d4);
                }
                return;
            }
            String str = LOG_TAG;
            Log.m264556e(str, "Error protocol from native. Protocol: " + i, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public TTNetDiagnosisRequest createNetDiagnosisRequest(TTNetDiagnosisRequest.Callback callback, Executor executor, int i, List<String> list, int i2, int i3) {
        return new TTCronetNetExpRequest(this, callback, executor, i, list, i2, i3);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, callback, executor, list, map, map2, z);
    }

    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3, String[] strArr, int[] iArr, int[] iArr2) {
        synchronized (this.mNetworkQualityLock) {
            this.mHttpRttMs = i;
            this.mTransportRttMs = i2;
            this.mDownstreamThroughputKbps = i3;
            this.mWatchingGroups = strArr;
            this.mGroupTransportRttMs = iArr;
            this.mGroupHttpRttMs = iArr2;
            TTEventListener tTEventListener = this.mEventListener;
            if (tTEventListener != null) {
                tTEventListener.onRTTOrThroughputEstimatesComputed(i, i2, i3);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        synchronized (this.mLock) {
            nativeEnableTTBizHttpDns(this.mUrlRequestContextAdapter, z, str, str2, str3, z2, str4);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) {
        synchronized (this.mLock) {
            nativeNotifyTNCConfigUpdated(this.mUrlRequestContextAdapter, str, str2, str3, str4, str5, str6);
        }
    }

    private void onTTDnsResolveResult(String str, String str2, int i, int i2, int i3, String[] strArr, String str3) {
        String str4 = LOG_TAG;
        Log.m264548d(str4, " onTTDnsResolveResult, uuid: " + str + " host: " + str2 + " ret: " + i + " ips: " + strArr.length);
        ArrayList arrayList = new ArrayList(strArr.length);
        Collections.addAll(arrayList, strArr);
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onTTDnsResolveResult(str, str2, i, i2, i3, arrayList, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void updateStoreRegionFromServer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        synchronized (this.mLock) {
            nativeUpdateStoreRegionFromServer(this.mUrlRequestContextAdapter, str, str2, str3, str4, str5, str6, str7, str8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public ExperimentalBidirectionalStream createBidirectionalStream(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, int i, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3) {
        Object obj;
        Object obj2 = this.mLock;
        synchronized (obj2) {
            try {
                checkHaveAdapter();
                obj = obj2;
                CronetBidirectionalStream cronetBidirectionalStream = new CronetBidirectionalStream(this, str, i, callback, executor, str2, list, z, collection, z2, i2, z3, i3);
                return cronetBidirectionalStream;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public UrlRequestBase createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener) {
        Object obj;
        Object obj2 = this.mLock;
        synchronized (obj2) {
            try {
                checkHaveAdapter();
                obj = obj2;
                CronetUrlRequest cronetUrlRequest = new CronetUrlRequest(this, str, i, callback, executor, collection, z, z2, z3, z4, i2, z5, i3, listener);
                return cronetUrlRequest;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return new CronetWebsocketConnection(this, callback, executor, list, i, str, j, i2, j2, str2, i3, str3, map, map2, z);
    }

    private void onContextInitCompleted(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.mInitCompleted.open();
        TTEventListener tTEventListener = this.mEventListener;
        if (tTEventListener != null) {
            tTEventListener.onContextInitCompleted(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18);
        }
    }

    private void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        TTMonitorProvider tTMonitorProvider = this.mAppMonitorProvider;
        if (tTMonitorProvider != null) {
            tTMonitorProvider.handleApiResult(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
        }
    }
}
