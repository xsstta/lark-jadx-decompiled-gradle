package com.bytedance.ee.larkwebview.service.listener;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface OnViewScrollListener {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollDirection {
    }

    /* renamed from: a */
    void mo49932a(int i, int i2, int i3);

    /* renamed from: a */
    void mo49933a(int i, int i2, int i3, int i4);
}
