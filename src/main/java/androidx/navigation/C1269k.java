package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.C0525g;
import androidx.navigation.NavDestination;
import com.larksuite.suite.R;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.navigation.k */
public class C1269k extends NavDestination implements Iterable<NavDestination> {

    /* renamed from: a */
    final C0525g<NavDestination> f4564a = new C0525g<>();

    /* renamed from: b */
    private int f4565b;

    /* renamed from: c */
    private String f4566c;

    /* renamed from: a */
    public final int mo6368a() {
        return this.f4565b;
    }

    @Override // java.lang.Iterable
    public final Iterator<NavDestination> iterator() {
        return new Iterator<NavDestination>() {
            /* class androidx.navigation.C1269k.C12701 */

            /* renamed from: b */
            private int f4568b = -1;

            /* renamed from: c */
            private boolean f4569c;

            /* renamed from: a */
            public NavDestination next() {
                if (hasNext()) {
                    this.f4569c = true;
                    C0525g<NavDestination> gVar = C1269k.this.f4564a;
                    int i = this.f4568b + 1;
                    this.f4568b = i;
                    return gVar.mo3057e(i);
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.f4568b + 1 < C1269k.this.f4564a.mo3049b()) {
                    return true;
                }
                return false;
            }

            public void remove() {
                if (this.f4569c) {
                    C1269k.this.f4564a.mo3057e(this.f4568b).mo6247a((C1269k) null);
                    C1269k.this.f4564a.mo3053c(this.f4568b);
                    this.f4568b--;
                    this.f4569c = false;
                    return;
                }
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo6371b() {
        if (this.f4566c == null) {
            this.f4566c = Integer.toString(this.f4565b);
        }
        return this.f4566c;
    }

    @Override // androidx.navigation.NavDestination
    /* renamed from: i */
    public String mo6255i() {
        if (mo6254h() != 0) {
            return super.mo6255i();
        }
        return "the root navigation";
    }

    @Override // androidx.navigation.NavDestination
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        NavDestination c = mo6372c(mo6368a());
        if (c == null) {
            String str = this.f4566c;
            if (str == null) {
                sb.append("0x");
                sb.append(Integer.toHexString(this.f4565b));
            } else {
                sb.append(str);
            }
        } else {
            sb.append("{");
            sb.append(c.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final NavDestination mo6372c(int i) {
        return mo6369a(i, true);
    }

    public C1269k(Navigator<? extends C1269k> navigator) {
        super(navigator);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.navigation.NavDestination
    /* renamed from: a */
    public NavDestination.C1240a mo6242a(C1268j jVar) {
        NavDestination.C1240a a = super.mo6242a(jVar);
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.C1240a a2 = it.next().mo6242a(jVar);
            if (a2 != null && (a == null || a2.compareTo(a) > 0)) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: d */
    public final void mo6373d(int i) {
        if (i != mo6254h()) {
            this.f4565b = i;
            this.f4566c = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i + " cannot use the same id as the graph " + this);
    }

    /* renamed from: a */
    public final void mo6370a(NavDestination navDestination) {
        int h = navDestination.mo6254h();
        if (h == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        } else if (h != mo6254h()) {
            NavDestination a = this.f4564a.mo3047a(h);
            if (a != navDestination) {
                if (navDestination.mo6253g() == null) {
                    if (a != null) {
                        a.mo6247a((C1269k) null);
                    }
                    navDestination.mo6247a(this);
                    this.f4564a.mo3051b(navDestination.mo6254h(), navDestination);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException("Destination " + navDestination + " cannot have the same id as graph " + this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final NavDestination mo6369a(int i, boolean z) {
        NavDestination a = this.f4564a.mo3047a(i);
        if (a != null) {
            return a;
        }
        if (!z || mo6253g() == null) {
            return null;
        }
        return mo6253g().mo6372c(i);
    }

    @Override // androidx.navigation.NavDestination
    /* renamed from: a */
    public void mo6245a(Context context, AttributeSet attributeSet) {
        super.mo6245a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.startDestination});
        mo6373d(obtainAttributes.getResourceId(0, 0));
        this.f4566c = m5615a(context, this.f4565b);
        obtainAttributes.recycle();
    }
}
