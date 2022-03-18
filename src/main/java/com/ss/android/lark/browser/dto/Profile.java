package com.ss.android.lark.browser.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Profile implements Parcelable, Serializable {
    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>() {
        /* class com.ss.android.lark.browser.dto.Profile.C299031 */

        /* renamed from: a */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }

        /* renamed from: a */
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel);
        }
    };
    private String email;
    private String employeeId;
    private String gender;
    private String name;

    public int describeContents() {
        return 0;
    }

    public static Parcelable.Creator<Profile> getCREATOR() {
        return CREATOR;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Profile{name='" + this.name + '\'' + ", gender='" + this.gender + '\'' + ", email='" + this.email + '\'' + ", employeeId='" + this.employeeId + '\'' + '}';
    }

    protected Profile(Parcel parcel) {
        this.name = parcel.readString();
        this.gender = parcel.readString();
        this.email = parcel.readString();
        this.employeeId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.gender);
        parcel.writeString(this.email);
        parcel.writeString(this.employeeId);
    }

    public Profile(String str, String str2, String str3, String str4) {
        this.name = str;
        this.gender = str2;
        this.email = str3;
        this.employeeId = str4;
    }
}
