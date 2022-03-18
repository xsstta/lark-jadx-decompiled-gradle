package com.ss.android.lark.chatwindow.p1723b;

import android.content.Context;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import com.ss.android.lark.statistics.p2701o.C54970a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chatwindow.b.a */
public class C35232a {
    /* renamed from: a */
    public static <T> List<C53085d> m137575a(Context context, List<C34029b<T>> list) {
        C53085d dVar;
        ArrayList arrayList = new ArrayList();
        for (final C34029b<T> bVar : list) {
            if (bVar.f87966a != 0) {
                C352331 r2 = new C53085d.AbstractC53086a() {
                    /* class com.ss.android.lark.chatwindow.p1723b.C35232a.C352331 */

                    @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
                    public void onMenuItemClick() {
                        if (bVar.f87974i != null) {
                            C54970a.m213421a(bVar);
                            C54970a.m213419a(bVar.f87966a, false);
                            bVar.f87974i.onSelected(bVar);
                        }
                    }
                };
                if (bVar.f87970e == -1) {
                    dVar = new C53085d(bVar.f87971f, bVar.f87969d, r2);
                } else {
                    dVar = new C53085d(bVar.f87971f, UDIconUtils.getIconDrawable(context, bVar.f87969d, UIUtils.getColor(context, bVar.f87970e)), r2);
                }
                dVar.f131259i = bVar.f87973h;
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }
}
