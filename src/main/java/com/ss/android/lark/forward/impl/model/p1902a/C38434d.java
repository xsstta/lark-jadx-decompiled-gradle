package com.ss.android.lark.forward.impl.model.p1902a;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.impl.model.a.d */
class C38434d {

    /* renamed from: com.ss.android.lark.forward.impl.model.a.d$a */
    private static class C38436a {

        /* renamed from: a */
        static C38434d f98809a = new C38434d();
    }

    private C38434d() {
    }

    /* renamed from: a */
    static C38434d m151560a() {
        return C38436a.f98809a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C38431b mo140983a(List<C38389a> list) {
        AbstractC38365a.AbstractC38368c d = C38364a.m151054a().mo140442d();
        ArrayList arrayList = new ArrayList(list.size());
        for (C38389a aVar : list) {
            if (!aVar.mo140696o()) {
                arrayList.add(aVar.mo140681g());
            }
        }
        Map<String, Chat> a = d.mo140474a(arrayList);
        if (a == null) {
            a = new HashMap<>();
        }
        ArrayList arrayList2 = new ArrayList(a.size());
        for (Chat chat : a.values()) {
            if (chat.getType() == Chat.Type.P2P) {
                arrayList2.add(d.mo140472a(chat));
            }
        }
        Map<String, Chatter> c = d.mo140495c(arrayList2);
        if (c == null) {
            c = new HashMap<>();
        }
        return new C38431b(list, a, c);
    }
}
