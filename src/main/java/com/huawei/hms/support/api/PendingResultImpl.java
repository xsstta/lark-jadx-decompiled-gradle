package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {
    private static final String TAG = "PendingResultImpl";
    private WeakReference<ApiClient> api;
    public CountDownLatch countLatch;
    private boolean isNeedReport = true;
    public R result = null;
    private String transId = null;
    protected DatagramTransport transport = null;
    private String url = null;

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void cancel() {
    }

    /* access modifiers changed from: protected */
    public boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t);

    /* access modifiers changed from: protected */
    public static class CallbackHandler<R extends Result> extends Handler {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.huawei.hms.support.api.PendingResultImpl$CallbackHandler<R extends com.huawei.hms.support.api.client.Result> */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            if (message.what == 1) {
                Pair pair = (Pair) message.obj;
                send((ResultCallback) pair.first, (Result) pair.second);
            }
        }

        /* access modifiers changed from: protected */
        public void send(ResultCallback<? super R> resultCallback, R r) {
            resultCallback.onResult(r);
        }

        public void post(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }
    }

    /* access modifiers changed from: protected */
    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.m86966i(TAG, "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread();
        }
        HMSLog.m86964e(TAG, "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        HMSLog.m86966i(TAG, "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.m86964e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m86964e(TAG, "client invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.send(apiClient, new DatagramTransport.CallBack() {
            /* class com.huawei.hms.support.api.PendingResultImpl.C237851 */

            @Override // com.huawei.hms.support.api.transport.DatagramTransport.CallBack
            public void onCallback(int i, IMessageEntity iMessageEntity) {
                PendingResultImpl.this.setResult(i, iMessageEntity);
                PendingResultImpl.this.countLatch.countDown();
            }
        });
        try {
            this.countLatch.await();
        } catch (InterruptedException unused) {
            HMSLog.m86964e(TAG, "await in anythread InterruptedException");
            setResult(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.isNeedReport = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    /* access modifiers changed from: protected */
    public R onError(int i) {
        Type type;
        Class<?> cls;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        } else {
            type = null;
        }
        if (type != null) {
            cls = GenericTypeReflector.getType(type);
        } else {
            cls = null;
        }
        if (cls != null) {
            try {
                R r = (R) ((Result) cls.newInstance());
                this.result = r;
                r.setStatus(new Status(i));
            } catch (Exception e) {
                HMSLog.m86964e(TAG, "on Error:" + e.getMessage());
                return null;
            }
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        HMSLog.m86966i(TAG, "await timeout:" + j + " unit:" + timeUnit.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread(j, timeUnit);
        }
        HMSLog.m86966i(TAG, "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, final ResultCallback<R> resultCallback) {
        HMSLog.m86966i(TAG, "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        final CallbackHandler callbackHandler = new CallbackHandler(looper);
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.m86964e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m86964e(TAG, "client is invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            callbackHandler.post(resultCallback, this.result);
            return;
        }
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.post(apiClient, new DatagramTransport.CallBack() {
            /* class com.huawei.hms.support.api.PendingResultImpl.C237873 */

            @Override // com.huawei.hms.support.api.transport.DatagramTransport.CallBack
            public void onCallback(int i, IMessageEntity iMessageEntity) {
                PendingResultImpl.this.setResult(i, iMessageEntity);
                callbackHandler.post(resultCallback, PendingResultImpl.this.result);
            }
        });
    }

    private void biReportEvent(int i, int i2) {
        SubAppInfo subAppInfo;
        HMSLog.m86966i(TAG, "biReportEvent ====== ");
        ApiClient apiClient = this.api.get();
        if (apiClient != null && this.url != null && !HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HashMap hashMap = new HashMap();
            hashMap.put("package", apiClient.getPackageName());
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "5.0.5.300");
            if (i2 == 1) {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
            } else {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
                hashMap.put("result", String.valueOf(i));
                R r = this.result;
                if (!(r == null || r.getStatus() == null)) {
                    hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.result.getStatus().getStatusCode()));
                }
            }
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "0");
            String appId = Util.getAppId(apiClient.getContext());
            if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
                appId = subAppInfo.getSubAppID();
            }
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appId);
            if (TextUtils.isEmpty(this.transId)) {
                String id = TransactionIdCreater.getId(appId, this.url);
                this.transId = id;
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id);
            } else {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, this.transId);
                this.transId = null;
            }
            String[] split = this.url.split("\\.");
            if (split.length >= 2) {
                hashMap.put("service", split[0]);
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APINAME, split[1]);
            }
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_CALLTMEI, String.valueOf(System.currentTimeMillis()));
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
            HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, hashMap);
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j, TimeUnit timeUnit) {
        HMSLog.m86966i(TAG, "awaitOnAnyThread timeout:" + j + " unit:" + timeUnit.toString());
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.m86964e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.m86964e(TAG, "client invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.post(apiClient, new DatagramTransport.CallBack() {
            /* class com.huawei.hms.support.api.PendingResultImpl.C237862 */

            @Override // com.huawei.hms.support.api.transport.DatagramTransport.CallBack
            public void onCallback(int i, IMessageEntity iMessageEntity) {
                if (!atomicBoolean.get()) {
                    PendingResultImpl.this.setResult(i, iMessageEntity);
                }
                PendingResultImpl.this.countLatch.countDown();
            }
        });
        try {
            if (!this.countLatch.await(j, timeUnit)) {
                atomicBoolean.set(true);
                setResult(CommonCode.ErrorCode.EXECUTE_TIMEOUT, null);
            }
        } catch (InterruptedException unused) {
            HMSLog.m86964e(TAG, "awaitOnAnyThread InterruptedException");
            setResult(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.result;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.huawei.hms.core.aidl.IMessageEntity */
    /* JADX WARN: Multi-variable type inference failed */
    public void setResult(int i, IMessageEntity iMessageEntity) {
        Status status;
        Status status2;
        HMSLog.m86966i(TAG, "setResult:" + i);
        if (iMessageEntity instanceof AbstractMessageEntity) {
            status = ((AbstractMessageEntity) iMessageEntity).getCommonStatus();
        } else {
            status = null;
        }
        if (i == 0) {
            this.result = onComplete(iMessageEntity);
        } else {
            this.result = onError(i);
        }
        if (this.isNeedReport) {
            biReportEvent(i, 2);
        }
        R r = this.result;
        if (r != null && (status2 = r.getStatus()) != null && status != null) {
            int statusCode = status2.getStatusCode();
            String statusMessage = status2.getStatusMessage();
            int statusCode2 = status.getStatusCode();
            String statusMessage2 = status.getStatusMessage();
            if (statusCode != statusCode2) {
                HMSLog.m86964e(TAG, "rstStatus code (" + statusCode + ") is not equal commonStatus code (" + statusCode2 + ")");
                HMSLog.m86964e(TAG, "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
            } else if (TextUtils.isEmpty(statusMessage) && !TextUtils.isEmpty(statusMessage2)) {
                HMSLog.m86966i(TAG, "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
                this.result.setStatus(new Status(statusCode, statusMessage2, status2.getResolution()));
            }
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        init(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i) {
        init(apiClient, str, iMessageEntity, getResponseType(), i);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        init(apiClient, str, iMessageEntity, cls, 0);
    }

    private void init(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i) {
        HMSLog.m86966i(TAG, "init uri:" + str);
        this.url = str;
        if (apiClient == null) {
            HMSLog.m86964e(TAG, "client is null");
            return;
        }
        this.api = new WeakReference<>(apiClient);
        this.countLatch = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.m86964e(TAG, "gen transport error:" + e.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e.getMessage(), e);
        }
    }
}
