package com.bytedance.ee.bear.contract.feed;

import android.os.Parcel;
import android.os.Parcelable;

public class FeedAssisantModel implements Parcelable {
    public static final Parcelable.Creator<FeedAssisantModel> CREATOR = new Parcelable.Creator<FeedAssisantModel>() {
        /* class com.bytedance.ee.bear.contract.feed.FeedAssisantModel.C51721 */

        /* renamed from: a */
        public FeedAssisantModel[] newArray(int i) {
            return new FeedAssisantModel[i];
        }

        /* renamed from: a */
        public FeedAssisantModel createFromParcel(Parcel parcel) {
            return new FeedAssisantModel(parcel);
        }
    };

    /* renamed from: a */
    private String f14899a;

    /* renamed from: b */
    private String f14900b;

    /* renamed from: c */
    private String f14901c;

    public int describeContents() {
        return 0;
    }

    public FeedAssisantModel() {
    }

    protected FeedAssisantModel(Parcel parcel) {
        this.f14899a = parcel.readString();
        this.f14900b = parcel.readString();
        this.f14901c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14899a);
        parcel.writeString(this.f14900b);
        parcel.writeString(this.f14901c);
    }
}
