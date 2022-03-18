package com.tt.miniapphost.process.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.tt.miniapphost.util.ProcessUtil;

public class CrossProcessCallEntity implements Parcelable {
    public static final Parcelable.Creator<CrossProcessCallEntity> CREATOR = new Parcelable.Creator<CrossProcessCallEntity>() {
        /* class com.tt.miniapphost.process.data.CrossProcessCallEntity.C675721 */

        /* renamed from: a */
        public CrossProcessCallEntity[] newArray(int i) {
            return new CrossProcessCallEntity[i];
        }

        /* renamed from: a */
        public CrossProcessCallEntity createFromParcel(Parcel parcel) {
            return new CrossProcessCallEntity(parcel);
        }
    };

    /* renamed from: a */
    private final String f170388a;

    /* renamed from: b */
    private final String f170389b;

    /* renamed from: c */
    private final String f170390c;

    /* renamed from: d */
    private final CrossProcessDataEntity f170391d;

    /* renamed from: e */
    private final CrossProcessDataEntity f170392e;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo234725a() {
        return this.f170388a;
    }

    /* renamed from: b */
    public String mo234726b() {
        return this.f170389b;
    }

    /* renamed from: c */
    public String mo234727c() {
        return this.f170390c;
    }

    /* renamed from: d */
    public CrossProcessDataEntity mo234728d() {
        return this.f170391d;
    }

    /* renamed from: e */
    public CrossProcessDataEntity mo234730e() {
        return this.f170392e;
    }

    public String toString() {
        return "CrossProcessCallEntity{mCallerProcessIdentify: " + this.f170388a + ",mCallType: " + this.f170390c + ",callData: " + this.f170391d + ",mCallExtraData: " + this.f170392e + "}";
    }

    protected CrossProcessCallEntity(Parcel parcel) {
        this.f170388a = parcel.readString();
        this.f170389b = parcel.readString();
        this.f170390c = parcel.readString();
        this.f170391d = (CrossProcessDataEntity) parcel.readParcelable(CrossProcessDataEntity.class.getClassLoader());
        this.f170392e = (CrossProcessDataEntity) parcel.readParcelable(CrossProcessDataEntity.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170388a);
        parcel.writeString(this.f170389b);
        parcel.writeString(this.f170390c);
        parcel.writeParcelable(this.f170391d, i);
        parcel.writeParcelable(this.f170392e, i);
    }

    public CrossProcessCallEntity(String str, String str2, CrossProcessDataEntity crossProcessDataEntity) {
        this.f170388a = ProcessUtil.getProcessIdentify();
        this.f170389b = str;
        this.f170390c = str2;
        this.f170391d = crossProcessDataEntity;
        this.f170392e = null;
    }

    public CrossProcessCallEntity(String str, String str2, CrossProcessDataEntity crossProcessDataEntity, CrossProcessDataEntity crossProcessDataEntity2) {
        this.f170388a = ProcessUtil.getProcessIdentify();
        this.f170389b = str;
        this.f170390c = str2;
        this.f170391d = crossProcessDataEntity;
        this.f170392e = crossProcessDataEntity2;
    }
}
