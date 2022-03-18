package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.alibaba.fastjson.annotation.JSONField;

public class TextSegment extends BaseSegment {
    private String text;
    @JSONField(deserialize = false, serialize = false)
    private TextLikeSegment textLikeSegment;

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public String getText() {
        return this.text;
    }

    public TextLikeSegment getTextLikeSegment() {
        return this.textLikeSegment;
    }

    public TextSegment() {
        super(SegmentType.TEXT, null);
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object
    public TextSegment clone() throws CloneNotSupportedException {
        return (TextSegment) super.clone();
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public void setText(String str) {
        this.text = str;
    }

    public void setTextLikeSegment(TextLikeSegment textLikeSegment2) {
        this.textLikeSegment = textLikeSegment2;
    }

    public TextSegment(String str) {
        this();
        this.text = str;
    }
}
