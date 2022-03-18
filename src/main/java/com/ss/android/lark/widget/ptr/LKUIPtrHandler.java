package com.ss.android.lark.widget.ptr;

import android.view.View;

public interface LKUIPtrHandler {
    boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2);

    void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout);
}
