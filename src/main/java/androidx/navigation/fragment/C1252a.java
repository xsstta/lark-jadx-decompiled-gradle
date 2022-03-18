package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1168n;
import androidx.navigation.AbstractC1246c;
import androidx.navigation.C1275p;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.HashSet;

@Navigator.Name("dialog")
/* renamed from: androidx.navigation.fragment.a */
public final class C1252a extends Navigator<C1253a> {

    /* renamed from: a */
    private final Context f4516a;

    /* renamed from: b */
    private final FragmentManager f4517b;

    /* renamed from: c */
    private int f4518c;

    /* renamed from: d */
    private final HashSet<String> f4519d = new HashSet<>();

    /* renamed from: e */
    private AbstractC1168n f4520e = new DialogFragmentNavigator$1(this);

    /* renamed from: androidx.navigation.fragment.a$a */
    public static class C1253a extends NavDestination implements AbstractC1246c {

        /* renamed from: a */
        private String f4521a;

        /* renamed from: a */
        public final String mo6314a() {
            String str = this.f4521a;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public C1253a(Navigator<? extends C1253a> navigator) {
            super(navigator);
        }

        /* renamed from: a */
        public final C1253a mo6313a(String str) {
            this.f4521a = str;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        /* renamed from: a */
        public void mo6245a(Context context, AttributeSet attributeSet) {
            super.mo6245a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{16842755});
            String string = obtainAttributes.getString(0);
            if (string != null) {
                mo6313a(string);
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: a */
    public C1253a mo6267d() {
        return new C1253a(this);
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: e */
    public Bundle mo6268e() {
        if (this.f4518c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f4518c);
        return bundle;
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: c */
    public boolean mo6266c() {
        if (this.f4518c == 0) {
            return false;
        }
        if (this.f4517b.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        FragmentManager fragmentManager = this.f4517b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.f4518c - 1;
        this.f4518c = i;
        sb.append(i);
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(sb.toString());
        if (findFragmentByTag != null) {
            findFragmentByTag.getLifecycle().removeObserver(this.f4520e);
            ((DialogInterface$OnCancelListenerC1021b) findFragmentByTag).u_();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6312a(Fragment fragment) {
        if (this.f4519d.remove(fragment.getTag())) {
            fragment.getLifecycle().addObserver(this.f4520e);
        }
    }

    @Override // androidx.navigation.Navigator
    /* renamed from: a */
    public void mo6265a(Bundle bundle) {
        if (bundle != null) {
            this.f4518c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i = 0; i < this.f4518c; i++) {
                FragmentManager fragmentManager = this.f4517b;
                DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) fragmentManager.findFragmentByTag("androidx-nav-fragment:navigator:dialog:" + i);
                if (bVar != null) {
                    bVar.getLifecycle().addObserver(this.f4520e);
                } else {
                    HashSet<String> hashSet = this.f4519d;
                    hashSet.add("androidx-nav-fragment:navigator:dialog:" + i);
                }
            }
        }
    }

    public C1252a(Context context, FragmentManager fragmentManager) {
        this.f4516a = context;
        this.f4517b = fragmentManager;
    }

    /* renamed from: a */
    public NavDestination mo6264a(C1253a aVar, Bundle bundle, C1275p pVar, Navigator.AbstractC1241a aVar2) {
        if (this.f4517b.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String a = aVar.mo6314a();
        if (a.charAt(0) == '.') {
            a = this.f4516a.getPackageName() + a;
        }
        Fragment instantiate = this.f4517b.getFragmentFactory().instantiate(this.f4516a.getClassLoader(), a);
        if (DialogInterface$OnCancelListenerC1021b.class.isAssignableFrom(instantiate.getClass())) {
            DialogInterface$OnCancelListenerC1021b bVar = (DialogInterface$OnCancelListenerC1021b) instantiate;
            bVar.setArguments(bundle);
            bVar.getLifecycle().addObserver(this.f4520e);
            FragmentManager fragmentManager = this.f4517b;
            StringBuilder sb = new StringBuilder();
            sb.append("androidx-nav-fragment:navigator:dialog:");
            int i = this.f4518c;
            this.f4518c = i + 1;
            sb.append(i);
            bVar.mo5511a(fragmentManager, sb.toString());
            return aVar;
        }
        throw new IllegalArgumentException("Dialog destination " + aVar.mo6314a() + " is not an instance of DialogFragment");
    }
}
