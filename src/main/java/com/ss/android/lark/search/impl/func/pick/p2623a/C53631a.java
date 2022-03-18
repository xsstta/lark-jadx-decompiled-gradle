package com.ss.android.lark.search.impl.func.pick.p2623a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.pick.chatpick.p2624a.C53643a;
import com.ss.android.lark.searchcommon.dto.C53893b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.pick.a.a */
public class C53631a {

    /* renamed from: com.ss.android.lark.search.impl.func.pick.a.a$a */
    private static class C53633a {

        /* renamed from: a */
        static C53631a f132394a = new C53631a();
    }

    private C53631a() {
    }

    /* renamed from: a */
    public static C53631a m207621a() {
        return C53633a.f132394a;
    }

    /* renamed from: a */
    public C53643a mo182940a(List<C53893b> list) {
        ISearchModuleDependency.AbstractC53317e f = C53258a.m205939a().mo181756f();
        ArrayList arrayList = new ArrayList(list.size());
        for (C53893b bVar : list) {
            arrayList.add(bVar.mo183899c());
        }
        Map<String, Chat> a = f.mo181781a(arrayList);
        if (a == null) {
            a = new HashMap<>();
        }
        ArrayList arrayList2 = new ArrayList(a.size());
        for (Chat chat : a.values()) {
            if (chat.getType() == Chat.Type.P2P) {
                arrayList2.add(f.mo181778a(chat));
            }
        }
        Map<String, Chatter> b = f.mo181791b(arrayList2);
        if (b == null) {
            b = new HashMap<>();
        }
        return new C53643a(list, a, b);
    }
}
