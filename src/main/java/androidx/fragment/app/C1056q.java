package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0797c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.q */
class C1056q extends AbstractC1062r {
    C1056q() {
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5651a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
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
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m5122a(Transition transition) {
        if (!m5142a((List) transition.getTargetIds()) || !m5142a((List) transition.getTargetNames()) || !m5142a((List) transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5644a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public void mo5655b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: c */
    public void mo5659c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5646a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                /* class androidx.fragment.app.C1056q.C10615 */

                public Rect onGetEpicenter(Transition transition) {
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
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                /* class androidx.fragment.app.C1056q.C10571 */

                public Rect onGetEpicenter(Transition transition) {
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
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo5650a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m5122a(transition) && m5142a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
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
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public void mo5656b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.C1056q.C10582 */

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
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
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: b */
    public void mo5657b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo5657b((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m5122a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5648a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m5141a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo5650a(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5645a(Fragment fragment, Object obj, C0797c cVar, final Runnable runnable) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.C1056q.C10604 */

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                runnable.run();
            }
        });
    }

    @Override // androidx.fragment.app.AbstractC1062r
    /* renamed from: a */
    public void mo5649a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.C1056q.C10593 */

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }

            public void onTransitionStart(Transition transition) {
                Object obj = obj2;
                if (obj != null) {
                    C1056q.this.mo5657b(obj, arrayList, (ArrayList<View>) null);
                }
                Object obj2 = obj3;
                if (obj2 != null) {
                    C1056q.this.mo5657b(obj2, arrayList2, (ArrayList<View>) null);
                }
                Object obj3 = obj4;
                if (obj3 != null) {
                    C1056q.this.mo5657b(obj3, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }
}
