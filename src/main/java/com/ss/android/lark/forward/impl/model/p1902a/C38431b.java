package com.ss.android.lark.forward.impl.model.p1902a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.forward.dto.C38389a;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.impl.model.a.b */
class C38431b {

    /* renamed from: a */
    Map<String, Chat> f98803a;

    /* renamed from: b */
    Map<String, Chatter> f98804b;

    /* renamed from: c */
    List<C38389a> f98805c;

    C38431b(List<C38389a> list, Map<String, Chat> map, Map<String, Chatter> map2) {
        this.f98805c = list;
        this.f98803a = map;
        this.f98804b = map2;
    }
}
