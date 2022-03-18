package com.ss.android.lark.share.dto;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.biz.core.api.BaseShareData;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;

public class SystemShareData extends BaseShareData implements Parcelable {
    public static final Parcelable.Creator<SystemShareData> CREATOR = new Parcelable.Creator<SystemShareData>() {
        /* class com.ss.android.lark.share.dto.SystemShareData.C547211 */

        /* renamed from: a */
        public SystemShareData[] newArray(int i) {
            return new SystemShareData[i];
        }

        /* renamed from: a */
        public SystemShareData createFromParcel(Parcel parcel) {
            return new SystemShareData(parcel);
        }
    };
    private ArrayList<Uri> mFileUris;

    @Override // com.ss.android.lark.biz.core.api.BaseShareData
    public int describeContents() {
        return 0;
    }

    public SystemShareData() {
    }

    public ArrayList<Uri> getFileUris() {
        return this.mFileUris;
    }

    public void setFileUris(ArrayList<Uri> arrayList) {
        this.mFileUris = arrayList;
    }

    protected SystemShareData(Parcel parcel) {
        super(parcel);
        try {
            this.mFileUris = parcel.createTypedArrayList(Uri.CREATOR);
        } catch (RuntimeException e) {
            Log.m165387e("SystemShareData", (Throwable) e, true);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.BaseShareData
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.mFileUris);
    }
}
