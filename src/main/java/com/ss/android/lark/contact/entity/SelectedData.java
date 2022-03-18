package com.ss.android.lark.contact.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class SelectedData implements Parcelable, Serializable {
    public static final Parcelable.Creator<SelectedData> CREATOR = new Parcelable.Creator<SelectedData>() {
        /* class com.ss.android.lark.contact.entity.SelectedData.C353991 */

        /* renamed from: a */
        public SelectedData[] newArray(int i) {
            return new SelectedData[i];
        }

        /* renamed from: a */
        public SelectedData createFromParcel(Parcel parcel) {
            return new SelectedData(parcel);
        }
    };
    private static final long serialVersionUID = -5081739513370342806L;
    public String avatarKey;
    public DataType dataType;
    public String description;
    public int descriptionDrawable;
    public String id;
    public boolean isRegistered = true;
    public boolean isShowDescription;
    public String name;

    public int describeContents() {
        return 0;
    }

    public enum DataType {
        CHATTER(1),
        CHAT(2),
        UNKNOWN(0),
        DEPARTAMENT(3);
        
        public int value;

        public int getNumber() {
            return this.value;
        }

        public static DataType valueOf(int i) {
            return forNumber(i);
        }

        public static DataType forNumber(int i) {
            if (i == 1) {
                return CHATTER;
            }
            if (i == 2) {
                return CHAT;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return DEPARTAMENT;
        }

        private DataType(int i) {
            this.value = i;
        }
    }

    public SelectedData() {
    }

    public void addToBundle(Bundle bundle) {
        bundle.putParcelable("selected_data", this);
    }

    public static SelectedData getFromBundle(Bundle bundle) {
        return (SelectedData) bundle.getParcelable("selected_data");
    }

    public SelectedData(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.dataType = DataType.forNumber(parcel.readInt());
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.avatarKey = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.isRegistered = z;
        this.isShowDescription = parcel.readInt() != 1 ? false : z2;
        this.description = parcel.readString();
        this.descriptionDrawable = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        DataType dataType2 = this.dataType;
        if (dataType2 != null) {
            i2 = dataType2.value;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.avatarKey);
        parcel.writeInt(this.isRegistered ? 1 : 0);
        parcel.writeInt(this.isShowDescription ? 1 : 0);
        parcel.writeString(this.description);
        parcel.writeInt(this.descriptionDrawable);
    }

    public SelectedData(DataType dataType2, String str, String str2, String str3, boolean z, boolean z2, String str4, int i) {
        this.dataType = dataType2;
        this.id = str;
        this.name = str2;
        this.avatarKey = str3;
        this.isRegistered = z;
        this.isShowDescription = z2;
        this.description = str4;
        this.descriptionDrawable = i;
    }
}
