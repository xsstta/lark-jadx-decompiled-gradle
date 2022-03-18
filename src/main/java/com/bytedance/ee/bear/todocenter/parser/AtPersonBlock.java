package com.bytedance.ee.bear.todocenter.parser;

import android.text.TextUtils;

public class AtPersonBlock extends AbsBlock {
    private String uid;

    public String getUid() {
        return this.uid;
    }

    public AtPersonBlock() {
        setType("0");
    }

    @Override // com.bytedance.ee.bear.todocenter.parser.AbsBlock
    public boolean isValid() {
        return !TextUtils.isEmpty(this.uid);
    }

    public AtPersonBlock setUid(String str) {
        this.uid = str;
        return this;
    }
}
