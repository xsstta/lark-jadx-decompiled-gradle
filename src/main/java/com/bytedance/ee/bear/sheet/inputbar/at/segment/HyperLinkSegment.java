package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.bytedance.ee.util.io.NonProguard;

public class HyperLinkSegment extends TextLikeSegment {
    private CellPosition cellPosition;
    private String link;
    private String text;
    private boolean visited;

    public static class CellPosition implements NonProguard, Cloneable {
        private String rangeId;
        private String sheetId;

        public String getRangeId() {
            return this.rangeId;
        }

        public String getSheetId() {
            return this.sheetId;
        }

        @Override // java.lang.Object
        public CellPosition clone() throws CloneNotSupportedException {
            return (CellPosition) super.clone();
        }

        public void setRangeId(String str) {
            this.rangeId = str;
        }

        public void setSheetId(String str) {
            this.sheetId = str;
        }
    }

    public CellPosition getCellPosition() {
        return this.cellPosition;
    }

    public String getLink() {
        return this.link;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public String getText() {
        return this.text;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public HyperLinkSegment() {
        super(SegmentType.URL, null, null);
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object, com.bytedance.ee.bear.sheet.inputbar.at.segment.TextLikeSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.TextLikeSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.TextLikeSegment
    public HyperLinkSegment clone() throws CloneNotSupportedException {
        HyperLinkSegment hyperLinkSegment = (HyperLinkSegment) super.clone();
        CellPosition cellPosition2 = this.cellPosition;
        if (cellPosition2 != null) {
            hyperLinkSegment.cellPosition = cellPosition2.clone();
        }
        return hyperLinkSegment;
    }

    public void setCellPosition(CellPosition cellPosition2) {
        this.cellPosition = cellPosition2;
    }

    public void setLink(String str) {
        this.link = str;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public void setText(String str) {
        this.text = str;
    }

    public void setVisited(boolean z) {
        this.visited = z;
    }
}
