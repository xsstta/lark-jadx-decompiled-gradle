package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.chat.api.p1595b.AbstractC32811a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.integrator.im.p2035m.C39718b;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.q */
public class C39542q implements AbstractC32811a {
    @Override // com.ss.android.lark.chat.api.p1595b.AbstractC32811a
    /* renamed from: a */
    public IPlusItem mo120949a(Chat chat) {
        return C39718b.m157699a().mo149709a(chat);
    }

    @Override // com.ss.android.lark.chat.api.p1595b.AbstractC32811a
    /* renamed from: a */
    public LocationContent mo120950a(Content content) {
        return C39718b.m157699a().mo149710a(content);
    }

    @Override // com.ss.android.lark.chat.api.p1595b.AbstractC32811a
    /* renamed from: a */
    public void mo120951a(Context context, Message message, LocationContent locationContent, String str) {
        C39718b.m157699a().mo149715a(context, new LocationInfo.C29595a(locationContent.getLatitude(), locationContent.getLongitude()).mo106512a(message).mo106513a(locationContent.getName()).mo106516b(locationContent.getDescription()).mo106511a(locationContent.getZoomLevel()).mo106514a(false).mo106517b(locationContent.isInternal()).mo106518c(true).mo106515a(), str);
    }
}
