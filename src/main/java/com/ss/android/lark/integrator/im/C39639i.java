package com.ss.android.lark.integrator.im;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.integrator.im.dependency.AbstractC39575r;
import com.ss.android.lark.meego_api.IMeegoApi;
import com.ss.android.lark.utils.ApiUtils;
import org.json.JSONArray;

/* renamed from: com.ss.android.lark.integrator.im.i */
class C39639i implements AbstractC39575r {
    C39639i() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39575r
    /* renamed from: a */
    public boolean mo143630a() {
        return ((IMeegoApi) ApiUtils.getApi(IMeegoApi.class)).isMeegoEnable();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39575r
    /* renamed from: a */
    public IPlusItem mo143628a(Chat chat) {
        return ((IMeegoApi) ApiUtils.getApi(IMeegoApi.class)).getProjectKbPlusItem(chat);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39575r
    /* renamed from: a */
    public void mo143629a(String str, Chat chat, JSONArray jSONArray) {
        ((IMeegoApi) ApiUtils.getApi(IMeegoApi.class)).openMeegoToCreateProject(str, chat, jSONArray);
    }
}
