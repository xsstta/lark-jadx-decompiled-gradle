package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.InlineExecutionProhibitedException;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@JNINamespace("cronet")
public final class CronetUrlRequest extends UrlRequestBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mAllowDirectExecutor;
    public final VersionSafeCallbacks.UrlRequestCallback mCallback;
    private String mCronetMapKey;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private CronetException mException;
    private final Executor mExecutor;
    private int mFinishedReason;
    private String mInitialMethod;
    private final String mInitialUrl;
    private CronetMetrics mMetrics;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    public final VersionSafeCallbacks.RequestFinishedInfoListener mRequestFinishedListener;
    private int mRequestFlag;
    private final HeadersList mRequestHeaders;
    private String mRequestLog;
    private int mRequestTimeout;
    public UrlResponseInfoImpl mResponseInfo;
    private int mSocketConnectTimeout;
    private int mSocketReadTimeout;
    private int mSocketWriteTimeout;
    private boolean mStarted;
    private long mThrottleNetSpeed;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    public CronetUploadDataStream mUploadDataStream;
    private final List<String> mUrlChain;
    public long mUrlRequestAdapter;
    public final Object mUrlRequestAdapterLock = new Object();
    public boolean mWaitingOnRead;
    public boolean mWaitingOnRedirect;

    private static int convertRequestPriority(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 4 ? 4 : 5;
        }
        return 3;
    }

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeAbortWhenUploadException(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeAddRequestCookieHeader(long j, String str, String str2);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native boolean nativeAddRequestHeader(long j, String str, String str2);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeAppTimeout(long j);

    private native long nativeCreateRequestAdapter(long j, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeDestroy(long j, boolean z);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeFollowDeferredRedirect(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeGetStatus(long j, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeRemoveRequestCookieHeader(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native boolean nativeSetHttpMethod(long j, String str);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeSetRequestTimeout(long j, int i);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeSetSocketTimeout(long j, int i, int i2, int i3);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeSetThrottleNetSpeed(long j, long j2);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeStart(long j);

    @NativeClassQualifiedName("CronetURLRequestAdapter")
    private native void nativeStopRedirect(long j);

    /* access modifiers changed from: private */
    public static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
        private HeadersList() {
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public String getRequestLog() {
        return this.mRequestLog;
    }

    private void onCanceled() {
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680327 */

            public void run() {
                try {
                    VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    urlRequestCallback.onCanceled(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    CronetUrlRequest.this.maybeReportMetrics();
                } catch (Exception e) {
                    Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", e);
                }
            }
        });
    }

    public long getUrlRequestAdapterForTesting() {
        long j;
        synchronized (this.mUrlRequestAdapterLock) {
            j = this.mUrlRequestAdapter;
        }
        return j;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mUrlRequestAdapterLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    public boolean isDoneLocked() {
        if (!this.mStarted || this.mUrlRequestAdapter != 0) {
            return false;
        }
        return true;
    }

    public void startInternalLocked() {
        String str = this.mCronetMapKey;
        if (str != null) {
            CronetUrlRequestMapping.AddRequest(str, this);
        }
        nativeStart(this.mUrlRequestAdapter);
    }

    private void checkNotStarted() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mStarted || isDoneLocked()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    private RequestFinishedInfo getRequestFinishedInfo() {
        return new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException);
    }

    private void onNativeAdapterDestroyed() {
        synchronized (this.mUrlRequestAdapterLock) {
            Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
            if (this.mException != null) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void RemoveRequestCookieHeader() {
        synchronized (this.mUrlRequestAdapterLock) {
            long j = this.mUrlRequestAdapter;
            if (j != 0) {
                nativeRemoveRequestCookieHeader(j);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void appTimeout() {
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        synchronized (this.mUrlRequestAdapterLock) {
            long j = this.mUrlRequestAdapter;
            if (j != 0) {
                nativeAppTimeout(j);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void cancel() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!isDoneLocked()) {
                if (this.mStarted) {
                    destroyRequestAdapterLocked(2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void checkCallingThread() {
        if (!this.mAllowDirectExecutor && this.mRequestContext.isNetworkThread(Thread.currentThread())) {
            throw new InlineExecutionProhibitedException();
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void stopRedirect() {
        synchronized (this.mUrlRequestAdapterLock) {
            long j = this.mUrlRequestAdapter;
            if (j != 0) {
                nativeStopRedirect(j);
            }
        }
    }

    private final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;

        public void run() {
            CronetUrlRequest.this.checkCallingThread();
            ByteBuffer byteBuffer = this.mByteBuffer;
            this.mByteBuffer = null;
            try {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.mWaitingOnRead = true;
                        VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                        urlRequestCallback.onReadCompleted(cronetUrlRequest, cronetUrlRequest.mResponseInfo, byteBuffer);
                    }
                }
            } catch (Exception e) {
                CronetUrlRequest.this.onCallbackException(e);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void followRedirect() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mWaitingOnRedirect) {
                this.mWaitingOnRedirect = false;
                if (!isDoneLocked()) {
                    nativeFollowDeferredRedirect(this.mUrlRequestAdapter);
                    return;
                }
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    public void maybeReportMetrics() {
        CronetMetrics cronetMetrics = this.mMetrics;
        if (cronetMetrics != null) {
            final RequestFinishedInfoImpl requestFinishedInfoImpl = new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, cronetMetrics, this.mFinishedReason, this.mResponseInfo, this.mException);
            this.mRequestContext.reportRequestFinished(requestFinishedInfoImpl);
            VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener = this.mRequestFinishedListener;
            if (requestFinishedInfoListener != null) {
                try {
                    requestFinishedInfoListener.getExecutor().execute(new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.AnonymousClass10 */

                        public void run() {
                            CronetUrlRequest.this.mRequestFinishedListener.onRequestFinished(requestFinishedInfoImpl);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[Catch:{ RuntimeException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[Catch:{ RuntimeException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113 A[Catch:{ RuntimeException -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    @Override // com.ttnet.org.chromium.net.UrlRequest
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequest.start():void");
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void setRequestFlag(int i) {
        this.mRequestFlag = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setRequestTimeout(int i) {
        this.mRequestTimeout = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
    }

    public void setOnDestroyedUploadCallbackForTesting(Runnable runnable) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(runnable);
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setHttpMethod(String str) {
        checkNotStarted();
        Objects.requireNonNull(str, "Method is required.");
        this.mInitialMethod = str;
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mOnDestroyedCallbackForTesting = runnable;
        }
    }

    private void onSucceeded(long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680316 */

            public void run() {
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.destroyRequestAdapterLocked(0);
                        try {
                            VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            urlRequestCallback.onSucceeded(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                            CronetUrlRequest.this.maybeReportMetrics();
                        } catch (Exception e) {
                            Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", e);
                        }
                    }
                }
            }
        });
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
            failWithException(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    public void destroyRequestAdapterLocked(int i) {
        boolean z;
        this.mFinishedReason = i;
        if (this.mUrlRequestAdapter != 0) {
            this.mRequestContext.onRequestDestroyed();
            long j = this.mUrlRequestAdapter;
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            nativeDestroy(j, z);
            this.mUrlRequestAdapter = 0;
        }
    }

    public void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", exc);
        failWithException(callbackExceptionImpl);
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void setThrottleNetSpeed(long j) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mThrottleNetSpeed = j;
            long j2 = this.mUrlRequestAdapter;
            if (j2 != 0) {
                nativeSetThrottleNetSpeed(j2, j);
            }
        }
    }

    private void failWithException(final CronetException cronetException) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!isDoneLocked()) {
                this.mException = cronetException;
                destroyRequestAdapterLocked(1);
                try {
                    this.mExecutor.execute(new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680283 */

                        public void run() {
                            try {
                                VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                urlRequestCallback.onFailed(cronetUrlRequest, cronetUrlRequest.mResponseInfo, cronetException);
                                CronetUrlRequest.this.maybeReportMetrics();
                            } catch (Exception e) {
                                Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in onFailed method", e);
                            }
                        }
                    });
                } catch (RejectedExecutionException e) {
                    Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
                }
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener statusListener) {
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(statusListener);
        synchronized (this.mUrlRequestAdapterLock) {
            long j = this.mUrlRequestAdapter;
            if (j != 0) {
                nativeGetStatus(j, urlRequestStatusListener);
            } else {
                postTaskToExecutor(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680272 */

                    public void run() {
                        urlRequestStatusListener.onStatus(-1);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onUploadException(Throwable th) {
        Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in upload method", th);
        synchronized (this.mUrlRequestAdapterLock) {
            long j = this.mUrlRequestAdapter;
            if (j != 0) {
                nativeAbortWhenUploadException(j);
            }
        }
    }

    private int mapUrlRequestErrorToApiErrorCode(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                String str = CronetUrlRequestContext.LOG_TAG;
                Log.m264556e(str, "Unknown error code: " + i, new Object[0]);
                return i;
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void read(ByteBuffer byteBuffer) {
        Preconditions.checkHasRemaining(byteBuffer);
        Preconditions.checkDirect(byteBuffer);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mWaitingOnRead) {
                this.mWaitingOnRead = false;
                if (!isDoneLocked()) {
                    if (!nativeReadData(this.mUrlRequestAdapter, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                        this.mWaitingOnRead = true;
                        throw new IllegalArgumentException("Unable to call native read");
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    private void onStatus(final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i) {
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680338 */

            public void run() {
                urlRequestStatusListener.onStatus(UrlRequestBase.convertLoadState(i));
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void AddRequestCookieHeader(String str, String str2) {
        synchronized (this.mUrlRequestAdapterLock) {
            long j = this.mUrlRequestAdapter;
            if (j != 0) {
                nativeAddRequestCookieHeader(j, str, str2);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void addHeader(String str, String str2) {
        checkNotStarted();
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.mRequestHeaders.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        if (this.mInitialMethod == null) {
            this.mInitialMethod = "POST";
        }
        this.mUploadDataStream = new CronetUploadDataStream(uploadDataProvider, executor, this);
    }

    private String[] addSecurityFactor(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            hashMap.put(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]);
        }
        Map<String, String> onCallToAddSecurityFactor = this.mRequestContext.onCallToAddSecurityFactor(str, hashMap);
        if (onCallToAddSecurityFactor == null) {
            return null;
        }
        String[] strArr2 = new String[(onCallToAddSecurityFactor.size() * 2)];
        for (Map.Entry<String, String> entry : onCallToAddSecurityFactor.entrySet()) {
            strArr2[i] = entry.getKey();
            strArr2[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr2;
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.mOnReadCompletedTask == null) {
                this.mOnReadCompletedTask = new OnReadCompletedRunnable();
            }
            byteBuffer.position(i2 + i);
            this.mOnReadCompletedTask.mByteBuffer = byteBuffer;
            postTaskToExecutor(this.mOnReadCompletedTask);
            return;
        }
        failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j);
        }
        CronetUrlRequestMapping.RemoveRequest(this.mCronetMapKey);
        if (i == 10 || i == 3) {
            failWithException(new QuicExceptionImpl("Exception in CronetUrlRequest: " + str, i, i2, i3));
            return;
        }
        int mapUrlRequestErrorToApiErrorCode = mapUrlRequestErrorToApiErrorCode(i);
        failWithException(new NetworkExceptionImpl("Exception in CronetUrlRequest: " + str, mapUrlRequestErrorToApiErrorCode, i2));
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        HeadersList headersList = new HeadersList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new UrlResponseInfoImpl(new ArrayList(this.mUrlChain), i, str, headersList, z, str2, str3, j);
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j, final String str4) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, z, str2, str3, j);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680305 */

            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.mWaitingOnRead = true;
                        try {
                            VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = CronetUrlRequest.this.mCallback;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            urlRequestCallback.onResponseStarted(cronetUrlRequest, cronetUrlRequest.mResponseInfo, str4);
                        } catch (Exception e) {
                            CronetUrlRequest.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        final UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(i, str2, strArr, z, str3, str4, j);
        this.mUrlChain.add(str);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680294 */

            public void run() {
                CronetUrlRequest.this.checkCallingThread();
                synchronized (CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (!CronetUrlRequest.this.isDoneLocked()) {
                        CronetUrlRequest.this.mWaitingOnRedirect = true;
                        try {
                            CronetUrlRequest.this.mCallback.onRedirectReceived(CronetUrlRequest.this, prepareResponseInfoOnNetworkThread, str);
                        } catch (Exception e) {
                            CronetUrlRequest.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, UrlRequest.Callback callback, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener) {
        ArrayList arrayList = new ArrayList();
        this.mUrlChain = arrayList;
        VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener = null;
        this.mRequestHeaders = new HeadersList();
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(callback, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        this.mAllowDirectExecutor = z3;
        this.mRequestContext = cronetUrlRequestContext;
        this.mInitialUrl = str;
        arrayList.add(str);
        this.mPriority = convertRequestPriority(i);
        this.mCallback = new VersionSafeCallbacks.UrlRequestCallback(callback);
        this.mExecutor = executor;
        this.mRequestAnnotations = collection;
        this.mDisableCache = z;
        this.mDisableConnectionMigration = z2;
        this.mTrafficStatsTagSet = z4;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z5;
        this.mTrafficStatsUid = i3;
        this.mRequestFinishedListener = listener != null ? new VersionSafeCallbacks.RequestFinishedInfoListener(listener) : requestFinishedInfoListener;
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, long j16, String str, long j17, long j18, String str2, String str3, String str4) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mMetrics == null) {
                this.mMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, j16, str, j17, j18, str2, str3);
                this.mRequestLog = str4;
                this.mCallback.onRequestLogCollected(str4, getRequestFinishedInfo());
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
        final RequestFinishedInfo requestFinishedInfo = getRequestFinishedInfo();
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC680349 */

            public void run() {
                try {
                    CronetUrlRequest.this.mCallback.onMetricsCollected(CronetUrlRequest.this, requestFinishedInfo);
                } catch (Exception e) {
                    Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in onMetricsCollected method", e);
                }
            }
        });
        this.mRequestContext.reportRequestFinished(requestFinishedInfo);
    }
}
