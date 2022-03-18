package com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue;

import com.bytedance.ee.bear.bean.Icon;
import com.bytedance.ee.bear.bitable.card.model.enums.ESegmentType;
import com.bytedance.ee.util.io.NonProguard;

public class SegmentModel implements NonProguard {
    public Icon icon;
    public String link;
    public String mentionId;
    public boolean mentionNotify;
    public int mentionType;
    public String text;
    public String token;
    public ESegmentType type;
    public boolean visited;

    public static SegmentModel newTextSegment(String str) {
        SegmentModel segmentModel = new SegmentModel();
        segmentModel.type = ESegmentType.TEXT;
        segmentModel.text = str;
        return segmentModel;
    }

    public static SegmentModel newUrlSegment(String str, String str2) {
        SegmentModel segmentModel = new SegmentModel();
        segmentModel.type = ESegmentType.URL;
        segmentModel.text = str;
        segmentModel.link = str2;
        return segmentModel;
    }

    public static SegmentModel newMentionSegment(String str, String str2, String str3, int i, boolean z, String str4, Icon icon2) {
        SegmentModel segmentModel = new SegmentModel();
        segmentModel.type = ESegmentType.MENTION;
        segmentModel.text = str;
        segmentModel.link = str2;
        segmentModel.token = str3;
        segmentModel.mentionType = i;
        if (i == 0) {
            segmentModel.mentionNotify = z;
            segmentModel.mentionId = str4;
        }
        if (icon2 != null) {
            segmentModel.icon = icon2;
        }
        return segmentModel;
    }
}
