package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

@JNINamespace("cronet")
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String TAG = "CronetUploadDataStream";
    public ByteBuffer mByteBuffer;
    private long mByteBufferLimit;
    public volatile boolean mClosed;
    public final VersionSafeCallbacks.UploadDataProviderWrapper mDataProvider;
    private boolean mDestroyAdapterPostponed;
    private final Executor mExecutor;
    public int mInWhichUserCallback = 3;
    private long mLength;
    public final Object mLock = new Object();
    private Runnable mOnDestroyedCallbackForTesting;
    private final Runnable mReadTask = new Runnable() {
        /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC680231 */
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public void run() {
            synchronized (CronetUploadDataStream.this.mLock) {
                if (CronetUploadDataStream.this.mUploadDataStreamAdapter != 0) {
                    CronetUploadDataStream.this.checkState(3);
                    if (CronetUploadDataStream.this.mByteBuffer != null) {
                        CronetUploadDataStream.this.mInWhichUserCallback = 0;
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper = CronetUploadDataStream.this.mDataProvider;
                            CronetUploadDataStream cronetUploadDataStream = CronetUploadDataStream.this;
                            uploadDataProviderWrapper.read(cronetUploadDataStream, cronetUploadDataStream.mByteBuffer);
                        } catch (Exception e) {
                            CronetUploadDataStream.this.onError(e);
                        }
                    } else {
                        throw new IllegalStateException("Unexpected readData call. Buffer is null");
                    }
                }
            }
        }
    };
    private long mRemainingLength;
    private final CronetUrlRequest mRequest;
    public long mUploadDataStreamAdapter;

    @Retention(RetentionPolicy.SOURCE)
    private @interface UserCallback {
    }

    private native long nativeAttachUploadDataToRequest(long j, long j2);

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    @NativeClassQualifiedName("CronetUploadDataStreamAdapter")
    private static native void nativeDestroy(long j);

    @NativeClassQualifiedName("CronetUploadDataStreamAdapter")
    private native void nativeOnReadSucceeded(long j, int i, boolean z);

    @NativeClassQualifiedName("CronetUploadDataStreamAdapter")
    private native void nativeOnRewindSucceeded(long j);

    /* access modifiers changed from: package-private */
    public void onUploadDataStreamDestroyed() {
        destroyAdapter();
    }

    public void checkCallingThread() {
        this.mRequest.checkCallingThread();
    }

    /* access modifiers changed from: package-private */
    public void rewind() {
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC680242 */

            public void run() {
                synchronized (CronetUploadDataStream.this.mLock) {
                    if (CronetUploadDataStream.this.mUploadDataStreamAdapter != 0) {
                        CronetUploadDataStream.this.checkState(3);
                        CronetUploadDataStream.this.mInWhichUserCallback = 1;
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            CronetUploadDataStream.this.mDataProvider.rewind(CronetUploadDataStream.this);
                        } catch (Exception e) {
                            CronetUploadDataStream.this.onError(e);
                        }
                    }
                }
            }
        });
    }

    private void destroyAdapterIfPostponed() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            } else if (this.mDestroyAdapterPostponed) {
                destroyAdapter();
            }
        }
    }

    public long createUploadDataStreamForTesting() throws IOException {
        long nativeCreateUploadDataStreamForTesting;
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = nativeCreateAdapterForTesting();
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
            nativeCreateUploadDataStreamForTesting = nativeCreateUploadDataStreamForTesting(length, this.mUploadDataStreamAdapter);
        }
        return nativeCreateUploadDataStreamForTesting;
    }

    @Override // com.ttnet.org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        synchronized (this.mLock) {
            checkState(1);
            this.mInWhichUserCallback = 3;
            this.mRemainingLength = this.mLength;
            long j = this.mUploadDataStreamAdapter;
            if (j != 0) {
                nativeOnRewindSucceeded(j);
            }
        }
    }

    private void destroyAdapter() {
        synchronized (this.mLock) {
            if (this.mInWhichUserCallback == 0) {
                this.mDestroyAdapterPostponed = true;
                return;
            }
            long j = this.mUploadDataStreamAdapter;
            if (j != 0) {
                nativeDestroy(j);
                this.mUploadDataStreamAdapter = 0;
                Runnable runnable = this.mOnDestroyedCallbackForTesting;
                if (runnable != null) {
                    runnable.run();
                }
                postTaskToExecutor(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC680253 */

                    public void run() {
                        try {
                            CronetUploadDataStream.this.checkCallingThread();
                            if (!CronetUploadDataStream.this.mClosed) {
                                CronetUploadDataStream.this.mDataProvider.close();
                            }
                        } catch (Exception e) {
                            Log.m264556e(CronetUploadDataStream.TAG, "Exception thrown when closing", e);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void initializeWithRequest() {
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 2;
        }
        try {
            this.mRequest.checkCallingThread();
            long length = this.mDataProvider.getLength();
            this.mLength = length;
            this.mRemainingLength = length;
        } catch (Throwable th) {
            onError(th);
        }
        synchronized (this.mLock) {
            this.mInWhichUserCallback = 3;
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    /* access modifiers changed from: package-private */
    public void attachNativeAdapterToRequest(long j) {
        synchronized (this.mLock) {
            this.mUploadDataStreamAdapter = nativeAttachUploadDataToRequest(j, this.mLength);
        }
    }

    @Override // com.ttnet.org.chromium.net.UploadDataSink
    public void onReadError(Exception exc) {
        synchronized (this.mLock) {
            checkState(0);
            onError(exc);
        }
    }

    @Override // com.ttnet.org.chromium.net.UploadDataSink
    public void onRewindError(Exception exc) {
        synchronized (this.mLock) {
            checkState(1);
            onError(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public void readData(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
        this.mByteBufferLimit = (long) byteBuffer.limit();
        postTaskToExecutor(this.mReadTask);
    }

    public void checkState(int i) {
        if (this.mInWhichUserCallback != i) {
            throw new IllegalStateException("Expected " + i + ", but was " + this.mInWhichUserCallback);
        }
    }

    public void onError(Throwable th) {
        boolean z;
        synchronized (this.mLock) {
            int i = this.mInWhichUserCallback;
            if (i != 3) {
                if (i == 2) {
                    z = true;
                } else {
                    z = false;
                }
                this.mInWhichUserCallback = 3;
                this.mByteBuffer = null;
                destroyAdapterIfPostponed();
            } else {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
        }
        if (z) {
            try {
                this.mDataProvider.close();
                this.mClosed = true;
            } catch (Exception e) {
                Log.m264556e(TAG, "Failure closing data provider", e);
            }
        }
        this.mRequest.onUploadException(th);
    }

    /* access modifiers changed from: package-private */
    public void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (Throwable th) {
            CronetUrlRequest cronetUrlRequest = this.mRequest;
            if (cronetUrlRequest != null) {
                cronetUrlRequest.onUploadException(th);
                return;
            }
            throw new IllegalStateException("Unexpected request usage, caught in CronetUploadDataStream, caused by " + th);
        }
    }

    @Override // com.ttnet.org.chromium.net.UploadDataSink
    public void onReadSucceeded(boolean z) {
        synchronized (this.mLock) {
            checkState(0);
            if (this.mByteBufferLimit == ((long) this.mByteBuffer.limit())) {
                if (z) {
                    if (this.mLength >= 0) {
                        throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    }
                }
                int position = this.mByteBuffer.position();
                long j = this.mRemainingLength - ((long) position);
                this.mRemainingLength = j;
                if (j < 0) {
                    if (this.mLength >= 0) {
                        throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(this.mLength - this.mRemainingLength), Long.valueOf(this.mLength)));
                    }
                }
                this.mByteBuffer.position(0);
                this.mByteBuffer = null;
                this.mInWhichUserCallback = 3;
                destroyAdapterIfPostponed();
                long j2 = this.mUploadDataStreamAdapter;
                if (j2 != 0) {
                    nativeOnReadSucceeded(j2, position, z);
                    return;
                }
                return;
            }
            throw new IllegalStateException("ByteBuffer limit changed");
        }
    }

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.mExecutor = executor;
        this.mDataProvider = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
        this.mRequest = cronetUrlRequest;
        this.mClosed = false;
    }
}
