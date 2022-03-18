package com.ss.android.lark.feed.service.impl;

import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.feed.p1847a.C37268c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.impl.j */
public class C38165j {

    /* renamed from: a */
    static AbstractC32808a f97853a = C37268c.m146766b().mo139154A().mo139234a();

    /* renamed from: a */
    public static List<Shortcut> m150038a(List<com.bytedance.lark.pb.feed.v1.Shortcut> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.feed.v1.Shortcut shortcut : list) {
            Shortcut shortcut2 = new Shortcut(f97853a.mo120944a(shortcut.channel));
            shortcut2.setPosition(shortcut.position.intValue());
            arrayList.add(shortcut2);
        }
        return arrayList;
    }
}
