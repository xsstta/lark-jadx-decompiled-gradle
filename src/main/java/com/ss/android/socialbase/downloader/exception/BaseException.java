package com.ss.android.socialbase.downloader.exception;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.socialbase.downloader.utils.C60161d;

public class BaseException extends Exception implements Parcelable {
    public static final Parcelable.Creator<BaseException> CREATOR = new Parcelable.Creator<BaseException>() {
        /* class com.ss.android.socialbase.downloader.exception.BaseException.C600791 */

        /* renamed from: a */
        public BaseException[] newArray(int i) {
            return new BaseException[i];
        }

        /* renamed from: a */
        public BaseException createFromParcel(Parcel parcel) {
            return new BaseException(parcel);
        }
    };
    private int errorCode;
    private String errorMsg;

    public int describeContents() {
        return 0;
    }

    public BaseException() {
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public String toString() {
        return "BaseException{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + '\'' + '}';
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    protected BaseException(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
    }

    public BaseException(int i, Throwable th) {
        this(i, C60161d.m233824i(th));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public BaseException(int i, String str) {
        super("[d-ex]:" + str);
        this.errorMsg = "[d-ex]:" + str;
        this.errorCode = i;
    }
}
