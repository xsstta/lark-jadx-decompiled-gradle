package com.ttnet.org.chromium.net;

import android.content.Context;
import android.util.Pair;
import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net.ExperimentalUrlRequest;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UrlRequest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public abstract class ExperimentalCronetEngine extends CronetEngine {
    public void addClientOpaqueData(String[] strArr, byte[] bArr, byte[] bArr2) {
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void clearClientOpaqueData() {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public List<InetAddress> dnsLookup(String str) throws IOException {
        return null;
    }

    public void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
    }

    public double getDownstreamPacketLossRate(int i) {
        return -1.0d;
    }

    public double getDownstreamPacketLossRateVariance(int i) {
        return -1.0d;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public int getHttpRttMs() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public List<Long> getOpaqueFuncAddress() {
        return null;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public double getUpstreamPacketLossRate(int i) {
        return -1.0d;
    }

    public double getUpstreamPacketLossRateVariance(int i) {
        return -1.0d;
    }

    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public void notifySwitchToMultiNetwork(boolean z) {
    }

    public void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void preconnectUrl(String str, int i) {
    }

    public void registerAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
    }

    public void registerAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
    }

    public void registerEventListener(TTEventListener tTEventListener) {
    }

    public void removeClientOpaqueData(String str) {
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void reportNetDiagnosisUserLog(String str) {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void setAlogFuncAddr(long j) {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void setAppStartUpState(int i) {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void setHostResolverRules(String str) {
    }

    public void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) {
    }

    public void setProxy(String str) {
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
    }

    public void tiggerWiFiToCellularByThirdParty() {
    }

    public void triggerGetDomain(boolean z) {
    }

    public void tryStartNetDetect(String[] strArr, int i, int i2) {
    }

    public void ttDnsResolve(String str, int i, String str2) {
    }

    public Map<String, String> ttUrlDispatch(String str) throws IOException {
        return null;
    }

    public void updateStoreRegionFromServer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
    }

    public static class Builder extends CronetEngine.Builder {
        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableSdch(boolean z) {
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableVerboseLog() {
            super.enableVerboseLog();
            return this;
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder(Context context) {
            super(context);
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableBoeProxy(boolean z) {
            super.enableBoeProxy(z);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableHttpDns(boolean z) {
            super.enableHttpDns(z);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder listenAppStateIndependently(boolean z) {
            super.listenAppStateIndependently(z);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setALogFuncAddr(long j) {
            super.setALogFuncAddr(j);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
            super.setAppInfoProvider(tTAppInfoProvider);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
            super.setAppMonitorProvider(tTMonitorProvider);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setBypassBOEJSON(String str) {
            super.setBypassBOEJSON(str);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setClientOpaqueData(Map<String[], Pair<byte[], byte[]>> map) {
            super.setClientOpaqueData(map);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setEventListener(TTEventListener tTEventListener) {
            super.setEventListener(tTEventListener);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setGetDomainDefaultJSON(String str) {
            super.setGetDomainDefaultJSON(str);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setOpaqueData(ArrayList<byte[]> arrayList) {
            super.setOpaqueData(arrayList);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setProxyConfig(String str) {
            super.setProxyConfig(str);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setStoreIdcRuleJSON(String str) {
            super.setStoreIdcRuleJSON(str);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public Builder setExperimentalOptions(String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder
        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }
    }

    public Map<String, int[]> getGroupRttEstimates() {
        return new HashMap();
    }

    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }
}
