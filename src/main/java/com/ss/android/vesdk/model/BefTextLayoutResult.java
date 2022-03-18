package com.ss.android.vesdk.model;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.C60270d;

public class BefTextLayoutResult {
    Bitmap bitmap;
    int height;
    int lineCount;
    int width;

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitmap(Bitmap bitmap2) {
        this.bitmap = bitmap2;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static BefTextLayoutResult readFromByteArray(byte[][] bArr) {
        C60270d dVar = new C60270d(bArr[0]);
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        befTextLayoutResult.setBitmap(dVar.mo206319e());
        befTextLayoutResult.setWidth(dVar.mo206315a());
        befTextLayoutResult.setHeight(dVar.mo206315a());
        befTextLayoutResult.setLineCount(dVar.mo206315a());
        return befTextLayoutResult;
    }
}
