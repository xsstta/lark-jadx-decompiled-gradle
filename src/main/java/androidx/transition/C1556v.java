package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.transition.v */
public class C1556v {

    /* renamed from: a */
    static ArrayList<ViewGroup> f5445a = new ArrayList<>();

    /* renamed from: b */
    private static Transition f5446b = new AutoTransition();

    /* renamed from: c */
    private static ThreadLocal<WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>>> f5447c = new ThreadLocal<>();

    /* access modifiers changed from: private */
    /* renamed from: androidx.transition.v$a */
    public static class View$OnAttachStateChangeListenerC1557a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        Transition f5448a;

        /* renamed from: b */
        ViewGroup f5449b;

        public void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        private void m7135a() {
            this.f5449b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5449b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m7135a();
            if (!C1556v.f5445a.remove(this.f5449b)) {
                return true;
            }
            final ArrayMap<ViewGroup, ArrayList<Transition>> a = C1556v.m7129a();
            ArrayList<Transition> arrayList = a.get(this.f5449b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a.put(this.f5449b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f5448a);
            this.f5448a.mo7880a(new C1555u() {
                /* class androidx.transition.C1556v.View$OnAttachStateChangeListenerC1557a.C15581 */

                @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
                /* renamed from: b */
                public void mo7816b(Transition transition) {
                    ((ArrayList) a.get(View$OnAttachStateChangeListenerC1557a.this.f5449b)).remove(transition);
                    transition.mo7898b(this);
                }
            });
            this.f5448a.mo7889a(this.f5449b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo7913f(this.f5449b);
                }
            }
            this.f5448a.mo7887a(this.f5449b);
            return true;
        }

        public void onViewDetachedFromWindow(View view) {
            m7135a();
            C1556v.f5445a.remove(this.f5449b);
            ArrayList<Transition> arrayList = C1556v.m7129a().get(this.f5449b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo7913f(this.f5449b);
                }
            }
            this.f5448a.mo7902b(true);
        }

        View$OnAttachStateChangeListenerC1557a(Transition transition, ViewGroup viewGroup) {
            this.f5448a = transition;
            this.f5449b = viewGroup;
        }
    }

    /* renamed from: a */
    static ArrayMap<ViewGroup, ArrayList<Transition>> m7129a() {
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap;
        WeakReference<ArrayMap<ViewGroup, ArrayList<Transition>>> weakReference = f5447c.get();
        if (weakReference != null && (arrayMap = weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap<ViewGroup, ArrayList<Transition>> arrayMap2 = new ArrayMap<>();
        f5447c.set(new WeakReference<>(arrayMap2));
        return arrayMap2;
    }

    /* renamed from: a */
    public static void m7130a(ViewGroup viewGroup) {
        m7131a(viewGroup, null);
    }

    /* renamed from: b */
    public static void m7132b(ViewGroup viewGroup) {
        f5445a.remove(viewGroup);
        ArrayList<Transition> arrayList = m7129a().get(viewGroup);
        if (!(arrayList == null || arrayList.isEmpty())) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((Transition) arrayList2.get(size)).mo7901b(viewGroup);
            }
        }
    }

    /* renamed from: b */
    private static void m7133b(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            View$OnAttachStateChangeListenerC1557a aVar = new View$OnAttachStateChangeListenerC1557a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m7134c(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = m7129a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo7911e(viewGroup);
            }
        }
        if (transition != null) {
            transition.mo7889a(viewGroup, true);
        }
        C1551q a = C1551q.m7112a(viewGroup);
        if (a != null) {
            a.mo8051a();
        }
    }

    /* renamed from: a */
    public static void m7131a(ViewGroup viewGroup, Transition transition) {
        if (!f5445a.contains(viewGroup) && ViewCompat.m4012F(viewGroup)) {
            f5445a.add(viewGroup);
            if (transition == null) {
                transition = f5446b;
            }
            Transition q = transition.clone();
            m7134c(viewGroup, q);
            C1551q.m7113a(viewGroup, null);
            m7133b(viewGroup, q);
        }
    }
}
