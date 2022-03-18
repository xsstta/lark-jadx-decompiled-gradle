package com.ss.android.lark.p2851u.p2852a;

import com.ss.android.lark.chat.entity.chat.SideBarButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.u.a.u */
public class C57331u {
    /* renamed from: a */
    public static List<SideBarButton> m222226a(List<com.bytedance.lark.pb.basic.v1.SideBarButton> list) {
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.basic.v1.SideBarButton sideBarButton : list) {
            arrayList.add(new SideBarButton(sideBarButton.i18n_name, sideBarButton.icon_key, sideBarButton.url));
        }
        return arrayList;
    }
}
