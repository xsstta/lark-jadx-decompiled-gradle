package com.bytedance.ee.bear.middleground.calendar.pool;

import android.content.Context;

public interface IWebEditorPool {
    void clear();

    void init(Context context);

    WebEditorWrapper obtain();
}
