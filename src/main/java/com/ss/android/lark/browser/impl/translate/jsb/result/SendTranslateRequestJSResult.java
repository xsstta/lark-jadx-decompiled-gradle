package com.ss.android.lark.browser.impl.translate.jsb.result;

import java.util.List;

public class SendTranslateRequestJSResult implements BaseJSResult {
    private List<String> data;

    public List<String> getData() {
        return this.data;
    }

    public void setData(List<String> list) {
        this.data = list;
    }
}
