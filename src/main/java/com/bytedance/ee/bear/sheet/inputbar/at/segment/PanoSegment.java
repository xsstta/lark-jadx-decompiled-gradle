package com.bytedance.ee.bear.sheet.inputbar.at.segment;

public class PanoSegment extends BaseSegment {
    private String entityId;
    private String link;
    private String text;

    public String getEntityId() {
        return this.entityId;
    }

    public String getLink() {
        return this.link;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public String getText() {
        return this.text;
    }

    public PanoSegment() {
        super(SegmentType.PANO, null);
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object
    public PanoSegment clone() throws CloneNotSupportedException {
        return (PanoSegment) super.clone();
    }

    public void setEntityId(String str) {
        this.entityId = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public void setText(String str) {
        this.text = str;
    }
}
