package com.bytedance.ee.plugin.common.pdftron;

import android.graphics.Bitmap;
import com.bytedance.ee.plugin.common.pdftron.wrapper.Page;

public interface IPDFDrawWrapper {
    void destroy();

    Bitmap requestBitmap(Page page, int i, int i2, Bitmap.Config config) throws Throwable;

    void setDrawAnnotations(boolean z);

    void setImageSize(int i, int i2, boolean z);

    void setPageTransparent(boolean z);
}
