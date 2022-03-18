package com.tt.miniapp.manager.appinfo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class AppInfoRequestResult implements Parcelable {
    public static final Parcelable.Creator<AppInfoRequestResult> CREATOR = new Parcelable.Creator<AppInfoRequestResult>() {
        /* class com.tt.miniapp.manager.appinfo.AppInfoRequestResult.C664071 */

        /* renamed from: a */
        public AppInfoRequestResult[] newArray(int i) {
            return new AppInfoRequestResult[i];
        }

        /* renamed from: a */
        public AppInfoRequestResult createFromParcel(Parcel parcel) {
            return new AppInfoRequestResult(parcel);
        }
    };

    /* renamed from: a */
    public String f167647a;

    /* renamed from: b */
    public String f167648b;

    /* renamed from: c */
    public String f167649c;

    /* renamed from: d */
    public long f167650d;

    /* renamed from: e */
    public long f167651e;

    /* renamed from: f */
    public long f167652f;

    /* renamed from: g */
    public long f167653g;

    /* renamed from: h */
    public int f167654h;

    /* renamed from: i */
    public ArrayList<RequestMetaRecord> f167655i = new ArrayList<>();

    public int describeContents() {
        return 0;
    }

    public static class RequestMetaRecord implements Parcelable {
        public static final Parcelable.Creator<RequestMetaRecord> CREATOR = new Parcelable.Creator<RequestMetaRecord>() {
            /* class com.tt.miniapp.manager.appinfo.AppInfoRequestResult.RequestMetaRecord.C664081 */

            /* renamed from: a */
            public RequestMetaRecord[] newArray(int i) {
                return new RequestMetaRecord[i];
            }

            /* renamed from: a */
            public RequestMetaRecord createFromParcel(Parcel parcel) {
                return new RequestMetaRecord(parcel);
            }
        };

        /* renamed from: a */
        public String f167656a;

        /* renamed from: b */
        public long f167657b;

        /* renamed from: c */
        public long f167658c;

        /* renamed from: d */
        public long f167659d;

        /* renamed from: e */
        public long f167660e;

        /* renamed from: f */
        public int f167661f;

        /* renamed from: g */
        public String f167662g;

        /* renamed from: h */
        public String f167663h;

        /* renamed from: i */
        public String f167664i;

        public int describeContents() {
            return 0;
        }

        public RequestMetaRecord() {
        }

        public String toString() {
            return "RequestMetaRecord{url='" + this.f167656a + '\'' + ", startTimeStamp=" + this.f167657b + ", startCpuTime=" + this.f167658c + ", stopTimeStamp=" + this.f167659d + ", stopCpuTime=" + this.f167660e + ", code=" + this.f167661f + ", data='" + this.f167662g + '\'' + ", message='" + this.f167663h + '\'' + ", throwable='" + this.f167664i + '\'' + '}';
        }

        protected RequestMetaRecord(Parcel parcel) {
            this.f167656a = parcel.readString();
            this.f167657b = parcel.readLong();
            this.f167658c = parcel.readLong();
            this.f167659d = parcel.readLong();
            this.f167660e = parcel.readLong();
            this.f167661f = parcel.readInt();
            this.f167662g = parcel.readString();
            this.f167663h = parcel.readString();
            this.f167664i = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f167656a);
            parcel.writeLong(this.f167657b);
            parcel.writeLong(this.f167658c);
            parcel.writeLong(this.f167659d);
            parcel.writeLong(this.f167660e);
            parcel.writeInt(this.f167661f);
            parcel.writeString(this.f167662g);
            parcel.writeString(this.f167663h);
            parcel.writeString(this.f167664i);
        }
    }

    public AppInfoRequestResult() {
    }

    public String toString() {
        return "AppInfoRequestResult{appId='" + this.f167647a + '\'' + ", encryKey='" + this.f167648b + '\'' + ", encryIV='" + this.f167649c + '\'' + ", generateMetaParamsBegin=" + this.f167650d + ", generateMetaParamsEnd=" + this.f167651e + ", generateMetaParamsBeginCpuTime=" + this.f167652f + ", generateMetaParamsEndCpuTime=" + this.f167653g + ", fromProcess=" + this.f167654h + ", requestRecordList=" + this.f167655i.get(0).toString() + '}';
    }

    protected AppInfoRequestResult(Parcel parcel) {
        this.f167647a = parcel.readString();
        this.f167648b = parcel.readString();
        this.f167649c = parcel.readString();
        this.f167650d = parcel.readLong();
        this.f167651e = parcel.readLong();
        this.f167652f = parcel.readLong();
        this.f167653g = parcel.readLong();
        this.f167654h = parcel.readInt();
        this.f167655i = parcel.createTypedArrayList(RequestMetaRecord.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f167647a);
        parcel.writeString(this.f167648b);
        parcel.writeString(this.f167649c);
        parcel.writeLong(this.f167650d);
        parcel.writeLong(this.f167651e);
        parcel.writeLong(this.f167652f);
        parcel.writeLong(this.f167653g);
        parcel.writeInt(this.f167654h);
        parcel.writeTypedList(this.f167655i);
    }
}
