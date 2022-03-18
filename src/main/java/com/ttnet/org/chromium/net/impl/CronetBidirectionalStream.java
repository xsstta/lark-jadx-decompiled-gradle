package com.ttnet.org.chromium.net.impl;

import com.huawei.hms.framework.common.ContainerUtils;
import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.impl.UrlResponseInfoImpl;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@JNINamespace("cronet")
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final VersionSafeCallbacks.BidirectionalStreamCallback mCallback;
    private final boolean mDelayRequestHeadersUntilFirstFlush;
    private boolean mEndOfStreamWritten;
    private CronetException mException;
    private final Executor mExecutor;
    private LinkedList<ByteBuffer> mFlushData;
    public final String mInitialMethod;
    private final int mInitialPriority;
    private final String mInitialUrl;
    private RequestFinishedInfo.Metrics mMetrics;
    private long mNativeStream;
    public final Object mNativeStreamLock = new Object();
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private LinkedList<ByteBuffer> mPendingData;
    public int mReadState = 0;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final String[] mRequestHeaders;
    public boolean mRequestHeadersSent;
    public UrlResponseInfoImpl mResponseInfo;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    public int mWriteState = 0;

    @Retention(RetentionPolicy.SOURCE)
    private @interface State {
    }

    private native long nativeCreateBidirectionalStream(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native void nativeDestroy(long j, boolean z);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native void nativeSendRequestHeaders(long j);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    @NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    private void onCanceled() {
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC680204 */

            public void run() {
                try {
                    VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                    CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                } catch (Exception e) {
                    Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", e);
                }
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mNativeStreamLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    public boolean isDoneLocked() {
        if (this.mReadState == 0 || this.mNativeStream != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream
    public void cancel() {
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked()) {
                if (this.mReadState != 0) {
                    this.mWriteState = 5;
                    this.mReadState = 5;
                    destroyNativeStreamLocked(true);
                }
            }
        }
    }

    public List<ByteBuffer> getFlushDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new LinkedList();
            Iterator<ByteBuffer> it = this.mFlushData.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    public List<ByteBuffer> getPendingDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new LinkedList();
            Iterator<ByteBuffer> it = this.mPendingData.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    public void maybeOnSucceededOnExecutor() {
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked()) {
                if (this.mWriteState == 10) {
                    if (this.mReadState == 4) {
                        this.mWriteState = 7;
                        this.mReadState = 7;
                        destroyNativeStreamLocked(false);
                        try {
                            this.mCallback.onSucceeded(this, this.mResponseInfo);
                        } catch (Exception e) {
                            Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", e);
                        }
                    }
                }
            }
        }
    }

    private final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;
        boolean mEndOfStream;

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
            r1 = r6.this$0.mCallback;
            r2 = r6.this$0;
            r1.onReadCompleted(r2, r2.mResponseInfo, r0, r6.mEndOfStream);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
            if (r3 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            r6.this$0.maybeOnSucceededOnExecutor();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.nio.ByteBuffer r0 = r6.mByteBuffer     // Catch:{ Exception -> 0x0047 }
                r1 = 0
                r6.mByteBuffer = r1     // Catch:{ Exception -> 0x0047 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0047 }
                java.lang.Object r1 = r1.mNativeStreamLock     // Catch:{ Exception -> 0x0047 }
                monitor-enter(r1)     // Catch:{ Exception -> 0x0047 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0044 }
                boolean r2 = r2.isDoneLocked()     // Catch:{ all -> 0x0044 }
                if (r2 == 0) goto L_0x0014
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                return
            L_0x0014:
                boolean r2 = r6.mEndOfStream     // Catch:{ all -> 0x0044 }
                r3 = 0
                if (r2 == 0) goto L_0x0029
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0044 }
                r4 = 4
                r2.mReadState = r4     // Catch:{ all -> 0x0044 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0044 }
                int r2 = r2.mWriteState     // Catch:{ all -> 0x0044 }
                r4 = 10
                if (r2 != r4) goto L_0x002e
                r2 = 1
                r3 = 1
                goto L_0x002e
            L_0x0029:
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x0044 }
                r4 = 2
                r2.mReadState = r4     // Catch:{ all -> 0x0044 }
            L_0x002e:
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r1 = r1.mCallback
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                com.ttnet.org.chromium.net.impl.UrlResponseInfoImpl r4 = r2.mResponseInfo
                boolean r5 = r6.mEndOfStream
                r1.onReadCompleted(r2, r4, r0, r5)
                if (r3 == 0) goto L_0x004d
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0.maybeOnSucceededOnExecutor()
                goto L_0x004d
            L_0x0044:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0047:
                r0 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r1.onCallbackException(r0)
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.OnReadCompletedRunnable.run():void");
        }

        private OnReadCompletedRunnable() {
        }
    }

    private final class OnWriteCompletedRunnable implements Runnable {
        private ByteBuffer mByteBuffer;
        private final boolean mEndOfStream;

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r1 = r6.this$0.mCallback;
            r2 = r6.this$0;
            r1.onWriteCompleted(r2, r2.mResponseInfo, r0, r6.mEndOfStream);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
            if (r3 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
            r6.this$0.maybeOnSucceededOnExecutor();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.nio.ByteBuffer r0 = r6.mByteBuffer     // Catch:{ Exception -> 0x0041 }
                r1 = 0
                r6.mByteBuffer = r1     // Catch:{ Exception -> 0x0041 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0041 }
                java.lang.Object r1 = r1.mNativeStreamLock     // Catch:{ Exception -> 0x0041 }
                monitor-enter(r1)     // Catch:{ Exception -> 0x0041 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x003e }
                boolean r2 = r2.isDoneLocked()     // Catch:{ all -> 0x003e }
                if (r2 == 0) goto L_0x0014
                monitor-exit(r1)     // Catch:{ all -> 0x003e }
                return
            L_0x0014:
                boolean r2 = r6.mEndOfStream     // Catch:{ all -> 0x003e }
                r3 = 0
                if (r2 == 0) goto L_0x0028
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x003e }
                r4 = 10
                r2.mWriteState = r4     // Catch:{ all -> 0x003e }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x003e }
                int r2 = r2.mReadState     // Catch:{ all -> 0x003e }
                r4 = 4
                if (r2 != r4) goto L_0x0028
                r2 = 1
                r3 = 1
            L_0x0028:
                monitor-exit(r1)     // Catch:{ all -> 0x003e }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$BidirectionalStreamCallback r1 = r1.mCallback
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r2 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                com.ttnet.org.chromium.net.impl.UrlResponseInfoImpl r4 = r2.mResponseInfo
                boolean r5 = r6.mEndOfStream
                r1.onWriteCompleted(r2, r4, r0, r5)
                if (r3 == 0) goto L_0x0047
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0.maybeOnSucceededOnExecutor()
                goto L_0x0047
            L_0x003e:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0041:
                r0 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r1.onCallbackException(r0)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable.run():void");
        }

        OnWriteCompletedRunnable(ByteBuffer byteBuffer, boolean z) {
            this.mByteBuffer = byteBuffer;
            this.mEndOfStream = z;
        }
    }

    private void sendFlushDataLocked() {
        boolean z;
        int size = this.mFlushData.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer poll = this.mFlushData.poll();
            byteBufferArr[i] = poll;
            iArr[i] = poll.position();
            iArr2[i] = poll.limit();
        }
        this.mWriteState = 9;
        this.mRequestHeadersSent = true;
        long j = this.mNativeStream;
        if (!this.mEndOfStreamWritten || !this.mPendingData.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!nativeWritevData(j, byteBufferArr, iArr, iArr2, z)) {
            this.mWriteState = 8;
            throw new IllegalArgumentException("Unable to call native writev.");
        }
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream
    public void flush() {
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked()) {
                int i = this.mWriteState;
                if (i == 8 || i == 9) {
                    if (!this.mPendingData.isEmpty() || !this.mFlushData.isEmpty()) {
                        if (!this.mPendingData.isEmpty()) {
                            this.mFlushData.addAll(this.mPendingData);
                            this.mPendingData.clear();
                        }
                        if (this.mWriteState != 9) {
                            sendFlushDataLocked();
                            return;
                        }
                        return;
                    }
                    if (!this.mRequestHeadersSent) {
                        this.mRequestHeadersSent = true;
                        nativeSendRequestHeaders(this.mNativeStream);
                        if (!doesMethodAllowWriteData(this.mInitialMethod)) {
                            this.mWriteState = 10;
                        }
                    }
                }
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream
    public void start() {
        boolean z;
        boolean z2;
        synchronized (this.mNativeStreamLock) {
            if (this.mReadState == 0) {
                try {
                    long urlRequestContextAdapter = this.mRequestContext.getUrlRequestContextAdapter();
                    if (!this.mDelayRequestHeadersUntilFirstFlush) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mNativeStream = nativeCreateBidirectionalStream(urlRequestContextAdapter, z, this.mRequestContext.hasRequestFinishedListener(), this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid);
                    this.mRequestContext.onRequestStarted();
                    long j = this.mNativeStream;
                    String str = this.mInitialUrl;
                    int i = this.mInitialPriority;
                    String str2 = this.mInitialMethod;
                    String[] strArr = this.mRequestHeaders;
                    if (!doesMethodAllowWriteData(str2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int nativeStart = nativeStart(j, str, i, str2, strArr, z2);
                    if (nativeStart == -1) {
                        throw new IllegalArgumentException("Invalid http method " + this.mInitialMethod);
                    } else if (nativeStart <= 0) {
                        this.mWriteState = 1;
                        this.mReadState = 1;
                    } else {
                        int i2 = nativeStart - 1;
                        throw new IllegalArgumentException("Invalid header " + this.mRequestHeaders[i2] + ContainerUtils.KEY_VALUE_DELIMITER + this.mRequestHeaders[i2 + 1]);
                    }
                } catch (RuntimeException e) {
                    destroyNativeStreamLocked(false);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Stream is already started.");
            }
        }
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    private void failWithException(final CronetException cronetException) {
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC680215 */

            public void run() {
                CronetBidirectionalStream.this.failWithExceptionOnExecutor(cronetException);
            }
        });
    }

    private void onStreamReady(final boolean z) {
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC680171 */

            public void run() {
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (!CronetBidirectionalStream.this.isDoneLocked()) {
                        CronetBidirectionalStream.this.mRequestHeadersSent = z;
                        CronetBidirectionalStream.this.mReadState = 2;
                        if (CronetBidirectionalStream.doesMethodAllowWriteData(CronetBidirectionalStream.this.mInitialMethod) || !CronetBidirectionalStream.this.mRequestHeadersSent) {
                            CronetBidirectionalStream.this.mWriteState = 8;
                        } else {
                            CronetBidirectionalStream.this.mWriteState = 10;
                        }
                        try {
                            CronetBidirectionalStream.this.mCallback.onStreamReady(CronetBidirectionalStream.this);
                        } catch (Exception e) {
                            CronetBidirectionalStream.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    private static int convertStreamPriority(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Invalid stream priority.");
    }

    public static boolean doesMethodAllowWriteData(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    private static ArrayList<Map.Entry<String, String>> headersListFromStrings(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private void onResponseTrailersReceived(String[] strArr) {
        final UrlResponseInfoImpl.HeaderBlockImpl headerBlockImpl = new UrlResponseInfoImpl.HeaderBlockImpl(headersListFromStrings(strArr));
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC680193 */

            public void run() {
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (!CronetBidirectionalStream.this.isDoneLocked()) {
                        try {
                            VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                            CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                            bidirectionalStreamCallback.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, headerBlockImpl);
                        } catch (Exception e) {
                            CronetBidirectionalStream.this.onCallbackException(e);
                        }
                    }
                }
            }
        });
    }

    public void onCallbackException(Exception exc) {
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("CalledByNative method has thrown an exception", exc);
        Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", exc);
        failWithExceptionOnExecutor(callbackExceptionImpl);
    }

    private void destroyNativeStreamLocked(boolean z) {
        String str = CronetUrlRequestContext.LOG_TAG;
        Log.m264557i(str, "destroyNativeStreamLocked " + toString(), new Object[0]);
        long j = this.mNativeStream;
        if (j != 0) {
            nativeDestroy(j, z);
            this.mRequestContext.onRequestDestroyed();
            this.mNativeStream = 0;
            Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", e);
            synchronized (this.mNativeStreamLock) {
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
            }
        }
    }

    private static String[] stringsFromHeaderList(List<Map.Entry<String, String>> list) {
        String[] strArr = new String[(list.size() * 2)];
        int i = 0;
        for (Map.Entry<String, String> entry : list) {
            int i2 = i + 1;
            strArr[i] = entry.getKey();
            i = i2 + 1;
            strArr[i2] = entry.getValue();
        }
        return strArr;
    }

    public void failWithExceptionOnExecutor(CronetException cronetException) {
        this.mException = cronetException;
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked()) {
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
                try {
                    this.mCallback.onFailed(this, this.mResponseInfo, cronetException);
                } catch (Exception e) {
                    Log.m264556e(CronetUrlRequestContext.LOG_TAG, "Exception notifying of failed request", e);
                }
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream
    public void read(ByteBuffer byteBuffer) {
        synchronized (this.mNativeStreamLock) {
            Preconditions.checkHasRemaining(byteBuffer);
            Preconditions.checkDirect(byteBuffer);
            if (this.mReadState != 2) {
                throw new IllegalStateException("Unexpected read attempt.");
            } else if (!isDoneLocked()) {
                if (this.mOnReadCompletedTask == null) {
                    this.mOnReadCompletedTask = new OnReadCompletedRunnable();
                }
                this.mReadState = 3;
                if (!nativeReadData(this.mNativeStream, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    this.mReadState = 2;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.BidirectionalStream
    public void write(ByteBuffer byteBuffer, boolean z) {
        synchronized (this.mNativeStreamLock) {
            Preconditions.checkDirect(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                if (!z) {
                    throw new IllegalArgumentException("Empty buffer before end of stream.");
                }
            }
            if (this.mEndOfStreamWritten) {
                throw new IllegalArgumentException("Write after writing end of stream.");
            } else if (!isDoneLocked()) {
                this.mPendingData.add(byteBuffer);
                if (z) {
                    this.mEndOfStreamWritten = true;
                }
            }
        }
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, j);
            postTaskToExecutor(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC680182 */

                public void run() {
                    synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                        if (!CronetBidirectionalStream.this.isDoneLocked()) {
                            CronetBidirectionalStream.this.mReadState = 2;
                            try {
                                VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                                CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                                bidirectionalStreamCallback.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                            } catch (Exception e) {
                                CronetBidirectionalStream.this.onCallbackException(e);
                            }
                        }
                    }
                }
            });
        } catch (Exception unused) {
            failWithException(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
        }
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, long j) {
        return new UrlResponseInfoImpl(Arrays.asList(this.mInitialUrl), i, "", headersListFromStrings(strArr), false, str, null, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r1 >= r7.length) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        r2 = r7[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2.position() != r8[r1]) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r2.limit() == r9[r1]) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r2.position(r2.limit());
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r10 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r1 != (r7.length - 1)) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        postTaskToExecutor(new com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable(r6, r2, r4));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        failWithException(new com.ttnet.org.chromium.net.impl.CronetExceptionImpl("ByteBuffer modified externally during write", null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mNativeStreamLock
            monitor-enter(r0)
            boolean r1 = r6.isDoneLocked()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x000b:
            r1 = 8
            r6.mWriteState = r1     // Catch:{ all -> 0x005a }
            java.util.LinkedList<java.nio.ByteBuffer> r1 = r6.mFlushData     // Catch:{ all -> 0x005a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x001a
            r6.sendFlushDataLocked()     // Catch:{ all -> 0x005a }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            r0 = 0
            r1 = 0
        L_0x001d:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x0059
            r2 = r7[r1]
            int r3 = r2.position()
            r4 = r8[r1]
            if (r3 != r4) goto L_0x004e
            int r3 = r2.limit()
            r4 = r9[r1]
            if (r3 == r4) goto L_0x0033
            goto L_0x004e
        L_0x0033:
            int r3 = r2.limit()
            r2.position(r3)
            com.ttnet.org.chromium.net.impl.CronetBidirectionalStream$OnWriteCompletedRunnable r3 = new com.ttnet.org.chromium.net.impl.CronetBidirectionalStream$OnWriteCompletedRunnable
            r4 = 1
            if (r10 == 0) goto L_0x0044
            int r5 = r7.length
            int r5 = r5 - r4
            if (r1 != r5) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            r3.<init>(r2, r4)
            r6.postTaskToExecutor(r3)
            int r1 = r1 + 1
            goto L_0x001d
        L_0x004e:
            com.ttnet.org.chromium.net.impl.CronetExceptionImpl r7 = new com.ttnet.org.chromium.net.impl.CronetExceptionImpl
            java.lang.String r8 = "ByteBuffer modified externally during write"
            r9 = 0
            r7.<init>(r8, r9)
            r6.failWithException(r7)
        L_0x0059:
            return
        L_0x005a:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j);
        }
        if (i == 10 || i == 3) {
            failWithException(new QuicExceptionImpl("Exception in BidirectionalStream: " + str, i, i2, i3));
            return;
        }
        failWithException(new BidirectionalStreamNetworkException("Exception in BidirectionalStream: " + str, i, i2));
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        boolean z;
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
        } else if (i < 0 || (i4 = i2 + i) > i3) {
            failWithException(new CronetExceptionImpl("Invalid number of bytes read", null));
        } else {
            byteBuffer.position(i4);
            this.mOnReadCompletedTask.mByteBuffer = byteBuffer;
            OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            onReadCompletedRunnable.mEndOfStream = z;
            postTaskToExecutor(this.mOnReadCompletedTask);
        }
    }

    CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mInitialUrl = str;
        this.mInitialPriority = convertStreamPriority(i);
        this.mCallback = new VersionSafeCallbacks.BidirectionalStreamCallback(callback);
        this.mExecutor = executor;
        this.mInitialMethod = str2;
        this.mRequestHeaders = stringsFromHeaderList(list);
        this.mDelayRequestHeadersUntilFirstFlush = z;
        this.mPendingData = new LinkedList<>();
        this.mFlushData = new LinkedList<>();
        this.mRequestAnnotations = collection;
        this.mTrafficStatsTagSet = z2;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z3;
        this.mTrafficStatsUid = i3;
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        int i;
        synchronized (this.mNativeStreamLock) {
            if (this.mMetrics == null) {
                CronetMetrics cronetMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, -1, str, j16, 0, "", "");
                this.mMetrics = cronetMetrics;
                int i2 = this.mReadState;
                if (i2 == 7) {
                    i = 0;
                } else if (i2 == 5) {
                    i = 2;
                } else {
                    i = 1;
                }
                this.mRequestContext.reportRequestFinished(new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, cronetMetrics, i, this.mResponseInfo, this.mException));
            } else {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
        }
    }
}
