package com.huawei.hms.common.internal;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class HuaweiApiManager implements Handler.Callback {
    private static final String HANDLER_NAME = "HuaweiApiHandler";
    private static final Object LOCK_OBJECT = new Object();
    private static final int MSG_RECEIVE_SEND_REQ = 4;
    private static final String TAG = "HuaweiApiManager";
    private static HuaweiApiManager mInstance;
    public final Map<ConnectionManagerKey<?>, ConnectionManager<?>> mConnectionCache = new ConcurrentHashMap(5, 0.75f, 1);
    public final Handler mHandler;
    private final AtomicInteger mSerial = new AtomicInteger(0);

    /* access modifiers changed from: private */
    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        /* access modifiers changed from: package-private */
        public TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        /* access modifiers changed from: package-private */
        public AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }
    }

    public class ConnectionManager<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final Queue<TaskApiCallbackWrapper> callbackQueue = new LinkedList();
        public final HuaweiApi<OptionsT> mApi;
        public final AnyClient mClient;
        private final ConnectionManagerKey mConnectionManagerKey;
        private ConnectionResult mConnectionResult;
        private ResolveClientBean mResolveClientBean;

        /* access modifiers changed from: package-private */
        public boolean disconnect() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mClient.disconnect();
            return true;
        }

        public void innerConnected() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = null;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                postMessage(taskApiCallbackWrapper);
            }
            this.callbackQueue.clear();
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.m86961d(HuaweiApiManager.TAG, "onConnected");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnected();
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() {
                    /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.RunnableC235163 */

                    public void run() {
                        ConnectionManager.this.innerConnected();
                    }
                });
            }
        }

        private TaskApiCallbackWrapper wrapperRequest(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() {
                /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.C235141 */
                private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.m86964e(HuaweiApiManager.TAG, "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.m86964e(HuaweiApiManager.TAG, "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(ConnectionManager.this.mApi.getContext(), responseHeader, String.valueOf(ConnectionManager.this.mApi.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(ConnectionManager.this.mClient, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.m86966i(HuaweiApiManager.TAG, "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnectionFailed(connectionResult);
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() {
                    /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.RunnableC235152 */

                    public void run() {
                        ConnectionManager.this.innerConnectionFailed(connectionResult);
                    }
                });
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(final int i) {
            HMSLog.m86966i(HuaweiApiManager.TAG, "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnectionSuspended(i);
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() {
                    /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.RunnableC235174 */

                    public void run() {
                        ConnectionManager.this.innerConnectionSuspended(i);
                    }
                });
            }
        }

        private String errorReason(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.mApi.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode == 3) {
                        return "HuaWei Mobile Service is disabled";
                    }
                    if (errorCode != 8) {
                        if (errorCode != 10) {
                            if (errorCode == 13) {
                                return "update cancelled";
                            }
                            if (errorCode == 21) {
                                return "device is too old to be support";
                            }
                            switch (errorCode) {
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                                    return "failed to get update result";
                                case 26:
                                    return "update failed, because no activity incoming, can't pop update page";
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                                    return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                            }
                        }
                        return "application configuration error, please developer check configuration";
                    }
                    return "internal error";
                }
                return "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 != -1) {
                if (errorCode2 != 8) {
                    if (errorCode2 != 10) {
                        return "unknown errorReason";
                    }
                    return "application configuration error, please developer check configuration";
                }
                return "internal error";
            }
            return "get update result, but has other error codes";
            return "unknown errorReason";
        }

        /* access modifiers changed from: package-private */
        public synchronized void connect(int i) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            if (this.mClient.isConnected()) {
                HMSLog.m86961d(HuaweiApiManager.TAG, "client is connected");
            } else if (this.mClient.isConnecting()) {
                HMSLog.m86961d(HuaweiApiManager.TAG, "client is isConnecting");
            } else {
                if (this.mApi.getActivity() != null) {
                    if (this.mResolveClientBean == null) {
                        this.mResolveClientBean = new ResolveClientBean(this.mClient, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                        HMSLog.m86966i(HuaweiApiManager.TAG, "mResolveClientBean has already register, return!");
                        return;
                    }
                    BindResolveClients.getInstance().register(this.mResolveClientBean);
                }
                this.mClient.connect(i);
            }
        }

        public void innerConnectionSuspended(int i) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        /* access modifiers changed from: package-private */
        public void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.m86966i(HuaweiApiManager.TAG, "sendRequest");
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            TaskApiCallbackWrapper wrapperRequest = wrapperRequest(taskApiCallWrapper);
            int minApkVersion = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
            if (!this.mClient.isConnected()) {
                this.callbackQueue.add(wrapperRequest);
                ConnectionResult connectionResult = this.mConnectionResult;
                if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                    connect(minApkVersion);
                } else {
                    onConnectionFailed(this.mConnectionResult);
                }
            } else if (HMSPackageManager.getInstance(this.mApi.getContext()).hmsVerHigherThan(minApkVersion)) {
                postMessage(wrapperRequest);
            } else {
                disconnect();
                this.callbackQueue.add(wrapperRequest);
                connect(minApkVersion);
            }
        }

        private void postMessage(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + "|" + this.mApi.getSubAppID());
            requestHeader.setPkgName(this.mApi.getContext().getPackageName());
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), taskApiCallbackWrapper.getCallBack());
        }

        public void innerConnectionFailed(ConnectionResult connectionResult) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = connectionResult;
            boolean z = true;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + errorReason(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    z = false;
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        private String getTransactionId(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return TransactionIdCreater.getId(this.mApi.getAppID(), str2);
            }
            return str;
        }

        ConnectionManager(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(HuaweiApiManager.this.mHandler.getLooper(), this);
            this.mConnectionResult = null;
            this.mConnectionManagerKey = huaweiApi.getConnectionManagerKey();
        }
    }

    private void connectAndSendRequest(HandlerMessageWrapper handlerMessageWrapper) {
        HuaweiApi<?> huaweiApi = handlerMessageWrapper.mApi;
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            connectionManager = new ConnectionManager<>(huaweiApi);
            this.mConnectionCache.put(huaweiApi.getConnectionManagerKey(), connectionManager);
        }
        connectionManager.sendRequest((TaskApiCallWrapper) handlerMessageWrapper.mContentWrapper);
    }

    public static HuaweiApiManager getInstance(Context context) {
        synchronized (LOCK_OBJECT) {
            if (mInstance == null) {
                HandlerThread handlerThread = new HandlerThread(TAG);
                handlerThread.start();
                mInstance = new HuaweiApiManager(context.getApplicationContext(), handlerThread.getLooper(), HuaweiApiAvailability.getInstance());
            }
        }
        return mInstance;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 4) {
            HMSLog.m86967w(TAG, "Unknown message id: " + message.what);
            return false;
        }
        connectAndSendRequest((HandlerMessageWrapper) message.obj);
        return true;
    }

    public void disconnectService(final HuaweiApi<?> huaweiApi, final C23433g<Boolean> gVar) {
        if (Looper.myLooper() == this.mHandler.getLooper()) {
            innerDisconnect(huaweiApi, gVar);
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.huawei.hms.common.internal.HuaweiApiManager.RunnableC235131 */

                public void run() {
                    HuaweiApiManager.this.innerDisconnect(huaweiApi, gVar);
                }
            });
        }
    }

    public void innerDisconnect(HuaweiApi<?> huaweiApi, C23433g<Boolean> gVar) {
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            gVar.mo81846a((Boolean) false);
        } else {
            gVar.mo81846a(Boolean.valueOf(connectionManager.disconnect()));
        }
    }

    private HuaweiApiManager(Context context, Looper looper, HuaweiApiAvailability huaweiApiAvailability) {
        this.mHandler = new Handler(looper, this);
    }

    public final <TOption extends Api.ApiOptions, TResult> void sendRequest(HuaweiApi<TOption> huaweiApi, TaskApiCall<? extends AnyClient, TResult> taskApiCall, C23433g<TResult> gVar) {
        TaskApiCallWrapper taskApiCallWrapper = new TaskApiCallWrapper(taskApiCall, gVar);
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new HandlerMessageWrapper(taskApiCallWrapper, this.mSerial.getAndIncrement(), huaweiApi)));
    }
}
