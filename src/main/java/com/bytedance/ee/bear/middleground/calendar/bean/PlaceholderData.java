package com.bytedance.ee.bear.middleground.calendar.bean;

import com.bytedance.ee.util.io.NonProguard;

public class PlaceholderData implements NonProguard {
    private PlaceholderStyle props;

    public PlaceholderData() {
    }

    public PlaceholderStyle getProps() {
        return this.props;
    }

    public void setProps(PlaceholderStyle placeholderStyle) {
        this.props = placeholderStyle;
    }

    public PlaceholderData(PlaceholderStyle placeholderStyle) {
        this.props = placeholderStyle;
    }
}
