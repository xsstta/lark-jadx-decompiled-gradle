package com.bytedance.ee.bear.middleground.permission.collaborator;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;

public class ShareUserInfoResult extends NetService.Result implements Parcelable {
    public static final Parcelable.Creator<ShareUserInfoResult> CREATOR = new Parcelable.Creator<ShareUserInfoResult>() {
        /* class com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult.C95931 */

        /* renamed from: a */
        public ShareUserInfoResult[] newArray(int i) {
            return new ShareUserInfoResult[i];
        }

        /* renamed from: a */
        public ShareUserInfoResult createFromParcel(Parcel parcel) {
            return new ShareUserInfoResult(parcel);
        }
    };
    private boolean hasMore;
    private boolean isExternal;
    private String lastLabel;
    private int totalNum;
    private ArrayList<UserInfo> userInfoList;

    public int describeContents() {
        return 0;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public String getLastLabel() {
        String str = this.lastLabel;
        if (str != null) {
            return str;
        }
        return "";
    }

    public ShareUserInfoResult() {
        this.userInfoList = new ArrayList<>();
    }

    public ArrayList<UserInfo> getUserInfoList() {
        ArrayList<UserInfo> arrayList = this.userInfoList;
        if (arrayList != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLastLabel(String str) {
        this.lastLabel = str;
    }

    public void setTotalNum(int i) {
        this.totalNum = i;
    }

    public void setUserInfoList(ArrayList<UserInfo> arrayList) {
        this.userInfoList = arrayList;
    }

    protected ShareUserInfoResult(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isExternal = z;
        this.userInfoList = parcel.createTypedArrayList(UserInfo.CREATOR);
        this.totalNum = parcel.readInt();
        this.hasMore = parcel.readByte() == 0 ? false : z2;
        this.lastLabel = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isExternal ? (byte) 1 : 0);
        parcel.writeTypedList(this.userInfoList);
        parcel.writeInt(this.totalNum);
        parcel.writeByte(this.hasMore ? (byte) 1 : 0);
        parcel.writeString(this.lastLabel);
    }
}
