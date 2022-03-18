package com.ss.android.lark.watermark.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import java.util.Objects;

public class WatermarkInfo implements Parcelable {
    public static final Parcelable.Creator<WatermarkInfo> CREATOR = new Parcelable.Creator<WatermarkInfo>() {
        /* class com.ss.android.lark.watermark.dto.WatermarkInfo.C582741 */

        @Override // android.os.Parcelable.Creator
        public WatermarkInfo[] newArray(int i) {
            return new WatermarkInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public WatermarkInfo createFromParcel(Parcel parcel) {
            return new WatermarkInfo(parcel);
        }
    };
    private float alpha;
    private int bgColor;
    private boolean globalWatermark;
    private String watermarkContent;
    private String watermarkTag;

    public int describeContents() {
        return 0;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public int getBgColor() {
        return this.bgColor;
    }

    public String getWatermarkContent() {
        return this.watermarkContent;
    }

    public String getWatermarkTag() {
        return this.watermarkTag;
    }

    public boolean isGlobalWatermark() {
        return this.globalWatermark;
    }

    public WatermarkInfo() {
        this.bgColor = R.color.lkui_transparent;
        this.alpha = 0.1f;
    }

    public static class Builder {
        private float alpha = 0.1f;
        private int bgColor = R.color.lkui_transparent;
        private boolean globalWatermark;
        private String watermarkContent;
        private String watermarkTag;

        public WatermarkInfo build() {
            return new WatermarkInfo(this.watermarkContent, this.watermarkTag, this.bgColor, this.alpha, this.globalWatermark);
        }

        public Builder alpha(float f) {
            this.alpha = f;
            return this;
        }

        public Builder bgColor(int i) {
            this.bgColor = i;
            return this;
        }

        public Builder tag(String str) {
            this.watermarkTag = str;
            return this;
        }

        public Builder watermarkStrategy(boolean z) {
            this.globalWatermark = z;
            return this;
        }

        public Builder(String str) {
            this.watermarkContent = str;
            this.watermarkTag = str;
        }
    }

    public int hashCode() {
        return Objects.hash(this.watermarkContent, this.watermarkTag, Integer.valueOf(this.bgColor), Float.valueOf(this.alpha));
    }

    public String toString() {
        return "WatermarkInfo{watermarkContent='" + this.watermarkContent + '\'' + ", watermarkTag='" + this.watermarkTag + '\'' + ", bgColor=" + this.bgColor + ", alpha=" + this.alpha + ", globalWatermark=" + this.globalWatermark + '}';
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setBgColor(int i) {
        this.bgColor = i;
    }

    public void setGlobalWatermark(boolean z) {
        this.globalWatermark = z;
    }

    public void setWatermarkContent(String str) {
        this.watermarkContent = str;
    }

    public void setWatermarkTag(String str) {
        this.watermarkTag = str;
    }

    protected WatermarkInfo(Parcel parcel) {
        boolean z;
        this.bgColor = R.color.lkui_transparent;
        this.alpha = 0.1f;
        this.watermarkContent = parcel.readString();
        this.watermarkTag = parcel.readString();
        this.bgColor = parcel.readInt();
        this.alpha = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.globalWatermark = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.watermarkContent);
        parcel.writeString(this.watermarkTag);
        parcel.writeInt(this.bgColor);
        parcel.writeFloat(this.alpha);
        parcel.writeByte(this.globalWatermark ? (byte) 1 : 0);
    }

    private WatermarkInfo(String str, String str2, int i, float f, boolean z) {
        this.bgColor = R.color.lkui_transparent;
        this.alpha = 0.1f;
        this.watermarkContent = str;
        this.watermarkTag = str2;
        this.bgColor = i;
        this.alpha = f;
        this.globalWatermark = z;
    }
}
