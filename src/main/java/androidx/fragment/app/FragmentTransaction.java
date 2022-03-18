package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class FragmentTransaction {
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    private final ClassLoader mClassLoader;
    ArrayList<Runnable> mCommitRunnables;
    int mEnterAnim;
    int mExitAnim;
    private final C1034f mFragmentFactory;
    String mName;
    ArrayList<C1019a> mOps;
    int mPopEnterAnim;
    int mPopExitAnim;
    boolean mReorderingAllowed;
    ArrayList<String> mSharedElementSourceNames;
    ArrayList<String> mSharedElementTargetNames;
    int mTransition;

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    public FragmentTransaction setTransitionStyle(int i) {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentTransaction$a */
    public static final class C1019a {

        /* renamed from: a */
        int f3896a;

        /* renamed from: b */
        Fragment f3897b;

        /* renamed from: c */
        int f3898c;

        /* renamed from: d */
        int f3899d;

        /* renamed from: e */
        int f3900e;

        /* renamed from: f */
        int f3901f;

        /* renamed from: g */
        Lifecycle.State f3902g;

        /* renamed from: h */
        Lifecycle.State f3903h;

        C1019a() {
        }

        C1019a(int i, Fragment fragment) {
            this.f3896a = i;
            this.f3897b = fragment;
            this.f3902g = Lifecycle.State.RESUMED;
            this.f3903h = Lifecycle.State.RESUMED;
        }

        C1019a(int i, Fragment fragment, Lifecycle.State state) {
            this.f3896a = i;
            this.f3897b = fragment;
            this.f3902g = fragment.mMaxState;
            this.f3903h = state;
        }
    }

    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    public FragmentTransaction disallowAddToBackStack() {
        if (!this.mAddToBackStack) {
            this.mAllowAddToBackStack = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public FragmentTransaction() {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = null;
        this.mClassLoader = null;
    }

    public FragmentTransaction setReorderingAllowed(boolean z) {
        this.mReorderingAllowed = z;
        return this;
    }

    public FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    public FragmentTransaction setAllowOptimization(boolean z) {
        return setReorderingAllowed(z);
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    public FragmentTransaction attach(Fragment fragment) {
        addOp(new C1019a(7, fragment));
        return this;
    }

    public FragmentTransaction detach(Fragment fragment) {
        addOp(new C1019a(6, fragment));
        return this;
    }

    public FragmentTransaction hide(Fragment fragment) {
        addOp(new C1019a(4, fragment));
        return this;
    }

    public FragmentTransaction remove(Fragment fragment) {
        addOp(new C1019a(3, fragment));
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        addOp(new C1019a(8, fragment));
        return this;
    }

    public FragmentTransaction show(Fragment fragment) {
        addOp(new C1019a(5, fragment));
        return this;
    }

    /* access modifiers changed from: package-private */
    public void addOp(C1019a aVar) {
        this.mOps.add(aVar);
        aVar.f3898c = this.mEnterAnim;
        aVar.f3899d = this.mExitAnim;
        aVar.f3900e = this.mPopEnterAnim;
        aVar.f3901f = this.mPopExitAnim;
    }

    public FragmentTransaction addToBackStack(String str) {
        if (this.mAllowAddToBackStack) {
            this.mAddToBackStack = true;
            this.mName = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public FragmentTransaction runOnCommit(Runnable runnable) {
        disallowAddToBackStack();
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment) {
        return replace(i, fragment, (String) null);
    }

    public FragmentTransaction setCustomAnimations(int i, int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        addOp(new C1019a(10, fragment, state));
        return this;
    }

    FragmentTransaction(C1034f fVar, ClassLoader classLoader) {
        this.mOps = new ArrayList<>();
        this.mAllowAddToBackStack = true;
        this.mReorderingAllowed = false;
        this.mFragmentFactory = fVar;
        this.mClassLoader = classLoader;
    }

    private Fragment createFragment(Class<? extends Fragment> cls, Bundle bundle) {
        C1034f fVar = this.mFragmentFactory;
        if (fVar != null) {
            ClassLoader classLoader = this.mClassLoader;
            if (classLoader != null) {
                Fragment instantiate = fVar.instantiate(classLoader, cls.getName());
                if (bundle != null) {
                    instantiate.setArguments(bundle);
                }
                return instantiate;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    public FragmentTransaction addSharedElement(View view, String str) {
        if (C1047p.m5112a()) {
            String u = ViewCompat.m4106u(view);
            if (u != null) {
                if (this.mSharedElementSourceNames == null) {
                    this.mSharedElementSourceNames = new ArrayList<>();
                    this.mSharedElementTargetNames = new ArrayList<>();
                } else if (this.mSharedElementTargetNames.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (this.mSharedElementSourceNames.contains(u)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + u + "' has already been added to the transaction.");
                }
                this.mSharedElementSourceNames.add(u);
                this.mSharedElementTargetNames.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        if (i != 0) {
            doAddOp(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final FragmentTransaction add(int i, Class<? extends Fragment> cls, Bundle bundle) {
        return add(i, createFragment(cls, bundle));
    }

    public final FragmentTransaction replace(int i, Class<? extends Fragment> cls, Bundle bundle) {
        return replace(i, cls, bundle, null);
    }

    /* access modifiers changed from: package-private */
    public FragmentTransaction add(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return add(viewGroup.getId(), fragment, str);
    }

    public final FragmentTransaction add(Class<? extends Fragment> cls, Bundle bundle, String str) {
        return add(createFragment(cls, bundle), str);
    }

    public FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    public final FragmentTransaction add(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return add(i, createFragment(cls, bundle), str);
    }

    public final FragmentTransaction replace(int i, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return replace(i, createFragment(cls, bundle), str);
    }

    /* access modifiers changed from: package-private */
    public void doAddOp(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
        }
        addOp(new C1019a(i2, fragment));
    }
}
