package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.C0525g;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NavDestination {

    /* renamed from: a */
    private static final HashMap<String, Class<?>> f4468a = new HashMap<>();

    /* renamed from: b */
    private final String f4469b;

    /* renamed from: c */
    private C1269k f4470c;

    /* renamed from: d */
    private int f4471d;

    /* renamed from: e */
    private String f4472e;

    /* renamed from: f */
    private CharSequence f4473f;

    /* renamed from: g */
    private ArrayList<C1264i> f4474g;

    /* renamed from: h */
    private C0525g<C1247d> f4475h;

    /* renamed from: i */
    private HashMap<String, C1248e> f4476i;

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface ClassType {
        Class<?> value();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo6251e() {
        return true;
    }

    /* renamed from: androidx.navigation.NavDestination$a */
    static class C1240a implements Comparable<C1240a> {

        /* renamed from: a */
        private final NavDestination f4477a;

        /* renamed from: b */
        private final Bundle f4478b;

        /* renamed from: c */
        private final boolean f4479c;

        /* renamed from: d */
        private final boolean f4480d;

        /* renamed from: e */
        private final int f4481e;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public NavDestination mo6261a() {
            return this.f4477a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Bundle mo6262b() {
            return this.f4478b;
        }

        /* renamed from: a */
        public int compareTo(C1240a aVar) {
            boolean z = this.f4479c;
            if (z && !aVar.f4479c) {
                return 1;
            }
            if (!z && aVar.f4479c) {
                return -1;
            }
            Bundle bundle = this.f4478b;
            if (bundle != null && aVar.f4478b == null) {
                return 1;
            }
            if (bundle == null && aVar.f4478b != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.f4478b.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.f4480d;
            if (z2 && !aVar.f4480d) {
                return 1;
            }
            if (z2 || !aVar.f4480d) {
                return this.f4481e - aVar.f4481e;
            }
            return -1;
        }

        C1240a(NavDestination navDestination, Bundle bundle, boolean z, boolean z2, int i) {
            this.f4477a = navDestination;
            this.f4478b = bundle;
            this.f4479c = z;
            this.f4480d = z2;
            this.f4481e = i;
        }
    }

    /* renamed from: g */
    public final C1269k mo6253g() {
        return this.f4470c;
    }

    /* renamed from: h */
    public final int mo6254h() {
        return this.f4471d;
    }

    /* renamed from: j */
    public final String mo6256j() {
        return this.f4469b;
    }

    /* renamed from: f */
    public final Map<String, C1248e> mo6252f() {
        HashMap<String, C1248e> hashMap = this.f4476i;
        if (hashMap == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: i */
    public String mo6255i() {
        if (this.f4472e == null) {
            this.f4472e = Integer.toString(this.f4471d);
        }
        return this.f4472e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int[] mo6257k() {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavDestination navDestination = this;
        while (true) {
            C1269k g = navDestination.mo6253g();
            if (g == null || g.mo6368a() != navDestination.mo6254h()) {
                arrayDeque.addFirst(navDestination);
            }
            if (g == null) {
                break;
            }
            navDestination = g;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((NavDestination) it.next()).mo6254h();
            i++;
        }
        return iArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f4472e;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f4471d));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.f4473f != null) {
            sb.append(" label=");
            sb.append(this.f4473f);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6247a(C1269k kVar) {
        this.f4470c = kVar;
    }

    public NavDestination(String str) {
        this.f4469b = str;
    }

    /* renamed from: a */
    public final void mo6243a(int i) {
        this.f4471d = i;
        this.f4472e = null;
    }

    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(C1293s.m5922a((Class<? extends Navigator>) navigator.getClass()));
    }

    /* renamed from: a */
    public final void mo6248a(CharSequence charSequence) {
        this.f4473f = charSequence;
    }

    /* renamed from: b */
    public final C1247d mo6250b(int i) {
        C1247d dVar;
        C0525g<C1247d> gVar = this.f4475h;
        if (gVar == null) {
            dVar = null;
        } else {
            dVar = gVar.mo3047a(i);
        }
        if (dVar != null) {
            return dVar;
        }
        if (mo6253g() != null) {
            return mo6253g().mo6250b(i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1240a mo6242a(C1268j jVar) {
        Bundle bundle;
        boolean z;
        int i;
        ArrayList<C1264i> arrayList = this.f4474g;
        if (arrayList == null) {
            return null;
        }
        Iterator<C1264i> it = arrayList.iterator();
        C1240a aVar = null;
        while (it.hasNext()) {
            C1264i next = it.next();
            Uri a = jVar.mo6364a();
            if (a != null) {
                bundle = next.mo6350a(a, mo6252f());
            } else {
                bundle = null;
            }
            String b = jVar.mo6365b();
            if (b == null || !b.equals(next.mo6352b())) {
                z = false;
            } else {
                z = true;
            }
            String c = jVar.mo6366c();
            if (c != null) {
                i = next.mo6349a(c);
            } else {
                i = -1;
            }
            if (bundle != null || z || i > -1) {
                C1240a aVar2 = new C1240a(this, bundle, next.mo6351a(), z, i);
                if (aVar == null || aVar2.compareTo(aVar) > 0) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bundle mo6241a(Bundle bundle) {
        HashMap<String, C1248e> hashMap;
        if (bundle == null && ((hashMap = this.f4476i) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, C1248e> hashMap2 = this.f4476i;
        if (hashMap2 != null) {
            for (Map.Entry<String, C1248e> entry : hashMap2.entrySet()) {
                entry.getValue().mo6289a(entry.getKey(), bundle2);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, C1248e> hashMap3 = this.f4476i;
            if (hashMap3 != null) {
                for (Map.Entry<String, C1248e> entry2 : hashMap3.entrySet()) {
                    if (!entry2.getValue().mo6292b(entry2.getKey(), bundle2)) {
                        throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().mo6291b().mo6403b() + " expected.");
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    public final void mo6246a(C1264i iVar) {
        if (this.f4474g == null) {
            this.f4474g = new ArrayList<>();
        }
        this.f4474g.add(iVar);
    }

    /* renamed from: a */
    static String m5615a(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    /* renamed from: a */
    public void mo6245a(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{16842753, 16842960});
        mo6243a(obtainAttributes.getResourceId(1, 0));
        this.f4472e = m5615a(context, this.f4471d);
        mo6248a(obtainAttributes.getText(0));
        obtainAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo6244a(int i, C1247d dVar) {
        if (!mo6251e()) {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        } else if (i != 0) {
            if (this.f4475h == null) {
                this.f4475h = new C0525g<>();
            }
            this.f4475h.mo3051b(i, dVar);
        } else {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
    }

    /* renamed from: a */
    public final void mo6249a(String str, C1248e eVar) {
        if (this.f4476i == null) {
            this.f4476i = new HashMap<>();
        }
        this.f4476i.put(str, eVar);
    }
}
