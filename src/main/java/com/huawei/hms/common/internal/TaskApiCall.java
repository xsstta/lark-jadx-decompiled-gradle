package com.huawei.hms.common.internal;

import android.os.Parcelable;
import com.huawei.hmf.tasks.AbstractC23417a;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.log.HMSLog;

public abstract class TaskApiCall<ClientT extends AnyClient, ResultT> {
    private static final String TAG = "TaskApiCall";
    private int apiLevel = 1;
    private final String mRequestJson;
    private final String mUri;
    private Parcelable parcelable;
    private AbstractC23417a token;
    private String transactionId;

    /* access modifiers changed from: protected */
    public abstract void doExecute(ClientT clientt, ResponseErrorCode responseErrorCode, String str, C23433g<ResultT> gVar);

    public int getMinApkVersion() {
        return 30000000;
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public Parcelable getParcelable() {
        return this.parcelable;
    }

    public String getRequestJson() {
        return this.mRequestJson;
    }

    public AbstractC23417a getToken() {
        return this.token;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getUri() {
        return this.mUri;
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setParcelable(Parcelable parcelable2) {
        this.parcelable = parcelable2;
    }

    public void setToken(AbstractC23417a aVar) {
        this.token = aVar;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public TaskApiCall(String str, String str2) {
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = null;
    }

    public TaskApiCall(String str, String str2, String str3) {
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = str3;
    }

    public TaskApiCall(String str, String str2, String str3, int i) {
        this.mUri = str;
        this.mRequestJson = str2;
        this.parcelable = null;
        this.transactionId = str3;
        this.apiLevel = i;
    }

    public final void onResponse(ClientT clientt, ResponseErrorCode responseErrorCode, String str, C23433g<ResultT> gVar) {
        AbstractC23417a aVar = this.token;
        if (aVar == null || !aVar.mo81819a()) {
            doExecute(clientt, responseErrorCode, str, gVar);
            return;
        }
        HMSLog.m86966i(TAG, "This Task has been canceled, uri:" + this.mUri + ", transactionId:" + this.transactionId);
    }
}
