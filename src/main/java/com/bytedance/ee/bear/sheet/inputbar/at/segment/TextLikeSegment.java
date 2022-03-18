package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import java.util.List;

public abstract class TextLikeSegment extends BaseSegment {
    private List<TextSegment> texts;

    public TextLikeSegment() {
    }

    public List<TextSegment> getTexts() {
        return this.texts;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object
    public TextLikeSegment clone() throws CloneNotSupportedException {
        return (TextLikeSegment) super.clone();
    }

    public void setTexts(List<TextSegment> list) {
        this.texts = list;
    }

    public TextLikeSegment(SegmentType segmentType, SegmentStyle segmentStyle, List<TextSegment> list) {
        super(segmentType, segmentStyle);
        this.texts = list;
    }
}
