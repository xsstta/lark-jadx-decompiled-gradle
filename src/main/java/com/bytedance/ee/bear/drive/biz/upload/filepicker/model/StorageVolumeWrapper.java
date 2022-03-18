package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.storage.StorageVolume;
import com.bytedance.ee.log.C13479a;

public final class StorageVolumeWrapper implements Parcelable {
    public static final Parcelable.Creator<StorageVolumeWrapper> CREATOR = new Parcelable.Creator<StorageVolumeWrapper>() {
        /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.model.StorageVolumeWrapper.C67981 */

        /* renamed from: a */
        public StorageVolumeWrapper[] newArray(int i) {
            return new StorageVolumeWrapper[i];
        }

        /* renamed from: a */
        public StorageVolumeWrapper createFromParcel(Parcel parcel) {
            return new StorageVolumeWrapper(parcel);
        }
    };

    /* renamed from: a */
    private StorageVolume f18480a;

    /* renamed from: b */
    private int f18481b;

    /* renamed from: c */
    private long f18482c;

    /* renamed from: d */
    private long f18483d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo26747a() {
        return this.f18481b;
    }

    /* renamed from: b */
    public long mo26749b() {
        return this.f18482c;
    }

    /* renamed from: c */
    public long mo26750c() {
        return this.f18483d;
    }

    public String toString() {
        return "StorageVolumeWrapper{storageVolume=" + this.f18480a + '}';
    }

    /* renamed from: a */
    public String mo26748a(Context context) {
        try {
            return this.f18480a.getDescription(context);
        } catch (Exception e) {
            C13479a.m54759a("StorageVolumeWrapper", "getDescription: ", e);
            return "";
        }
    }

    public StorageVolumeWrapper(Parcel parcel) {
        this.f18480a = (StorageVolume) parcel.readParcelable(StorageVolume.class.getClassLoader());
        this.f18481b = parcel.readInt();
        this.f18482c = parcel.readLong();
        this.f18483d = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18480a, i);
        parcel.writeInt(this.f18481b);
        parcel.writeLong(this.f18482c);
        parcel.writeLong(this.f18483d);
    }
}
