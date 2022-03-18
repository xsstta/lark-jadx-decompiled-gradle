package com.ss.android.lark.ai.enterpriseTopic.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.ContextCompat;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.enterpriseTopic.p1337a.AbstractC28552a;
import com.ss.android.lark.ai.p1330d.p1332b.C28540a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.pb.ai.EntityCard;
import com.ss.android.lark.pb.ai.EntityCardData;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.searchcommon.view.general.lynx.IReportListener;
import com.ss.android.lark.utils.ViewUtils;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.a */
public class C28568a {

    /* renamed from: a */
    private final Context f71852a;

    /* renamed from: b */
    private final AbstractC28552a f71853b;

    /* renamed from: c */
    private final C28540a f71854c;

    /* renamed from: b */
    private PopupWindow m104763b(List<EntityCard> list) {
        int min = Math.min((int) (((double) Math.min(C52990a.m205225a(this.f71852a, ContainerType.Right), C52990a.m205233b(this.f71852a))) * 0.92d), C52990a.m205224a(this.f71852a, 338.0f));
        BasePopupWindow basePopupWindow = new BasePopupWindow(min, -2);
        basePopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        basePopupWindow.setOutsideTouchable(true);
        basePopupWindow.setTouchable(true);
        basePopupWindow.setFocusable(true);
        basePopupWindow.setAnimationStyle(R.style.ReactionPanelAnimation);
        EntityWordComponent bVar = new EntityWordComponent(this.f71852a, this.f71853b, this.f71854c, list, R.layout.abbreviation_panel);
        bVar.mo101717b();
        bVar.mo101712a(min);
        View d = bVar.mo101721d();
        d.setBackground(ContextCompat.getDrawable(this.f71852a, R.drawable.abbr_float_bg));
        basePopupWindow.setContentView(d);
        return basePopupWindow;
    }

    /* renamed from: a */
    public Dialog mo101709a(List<EntityCard> list) {
        Activity a = ViewUtils.m224141a(this.f71852a);
        if (list == null || list.isEmpty() || a == null) {
            return null;
        }
        EntityWordDialog cVar = new EntityWordDialog(a);
        C28522a.m104531a().mo101556a(cVar);
        NewEntityWordComponent eVar = new NewEntityWordComponent(a, this.f71853b, this.f71854c, list, R.layout.abbr_bottom_sheet, cVar.mo101734e());
        eVar.mo101717b();
        cVar.mo101733a(eVar);
        cVar.show();
        return cVar;
    }

    public C28568a(Context context, AbstractC28552a aVar, C28540a aVar2) {
        this.f71852a = context;
        this.f71853b = aVar;
        this.f71854c = aVar2;
    }

    /* renamed from: a */
    public PopupWindow mo101710a(View view, RectF rectF, List<EntityCard> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        PopupWindow b = m104763b(list);
        boolean z = true;
        float[] fArr = {rectF.top, rectF.bottom};
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f = fArr[0] + ((float) iArr[1]);
        float f2 = fArr[1] + ((float) iArr[1]);
        if (f2 <= ((float) C52990a.m205224a(this.f71852a, 300.0f))) {
            z = false;
        }
        int c = C52990a.m205238c(this.f71852a);
        if (z) {
            b.showAtLocation(view, 81, 0, (int) (((float) c) - f));
        } else {
            b.showAtLocation(view, 49, 0, (int) f2);
        }
        return b;
    }

    /* renamed from: a */
    public Dialog mo101708a(EntityCardData entityCardData, IReportListener eVar, String str, IGetDataCallback<String> iGetDataCallback) {
        Activity a = ViewUtils.m224141a(this.f71852a);
        if (a == null) {
            return null;
        }
        LynxContainerDialog dVar = new LynxContainerDialog(a);
        C28522a.m104531a().mo101556a(dVar);
        dVar.mo101738a(entityCardData, eVar);
        if (str != null && !str.isEmpty()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("ClientArgs", str);
            dVar.mo101739a(hashMap);
        }
        dVar.mo101737a(iGetDataCallback);
        return dVar;
    }
}
