package com.bytedance.lynx.webview.glue;

public class TTRenderProcessGoneDetail {

    /* renamed from: a */
    private final boolean f48704a;

    /* renamed from: b */
    private final int f48705b;

    public boolean didCrash() {
        return this.f48704a;
    }

    public int rendererPriority() {
        return this.f48705b;
    }

    public TTRenderProcessGoneDetail(boolean z, int i) {
        this.f48704a = z;
        this.f48705b = i;
    }
}
