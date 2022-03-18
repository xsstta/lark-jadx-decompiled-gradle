package com.ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class HttpHeader implements Parcelable, Comparable {
    public static final Parcelable.Creator<HttpHeader> CREATOR = new Parcelable.Creator<HttpHeader>() {
        /* class com.ss.android.socialbase.downloader.model.HttpHeader.C601211 */

        /* renamed from: a */
        public HttpHeader[] newArray(int i) {
            return new HttpHeader[i];
        }

        /* renamed from: a */
        public HttpHeader createFromParcel(Parcel parcel) {
            return new HttpHeader(parcel);
        }
    };
    private final String name;
    private final String value;

    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        String str = this.name;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = i * 31;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    protected HttpHeader(Parcel parcel) {
        this.name = parcel.readString();
        this.value = parcel.readString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof HttpHeader)) {
            return 1;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.name, httpHeader.getName())) {
            return 0;
        }
        String str = this.name;
        if (str == null) {
            return -1;
        }
        int compareTo = str.compareTo(httpHeader.getName());
        if (compareTo > 0) {
            return 1;
        }
        if (compareTo < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (!TextUtils.equals(this.name, httpHeader.name) || !TextUtils.equals(this.value, httpHeader.value)) {
            return false;
        }
        return true;
    }

    public HttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }
}
