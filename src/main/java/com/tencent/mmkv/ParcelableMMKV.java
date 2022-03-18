package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.IOException;

public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new Parcelable.Creator<ParcelableMMKV>() {
        /* class com.tencent.mmkv.ParcelableMMKV.C656611 */

        /* renamed from: a */
        public ParcelableMMKV[] newArray(int i) {
            return new ParcelableMMKV[i];
        }

        /* renamed from: a */
        public ParcelableMMKV createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                return null;
            }
            return new ParcelableMMKV(readString, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), readString2);
        }
    };

    /* renamed from: a */
    private String f165417a;

    /* renamed from: b */
    private int f165418b;

    /* renamed from: c */
    private int f165419c;

    /* renamed from: d */
    private String f165420d;

    public int describeContents() {
        return 1;
    }

    /* renamed from: a */
    public MMKV mo229854a() {
        int i;
        int i2 = this.f165418b;
        if (i2 < 0 || (i = this.f165419c) < 0) {
            return null;
        }
        return MMKV.mmkvWithAshmemFD(this.f165417a, i2, i, this.f165420d);
    }

    public ParcelableMMKV(MMKV mmkv) {
        this.f165418b = -1;
        this.f165419c = -1;
        this.f165417a = mmkv.mmapID();
        this.f165418b = mmkv.ashmemFD();
        this.f165419c = mmkv.ashmemMetaFD();
        this.f165420d = mmkv.cryptKey();
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.f165417a);
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.f165418b);
            ParcelFileDescriptor fromFd2 = ParcelFileDescriptor.fromFd(this.f165419c);
            int i2 = i | 1;
            fromFd.writeToParcel(parcel, i2);
            fromFd2.writeToParcel(parcel, i2);
            String str = this.f165420d;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ParcelableMMKV(String str, int i, int i2, String str2) {
        this.f165418b = -1;
        this.f165419c = -1;
        this.f165417a = str;
        this.f165418b = i;
        this.f165419c = i2;
        this.f165420d = str2;
    }
}
