package com.ss.android.lark.resource.service;

import com.bytedance.lark.pb.media.v1.AvatarFsUnitParams;
import com.ss.android.lark.resource.service.AvatarResourceParams;
import java.io.Serializable;

public class AvatarFsUnitParams implements Serializable {
    private AvatarResourceParams.CutType cutType = AvatarResourceParams.CutType.FACE;
    private AvatarResourceParams.ImageFormat imageFormat = AvatarResourceParams.ImageFormat.PNG;
    private ImageSizeType imageSizeType = ImageSizeType.ORIGIN;
    private boolean isNoop;
    private AvatarFsUnitParams.Quality quality;

    public enum ImageSizeType {
        SMALL(1),
        MIDDLE(2),
        BIG(3),
        ORIGIN(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ImageSizeType valueOf(int i) {
            return forNumber(i);
        }

        public static ImageSizeType forNumber(int i) {
            if (i == 1) {
                return SMALL;
            }
            if (i == 2) {
                return MIDDLE;
            }
            if (i == 3) {
                return BIG;
            }
            if (i != 4) {
                return ORIGIN;
            }
            return ORIGIN;
        }

        private ImageSizeType(int i) {
            this.value = i;
        }
    }

    public AvatarResourceParams.CutType getCutType() {
        return this.cutType;
    }

    public AvatarResourceParams.ImageFormat getImageFormat() {
        return this.imageFormat;
    }

    public ImageSizeType getImageSizeType() {
        return this.imageSizeType;
    }

    public AvatarFsUnitParams.Quality getQuality() {
        return this.quality;
    }

    public boolean isNoop() {
        return this.isNoop;
    }

    public void setCutType(AvatarResourceParams.CutType cutType2) {
        this.cutType = cutType2;
    }

    public void setImageFormat(AvatarResourceParams.ImageFormat imageFormat2) {
        this.imageFormat = imageFormat2;
    }

    public void setImageSizeType(ImageSizeType imageSizeType2) {
        this.imageSizeType = imageSizeType2;
    }

    public void setNoop(boolean z) {
        this.isNoop = z;
    }

    public void setQuality(int i) {
        if (i <= 1) {
            this.quality = AvatarFsUnitParams.Quality.Q1;
        } else if (i <= 70) {
            this.quality = AvatarFsUnitParams.Quality.Q70;
        } else {
            this.quality = AvatarFsUnitParams.Quality.Q_NOOP;
        }
    }
}
