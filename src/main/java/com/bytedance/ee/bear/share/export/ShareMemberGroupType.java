package com.bytedance.ee.bear.share.export;

public enum ShareMemberGroupType {
    GROUP_TITLE(0),
    GROUP_MEMBER(1);
    
    int type;

    public int getType() {
        return this.type;
    }

    private ShareMemberGroupType(int i) {
        this.type = i;
    }
}
