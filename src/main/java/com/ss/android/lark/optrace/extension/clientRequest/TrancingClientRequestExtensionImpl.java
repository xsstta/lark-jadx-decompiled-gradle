package com.ss.android.lark.optrace.extension.clientRequest;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.extension.TracingExtension;

public class TrancingClientRequestExtensionImpl extends TrancingClientRequestExtension implements Parcelable {
    public static final Parcelable.Creator<TrancingClientRequestExtensionImpl> CREATOR = new Parcelable.Creator<TrancingClientRequestExtensionImpl>() {
        /* class com.ss.android.lark.optrace.extension.clientRequest.TrancingClientRequestExtensionImpl.C489401 */

        /* renamed from: a */
        public TrancingClientRequestExtensionImpl[] newArray(int i) {
            return new TrancingClientRequestExtensionImpl[i];
        }

        /* renamed from: a */
        public TrancingClientRequestExtensionImpl createFromParcel(Parcel parcel) {
            return new TrancingClientRequestExtensionImpl(parcel);
        }
    };
    private String requestId;

    public int describeContents() {
        return 0;
    }

    @Override // com.ss.android.lark.optrace.extension.TracingExtension
    public TracingExtension mergeExtension(TracingExtension tracingExtension) {
        return this;
    }

    public TrancingClientRequestExtensionImpl() {
    }

    @Override // com.ss.android.lark.optrace.extension.clientRequest.TrancingClientRequestExtension
    public String getRequestId() {
        return this.requestId;
    }

    protected TrancingClientRequestExtensionImpl(Parcel parcel) {
        this.requestId = parcel.readString();
    }

    @Override // com.ss.android.lark.optrace.extension.clientRequest.TrancingClientRequestExtension
    public void setRequestId(String str) {
        if (!TextUtils.isEmpty(this.requestId)) {
            Log.m165389i("TrancingClientRequestExtensionImpl", " requestid has generated " + str);
            return;
        }
        this.requestId = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.requestId);
    }
}
