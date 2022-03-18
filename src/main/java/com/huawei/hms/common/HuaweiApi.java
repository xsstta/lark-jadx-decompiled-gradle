package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.ConnectionManagerKey;
import com.huawei.hms.common.internal.HuaweiApiManager;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class HuaweiApi<TOption extends Api.ApiOptions> {
    private static final String TAG = "HuaweiApi";
    private int apiLevel = 1;
    private String innerHmsPkg;
    private boolean isFirstReqSent = false;
    private WeakReference<Activity> mActivity;
    private String mAppID;
    private AbstractClientBuilder<?, TOption> mClientBuilder;
    private ConnectionManagerKey<TOption> mConnectionManagerKey;
    private Context mContext;
    private String mCpID;
    private String mHostAppid;
    private HuaweiApiManager mHuaweiApiManager;
    private int mKitSdkVersion;
    private TOption mOption;
    private SubAppInfo mSubAppInfo;

    public int getApiLevel() {
        return this.apiLevel;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public ConnectionManagerKey<TOption> getConnectionManagerKey() {
        return this.mConnectionManagerKey;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getKitSdkVersion() {
        return this.mKitSdkVersion;
    }

    public TOption getOption() {
        return this.mOption;
    }

    /* access modifiers changed from: protected */
    public List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.mSubAppInfo.getSubAppID();
    }

    public AbstractC23432f<Boolean> disconnectService() {
        C23433g<Boolean> gVar = new C23433g<>();
        this.mHuaweiApiManager.disconnectService(this, gVar);
        return gVar.mo81844a();
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setInnerHms() {
        this.innerHmsPkg = this.mContext.getPackageName();
        HMSLog.m86966i(TAG, "init inner hms pkg info:" + this.innerHmsPkg);
    }

    /* access modifiers changed from: protected */
    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.mContext.getPackageName(), this.mContext.getClass().getName(), getScopes(), this.mHostAppid, null, this.mSubAppInfo);
        clientSettings.setCpID(this.mCpID);
        if (TextUtils.isEmpty(this.innerHmsPkg)) {
            this.innerHmsPkg = HMSPackageManager.getInstance(this.mContext).getHMSPackageName();
            HMSLog.m86966i(TAG, "inner hms is empty,hms pkg name is " + this.innerHmsPkg);
        }
        clientSettings.setInnerHmsPkg(this.innerHmsPkg);
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setKitSdkVersion(int i) {
        this.mKitSdkVersion = i;
    }

    private void initBI(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    private <TResult, TClient extends AnyClient> AbstractC23432f<TResult> sendRequest(TaskApiCall<TClient, TResult> taskApiCall) {
        C23433g<TResult> gVar;
        if (taskApiCall.getToken() == null) {
            gVar = new C23433g<>();
        } else {
            gVar = new C23433g<>(taskApiCall.getToken());
        }
        this.mHuaweiApiManager.sendRequest(this, taskApiCall, gVar);
        return gVar.mo81844a();
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    public <TResult, TClient extends AnyClient> AbstractC23432f<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        String str;
        this.isFirstReqSent = true;
        if (taskApiCall == null) {
            HMSLog.m86964e(TAG, "in doWrite:taskApiCall is null");
            C23433g gVar = new C23433g();
            gVar.mo81845a((Exception) new ApiException(Status.FAILURE));
            return gVar.mo81844a();
        }
        if (TextUtils.isEmpty(this.mSubAppInfo.getSubAppID())) {
            str = this.mAppID;
        } else {
            str = this.mSubAppInfo.getSubAppID();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.mContext, taskApiCall.getUri(), str, taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        return sendRequest(taskApiCall);
    }

    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.m86966i(TAG, "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.mSubAppInfo;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.m86964e(TAG, "subAppInfo is already set");
            return false;
        } else if (subAppInfo == null) {
            HMSLog.m86964e(TAG, "subAppInfo is null");
            return false;
        } else {
            String subAppID = subAppInfo.getSubAppID();
            if (TextUtils.isEmpty(subAppID)) {
                HMSLog.m86964e(TAG, "subAppId is empty");
                return false;
            } else if (subAppID.equals(this.mHostAppid)) {
                HMSLog.m86964e(TAG, "subAppId is host appid");
                return false;
            } else if (this.isFirstReqSent) {
                HMSLog.m86964e(TAG, "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
                return false;
            } else {
                this.mSubAppInfo = new SubAppInfo(subAppInfo);
                return true;
            }
        }
    }

    public AnyClient getClient(Looper looper, HuaweiApiManager.ConnectionManager connectionManager) {
        return this.mClientBuilder.buildClient(this.mContext, getClientSetting(), connectionManager, connectionManager);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, str);
    }

    private void init(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mHuaweiApiManager = HuaweiApiManager.getInstance(applicationContext);
        this.mConnectionManagerKey = ConnectionManagerKey.createConnectionManagerKey(context, api, toption, str);
        this.mOption = toption;
        this.mClientBuilder = abstractClientBuilder;
        String appId = Util.getAppId(context);
        this.mHostAppid = appId;
        this.mAppID = appId;
        this.mCpID = Util.getCpId(context);
        this.mSubAppInfo = new SubAppInfo("");
        this.mKitSdkVersion = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.mHostAppid)) {
                HMSLog.m86964e(TAG, "subAppId is host appid");
            } else {
                HMSLog.m86966i(TAG, "subAppId is " + str);
                this.mSubAppInfo = new SubAppInfo(str);
            }
        }
        initBI(context);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, str);
    }
}
