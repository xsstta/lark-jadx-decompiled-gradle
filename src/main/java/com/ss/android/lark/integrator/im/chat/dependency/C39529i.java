package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.dependency.AbstractC36497m;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.i */
class C39529i implements AbstractC36497m {
    @Override // com.ss.android.lark.dependency.AbstractC36497m
    /* renamed from: a */
    public String mo134662a() {
        return "extra.ding.message";
    }

    @Override // com.ss.android.lark.dependency.AbstractC36497m
    /* renamed from: b */
    public String mo134665b() {
        return "extra.ding.status";
    }

    C39529i() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36497m
    /* renamed from: a */
    public void mo134664a(List<String> list) {
        C39587a.m157080a().mo135085a(list);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36497m
    /* renamed from: a */
    public void mo134663a(Context context, C36516a aVar, Message message, Chatter chatter, int i) {
        C39587a.m157080a().mo135082a(context, aVar, message, Collections.singletonList(chatter.getId()), true, i);
    }
}
