package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        /* class android.support.v4.media.session.ParcelableVolumeInfo.C01611 */

        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };

    /* renamed from: a */
    public int f360a;

    /* renamed from: b */
    public int f361b;

    /* renamed from: c */
    public int f362c;

    /* renamed from: d */
    public int f363d;

    /* renamed from: e */
    public int f364e;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f360a = parcel.readInt();
        this.f362c = parcel.readInt();
        this.f363d = parcel.readInt();
        this.f364e = parcel.readInt();
        this.f361b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f360a);
        parcel.writeInt(this.f362c);
        parcel.writeInt(this.f363d);
        parcel.writeInt(this.f364e);
        parcel.writeInt(this.f361b);
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f360a = i;
        this.f361b = i2;
        this.f362c = i3;
        this.f363d = i4;
        this.f364e = i5;
    }
}
