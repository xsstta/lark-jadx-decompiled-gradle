package com.ss.android.lark.mediapicker.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;

public class LocalMedia implements Parcelable, Serializable {
    public static final Parcelable.Creator<LocalMedia> CREATOR = new Parcelable.Creator<LocalMedia>() {
        /* class com.ss.android.lark.mediapicker.entity.LocalMedia.C446791 */

        /* renamed from: a */
        public LocalMedia[] newArray(int i) {
            return new LocalMedia[i];
        }

        /* renamed from: a */
        public LocalMedia createFromParcel(Parcel parcel) {
            return new LocalMedia(parcel);
        }
    };
    private long duration;
    private int height;
    private int id;
    private boolean isChecked;
    private String mimeType;
    private int num;
    private String path;
    public int position;
    private long size;
    private int width;

    public int describeContents() {
        return 0;
    }

    public LocalMedia() {
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

    public boolean isImage() {
        if (TextUtils.isEmpty(this.mimeType) || !this.mimeType.startsWith("image")) {
            return false;
        }
        return true;
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

    public void setDuration(long j) {
        this.duration = j;
    }

    public LocalMedia setHeight(int i) {
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

    public void setPosition(int i) {
        this.position = i;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public LocalMedia(LocalMedia localMedia) {
        this.id = localMedia.id;
        this.path = localMedia.path;
        this.mimeType = localMedia.mimeType;
        this.duration = localMedia.duration;
        this.isChecked = localMedia.isChecked;
        this.position = localMedia.position;
        this.num = localMedia.num;
        this.width = localMedia.width;
        this.height = localMedia.height;
        this.size = localMedia.size;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (this.duration != localMedia.duration) {
            return false;
        }
        String str = this.path;
        if (str == null ? localMedia.path != null : !str.equals(localMedia.path)) {
            return false;
        }
        String str2 = this.mimeType;
        String str3 = localMedia.mimeType;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    protected LocalMedia(Parcel parcel) {
        boolean z;
        this.id = parcel.readInt();
        this.path = parcel.readString();
        this.mimeType = parcel.readString();
        this.duration = parcel.readLong();
        this.position = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.size = parcel.readLong();
        this.num = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isChecked = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.path);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.position);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.size);
        parcel.writeInt(this.num);
        parcel.writeByte(this.isChecked ? (byte) 1 : 0);
    }

    public LocalMedia(int i, String str, String str2, long j, int i2, int i3, long j2) {
        this.id = i;
        this.path = str;
        this.mimeType = str2;
        this.duration = j;
        this.width = i2;
        this.height = i3;
        this.size = j2;
    }
}
