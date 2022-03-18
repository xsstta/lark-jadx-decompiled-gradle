package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0797c;
import androidx.core.view.C0918t;
import androidx.core.view.View$OnAttachStateChangeListenerC0913o;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.r */
public abstract class AbstractC1062r {
    /* renamed from: a */
    public abstract Object mo5643a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo5644a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo5646a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo5647a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo5648a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo5649a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo5650a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo5651a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo5652a(Object obj);

    /* renamed from: b */
    public abstract Object mo5653b(Object obj);

    /* renamed from: b */
    public abstract Object mo5654b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo5655b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo5656b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo5657b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo5658c(Object obj);

    /* renamed from: c */
    public abstract void mo5659c(Object obj, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5682a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0918t.m4410a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo5682a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5683a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String u = ViewCompat.m4106u(view);
            if (u != null) {
                map.put(u, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo5683a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5645a(Fragment fragment, Object obj, C0797c cVar, Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5681a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        View$OnAttachStateChangeListenerC0913o.m4399a(viewGroup, new Runnable() {
            /* class androidx.fragment.app.AbstractC1062r.RunnableC10653 */

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    ViewCompat.m4048a(view, (String) map.get(ViewCompat.m4106u(view)));
                }
            }
        });
    }

    /* renamed from: a */
    protected static boolean m5142a(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo5677a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ViewCompat.m4106u(view));
            ViewCompat.m4048a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    static String m5140a(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m5141a(List<View> list, View view) {
        int size = list.size();
        if (!m5143a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m5143a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5678a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    private static boolean m5143a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5680a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        View$OnAttachStateChangeListenerC0913o.m4399a(view, new Runnable() {
            /* class androidx.fragment.app.AbstractC1062r.RunnableC10642 */

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String u = ViewCompat.m4106u(view);
                    if (u != null) {
                        ViewCompat.m4048a(view, AbstractC1062r.m5140a(map, u));
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5679a(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String u = ViewCompat.m4106u(view2);
            arrayList4.add(u);
            if (u != null) {
                ViewCompat.m4048a(view2, (String) null);
                String str = map.get(u);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ViewCompat.m4048a(arrayList2.get(i2), u);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        View$OnAttachStateChangeListenerC0913o.m4399a(view, new Runnable() {
            /* class androidx.fragment.app.AbstractC1062r.RunnableC10631 */

            public void run() {
                for (int i = 0; i < size; i++) {
                    ViewCompat.m4048a((View) arrayList2.get(i), (String) arrayList3.get(i));
                    ViewCompat.m4048a((View) arrayList.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }
}
