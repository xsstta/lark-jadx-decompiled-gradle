package com.lynx.tasm;

import com.lynx.react.bridge.ReadableMap;

/* renamed from: com.lynx.tasm.p */
public class C26932p {

    /* renamed from: a */
    private boolean f66872a = true;

    /* renamed from: b */
    private boolean f66873b;

    /* renamed from: c */
    private String f66874c = "error";

    /* renamed from: d */
    private String f66875d;

    /* renamed from: e */
    private String f66876e;

    /* renamed from: f */
    private String f66877f;

    /* renamed from: a */
    public boolean mo95773a() {
        return this.f66872a;
    }

    /* renamed from: b */
    public boolean mo95774b() {
        return this.f66873b;
    }

    /* renamed from: c */
    public String mo95775c() {
        return this.f66874c;
    }

    /* renamed from: d */
    public String mo95776d() {
        return this.f66875d;
    }

    /* renamed from: e */
    public String mo95777e() {
        return this.f66876e;
    }

    /* renamed from: f */
    public String mo95778f() {
        return this.f66877f;
    }

    public String toString() {
        return "PageConfig{autoExpose=" + this.f66872a + ", pageVersion='" + this.f66874c + '}';
    }

    public C26932p(ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("autoExpose")) {
                this.f66872a = readableMap.getBoolean("autoExpose");
            }
            if (readableMap.hasKey("pageVersion")) {
                this.f66874c = readableMap.getString("pageVersion");
            }
            if (readableMap.hasKey("enableEventThrough")) {
                this.f66873b = readableMap.getBoolean("enableEventThrough");
            }
            if (readableMap.hasKey("pageType")) {
                this.f66875d = readableMap.getString("pageType");
            }
            if (readableMap.hasKey("cliVersion")) {
                this.f66876e = readableMap.getString("cliVersion");
            }
            if (readableMap.hasKey("customData")) {
                this.f66877f = readableMap.getString("customData");
            }
        }
    }
}
