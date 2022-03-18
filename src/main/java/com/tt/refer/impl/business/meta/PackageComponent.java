package com.tt.refer.impl.business.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PackageComponent implements Parcelable {
    public static final Parcelable.Creator<PackageComponent> CREATOR = new Parcelable.Creator<PackageComponent>() {
        /* class com.tt.refer.impl.business.meta.PackageComponent.C679441 */

        /* renamed from: a */
        public PackageComponent[] newArray(int i) {
            return new PackageComponent[i];
        }

        /* renamed from: a */
        public PackageComponent createFromParcel(Parcel parcel) {
            return new PackageComponent(parcel);
        }
    };
    @SerializedName("path")

    /* renamed from: a */
    public List<String> f171181a;
    @SerializedName("pages")

    /* renamed from: b */
    public List<String> f171182b;
    @SerializedName("md5")

    /* renamed from: c */
    private String f171183c;
    @SerializedName("independent")

    /* renamed from: d */
    private boolean f171184d;

    public int describeContents() {
        return 0;
    }

    public PackageComponent() {
    }

    /* renamed from: a */
    public String mo235792a() {
        return this.f171183c;
    }

    /* renamed from: c */
    public List<String> mo235798c() {
        return this.f171182b;
    }

    /* renamed from: d */
    public List<String> mo235799d() {
        return this.f171181a;
    }

    /* renamed from: b */
    public String mo235796b() {
        List<String> list = this.f171181a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f171181a.get(0);
    }

    /* renamed from: b */
    public void mo235797b(List<String> list) {
        this.f171181a = list;
    }

    /* renamed from: a */
    public void mo235793a(String str) {
        this.f171183c = str;
    }

    /* renamed from: a */
    public void mo235794a(List<String> list) {
        this.f171182b = list;
    }

    /* renamed from: a */
    public void mo235795a(boolean z) {
        this.f171184d = z;
    }

    protected PackageComponent(Parcel parcel) {
        this.f171183c = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f171184d = zArr[0];
        this.f171181a = parcel.createStringArrayList();
        this.f171182b = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f171183c);
        parcel.writeBooleanArray(new boolean[]{this.f171184d});
        parcel.writeStringList(this.f171181a);
        parcel.writeStringList(this.f171182b);
    }
}
