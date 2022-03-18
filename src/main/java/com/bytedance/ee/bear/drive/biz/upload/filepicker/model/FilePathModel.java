package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

import android.os.Parcel;
import android.os.Parcelable;

public class FilePathModel implements Parcelable {
    public static final Parcelable.Creator<FilePathModel> CREATOR = new Parcelable.Creator<FilePathModel>() {
        /* class com.bytedance.ee.bear.drive.biz.upload.filepicker.model.FilePathModel.C67971 */

        /* renamed from: a */
        public FilePathModel[] newArray(int i) {
            return new FilePathModel[i];
        }

        /* renamed from: a */
        public FilePathModel createFromParcel(Parcel parcel) {
            return new FilePathModel(parcel);
        }
    };

    /* renamed from: a */
    private String f18478a;

    /* renamed from: b */
    private String f18479b;

    public int describeContents() {
        return 0;
    }

    public FilePathModel() {
    }

    /* renamed from: a */
    public String mo26680a() {
        return this.f18478a;
    }

    /* renamed from: b */
    public String mo26682b() {
        return this.f18479b;
    }

    /* renamed from: a */
    public void mo26681a(String str) {
        this.f18478a = str;
    }

    /* renamed from: b */
    public void mo26683b(String str) {
        this.f18479b = str;
    }

    protected FilePathModel(Parcel parcel) {
        this.f18478a = parcel.readString();
        this.f18479b = parcel.readString();
    }

    public FilePathModel(String str, String str2) {
        this.f18478a = str;
        this.f18479b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18478a);
        parcel.writeString(this.f18479b);
    }
}
