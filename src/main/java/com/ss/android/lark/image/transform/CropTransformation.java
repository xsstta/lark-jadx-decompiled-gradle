package com.ss.android.lark.image.transform;

public class CropTransformation {

    /* renamed from: a */
    private int f100014a;

    /* renamed from: b */
    private int f100015b;

    /* renamed from: c */
    private CropType f100016c = CropType.CENTER;

    public enum CropType {
        TOP(1),
        CENTER(2),
        BOTTOM(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static CropType valueOf(int i) {
            return forNumber(i);
        }

        public static CropType forNumber(int i) {
            if (i == 1) {
                return TOP;
            }
            if (i == 2) {
                return CENTER;
            }
            if (i != 3) {
                return null;
            }
            return BOTTOM;
        }

        private CropType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public int mo142511a() {
        return this.f100014a;
    }

    /* renamed from: b */
    public int mo142512b() {
        return this.f100015b;
    }

    /* renamed from: c */
    public CropType mo142513c() {
        return this.f100016c;
    }

    public CropTransformation(int i, int i2, CropType cropType) {
        this.f100014a = i;
        this.f100015b = i2;
        this.f100016c = cropType;
    }
}
