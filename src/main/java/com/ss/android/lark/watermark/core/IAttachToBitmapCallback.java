package com.ss.android.lark.watermark.core;

import android.graphics.Bitmap;

public interface IAttachToBitmapCallback {
    void onAttachFailed(Bitmap bitmap, String str);

    void onAttachSuccess(Bitmap bitmap);
}
