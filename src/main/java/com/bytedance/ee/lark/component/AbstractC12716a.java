package com.bytedance.ee.lark.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.p607a.p611d.C12723a;

/* renamed from: com.bytedance.ee.lark.component.a */
public interface AbstractC12716a {
    void bindContainer(ViewGroup viewGroup);

    void bindData(C12723a aVar);

    ViewGroup getContainer();

    JSONObject getData();

    int getHeight();

    String getViewId();

    String getViewType();

    int getWidth();

    int getZIndex();

    View onCreateView(Context context, JSONObject jSONObject);

    void onRemove();

    void onUpdateView(View view, JSONObject jSONObject);

    void performAction(String str, JSONObject jSONObject);

    void setWidthAndHeight(int i, int i2);

    void updateData(JSONObject jSONObject);
}
