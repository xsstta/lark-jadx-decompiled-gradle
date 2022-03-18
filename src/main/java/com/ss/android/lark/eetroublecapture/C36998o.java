package com.ss.android.lark.eetroublecapture;

import android.content.res.Resources;
import android.util.Pair;
import android.view.View;
import com.ss.android.lark.eetroublebase.C36960a;
import com.ss.android.lark.eetroublebase.p1826a.C36966c;
import com.ss.android.lark.eetroublebase.view.ViewInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.eetroublecapture.o */
public class C36998o {

    /* renamed from: a */
    private View f95114a;

    /* renamed from: b */
    private ViewInfo f95115b;

    /* renamed from: c */
    private Map<View, Object> f95116c;

    /* renamed from: a */
    public ViewInfo mo136517a() {
        ViewInfo a = m146020a(this.f95114a);
        this.f95115b = a;
        m146021a(this.f95114a, a, 0);
        m146022a(this.f95115b);
        m146024c(this.f95115b);
        return this.f95115b;
    }

    /* renamed from: a */
    private void m146022a(ViewInfo viewInfo) {
        if (!(viewInfo == null || viewInfo.subs == null)) {
            viewInfo.subs = m146023b(viewInfo);
            for (ViewInfo viewInfo2 : viewInfo.subs) {
                m146022a(viewInfo2);
            }
        }
    }

    /* renamed from: b */
    private List<ViewInfo> m146023b(ViewInfo viewInfo) {
        if (viewInfo == null || viewInfo.subs == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ViewInfo viewInfo2 : viewInfo.subs) {
            if (!viewInfo2.isSelfEmpty()) {
                linkedList.add(viewInfo2);
            } else {
                List<ViewInfo> b = m146023b(viewInfo2);
                if (b != null) {
                    linkedList.addAll(b);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m146024c(ViewInfo viewInfo) {
        if (viewInfo != null) {
            if (viewInfo.isEmpty()) {
                viewInfo.subs = null;
            } else if (viewInfo.subs != null) {
                Iterator<ViewInfo> it = viewInfo.subs.iterator();
                while (it.hasNext()) {
                    ViewInfo next = it.next();
                    m146024c(next);
                    if (next.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private ViewInfo m146020a(View view) {
        Object obj;
        boolean z;
        boolean z2;
        ViewInfo viewInfo = new ViewInfo();
        if (view == null) {
            viewInfo.empty_mark = true;
            return viewInfo;
        }
        Map<View, Object> map = this.f95116c;
        Map<String, String> map2 = null;
        if (map != null) {
            obj = map.get(view);
        } else {
            obj = null;
        }
        AbstractC36983e a = C36969b.m145954a(view);
        if (a == null || a.mo136497b()) {
            z = true;
        } else {
            z = false;
        }
        if (z && obj == null) {
            return viewInfo;
        }
        viewInfo.f95041n = C36966c.m145948a(view.getClass());
        try {
            viewInfo.resId = view.getResources().getResourceEntryName(view.getId());
        } catch (Resources.NotFoundException unused) {
        }
        if (view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        viewInfo.visible = Boolean.valueOf(z2);
        viewInfo.f95042p = new ViewInfo.Position();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        viewInfo.f95042p.f95045x = iArr[0];
        viewInfo.f95042p.f95046y = iArr[1];
        viewInfo.f95042p.f95044w = view.getWidth();
        viewInfo.f95042p.f95043h = view.getHeight();
        if (a != null) {
            map2 = a.mo129679c();
        }
        if (!(obj == null && map2 == null)) {
            viewInfo.f95040k = new HashMap();
            if (obj != null) {
                viewInfo.f95040k.put("addition", obj);
            }
            if (map2 != null) {
                viewInfo.f95040k.put("key", map2);
            }
        }
        return viewInfo;
    }

    C36998o(View view, Map<View, Object> map) {
        this.f95114a = view;
        this.f95116c = map;
    }

    /* renamed from: a */
    private void m146021a(View view, ViewInfo viewInfo, int i) {
        if (!(view == null || viewInfo == null || i >= C36960a.m145914a().mo136418d())) {
            AbstractC36983e a = C36969b.m145954a(view);
            if (a == null || !a.mo136496a()) {
                List<View> a2 = C36966c.m145949a(view);
                if (!a2.isEmpty()) {
                    viewInfo.subs = new ArrayList();
                }
                ArrayList<Pair> arrayList = new ArrayList(a2.size());
                for (View view2 : a2) {
                    ViewInfo a3 = m146020a(view2);
                    viewInfo.subs.add(a3);
                    arrayList.add(new Pair(view2, a3));
                }
                for (Pair pair : arrayList) {
                    m146021a((View) pair.first, (ViewInfo) pair.second, i + 1);
                }
            }
        }
    }
}
