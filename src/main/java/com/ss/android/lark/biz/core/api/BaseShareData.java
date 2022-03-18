package com.ss.android.lark.biz.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class BaseShareData implements Parcelable, Serializable {
    public static final Parcelable.Creator<BaseShareData> CREATOR = new Parcelable.Creator<BaseShareData>() {
        /* class com.ss.android.lark.biz.core.api.BaseShareData.C295291 */

        /* renamed from: a */
        public BaseShareData[] newArray(int i) {
            return new BaseShareData[i];
        }

        /* renamed from: a */
        public BaseShareData createFromParcel(Parcel parcel) {
            return new BaseShareData(parcel);
        }
    };
    private boolean isSdkShare;
    private String mAdditionNote;
    private String mContent;
    private boolean mLocalShare;
    private String mPackageName;
    private String mSource;
    private boolean mSupportAdditionNote;
    private String mTitle;
    private int mType = -1;

    public int describeContents() {
        return 0;
    }

    public String getAdditionNote() {
        return this.mAdditionNote;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public String getSource() {
        return this.mSource;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public boolean isLocalShare() {
        return this.mLocalShare;
    }

    public boolean isSdkShare() {
        return this.isSdkShare;
    }

    public boolean isSupportAdditionNote() {
        return this.mSupportAdditionNote;
    }

    public BaseShareData() {
    }

    public void setAdditionNote(String str) {
        this.mAdditionNote = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setLocalShare(boolean z) {
        this.mLocalShare = z;
    }

    public void setPackageName(String str) {
        this.mPackageName = str;
    }

    public void setSdkShare(boolean z) {
        this.isSdkShare = z;
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setSupportAdditionNote(boolean z) {
        this.mSupportAdditionNote = z;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setType(int i) {
        this.mType = i;
    }

    protected BaseShareData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.mTitle = parcel.readString();
        this.mContent = parcel.readString();
        this.mSource = parcel.readString();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mLocalShare = z;
        this.mAdditionNote = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mSupportAdditionNote = z2;
        this.mType = parcel.readInt();
        this.isSdkShare = parcel.readByte() == 0 ? false : z3;
        this.mPackageName = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mContent);
        parcel.writeString(this.mSource);
        parcel.writeByte(this.mLocalShare ? (byte) 1 : 0);
        parcel.writeString(this.mAdditionNote);
        parcel.writeByte(this.mSupportAdditionNote ? (byte) 1 : 0);
        parcel.writeInt(this.mType);
        parcel.writeByte(this.isSdkShare ? (byte) 1 : 0);
        parcel.writeString(this.mPackageName);
    }
}
