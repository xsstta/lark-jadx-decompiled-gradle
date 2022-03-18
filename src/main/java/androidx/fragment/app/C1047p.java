package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.core.app.AbstractC0743j;
import androidx.core.os.C0797c;
import androidx.core.view.View$OnAttachStateChangeListenerC0913o;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentTransaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.p */
class C1047p {

    /* renamed from: a */
    private static final int[] f3969a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final AbstractC1062r f3970b;

    /* renamed from: c */
    private static final AbstractC1062r f3971c = m5115b();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.p$a */
    public interface AbstractC1054a {
        /* renamed from: a */
        void mo5394a(Fragment fragment, C0797c cVar);

        /* renamed from: b */
        void mo5395b(Fragment fragment, C0797c cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.p$b */
    public static class C1055b {

        /* renamed from: a */
        public Fragment f4006a;

        /* renamed from: b */
        public boolean f4007b;

        /* renamed from: c */
        public C1020a f4008c;

        /* renamed from: d */
        public Fragment f4009d;

        /* renamed from: e */
        public boolean f4010e;

        /* renamed from: f */
        public C1020a f4011f;

        C1055b() {
        }
    }

    /* renamed from: a */
    static void m5104a(FragmentManager fragmentManager, ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, AbstractC1054a aVar) {
        if (fragmentManager.mCurState >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C1020a aVar2 = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m5119b(aVar2, sparseArray, z);
                } else {
                    m5105a(aVar2, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(fragmentManager.mHost.mo5557g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    ArrayMap<String, String> a = m5091a(keyAt, arrayList, arrayList2, i, i2);
                    C1055b bVar = (C1055b) sparseArray.valueAt(i4);
                    if (z) {
                        m5103a(fragmentManager, keyAt, bVar, view, a, aVar);
                    } else {
                        m5118b(fragmentManager, keyAt, bVar, view, a, aVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r12 = r19.f4006a;
        r13 = r19.f4009d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5103a(androidx.fragment.app.FragmentManager r17, int r18, androidx.fragment.app.C1047p.C1055b r19, android.view.View r20, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r21, final androidx.fragment.app.C1047p.AbstractC1054a r22) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1047p.m5103a(androidx.fragment.app.FragmentManager, int, androidx.fragment.app.p$b, android.view.View, androidx.collection.ArrayMap, androidx.fragment.app.p$a):void");
    }

    /* renamed from: a */
    private static void m5108a(AbstractC1062r rVar, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            rVar.mo5656b(obj, fragment.getView(), arrayList);
            View$OnAttachStateChangeListenerC0913o.m4399a(fragment.mContainer, new Runnable() {
                /* class androidx.fragment.app.C1047p.RunnableC10492 */

                public void run() {
                    C1047p.m5110a(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m5107a(final AbstractC1062r rVar, ViewGroup viewGroup, final Fragment fragment, final View view, final ArrayList<View> arrayList, final Object obj, final ArrayList<View> arrayList2, final Object obj2, final ArrayList<View> arrayList3) {
        View$OnAttachStateChangeListenerC0913o.m4399a(viewGroup, new Runnable() {
            /* class androidx.fragment.app.C1047p.RunnableC10514 */

            public void run() {
                Object obj = obj;
                if (obj != null) {
                    rVar.mo5659c(obj, view);
                    arrayList2.addAll(C1047p.m5100a(rVar, obj, fragment, arrayList, view));
                }
                if (arrayList3 != null) {
                    if (obj2 != null) {
                        ArrayList<View> arrayList = new ArrayList<>();
                        arrayList.add(view);
                        rVar.mo5657b(obj2, arrayList3, arrayList);
                    }
                    arrayList3.clear();
                    arrayList3.add(view);
                }
            }
        });
    }

    /* renamed from: a */
    private static boolean m5113a(AbstractC1062r rVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!rVar.mo5652a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m5111a(ArrayList<View> arrayList, ArrayMap<String, View> arrayMap, Collection<String> collection) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            View valueAt = arrayMap.valueAt(size);
            if (collection.contains(ViewCompat.m4106u(valueAt))) {
                arrayList.add(valueAt);
            }
        }
    }

    /* renamed from: a */
    private static String m5099a(ArrayMap<String, String> arrayMap, String str) {
        int size = arrayMap.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                return arrayMap.keyAt(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m5109a(AbstractC1062r rVar, Object obj, Object obj2, ArrayMap<String, View> arrayMap, boolean z, C1020a aVar) {
        String str;
        if (aVar.mSharedElementSourceNames != null && !aVar.mSharedElementSourceNames.isEmpty()) {
            if (z) {
                str = (String) aVar.mSharedElementTargetNames.get(0);
            } else {
                str = (String) aVar.mSharedElementSourceNames.get(0);
            }
            View view = arrayMap.get(str);
            rVar.mo5647a(obj, view);
            if (obj2 != null) {
                rVar.mo5647a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m5101a(ArrayMap<String, String> arrayMap, ArrayMap<String, View> arrayMap2) {
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    /* renamed from: a */
    static void m5102a(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        AbstractC0743j jVar;
        int i;
        if (z) {
            jVar = fragment2.getEnterTransitionCallback();
        } else {
            jVar = fragment.getEnterTransitionCallback();
        }
        if (jVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (arrayMap == null) {
                i = 0;
            } else {
                i = arrayMap.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(arrayMap.keyAt(i2));
                arrayList.add(arrayMap.valueAt(i2));
            }
            if (z2) {
                jVar.mo4254a(arrayList2, arrayList, (List<View>) null);
            } else {
                jVar.mo4256b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m5100a(AbstractC1062r rVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            rVar.mo5682a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        rVar.mo5650a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m5110a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m5098a(AbstractC1062r rVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return rVar.mo5643a(obj2, obj, obj3);
        }
        return rVar.mo5654b(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m5105a(C1020a aVar, SparseArray<C1055b> sparseArray, boolean z) {
        int size = aVar.mOps.size();
        for (int i = 0; i < size; i++) {
            m5106a(aVar, (FragmentTransaction.C1019a) aVar.mOps.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    static boolean m5112a() {
        return (f3970b == null && f3971c == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0070, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008c, code lost:
        if (r0.mHidden == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5106a(androidx.fragment.app.C1020a r8, androidx.fragment.app.FragmentTransaction.C1019a r9, android.util.SparseArray<androidx.fragment.app.C1047p.C1055b> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1047p.m5106a(androidx.fragment.app.a, androidx.fragment.app.FragmentTransaction$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: b */
    private static AbstractC1062r m5115b() {
        try {
            return (AbstractC1062r) Class.forName("androidx.transition.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        C1056q qVar;
        if (Build.VERSION.SDK_INT >= 21) {
            qVar = new C1056q();
        } else {
            qVar = null;
        }
        f3970b = qVar;
    }

    /* renamed from: a */
    private static AbstractC1062r m5094a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC1062r rVar = f3970b;
        if (rVar != null && m5113a(rVar, arrayList)) {
            return rVar;
        }
        AbstractC1062r rVar2 = f3971c;
        if (rVar2 != null && m5113a(rVar2, arrayList)) {
            return rVar2;
        }
        if (rVar == null && rVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C1055b m5093a(C1055b bVar, SparseArray<C1055b> sparseArray, int i) {
        if (bVar != null) {
            return bVar;
        }
        C1055b bVar2 = new C1055b();
        sparseArray.put(i, bVar2);
        return bVar2;
    }

    /* renamed from: b */
    private static Object m5117b(AbstractC1062r rVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return rVar.mo5653b(obj);
    }

    /* renamed from: b */
    public static void m5119b(C1020a aVar, SparseArray<C1055b> sparseArray, boolean z) {
        if (aVar.f3904a.mContainer.mo5237a()) {
            for (int size = aVar.mOps.size() - 1; size >= 0; size--) {
                m5106a(aVar, (FragmentTransaction.C1019a) aVar.mOps.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static Object m5097a(AbstractC1062r rVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return rVar.mo5653b(obj);
    }

    /* renamed from: a */
    private static Object m5096a(AbstractC1062r rVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return rVar.mo5658c(rVar.mo5653b(obj));
    }

    /* renamed from: a */
    static View m5090a(ArrayMap<String, View> arrayMap, C1055b bVar, Object obj, boolean z) {
        String str;
        C1020a aVar = bVar.f4008c;
        if (obj == null || arrayMap == null || aVar.mSharedElementSourceNames == null || aVar.mSharedElementSourceNames.isEmpty()) {
            return null;
        }
        if (z) {
            str = (String) aVar.mSharedElementSourceNames.get(0);
        } else {
            str = (String) aVar.mSharedElementTargetNames.get(0);
        }
        return arrayMap.get(str);
    }

    /* renamed from: b */
    private static ArrayMap<String, View> m5114b(AbstractC1062r rVar, ArrayMap<String, String> arrayMap, Object obj, C1055b bVar) {
        AbstractC0743j jVar;
        ArrayList arrayList;
        if (arrayMap.isEmpty() || obj == null) {
            arrayMap.clear();
            return null;
        }
        Fragment fragment = bVar.f4009d;
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        rVar.mo5683a((Map<String, View>) arrayMap2, fragment.requireView());
        C1020a aVar = bVar.f4011f;
        if (bVar.f4010e) {
            jVar = fragment.getEnterTransitionCallback();
            arrayList = aVar.mSharedElementTargetNames;
        } else {
            jVar = fragment.getExitTransitionCallback();
            arrayList = aVar.mSharedElementSourceNames;
        }
        if (arrayList != null) {
            arrayMap2.retainAll(arrayList);
        }
        if (jVar != null) {
            jVar.mo4255a(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = arrayMap2.get(str);
                if (view == null) {
                    arrayMap.remove(str);
                } else if (!str.equals(ViewCompat.m4106u(view))) {
                    arrayMap.put(ViewCompat.m4106u(view), arrayMap.remove(str));
                }
            }
        } else {
            arrayMap.retainAll(arrayMap2.keySet());
        }
        return arrayMap2;
    }

    /* renamed from: a */
    static ArrayMap<String, View> m5092a(AbstractC1062r rVar, ArrayMap<String, String> arrayMap, Object obj, C1055b bVar) {
        AbstractC0743j jVar;
        ArrayList arrayList;
        String a;
        Fragment fragment = bVar.f4006a;
        View view = fragment.getView();
        if (arrayMap.isEmpty() || obj == null || view == null) {
            arrayMap.clear();
            return null;
        }
        ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
        rVar.mo5683a((Map<String, View>) arrayMap2, view);
        C1020a aVar = bVar.f4008c;
        if (bVar.f4007b) {
            jVar = fragment.getExitTransitionCallback();
            arrayList = aVar.mSharedElementSourceNames;
        } else {
            jVar = fragment.getEnterTransitionCallback();
            arrayList = aVar.mSharedElementTargetNames;
        }
        if (arrayList != null) {
            arrayMap2.retainAll(arrayList);
            arrayMap2.retainAll(arrayMap.values());
        }
        if (jVar != null) {
            jVar.mo4255a(arrayList, arrayMap2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = arrayMap2.get(str);
                if (view2 == null) {
                    String a2 = m5099a(arrayMap, str);
                    if (a2 != null) {
                        arrayMap.remove(a2);
                    }
                } else if (!str.equals(ViewCompat.m4106u(view2)) && (a = m5099a(arrayMap, str)) != null) {
                    arrayMap.put(a, ViewCompat.m4106u(view2));
                }
            }
        } else {
            m5101a(arrayMap, arrayMap2);
        }
        return arrayMap2;
    }

    /* renamed from: a */
    private static ArrayMap<String, String> m5091a(int i, ArrayList<C1020a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C1020a aVar = arrayList.get(i4);
            if (aVar.mo5506b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (aVar.mSharedElementSourceNames != null) {
                    int size = aVar.mSharedElementSourceNames.size();
                    if (booleanValue) {
                        arrayList3 = aVar.mSharedElementSourceNames;
                        arrayList4 = aVar.mSharedElementTargetNames;
                    } else {
                        ArrayList arrayList5 = aVar.mSharedElementSourceNames;
                        arrayList3 = aVar.mSharedElementTargetNames;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String remove = arrayMap.remove(str2);
                        if (remove != null) {
                            arrayMap.put(str, remove);
                        } else {
                            arrayMap.put(str, str2);
                        }
                    }
                }
            }
        }
        return arrayMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r15 = r21.f4006a;
        r8 = r21.f4009d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5118b(androidx.fragment.app.FragmentManager r19, int r20, androidx.fragment.app.C1047p.C1055b r21, android.view.View r22, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r23, final androidx.fragment.app.C1047p.AbstractC1054a r24) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1047p.m5118b(androidx.fragment.app.FragmentManager, int, androidx.fragment.app.p$b, android.view.View, androidx.collection.ArrayMap, androidx.fragment.app.p$a):void");
    }

    /* renamed from: b */
    private static Object m5116b(final AbstractC1062r rVar, ViewGroup viewGroup, final View view, final ArrayMap<String, String> arrayMap, final C1055b bVar, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final Object obj, Object obj2) {
        ArrayMap<String, String> arrayMap2;
        Object obj3;
        final Object obj4;
        final Rect rect;
        final Fragment fragment = bVar.f4006a;
        final Fragment fragment2 = bVar.f4009d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = bVar.f4007b;
        if (arrayMap.isEmpty()) {
            arrayMap2 = arrayMap;
            obj3 = null;
        } else {
            obj3 = m5096a(rVar, fragment, fragment2, z);
            arrayMap2 = arrayMap;
        }
        ArrayMap<String, View> b = m5114b(rVar, arrayMap2, obj3, bVar);
        if (arrayMap.isEmpty()) {
            obj4 = null;
        } else {
            arrayList.addAll(b.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        m5102a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            rVar.mo5648a(obj4, view, arrayList);
            m5109a(rVar, obj4, obj2, b, bVar.f4010e, bVar.f4011f);
            if (obj != null) {
                rVar.mo5646a(obj, rect);
            }
        } else {
            rect = null;
        }
        View$OnAttachStateChangeListenerC0913o.m4399a(viewGroup, new Runnable() {
            /* class androidx.fragment.app.C1047p.RunnableC10536 */

            public void run() {
                ArrayMap<String, View> a = C1047p.m5092a(rVar, arrayMap, obj4, bVar);
                if (a != null) {
                    arrayList2.addAll(a.values());
                    arrayList2.add(view);
                }
                C1047p.m5102a(fragment, fragment2, z, a, false);
                Object obj = obj4;
                if (obj != null) {
                    rVar.mo5651a(obj, arrayList, arrayList2);
                    View a2 = C1047p.m5090a(a, bVar, obj, z);
                    if (a2 != null) {
                        rVar.mo5678a(a2, rect);
                    }
                }
            }
        });
        return obj4;
    }

    /* renamed from: a */
    private static Object m5095a(final AbstractC1062r rVar, ViewGroup viewGroup, View view, ArrayMap<String, String> arrayMap, C1055b bVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        final Rect rect;
        final View view2;
        final Fragment fragment = bVar.f4006a;
        final Fragment fragment2 = bVar.f4009d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = bVar.f4007b;
        if (arrayMap.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m5096a(rVar, fragment, fragment2, z);
        }
        ArrayMap<String, View> b = m5114b(rVar, arrayMap, obj3, bVar);
        final ArrayMap<String, View> a = m5092a(rVar, arrayMap, obj3, bVar);
        if (arrayMap.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m5111a(arrayList, b, arrayMap.keySet());
            m5111a(arrayList2, a, arrayMap.values());
            obj4 = obj3;
        }
        if (obj == null && obj2 == null && obj4 == null) {
            return null;
        }
        m5102a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList2.add(view);
            rVar.mo5648a(obj4, view, arrayList);
            m5109a(rVar, obj4, obj2, b, bVar.f4010e, bVar.f4011f);
            Rect rect2 = new Rect();
            View a2 = m5090a(a, bVar, obj, z);
            if (a2 != null) {
                rVar.mo5646a(obj, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        View$OnAttachStateChangeListenerC0913o.m4399a(viewGroup, new Runnable() {
            /* class androidx.fragment.app.C1047p.RunnableC10525 */

            public void run() {
                C1047p.m5102a(fragment, fragment2, z, (ArrayMap<String, View>) a, false);
                View view = view2;
                if (view != null) {
                    rVar.mo5678a(view, rect);
                }
            }
        });
        return obj4;
    }
}
