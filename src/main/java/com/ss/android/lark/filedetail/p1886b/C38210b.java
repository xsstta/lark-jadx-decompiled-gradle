package com.ss.android.lark.filedetail.p1886b;

import com.ss.android.lark.chat.entity.message.Message;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.filedetail.b.b */
public class C38210b {

    /* renamed from: a */
    private static final List<AbstractC38211a> f97901a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.filedetail.b.b$a */
    public interface AbstractC38211a {
        /* renamed from: a */
        void mo139633a(Message message);
    }

    /* renamed from: a */
    public static void m150166a(AbstractC38211a aVar) {
        if (aVar != null) {
            f97901a.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m150167b(AbstractC38211a aVar) {
        if (aVar != null) {
            f97901a.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m150165a(Message message) {
        for (AbstractC38211a aVar : f97901a) {
            aVar.mo139633a(message);
        }
    }
}
