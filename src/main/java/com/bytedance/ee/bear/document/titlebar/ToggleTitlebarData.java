package com.bytedance.ee.bear.document.titlebar;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class ToggleTitlebarData implements BaseJSModel {
    private int states;

    public int getStates() {
        return this.states;
    }

    public void setStates(int i) {
        this.states = i;
    }
}
