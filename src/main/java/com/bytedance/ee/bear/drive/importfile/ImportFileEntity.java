package com.bytedance.ee.bear.drive.importfile;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public class ImportFileEntity implements Parcelable {
    public static final Parcelable.Creator<ImportFileEntity> CREATOR = new Parcelable.Creator<ImportFileEntity>() {
        /* class com.bytedance.ee.bear.drive.importfile.ImportFileEntity.C69761 */

        /* renamed from: a */
        public ImportFileEntity[] newArray(int i) {
            return new ImportFileEntity[i];
        }

        /* renamed from: a */
        public ImportFileEntity createFromParcel(Parcel parcel) {
            return new ImportFileEntity(parcel);
        }
    };

    /* renamed from: a */
    public HashMap<String, String> f18858a = new HashMap<>();

    /* renamed from: b */
    private String f18859b = "";

    /* renamed from: c */
    private String f18860c = "";

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo27485a() {
        return this.f18859b;
    }

    /* renamed from: b */
    public String mo27487b() {
        return this.f18860c;
    }

    /* renamed from: c */
    public HashMap<String, String> mo27488c() {
        return this.f18858a;
    }

    /* renamed from: a */
    public void mo27486a(HashMap<String, String> hashMap) {
        this.f18858a = hashMap;
    }

    protected ImportFileEntity(Parcel parcel) {
        this.f18859b = parcel.readString();
        this.f18860c = parcel.readString();
        this.f18858a = parcel.readHashMap(ImportFileEntity.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18859b);
        parcel.writeString(this.f18860c);
        parcel.writeMap(this.f18858a);
    }

    public ImportFileEntity(String str, String str2) {
        this.f18859b = str;
        this.f18860c = str2;
    }
}
