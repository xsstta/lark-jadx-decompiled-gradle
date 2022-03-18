package com.huawei.hms.site.api.model;

import android.os.Parcel;
import android.os.Parcelable;

public class SearchStatus implements Parcelable {
    public static final Parcelable.Creator<SearchStatus> CREATOR = new Parcelable.Creator<SearchStatus>() {
        /* class com.huawei.hms.site.api.model.SearchStatus.C237451 */

        @Override // android.os.Parcelable.Creator
        public SearchStatus createFromParcel(Parcel parcel) {
            return new SearchStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SearchStatus[] newArray(int i) {
            return new SearchStatus[i];
        }
    };
    public String errorCode;
    public String errorMessage;

    public SearchStatus() {
    }

    public SearchStatus(Parcel parcel) {
        this.errorCode = parcel.readString();
        this.errorMessage = parcel.readString();
    }

    public SearchStatus(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
    }
}
