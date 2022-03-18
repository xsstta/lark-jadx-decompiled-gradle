package com.he.jsbinding.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class SnapshotCreatorData implements Parcelable {
    public static final Parcelable.Creator<SnapshotCreatorData> CREATOR = new Parcelable.Creator<SnapshotCreatorData>() {
        /* class com.he.jsbinding.snapshot.SnapshotCreatorData.C233731 */

        @Override // android.os.Parcelable.Creator
        public SnapshotCreatorData[] newArray(int i) {
            return new SnapshotCreatorData[i];
        }

        @Override // android.os.Parcelable.Creator
        public SnapshotCreatorData createFromParcel(Parcel parcel) {
            return new SnapshotCreatorData(parcel);
        }
    };
    private String mAppId;
    private String mAppVersion;
    private String mJsSdkVersion;

    public int describeContents() {
        return 0;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getJsSdkVersion() {
        return this.mJsSdkVersion;
    }

    public int hashCode() {
        return Objects.hash(this.mAppId, this.mAppVersion, this.mJsSdkVersion);
    }

    public String toString() {
        return "SnapshotCreatorData{mAppId='" + this.mAppId + '\'' + ", mAppVersion='" + this.mAppVersion + '\'' + ", mJsSdkVersion='" + this.mJsSdkVersion + '\'' + '}';
    }

    protected SnapshotCreatorData(Parcel parcel) {
        this.mAppId = parcel.readString();
        this.mAppVersion = parcel.readString();
        this.mJsSdkVersion = parcel.readString();
    }

    public void readFromParcel(Parcel parcel) {
        this.mAppId = parcel.readString();
        this.mAppVersion = parcel.readString();
        this.mJsSdkVersion = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotCreatorData snapshotCreatorData = (SnapshotCreatorData) obj;
        if (!Objects.equals(this.mAppId, snapshotCreatorData.mAppId) || !Objects.equals(this.mAppVersion, snapshotCreatorData.mAppVersion) || !Objects.equals(this.mJsSdkVersion, snapshotCreatorData.mJsSdkVersion)) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAppId);
        parcel.writeString(this.mAppVersion);
        parcel.writeString(this.mJsSdkVersion);
    }

    public SnapshotCreatorData(String str, String str2, String str3) {
        this.mAppId = str;
        this.mAppVersion = str2;
        this.mJsSdkVersion = str3;
    }
}
