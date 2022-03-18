package com.ss.android.lark.widget.photo_picker.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;

public class Photo implements Parcelable, Serializable {
    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() {
        /* class com.ss.android.lark.widget.photo_picker.entity.Photo.C586381 */

        /* renamed from: a */
        public Photo[] newArray(int i) {
            return new Photo[i];
        }

        /* renamed from: a */
        public Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }
    };
    private String compressPath;
    private long duration;
    private int height;
    private int id;
    private boolean isChecked;
    private String mimeType;
    private int num;
    private String path;
    private String pictureType;
    public int position;
    private long size;
    private int width;

    public int describeContents() {
        return 0;
    }

    public Photo() {
    }

    public String getCompressPath() {
        return this.compressPath;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public int getId() {
        return this.id;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public int getNum() {
        return this.num;
    }

    public String getPath() {
        return this.path;
    }

    public String getPictureType() {
        return this.pictureType;
    }

    public int getPosition() {
        return this.position;
    }

    public long getSize() {
        return this.size;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isVideo() {
        if (TextUtils.isEmpty(this.mimeType) || !this.mimeType.startsWith("video")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = this.id * 31;
        String str = this.path;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.mimeType;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j = this.duration;
        return ((i4 + i3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public Photo setHeight(int i) {
        this.height = i;
        return this;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setNum(int i) {
        this.num = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPictureType(String str) {
        this.pictureType = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public Photo(Photo photo) {
        this.id = photo.id;
        this.path = photo.path;
        this.mimeType = photo.mimeType;
        this.duration = photo.duration;
        this.isChecked = photo.isChecked;
        this.position = photo.position;
        this.num = photo.num;
        this.pictureType = photo.pictureType;
        this.width = photo.width;
        this.height = photo.height;
        this.size = photo.size;
        this.compressPath = photo.compressPath;
    }

    protected Photo(Parcel parcel) {
        boolean z;
        this.position = parcel.readInt();
        this.id = parcel.readInt();
        this.path = parcel.readString();
        this.mimeType = parcel.readString();
        this.duration = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isChecked = z;
        this.num = parcel.readInt();
        this.pictureType = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.size = parcel.readLong();
        this.compressPath = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Photo photo = (Photo) obj;
        if (this.id != photo.id || this.duration != photo.duration) {
            return false;
        }
        String str = this.path;
        if (str == null ? photo.path != null : !str.equals(photo.path)) {
            return false;
        }
        String str2 = this.mimeType;
        String str3 = photo.mimeType;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.position);
        parcel.writeInt(this.id);
        parcel.writeString(this.path);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.duration);
        parcel.writeByte(this.isChecked ? (byte) 1 : 0);
        parcel.writeInt(this.num);
        parcel.writeString(this.pictureType);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.size);
        parcel.writeString(this.compressPath);
    }

    public Photo(int i, String str, String str2, long j, int i2, int i3, long j2) {
        this.id = i;
        this.path = str;
        this.mimeType = str2;
        this.duration = j;
        this.width = i2;
        this.height = i3;
        this.size = j2;
    }
}
