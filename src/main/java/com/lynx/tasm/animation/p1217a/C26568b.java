package com.lynx.tasm.animation.p1217a;

import androidx.collection.ArrayMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.lynx.tasm.animation.a.b */
public class C26568b {

    /* renamed from: a */
    private static Map<String, AbstractC26569a> f65726a = new ArrayMap();

    /* renamed from: b */
    private static boolean f65727b = false;

    /* renamed from: c */
    private static Queue<Runnable> f65728c = new LinkedList();

    /* renamed from: com.lynx.tasm.animation.a.b$a */
    public interface AbstractC26569a {
        /* renamed from: a */
        void mo94428a(String str);
    }

    /* renamed from: a */
    public static void m96356a(String str) {
        f65727b = true;
        for (String str2 : f65726a.keySet()) {
            if (str.equals(str2)) {
                f65726a.get(str2).mo94428a(str);
            }
        }
        f65727b = false;
        while (!f65728c.isEmpty()) {
            f65728c.remove().run();
        }
    }
}
