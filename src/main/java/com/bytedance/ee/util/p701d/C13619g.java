package com.bytedance.ee.util.p701d;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC69007p;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.d.g */
public class C13619g {

    /* renamed from: com.bytedance.ee.util.d.g$a */
    public static class C13620a {

        /* renamed from: a */
        public final String f35774a;

        /* renamed from: b */
        public final boolean f35775b;

        /* renamed from: c */
        public final boolean f35776c;

        public int hashCode() {
            return (((this.f35774a.hashCode() * 31) + (this.f35775b ? 1 : 0)) * 31) + (this.f35776c ? 1 : 0);
        }

        public String toString() {
            return "Permission{name='" + this.f35774a + '\'' + ", granted=" + this.f35775b + ", shouldShowRequestPermissionRationale=" + this.f35776c + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C13620a aVar = (C13620a) obj;
            if (this.f35775b == aVar.f35775b && this.f35776c == aVar.f35776c) {
                return this.f35774a.equals(aVar.f35774a);
            }
            return false;
        }

        public C13620a(String str, boolean z, boolean z2) {
            this.f35774a = str;
            this.f35775b = z;
            this.f35776c = z2;
        }
    }

    /* renamed from: com.bytedance.ee.util.d.g$b */
    public static class C13621b {

        /* renamed from: a */
        static final String f35777a = "b";

        /* renamed from: b */
        static final Object f35778b = new Object();

        /* renamed from: c */
        AbstractC13626a<C13627c> f35779c;

