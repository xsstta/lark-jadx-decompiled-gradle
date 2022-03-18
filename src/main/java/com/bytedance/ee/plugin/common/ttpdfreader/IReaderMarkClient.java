package com.bytedance.ee.plugin.common.ttpdfreader;

import android.graphics.RectF;

public interface IReaderMarkClient {
    void onMarked(int i, int i2, int i3, RectF[] rectFArr);
}
