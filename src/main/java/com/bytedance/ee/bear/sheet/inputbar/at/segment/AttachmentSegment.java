package com.bytedance.ee.bear.sheet.inputbar.at.segment;

public class AttachmentSegment extends BaseSegment {
    private String fileToken;
    private String mimeType;
    private int size;
    private String text;

    public String getFileToken() {
        return this.fileToken;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public int getSize() {
        return this.size;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public String getText() {
        return this.text;
    }

    public AttachmentSegment() {
        super(SegmentType.ATTACHMENT, null);
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object
    public AttachmentSegment clone() throws CloneNotSupportedException {
        return (AttachmentSegment) super.clone();
    }

    public void setFileToken(String str) {
        this.fileToken = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public void setText(String str) {
        this.text = str;
    }
}
