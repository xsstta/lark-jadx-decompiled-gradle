package com.bytedance.ee.appstrategy;

import android.content.Context;
import com.bytedance.ee.appstrategy.C4149b;
import com.bytedance.ee.appstrategy.p240a.AbstractC4146d;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.appstrategy.p240a.C4148f;
import com.bytedance.ee.appstrategy.p240a.DialogInterface$OnClickListenerC4144b;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.bytedance.ee.appstrategy.e */
public class C4153e {

    /* renamed from: a */
    static Locale f12618a = Locale.CHINA;

    /* renamed from: a */
    public static void m17260a(Context context, C4145c cVar, AbstractC4146d dVar) {
        C25639g c = new C25639g(context).mo89246d(false).mo89247e(false).mo89238b(true).mo89250i(R.color.text_title).mo89249h(17).mo89223a(-1, 24, -1, -1).mo89237b(cVar.f12601c).mo89255n(16).mo89256o(R.color.text_title).mo89242c(cVar.f12602d);
        if (cVar.f12603e.isEmpty()) {
            Log.m165383e("UIHelper", "btns null");
            return;
        }
        int size = cVar.f12603e.size();
        if (size == 1) {
            C4148f fVar = cVar.f12603e.get(0);
            c.mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_center).mo89268a(fVar.f12604a).mo89271d(R.color.primary_pri_500).mo89267a(new DialogInterface$OnClickListenerC4144b(cVar.f12599a, cVar.f12600b, fVar, dVar)));
        } else if (size != 2) {
            Log.m165397w("UIHelper", "unhandle button size");
        } else {
            C4148f fVar2 = cVar.f12603e.get(0);
            c.mo89225a(R.id.lkui_dialog_btn_left, fVar2.f12604a, new DialogInterface$OnClickListenerC4144b(cVar.f12599a, cVar.f12600b, fVar2, dVar));
            C4148f fVar3 = cVar.f12603e.get(1);
            c.mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89268a(fVar3.f12604a).mo89271d(R.color.primary_pri_500).mo89267a(new DialogInterface$OnClickListenerC4144b(cVar.f12599a, cVar.f12600b, fVar3, dVar)));
        }
        c.mo89233b().show();
    }

    /* renamed from: a */
    public static void m17261a(Context context, C4149b bVar, AbstractC4152d dVar) {
        ArrayList<C4149b.C4150a> arrayList = bVar.f12609c;
        if (arrayList == null || arrayList.isEmpty()) {
            dVar.mo16257a(false);
            return;
        }
        C25639g c = new C25639g(context).mo89246d(false).mo89247e(false).mo89238b(true).mo89250i(R.color.lkui_N900).mo89249h(17).mo89223a(-1, 24, -1, -1).mo89237b(bVar.f12607a).mo89255n(16).mo89256o(R.color.lkui_N600).mo89242c(bVar.f12608b);
        if (arrayList.size() == 1) {
            C4149b.C4150a aVar = arrayList.get(0);
            c.mo89225a(R.id.lkui_dialog_btn_center, aVar.f12611a, new DialogInterface$OnClickListenerC4142a(aVar, dVar));
        } else {
            C4149b.C4150a aVar2 = arrayList.get(0);
            c.mo89225a(R.id.lkui_dialog_btn_left, aVar2.f12611a, new DialogInterface$OnClickListenerC4142a(aVar2, dVar));
            C4149b.C4150a aVar3 = arrayList.get(1);
            c.mo89225a(R.id.lkui_dialog_btn_right, aVar3.f12611a, new DialogInterface$OnClickListenerC4142a(aVar3, dVar));
        }
        c.mo89233b().show();
    }
}
