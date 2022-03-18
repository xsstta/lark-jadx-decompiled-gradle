package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.C1259g;
import androidx.navigation.C1273n;
import androidx.navigation.C1292r;
import androidx.navigation.Navigator;
import androidx.navigation.fragment.C1256d;
import com.larksuite.suite.R;

public class NavHostFragment extends Fragment {

    /* renamed from: a */
    private C1273n f4511a;

    /* renamed from: b */
    private Boolean f4512b;

    /* renamed from: c */
    private View f4513c;

    /* renamed from: d */
    private int f4514d;

    /* renamed from: e */
    private boolean f4515e;

    /* renamed from: c */
    private int m5683c() {
        int id = getId();
        if (id == 0 || id == -1) {
            return R.id.nav_host_fragment_container;
        }
        return id;
    }

    /* renamed from: a */
    public final C1259g mo6307a() {
        C1273n nVar = this.f4511a;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Navigator<? extends C1256d.C1257a> mo6309b() {
        return new C1256d(requireContext(), getChildFragmentManager(), m5683c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f4513c;
        if (view != null && C1292r.m5918a(view) == this.f4511a) {
            C1292r.m5919a(this.f4513c, null);
        }
        this.f4513c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrimaryNavigationFragmentChanged(boolean z) {
        C1273n nVar = this.f4511a;
        if (nVar != null) {
            nVar.mo6332a(z);
        } else {
            this.f4512b = Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6308a(C1259g gVar) {
        gVar.mo6321a().mo6456a(new C1252a(requireContext(), getChildFragmentManager()));
        gVar.mo6321a().mo6456a(mo6309b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.f4515e) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        ((C1252a) this.f4511a.mo6321a().mo6460b(C1252a.class)).mo6312a(fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle e = this.f4511a.mo6343e();
        if (e != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", e);
        }
        if (this.f4515e) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.f4514d;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    /* renamed from: a */
    public static C1259g m5682a(Fragment fragment) {
        Dialog dialog;
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).mo6307a();
            }
            Fragment primaryNavigationFragment = fragment2.getParentFragmentManager().getPrimaryNavigationFragment();
            if (primaryNavigationFragment instanceof NavHostFragment) {
                return ((NavHostFragment) primaryNavigationFragment).mo6307a();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return C1292r.m5918a(view);
        }
        if (fragment instanceof DialogInterface$OnCancelListenerC1021b) {
            dialog = ((DialogInterface$OnCancelListenerC1021b) fragment).v_();
        } else {
            dialog = null;
        }
        if (!(dialog == null || dialog.getWindow() == null)) {
            return C1292r.m5918a(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        Bundle bundle2;
        C1273n nVar = new C1273n(requireContext());
        this.f4511a = nVar;
        nVar.mo6328a(this);
        this.f4511a.mo6327a(requireActivity().getOnBackPressedDispatcher());
        C1273n nVar2 = this.f4511a;
        Boolean bool = this.f4512b;
        int i = 0;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        nVar2.mo6332a(z);
        Bundle bundle3 = null;
        this.f4512b = null;
        this.f4511a.mo6329a(getViewModelStore());
        mo6308a(this.f4511a);
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f4515e = true;
                getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
            }
            this.f4514d = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            this.f4511a.mo6326a(bundle2);
        }
        int i2 = this.f4514d;
        if (i2 != 0) {
            this.f4511a.mo6322a(i2);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i = arguments.getInt("android-support-nav:fragment:graphId");
            }
            if (arguments != null) {
                bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
            }
            if (i != 0) {
                this.f4511a.mo6323a(i, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            C1292r.m5919a(view, this.f4511a);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.f4513c = view2;
                if (view2.getId() == getId()) {
                    C1292r.m5919a(this.f4513c, this.f4511a);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        fragmentContainerView.setId(m5683c());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.navGraph});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f4514d = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.defaultNavHost});
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f4515e = true;
        }
        obtainStyledAttributes2.recycle();
    }
}
