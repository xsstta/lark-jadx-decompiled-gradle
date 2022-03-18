package com.ss.android.lark.resource.service;

import java.io.Serializable;

public class AvatarResourceParams implements Serializable {
    private CutType cutType = CutType.FACE;
    private ImageFormat format = ImageFormat.PNG;
    private String fsUnit;
    private int height;
    private boolean isOnlyLocal;
    private boolean noop;
    private int quality = 70;
    private int width;

    public enum CutType {
        TOP(1),
        BOTTOM(2),
        LEFT(3),
        RIGHT(4),
        CENTER(5),
        FACE(6),
        NOOP(7);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CutType valueOf(int i) {
            return forNumber(i);
        }

        public static CutType forNumber(int i) {
            switch (i) {
                case 1:
                    return TOP;
                case 2:
                    return BOTTOM;
                case 3:
                    return LEFT;
                case 4:
                    return RIGHT;
                case 5:
                    return CENTER;
                case 6:
                    return FACE;
                case 7:
                    return NOOP;
                default:
                    return FACE;
            }
        }

        private CutType(int i) {
            this.value = i;
        }
    }

    public enum ImageFormat {
        WEBP(1),
        JPEG(2),
        PNG(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ImageFormat valueOf(int i) {
            return forNumber(i);
        }

        public static ImageFormat forNumber(int i) {
            if (i == 1) {
                return WEBP;
            }
            if (i == 2) {
                return JPEG;
            }
            if (i != 3) {
                return PNG;
            }
            return PNG;
        }

        private ImageFormat(int i) {
            this.value = i;
        }
    }

    public CutType getCutType() {
        return this.cutType;
    }

    public ImageFormat getFormat() {
        return this.format;
    }

    public String getFsUnit() {
        return this.fsUnit;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isNoop() {
        return this.noop;
    }

    public boolean isOnlyLocal() {
        return this.isOnlyLocal;
    }

    public int getQuality() {
        int i = this.quality;
        if (i <= 1) {
            return 1;
        }
        if (i <= 70) {
            return 70;
        }
        return 100;
    }

    public void setCutType(CutType cutType2) {
        this.cutType = cutType2;
    }

    public void setFormat(ImageFormat imageFormat) {
        this.format = imageFormat;
    }

    public void setFsUnit(String str) {
        this.fsUnit = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIsOnlyLocal(boolean z) {
        this.isOnlyLocal = z;
    }

    public void setNoop(boolean z) {
        this.noop = z;
    }

    public void setQuality(int i) {
        this.quality = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
