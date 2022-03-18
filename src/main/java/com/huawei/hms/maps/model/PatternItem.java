package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;

public class PatternItem implements Parcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new Parcelable.Creator<PatternItem>() {
        /* class com.huawei.hms.maps.model.PatternItem.C237181 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PatternItem createFromParcel(Parcel parcel) {
            return PatternItem.m86911a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PatternItem[] newArray(int i) {
            return new PatternItem[i];
        }
    };
    public static final int TYPE_DASH = 0;
    public static final int TYPE_DOT = 1;
    public static final int TYPE_GAP = 2;
    public float length;
    public int type;

    public PatternItem(int i, float f) {
        this.type = i;
        this.length = f;
    }

    /* renamed from: a */
    protected static PatternItem m86911a(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int readInt = parcelReader.readInt(2, 0);
        float readFloat = parcelReader.readFloat(3, BitmapDescriptorFactory.HUE_RED);
        return readInt == 0 ? new Dash(readFloat) : readInt == 1 ? new Dot() : readInt == 2 ? new Gap(readFloat) : new PatternItem(readInt, readFloat);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.type == patternItem.type && Objects.equal(Float.valueOf(this.length), Float.valueOf(patternItem.length));
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.type), Float.valueOf(this.length));
    }

    public String toString() {
        return "The patternItem type is" + this.type + " and length is" + String.valueOf(this.length);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.type);
        parcelWrite.writeFloat(3, this.length);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
