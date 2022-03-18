package com.ttnet.org.chromium.net.impl;

import android.os.Process;
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
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class JavaCronetEngine extends CronetEngineBase {
    private final ExecutorService mExecutorService;
    private final String mUserAgent;

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public TTNetDiagnosisRequest createNetDiagnosisRequest(TTNetDiagnosisRequest.Callback callback, Executor executor, int i, List<String> list, int i2, int i3) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public TTMpaService createTTMpaService() {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public TTWebsocketConnection createWebsocketConnection(TTWebsocketConnection.Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getEffectiveConnectionType() {
        return 0;
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getHttpRttMs() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public int getTransportRttMs() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void registerAppInfoProvider(TTAppInfoProvider tTAppInfoProvider) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void registerAppMonitorProvider(TTMonitorProvider tTMonitorProvider) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void registerEventListener(TTEventListener tTEventListener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public void startNetLogToDisk(String str, boolean z, int i) {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void startNetLogToFile(String str, boolean z) {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void stopNetLog() {
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new URLStreamHandlerFactory() {
            /* class com.ttnet.org.chromium.net.impl.JavaCronetEngine.C680482 */

            public URLStreamHandler createURLStreamHandler(String str) {
                return null;
            }
        };
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public void shutdown() {
        this.mExecutorService.shutdown();
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public String getVersionString() {
        return "CronetHttpURLConnection/" + ImplVersion.getCronetVersionWithLastChange();
    }

    @Override // com.ttnet.org.chromium.net.CronetEngine
    public URLConnection openConnection(URL url) throws IOException {
        return url.openConnection();
    }

    public JavaCronetEngine(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        final int threadPriority = cronetEngineBuilderImpl.threadPriority(9);
        this.mUserAgent = cronetEngineBuilderImpl.getUserAgent();
        this.mExecutorService = new ThreadPoolExecutor(10, 20, 50, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {
            /* class com.ttnet.org.chromium.net.impl.JavaCronetEngine.ThreadFactoryC680461 */

            public Thread newThread(final Runnable runnable) {
                return Executors.defaultThreadFactory().newThread(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.JavaCronetEngine.ThreadFactoryC680461.RunnableC680471 */

                    public void run() {
                        Thread.currentThread().setName("JavaCronetEngine");
                        Process.setThreadPriority(threadPriority);
                        runnable.run();
                    }
                });
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        return url.openConnection(proxy);
    }

    @Override // com.ttnet.org.chromium.net.ExperimentalCronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public ExperimentalBidirectionalStream createBidirectionalStream(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, int i, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBase
    public UrlRequestBase createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener) {
        return new JavaUrlRequest(callback, this.mExecutorService, executor, str, this.mUserAgent, z3, z4, i2, z5, i3);
    }
}
