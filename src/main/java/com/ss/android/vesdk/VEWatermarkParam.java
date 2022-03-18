package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class VEWatermarkParam implements Parcelable {
    public static final Parcelable.Creator<VEWatermarkParam> CREATOR = new Parcelable.Creator<VEWatermarkParam>() {
        /* class com.ss.android.vesdk.VEWatermarkParam.C639191 */

        /* renamed from: a */
        public VEWatermarkParam[] newArray(int i) {
            return new VEWatermarkParam[i];
        }

        /* renamed from: a */
        public VEWatermarkParam createFromParcel(Parcel parcel) {
            return new VEWatermarkParam(parcel);
        }
    };
    public long duration = -1;
    private VEWatermarkEntity[] entities;
    public String extFile;
    public int height;
    public String[] images;
    public int interval;
    public VEWatermarkMask mask;
    public boolean needExtFile;
    public VEWaterMarkPosition position = VEWaterMarkPosition.TL_BR;
    public int rotation;
    public String[] secondHalfImages;
    public Bitmap waterMarkBitmap;
    public int width;
    public int xOffset;
    public int yOffset;

    public int describeContents() {
        return 0;
    }

    public static class VEWatermarkMask implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkMask> CREATOR = new Parcelable.Creator<VEWatermarkMask>() {
            /* class com.ss.android.vesdk.VEWatermarkParam.VEWatermarkMask.C639211 */

            /* renamed from: a */
            public VEWatermarkMask[] newArray(int i) {
                return new VEWatermarkMask[i];
            }

            /* renamed from: a */
            public VEWatermarkMask createFromParcel(Parcel parcel) {
                return new VEWatermarkMask(parcel);
            }
        };
        public int height;
        public String maskImage;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkMask() {
        }

        protected VEWatermarkMask(Parcel parcel) {
            this.maskImage = parcel.readString();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maskImage);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    public static class VEWatermarkEntity implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkEntity> CREATOR = new Parcelable.Creator<VEWatermarkEntity>() {
            /* class com.ss.android.vesdk.VEWatermarkParam.VEWatermarkEntity.C639201 */

            /* renamed from: a */
            public VEWatermarkEntity[] newArray(int i) {
                return new VEWatermarkEntity[i];
            }

            /* renamed from: a */
            public VEWatermarkEntity createFromParcel(Parcel parcel) {
                return new VEWatermarkEntity(parcel);
            }
        };
        public int height;
        public String[] images;
        public int interval;
        public VEWaterMarkPosition position = VEWaterMarkPosition.TL_BR;
        public int rotation;
        public long sequenceIn;
        public long sequenceOut;
        public int width;
        public int xOffset;
        public int yOffset;

        public int describeContents() {
            return 0;
        }

        public VEWatermarkEntity() {
        }

        public int getPosition() {
            return this.position.ordinal();
        }

        protected VEWatermarkEntity(Parcel parcel) {
            VEWaterMarkPosition vEWaterMarkPosition;
            this.images = parcel.createStringArray();
            this.interval = parcel.readInt();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.sequenceIn = parcel.readLong();
            this.sequenceOut = parcel.readLong();
            int readInt = parcel.readInt();
            if (readInt == -1) {
                vEWaterMarkPosition = null;
            } else {
                vEWaterMarkPosition = VEWaterMarkPosition.values()[readInt];
            }
            this.position = vEWaterMarkPosition;
            this.rotation = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeStringArray(this.images);
            parcel.writeInt(this.interval);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeLong(this.sequenceIn);
            parcel.writeLong(this.sequenceOut);
            VEWaterMarkPosition vEWaterMarkPosition = this.position;
            if (vEWaterMarkPosition == null) {
                i2 = -1;
            } else {
                i2 = vEWaterMarkPosition.ordinal();
            }
            parcel.writeInt(i2);
            parcel.writeInt(this.rotation);
        }
    }

    public VEWatermarkParam() {
    }

    public String toString() {
        return " needExtFile " + this.needExtFile;
    }

    public VEWatermarkEntity[] getEntities() {
        int i;
        if (this.entities == null && this.images != null) {
            if (this.secondHalfImages != null) {
                i = 2;
            } else {
                i = 1;
            }
            this.entities = new VEWatermarkEntity[i];
            int i2 = 0;
            while (i2 < i) {
                VEWatermarkEntity vEWatermarkEntity = new VEWatermarkEntity();
                vEWatermarkEntity.images = this.images;
                vEWatermarkEntity.interval = this.interval;
                vEWatermarkEntity.width = this.width;
                vEWatermarkEntity.height = this.height;
                vEWatermarkEntity.position = this.position;
                long j = (long) i;
                vEWatermarkEntity.sequenceIn = (this.duration * ((long) i2)) / j;
                int i3 = i2 + 1;
                vEWatermarkEntity.sequenceOut = (this.duration * ((long) i3)) / j;
                vEWatermarkEntity.rotation = this.rotation;
                vEWatermarkEntity.xOffset = this.xOffset;
                vEWatermarkEntity.yOffset = this.yOffset;
                this.entities[i2] = vEWatermarkEntity;
                i2 = i3;
            }
            if (i == 2) {
                this.entities[1].images = this.secondHalfImages;
            }
            if (this.position == VEWaterMarkPosition.TL_BR && i == 2) {
                this.entities[0].position = VEWaterMarkPosition.TL;
                this.entities[1].position = VEWaterMarkPosition.BR;
            }
        }
        return this.entities;
    }

    public void setEntities(VEWatermarkEntity[] vEWatermarkEntityArr) {
        this.entities = vEWatermarkEntityArr;
    }

    protected VEWatermarkParam(Parcel parcel) {
        boolean z;
        VEWaterMarkPosition vEWaterMarkPosition;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needExtFile = z;
        this.extFile = parcel.readString();
        this.entities = (VEWatermarkEntity[]) parcel.createTypedArray(VEWatermarkEntity.CREATOR);
        this.mask = (VEWatermarkMask) parcel.readParcelable(VEWatermarkMask.class.getClassLoader());
        this.images = parcel.createStringArray();
        this.waterMarkBitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.secondHalfImages = parcel.createStringArray();
        this.interval = parcel.readInt();
        this.xOffset = parcel.readInt();
        this.yOffset = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            vEWaterMarkPosition = null;
        } else {
            vEWaterMarkPosition = VEWaterMarkPosition.values()[readInt];
        }
        this.position = vEWaterMarkPosition;
        this.rotation = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeByte(this.needExtFile ? (byte) 1 : 0);
        parcel.writeString(this.extFile);
        parcel.writeTypedArray(this.entities, i);
        parcel.writeParcelable(this.mask, i);
        parcel.writeStringArray(this.images);
        parcel.writeParcelable(this.waterMarkBitmap, i);
        parcel.writeStringArray(this.secondHalfImages);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.xOffset);
        parcel.writeInt(this.yOffset);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        VEWaterMarkPosition vEWaterMarkPosition = this.position;
        if (vEWaterMarkPosition == null) {
            i2 = -1;
        } else {
            i2 = vEWaterMarkPosition.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.rotation);
    }
}
