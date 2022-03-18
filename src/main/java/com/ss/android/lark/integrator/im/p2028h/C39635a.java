package com.ss.android.lark.integrator.im.p2028h;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.favorite.p1835a.AbstractC37078a;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.integrator.im.h.a */
public class C39635a implements AbstractC37078a {
    @Override // com.ss.android.lark.favorite.p1835a.AbstractC37078a
    /* renamed from: a */
    public Map<String, Message> mo136700a(C14928Entity entity) {
        return AbstractC39484a.m156004a().mo104178B().mo120948b(entity);
    }

    @Override // com.ss.android.lark.favorite.p1835a.AbstractC37078a
    /* renamed from: b */
    public Map<String, Chatter> mo136703b(C14928Entity entity) {
        return AbstractC39484a.m156004a().mo104177A().getChatterMapFromEntity(entity);
    }

    @Override // com.ss.android.lark.favorite.p1835a.AbstractC37078a
    /* renamed from: a */
    public Map<String, Chatter> mo136701a(List<String> list) {
        return AbstractC39484a.m156004a().mo104256g().mo121205b(list);
    }

    @Override // com.ss.android.lark.favorite.p1835a.AbstractC37078a
    /* renamed from: b */
    public Map<String, Chat> mo136704b(List<String> list) {
        return AbstractC39484a.m156004a().mo104251d().mo121033b(list);
    }

    @Override // com.ss.android.lark.favorite.p1835a.AbstractC37078a
    /* renamed from: a */
    public Map<String, Chat> mo136702a(Map<String, com.bytedance.lark.pb.basic.v1.Chat> map) {
        return AbstractC39484a.m156004a().mo104275z().getChatMap(map);
    }
}
