package com.tt.refer.impl.business.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class DependComponent implements Parcelable {
    public static final Parcelable.Creator<DependComponent> CREATOR = new Parcelable.Creator<DependComponent>() {
        /* class com.tt.refer.impl.business.meta.DependComponent.C679321 */

        /* renamed from: a */
        public DependComponent[] newArray(int i) {
            return new DependComponent[i];
        }

        /* renamed from: a */
        public DependComponent createFromParcel(Parcel parcel) {
            return new DependComponent(parcel);
        }
    };
    @SerializedName("name")

    /* renamed from: a */
    private String f171151a;

    public int describeContents() {
        return 0;
    }

    public DependComponent() {
    }

    /* renamed from: a */
    public String mo235708a() {
        return this.f171151a;
    }

    /* renamed from: a */
    public void mo235709a(String str) {
        this.f171151a = str;
    }

    protected DependComponent(Parcel parcel) {
        this.f171151a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f171151a);
    }
}
