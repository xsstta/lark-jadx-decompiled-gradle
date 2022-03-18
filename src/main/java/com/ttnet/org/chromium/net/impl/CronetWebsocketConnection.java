package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.Log;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.NativeClassQualifiedName;
import com.ttnet.org.chromium.net.TTWebsocketConnection;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@JNINamespace("cronet")
public final class CronetWebsocketConnection extends TTWebsocketConnection {
    public static final String TAG = "CronetWebsocketConnection";
    private int mAppId;
    private String mAppKey;
    private String mAppToken;
    private int mAppVersion;
    public final TTWebsocketConnection.Callback mCallback;
    private long mDeviceId;
    private final Executor mExecutor;
    private int mFpid;
    private Map<String, String> mHeaders;
    private long mInstallId;
    private Map<String, String> mParams;
    private final CronetUrlRequestContext mRequestContext;
    private String mSessionId;
    private boolean mSharedConnection;
    private AtomicInteger mState = new AtomicInteger(-1);
    private List<String> mUrlList;
    private boolean mUseFrontier = true;
    private long mWebsocketAdapter;
    private final Object mWebsocketAdapterLock = new Object();

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeAddGetParam(long j, String str, String str2);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeAddHeader(long j, String str, String str2);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeAddUrl(long j, String str);

    private native long nativeCreateWebsocketConnectionAdapter(long j);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeDestroy(long j);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeSendBinary(long j, ByteBuffer byteBuffer);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeSendText(long j, String str);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeStartWithFrontier(long j, int i, String str, long j2, int i2, long j3, String str2, int i3, String str3, boolean z);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeStartWithWSChannel(long j, boolean z);

    @NativeClassQualifiedName("CronetWebsocketConnectionAdapter")
    private native void nativeStop(long j);

    @Override // com.ttnet.org.chromium.net.TTWebsocketConnection
    public boolean isConnected() {
        if (this.mState.get() == 4) {
            return true;
        }
        return false;
    }

    @Override // com.ttnet.org.chromium.net.TTWebsocketConnection
    public void destroyConnection() {
        synchronized (this.mWebsocketAdapterLock) {
            long j = this.mWebsocketAdapter;
            if (j != 0) {
                nativeDestroy(j);
                this.mWebsocketAdapter = 0;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.TTWebsocketConnection
    public void stopConnection() {
        synchronized (this.mWebsocketAdapterLock) {
            long j = this.mWebsocketAdapter;
            if (j != 0) {
                nativeStop(j);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.TTWebsocketConnection
    public void startConnection() {
        Object obj;
        Object obj2 = this.mWebsocketAdapterLock;
        synchronized (obj2) {
            try {
                if (this.mWebsocketAdapter == 0) {
                    this.mWebsocketAdapter = nativeCreateWebsocketConnectionAdapter(this.mRequestContext.getUrlRequestContextAdapter());
                }
                for (String str : this.mUrlList) {
                    nativeAddUrl(this.mWebsocketAdapter, str);
                }
                Map<String, String> map = this.mParams;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        nativeAddGetParam(this.mWebsocketAdapter, entry.getKey(), entry.getValue());
                    }
                }
                Map<String, String> map2 = this.mHeaders;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        nativeAddHeader(this.mWebsocketAdapter, entry2.getKey(), entry2.getValue());
                    }
                }
                if (this.mUseFrontier) {
                    obj = obj2;
                    nativeStartWithFrontier(this.mWebsocketAdapter, this.mAppId, this.mAppKey, this.mDeviceId, this.mFpid, this.mInstallId, this.mSessionId, this.mAppVersion, this.mAppToken, this.mSharedConnection);
                } else {
                    obj = obj2;
                    nativeStartWithWSChannel(this.mWebsocketAdapter, this.mSharedConnection);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    private void onFeedbackLog(final String str) {
        Log.m264558v(TAG, "OnFeedbackLog");
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC680444 */

            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onFeedbackLog(CronetWebsocketConnection.this, str);
                } catch (Exception e) {
                    Log.m264556e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private ByteBuffer clone(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        allocate.flip();
        return allocate;
    }

    private void postTaskToExecutor(Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (RejectedExecutionException e) {
            Log.m264556e(TAG, "Exception posting task to executor", e);
        }
    }

    @Override // com.ttnet.org.chromium.net.TTWebsocketConnection
    public void asyncSendBinary(ByteBuffer byteBuffer) {
        synchronized (this.mWebsocketAdapterLock) {
            long j = this.mWebsocketAdapter;
            if (j != 0) {
                nativeSendBinary(j, byteBuffer);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.TTWebsocketConnection
    public void asyncSendText(String str) {
        synchronized (this.mWebsocketAdapterLock) {
            long j = this.mWebsocketAdapter;
            if (j != 0) {
                nativeSendText(j, str);
            }
        }
    }

    private void onConnectionStateChanged(final int i, final String str) {
        this.mState.set(i);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC680411 */

            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onConnectionStateChanged(CronetWebsocketConnection.this, i, str);
                } catch (Exception e) {
                    Log.m264556e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onMessageReceived(ByteBuffer byteBuffer, final int i) {
        Log.m264558v(TAG, "onMessageReceived");
        final ByteBuffer clone = clone(byteBuffer);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC680433 */

            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onMessageReceived(CronetWebsocketConnection.this, clone, i);
                } catch (Exception e) {
                    Log.m264556e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onConnectionError(final int i, final String str, final String str2) {
        String str3 = TAG;
        Log.m264556e(str3, "onConnectionError: " + str2, new Object[0]);
        this.mState.set(i);
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC680422 */

            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onConnectionError(CronetWebsocketConnection.this, i, str, str2);
                } catch (Exception e) {
                    Log.m264556e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onTrafficChanged(final String str, final long j, final long j2, final boolean z) {
        Log.m264558v(TAG, "OnTrafficChanged");
        postTaskToExecutor(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC680455 */

            public void run() {
                try {
                    CronetWebsocketConnection.this.mCallback.onTrafficChanged(CronetWebsocketConnection.this, str, j, j2, z);
                } catch (Exception e) {
                    Log.m264556e(CronetWebsocketConnection.TAG, "Exception in callback: ", e);
                }
            }
        });
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, TTWebsocketConnection.Callback callback, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mUrlList = list;
        this.mParams = map;
        this.mHeaders = map2;
        this.mSharedConnection = z;
        this.mUseFrontier = false;
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, TTWebsocketConnection.Callback callback, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mCallback = callback;
        this.mExecutor = executor;
        this.mUrlList = list;
        this.mAppId = i;
        this.mAppKey = str;
        this.mDeviceId = j;
        this.mFpid = i2;
        this.mInstallId = j2;
        this.mSessionId = str2;
        this.mAppVersion = i3;
        this.mAppToken = str3;
        this.mParams = map;
        this.mHeaders = map2;
        this.mSharedConnection = z;
    }
}
