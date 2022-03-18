package com.bytedance.ee.bear.doc.follow.impl.rn;

import com.bytedance.ee.util.io.NonProguard;

public class RNDestroyData implements NonProguard {
    public String token;

    public RNDestroyData() {
    }

    public RNDestroyData(String str) {
        this.token = str;
    }
}
