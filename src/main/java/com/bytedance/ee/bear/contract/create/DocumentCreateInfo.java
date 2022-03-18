package com.bytedance.ee.bear.contract.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.p700c.C13598b;

public class DocumentCreateInfo implements Parcelable {
    public static final Parcelable.Creator<DocumentCreateInfo> CREATOR = new Parcelable.Creator<DocumentCreateInfo>() {
        /* class com.bytedance.ee.bear.contract.create.DocumentCreateInfo.C51231 */

        /* renamed from: a */
        public DocumentCreateInfo[] newArray(int i) {
            return new DocumentCreateInfo[i];
        }

        /* renamed from: a */
        public DocumentCreateInfo createFromParcel(Parcel parcel) {
            return new DocumentCreateInfo(parcel);
        }
    };

    /* renamed from: a */
    public String f14842a;

    /* renamed from: b */
    public String f14843b;

    /* renamed from: c */
    public String f14844c;

    /* renamed from: d */
    public String f14845d;

    /* renamed from: e */
    public String f14846e;

    /* renamed from: f */
    public int f14847f;

    public int describeContents() {
        return 0;
    }

    public DocumentCreateInfo() {
    }

    /* renamed from: a */
    public String mo20273a() {
        return this.f14842a;
    }

    /* renamed from: b */
    public String mo20274b() {
        return this.f14843b;
    }

    /* renamed from: c */
    public String mo20275c() {
        return this.f14845d;
    }

    public String toString() {
        return "DocumentCreateInfo{token='" + C13598b.m55197d(this.f14842a) + '\'' + ", objToken='" + C13598b.m55197d(this.f14843b) + '\'' + ", templateToken='" + C13598b.m55197d(this.f14844c) + '\'' + '}';
    }

    protected DocumentCreateInfo(Parcel parcel) {
        this.f14842a = parcel.readString();
        this.f14843b = parcel.readString();
        this.f14844c = parcel.readString();
        this.f14845d = parcel.readString();
        this.f14846e = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14842a);
        parcel.writeString(this.f14843b);
        parcel.writeString(this.f14844c);
        parcel.writeString(this.f14845d);
        parcel.writeString(this.f14846e);
    }

    public DocumentCreateInfo(String str, String str2, String str3, String str4, String str5, int i) {
        this.f14842a = str;
        this.f14843b = str2;
        this.f14844c = str3;
        this.f14845d = str4;
        this.f14846e = str5;
        this.f14847f = i;
    }
}
