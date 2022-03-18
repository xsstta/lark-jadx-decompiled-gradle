package com.bytedance.ee.bear.middleground.calendar.bean;

import com.bytedance.ee.util.io.NonProguard;

public class EditorStyleData implements NonProguard {
    private WebEditorStyle style;

    public EditorStyleData() {
    }

    public WebEditorStyle getStyle() {
        return this.style;
    }

    public void setStyle(WebEditorStyle webEditorStyle) {
        this.style = webEditorStyle;
    }

    public EditorStyleData(WebEditorStyle webEditorStyle) {
        this.style = webEditorStyle;
    }
}
