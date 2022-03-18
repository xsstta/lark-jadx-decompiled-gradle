package com.ss.android.vesdk;

import android.graphics.Bitmap;

public class VEMusicBitmapParam {
    public int lineCnt;
    public Bitmap lyricsBitmap;

    public void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public VEMusicBitmapParam(Bitmap bitmap, int i) {
        this.lyricsBitmap = bitmap;
        this.lineCnt = i;
    }
}
