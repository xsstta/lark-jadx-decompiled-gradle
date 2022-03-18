package com.ss.android.vc.meeting.module.sketch.dto.text;

import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;

public class TextDrawableData {
    public String content;
    public ExtInfo extInfo;
    public String id;
    public String lastContent;
    public float[] lastRightBottom;
    public float[] leftTop;
    public float[] rightBottom;
    public TextStyle style;
    public int textUpdateType;

    public String toString() {
        return "TextDrawableData: { id:" + this.id + ", leftTop: { x:" + this.leftTop[0] + ", y: " + this.leftTop[1] + "}, rightBottom: { x: " + this.rightBottom[0] + ", y: " + this.rightBottom[1] + "}, lastRightBottom: { x: " + this.lastRightBottom[0] + ", y: " + this.lastRightBottom[1] + "}, style: " + this.style + ", content: " + this.content + ", lastContent: " + this.lastContent + ", textUpdateType: " + this.textUpdateType + ", extInfo: " + this.extInfo;
    }

    public TextDrawableData(String str, float[] fArr, float[] fArr2, float[] fArr3, String str2, String str3, int i, TextStyle textStyle, ExtInfo extInfo2) {
        this.id = str;
        this.leftTop = fArr;
        this.rightBottom = fArr2;
        this.lastRightBottom = fArr3;
        this.content = str2;
        this.lastContent = str3;
        this.textUpdateType = i;
        this.style = textStyle;
        this.extInfo = extInfo2;
    }
}
