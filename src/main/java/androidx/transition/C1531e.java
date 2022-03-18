package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0797c;
import androidx.fragment.app.AbstractC1062r;
import androidx.fragment.app.Fragment;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.transition.e */
public class C1531e extends AbstractC1062r {
    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5651a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.mo7914g().clear();
            transitionSet.mo7914g().addAll(arrayList2);
            mo5657b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public boolean mo5652a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public Object mo5653b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: c */
    public Object mo5658c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo7933a((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m7046a(Transition transition) {
        if (!m5142a((List) transition.mo7912f()) || !m5142a((List) transition.mo7915h()) || !m5142a((List) transition.mo7916i())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5644a(ViewGroup viewGroup, Object obj) {
        C1556v.m7131a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public void mo5655b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo7905c(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: c */
    public void mo5659c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo7909d(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5646a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo7891a(new Transition.AbstractC1504c() {
                /* class androidx.transition.C1531e.C15376 */

                @Override // androidx.transition.Transition.AbstractC1504c
                /* renamed from: a */
                public Rect mo7930a(Transition transition) {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5647a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            mo5678a(view, rect);
            ((Transition) obj).mo7891a(new Transition.AbstractC1504c() {
                /* class androidx.transition.C1531e.C15321 */

                @Override // androidx.transition.Transition.AbstractC1504c
                /* renamed from: a */
                public Rect mo7930a(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5650a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int s = transitionSet.mo7944s();
                while (i < s) {
                    mo5650a(transitionSet.mo7936c(i), arrayList);
                    i++;
                }
            } else if (!m7046a(transition) && m5142a((List) transition.mo7914g())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.mo7905c(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public Object mo5643a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo7933a((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo7933a((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo7933a((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public void mo5656b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).mo7880a(new Transition.AbstractC1505d() {
            /* class androidx.transition.C1531e.C15332 */

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: a */
            public void mo7815a(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: c */
            public void mo7817c(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: d */
            public void mo7818d(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: e */
            public void mo7931e(Transition transition) {
                transition.mo7898b(this);
                transition.mo7880a(this);
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: b */
            public void mo7816b(Transition transition) {
                transition.mo7898b(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public Object mo5654b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().mo7933a(transition).mo7933a(transition2).mo7874a(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.mo7933a(transition);
        }
        transitionSet.mo7933a(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public void mo5657b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int s = transitionSet.mo7944s();
            while (i2 < s) {
                mo5657b((Object) transitionSet.mo7936c(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m7046a(transition)) {
            List<View> g = transition.mo7914g();
            if (g.size() == arrayList.size() && g.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.mo7905c(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.mo7909d(arrayList.get(size));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5648a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> g = transitionSet.mo7914g();
        g.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m5141a(g, arrayList.get(i));
        }
        g.add(view);
        arrayList.add(view);
        mo5650a(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5645a(Fragment fragment, Object obj, C0797c cVar, final Runnable runnable) {
        final Transition transition = (Transition) obj;
        cVar.mo4385a(new C0797c.AbstractC0798a() {
            /* class androidx.transition.C1531e.C15354 */

            @Override // androidx.core.os.C0797c.AbstractC0798a
            /* renamed from: a */
            public void mo4390a() {
                transition.mo7919l();
            }
        });
        transition.mo7880a(new Transition.AbstractC1505d() {
            /* class androidx.transition.C1531e.C15365 */

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: a */
            public void mo7815a(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: c */
            public void mo7817c(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: d */
            public void mo7818d(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: e */
            public void mo7931e(Transition transition) {
            }

            @Override // androidx.transition.Transition.AbstractC1505d
            /* renamed from: b */
            public void mo7816b(Transition transition) {
                runnable.run();
            }
        });
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5649a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).mo7880a(new C1555u() {
            /* class androidx.transition.C1531e.C15343 */

            @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
            /* renamed from: b */
            public void mo7816b(Transition transition) {
                transition.mo7898b(this);
            }

            @Override // androidx.transition.C1555u, androidx.transition.Transition.AbstractC1505d
            /* renamed from: e */
            public void mo7931e(Transition transition) {
                Object obj = obj2;
                if (obj != null) {
                    C1531e.this.mo5657b(obj, arrayList, (ArrayList<View>) null);
                }
                Object obj2 = obj3;
                if (obj2 != null) {
                    C1531e.this.mo5657b(obj2, arrayList2, (ArrayList<View>) null);
                }
                Object obj3 = obj4;
                if (obj3 != null) {
                    C1531e.this.mo5657b(obj3, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }
}
