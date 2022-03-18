package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DriveFileOperationMask implements Parcelable {
    public static final Parcelable.Creator<DriveFileOperationMask> CREATOR = new Parcelable.Creator<DriveFileOperationMask>() {
        /* class com.ss.android.lark.mail.impl.entity.DriveFileOperationMask.C420561 */

        /* renamed from: a */
        public DriveFileOperationMask[] newArray(int i) {
            return new DriveFileOperationMask[i];
        }

        /* renamed from: a */
        public DriveFileOperationMask createFromParcel(Parcel parcel) {
            return new DriveFileOperationMask(parcel);
        }
    };

    /* renamed from: a */
    private int f106736a;

    /* renamed from: b */
    private boolean f106737b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Operation {
    }

    public int describeContents() {
        return 0;
    }

    public DriveFileOperationMask() {
    }

    /* renamed from: b */
    public void mo151104b() {
        this.f106736a |= 1;
    }

    /* renamed from: d */
    public boolean mo151106d() {
        return !this.f106737b;
    }

    /* renamed from: a */
    public boolean mo151103a() {
        if ((this.f106736a & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo151105c() {
        if ((this.f106736a & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo151102a(boolean z) {
        this.f106737b = z;
    }

    /* renamed from: a */
    public void mo151101a(int i) {
        this.f106736a = i | this.f106736a;
    }

    protected DriveFileOperationMask(Parcel parcel) {
        this.f106736a = parcel.readInt();
        this.f106737b = parcel.readInt() != 1 ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106736a);
        parcel.writeInt(this.f106737b ? 1 : 0);
    }
}
