package com.serenegiant.usb;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class Size implements Parcelable {
    public static final Parcelable.Creator<Size> CREATOR = new Parcelable.Creator<Size>() {
        /* class com.serenegiant.usb.Size.C271671 */

        @Override // android.os.Parcelable.Creator
        public Size[] newArray(int i) {
            return new Size[i];
        }

        @Override // android.os.Parcelable.Creator
        public Size createFromParcel(Parcel parcel) {
            return new Size(parcel);
        }
    };
    public float[] fps;
    public int frameIntervalIndex;
    public int frameIntervalType;
    private String frameRates;
    public int frame_type;
    public int height;
    public int index;
    public int[] intervals;
    public int type;
    public int width;

    public int describeContents() {
        return 0;
    }

    public float getCurrentFrameRate() throws IllegalStateException {
        int i;
        float[] fArr = this.fps;
        if (fArr != null) {
            i = fArr.length;
        } else {
            i = 0;
        }
        int i2 = this.frameIntervalIndex;
        if (i2 >= 0 && i2 < i) {
            return fArr[i2];
        }
        throw new IllegalStateException("unknown frame rate or not ready");
    }

    public String toString() {
        float f;
        try {
            f = getCurrentFrameRate();
        } catch (Exception unused) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return String.format(Locale.US, "Size(%dx%d@%4.1f,type:%d,frame:%d,index:%d,%s)", Integer.valueOf(this.width), Integer.valueOf(this.height), Float.valueOf(f), Integer.valueOf(this.type), Integer.valueOf(this.frame_type), Integer.valueOf(this.index), this.frameRates);
    }

    public void updateFrameRate() {
        int i;
        int i2 = this.frameIntervalType;
        if (i2 > 0) {
            this.fps = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                this.fps[i3] = 1.0E7f / ((float) this.intervals[i3]);
            }
        } else if (i2 == 0) {
            try {
                int[] iArr = this.intervals;
                int min = Math.min(iArr[0], iArr[1]);
                int[] iArr2 = this.intervals;
                int max = Math.max(iArr2[0], iArr2[1]);
                int i4 = this.intervals[2];
                if (i4 > 0) {
                    int i5 = 0;
                    for (int i6 = min; i6 <= max; i6 += i4) {
                        i5++;
                    }
                    this.fps = new float[i5];
                    int i7 = 0;
                    while (min <= max) {
                        this.fps[i7] = 1.0E7f / ((float) min);
                        min += i4;
                        i7++;
                    }
                } else {
                    float f = 1.0E7f / ((float) min);
                    int i8 = 0;
                    for (float f2 = f; f2 <= f; f2 += 1.0f) {
                        i8++;
                    }
                    this.fps = new float[i8];
                    float f3 = f;
                    int i9 = 0;
                    while (f3 <= f) {
                        int i10 = i9 + 1;
                        this.fps[i9] = f3;
                        f3 += 1.0f;
                        i9 = i10;
                    }
                }
            } catch (Exception unused) {
                this.fps = null;
            }
        }
        float[] fArr = this.fps;
        if (fArr != null) {
            i = fArr.length;
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i11 = 0; i11 < i; i11++) {
            sb.append(String.format(Locale.US, "%4.1f", Float.valueOf(this.fps[i11])));
            if (i11 < i - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        this.frameRates = sb.toString();
        if (this.frameIntervalIndex > i) {
            this.frameIntervalIndex = 0;
        }
    }

    public void setCurrentFrameRate(float f) {
        int i;
        float[] fArr = this.fps;
        int i2 = 0;
        if (fArr != null) {
            i = fArr.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (this.fps[i2] <= f) {
                break;
            } else {
                i2++;
            }
        }
        this.frameIntervalIndex = i2;
    }

    public Size set(Size size) {
        int i;
        if (size != null) {
            this.type = size.type;
            this.frame_type = size.frame_type;
            this.index = size.index;
            this.width = size.width;
            this.height = size.height;
            this.frameIntervalType = size.frameIntervalType;
            this.frameIntervalIndex = size.frameIntervalIndex;
            int[] iArr = size.intervals;
            if (iArr != null) {
                i = iArr.length;
            } else {
                i = -1;
            }
            if (i > 0) {
                int[] iArr2 = new int[i];
                this.intervals = iArr2;
                System.arraycopy(size.intervals, 0, iArr2, 0, i);
            } else {
                this.intervals = null;
            }
            updateFrameRate();
        }
        return this;
    }

    private Size(Parcel parcel) {
        this.type = parcel.readInt();
        this.frame_type = parcel.readInt();
        this.index = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameIntervalType = parcel.readInt();
        this.frameIntervalIndex = parcel.readInt();
        int i = this.frameIntervalType;
        if (i >= 0) {
            if (i > 0) {
                this.intervals = new int[i];
            } else {
                this.intervals = new int[3];
            }
            parcel.readIntArray(this.intervals);
        } else {
            this.intervals = null;
        }
        updateFrameRate();
    }

    public Size(Size size) {
        int i;
        this.type = size.type;
        this.frame_type = size.frame_type;
        this.index = size.index;
        this.width = size.width;
        this.height = size.height;
        this.frameIntervalType = size.frameIntervalType;
        this.frameIntervalIndex = size.frameIntervalIndex;
        int[] iArr = size.intervals;
        if (iArr != null) {
            i = iArr.length;
        } else {
            i = -1;
        }
        if (i > 0) {
            int[] iArr2 = new int[i];
            this.intervals = iArr2;
            System.arraycopy(size.intervals, 0, iArr2, 0, i);
        } else {
            this.intervals = null;
        }
        updateFrameRate();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.frame_type);
        parcel.writeInt(this.index);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.frameIntervalType);
        parcel.writeInt(this.frameIntervalIndex);
        int[] iArr = this.intervals;
        if (iArr != null) {
            parcel.writeIntArray(iArr);
        }
    }

    public Size(int i, int i2, int i3, int i4, int i5) {
        this.type = i;
        this.frame_type = i2;
        this.index = i3;
        this.width = i4;
        this.height = i5;
        this.frameIntervalType = -1;
        updateFrameRate();
    }

    public Size(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        this.type = i;
        this.frame_type = i2;
        this.index = i3;
        this.width = i4;
        this.height = i5;
        if (iArr != null) {
            i6 = iArr.length;
        } else {
            i6 = -1;
        }
        if (i6 > 0) {
            this.frameIntervalType = i6;
            int[] iArr2 = new int[i6];
            this.intervals = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, i6);
        } else {
            this.frameIntervalType = -1;
            this.intervals = null;
        }
        this.frameIntervalIndex = 0;
        updateFrameRate();
    }

    public Size(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.type = i;
        this.frame_type = i2;
        this.index = i3;
        this.width = i4;
        this.height = i5;
        int[] iArr = new int[3];
        this.intervals = iArr;
        iArr[0] = i6;
        iArr[1] = i7;
        iArr[2] = i8;
        updateFrameRate();
    }
}
