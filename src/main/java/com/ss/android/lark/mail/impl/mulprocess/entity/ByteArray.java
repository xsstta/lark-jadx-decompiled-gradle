package com.ss.android.lark.mail.impl.mulprocess.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class ByteArray implements Parcelable {
    public static final Parcelable.Creator<ByteArray> CREATOR = new Parcelable.Creator<ByteArray>() {
        /* class com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray.C432171 */

        /* renamed from: a */
        public ByteArray[] newArray(int i) {
            return new ByteArray[i];
        }

        /* renamed from: a */
        public ByteArray createFromParcel(Parcel parcel) {
            return new ByteArray(parcel);
        }
    };

    /* renamed from: a */
    private byte[] f109978a;

    public int describeContents() {
        return 0;
    }

    public ByteArray() {
    }

    /* renamed from: a */
    public byte[] mo154623a() {
        return this.f109978a;
    }

    /* renamed from: a */
    public void mo154622a(byte[] bArr) {
        this.f109978a = bArr;
    }

    public ByteArray(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f109978a = bArr;
        parcel.readByteArray(bArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f109978a.length);
        parcel.writeByteArray(this.f109978a);
    }
}
