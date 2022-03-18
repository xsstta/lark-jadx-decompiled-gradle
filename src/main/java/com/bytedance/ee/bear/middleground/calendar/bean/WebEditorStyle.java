package com.bytedance.ee.bear.middleground.calendar.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.util.io.NonProguard;

public class WebEditorStyle implements NonProguard {
    @JSONField(name = "background")
    public String mBackground;
    @JSONField(name = "color")
    public String mColor;
    @JSONField(name = "innerHeight")
    public int mContentHeight;
    @JSONField(name = "docBodyPadding")
    public int[] mContentPadding;
    @JSONField(name = "horizontalLRSpace")
    public int mDividerLRPadding;
    @JSONField(name = "heading")
    public int[] mHeading;
    @JSONField(name = "listMarginText")
    public int mListMarginText;
    @JSONField(name = "fontSize")
    public int mTextSize;
    @JSONField(name = "minHeight")
    public int minHeight;

    /* renamed from: com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle$a */
    public static class C8917a {

        /* renamed from: a */
        private int[] f24060a;

        /* renamed from: b */
        private int[] f24061b = {0, 0, 0, 0};

        /* renamed from: c */
        private int f24062c = 16;

        /* renamed from: d */
        private int f24063d;

        /* renamed from: e */
        private int f24064e = 8;

        /* renamed from: f */
        private int f24065f;

        /* renamed from: g */
        private String f24066g = "#123";

        /* renamed from: h */
        private int f24067h;

        /* renamed from: i */
        private String f24068i;

        /* renamed from: a */
        public WebEditorStyle mo34205a() {
            return new WebEditorStyle(this.f24060a, this.f24061b, this.f24062c, this.f24063d, this.f24064e, this.f24065f, this.f24066g, this.f24067h, this.f24068i);
        }

        /* renamed from: a */
        public C8917a mo34203a(int i) {
            this.f24063d = i;
            return this;
        }

        /* renamed from: b */
        public C8917a mo34206b(int i) {
            String hexString = Integer.toHexString(i);
            if (hexString.length() > 6) {
                hexString = hexString.substring(hexString.length() - 6);
            }
            this.f24066g = String.format("#%s", hexString);
            return this;
        }

        /* renamed from: c */
        public C8917a mo34207c(int i) {
            String hexString = Integer.toHexString(i);
            if (hexString.length() > 6) {
                hexString = hexString.substring(hexString.length() - 6);
            }
            this.f24068i = String.format("#%s", hexString);
            return this;
        }

        /* renamed from: a */
        public C8917a mo34204a(int i, int i2, int i3, int i4) {
            this.f24061b = new int[]{i2, i3, i4, i};
            return this;
        }
    }

    private WebEditorStyle(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, String str, int i5, String str2) {
        this.mHeading = iArr;
        this.mContentPadding = iArr2;
        this.mTextSize = i;
        this.mContentHeight = i2;
        this.mListMarginText = i3;
        this.mDividerLRPadding = i4;
        this.mColor = str;
        this.minHeight = i5;
        this.mBackground = str2;
    }
}
