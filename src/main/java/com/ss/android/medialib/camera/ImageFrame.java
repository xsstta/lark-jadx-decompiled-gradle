package com.ss.android.medialib.camera;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class ImageFrame {
    public Bitmap bitmap;
    public ByteBuffer byteBuffer;
    public int format;
    public int height;
    public byte[] mBuf;
    public C59393c mPlane;
    public int rotate;
    public int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public byte[] getBuf() {
        return this.mBuf;
    }

    public int getFormat() {
        return this.format;
    }

    public int getHeight() {
        return this.height;
    }

    public C59393c getPlane() {
        return this.mPlane;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBuf(byte[] bArr) {
        this.mBuf = bArr;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public ImageFrame(Bitmap bitmap2, int i) {
        this.bitmap = bitmap2;
        this.format = i;
    }

    public ImageFrame(C59393c cVar, int i, int i2, int i3) {
        this.mPlane = cVar;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public ImageFrame(byte[] bArr, int i, int i2, int i3) {
        this.mBuf = bArr;
        this.format = i;
        this.width = i2;
        this.height = i3;
    }

    public static ImageFrame create(ByteBuffer byteBuffer2, int i, int i2, int i3, int i4) {
        return new ImageFrame(byteBuffer2, i, i2, i3, i4);
    }

    public ImageFrame(ByteBuffer byteBuffer2, int i, int i2, int i3, int i4) {
        this.byteBuffer = byteBuffer2;
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.rotate = i4;
    }
}
