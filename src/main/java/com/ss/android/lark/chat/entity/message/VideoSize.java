package com.ss.android.lark.chat.entity.message;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoSize implements Parcelable {
    public static final Parcelable.Creator<VideoSize> CREATOR = new Parcelable.Creator<VideoSize>() {
        /* class com.ss.android.lark.chat.entity.message.VideoSize.C340051 */

        /* renamed from: a */
        public VideoSize[] newArray(int i) {
            return new VideoSize[i];
        }

        /* renamed from: a */
        public VideoSize createFromParcel(Parcel parcel) {
            return new VideoSize(parcel);
        }
    };

    /* renamed from: a */
    public int f87841a;

    /* renamed from: b */
    public int f87842b;

    public int describeContents() {
        return 0;
    }

    protected VideoSize(Parcel parcel) {
        this.f87841a = parcel.readInt();
        this.f87842b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f87841a);
        parcel.writeInt(this.f87842b);
    }
}
