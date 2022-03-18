package com.ss.android.lark.calendar.impl.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.C31099a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.RedDotUiItem;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.utils.h */
public class C32654h {

    /* renamed from: a */
    boolean f83789a;

    /* renamed from: b */
    List<RedDotUiItem> f83790b;

    /* renamed from: c */
    Map<Integer, Integer> f83791c;

    /* renamed from: d */
    Map<Integer, Integer> f83792d;

    /* renamed from: e */
    List<WeakReference<View>> f83793e;

    /* renamed from: f */
    List<WeakReference<RedDotUiItem.ItemName>> f83794f;

    /* renamed from: g */
    AbstractC32594f f83795g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.utils.h$a */
    public static class C32657a {

        /* renamed from: a */
        public static final C32654h f83804a = new C32654h();
    }

    /* renamed from: a */
    public List<RedDotUiItem> mo120348a(List<RedDotUiItem> list) {
        return list;
    }

    /* renamed from: a */
    public static C32654h m125317a() {
        return C32657a.f83804a;
    }

    private C32654h() {
        this.f83795g = C32533b.m124620a();
        mo120352b();
    }

    /* renamed from: b */
    public void mo120352b() {
        this.f83793e = new ArrayList();
        this.f83794f = new ArrayList();
        this.f83790b = new ArrayList();
        final String l = Long.toString(new Date().getTime());
        Log.m165389i("CalendarRedDotManager", C32673y.m125376b(l, "loadRedDotConfig", new String[0]));
        this.f83795g.mo118876b(new UIGetDataCallback(new IGetDataCallback<List<RedDotUiItem>>("loadRedDotConfig") {
            /* class com.ss.android.lark.calendar.impl.utils.C32654h.C326551 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("CalendarRedDotManager", C32673y.m125370a(l, "loadRedDotConfig", errorResult));
                C32654h.this.f83789a = true;
            }

            /* renamed from: a */
            public void onSuccess(List<RedDotUiItem> list) {
                Log.m165389i("CalendarRedDotManager", C32673y.m125373a(l, "loadRedDotConfig", "red_dot_items_size", list == null ? "null" : list.size() + ""));
                C32654h hVar = C32654h.this;
                hVar.f83790b = hVar.mo120348a(list);
                C32654h.this.f83789a = true;
                for (int i = 0; i < C32654h.this.f83793e.size(); i++) {
                    View view = C32654h.this.f83793e.get(i).get();
                    RedDotUiItem.ItemName itemName = C32654h.this.f83794f.get(i).get();
                    if (!(view == null || itemName == null)) {
                        C32654h.this.mo120351a(view, itemName);
                    }
                }
                C32654h.this.f83793e.clear();
                C32654h.this.f83794f.clear();
            }
        }));
    }

    /* renamed from: c */
    private void m125321c() {
        if (CollectionUtils.isEmpty(this.f83791c)) {
            HashMap hashMap = new HashMap();
            this.f83791c = hashMap;
            hashMap.put(2, 1);
        }
        if (CollectionUtils.isEmpty(this.f83792d)) {
            this.f83792d = new HashMap();
            if (CollectionUtils.isNotEmpty(this.f83790b)) {
                for (RedDotUiItem redDotUiItem : this.f83790b) {
                    Integer num = this.f83791c.get(Integer.valueOf(redDotUiItem.mo119953a()));
                    if (num != null) {
                        Integer num2 = this.f83792d.get(num);
                        if (num2 != null) {
                            this.f83792d.put(num, Integer.valueOf(num2.intValue() + 1));
                        } else {
                            this.f83792d.put(num, 1);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m125319b(View view) {
        View childAt;
        ViewParent parent = view.getParent();
        if (parent == null || !(parent instanceof ViewGroup) || (childAt = ((ViewGroup) parent).getChildAt(1)) == null || !(childAt instanceof C31099a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo120349a(View view) {
        View childAt;
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup) && (childAt = ((ViewGroup) parent).getChildAt(1)) != null && (childAt instanceof C31099a)) {
            ((C31099a) childAt).mo112661a();
        }
    }

    /* renamed from: c */
    private List<RedDotUiItem> m125320c(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            for (RedDotUiItem redDotUiItem : this.f83790b) {
                if (num.intValue() == redDotUiItem.mo119953a()) {
                    arrayList.add(redDotUiItem);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo120353b(List<RedDotUiItem> list) {
        for (RedDotUiItem redDotUiItem : list) {
            int a = redDotUiItem.mo119953a();
            int i = 0;
            while (i < this.f83790b.size()) {
                if (this.f83790b.get(i).mo119953a() == a) {
                    this.f83790b.remove(i);
                    this.f83792d.remove(Integer.valueOf(a));
                    i--;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m125318a(int i, List<Integer> list) {
        Integer num;
        list.add(Integer.valueOf(i));
        Integer num2 = this.f83791c.get(Integer.valueOf(i));
        if (num2 != null && (num = this.f83792d.get(num2)) != null) {
            if (num.intValue() - 1 == 0) {
                m125318a(num2.intValue(), list);
            } else {
                this.f83792d.put(num2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: a */
    public void mo120350a(final View view, int i) {
        if (CollectionUtils.isNotEmpty(this.f83790b) && view != null) {
            ArrayList arrayList = new ArrayList();
            m125321c();
            m125318a(i, arrayList);
            final List<RedDotUiItem> c = m125320c(arrayList);
            if (!CollectionUtils.isEmpty(c)) {
                final String l = Long.toString(new Date().getTime());
                Log.m165389i("CalendarRedDotManager", C32673y.m125376b(l, "markRedDotsDisappear", "red_dot_items_size", c.size() + ""));
                this.f83795g.mo118883c(c, new UIGetDataCallback(new IGetDataCallback<Boolean>("markRedDotsDisappear") {
                    /* class com.ss.android.lark.calendar.impl.utils.C32654h.C326562 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        Log.m165389i("CalendarRedDotManager", C32673y.m125373a(l, "markRedDotsDisappear", new String[0]));
                        C32654h.this.mo120353b(c);
                        C32654h.this.mo120349a(view);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165389i("CalendarRedDotManager", C32673y.m125370a(l, "markRedDotsDisappear", errorResult));
                        C32654h.this.mo120353b(c);
                        C32654h.this.mo120349a(view);
                    }
                }));
            }
        }
    }

    /* renamed from: a */
    public void mo120351a(View view, RedDotUiItem.ItemName itemName) {
        if (view != null) {
            boolean z = false;
            if (CollectionUtils.isNotEmpty(this.f83790b) || this.f83789a) {
                Iterator<RedDotUiItem> it = this.f83790b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (itemName == it.next().mo119956b()) {
                        if (!m125319b(view)) {
                            C31099a a = new C31099a(view.getContext()).mo112660a(view);
                            if (view != null && (view instanceof TextView)) {
                                a.mo112659a(8388629);
                            }
                        }
                        z = true;
                    }
                }
            } else {
                this.f83793e.add(new WeakReference<>(view));
                this.f83794f.add(new WeakReference<>(itemName));
            }
            if (!z) {
                mo120349a(view);
            }
        }
    }
}
