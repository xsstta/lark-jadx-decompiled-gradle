package com.ss.android.lark.widget.ptr;

import android.view.View;

public interface LKUIPtrHandler2 extends LKUIPtrHandler {
    boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2);

    void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout);
}
