package com.ss.android.lark.notification.setting.impl.setting;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.notification.setting.impl.setting.c */
public class C48604c {

    /* renamed from: a */
    private static final List<AbstractC48605a> f122261a = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.notification.setting.impl.setting.c$a */
    public interface AbstractC48605a {
        /* renamed from: a */
        void mo169726a();
    }

    /* renamed from: a */
    public static void m191601a() {
        for (AbstractC48605a aVar : f122261a) {
            aVar.mo169726a();
        }
    }
}
