package com.ss.android.lark.integrator.im.dependency;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.dependency.ao;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.integrator.im.dependency.h */
public class C39566h implements ao {
    @Override // com.ss.android.lark.dependency.ao
    /* renamed from: b */
    public boolean mo134474b() {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isTodoTabEnable();
    }

    @Override // com.ss.android.lark.dependency.ao
    /* renamed from: a */
    public boolean mo134473a() {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).isTodoInlineEnable();
    }

    @Override // com.ss.android.lark.dependency.ao
    /* renamed from: a */
    public CharSequence mo134472a(Message message) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoCardMessageTitle(message);
    }

    @Override // com.ss.android.lark.dependency.ao
    /* renamed from: a */
    public Content mo134471a(C14928Entity entity, com.bytedance.lark.pb.basic.v1.Content content) {
        return ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getTodoContent(entity, content);
    }
}
