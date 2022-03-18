package com.ttnet.org.chromium.net.impl;

import android.net.TrafficStats;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.InlineExecutionProhibitedException;
import com.ttnet.org.chromium.net.ThreadStatsUid;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UploadDataSink;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class JavaUrlRequest extends UrlRequestBase {
    public static final String TAG = "JavaUrlRequest";
    public volatile int mAdditionalStatusDetails = -1;
    public final boolean mAllowDirectExecutor;
    public final AsyncUrlRequestCallback mCallbackAsync;
    public String mCurrentUrl;
    public HttpURLConnection mCurrentUrlConnection;
    public final Executor mExecutor;
    public String mInitialMethod;
    public OutputStreamDataSink mOutputStreamDataSink;
    public String mPendingRedirectUrl;
    public final Map<String, String> mRequestHeaders = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public ReadableByteChannel mResponseChannel;
    public final AtomicReference<Integer> mState = new AtomicReference<>(0);
    public VersionSafeCallbacks.UploadDataProviderWrapper mUploadDataProvider;
    public Executor mUploadExecutor;
    private final AtomicBoolean mUploadProviderClosed = new AtomicBoolean(false);
    public final List<String> mUrlChain = new ArrayList();
    public UrlResponseInfoImpl mUrlResponseInfo;
    public final String mUserAgent;

    /* access modifiers changed from: private */
    public interface CheckedRunnable {
        void run() throws Exception;
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface SinkState {
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface State {
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void AddRequestCookieHeader(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void RemoveRequestCookieHeader() {
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public String getRequestLog() {
        return "";
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setRequestTimeout(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setSocketConnectTimeout(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setSocketReadTimeout(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setSocketWriteTimeout(int i) {
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void setThrottleNetSpeed(long j) {
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void stopRedirect() {
    }

    private final class OutputStreamDataSink extends UploadDataSink {
        ByteBuffer mBuffer;
        final Executor mExecutor;
        WritableByteChannel mOutputChannel;
        final AtomicBoolean mOutputChannelClosed = new AtomicBoolean(false);
        final AtomicReference<Integer> mSinkState = new AtomicReference<>(3);
        long mTotalBytes;
        final VersionSafeCallbacks.UploadDataProviderWrapper mUploadProvider;
        final HttpURLConnection mUrlConnection;
        OutputStream mUrlConnectionOutputStream;
        final Executor mUserUploadExecutor;
        long mWrittenBytes;

        /* access modifiers changed from: package-private */
        public void finish() throws IOException {
            closeOutputChannel();
            JavaUrlRequest.this.fireGetHeaders();
        }

        /* access modifiers changed from: package-private */
        public void closeOutputChannel() throws IOException {
            if (this.mOutputChannel != null && this.mOutputChannelClosed.compareAndSet(false, true)) {
                this.mOutputChannel.close();
            }
        }

        @Override // com.ttnet.org.chromium.net.UploadDataSink
        public void onRewindSucceeded() {
            if (this.mSinkState.compareAndSet(1, 2)) {
                startRead();
                return;
            }
            throw new IllegalStateException("Not expecting a read result");
        }

        /* access modifiers changed from: package-private */
        public void startRead() {
            this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink.C680713 */

                @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                public void run() throws Exception {
                    if (OutputStreamDataSink.this.mOutputChannel == null) {
                        JavaUrlRequest.this.mAdditionalStatusDetails = 10;
                        OutputStreamDataSink.this.mUrlConnection.setDoOutput(true);
                        OutputStreamDataSink.this.mUrlConnection.connect();
                        JavaUrlRequest.this.mAdditionalStatusDetails = 12;
                        OutputStreamDataSink outputStreamDataSink = OutputStreamDataSink.this;
                        outputStreamDataSink.mUrlConnectionOutputStream = outputStreamDataSink.mUrlConnection.getOutputStream();
                        OutputStreamDataSink outputStreamDataSink2 = OutputStreamDataSink.this;
                        outputStreamDataSink2.mOutputChannel = Channels.newChannel(outputStreamDataSink2.mUrlConnectionOutputStream);
                    }
                    OutputStreamDataSink.this.mSinkState.set(0);
                    OutputStreamDataSink.this.executeOnUploadExecutor(new CheckedRunnable() {
                        /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink.C680713.C680721 */

                        @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                        public void run() throws Exception {
                            OutputStreamDataSink.this.mUploadProvider.read(OutputStreamDataSink.this, OutputStreamDataSink.this.mBuffer);
                        }
                    });
                }
            }));
        }

        @Override // com.ttnet.org.chromium.net.UploadDataSink
        public void onReadError(Exception exc) {
            JavaUrlRequest.this.enterUploadErrorState(exc);
        }

        @Override // com.ttnet.org.chromium.net.UploadDataSink
        public void onRewindError(Exception exc) {
            JavaUrlRequest.this.enterUploadErrorState(exc);
        }

        /* access modifiers changed from: package-private */
        public void start(final boolean z) {
            executeOnUploadExecutor(new CheckedRunnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink.C680734 */

                @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                public void run() throws Exception {
                    OutputStreamDataSink outputStreamDataSink = OutputStreamDataSink.this;
                    outputStreamDataSink.mTotalBytes = outputStreamDataSink.mUploadProvider.getLength();
                    if (OutputStreamDataSink.this.mTotalBytes == 0) {
                        OutputStreamDataSink.this.finish();
                        return;
                    }
                    if (OutputStreamDataSink.this.mTotalBytes <= 0 || OutputStreamDataSink.this.mTotalBytes >= 8192) {
                        OutputStreamDataSink.this.mBuffer = ByteBuffer.allocateDirect(8192);
                    } else {
                        OutputStreamDataSink outputStreamDataSink2 = OutputStreamDataSink.this;
                        outputStreamDataSink2.mBuffer = ByteBuffer.allocateDirect(((int) outputStreamDataSink2.mTotalBytes) + 1);
                    }
                    if (OutputStreamDataSink.this.mTotalBytes > 0 && OutputStreamDataSink.this.mTotalBytes <= 2147483647L) {
                        OutputStreamDataSink.this.mUrlConnection.setFixedLengthStreamingMode((int) OutputStreamDataSink.this.mTotalBytes);
                    } else if (OutputStreamDataSink.this.mTotalBytes <= 2147483647L || Build.VERSION.SDK_INT < 19) {
                        OutputStreamDataSink.this.mUrlConnection.setChunkedStreamingMode(8192);
                    } else {
                        OutputStreamDataSink.this.mUrlConnection.setFixedLengthStreamingMode(OutputStreamDataSink.this.mTotalBytes);
                    }
                    if (z) {
                        OutputStreamDataSink.this.startRead();
                        return;
                    }
                    OutputStreamDataSink.this.mSinkState.set(1);
                    OutputStreamDataSink.this.mUploadProvider.rewind(OutputStreamDataSink.this);
                }
            });
        }

        public void executeOnUploadExecutor(CheckedRunnable checkedRunnable) {
            try {
                this.mUserUploadExecutor.execute(JavaUrlRequest.this.uploadErrorSetting(checkedRunnable));
            } catch (RejectedExecutionException e) {
                JavaUrlRequest.this.enterUploadErrorState(e);
            }
        }

        @Override // com.ttnet.org.chromium.net.UploadDataSink
        public void onReadSucceeded(final boolean z) {
            if (this.mSinkState.compareAndSet(0, 2)) {
                this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                    /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink.C680692 */

                    @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                    public void run() throws Exception {
                        OutputStreamDataSink.this.mBuffer.flip();
                        if (OutputStreamDataSink.this.mTotalBytes == -1 || OutputStreamDataSink.this.mTotalBytes - OutputStreamDataSink.this.mWrittenBytes >= ((long) OutputStreamDataSink.this.mBuffer.remaining())) {
                            while (OutputStreamDataSink.this.mBuffer.hasRemaining()) {
                                OutputStreamDataSink.this.mWrittenBytes += (long) OutputStreamDataSink.this.mOutputChannel.write(OutputStreamDataSink.this.mBuffer);
                            }
                            OutputStreamDataSink.this.mUrlConnectionOutputStream.flush();
                            if (OutputStreamDataSink.this.mWrittenBytes < OutputStreamDataSink.this.mTotalBytes || (OutputStreamDataSink.this.mTotalBytes == -1 && !z)) {
                                OutputStreamDataSink.this.mBuffer.clear();
                                OutputStreamDataSink.this.mSinkState.set(0);
                                OutputStreamDataSink.this.executeOnUploadExecutor(new CheckedRunnable() {
                                    /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink.C680692.C680701 */

                                    @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                                    public void run() throws Exception {
                                        OutputStreamDataSink.this.mUploadProvider.read(OutputStreamDataSink.this, OutputStreamDataSink.this.mBuffer);
                                    }
                                });
                            } else if (OutputStreamDataSink.this.mTotalBytes == -1) {
                                OutputStreamDataSink.this.finish();
                            } else if (OutputStreamDataSink.this.mTotalBytes == OutputStreamDataSink.this.mWrittenBytes) {
                                OutputStreamDataSink.this.finish();
                            } else {
                                JavaUrlRequest.this.enterUploadErrorState(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(OutputStreamDataSink.this.mWrittenBytes), Long.valueOf(OutputStreamDataSink.this.mTotalBytes))));
                            }
                        } else {
                            JavaUrlRequest.this.enterUploadErrorState(new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", Long.valueOf(OutputStreamDataSink.this.mWrittenBytes + ((long) OutputStreamDataSink.this.mBuffer.remaining())), Long.valueOf(OutputStreamDataSink.this.mTotalBytes))));
                        }
                    }
                }));
                return;
            }
            throw new IllegalStateException("Not expecting a read result, expecting: " + this.mSinkState.get());
        }

        OutputStreamDataSink(final Executor executor, Executor executor2, HttpURLConnection httpURLConnection, VersionSafeCallbacks.UploadDataProviderWrapper uploadDataProviderWrapper) {
            this.mUserUploadExecutor = new Executor(JavaUrlRequest.this) {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.OutputStreamDataSink.ExecutorC680681 */

                public void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        JavaUrlRequest.this.enterUploadErrorState(e);
                    }
                }
            };
            this.mExecutor = executor2;
            this.mUrlConnection = httpURLConnection;
            this.mUploadProvider = uploadDataProviderWrapper;
        }
    }

    private void fireDisconnect() {
        this.mExecutor.execute(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AnonymousClass12 */

            public void run() {
                if (JavaUrlRequest.this.mOutputStreamDataSink != null) {
                    try {
                        JavaUrlRequest.this.mOutputStreamDataSink.closeOutputChannel();
                    } catch (IOException e) {
                        Log.e(JavaUrlRequest.TAG, "Exception when closing OutputChannel", e);
                    }
                }
                if (JavaUrlRequest.this.mCurrentUrlConnection != null) {
                    JavaUrlRequest.this.mCurrentUrlConnection.disconnect();
                    JavaUrlRequest.this.mCurrentUrlConnection = null;
                }
            }
        });
    }

    public void closeResponseChannel() {
        this.mExecutor.execute(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AnonymousClass13 */

            public void run() {
                if (JavaUrlRequest.this.mResponseChannel != null) {
                    try {
                        JavaUrlRequest.this.mResponseChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    JavaUrlRequest.this.mResponseChannel = null;
                }
            }
        });
    }

    public void fireOpenConnection() {
        this.mExecutor.execute(errorSetting(new CheckedRunnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.C680587 */

            @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
            public void run() throws Exception {
                if (JavaUrlRequest.this.mState.get().intValue() != 8) {
                    URL url = new URL(JavaUrlRequest.this.mCurrentUrl);
                    if (JavaUrlRequest.this.mCurrentUrlConnection != null) {
                        JavaUrlRequest.this.mCurrentUrlConnection.disconnect();
                        JavaUrlRequest.this.mCurrentUrlConnection = null;
                    }
                    JavaUrlRequest.this.mCurrentUrlConnection = (HttpURLConnection) url.openConnection();
                    boolean z = false;
                    JavaUrlRequest.this.mCurrentUrlConnection.setInstanceFollowRedirects(false);
                    if (!JavaUrlRequest.this.mRequestHeaders.containsKey("User-Agent")) {
                        JavaUrlRequest.this.mRequestHeaders.put("User-Agent", JavaUrlRequest.this.mUserAgent);
                    }
                    for (Map.Entry<String, String> entry : JavaUrlRequest.this.mRequestHeaders.entrySet()) {
                        JavaUrlRequest.this.mCurrentUrlConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    if (JavaUrlRequest.this.mInitialMethod == null) {
                        JavaUrlRequest.this.mInitialMethod = "GET";
                    }
                    JavaUrlRequest.this.mCurrentUrlConnection.setRequestMethod(JavaUrlRequest.this.mInitialMethod);
                    if (JavaUrlRequest.this.mUploadDataProvider != null) {
                        JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                        javaUrlRequest.mOutputStreamDataSink = new OutputStreamDataSink(javaUrlRequest.mUploadExecutor, JavaUrlRequest.this.mExecutor, JavaUrlRequest.this.mCurrentUrlConnection, JavaUrlRequest.this.mUploadDataProvider);
                        OutputStreamDataSink outputStreamDataSink = JavaUrlRequest.this.mOutputStreamDataSink;
                        if (JavaUrlRequest.this.mUrlChain.size() == 1) {
                            z = true;
                        }
                        outputStreamDataSink.start(z);
                        return;
                    }
                    JavaUrlRequest.this.mAdditionalStatusDetails = 10;
                    JavaUrlRequest.this.mCurrentUrlConnection.connect();
                    JavaUrlRequest.this.fireGetHeaders();
                }
            }
        }));
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void followRedirect() {
        transitionStates(3, 1, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.RunnableC680533 */

            public void run() {
                JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                javaUrlRequest.mCurrentUrl = javaUrlRequest.mPendingRedirectUrl;
                JavaUrlRequest.this.mPendingRedirectUrl = null;
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void start() {
        this.mAdditionalStatusDetails = 10;
        transitionStates(0, 1, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.RunnableC680522 */

            public void run() {
                JavaUrlRequest.this.mUrlChain.add(JavaUrlRequest.this.mCurrentUrl);
                JavaUrlRequest.this.fireOpenConnection();
            }
        });
    }

    static final class DirectPreventingExecutor implements Executor {
        private final Executor mDelegate;

        private static final class InlineCheckingRunnable implements Runnable {
            public Thread mCallingThread;
            private final Runnable mCommand;
            public InlineExecutionProhibitedException mExecutedInline;

            public void run() {
                if (Thread.currentThread() == this.mCallingThread) {
                    this.mExecutedInline = new InlineExecutionProhibitedException();
                } else {
                    this.mCommand.run();
                }
            }

            private InlineCheckingRunnable(Runnable runnable, Thread thread) {
                this.mCommand = runnable;
                this.mCallingThread = thread;
            }
        }

        DirectPreventingExecutor(Executor executor) {
            this.mDelegate = executor;
        }

        public void execute(Runnable runnable) {
            InlineCheckingRunnable inlineCheckingRunnable = new InlineCheckingRunnable(runnable, Thread.currentThread());
            this.mDelegate.execute(inlineCheckingRunnable);
            if (inlineCheckingRunnable.mExecutedInline == null) {
                inlineCheckingRunnable.mCallingThread = null;
                return;
            }
            throw inlineCheckingRunnable.mExecutedInline;
        }
    }

    public void fireGetHeaders() {
        this.mAdditionalStatusDetails = 13;
        this.mExecutor.execute(errorSetting(new CheckedRunnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.C680544 */

            @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
            public void run() throws Exception {
                ReadableByteChannel readableByteChannel;
                if (JavaUrlRequest.this.mCurrentUrlConnection != null) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    String str = "http/1.1";
                    while (true) {
                        String headerFieldKey = JavaUrlRequest.this.mCurrentUrlConnection.getHeaderFieldKey(i);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str = JavaUrlRequest.this.mCurrentUrlConnection.getHeaderField(i);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, JavaUrlRequest.this.mCurrentUrlConnection.getHeaderField(i)));
                        }
                        i++;
                    }
                    int responseCode = JavaUrlRequest.this.mCurrentUrlConnection.getResponseCode();
                    JavaUrlRequest.this.mUrlResponseInfo = new UrlResponseInfoImpl(new ArrayList(JavaUrlRequest.this.mUrlChain), responseCode, JavaUrlRequest.this.mCurrentUrlConnection.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0);
                    if (responseCode < 300 || responseCode >= 400) {
                        JavaUrlRequest.this.fireCloseUploadDataProvider();
                        if (responseCode >= 400) {
                            InputStream errorStream = JavaUrlRequest.this.mCurrentUrlConnection.getErrorStream();
                            JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                            if (errorStream == null) {
                                readableByteChannel = null;
                            } else {
                                readableByteChannel = InputStreamChannel.wrap(errorStream);
                            }
                            javaUrlRequest.mResponseChannel = readableByteChannel;
                            JavaUrlRequest.this.mCallbackAsync.onResponseStarted(JavaUrlRequest.this.mUrlResponseInfo);
                            return;
                        }
                        JavaUrlRequest javaUrlRequest2 = JavaUrlRequest.this;
                        javaUrlRequest2.mResponseChannel = InputStreamChannel.wrap(javaUrlRequest2.mCurrentUrlConnection.getInputStream());
                        JavaUrlRequest.this.mCallbackAsync.onResponseStarted(JavaUrlRequest.this.mUrlResponseInfo);
                        return;
                    }
                    JavaUrlRequest javaUrlRequest3 = JavaUrlRequest.this;
                    javaUrlRequest3.fireRedirectReceived(javaUrlRequest3.mUrlResponseInfo.getAllHeaders());
                }
            }
        }));
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public boolean isDone() {
        int intValue = this.mState.get().intValue();
        if (intValue == 7 || intValue == 6 || intValue == 8) {
            return true;
        }
        return false;
    }

    private void checkNotStarted() {
        int intValue = this.mState.get().intValue();
        if (intValue != 0) {
            throw new IllegalStateException("Request is already started. State is: " + intValue);
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void cancel() {
        int intValue = this.mState.getAndSet(8).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onCanceled(this.mUrlResponseInfo);
        }
    }

    public void fireCloseUploadDataProvider() {
        if (this.mUploadDataProvider != null && this.mUploadProviderClosed.compareAndSet(false, true)) {
            try {
                this.mUploadExecutor.execute(uploadErrorSetting(new CheckedRunnable() {
                    /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.C680555 */

                    @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                    public void run() throws Exception {
                        JavaUrlRequest.this.mUploadDataProvider.close();
                    }
                }));
            } catch (RejectedExecutionException e) {
                Log.e(TAG, "Exception when closing uploadDataProvider", e);
            }
        }
    }

    public Runnable errorSetting(final CheckedRunnable checkedRunnable) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.RunnableC680598 */

            public void run() {
                try {
                    checkedRunnable.run();
                } catch (Throwable th) {
                    JavaUrlRequest.this.enterCronetErrorState(th);
                }
            }
        };
    }

    public Runnable uploadErrorSetting(final CheckedRunnable checkedRunnable) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AnonymousClass10 */

            public void run() {
                try {
                    checkedRunnable.run();
                } catch (Throwable th) {
                    JavaUrlRequest.this.enterUploadErrorState(th);
                }
            }
        };
    }

    public Runnable userErrorSetting(final CheckedRunnable checkedRunnable) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.RunnableC680609 */

            public void run() {
                try {
                    checkedRunnable.run();
                } catch (Throwable th) {
                    JavaUrlRequest.this.enterUserErrorState(th);
                }
            }
        };
    }

    /* access modifiers changed from: private */
    public final class AsyncUrlRequestCallback {
        final VersionSafeCallbacks.UrlRequestCallback mCallback;
        final Executor mFallbackExecutor;
        final Executor mUserExecutor;

        /* access modifiers changed from: package-private */
        public void onCanceled(final UrlResponseInfo urlResponseInfo) {
            JavaUrlRequest.this.closeResponseChannel();
            this.mUserExecutor.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.RunnableC680655 */

                public void run() {
                    try {
                        AsyncUrlRequestCallback.this.mCallback.onCanceled(JavaUrlRequest.this, urlResponseInfo);
                    } catch (Exception e) {
                        Log.e(JavaUrlRequest.TAG, "Exception in onCanceled method", e);
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void onResponseStarted(UrlResponseInfo urlResponseInfo) {
            execute(new CheckedRunnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.C680633 */

                @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                public void run() throws Exception {
                    if (JavaUrlRequest.this.mState.compareAndSet(1, 4)) {
                        AsyncUrlRequestCallback.this.mCallback.onResponseStarted(JavaUrlRequest.this, JavaUrlRequest.this.mUrlResponseInfo, "");
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void onSucceeded(final UrlResponseInfo urlResponseInfo) {
            this.mUserExecutor.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.RunnableC680666 */

                public void run() {
                    try {
                        AsyncUrlRequestCallback.this.mCallback.onSucceeded(JavaUrlRequest.this, urlResponseInfo);
                    } catch (Exception e) {
                        Log.e(JavaUrlRequest.TAG, "Exception in onSucceeded method", e);
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void execute(CheckedRunnable checkedRunnable) {
            try {
                this.mUserExecutor.execute(JavaUrlRequest.this.userErrorSetting(checkedRunnable));
            } catch (RejectedExecutionException e) {
                JavaUrlRequest.this.enterErrorState(new CronetExceptionImpl("Exception posting task to executor", e));
            }
        }

        /* access modifiers changed from: package-private */
        public void onReadCompleted(final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
            execute(new CheckedRunnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.C680644 */

                @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                public void run() throws Exception {
                    if (JavaUrlRequest.this.mState.compareAndSet(5, 4)) {
                        AsyncUrlRequestCallback.this.mCallback.onReadCompleted(JavaUrlRequest.this, urlResponseInfo, byteBuffer);
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void onRedirectReceived(final UrlResponseInfo urlResponseInfo, final String str) {
            execute(new CheckedRunnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.C680622 */

                @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                public void run() throws Exception {
                    AsyncUrlRequestCallback.this.mCallback.onRedirectReceived(JavaUrlRequest.this, urlResponseInfo, str);
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void sendStatus(final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i) {
            this.mUserExecutor.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.RunnableC680611 */

                public void run() {
                    urlRequestStatusListener.onStatus(i);
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void onFailed(final UrlResponseInfo urlResponseInfo, final CronetException cronetException) {
            JavaUrlRequest.this.closeResponseChannel();
            RunnableC680677 r0 = new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AsyncUrlRequestCallback.RunnableC680677 */

                public void run() {
                    try {
                        AsyncUrlRequestCallback.this.mCallback.onFailed(JavaUrlRequest.this, urlResponseInfo, cronetException);
                    } catch (Exception e) {
                        Log.e(JavaUrlRequest.TAG, "Exception in onFailed method", e);
                    }
                }
            };
            try {
                this.mUserExecutor.execute(r0);
            } catch (InlineExecutionProhibitedException unused) {
                Executor executor = this.mFallbackExecutor;
                if (executor != null) {
                    executor.execute(r0);
                }
            }
        }

        AsyncUrlRequestCallback(UrlRequest.Callback callback, Executor executor) {
            this.mCallback = new VersionSafeCallbacks.UrlRequestCallback(callback);
            if (JavaUrlRequest.this.mAllowDirectExecutor) {
                this.mUserExecutor = executor;
                this.mFallbackExecutor = null;
                return;
            }
            this.mUserExecutor = new DirectPreventingExecutor(executor);
            this.mFallbackExecutor = executor;
        }
    }

    public void enterCronetErrorState(Throwable th) {
        enterErrorState(new CronetExceptionImpl("System error", th));
    }

    public void enterUploadErrorState(Throwable th) {
        enterErrorState(new CallbackExceptionImpl("Exception received from UploadDataProvider", th));
    }

    public void enterUserErrorState(Throwable th) {
        enterErrorState(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", th));
    }

    public void fireRedirectReceived(final Map<String, List<String>> map) {
        transitionStates(1, 2, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.RunnableC680566 */

            public void run() {
                JavaUrlRequest javaUrlRequest = JavaUrlRequest.this;
                javaUrlRequest.mPendingRedirectUrl = URI.create(javaUrlRequest.mCurrentUrl).resolve((String) ((List) map.get("location")).get(0)).toString();
                JavaUrlRequest.this.mUrlChain.add(JavaUrlRequest.this.mPendingRedirectUrl);
                JavaUrlRequest.this.transitionStates(2, 3, new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.RunnableC680566.RunnableC680571 */

                    public void run() {
                        JavaUrlRequest.this.mCallbackAsync.onRedirectReceived(JavaUrlRequest.this.mUrlResponseInfo, JavaUrlRequest.this.mPendingRedirectUrl);
                    }
                });
            }
        });
    }

    private static final class SerializingExecutor implements Executor {
        public final Runnable mRunTasks = new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.RunnableC680741 */

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
                if (r1 == null) goto L_0x005f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r1.run();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
                r0 = r6.this$0.mTaskQueue;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
                monitor-enter(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                r1 = r6.this$0.mTaskQueue.pollFirst();
                r2 = r6.this$0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
                if (r1 == null) goto L_0x003d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
                r5 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
                r5 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
                r2.mRunning = r5;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
                monitor-exit(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
                monitor-enter(r6.this$0.mTaskQueue);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
                r6.this$0.mRunning = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                r6.this$0.mUnderlyingExecutor.execute(r6.this$0.mRunTasks);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x005f, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r6 = this;
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r0 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this
                    java.util.ArrayDeque<java.lang.Runnable> r0 = r0.mTaskQueue
                    monitor-enter(r0)
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0060 }
                    boolean r1 = r1.mRunning     // Catch:{ all -> 0x0060 }
                    if (r1 == 0) goto L_0x000d
                    monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                    return
                L_0x000d:
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0060 }
                    java.util.ArrayDeque<java.lang.Runnable> r1 = r1.mTaskQueue     // Catch:{ all -> 0x0060 }
                    java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0060 }
                    java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0060 }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0060 }
                    r3 = 1
                    r4 = 0
                    if (r1 == 0) goto L_0x001f
                    r5 = 1
                    goto L_0x0020
                L_0x001f:
                    r5 = 0
                L_0x0020:
                    r2.mRunning = r5     // Catch:{ all -> 0x0060 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0060 }
                L_0x0023:
                    if (r1 == 0) goto L_0x005f
                    r1.run()     // Catch:{ all -> 0x0045 }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r0 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this
                    java.util.ArrayDeque<java.lang.Runnable> r0 = r0.mTaskQueue
                    monitor-enter(r0)
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0042 }
                    java.util.ArrayDeque<java.lang.Runnable> r1 = r1.mTaskQueue     // Catch:{ all -> 0x0042 }
                    java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x0042 }
                    java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch:{ all -> 0x0042 }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x0042 }
                    if (r1 == 0) goto L_0x003d
                    r5 = 1
                    goto L_0x003e
                L_0x003d:
                    r5 = 0
                L_0x003e:
                    r2.mRunning = r5     // Catch:{ all -> 0x0042 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                    goto L_0x0023
                L_0x0042:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0042 }
                    throw r1
                L_0x0045:
                    r0 = move-exception
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r1 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this
                    java.util.ArrayDeque<java.lang.Runnable> r1 = r1.mTaskQueue
                    monitor-enter(r1)
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ all -> 0x005c }
                    r2.mRunning = r4     // Catch:{ all -> 0x005c }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r2 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ RejectedExecutionException -> 0x005a }
                    java.util.concurrent.Executor r2 = r2.mUnderlyingExecutor     // Catch:{ RejectedExecutionException -> 0x005a }
                    com.ttnet.org.chromium.net.impl.JavaUrlRequest$SerializingExecutor r3 = com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.this     // Catch:{ RejectedExecutionException -> 0x005a }
                    java.lang.Runnable r3 = r3.mRunTasks     // Catch:{ RejectedExecutionException -> 0x005a }
                    r2.execute(r3)     // Catch:{ RejectedExecutionException -> 0x005a }
                L_0x005a:
                    monitor-exit(r1)
                    throw r0
                L_0x005c:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                L_0x005f:
                    return
                L_0x0060:
                    r1 = move-exception
                    monitor-exit(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.JavaUrlRequest.SerializingExecutor.RunnableC680741.run():void");
            }
        };
        public boolean mRunning;
        public final ArrayDeque<Runnable> mTaskQueue = new ArrayDeque<>();
        public final Executor mUnderlyingExecutor;

        SerializingExecutor(Executor executor) {
            this.mUnderlyingExecutor = executor;
        }

        public void execute(Runnable runnable) {
            synchronized (this.mTaskQueue) {
                this.mTaskQueue.addLast(runnable);
                try {
                    this.mUnderlyingExecutor.execute(this.mRunTasks);
                } catch (RejectedExecutionException unused) {
                    this.mTaskQueue.removeLast();
                }
            }
        }
    }

    public void enterErrorState(CronetException cronetException) {
        if (setTerminalState(6)) {
            fireDisconnect();
            fireCloseUploadDataProvider();
            this.mCallbackAsync.onFailed(this.mUrlResponseInfo, cronetException);
        }
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void read(final ByteBuffer byteBuffer) {
        Preconditions.checkDirect(byteBuffer);
        Preconditions.checkHasRemaining(byteBuffer);
        transitionStates(4, 5, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AnonymousClass11 */

            public void run() {
                JavaUrlRequest.this.mExecutor.execute(JavaUrlRequest.this.errorSetting(new CheckedRunnable() {
                    /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.AnonymousClass11.C680511 */

                    @Override // com.ttnet.org.chromium.net.impl.JavaUrlRequest.CheckedRunnable
                    public void run() throws Exception {
                        int i;
                        if (JavaUrlRequest.this.mResponseChannel == null) {
                            i = -1;
                        } else {
                            i = JavaUrlRequest.this.mResponseChannel.read(byteBuffer);
                        }
                        JavaUrlRequest.this.processReadResult(i, byteBuffer);
                    }
                }));
            }
        });
    }

    private boolean setTerminalState(int i) {
        int intValue;
        do {
            intValue = this.mState.get().intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (intValue == 6 || intValue == 7 || intValue == 8) {
                return false;
            }
        } while (!this.mState.compareAndSet(Integer.valueOf(intValue), Integer.valueOf(i)));
        return true;
    }

    private boolean isValidHeaderName(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        break;
                    default:
                        switch (charAt) {
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                break;
                            default:
                                switch (charAt) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                        break;
                                    default:
                                        if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                        }
                                }
                        }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ttnet.org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener statusListener) {
        int intValue = this.mState.get().intValue();
        int i = this.mAdditionalStatusDetails;
        switch (intValue) {
            case 0:
            case 6:
            case 7:
            case 8:
                i = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i = 0;
                break;
            case 5:
                i = 14;
                break;
            default:
                throw new IllegalStateException("Switch is exhaustive: " + intValue);
        }
        this.mCallbackAsync.sendStatus(new VersionSafeCallbacks.UrlRequestStatusListener(statusListener), i);
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setHttpMethod(String str) {
        checkNotStarted();
        Objects.requireNonNull(str, "Method is required.");
        if ("OPTIONS".equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || "PUT".equalsIgnoreCase(str) || "DELETE".equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.mInitialMethod = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method " + str);
    }

    public void processReadResult(int i, ByteBuffer byteBuffer) throws IOException {
        if (i != -1) {
            this.mCallbackAsync.onReadCompleted(this.mUrlResponseInfo, byteBuffer);
            return;
        }
        ReadableByteChannel readableByteChannel = this.mResponseChannel;
        if (readableByteChannel != null) {
            readableByteChannel.close();
        }
        if (this.mState.compareAndSet(5, 7)) {
            fireDisconnect();
            this.mCallbackAsync.onSucceeded(this.mUrlResponseInfo);
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        if (this.mRequestHeaders.containsKey("Content-Type")) {
            checkNotStarted();
            if (this.mInitialMethod == null) {
                this.mInitialMethod = "POST";
            }
            this.mUploadDataProvider = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
            if (this.mAllowDirectExecutor) {
                this.mUploadExecutor = executor;
            } else {
                this.mUploadExecutor = new DirectPreventingExecutor(executor);
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.UrlRequestBase
    public void addHeader(String str, String str2) {
        checkNotStarted();
        if (!isValidHeaderName(str) || str2.contains("\r\n")) {
            throw new IllegalArgumentException("Invalid header " + str + ContainerUtils.KEY_VALUE_DELIMITER + str2);
        }
        if (this.mRequestHeaders.containsKey(str)) {
            this.mRequestHeaders.remove(str);
        }
        this.mRequestHeaders.put(str, str2);
    }

    public void transitionStates(int i, int i2, Runnable runnable) {
        if (!this.mState.compareAndSet(Integer.valueOf(i), Integer.valueOf(i2))) {
            int intValue = this.mState.get().intValue();
            if (intValue != 8 && intValue != 6) {
                throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + intValue);
            }
            return;
        }
        runnable.run();
    }

    JavaUrlRequest(UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2) {
        final int i3;
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(callback, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        Objects.requireNonNull(executor2, "userExecutor is required");
        this.mAllowDirectExecutor = z;
        this.mCallbackAsync = new AsyncUrlRequestCallback(callback, executor2);
        if (z2) {
            i3 = i;
        } else {
            i3 = TrafficStats.getThreadStatsTag();
        }
        this.mExecutor = new SerializingExecutor(new Executor() {
            /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.ExecutorC680491 */

            public void execute(final Runnable runnable) {
                executor.execute(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.JavaUrlRequest.ExecutorC680491.RunnableC680501 */

                    public void run() {
                        int threadStatsTag = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i3);
                        if (z3) {
                            ThreadStatsUid.set(i2);
                        }
                        try {
                            runnable.run();
                        } finally {
                            if (z3) {
                                ThreadStatsUid.clear();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag);
                        }
                    }
                });
            }
        });
        this.mCurrentUrl = str;
        this.mUserAgent = str2;
    }
}
