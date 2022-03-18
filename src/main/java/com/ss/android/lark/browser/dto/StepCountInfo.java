package com.ss.android.lark.browser.dto;

import android.os.Parcel;
import android.os.Parcelable;

public class StepCountInfo implements Parcelable {
    public static final Parcelable.Creator<StepCountInfo> CREATOR = new Parcelable.Creator<StepCountInfo>() {
        /* class com.ss.android.lark.browser.dto.StepCountInfo.C299061 */

        /* renamed from: a */
        public StepCountInfo[] newArray(int i) {
            return new StepCountInfo[i];
        }

        /* renamed from: a */
        public StepCountInfo createFromParcel(Parcel parcel) {
            return new StepCountInfo(parcel);
        }
    };

    /* renamed from: a */
    private int f74635a;

    public int describeContents() {
        return 0;
    }

    public StepCountInfo() {
    }

    /* renamed from: a */
    public int mo107762a() {
        return this.f74635a;
    }

    /* renamed from: a */
    public void mo107763a(int i) {
        this.f74635a = i;
    }

    protected StepCountInfo(Parcel parcel) {
        this.f74635a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f74635a);
    }
}
