package com.bytedance.ee.webapp.render.demo;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.AbstractNativeComponent;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.ss.android.lark.sdk.C53241h;

public class NativeLivePlayerComponent extends AbstractNativeComponent {
    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onRemove() {
        C53241h.m205899c("NativeLivePlayerComponent", "onRemove");
    }

    public String getComponentViewType() {
        C53241h.m205899c("NativeLivePlayerComponent", "getComponentViewType");
        return "map";
    }

    private C13819a parse(JSONObject jSONObject) {
        C53241h.m205899c("NativeLivePlayerComponent", "parse");
        return C13819a.m55978a(jSONObject);
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void onUpdateView(View view, JSONObject jSONObject) {
        C53241h.m205899c("NativeLivePlayerComponent", "onUpdateView");
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void performAction(String str, JSONObject jSONObject) {
        C53241h.m205899c("NativeLivePlayerComponent", "performAction");
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public View onCreateView(Context context, JSONObject jSONObject) {
        C53241h.m205899c("NativeLivePlayerComponent", "onCreateView");
        View view = new View(context);
        view.setBackgroundColor(-65536);
        return view;
    }

    public NativeLivePlayerComponent(C12717a aVar, String str, String str2) {
        super(aVar, str, str2);
        C53241h.m205899c("NativeLivePlayerComponent", "NativeLivePlayerComponent");
    }
}
