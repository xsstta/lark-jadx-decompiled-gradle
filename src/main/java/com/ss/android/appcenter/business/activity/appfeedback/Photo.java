package com.ss.android.appcenter.business.activity.appfeedback;

import java.io.Serializable;
import java.util.Objects;

public class Photo implements Serializable {
    private long duration;
    private int height;
    private int id;
    private String mimeType;
    private String path;
    public int position;
    private long size;
    private int width;

    public Photo() {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Photo photo = (Photo) obj;
        if (this.id == photo.id && this.duration == photo.duration && Objects.equals(this.path, photo.path)) {
            return Objects.equals(this.mimeType, photo.mimeType);
        }
        return false;
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
