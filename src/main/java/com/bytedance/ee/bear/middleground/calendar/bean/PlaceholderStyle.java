package com.bytedance.ee.bear.middleground.calendar.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;

public class PlaceholderStyle implements NonProguard {
    @JSONField(name = "backgroundColor")
    public String backgroundColor;
    @JSONField(name = "bold")
    public boolean bold;
    @JSONField(name = "color")
    public String color;
    @JSONField(name = "fontSize")
    public String fontSize;
    @JSONField(name = "hiddenWhileFocusing")
    public boolean hiddenWhileFocusing;
    @JSONField(name = "italic")
    public boolean italic;
    @JSONField(name = "lineHeight")
    public int lineHeight;
    @JSONField(name = "opacity")
    public int opacity;
    @JSONField(name = "strikeThrough")
    public boolean strikeThrough;
    @JSONField(name = "text")
    public String text;
    @JSONField(name = "underline")
    public boolean underline;

    private PlaceholderStyle(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, boolean z5, int i, int i2) {
        this.text = str;
        this.color = str2;
        this.backgroundColor = str3;
        this.bold = z;
        this.italic = z2;
        this.hiddenWhileFocusing = z3;
        this.fontSize = str4;
        this.underline = z4;
        this.strikeThrough = z5;
        this.opacity = i;
        this.lineHeight = i2;
    }
}
