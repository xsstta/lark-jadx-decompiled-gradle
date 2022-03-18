package com.huawei.hms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

public class Tile implements Parcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new Parcelable.Creator<Tile>() {
        /* class com.huawei.hms.maps.model.Tile.C237271 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Tile createFromParcel(Parcel parcel) {
            return new Tile(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Tile[] newArray(int i) {
            return new Tile[i];
        }
    };
    public final byte[] data;
    public final int height;
    public final int width;

    public Tile(int i, int i2, byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    protected Tile(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.data = parcelReader.createByteArray(2, null);
        this.height = parcelReader.readInt(3, 0);
        this.width = parcelReader.readInt(4, 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeByteArray(2, this.data, false);
        parcelWrite.writeInt(3, this.height);
        parcelWrite.writeInt(4, this.width);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