        @FunctionalInterface
        /* renamed from: com.bytedance.ee.util.d.g$b$a */
        public interface AbstractC13626a<V> {
            /* renamed from: b */
            V mo50571b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50564a() {
            if (Build.VERSION.SDK_INT >= 23) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private AbstractC13626a<C13627c> m55268b(final FragmentManager fragmentManager) {
            return new AbstractC13626a<C13627c>() {
                /* class com.bytedance.ee.util.p701d.C13619g.C13621b.C136221 */

                /* renamed from: c */
                private C13627c f35782c;

                /* renamed from: a */
                public synchronized C13627c mo50571b() {
                    if (this.f35782c == null) {
                        this.f35782c = C13621b.this.mo50561a(fragmentManager);
                    }
                    return this.f35782c;
                }
            };
        }

        /* renamed from: a */
        public <T> AbstractC69007p<T, Boolean> mo50563a(final String... strArr) {
            return new AbstractC69007p<T, Boolean>() {
                /* class com.bytedance.ee.util.p701d.C13619g.C13621b.C136232 */

                @Override // io.reactivex.AbstractC69007p
                /* renamed from: a */
                public ObservableSource<Boolean> mo50572a(Observable<T> observable) {
                    return C13621b.this.mo50562a((Observable<?>) observable, strArr).buffer(strArr.length).flatMap(new Function<List<C13620a>, ObservableSource<Boolean>>() {
                        /* class com.bytedance.ee.util.p701d.C13619g.C13621b.C136232.C136241 */

                        /* renamed from: a */
                        public ObservableSource<Boolean> apply(List<C13620a> list) {
                            if (list.isEmpty()) {
                                return Observable.empty();
                            }
                            for (C13620a aVar : list) {
                                if (!aVar.f35775b) {
                                    return Observable.just(false);
                                }
                            }
                            return Observable.just(true);
                        }
                    });
                }
            };
        }

        public C13621b(FragmentActivity fragmentActivity) {
            this.f35779c = m55268b(fragmentActivity.getSupportFragmentManager());
        }

        /* renamed from: c */
        private C13627c m55269c(FragmentManager fragmentManager) {
            return (C13627c) fragmentManager.findFragmentByTag(f35777a);
        }

        /* renamed from: b */
        public Observable<Boolean> mo50566b(String... strArr) {
            return Observable.just(f35778b).compose(mo50563a(strArr));
        }

        /* renamed from: a */
        public C13627c mo50561a(FragmentManager fragmentManager) {
            boolean z;
            C13627c c = m55269c(fragmentManager);
            if (c == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return c;
            }
            C13627c cVar = new C13627c();
            fragmentManager.beginTransaction().add(cVar, f35777a).commitNow();
            return cVar;
        }

        /* renamed from: b */
        public boolean mo50567b(String str) {
            if (!mo50564a() || !this.f35779c.mo50571b().mo50579b(str)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private Observable<?> m55270e(String... strArr) {
            for (String str : strArr) {
                if (!this.f35779c.mo50571b().mo50581d(str)) {
                    return Observable.empty();
                }
            }
            return Observable.just(f35778b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo50569d(String[] strArr) {
            this.f35779c.mo50571b().mo50582e("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
            this.f35779c.mo50571b().mo50576a(strArr);
        }

        /* renamed from: a */
        public boolean mo50565a(String str) {
            if (!mo50564a() || this.f35779c.mo50571b().mo50578a(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public Observable<C13620a> mo50568c(String... strArr) {
            ArrayList arrayList = new ArrayList(strArr.length);
            ArrayList arrayList2 = new ArrayList();
            for (String str : strArr) {
                this.f35779c.mo50571b().mo50582e("Requesting permission " + str);
                if (mo50565a(str)) {
                    arrayList.add(Observable.just(new C13620a(str, true, false)));
                } else if (mo50567b(str)) {
                    arrayList.add(Observable.just(new C13620a(str, false, false)));
                } else {
                    C68296b<C13620a> c = this.f35779c.mo50571b().mo50580c(str);
                    if (c == null) {
                        arrayList2.add(str);
                        c = C68296b.m265052a();
                        this.f35779c.mo50571b().mo50575a(str, c);
                    }
                    arrayList.add(c);
                }
            }
            if (!arrayList2.isEmpty()) {
                mo50569d((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
            return Observable.concat(Observable.fromIterable(arrayList));
        }

        /* renamed from: a */
        private Observable<?> m55267a(Observable<?> observable, Observable<?> observable2) {
            if (observable == null) {
                return Observable.just(f35778b);
            }
            return Observable.merge(observable, observable2);
        }

        /* renamed from: a */
        public Observable<C13620a> mo50562a(Observable<?> observable, final String... strArr) {
            if (strArr != null && strArr.length != 0) {
                return m55267a(observable, m55270e(strArr)).flatMap(new Function<Object, Observable<C13620a>>() {
                    /* class com.bytedance.ee.util.p701d.C13619g.C13621b.C136253 */

                    /* renamed from: a */
                    public Observable<C13620a> apply(Object obj) {
                        return C13621b.this.mo50568c(strArr);
                    }
                });
            }
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
    }

    /* renamed from: com.bytedance.ee.util.d.g$c */
    public static class C13627c extends Fragment {

        /* renamed from: a */
        private Map<String, C68296b<C13620a>> f35788a = new HashMap();

        /* renamed from: b */
        private boolean f35789b;

        /* renamed from: d */
        public boolean mo50581d(String str) {
            return this.f35788a.containsKey(str);
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setRetainInstance(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo50576a(String[] strArr) {
            requestPermissions(strArr, 42);
        }

        /* renamed from: c */
        public C68296b<C13620a> mo50580c(String str) {
            return this.f35788a.get(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo50582e(String str) {
            if (this.f35789b) {
                C13479a.m54772d(C13621b.f35777a, str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo50578a(String str) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                throw new IllegalStateException("This fragment must be attached to an activity.");
            } else if (activity.checkSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo50579b(String str) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
            }
            throw new IllegalStateException("This fragment must be attached to an activity.");
        }

        /* renamed from: a */
        public void mo50575a(String str, C68296b<C13620a> bVar) {
            this.f35788a.put(str, bVar);
        }

        @Override // androidx.fragment.app.Fragment
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (i == 42) {
                boolean[] zArr = new boolean[strArr.length];
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
                }
                mo50577a(strArr, iArr, zArr);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo50577a(String[] strArr, int[] iArr, boolean[] zArr) {
            boolean z;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                mo50582e("onRequestPermissionsResult  " + strArr[i]);
                C68296b<C13620a> bVar = this.f35788a.get(strArr[i]);
                if (bVar == null) {
                    C13479a.m54758a(C13621b.f35777a, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                    return;
                }
                this.f35788a.remove(strArr[i]);
                if (iArr[i] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.onNext(new C13620a(strArr[i], z, zArr[i]));
                bVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static boolean m55266a(Context context, String str) {
        if (ActivityCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }
}
