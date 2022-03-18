package com.tt.miniapp.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.tt.miniapphost.entity.MediaEntity;
import java.util.ArrayList;

public class Folder implements Parcelable {
    public static final Parcelable.Creator<Folder> CREATOR = new Parcelable.Creator<Folder>() {
        /* class com.tt.miniapp.entity.Folder.C660061 */

        /* renamed from: a */
        public Folder[] newArray(int i) {
            return new Folder[i];
        }

        /* renamed from: a */
        public Folder createFromParcel(Parcel parcel) {
            return new Folder(parcel);
        }
    };

    /* renamed from: a */
    public String f166623a;

    /* renamed from: b */
    public int f166624b;

    /* renamed from: c */
    ArrayList<MediaEntity> f166625c = new ArrayList<>();

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public ArrayList<MediaEntity> mo231045a() {
        return this.f166625c;
    }

    /* renamed from: a */
    public void mo231046a(MediaEntity mediaEntity) {
        this.f166625c.add(mediaEntity);
    }

    public Folder(String str) {
        this.f166623a = str;
    }

    protected Folder(Parcel parcel) {
        this.f166623a = parcel.readString();
        this.f166624b = parcel.readInt();
        this.f166625c = parcel.createTypedArrayList(MediaEntity.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f166623a);
        parcel.writeInt(this.f166624b);
        parcel.writeTypedList(this.f166625c);
    }
}
