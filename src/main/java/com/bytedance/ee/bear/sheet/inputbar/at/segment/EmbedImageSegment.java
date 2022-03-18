package com.bytedance.ee.bear.sheet.inputbar.at.segment;

public class EmbedImageSegment extends BaseSegment {
    private String fileToken;
    private int height;
    private String link;
    private String text;
    private int width;

    public String getFileToken() {
        return this.fileToken;
    }

    public int getHeight() {
        return this.height;
    }

    public String getLink() {
        return this.link;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public String getText() {
        return this.text;
    }

    public int getWidth() {
        return this.width;
    }

    public EmbedImageSegment() {
        super(SegmentType.EMBED_IMAGE, null);
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object
    public EmbedImageSegment clone() throws CloneNotSupportedException {
        return (EmbedImageSegment) super.clone();
    }

    public void setFileToken(String str) {
        this.fileToken = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLink(String str) {
        this.link = str;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public void setText(String str) {
        this.text = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
