package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@Navigator.Name("fragment")
/* renamed from: androidx.navigation.fragment.d */
public class C1256d extends Navigator<C1257a> {

    /* renamed from: a */
    private final Context f4522a;

    /* renamed from: b */
    private final FragmentManager f4523b;

    /* renamed from: c */
    private final int f4524c;

    /* renamed from: d */
    private ArrayDeque<Integer> f4525d = new ArrayDeque<>();

    /* renamed from: androidx.navigation.fragment.d$b */
    public static final class C1258b implements Navigator.AbstractC1241a {

        /* renamed from: a */
        private final LinkedHashMap<View, String> f4527a;

        /* renamed from: a */
        public Map<View, String> mo6320a() {
            return Collections.unmodifiableMap(this.f4527a);
        }
    }

    /* renamed from: androidx.navigation.fragment.d$a */
    public static class C1257a extends NavDestination {

        /* renamed from: a */
        private String f4526a;

        /* renamed from: a */
        public final String mo6319a() {
            String str = this.f4526a;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f4526a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }

        public C1257a(Navigator<? extends C1257a> navigator) {
            super(navigator);
        }

        /* renamed from: a */
        public final C1257a mo6318a(String str) {
            this.f4526a = str;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        /* renamed from: a */
        public void mo6245a(Context context, AttributeSet attributeSet) {
            super.mo6245a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{16842755});
            String string = obtainAttributes.getString(0);
            if (string != null) {
                mo6318a(string);
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: a */
    public C1257a mo6267d() {
        return new C1257a(this);
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: c */
    public boolean mo6266c() {
        if (this.f4525d.isEmpty()) {
            return false;
        }
        if (this.f4523b.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f4523b.popBackStack(m5699a(this.f4525d.size(), this.f4525d.peekLast().intValue()), 1);
        this.f4525d.removeLast();
        return true;
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: e */
    public Bundle mo6268e() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f4525d.size()];
        Iterator<Integer> it = this.f4525d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: a */
    public void mo6265a(Bundle bundle) {
        int[] intArray;
        if (!(bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null)) {
            this.f4525d.clear();
            for (int i : intArray) {
                this.f4525d.add(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: a */
    private String m5699a(int i, int i2) {
        return i + "-" + i2;
    }

    public C1256d(Context context, FragmentManager fragmentManager, int i) {
        this.f4522a = context;
        this.f4523b = fragmentManager;
        this.f4524c = i;
    }

    /* renamed from: a */
    public Fragment mo6315a(Context context, FragmentManager fragmentManager, String str, Bundle bundle) {
        return fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.NavDestination mo6264a(androidx.navigation.fragment.C1256d.C1257a r9, android.os.Bundle r10, androidx.navigation.C1275p r11, androidx.navigation.Navigator.AbstractC1241a r12) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.C1256d.mo6264a(androidx.navigation.fragment.d$a, android.os.Bundle, androidx.navigation.p, androidx.navigation.Navigator$a):androidx.navigation.NavDestination");
    }
}
