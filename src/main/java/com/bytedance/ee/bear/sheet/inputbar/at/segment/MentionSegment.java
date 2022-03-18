package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;

public class MentionSegment extends BaseSegment {
    private boolean block_notify;
    private String category;
    private String en_name;
    private SuiteIcon icon;
    private boolean is_external;
    private String link;
    private String mentionId;
    private boolean mentionNotify;
    private int mentionType;
    private String name;
    private boolean not_notify;
    private String text;
    private String token;

    public static class SuiteIcon implements NonProguard, Cloneable {
        private String fsUnit;
        private String key;
        private int type;

        public SuiteIcon() {
        }

        public String getFsUnit() {
            return this.fsUnit;
        }

        public String getKey() {
            return this.key;
        }

        public int getType() {
            return this.type;
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.Object
        public SuiteIcon clone() throws CloneNotSupportedException {
            return (SuiteIcon) super.clone();
        }

        public void setFsUnit(String str) {
            this.fsUnit = str;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setType(int i) {
            this.type = i;
        }

        public SuiteIcon(String str, int i, String str2) {
            this.key = str;
            this.type = i;
            this.fsUnit = str2;
        }
    }

    public String getCategory() {
        return this.category;
    }

    public String getEn_name() {
        return this.en_name;
    }

    public SuiteIcon getIcon() {
        return this.icon;
    }

    public String getLink() {
        return this.link;
    }

    public String getMentionId() {
        return this.mentionId;
    }

    public int getMentionType() {
        return this.mentionType;
    }

    public String getName() {
        return this.name;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public String getText() {
        return this.text;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isBlock_notify() {
        return this.block_notify;
    }

    public boolean isIs_external() {
        return this.is_external;
    }

    public boolean isMentionNotify() {
        return this.mentionNotify;
    }

    public boolean isNot_notify() {
        return this.not_notify;
    }

    public MentionSegment() {
        super(SegmentType.MENTION, null);
    }

    @JSONField(serialize = false)
    public boolean isMentionDocument() {
        if (this.mentionType > 0) {
            return true;
        }
        return false;
    }

    @JSONField(serialize = false)
    public boolean isMentionUser() {
        if (this.mentionType == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment, java.lang.Object
    public MentionSegment clone() throws CloneNotSupportedException {
        MentionSegment mentionSegment = (MentionSegment) super.clone();
        SuiteIcon suiteIcon = this.icon;
        if (suiteIcon != null) {
            mentionSegment.icon = suiteIcon.clone();
        }
        return mentionSegment;
    }

    public void setBlock_notify(boolean z) {
        this.block_notify = z;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setEn_name(String str) {
        this.en_name = str;
    }

    public void setIcon(SuiteIcon suiteIcon) {
        this.icon = suiteIcon;
    }

    public void setIs_external(boolean z) {
        this.is_external = z;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setMentionId(String str) {
        this.mentionId = str;
    }

    public void setMentionNotify(boolean z) {
        this.mentionNotify = z;
    }

    public void setMentionType(int i) {
        this.mentionType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNot_notify(boolean z) {
        this.not_notify = z;
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment
    public void setText(String str) {
        this.text = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
