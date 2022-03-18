package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.NetworkQualityRttListener;
import com.ttnet.org.chromium.net.NetworkQualityThroughputListener;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public class VersionSafeCallbacks {

    public static final class NetworkQualityRttListenerWrapper extends NetworkQualityRttListener {
        private final NetworkQualityRttListener mWrappedListener;

        @Override // com.ttnet.org.chromium.net.NetworkQualityRttListener
        public Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        public NetworkQualityRttListenerWrapper(NetworkQualityRttListener networkQualityRttListener) {
            super(networkQualityRttListener.getExecutor());
            this.mWrappedListener = networkQualityRttListener;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof NetworkQualityRttListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((NetworkQualityRttListenerWrapper) obj).mWrappedListener);
        }

        @Override // com.ttnet.org.chromium.net.NetworkQualityRttListener
        public void onRttObservation(int i, long j, int i2) {
            this.mWrappedListener.onRttObservation(i, j, i2);
        }
    }

    public static final class NetworkQualityThroughputListenerWrapper extends NetworkQualityThroughputListener {
        private final NetworkQualityThroughputListener mWrappedListener;

        @Override // com.ttnet.org.chromium.net.NetworkQualityThroughputListener
        public Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        public int hashCode() {
            return this.mWrappedListener.hashCode();
        }

        public NetworkQualityThroughputListenerWrapper(NetworkQualityThroughputListener networkQualityThroughputListener) {
            super(networkQualityThroughputListener.getExecutor());
            this.mWrappedListener = networkQualityThroughputListener;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof NetworkQualityThroughputListenerWrapper)) {
                return false;
            }
            return this.mWrappedListener.equals(((NetworkQualityThroughputListenerWrapper) obj).mWrappedListener);
        }

        @Override // com.ttnet.org.chromium.net.NetworkQualityThroughputListener
        public void onThroughputObservation(int i, long j, int i2) {
            this.mWrappedListener.onThroughputObservation(i, j, i2);
        }
    }

    public static final class RequestFinishedInfoListener extends RequestFinishedInfo.Listener {
        private final RequestFinishedInfo.Listener mWrappedListener;

        @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Listener
        public Executor getExecutor() {
            return this.mWrappedListener.getExecutor();
        }

        @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Listener
        public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
            this.mWrappedListener.onRequestFinished(requestFinishedInfo);
        }

        public RequestFinishedInfoListener(RequestFinishedInfo.Listener listener) {
            super(listener.getExecutor());
            this.mWrappedListener = listener;
        }
    }

    public static final class UploadDataProviderWrapper extends UploadDataProvider {
        private final UploadDataProvider mWrappedProvider;

        @Override // java.io.Closeable, com.ttnet.org.chromium.net.UploadDataProvider, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mWrappedProvider.close();
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return this.mWrappedProvider.getLength();
        }

        public UploadDataProviderWrapper(UploadDataProvider uploadDataProvider) {
            this.mWrappedProvider = uploadDataProvider;
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            this.mWrappedProvider.rewind(uploadDataSink);
        }

        @Override // com.ttnet.org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            this.mWrappedProvider.read(uploadDataSink, byteBuffer);
        }
    }

    public static final class BidirectionalStreamCallback extends BidirectionalStream.Callback {
        private final BidirectionalStream.Callback mWrappedCallback;

        public BidirectionalStreamCallback(BidirectionalStream.Callback callback) {
            this.mWrappedCallback = callback;
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onStreamReady(BidirectionalStream bidirectionalStream) {
            this.mWrappedCallback.onStreamReady(bidirectionalStream);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onCanceled(bidirectionalStream, urlResponseInfo);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onSucceeded(bidirectionalStream, urlResponseInfo);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.mWrappedCallback.onFailed(bidirectionalStream, urlResponseInfo, cronetException);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
            this.mWrappedCallback.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, headerBlock);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
            this.mWrappedCallback.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }

        @Override // com.ttnet.org.chromium.net.BidirectionalStream.Callback
        public void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
            this.mWrappedCallback.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, z);
        }
    }

    public static final class LibraryLoader extends CronetEngine.Builder.LibraryLoader {
        private final CronetEngine.Builder.LibraryLoader mWrappedLoader;

        public LibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mWrappedLoader = libraryLoader;
        }

        @Override // com.ttnet.org.chromium.net.CronetEngine.Builder.LibraryLoader
        public void loadLibrary(String str) {
            this.mWrappedLoader.loadLibrary(str);
        }
    }

    public static final class UrlRequestCallback extends UrlRequest.Callback {
        private final UrlRequest.Callback mWrappedCallback;

        public UrlRequestCallback(UrlRequest.Callback callback) {
            this.mWrappedCallback = callback;
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onCanceled(urlRequest, urlResponseInfo);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onMetricsCollected(UrlRequest urlRequest, RequestFinishedInfo requestFinishedInfo) {
            this.mWrappedCallback.onMetricsCollected(urlRequest, requestFinishedInfo);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onRequestLogCollected(String str, RequestFinishedInfo requestFinishedInfo) {
            this.mWrappedCallback.onRequestLogCollected(str, requestFinishedInfo);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            this.mWrappedCallback.onSucceeded(urlRequest, urlResponseInfo);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            this.mWrappedCallback.onFailed(urlRequest, urlResponseInfo, cronetException);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
            this.mWrappedCallback.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
            this.mWrappedCallback.onRedirectReceived(urlRequest, urlResponseInfo, str);
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
            this.mWrappedCallback.onResponseStarted(urlRequest, urlResponseInfo, str);
        }
    }

    public static final class UrlRequestStatusListener extends UrlRequest.StatusListener {
        private final UrlRequest.StatusListener mWrappedListener;

        public UrlRequestStatusListener(UrlRequest.StatusListener statusListener) {
            this.mWrappedListener = statusListener;
        }

        @Override // com.ttnet.org.chromium.net.UrlRequest.StatusListener
        public void onStatus(int i) {
            this.mWrappedListener.onStatus(i);
        }
    }
}
