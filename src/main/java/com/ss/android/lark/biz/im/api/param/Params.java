package com.ss.android.lark.biz.im.api.param;

public final class Params {

    /* renamed from: a */
    public ReferType f74254a;

    public enum ReferType {
        LarkMine("suite"),
        Docs("doc"),
        VideoChat("vc");
        
        private String name;

        public String toString() {
            return this.name;
        }

        private ReferType(String str) {
            this.name = str;
        }
    }

    public Params(ReferType referType) {
        this.f74254a = referType;
    }
}
