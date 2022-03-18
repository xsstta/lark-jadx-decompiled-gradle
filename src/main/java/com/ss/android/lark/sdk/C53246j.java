package com.ss.android.lark.sdk;

import java.util.List;

/* renamed from: com.ss.android.lark.sdk.j */
public class C53246j {

    /* renamed from: com.ss.android.lark.sdk.j$a */
    public interface AbstractC53247a {
        void handle();
    }

    /* renamed from: a */
    public static <T> void m205910a(List<T> list, T t, AbstractC53247a aVar) {
        if (t != null) {
            if (list.isEmpty()) {
                synchronized (list) {
                    if (list.isEmpty()) {
                        aVar.handle();
                    }
                }
            }
            list.add(t);
        }
    }

    /* renamed from: b */
    public static <T> void m205911b(List<T> list, T t, AbstractC53247a aVar) {
        if (t != null) {
            list.remove(t);
            if (list.isEmpty()) {
                synchronized (list) {
                    if (list.isEmpty()) {
                        aVar.handle();
                    }
                }
            }
        }
    }
}
