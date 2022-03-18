package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class DriveFile implements Parcelable {
    public static final Parcelable.Creator<DriveFile> CREATOR = new Parcelable.Creator<DriveFile>() {
        /* class com.ss.android.lark.mail.impl.entity.DriveFile.C420551 */

        /* renamed from: a */
        public DriveFile[] newArray(int i) {
            return new DriveFile[i];
        }

        /* renamed from: a */
        public DriveFile createFromParcel(Parcel parcel) {
            return new DriveFile(parcel);
        }
    };

    /* renamed from: a */
    private String f106734a;

    /* renamed from: b */
    private String f106735b;

    public int describeContents() {
        return 0;
    }

    public DriveFile() {
    }

    /* renamed from: a */
    public String mo151091a() {
        return this.f106734a;
    }

    /* renamed from: b */
    public String mo151093b() {
        return this.f106735b;
    }

    /* renamed from: a */
    public void mo151092a(String str) {
        this.f106734a = str;
    }

    /* renamed from: b */
    public void mo151094b(String str) {
        this.f106735b = str;
    }

    protected DriveFile(Parcel parcel) {
        this.f106734a = parcel.readString();
        this.f106735b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106734a);
        parcel.writeString(this.f106735b);
    }
}
